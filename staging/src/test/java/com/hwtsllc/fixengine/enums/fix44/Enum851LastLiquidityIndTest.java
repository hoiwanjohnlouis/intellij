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

package com.hwtsllc.fixengine.enums.fix44;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  <p></p>
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  <p></p>
 *  Applicable only for OrdStatus of Partial or Filled.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Added Liquidity
 *  <p>    2 - Removed Liquidity
 *  <p>    3 - Liquidity Routed Out
 */
class Enum851LastLiquidityIndTest {
    @Test
    void EnumTest() {
        Enum851LastLiquidityInd enumType;

        enumType = Enum851LastLiquidityInd.ADDED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ADDED", enumType.toFIXNameString() );
        assertEquals( "1 - Added Liquidity", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum851LastLiquidityInd.REMOVED;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "REMOVED", enumType.toFIXNameString() );
        assertEquals( "2 - Removed Liquidity", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum851LastLiquidityInd.ROUTED_OUT;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "ROUTED_OUT", enumType.toFIXNameString() );
        assertEquals( "3 - Liquidity Routed Out", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}