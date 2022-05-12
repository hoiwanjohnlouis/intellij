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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum924UserRequestType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag924EnuUserRequestTypeTest {
    @Test
    void FIX0924Test() {
        FIX44 fixData = FIX44.FIX924_ENU_USER_REQUEST_TYPE;
        assertEquals( "924", fixData.getID());
        assertEquals( "USER_REQUEST_TYPE", fixData.getName());
        assertEquals( "UserRequestType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0924Test() {
        Log924EnuUserRequestType tagData;

        tagData = new Log924EnuUserRequestType( Enum924UserRequestType.LOG_ON );
        assertEquals( Enum924UserRequestType.LOG_ON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log924EnuUserRequestType( Enum924UserRequestType.LOG_OFF );
        assertEquals( Enum924UserRequestType.LOG_OFF.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log924EnuUserRequestType( Enum924UserRequestType.CHANGE_PASSWORD );
        assertEquals( Enum924UserRequestType.CHANGE_PASSWORD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log924EnuUserRequestType( Enum924UserRequestType.REQUEST_STATUS );
        assertEquals( Enum924UserRequestType.REQUEST_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}