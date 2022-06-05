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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag657FloSettlCurrOfferFxRate;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  657
 *  SettlCurrOfferFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute the offer "SettlCurrAmt" (119) from Currency (15) to SettlCurrency (120)
 */
class Tag657FloSettlCurrOfferFxRateTest {
    @Test
    void FIX0657Test() {
        FIX43 fixData = FIX43.FIX657_FLO_SETTL_CURR_OFFER_FX_RATE;
        assertEquals( "657", fixData.toFIXIDString());
        assertEquals( "SETTL_CURR_OFFER_FX_RATE", fixData.toFIXNameString());
        assertEquals( "SettlCurrOfferFxRate", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0657Test() {
        Tag657FloSettlCurrOfferFxRate tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag657FloSettlCurrOfferFxRate tagData;
        float oneElement;

        oneElement = Tag657FloSettlCurrOfferFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag657FloSettlCurrOfferFxRate tagData;
        float oneElement;

        oneElement = Tag657FloSettlCurrOfferFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag657FloSettlCurrOfferFxRate tagData;
        float oneElement;

        oneElement = Tag657FloSettlCurrOfferFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag657FloSettlCurrOfferFxRate tagData;
        float oneElement;

        oneElement = Tag657FloSettlCurrOfferFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag657FloSettlCurrOfferFxRate tagData;
        float oneElement;

        oneElement = Tag657FloSettlCurrOfferFxRate.TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ) );
        assertEquals( "Tag657FloSettlCurrOfferFxRate\n" +
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