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
import com.hwtsllc.fixengine2022.fix44.enums.Enum773ConfirmType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  773
 *  ConfirmType
 *  int
 *  <p></p>
 *  Identifies the type of Confirmation message being sent.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Status
 *  <p>    2 - Confirmation
 *  <p>    3 - Confirmation Request Rejected (reason can be stated in Text (58) field)
 */
class Tag773EnuConfirmTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX773_ENU_CONFIRM_TYPE;
        assertEquals( "773", fixData.toEnumIDString());
        assertEquals( "CONFIRM_TYPE", fixData.toEnumNameString());
        assertEquals( "ConfirmType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0773Test() {
        Tag773EnuConfirmType tagData;
        Enum773ConfirmType oneElement;

        oneElement = Enum773ConfirmType.STATUS;
        tagData = new Tag773EnuConfirmType( oneElement );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "773", tagData.toEnumIDString());
        assertEquals( "CONFIRM_TYPE", tagData.toEnumNameString());
        assertEquals( "ConfirmType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag773EnuConfirmType(Enum773ConfirmType.CONFIRMATION);
        assertEquals( Enum773ConfirmType.CONFIRMATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag773EnuConfirmType(Enum773ConfirmType.CONFIRMATION_REJECTED);
        assertEquals( Enum773ConfirmType.CONFIRMATION_REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag773EnuConfirmType tagData;

        // loop around the ENUM and process
        for ( Enum773ConfirmType oneEnum : Enum773ConfirmType.values()) {
            tagData = new Tag773EnuConfirmType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag773EnuConfirmType tagData;

        // loop around the ENUM and process
        for (Enum773ConfirmType oneEnum : Enum773ConfirmType.values()) {
            tagData = new Tag773EnuConfirmType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag773EnuConfirmType tagData;

        // loop around the ENUM and process
        for (Enum773ConfirmType oneEnum : Enum773ConfirmType.values()) {
            tagData = new Tag773EnuConfirmType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag773EnuConfirmType tagData;

        // loop around the ENUM and process
        for (Enum773ConfirmType oneEnum : Enum773ConfirmType.values()) {
            tagData = new Tag773EnuConfirmType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag773EnuConfirmType tagData;

        // loop around the ENUM and process
        for (Enum773ConfirmType oneEnum : Enum773ConfirmType.values()) {
            tagData = new Tag773EnuConfirmType(oneEnum);
            assertEquals( "Tag773EnuConfirmType\n" +
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