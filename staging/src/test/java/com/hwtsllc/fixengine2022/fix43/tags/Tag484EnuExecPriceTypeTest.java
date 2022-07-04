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
import com.hwtsllc.fixengine2022.fix43.enums.Enum484PriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  484
 *  ExecPriceType
 *  char
 *  <p></p>
 *  For CIV - Identifies how the execution price LastPx (31)
 *  was calculated from the fund unit/share price(s) calculated
 *  at the fund valuation point.
 *  <p></p>
 *  Valid values:
 *  <p>    B - Bid price
 *  <p>    C - Creation price
 *  <p>    D - Creation price plus adjustment percent
 *  <p>    E - Creation price plus adjustment amount
 *  <p>    O - Offer price
 *  <p></p>
 *  <p>    P - Offer price minus adjustment percent
 *  <p>    Q - Offer price minus adjustment amount
 *  <p>    S - Single price
 */
class Tag484EnuExecPriceTypeTest {
    @Test
    void FIX0484Test() {
        FIX43 fixData = FIX43.FIX484_ENU_EXEC_PRICE_TYPE;
        assertEquals( "484", fixData.toEnumIDString());
        assertEquals( "EXEC_PRICE_TYPE", fixData.toEnumNameString());
        assertEquals( "ExecPriceType", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0484Test() {
        Tag484EnuExecPriceType tagData;

        /*
         *  B, C, D, E, O, P, Q, and S types
         */


        /*
         *  B, C, D, E, types
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.BID_PRICE );
        assertEquals( Enum484PriceType.BID_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE );
        assertEquals( Enum484PriceType.CREATION_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_PERCENT );
        assertEquals( Enum484PriceType.CREATION_PRICE_PLUS_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT );
        assertEquals( Enum484PriceType.CREATION_PRICE_PLUS_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * O, P, Q, and S types
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE );
        assertEquals( Enum484PriceType.OFFER_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_PERCENT );
        assertEquals( Enum484PriceType.OFFER_PRICE_MINUS_PERCENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag484EnuExecPriceType( Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT );
        assertEquals( Enum484PriceType.OFFER_PRICE_MINUS_AMOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  S type
         */
        tagData = new Tag484EnuExecPriceType( Enum484PriceType.SINGLE_PRICE );
        assertEquals( Enum484PriceType.SINGLE_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag484EnuExecPriceType tagData;

        // loop around the ENUM and process
        for ( Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag484EnuExecPriceType tagData;

        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag484EnuExecPriceType tagData;

        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag484EnuExecPriceType tagData;

        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag484EnuExecPriceType tagData;

        // loop around the ENUM and process
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            tagData = new Tag484EnuExecPriceType(oneEnum);
            assertEquals( "Tag484EnuExecPriceType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}