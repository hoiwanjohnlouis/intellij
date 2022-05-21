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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  118
 *  NetMoney
 *  Amt
 *  Total amount due as the result of the transaction
 *  (e.g. for Buy order - principal + commission + fees)
 *  reported in currency of execution.
 */
class Tag118AmtNetMoneyTest {
    @Test
    void FIX0118Test() {
        FIX40 fixData = FIX40.FIX118_AMT_NET_MONEY;
        assertEquals( "NET_MONEY", fixData.toFIXNameString());
        assertEquals( "118", fixData.toFIXIDString());
        assertEquals( "NetMoney", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0118Test() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(118D) );
        assertEquals( 118D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(Tag118AmtNetMoney.TESTB_AMT_NET_MONEY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(Tag118AmtNetMoney.TESTB_AMT_NET_MONEY));
        assertEquals( Tag118AmtNetMoney.TESTB_AMT_NET_MONEY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(Tag118AmtNetMoney.TESTB_AMT_NET_MONEY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag118AmtNetMoney.TESTB_AMT_NET_MONEY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(Tag118AmtNetMoney.TESTB_AMT_NET_MONEY));
        assertEquals( String.valueOf(Tag118AmtNetMoney.TESTB_AMT_NET_MONEY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag118AmtNetMoney tagData;

        tagData = new Tag118AmtNetMoney(new MyAmtType(Tag118AmtNetMoney.TESTA_AMT_NET_MONEY));
        assertEquals( "Tag118AmtNetMoney\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag118AmtNetMoney.TESTA_AMT_NET_MONEY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag118AmtNetMoney.TESTA_AMT_NET_MONEY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}