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
 *  94
 *  EmailType
 *  char
 *  <p></p>
 *  Email message type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Reply
 *  <p>    2 - Admin Reply
 */
class Enum94EmailTypeTest {
    @Test
    void Enum0094Test() {
        Enum94EmailType enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum94EmailType.NEW;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toFIXNameString());
        assertEquals("0 - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum94EmailType.REPLY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("REPLY", enumType.toFIXNameString());
        assertEquals("1 - Reply", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum94EmailType.ADMIN_REPLY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ADMIN_REPLY", enumType.toFIXNameString());
        assertEquals("2 - Admin Reply", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}