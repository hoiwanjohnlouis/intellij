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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  571
 *  TradeReportID
 *  String
 *  <p>
 *  Unique identifier of trade capture report
 */
class Tag571StrTradeReportIDTest {
    @Test
    void FIX0571Test() {
        FIX43 fixData = FIX43.FIX571_STR_TRADE_REPORT_ID;
        assertEquals( "571", fixData.toEnumIDString());
        assertEquals( "TRADE_REPORT_ID", fixData.toEnumNameString());
        assertEquals( "TradeReportID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0571Test() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTA_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag571StrTradeReportID.TESTB_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTA_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag571StrTradeReportID.TESTB_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTB_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTB_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTB_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag571StrTradeReportID tagData;
        String oneElement;

        oneElement = Tag571StrTradeReportID.TESTA_STR_TRADE_REPORT_ID;
        tagData = new Tag571StrTradeReportID( new MyStringType( oneElement ) );
        assertEquals( "Tag571StrTradeReportID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}