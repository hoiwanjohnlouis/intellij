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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum163SettlInstTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  163
 *  SettlInstTransType
 *  char
 *  <p></p>
 *  Settlement Instructions message transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    N - New
 *  <p>    C - Cancel
 *  <p>    R - Replace
 *  <p>    T - Restate
 */
class Tag163EnuSettlInstTransTypeTest {
    @Test
    void PrintFIXTagTest() {
        Tag163EnuSettlInstTransType tagData;

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIX0163Test() {
        Tag163EnuSettlInstTransType tagData;

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            assertEquals( "FIX163_ENU_SETTL_INST_TRANS_TYPE", tagData.toEnumLabelString());
            assertEquals( "163", tagData.toEnumIDString());
            assertEquals( "SETTL_INST_TRANS_TYPE", tagData.toEnumNameString());
            assertEquals( "SettlInstTransType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag163EnuSettlInstTransType tagData;

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.NEW);
        assertEquals( Enum163SettlInstTransType.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.CANCEL);
        assertEquals( Enum163SettlInstTransType.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.REPLACE);
        assertEquals( Enum163SettlInstTransType.REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag163EnuSettlInstTransType(Enum163SettlInstTransType.RESTATE);
        assertEquals( Enum163SettlInstTransType.RESTATE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag163EnuSettlInstTransType tagData;

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag163EnuSettlInstTransType tagData;

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag163EnuSettlInstTransType tagData;

        // loop around the ENUM and process
        for (Enum163SettlInstTransType oneEnum : Enum163SettlInstTransType.values()) {
            tagData = new Tag163EnuSettlInstTransType(oneEnum);
            assertEquals( "Tag163EnuSettlInstTransType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}