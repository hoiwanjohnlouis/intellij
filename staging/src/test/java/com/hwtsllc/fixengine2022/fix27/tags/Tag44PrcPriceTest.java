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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  44
 *  Price
 *  Price
 *  Price per unit of quantity (e.g. per share)
 */
class Tag44PrcPriceTest {
    @Test
    void FIX0044Test() {
        FIX27 fixData = FIX27.FIX44_PRC_PRICE;
        assertEquals( "PRICE", fixData.toEnumNameString());
        assertEquals( "44", fixData.toEnumIDString());
        assertEquals( "Price", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag44PrcPrice tagData;

        tagData = new Tag44PrcPrice(new MyPriceType(Tag44PrcPrice.TESTB_PRC_PRICE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag44PrcPrice tagData;

        tagData = new Tag44PrcPrice(new MyPriceType(Tag44PrcPrice.TESTB_PRC_PRICE));
        assertEquals( Tag44PrcPrice.TESTB_PRC_PRICE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag44PrcPrice tagData;

        tagData = new Tag44PrcPrice(new MyPriceType(Tag44PrcPrice.TESTB_PRC_PRICE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag44PrcPrice.TESTB_PRC_PRICE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag44PrcPrice tagData;

        tagData = new Tag44PrcPrice(new MyPriceType(Tag44PrcPrice.TESTB_PRC_PRICE));
        assertEquals( String.valueOf(Tag44PrcPrice.TESTB_PRC_PRICE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag44PrcPrice tagData;

        tagData = new Tag44PrcPrice(new MyPriceType(Tag44PrcPrice.TESTA_PRC_PRICE));
        assertEquals( "Tag44PrcPrice\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag44PrcPrice.TESTA_PRC_PRICE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag44PrcPrice.TESTA_PRC_PRICE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}