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
 *  840
 *  PegScope
 *  int
 *  The scope of the peg
 *  846
 *  DiscretionScope
 *  int
 *  The scope of the discretion
 *  Valid values:
 *      1 - Local (Exchange, ECN, ATS)
 *      2 - National
 *      3 - Global
 *      4 - National excluding local
 */
class MyEnumScopeTest {
    @Test
    void EnumTest() {
        MyEnumScope enumType;

        enumType = MyEnumScope.LOCAL;
        assertEquals( "1", enumType.getID());
        assertEquals( "LOCAL", enumType.getName());
        assertEquals( "1 - Local (Exchange, ECN, ATS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumScope.NATIONAL;
        assertEquals( "2", enumType.getID());
        assertEquals( "NATIONAL", enumType.getName());
        assertEquals( "2 - National", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumScope.GLOBAL;
        assertEquals( "3", enumType.getID());
        assertEquals( "GLOBAL", enumType.getName());
        assertEquals( "3 - Global", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumScope.NATIONAL_EXCLUDING_LOCAL;
        assertEquals( "4", enumType.getID());
        assertEquals( "NATIONAL_EXCLUDING_LOCAL", enumType.getName());
        assertEquals( "4 - National excluding local", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}