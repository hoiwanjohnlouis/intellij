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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  990
 *  LegReportID
 *  String
 *  <p>
 *  Additional attribute to store the Trade ID of the Leg.
 */
class Tag990StrLegReportIDTest {
    @Test
    void FIX0990Test() {
        FIX50 fixData = FIX50.FIX990_STR_LEG_REPORT_ID;
        assertEquals( "990", fixData.toFIXIDString());
        assertEquals( "LEG_REPORT_ID", fixData.toFIXNameString());
        assertEquals( "LegReportID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0990Test() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag990StrLegReportID( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag990StrLegReportID.TESTA_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag990StrLegReportID.TESTB_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = Tag990StrLegReportID.TESTA_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag990StrLegReportID.TESTB_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = Tag990StrLegReportID.TESTB_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = Tag990StrLegReportID.TESTB_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = Tag990StrLegReportID.TESTB_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag990StrLegReportID tagData;
        String oneElement;

        oneElement = Tag990StrLegReportID.TESTA_STR_LEG_REPORT_ID;
        tagData = new Tag990StrLegReportID( new MyStringType( oneElement ) );
        assertEquals( "Tag990StrLegReportID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}