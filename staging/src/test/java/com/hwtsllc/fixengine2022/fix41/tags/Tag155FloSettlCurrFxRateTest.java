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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  155
 *  SettlCurrFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute SettlCurrAmt (9) from Currency (5) to SettlCurrency (20)
 */
class Tag155FloSettlCurrFxRateTest {
    @Test
    void FIX0155Test() {
        FIX41 fixData = FIX41.FIX155_FLO_SETTL_CURR_FX_RATE;
        assertEquals( "155", fixData.toFIXIDString());
        assertEquals( "SETTL_CURR_FX_RATE", fixData.toFIXNameString());
        assertEquals( "SettlCurrFxRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0155Test() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE));
        assertEquals( Tag155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        assertEquals( Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        assertEquals( Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        assertEquals( tagData.toFIXIDString() + "=" + Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE));
        assertEquals( String.valueOf(Tag155FloSettlCurrFxRate.TESTB_FLO_SETTL_CURR_FX_RATE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag155FloSettlCurrFxRate tagData;
        float oneElement;

        tagData = new Tag155FloSettlCurrFxRate(new MyFloatType(Tag155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE));
        assertEquals( "Tag155FloSettlCurrFxRate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag155FloSettlCurrFxRate.TESTA_FLO_SETTL_CURR_FX_RATE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}