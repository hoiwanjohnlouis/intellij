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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  154
 *  AllocNetMoney
 *  Amt
 *  <p>
 *  NetMoney (8) for a specific AllocAccount (79)
 */
class Tag154AmtAllocNetMoneyTest {
    @Test
    void FIX0154Test() {
        FIX41 fixData = FIX41.FIX154_AMT_ALLOC_NET_MONEY;
        assertEquals( "154", fixData.toEnumIDString());
        assertEquals( "ALLOC_NET_MONEY", fixData.toEnumNameString());
        assertEquals( "AllocNetMoney", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0154Test() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY));
        assertEquals( Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        assertEquals( Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        assertEquals( Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        assertEquals( tagData.toEnumIDString() + "=" + Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY));
        assertEquals( String.valueOf(Tag154AmtAllocNetMoney.TESTB_AMT_ALLOC_NET_MONEY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag154AmtAllocNetMoney tagData;

        tagData = new Tag154AmtAllocNetMoney(new MyAmtType(Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY));
        assertEquals( "Tag154AmtAllocNetMoney\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag154AmtAllocNetMoney.TESTA_AMT_ALLOC_NET_MONEY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}