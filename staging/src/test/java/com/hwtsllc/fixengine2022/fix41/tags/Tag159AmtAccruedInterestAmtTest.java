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
 *  159
 *  AccruedInterestAmt
 *  Amt
 *  <p>
 *  Amount of Accrued Interest for convertible bonds and fixed income
 */
class Tag159AmtAccruedInterestAmtTest {
    @Test
    void FIX0159Test() {
        FIX41 fixData = FIX41.FIX159_AMT_ACCRUED_INTEREST_AMT;
        assertEquals( "159", fixData.toEnumIDString());
        assertEquals( "ACCRUED_INTEREST_AMT", fixData.toEnumNameString());
        assertEquals( "AccruedInterestAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0159Test() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTA_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( Tag159AmtAccruedInterestAmt.TESTA_AMT_ACCRUED_INTEREST_AMT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( tagData.toEnumIDString() + "=" + Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( String.valueOf(Tag159AmtAccruedInterestAmt.TESTB_AMT_ACCRUED_INTEREST_AMT),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag159AmtAccruedInterestAmt tagData;

        tagData = new Tag159AmtAccruedInterestAmt(
                new MyAmtType(Tag159AmtAccruedInterestAmt.TESTA_AMT_ACCRUED_INTEREST_AMT));
        assertEquals( "Tag159AmtAccruedInterestAmt\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag159AmtAccruedInterestAmt.TESTA_AMT_ACCRUED_INTEREST_AMT + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag159AmtAccruedInterestAmt.TESTA_AMT_ACCRUED_INTEREST_AMT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}