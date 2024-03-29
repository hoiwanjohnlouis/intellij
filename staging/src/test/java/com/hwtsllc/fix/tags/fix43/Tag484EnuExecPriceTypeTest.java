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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum484PriceType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag484EnuExecPriceTypeTest {
    Tag484EnuExecPriceType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( "FIX484_ENU_EXEC_PRICE_TYPE", tagData.toFIXLabelString());
            assertEquals( "484", tagData.toFIXIDString());
            assertEquals( "EXEC_PRICE_TYPE", tagData.toFIXNameString());
            assertEquals( "ExecPriceType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  484
         *  ExecPriceType
         *  char
         *  <p>    B - Bid price
         *  <p>    C - Creation price
         *  <p>    D - Creation price plus adjustment percent
         *  <p>    E - Creation price plus adjustment amount
         *  <p>    O - Offer price
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.BID_PRICE );
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE );
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_PERCENT );
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT );
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE );
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    P - Offer price minus adjustment percent
         *  <p>    Q - Offer price minus adjustment amount
         *  <p>    S - Single price
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_PERCENT );
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT );
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.SINGLE_PRICE );
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( "Tag484EnuExecPriceType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}