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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum514RegistTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  514
 *  RegistTransType
 *  char
 *  <p></p>
 *  Identifies Registration Instructions transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    2 - Cancel
 *  <p>    1 - Replace
 */
class Tag514EnuRegistTransTypeTest {
    @Test
    void FIX0514Test() {
        FIX43 fixData = FIX43.FIX514_ENU_REGIST_TRANS_TYPE;
        assertEquals( "514", fixData.toEnumIDString());
        assertEquals( "REGIST_TRANS_TYPE", fixData.toEnumNameString());
        assertEquals( "RegistTransType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0514Test() {
        Tag514EnuRegistTransType tagData;

        /*
         * 0-2 types
         */
        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.NEW );
        assertEquals( Enum514RegistTransType.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.REPLACE );
        assertEquals( Enum514RegistTransType.REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag514EnuRegistTransType( Enum514RegistTransType.CANCEL );
        assertEquals( Enum514RegistTransType.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag514EnuRegistTransType tagData;

        // loop around the ENUM and process
        for ( Enum514RegistTransType oneEnum : Enum514RegistTransType.values()) {
            tagData = new Tag514EnuRegistTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag514EnuRegistTransType tagData;

        // loop around the ENUM and process
        for (Enum514RegistTransType oneEnum : Enum514RegistTransType.values()) {
            tagData = new Tag514EnuRegistTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag514EnuRegistTransType tagData;

        // loop around the ENUM and process
        for (Enum514RegistTransType oneEnum : Enum514RegistTransType.values()) {
            tagData = new Tag514EnuRegistTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag514EnuRegistTransType tagData;

        // loop around the ENUM and process
        for (Enum514RegistTransType oneEnum : Enum514RegistTransType.values()) {
            tagData = new Tag514EnuRegistTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag514EnuRegistTransType tagData;

        // loop around the ENUM and process
        for (Enum514RegistTransType oneEnum : Enum514RegistTransType.values()) {
            tagData = new Tag514EnuRegistTransType(oneEnum);
            assertEquals( "Tag514EnuRegistTransType\n" +
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