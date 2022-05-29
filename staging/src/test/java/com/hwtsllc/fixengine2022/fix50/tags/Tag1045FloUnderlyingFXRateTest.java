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
 *  1045
 *  UnderlyingFXRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute UnderlyingCurrentValue (885) (or market value)
 *  from UnderlyingCurrency (318) to Currency (15).
 */
class Tag1045FloUnderlyingFXRateTest {
    @Test
    void FIX1045Test() {
        FIX50 fixData = FIX50.FIX1045_FLO_UNDERLYING_FX_RATE;
        assertEquals( "1045", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_FX_RATE", fixData.toFIXNameString());
        assertEquals( "UnderlyingFXRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1045Test() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTA_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1045FloUnderlyingFXRate.TESTB_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTA_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1045FloUnderlyingFXRate.TESTB_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTB_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTB_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTB_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1045FloUnderlyingFXRate tagData;
        float oneElement;

        oneElement = Tag1045FloUnderlyingFXRate.TESTA_FLO_UNDERLYING_FX_RATE;
        tagData = new Tag1045FloUnderlyingFXRate( new MyFloatType( oneElement ) );
        assertEquals( "Tag1045FloUnderlyingFXRate\n" +
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