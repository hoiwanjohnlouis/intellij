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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  969
 *  MinPriceIncrement
 *  float
 *  <p>
 *  Minimum price increase for a given exchange-traded Instrument
 */
class Tag969FloMinPriceIncrementTest {
    @Test
    void FIX0969Test() {
        FIX50 fixData = FIX50.FIX969_FLO_MIN_PRICE_INCREMENT;
        assertEquals( "969", fixData.toFIXIDString());
        assertEquals( "MIN_PRICE_INCREMENT", fixData.toFIXNameString());
        assertEquals( "MinPriceIncrement", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0969Test() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTA_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag969FloMinPriceIncrement.TESTB_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTA_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag969FloMinPriceIncrement.TESTB_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTB_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTB_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTB_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag969FloMinPriceIncrement tagData;
        float oneElement;

        oneElement = Tag969FloMinPriceIncrement.TESTA_FLO_MIN_PRICE_INCREMENT;
        tagData = new Tag969FloMinPriceIncrement( new MyFloatType( oneElement ) );
        assertEquals( "Tag969FloMinPriceIncrement\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement +
                        "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}