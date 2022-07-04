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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1072
 *  SideGrossTradeAmt
 *  Amt
 *  <p>
 *  The gross trade amount for this side of the trade.
 *  <p>
 *  See also GrossTradeAmt (381) for additional definition.
 */
class Tag1072AmtSideGrossTradeAmtTest {
    @Test
    void FIX1072Test() {
        FIX50 fixData = FIX50.FIX1072_AMT_SIDE_GROSS_TRADE_AMT;
        assertEquals( "1072", fixData.toEnumIDString());
        assertEquals( "SIDE_GROSS_TRADE_AMT", fixData.toEnumNameString());
        assertEquals( "SideGrossTradeAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1072Test() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTA_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTB_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTA_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTB_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTB_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTB_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTB_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1072AmtSideGrossTradeAmt tagData;
        double oneElement;

        oneElement = Tag1072AmtSideGrossTradeAmt.TESTA_AMT_SIDE_GROSS_TRADE_AMT;
        tagData = new Tag1072AmtSideGrossTradeAmt( new MyAmtType( oneElement ) );
        assertEquals( "Tag1072AmtSideGrossTradeAmt\n" +
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