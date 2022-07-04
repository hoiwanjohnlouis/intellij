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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  491
 *  CardIssNum
 *  String
 *  <p>
 *  The issue number of the payment card as specified on the card being used for payment.
 *  <p>
 *  This is only applicable to certain types of card.
 */
class Tag491StrCardIssNumTest {
    @Test
    void FIX0491Test() {
        FIX43 fixData = FIX43.FIX491_STR_CARD_ISS_NUM;
        assertEquals( "491", fixData.toEnumIDString());
        assertEquals( "CARD_ISS_NUM", fixData.toEnumNameString());
        assertEquals( "CardIssNum", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0491Test() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTA_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag491StrCardIssNum.TESTB_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTB_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTB_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTB_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTB_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag491StrCardIssNum tagData;
        String oneElement;

        oneElement = Tag491StrCardIssNum.TESTA_STR_CARD_ISS_NUM;
        tagData = new Tag491StrCardIssNum( new MyStringType( oneElement ) );
        assertEquals( "Tag491StrCardIssNum\n" +
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