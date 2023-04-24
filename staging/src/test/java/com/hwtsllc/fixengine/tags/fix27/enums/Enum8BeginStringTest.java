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

package com.hwtsllc.fixengine.tags.fix27.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  8
 *  BeginString
 *  String
 *  <p></p>
 *  Identifies beginning of new message and protocol version.
 *  <p></p>
 *  <p> ALWAYS FIRST FIELD IN MESSAGE.
 *  <p> ALWAYS UNENCRYPTED.
 *  <p> Valid values:
 *  <p></p>
 *  <p>    FIX.2.7
 *  <p>    FIX.3.0
 *  <p>    FIX.4.0
 *  <p>    FIX.4.1
 *  <p>    FIX.4.2
 *  <p></p>
 *  <p>    FIX.4.3
 *  <p>    FIX.4.4
 *  <p>    FIXT.1.1
 */
class Enum8BeginStringTest {
    @Test
    void Enum0008Test() {
        Enum8BeginString enumType;

        enumType = Enum8BeginString.BEGIN_STRING_4_0;
        assertEquals("FIX.4.0", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_4_0", enumType.toFIXNameString());
        assertEquals("Begin String 4.0", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum8BeginString.BEGIN_STRING_4_1;
        assertEquals("FIX.4.1", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_4_1", enumType.toFIXNameString());
        assertEquals("Begin String 4.1", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum8BeginString.BEGIN_STRING_4_2;
        assertEquals("FIX.4.2", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_4_2", enumType.toFIXNameString());
        assertEquals("Begin String 4.2", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum8BeginString.BEGIN_STRING_4_3;
        assertEquals("FIX.4.3", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_4_3", enumType.toFIXNameString());
        assertEquals("Begin String 4.3", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum8BeginString.BEGIN_STRING_4_4;
        assertEquals("FIX.4.4", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_4_4", enumType.toFIXNameString());
        assertEquals("Begin String 4.4", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum8BeginString.BEGIN_STRING_5_0;
        assertEquals("FIXT.1.1", enumType.toFIXIDString());
        assertEquals("BEGIN_STRING_5_0", enumType.toFIXNameString());
        assertEquals("Begin String 5.0", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}