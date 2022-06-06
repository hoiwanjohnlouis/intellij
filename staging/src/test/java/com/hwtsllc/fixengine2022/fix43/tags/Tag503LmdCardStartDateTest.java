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
 *  503
 *  CardStartDate
 *  LocalMktDate
 *  <p>
 *  The start date of the card as specified on the card being used for payment.
 */
class Tag503LmdCardStartDateTest {
    @Test
    void FIX0503Test() {
        FIX43 fixData = FIX43.FIX503_LMD_CARD_START_DATE;
        assertEquals( "503", fixData.toFIXIDString());
        assertEquals( "CARD_START_DATE", fixData.toFIXNameString());
        assertEquals( "CardStartDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0503Test() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTA_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag503LmdCardStartDate.TESTB_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTA_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag503LmdCardStartDate.TESTB_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTB_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTB_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTB_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag503LmdCardStartDate tagData;
        String oneElement;

        oneElement = Tag503LmdCardStartDate.TESTA_LMD_CARD_START_DATE;
        tagData = new Tag503LmdCardStartDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag503LmdCardStartDate\n" +
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