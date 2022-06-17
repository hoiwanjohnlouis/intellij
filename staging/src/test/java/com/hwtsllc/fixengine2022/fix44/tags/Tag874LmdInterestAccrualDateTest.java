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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  874
 *  InterestAccrualDate
 *  LocalMktDate
 *  <p></p>
 *  The start date used for calculating accrued interest on
 *  debt instruments which are being sold between interest payment dates.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Dated Date
 */
class Tag874LmdInterestAccrualDateTest {
    @Test
    void FIX0874Test() {
        FIX44 fixData = FIX44.FIX874_LMD_INTEREST_ACCRUAL_DATE;
        assertEquals( "874", fixData.toFIXIDString());
        assertEquals( "INTEREST_ACCRUAL_DATE", fixData.toFIXNameString());
        assertEquals( "InterestAccrualDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0874Test() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTA_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "874", tagData.toFIXIDString());
        assertEquals( "INTEREST_ACCRUAL_DATE", tagData.toFIXNameString());
        assertEquals( "InterestAccrualDate", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTA_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTB_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag874LmdInterestAccrualDate tagData;
        String oneElement;

        oneElement = Tag874LmdInterestAccrualDate.TESTA_LMD_INTEREST_ACCRUAL_DATE;
        tagData = new Tag874LmdInterestAccrualDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag874LmdInterestAccrualDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}