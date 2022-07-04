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
 *  137
 *  MiscFeeAmt
 *  Amt
 *  Miscellaneous fee value
 */
class Tag137AmtMiscFeeAmtTest {
    @Test
    void FIX0137Test() {
        FIX40 fixData = FIX40.FIX137_AMT_MISC_FEE_AMT;
        assertEquals( "MISC_FEE_AMT", fixData.toEnumNameString());
        assertEquals( "137", fixData.toEnumIDString());
        assertEquals( "MiscFeeAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0137Test() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(137D ) );
        assertEquals( 137D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT));
        assertEquals( Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT));
        assertEquals( tagData.toEnumIDString() + "=" + Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT));
        assertEquals( String.valueOf(Tag137AmtMiscFeeAmt.TESTB_AMT_MISC_FEE_AMT),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag137AmtMiscFeeAmt tagData;

        tagData = new Tag137AmtMiscFeeAmt(new MyAmtType(Tag137AmtMiscFeeAmt.TESTA_AMT_MISC_FEE_AMT));
        assertEquals( "Tag137AmtMiscFeeAmt\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag137AmtMiscFeeAmt.TESTA_AMT_MISC_FEE_AMT + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag137AmtMiscFeeAmt.TESTA_AMT_MISC_FEE_AMT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}