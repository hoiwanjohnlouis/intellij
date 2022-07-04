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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  963
 *  MDReportID
 *  int
 *  <p>
 *  Unique identifier for the Market Data Report.
 */
class Tag963IntMDReportIDTest {
    @Test
    void FIX0963Test() {
        FIX50 fixData = FIX50.FIX963_INT_MD_REPORT_ID;
        assertEquals( "963", fixData.toEnumIDString());
        assertEquals( "MD_REPORT_ID", fixData.toEnumNameString());
        assertEquals( "MDReportID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0963Test() {
        Tag963IntMDReportID tagData;

        tagData = new Tag963IntMDReportID(
                new MyIntType( Tag963IntMDReportID.TESTA_INT_MD_REPORT_ID ));
        assertEquals( Tag963IntMDReportID.TESTA_INT_MD_REPORT_ID,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag963IntMDReportID(
                new MyIntType( Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID ));
        assertEquals( Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag963IntMDReportID tagData;
        int oneElement;

        oneElement = Tag963IntMDReportID.TESTA_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag963IntMDReportID tagData;
        int oneElement;

        oneElement = Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag963IntMDReportID tagData;
        int oneElement;

        oneElement = Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag963IntMDReportID tagData;
        int oneElement;

        oneElement = Tag963IntMDReportID.TESTB_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag963IntMDReportID tagData;
        int oneElement;

        oneElement = Tag963IntMDReportID.TESTA_INT_MD_REPORT_ID;
        tagData = new Tag963IntMDReportID( new MyIntType( oneElement ) );
        assertEquals( "Tag963IntMDReportID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}