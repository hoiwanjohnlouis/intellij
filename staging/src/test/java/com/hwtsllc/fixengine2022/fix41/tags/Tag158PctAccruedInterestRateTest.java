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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  158
 *  AccruedInterestRate
 *  Percentage
 *  <p>
 *  The amount the buyer compensates the seller for the portion of the next coupon interest payment
 *  the seller has earned but will not receive from the issuer because the issuer will send the
 *  next coupon payment to the buyer.  Accrued Interest Rate is the annualized Accrued Interest
 *  amount divided by the purchase price of the bond.
 */
class Tag158PctAccruedInterestRateTest {
    @Test
    void FIX0158Test() {
        FIX41 fixData = FIX41.FIX158_PCT_ACCRUED_INTEREST_RATE;
        assertEquals( "158", fixData.toEnumIDString());
        assertEquals( "ACCRUED_INTEREST_RATE", fixData.toEnumNameString());
        assertEquals( "AccruedInterestRate", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0158Test() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( String.valueOf(Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag158PctAccruedInterestRate tagData;

        tagData = new Tag158PctAccruedInterestRate(
                new MyPercentageType(Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE));
        assertEquals( "Tag158PctAccruedInterestRate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}