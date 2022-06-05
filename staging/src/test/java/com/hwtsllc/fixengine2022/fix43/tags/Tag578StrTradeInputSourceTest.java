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
import com.hwtsllc.fixengine2022.fix42.tags.Tag578StrTradeInputSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  578
 *  TradeInputSource
 *  String
 *  <p>
 *  Type of input device or system from which the trade was entered.
 */
class Tag578StrTradeInputSourceTest {
    @Test
    void FIX0578Test() {
        FIX43 fixData = FIX43.FIX578_STR_TRADE_INPUT_SOURCE;
        assertEquals( "578", fixData.toFIXIDString());
        assertEquals( "TRADE_INPUT_SOURCE", fixData.toFIXNameString());
        assertEquals( "TradeInputSource", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0578Test() {
        Tag578StrTradeInputSource tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag578StrTradeInputSource tagData;
        String oneElement;

        oneElement = Tag578StrTradeInputSource.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag578StrTradeInputSource( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag578StrTradeInputSource tagData;
        String oneElement;

        oneElement = Tag578StrTradeInputSource.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag578StrTradeInputSource( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag578StrTradeInputSource tagData;
        String oneElement;

        oneElement = Tag578StrTradeInputSource.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag578StrTradeInputSource( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag578StrTradeInputSource tagData;
        String oneElement;

        oneElement = Tag578StrTradeInputSource.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag578StrTradeInputSource(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag578StrTradeInputSource tagData;
        String oneElement;

        oneElement = Tag578StrTradeInputSource.TESTA_STR_SETTL_INST_REF_ID;
        tagData = new Tag578StrTradeInputSource( new MyStringType( oneElement ) );
        assertEquals( "Tag578StrTradeInputSource\n" +
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