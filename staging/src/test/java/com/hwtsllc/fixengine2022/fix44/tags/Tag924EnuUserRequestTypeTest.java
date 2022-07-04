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
        assertEquals( "924", fixData.toEnumIDString());
        assertEquals( "USER_REQUEST_TYPE", fixData.toEnumNameString());
        assertEquals( "UserRequestType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0924Test() {
        Tag924EnuUserRequestType tagData;
        Enum924UserRequestType oneElement;

        oneElement = Enum924UserRequestType.LOG_ON;
        tagData = new Tag924EnuUserRequestType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "924", tagData.toEnumIDString());
        assertEquals( "USER_REQUEST_TYPE", tagData.toEnumNameString());
        assertEquals( "UserRequestType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.LOG_OFF );
        assertEquals( Enum924UserRequestType.LOG_OFF.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.CHANGE_PASSWORD );
        assertEquals( Enum924UserRequestType.CHANGE_PASSWORD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag924EnuUserRequestType( Enum924UserRequestType.REQUEST_STATUS );
        assertEquals( Enum924UserRequestType.REQUEST_STATUS.toEnumIDString(), tagData.getDataValue());
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
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}