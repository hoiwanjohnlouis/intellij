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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum690LegSwapTypeTest {
    /**
     *  690
     *  LegSwapType
     *  For Fixed Income, used instead of LegQty (687) or LegOrderQty (685)
     *      to requests the respondent to calculate the quantity based on the
     *      quantity on the opposite side of the swap.
     *  Valid values:
     *      1 - Par For Par
     *      2 - Modified Duration
     *      4 - Risk
     *      5 - Proceeds
     */
    @Test
    void EnumTest() {
        Enum690LegSwapType enumType;

        enumType = Enum690LegSwapType.PAR_FOR_PAR;
        assertEquals("1", enumType.getID());
        assertEquals("PAR_FOR_PAR", enumType.getName());
        assertEquals("1 - Par For Par", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum690LegSwapType.MODIFIED_DURATION;
        assertEquals("2", enumType.getID());
        assertEquals("MODIFIED_DURATION", enumType.getName());
        assertEquals("2 - Modified Duration", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum690LegSwapType.RISK;
        assertEquals("4", enumType.getID());
        assertEquals("RISK", enumType.getName());
        assertEquals("4 - Risk", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum690LegSwapType.PROCEEDS;
        assertEquals("5", enumType.getID());
        assertEquals("PROCEEDS", enumType.getName());
        assertEquals("5 - Proceeds", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}