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
import com.hwtsllc.fixengine2022.fix44.enums.Enum924UserRequestType;
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
class Tag924EnuUserRequestTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX924_ENU_USER_REQUEST_TYPE;
        assertEquals( "924", fixData.toFIXIDString());
        assertEquals( "USER_REQUEST_TYPE", fixData.toFIXNameString());
        assertEquals( "UserRequestType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0924Test() {
        Tag924EnuUserRequestType tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.LOG_ON );
        assertEquals( Enum924UserRequestType.LOG_ON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "924", fixData.toFIXIDString());
        assertEquals( "USER_REQUEST_TYPE", fixData.toFIXNameString());
        assertEquals( "UserRequestType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.LOG_OFF );
        assertEquals( Enum924UserRequestType.LOG_OFF.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.CHANGE_PASSWORD );
        assertEquals( Enum924UserRequestType.CHANGE_PASSWORD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.REQUEST_STATUS );
        assertEquals( Enum924UserRequestType.REQUEST_STATUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag924EnuUserRequestType tagData;

        // loop around the ENUM and process
        for ( Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            tagData = new Tag924EnuUserRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag924EnuUserRequestType tagData;

        // loop around the ENUM and process
        for (Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            tagData = new Tag924EnuUserRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag924EnuUserRequestType tagData;

        // loop around the ENUM and process
        for (Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            tagData = new Tag924EnuUserRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag924EnuUserRequestType tagData;

        // loop around the ENUM and process
        for (Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            tagData = new Tag924EnuUserRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag924EnuUserRequestType tagData;

        // loop around the ENUM and process
        for (Enum924UserRequestType oneEnum : Enum924UserRequestType.values()) {
            tagData = new Tag924EnuUserRequestType(oneEnum);
            assertEquals( "Tag924EnuUserRequestType\n" +
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