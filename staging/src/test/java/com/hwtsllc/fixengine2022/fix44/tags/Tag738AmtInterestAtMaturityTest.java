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
 *  738
 *  InterestAtMaturity
 *  Amt
 *  <p></p>
 *  Amount of interest (i.e. lump-sum) at maturity.
 */
class Tag738AmtInterestAtMaturityTest {
    @Test
    void FIX0738Test() {
        FIX44 fixData = FIX44.FIX738_AMT_INTEREST_AT_MATURITY;
        assertEquals( "738", fixData.toEnumIDString());
        assertEquals( "INTEREST_AT_MATURITY", fixData.toEnumNameString());
        assertEquals( "InterestAtMaturity", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0738Test() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTA_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "738", tagData.toEnumIDString());
        assertEquals( "INTEREST_AT_MATURITY", tagData.toEnumNameString());
        assertEquals( "InterestAtMaturity", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag738AmtInterestAtMaturity.TESTB_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTA_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag738AmtInterestAtMaturity.TESTB_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTB_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTB_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTB_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag738AmtInterestAtMaturity tagData;
        double oneElement;

        oneElement = Tag738AmtInterestAtMaturity.TESTA_AMT_INTEREST_AT_MATURITY;
        tagData = new Tag738AmtInterestAtMaturity( new MyAmtType( oneElement ) );
        assertEquals( "Tag738AmtInterestAtMaturity\n" +
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