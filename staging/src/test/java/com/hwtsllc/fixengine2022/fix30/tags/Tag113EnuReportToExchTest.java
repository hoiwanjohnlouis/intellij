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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.fix30.enums.Enum113ReportToExch;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  113
 *  ReportToExch
 *  Boolean
 *  <p>
 *  Identifies party of trade responsible for exchange reporting.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Indicates the party sending message will report trade
 *  <p>    Y - Indicates the party receiving message must report trade
 */
class Tag113EnuReportToExchTest {
    @Test
    void PrintFIXTagTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( "FIX113_ENU_REPORT_TO_EXCH", tagData.toEnumLabelString());
            assertEquals( "REPORT_TO_EXCH", tagData.toEnumNameString());
            assertEquals( "113", tagData.toEnumIDString());
            assertEquals( "ReportToExch", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void Tag0113Test() {
        Tag113EnuReportToExch tagData;

        tagData = new Tag113EnuReportToExch( Enum113ReportToExch.NO );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag113EnuReportToExch( Enum113ReportToExch.YES );
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagGetDataValueTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( "Tag113EnuReportToExch\n" +
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