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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  640
 *  Price2
 *  Price
 *  <p>
 *  Deprecated in FIX.5.0 Price of the future part of a F/X swap order.
 *  <p>
 *  See Price (44) for description.
 */
class Tag640PrcPrice2Test {
    @Test
    void FIX0640Test() {
        FIX43 fixData = FIX43.FIX640_PRC_PRICE_2;
        assertEquals( "640", fixData.toEnumIDString());
        assertEquals( "PRICE_2", fixData.toEnumNameString());
        assertEquals( "Price2", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0640Test() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTA_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag640PrcPrice2.TESTB_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTA_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag640PrcPrice2.TESTB_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTB_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTB_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTB_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag640PrcPrice2 tagData;
        double oneElement;

        oneElement = Tag640PrcPrice2.TESTA_PRC_PRICE_2;
        tagData = new Tag640PrcPrice2( new MyPriceType( oneElement ) );
        assertEquals( "Tag640PrcPrice2\n" +
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