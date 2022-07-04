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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  75
 *  TradeDate
 *  LocalMktDate
 *  <p></p>
 *  Indicates date of trade referenced in this message in YYYYMMDD format.
 *  <p></p>
 *  Absence of this field indicates current day (expressed in local time at place of trade).
 */
class Tag75StrTradeDateTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX75_STR_TRADE_DATE;
        assertEquals( "TRADE_DATE", fixData.toEnumNameString());
        assertEquals( "75", fixData.toEnumIDString());
        assertEquals( "TradeDate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0075Test() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = "20220401 130000";
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag75StrTradeDate.TESTA_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag75StrTradeDate.TESTB_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag75StrTradeDate tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX75_STR_TRADE_DATE", tagData.toEnumLabelString());
        assertEquals( "TRADE_DATE", tagData.toEnumNameString());
        assertEquals( "75", tagData.toEnumIDString());
        assertEquals( "TradeDate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = Tag75StrTradeDate.TESTA_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag75StrTradeDate.TESTB_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = Tag75StrTradeDate.TESTB_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = Tag75StrTradeDate.TESTB_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = Tag75StrTradeDate.TESTB_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag75StrTradeDate tagData;
        String oneElement;

        oneElement = Tag75StrTradeDate.TESTA_STR_TRADE_DATE;
        tagData = new Tag75StrTradeDate(new MyStringType( oneElement ) );
        assertEquals( "Tag75StrTradeDate\n" +
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