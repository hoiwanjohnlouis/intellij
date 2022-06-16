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

import com.hwtsllc.fixengine2022.datatypes.FIX30;
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
    void FIX0113Test() {
        FIX30 fixData = FIX30.FIX113_ENU_REPORT_TO_EXCH;
        assertEquals( "REPORT_TO_EXCH", fixData.toFIXNameString());
        assertEquals( "113", fixData.toFIXIDString());
        assertEquals( "ReportToExch", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0113Test() {
        Tag113EnuReportToExch tagData;
        Enum113ReportToExch oneElement;

        oneElement = Enum113ReportToExch.NO;
        tagData = new Tag113EnuReportToExch( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag113EnuReportToExch(Enum113ReportToExch.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch( oneEnum );
            System.out.println( tagData.toVerboseString() );
        }
    }
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
    void TagGetDataValueTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag113EnuReportToExch tagData;

        // loop around the ENUM and process
        for (Enum113ReportToExch oneEnum : Enum113ReportToExch.values()) {
            tagData = new Tag113EnuReportToExch(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
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
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}