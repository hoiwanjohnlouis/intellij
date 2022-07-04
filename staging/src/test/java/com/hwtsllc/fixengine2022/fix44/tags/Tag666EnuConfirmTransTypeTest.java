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
import com.hwtsllc.fixengine2022.fix44.enums.Enum666ConfirmTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  666
 *  ConfirmTransType
 *  int
 *  <p></p>
 *  Identifies the Confirmation transaction type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 */
class Tag666EnuConfirmTransTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX666_ENU_CONFIRM_TRANS_TYPE;
        assertEquals( "666", fixData.toEnumIDString());
        assertEquals( "CONFIRM_TRANS_TYPE", fixData.toEnumNameString());
        assertEquals( "ConfirmTransType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0666Test() {
        Tag666EnuConfirmTransType tagData;
        Enum666ConfirmTransType oneElement;

        oneElement = Enum666ConfirmTransType.NEW;
        tagData = new Tag666EnuConfirmTransType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "666", tagData.toEnumIDString());
        assertEquals( "CONFIRM_TRANS_TYPE", tagData.toEnumNameString());
        assertEquals( "ConfirmTransType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.REPLACE);
        assertEquals( Enum666ConfirmTransType.REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.CANCEL);
        assertEquals( Enum666ConfirmTransType.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for ( Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( "Tag666EnuConfirmTransType\n" +
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