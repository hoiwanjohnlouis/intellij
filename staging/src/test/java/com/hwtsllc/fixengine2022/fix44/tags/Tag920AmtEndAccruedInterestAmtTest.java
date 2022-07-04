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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  920
 *  EndAccruedInterestAmt
 *  Amt
 *  <p></p>
 *  Accrued Interest Amount applicable to a financing transaction on the End Date.
 */
class Tag920AmtEndAccruedInterestAmtTest {
    @Test
    void FIX0920Test() {
        FIX44 fixData = FIX44.FIX920_AMT_END_ACCRUED_INTEREST_AMT;
        assertEquals( "920", fixData.toEnumIDString());
        assertEquals( "END_ACCRUED_INTEREST_AMT", fixData.toEnumNameString());
        assertEquals( "EndAccruedInterestAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0920Test() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTA_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "920", tagData.toEnumIDString());
        assertEquals( "END_ACCRUED_INTEREST_AMT", tagData.toEnumNameString());
        assertEquals( "EndAccruedInterestAmt", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTB_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTA_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTB_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTB_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTB_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTB_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag920AmtEndAccruedInterestAmt tagData;
        double oneElement;

        oneElement = Tag920AmtEndAccruedInterestAmt.TESTA_AMT_END_ACCRUED_INTEREST_AMT;
        tagData = new Tag920AmtEndAccruedInterestAmt( new MyAmtType( oneElement ) );
        assertEquals( "Tag920AmtEndAccruedInterestAmt\n" +
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