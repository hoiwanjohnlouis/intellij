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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum8BeginStringTest {

    @Test
    void Enum0008Test() {
        Enum8BeginString enumType;

        enumType = Enum8BeginString.BEGIN_STRING_4_0;
        assertEquals("FIX.4.0", enumType.getID());
        assertEquals("BEGIN_STRING_4_0", enumType.getName());
        assertEquals("Begin String 4.0", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum8BeginString.BEGIN_STRING_4_1;
        assertEquals("FIX.4.1", enumType.getID());
        assertEquals("BEGIN_STRING_4_1", enumType.getName());
        assertEquals("Begin String 4.1", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum8BeginString.BEGIN_STRING_4_2;
        assertEquals("FIX.4.2", enumType.getID());
        assertEquals("BEGIN_STRING_4_2", enumType.getName());
        assertEquals("Begin String 4.2", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum8BeginString.BEGIN_STRING_4_3;
        assertEquals("FIX.4.3", enumType.getID());
        assertEquals("BEGIN_STRING_4_3", enumType.getName());
        assertEquals("Begin String 4.3", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum8BeginString.BEGIN_STRING_4_4;
        assertEquals("FIX.4.4", enumType.getID());
        assertEquals("BEGIN_STRING_4_4", enumType.getName());
        assertEquals("Begin String 4.4", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum8BeginString.BEGIN_STRING_5_0;
        assertEquals("FIXT.1.1", enumType.getID());
        assertEquals("BEGIN_STRING_5_0", enumType.getName());
        assertEquals("Begin String 5.0", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}