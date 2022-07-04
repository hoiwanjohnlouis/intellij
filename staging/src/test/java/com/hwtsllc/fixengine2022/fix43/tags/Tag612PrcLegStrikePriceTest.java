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
 *  612
 *  LegStrikePrice
 *  Price
 *  <p>
 *  Multileg instrument's individual  security’s StrikePrice.
 *  <p>
 *  See StrikePrice (202) field for description
 */
class Tag612PrcLegStrikePriceTest {
    @Test
    void FIX0612Test() {
        FIX43 fixData = FIX43.FIX612_PRC_LEG_STRIKE_PRICE;
        assertEquals( "612", fixData.toEnumIDString());
        assertEquals( "LEG_STRIKE_PRICE", fixData.toEnumNameString());
        assertEquals( "LegStrikePrice", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0612Test() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTA_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag612PrcLegStrikePrice.TESTB_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTA_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag612PrcLegStrikePrice.TESTB_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTB_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTB_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTB_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag612PrcLegStrikePrice tagData;
        double oneElement;

        oneElement = Tag612PrcLegStrikePrice.TESTA_PRC_LEG_STRIKE_PRICE;
        tagData = new Tag612PrcLegStrikePrice( new MyPriceType( oneElement ) );
        assertEquals( "Tag612PrcLegStrikePrice\n" +
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