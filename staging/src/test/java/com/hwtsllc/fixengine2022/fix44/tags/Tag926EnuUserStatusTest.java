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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum926UserStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  926
 *  UserStatus
 *  int
 *  Indicates the status of a user
 *  Valid values:
 *      1 - Logged In
 *      2 - Not Logged In
 *      3 - User Not Recognised
 *      4 - Password Incorrect
 *      5 - Password Changed
 *      6 - Other
 */
class Tag926EnuUserStatusTest {
    @Test
    void FIX0926Test() {
        FIX44 fixData = FIX44.FIX926_ENU_USER_STATUS;
        assertEquals( "926", fixData.getID());
        assertEquals( "USER_STATUS", fixData.getName());
        assertEquals( "UserStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0926Test() {
        Tag926EnuUserStatus tagData;

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.LOGGED_IN );
        assertEquals( Enum926UserStatus.LOGGED_IN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.NOT_LOGGED_IN );
        assertEquals( Enum926UserStatus.NOT_LOGGED_IN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.USER_NOT_RECOGNISED );
        assertEquals( Enum926UserStatus.USER_NOT_RECOGNISED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.PASSWORD_INCORRECT );
        assertEquals( Enum926UserStatus.PASSWORD_INCORRECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.PASSWORD_CHANGED );
        assertEquals( Enum926UserStatus.PASSWORD_CHANGED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag926EnuUserStatus( Enum926UserStatus.OTHER );
        assertEquals( Enum926UserStatus.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}