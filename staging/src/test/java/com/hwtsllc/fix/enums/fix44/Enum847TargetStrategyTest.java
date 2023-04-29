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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  847
 *  TargetStrategy
 *  int
 *  <p></p>
 *  The target strategy of the order
 *  <p></p>
 *  1000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  <p></p>
 *  Valid values:
 *  <p>    1 - VWAP
 *  <p>    2 - Participate (i.e. aim to be x percent of the market volume)
 *  <p>    3 - Minimize market impact
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
class Enum847TargetStrategyTest {
    @Test
    void EnumTest() {
        Enum847TargetStrategy enumType;

        enumType = Enum847TargetStrategy.VWAP;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "VWAP", enumType.toFIXNameString() );
        assertEquals( "1 - VWAP", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum847TargetStrategy.PARTICIPATE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "PARTICIPATE", enumType.toFIXNameString() );
        assertEquals( "2 - Participate (i.e. aim to be x percent of the market volume)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum847TargetStrategy.MINIMIZE_MARKET_IMPACT;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "MINIMIZE_MARKET_IMPACT", enumType.toFIXNameString() );
        assertEquals( "3 - Minimize market impact", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}