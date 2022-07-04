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
 *  119
 *  SettlCurrAmt
 *  Amt
 *  Total amount due expressed in settlement currency
 *  (includes the effect of the forex transaction)
 */
class Tag119AmtSettlCurrAmtTest {
    @Test
    void FIX0119Test() {
        FIX40 fixData = FIX40.FIX119_AMT_SETTL_CURR_AMT;
        assertEquals( "SETTL_CURR_AMT", fixData.toEnumNameString());
        assertEquals( "119", fixData.toEnumIDString());
        assertEquals( "SettlCurrAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0119Test() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(119D) );
        assertEquals( 119D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT));
        assertEquals( Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT));
        assertEquals( tagData.toEnumIDString() + "=" + Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT));
        assertEquals( String.valueOf(Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag119AmtSettlCurrAmt tagData;

        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType(Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT));
        assertEquals( "Tag119AmtSettlCurrAmt\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}