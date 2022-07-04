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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum165SettlInstSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  165
 *  SettlInstSource
 *  char
 *  <p>
 *  Indicates source of Settlement Instructions
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Broker's Instructions
 *  <p>    2 - Institution's Instructions
 *  <p>    3 - Investor (e.g. CIV use)
 */
class Tag165EnuSettlInstSourceTest {
    @Test
    void FIX0165Test() {
        FIX41 fixData = FIX41.FIX165_ENU_SETTL_INST_SOURCE;
        assertEquals( "165", fixData.toEnumIDString());
        assertEquals( "SETTL_INST_SOURCE", fixData.toEnumNameString());
        assertEquals( "SettlInstSource", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0165Test() {
        Tag165EnuSettlInstSource tagData;

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.BROKER_INSTRUCTIONS);
        assertEquals( Enum165SettlInstSource.BROKER_INSTRUCTIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS);
        assertEquals( Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INVESTOR);
        assertEquals( Enum165SettlInstSource.INVESTOR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag165EnuSettlInstSource tagData;

        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag165EnuSettlInstSource tagData;

        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag165EnuSettlInstSource tagData;

        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag165EnuSettlInstSource tagData;

        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag165EnuSettlInstSource tagData;

        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( "Tag165EnuSettlInstSource\n" +
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