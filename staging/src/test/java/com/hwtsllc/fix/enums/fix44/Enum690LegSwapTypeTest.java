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
 *  690
 *  LegSwapType
 *  int
 *  <p></p>
 *  For Fixed Income
 *  <p></p>
 *  Used instead of LegQty (687) or LegOrderQty (685)
 *      to request the respondent to calculate the quantity based on the
 *      quantity on the opposite side of the swap.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Par For Par
 *  <p>    2 - Modified Duration
 *  <p>    4 - Risk
 *  <p>    5 - Proceeds
 */
class Enum690LegSwapTypeTest {
    @Test
    void EnumTest() {
        Enum690LegSwapType enumType;

        enumType = Enum690LegSwapType.PAR_FOR_PAR;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PAR_FOR_PAR", enumType.toFIXNameString());
        assertEquals("1 - Par For Par", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum690LegSwapType.MODIFIED_DURATION;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("MODIFIED_DURATION", enumType.toFIXNameString());
        assertEquals("2 - Modified Duration", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum690LegSwapType.RISK;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("RISK", enumType.toFIXNameString());
        assertEquals("4 - Risk", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum690LegSwapType.PROCEEDS;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("PROCEEDS", enumType.toFIXNameString());
        assertEquals("5 - Proceeds", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}