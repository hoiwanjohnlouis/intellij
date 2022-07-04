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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum429ListStatusType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  429
 *  ListStatusType
 *  int
 *  <p>
 *  Code to represent the status type.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    1 - Ack
 *  <p>    2 - Response
 *  <p>    3 - Timed
 *  <p>    4 - Exec Started
 *  <p>    5 - All Done
 *  <p></p>
 *  <p>    6 - Alert
 */
class Tag429EnuListStatusTypeTest {
    @Test
    void FIX0429Test() {
        FIX42 fixData = FIX42.FIX429_ENU_LIST_STATUS_TYPE;
        assertEquals( "429", fixData.toEnumIDString());
        assertEquals( "LIST_STATUS_TYPE", fixData.toEnumNameString());
        assertEquals( "ListStatusType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0429Test() {
        Tag429EnuListStatusType tagData;

        /*
         * 1-6 msg types
         */
        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ACK);
        assertEquals( Enum429ListStatusType.ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.RESPONSE);
        assertEquals( Enum429ListStatusType.RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.TIMED);
        assertEquals( Enum429ListStatusType.TIMED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.EXEC_STARTED);
        assertEquals( Enum429ListStatusType.EXEC_STARTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ALL_DONE);
        assertEquals( Enum429ListStatusType.ALL_DONE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag429EnuListStatusType(Enum429ListStatusType.ALERT);
        assertEquals( Enum429ListStatusType.ALERT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag429EnuListStatusType tagData;

        // loop around the ENUM and process
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            tagData = new Tag429EnuListStatusType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag429EnuListStatusType tagData;

        // loop around the ENUM and process
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            tagData = new Tag429EnuListStatusType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag429EnuListStatusType tagData;

        // loop around the ENUM and process
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            tagData = new Tag429EnuListStatusType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag429EnuListStatusType tagData;

        // loop around the ENUM and process
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            tagData = new Tag429EnuListStatusType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag429EnuListStatusType tagData;

        // loop around the ENUM and process
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            tagData = new Tag429EnuListStatusType(oneEnum);
            assertEquals( "Tag429EnuListStatusType\n" +
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