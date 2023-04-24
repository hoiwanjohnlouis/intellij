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

package com.hwtsllc.fixengine.tags.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum165SettlInstSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag165EnuSettlInstSourceTest {
    Tag165EnuSettlInstSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( "FIX165_ENU_SETTL_INST_SOURCE", tagData.toFIXLabelString());
            assertEquals( "165", tagData.toFIXIDString());
            assertEquals( "SETTL_INST_SOURCE", tagData.toFIXNameString());
            assertEquals( "SettlInstSource", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  165
         *  SettlInstSource
         *  char
         *  <p>    1 - Broker's Instructions
         *  <p>    2 - Institution's Instructions
         *  <p>    3 - Investor (e.g. CIV use)
         */
        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.BROKER_INSTRUCTIONS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INSTITUTION_INSTRUCTIONS);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag165EnuSettlInstSource(Enum165SettlInstSource.INVESTOR);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum165SettlInstSource oneEnum : Enum165SettlInstSource.values()) {
            tagData = new Tag165EnuSettlInstSource(oneEnum);
            assertEquals( "Tag165EnuSettlInstSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}