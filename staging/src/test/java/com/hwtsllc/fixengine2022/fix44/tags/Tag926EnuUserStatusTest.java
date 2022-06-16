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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum926UserStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  926
 *  UserStatus
 *  int
 *  <p></p>
 *  Indicates the status of a user
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Logged In
 *  <p>    2 - Not Logged In
 *  <p>    3 - User Not Recognised
 *  <p>    4 - Password Incorrect
 *  <p>    5 - Password Changed
 *  <p></p>
 *  <p>    6 - Other
 */
class Tag926EnuUserStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX926_ENU_USER_STATUS;
        assertEquals( "926", fixData.toFIXIDString());
        assertEquals( "USER_STATUS", fixData.toFIXNameString());
        assertEquals( "UserStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0926Test() {
        Tag926EnuUserStatus tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.LOGGED_IN );
        assertEquals( Enum926UserStatus.LOGGED_IN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "926", fixData.toFIXIDString());
        assertEquals( "USER_STATUS", fixData.toFIXNameString());
        assertEquals( "UserStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.NOT_LOGGED_IN );
        assertEquals( Enum926UserStatus.NOT_LOGGED_IN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.USER_NOT_RECOGNISED );
        assertEquals( Enum926UserStatus.USER_NOT_RECOGNISED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.PASSWORD_INCORRECT );
        assertEquals( Enum926UserStatus.PASSWORD_INCORRECT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag926EnuUserStatus( Enum926UserStatus.PASSWORD_CHANGED );
        assertEquals( Enum926UserStatus.PASSWORD_CHANGED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag926EnuUserStatus( Enum926UserStatus.OTHER );
        assertEquals( Enum926UserStatus.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag926EnuUserStatus tagData;

        // loop around the ENUM and process
        for ( Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            tagData = new Tag926EnuUserStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag926EnuUserStatus tagData;

        // loop around the ENUM and process
        for (Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            tagData = new Tag926EnuUserStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag926EnuUserStatus tagData;

        // loop around the ENUM and process
        for (Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            tagData = new Tag926EnuUserStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag926EnuUserStatus tagData;

        // loop around the ENUM and process
        for (Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            tagData = new Tag926EnuUserStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag926EnuUserStatus tagData;

        // loop around the ENUM and process
        for (Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            tagData = new Tag926EnuUserStatus(oneEnum);
            assertEquals( "Tag926EnuUserStatus\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}