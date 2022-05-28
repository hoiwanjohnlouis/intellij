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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  255
 *  CreditRating
 *  String
 *  <p>
 *  An evaluation of a company's ability to repay obligations or its likelihood of not defaulting.
 *  <p>
 *  These evaluations are provided by Credit Rating Agencies, i.e. S&P, Moody's.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag255StrCreditRatingTest {
    @Test
    void FIX0255Test() {
        FIX42 fixData = FIX42.FIX255_STR_CREDIT_RATING;
        assertEquals( "255", fixData.toFIXIDString());
        assertEquals( "CREDIT_RATING", fixData.toFIXNameString());
        assertEquals( "CreditRating", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0255Test() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTA_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag255StrCreditRating.TESTB_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTB_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTB_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTB_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTB_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag255StrCreditRating tagData;
        String oneElement;

        oneElement = Tag255StrCreditRating.TESTA_STR_CREDIT_RATING;
        tagData = new Tag255StrCreditRating( new MyStringType( oneElement ) );
        assertEquals( "Tag255StrCreditRating\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}