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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  924
 *  UserRequestType
 *  int
 *  Indicates the action required by a User Request Message
 *  Valid values:
 *      1 - Log On User
 *      2 - Log Off User
 *      3 - Change Password For User
 *      4 - Request Individual User Status
 */
class Enum924UserRequestTypeTest {
    @Test
    void EnumTest() {
        Enum924UserRequestType enumType;

        enumType = Enum924UserRequestType.LOG_ON;
        assertEquals( "1", enumType.getID() );
        assertEquals( "LOG_ON", enumType.getName() );
        assertEquals( "1 - Log On User", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum924UserRequestType.LOG_OFF;
        assertEquals( "2", enumType.getID() );
        assertEquals( "LOG_OFF", enumType.getName() );
        assertEquals( "2 - Log Off User", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum924UserRequestType.CHANGE_PASSWORD;
        assertEquals( "3", enumType.getID() );
        assertEquals( "CHANGE_PASSWORD", enumType.getName() );
        assertEquals( "3 - Change Password For User", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum924UserRequestType.REQUEST_STATUS;
        assertEquals( "4", enumType.getID() );
        assertEquals( "REQUEST_STATUS", enumType.getName() );
        assertEquals( "4 - Request Individual User Status", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}