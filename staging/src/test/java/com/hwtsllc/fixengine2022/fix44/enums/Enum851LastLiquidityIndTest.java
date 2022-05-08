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
 *  851
 *  LastLiquidityInd
 *  int
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  Applicable only for OrdStatus of Partial or Filled.
 *  Valid values:
 *      1 - Added Liquidity
 *      2 - Removed Liquidity
 *      3 - Liquidity Routed Out
 */
class Enum851LastLiquidityIndTest {
    @Test
    void EnumTest() {
        Enum851LastLiquidityInd enumType;

        enumType = Enum851LastLiquidityInd.ADDED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "ADDED", enumType.getName() );
        assertEquals( "1 - Added Liquidity", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum851LastLiquidityInd.REMOVED;
        assertEquals( "2", enumType.getID() );
        assertEquals( "REMOVED", enumType.getName() );
        assertEquals( "2 - Removed Liquidity", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum851LastLiquidityInd.ROUTED_OUT;
        assertEquals( "3", enumType.getID() );
        assertEquals( "ROUTED_OUT", enumType.getName() );
        assertEquals( "3 - Liquidity Routed Out", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}