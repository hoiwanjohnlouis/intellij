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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum27IOIQtyTest {
    /**
     *  27 (same as 27, 682)
     *  LegIOIQty
     *  Leg-specific IOI quantity.
     *          See IOIQty (27) for description and valid values
     *  Valid values:
     *      0 - 1000000000
     *      S - Small
     *      M - Medium
     *      L - Large
     *      U - Undisclosed Quantity
     */
    @Test
    void Enum0027Test() {
        Enum27IOIQty enumType;

        /*
         * 0, S, M, L, and U types
         */
        enumType = Enum27IOIQty.ONE_BILLION;
        assertEquals("0", enumType.getID());
        assertEquals("ONE_BILLION", enumType.getName());
        assertEquals("0 - 1,000,000,000", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum27IOIQty.SMALL;
        assertEquals("S", enumType.getID());
        assertEquals("SMALL", enumType.getName());
        assertEquals("S - Small", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum27IOIQty.MEDIUM;
        assertEquals("M", enumType.getID());
        assertEquals("MEDIUM", enumType.getName());
        assertEquals("M - Medium", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum27IOIQty.LARGE;
        assertEquals("L", enumType.getID());
        assertEquals("LARGE", enumType.getName());
        assertEquals("L - Large", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum27IOIQty.UNDISCLOSED_QUANTITY;
        assertEquals("U", enumType.getID());
        assertEquals("UNDISCLOSED_QUANTITY", enumType.getName());
        assertEquals("U - Undisclosed Quantity", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());
    }
}