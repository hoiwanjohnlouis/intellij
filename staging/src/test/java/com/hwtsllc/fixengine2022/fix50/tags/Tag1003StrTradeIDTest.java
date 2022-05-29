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
 *  1003
 *  TradeID
 *  String
 *  <p>
 *  The unique ID assigned to the trade entity once it is received
 *  or matched by the exchange or central counterparty.
 */
class Tag1003StrTradeIDTest {
    @Test
    void FIX1003Test() {
        FIX50 fixData = FIX50.FIX1003_STR_TRADE_ID;
        assertEquals( "1003", fixData.toFIXIDString());
        assertEquals( "TRADE_ID", fixData.toFIXNameString());
        assertEquals( "TradeID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1003Test() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1003StrTradeID( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1003StrTradeID.TESTA_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1003StrTradeID.TESTB_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = Tag1003StrTradeID.TESTA_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1003StrTradeID.TESTB_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = Tag1003StrTradeID.TESTB_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = Tag1003StrTradeID.TESTB_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = Tag1003StrTradeID.TESTB_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1003StrTradeID tagData;
        String oneElement;

        oneElement = Tag1003StrTradeID.TESTA_STR_TRADE_ID;
        tagData = new Tag1003StrTradeID( new MyStringType( oneElement ) );
        assertEquals( "Tag1003StrTradeID\n" +
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