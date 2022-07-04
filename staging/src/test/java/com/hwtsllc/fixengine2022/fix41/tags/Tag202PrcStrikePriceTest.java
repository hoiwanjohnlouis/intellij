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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  202
 *  StrikePrice
 *  Price
 *  <p>
 *  Strike Price for an Option.
 */
class Tag202PrcStrikePriceTest {
    @Test
    void FIX0202Test() {
        FIX41 fixData = FIX41.FIX202_PRC_STRIKE_PRICE;
        assertEquals( "202", fixData.toEnumIDString());
        assertEquals( "STRIKE_PRICE", fixData.toEnumNameString());
        assertEquals( "StrikePrice", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0202Test() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE));
        assertEquals( Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        assertEquals( Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        assertEquals( Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE));
        assertEquals( String.valueOf(Tag202PrcStrikePrice.TESTB_PRC_STRIKE_PRICE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag202PrcStrikePrice tagData;

        tagData = new Tag202PrcStrikePrice(new MyPriceType(Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE));
        assertEquals( "Tag202PrcStrikePrice\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag202PrcStrikePrice.TESTA_PRC_STRIKE_PRICE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}