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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1134ReportedPxDiff;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1134
 *  ReportedPxDiff
 *  Boolean
 *  <p>
 *  Shows that the reported price that is different from the market price
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Reported price is different from the market price" ),
 *  <p> NO( "N", "NO", "N - Reported price is equal to market price" ),
 */
class Tag1134EnuReportedPxDiffTest {
    @Test
    void FIX1134Test() {
        FIX50 fixData = FIX50.FIX1134_ENU_REPORTED_PX_DIFF;
        assertEquals( "1134", fixData.toEnumIDString());
        assertEquals( "REPORTED_PX_DIFF", fixData.toEnumNameString());
        assertEquals( "ReportedPxDiff", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1134Test() {
        Tag1134EnuReportedPxDiff tagData;

        tagData = new Tag1134EnuReportedPxDiff( Enum1134ReportedPxDiff.NO );
        assertEquals( Enum1134ReportedPxDiff.NO.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1134EnuReportedPxDiff( Enum1134ReportedPxDiff.YES );
        assertEquals( Enum1134ReportedPxDiff.YES.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1134EnuReportedPxDiff tagData;

        // loop around the ENUM and process
        for ( Enum1134ReportedPxDiff oneEnum : Enum1134ReportedPxDiff.values()) {
            tagData = new Tag1134EnuReportedPxDiff(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1134EnuReportedPxDiff tagData;

        // loop around the ENUM and process
        for (Enum1134ReportedPxDiff oneEnum : Enum1134ReportedPxDiff.values()) {
            tagData = new Tag1134EnuReportedPxDiff(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1134EnuReportedPxDiff tagData;

        // loop around the ENUM and process
        for (Enum1134ReportedPxDiff oneEnum : Enum1134ReportedPxDiff.values()) {
            tagData = new Tag1134EnuReportedPxDiff(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1134EnuReportedPxDiff tagData;

        // loop around the ENUM and process
        for (Enum1134ReportedPxDiff oneEnum : Enum1134ReportedPxDiff.values()) {
            tagData = new Tag1134EnuReportedPxDiff(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1134EnuReportedPxDiff tagData;

        // loop around the ENUM and process
        for (Enum1134ReportedPxDiff oneEnum : Enum1134ReportedPxDiff.values()) {
            tagData = new Tag1134EnuReportedPxDiff(oneEnum);
            assertEquals( "Tag1134EnuReportedPxDiff\n" +
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