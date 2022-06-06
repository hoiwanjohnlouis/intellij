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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  490
 *  CardExpDate
 *  LocalMktDate
 *  <p>
 *  The expiry date of the payment card as specified on the card being used for payment.
 */
class Tag490LmdCardExpDateTest {
    @Test
    void FIX0490Test() {
        FIX43 fixData = FIX43.FIX490_LMD_CARD_EXP_DATE;
        assertEquals( "490", fixData.toFIXIDString());
        assertEquals( "CARD_EXP_DATE", fixData.toFIXNameString());
        assertEquals( "CardExpDate", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0490Test() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTA_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag490LmdCardExpDate.TESTB_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTA_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag490LmdCardExpDate.TESTB_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTB_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTB_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTB_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag490LmdCardExpDate tagData;
        String oneElement;

        oneElement = Tag490LmdCardExpDate.TESTA_LMD_CARD_EXP_DATE;
        tagData = new Tag490LmdCardExpDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag490LmdCardExpDate\n" +
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