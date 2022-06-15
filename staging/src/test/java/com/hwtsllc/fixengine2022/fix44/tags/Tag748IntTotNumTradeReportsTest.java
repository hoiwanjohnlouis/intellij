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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  748
 *  TotNumTradeReports
 *  int
 *  <p></p>
 *  Total number of trade reports returned.
 */
class Tag748IntTotNumTradeReportsTest {
    @Test
    void FIX0748Test() {
        FIX44 fixData = FIX44.FIX748_INT_TOT_NUM_TRADE_REPORTS;
        assertEquals( "748", fixData.toFIXIDString());
        assertEquals( "TOT_NUM_TRADE_REPORTS", fixData.toFIXNameString());
        assertEquals( "TotNumTradeReports", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0748Test() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTA_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag748IntTotNumTradeReports.TESTB_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTA_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag748IntTotNumTradeReports.TESTB_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTB_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTB_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTB_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag748IntTotNumTradeReports tagData;
        int oneElement;

        oneElement = Tag748IntTotNumTradeReports.TESTA_INT_TOT_NUM_TRADE_REPORTS;
        tagData = new Tag748IntTotNumTradeReports( new MyIntType( oneElement ) );
        assertEquals( "Tag748IntTotNumTradeReports\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}