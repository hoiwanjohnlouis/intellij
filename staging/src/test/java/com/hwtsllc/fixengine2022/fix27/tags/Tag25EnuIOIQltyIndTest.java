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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  25
 *  IOIQltyInd
 *  char
 *  <p></p>
 *  Relative quality of indication
 *  <p></p>
 *  Valid values:
 *  <p>    H - High
 *  <p>    L - Low
 *  <p>    M - Medium
 */
class Tag25EnuIOIQltyIndTest {
    @Test
    void Tag0025Test() {
        Tag25EnuIOIQltyInd tagData;

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.HIGH);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.MEDIUM);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag25EnuIOIQltyInd(Enum25IOIQltyInd.LOW);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( "FIX25_ENU_IOI_QLTY_IND", tagData.toEnumLabelString());
            assertEquals( "IOI_QLTY_IND", tagData.toEnumNameString());
            assertEquals( "25", tagData.toEnumIDString());
            assertEquals( "IOIQltyInd", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void PrintFIXTagTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( oneEnum.toEnumIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag25EnuIOIQltyInd tagData;

        // loop around the ENUM and process
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            tagData = new Tag25EnuIOIQltyInd(oneEnum);
            assertEquals( "Tag25EnuIOIQltyInd\n" +
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