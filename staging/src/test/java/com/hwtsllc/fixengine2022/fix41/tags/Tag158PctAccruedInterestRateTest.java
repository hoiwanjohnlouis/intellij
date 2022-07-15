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

import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  158
 *  AccruedInterestRate
 *  Percentage
 *  <p></p>
 *  The amount the buyer compensates the seller for the portion of the next coupon interest payment
 *  the seller has earned but will not receive from the issuer because the issuer will send the
 *  next coupon payment to the buyer.
 *  <p></p>
 *  Accrued Interest Rate is the annualized Accrued Interest
 *  amount divided by the purchase price of the bond.
 */
class Tag158PctAccruedInterestRateTest {
    @Test
    void PrintTest() {
        Tag158PctAccruedInterestRate tagData;
        double oneElement;

        oneElement = Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE;
        tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE;
        tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag158PctAccruedInterestRate tagData;
        double oneElement;

        oneElement = Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE;
        tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE;
        tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag158PctAccruedInterestRate tagData ) {
        assertEquals( "FIX158_PCT_ACCRUED_INTEREST_RATE", tagData.toEnumLabelString());
        assertEquals( "158", tagData.toEnumIDString());
        assertEquals( "ACCRUED_INTEREST_RATE", tagData.toEnumNameString());
        assertEquals( "AccruedInterestRate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag158PctAccruedInterestRate tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag158PctAccruedInterestRate tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag158PctAccruedInterestRate tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag158PctAccruedInterestRate tagData ) {
        assertEquals( "Tag158PctAccruedInterestRate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}