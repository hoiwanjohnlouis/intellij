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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  27 (same as 27, 682)
 *  IOIQty
 *  String
 *  <p>
 *  Quantity (e.g. number of shares) in numeric form or relative size.
 *  <p></p>
 *  682 (same as 27, 682)
 *  LegIOIQty
 *  String
 *  <p>
 *  Leg-specific IOI quantity.
 *  <p>
 *  See IOIQty (27) for description and valid values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - 1000000000
 *  <p>    S - Small
 *  <p>    M - Medium
 *  <p>    L - Large
 *  <p>    U - Undisclosed Quantity
 */
class MyEnumIOIQtyTest {
    @Test
    void Enum0027Test() {
        MyEnumIOIQty enumType;

        /*
         * 0, S, M, L, and U types
         */
        enumType = MyEnumIOIQty.ONE_BILLION;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("ONE_BILLION", enumType.toEnumNameString());
        assertEquals("0 - 1,000,000,000", enumType.toEnumDescriptionString());
        assertNotEquals( FIX27.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( FIX27.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumIOIQty.SMALL;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SMALL", enumType.toEnumNameString());
        assertEquals("S - Small", enumType.toEnumDescriptionString());
        assertNotEquals( FIX27.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( FIX27.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumIOIQty.MEDIUM;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("MEDIUM", enumType.toEnumNameString());
        assertEquals("M - Medium", enumType.toEnumDescriptionString());
        assertNotEquals( FIX27.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( FIX27.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumIOIQty.LARGE;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LARGE", enumType.toEnumNameString());
        assertEquals("L - Large", enumType.toEnumDescriptionString());
        assertNotEquals( FIX27.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( FIX27.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumIOIQty.UNDISCLOSED_QUANTITY;
        assertEquals("U", enumType.toFIXIDString());
        assertEquals("UNDISCLOSED_QUANTITY", enumType.toEnumNameString());
        assertEquals("U - Undisclosed Quantity", enumType.toEnumDescriptionString());
        assertNotEquals( FIX27.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( FIX27.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}