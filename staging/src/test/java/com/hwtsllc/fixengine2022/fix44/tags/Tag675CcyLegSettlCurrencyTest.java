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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  675
 *  LegSettlCurrency
 *  Currency
 *  <p></p>
 *  Identifies settlement currency for the Leg.
 *  <p></p>
 *  See SettlCurrency (20) for description and valid values
 */
class Tag675CcyLegSettlCurrencyTest {
    @Test
    void FIX0675Test() {
        FIX44 fixData = FIX44.FIX675_CCY_LEG_SETTL_CURRENCY;
        assertEquals( "675", fixData.toFIXIDString());
        assertEquals( "LEG_SETTL_CURRENCY", fixData.toFIXNameString());
        assertEquals( "LegSettlCurrency", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0675Test() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTA_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag675CcyLegSettlCurrency.TESTB_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTA_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag675CcyLegSettlCurrency.TESTB_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTB_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTB_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTB_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag675CcyLegSettlCurrency tagData;
        String oneElement;

        oneElement = Tag675CcyLegSettlCurrency.TESTA_CCY_LEG_SETTL_CURRENCY;
        tagData = new Tag675CcyLegSettlCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag675CcyLegSettlCurrency\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}