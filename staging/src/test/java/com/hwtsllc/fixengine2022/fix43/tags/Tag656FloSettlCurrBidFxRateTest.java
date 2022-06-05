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
import com.hwtsllc.fixengine2022.fix42.tags.Tag656FloSettlCurrBidFxRate;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  656
 *  SettlCurrBidFxRate
 *  float
 *  <p>
 *  Foreign exchange rate used to compute the bid "SettlCurrAmt" (119) from Currency (15) to SettlCurrency (120)
 */
class Tag656FloSettlCurrBidFxRateTest {
    @Test
    void FIX0656Test() {
        FIX43 fixData = FIX43.FIX656_FLO_SETTL_CURR_BID_FX_RATE;
        assertEquals( "656", fixData.toFIXIDString());
        assertEquals( "SETTL_CURR_BID_FX_RATE", fixData.toFIXNameString());
        assertEquals( "SettlCurrBidFxRate", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0656Test() {
        Tag656FloSettlCurrBidFxRate tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag656FloSettlCurrBidFxRate tagData;
        float oneElement;

        oneElement = Tag656FloSettlCurrBidFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag656FloSettlCurrBidFxRate( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag656FloSettlCurrBidFxRate tagData;
        float oneElement;

        oneElement = Tag656FloSettlCurrBidFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag656FloSettlCurrBidFxRate( new MyFloatType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag656FloSettlCurrBidFxRate tagData;
        float oneElement;

        oneElement = Tag656FloSettlCurrBidFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag656FloSettlCurrBidFxRate( new MyFloatType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag656FloSettlCurrBidFxRate tagData;
        float oneElement;

        oneElement = Tag656FloSettlCurrBidFxRate.TESTB_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag656FloSettlCurrBidFxRate( new MyFloatType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag656FloSettlCurrBidFxRate tagData;
        float oneElement;

        oneElement = Tag656FloSettlCurrBidFxRate.TESTA_FLO_UNDERLYING_CONTRACT_MULTIPLIER;
        tagData = new Tag656FloSettlCurrBidFxRate( new MyFloatType( oneElement ) );
        assertEquals( "Tag656FloSettlCurrBidFxRate\n" +
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