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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum465QuantityTypeTest {
    /**
     *  Information is the same for TAGS 465
     */
    @Test
    void Enum0465Test() {
        Enum465QuantityType enumType;

        /*
         * 1-8 types
         */
        enumType = Enum465QuantityType.SHARES;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,SHARES,1 - SHARES", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.BONDS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,BONDS,2 - BONDS", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.CURRENT_FACE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,CURRENTFACE,3 - CURRENTFACE", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.ORIGINAL_FACE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,ORIGINALFACE,4 - ORIGINALFACE", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.CURRENCY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,CURRENCY,5 - CURRENCY", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.CONTRACTS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,CONTRACTS,6 - CONTRACTS", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.OTHER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,OTHER,7 - OTHER", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum465QuantityType.PAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,PAR,8 - PAR", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}


