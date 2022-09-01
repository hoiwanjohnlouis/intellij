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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  924
 *  UserRequestType
 *  int
 *  <p></p>
 *  Indicates the action required by a User Request Message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Log On User
 *  <p>    2 - Log Off User
 *  <p>    3 - Change Password For User
 *  <p>    4 - Request Individual User Status
 */
class Enum924UserRequestTypeTest {
    @Test
    void EnumTest() {
        Enum924UserRequestType enumType;

        enumType = Enum924UserRequestType.LOG_ON;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "LOG_ON", enumType.toFIXNameString() );
        assertEquals( "1 - Log On User", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum924UserRequestType.LOG_OFF;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "LOG_OFF", enumType.toFIXNameString() );
        assertEquals( "2 - Log Off User", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum924UserRequestType.CHANGE_PASSWORD;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "CHANGE_PASSWORD", enumType.toFIXNameString() );
        assertEquals( "3 - Change Password For User", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum924UserRequestType.REQUEST_STATUS;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "REQUEST_STATUS", enumType.toFIXNameString() );
        assertEquals( "4 - Request Individual User Status", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}