/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  847
 *  TargetStrategy
 *  int
 *  The target strategy of the order
 *  1000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  Valid values:
 *      1 - VWAP
 *      2 - Participate (i.e. aim to be x percent of the market volume)
 *      3 - Minimize market impact
 *
 *  or any value conforming to the data type Reserved1000Plus
 */
class Enum847TargetStrategyTest {
    @Test
    void EnumTest() {
        Enum847TargetStrategy enumType;

        enumType = Enum847TargetStrategy.VWAP;
        assertEquals( "1", enumType.getID() );
        assertEquals( "VWAP", enumType.getName() );
        assertEquals( "1 - VWAP", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum847TargetStrategy.PARTICIPATE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "PARTICIPATE", enumType.getName() );
        assertEquals( "2 - Participate (i.e. aim to be x percent of the market volume)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT;
        assertEquals( "3", enumType.getID() );
        assertEquals( "MINIMIZE_MARKET_IMPACT", enumType.getName() );
        assertEquals( "3 - Minimize market impact", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}