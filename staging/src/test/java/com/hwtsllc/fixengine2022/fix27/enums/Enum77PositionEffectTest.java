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

class Enum77PositionEffectTest {
    /**
     *  Information is the same for TAGS 77, 564
     */
    @Test
    void Enum0077Test() {
        Enum77PositionEffect enumType;

        /*
         *  C, F, O, and R types
         */
        enumType = Enum77PositionEffect.CLOSE;
        assertEquals("C", enumType.getID());
        assertEquals("CLOSE", enumType.getName());
        assertEquals("C - Close", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum77PositionEffect.FIFO;
        assertEquals("F", enumType.getID());
        assertEquals("FIFO", enumType.getName());
        assertEquals("F - First In, First Out", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum77PositionEffect.OPEN;
        assertEquals("O", enumType.getID());
        assertEquals("OPEN", enumType.getName());
        assertEquals("O - Open", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum77PositionEffect.ROLLED;
        assertEquals("R", enumType.getID());
        assertEquals("ROLLED", enumType.getName());
        assertEquals("R - Rolled", enumType.getDescription());
        assertNotEquals( FIX27.JUNK_ID, enumType.getID());
        assertNotEquals( FIX27.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, enumType.getDescription());
    }
}