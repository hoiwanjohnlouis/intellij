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
    Tag158PctAccruedInterestRate tagData;
    double [] TestArray = {
            Tag158PctAccruedInterestRate.TESTA_PCT_ACCRUED_INTEREST_RATE,
            Tag158PctAccruedInterestRate.TESTB_PCT_ACCRUED_INTEREST_RATE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            assertEquals( "FIX158_PCT_ACCRUED_INTEREST_RATE", tagData.toEnumLabelString());
            assertEquals( "158", tagData.toEnumIDString());
            assertEquals( "ACCRUED_INTEREST_RATE", tagData.toEnumNameString());
            assertEquals( "AccruedInterestRate", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag158PctAccruedInterestRate( new MyPercentageType( oneElement ));
            assertEquals( "Tag158PctAccruedInterestRate\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}