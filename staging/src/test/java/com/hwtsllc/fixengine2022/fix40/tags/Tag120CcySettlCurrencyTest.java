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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  120
 *  SettlCurrency
 *  Currency
 *  Currency code of settlement denomination.
 */
class Tag120CcySettlCurrencyTest {
    @Test
    void FIX0120Test() {
        FIX40 fixData = FIX40.FIX120_CCY_SETTL_CURRENCY;
        assertEquals( "SETTL_CURRENCY", fixData.toEnumNameString());
        assertEquals( "120", fixData.toEnumIDString());
        assertEquals( "SettlCurrency", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0120Test() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType("MoonChaeWon-120SettlCurrency") );
        assertEquals( "MoonChaeWon-120SettlCurrency", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType(Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType(Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY));
        assertEquals( Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType(Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY));
        assertEquals( tagData.toEnumIDString() + "=" + Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType(Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY));
        assertEquals( Tag120CcySettlCurrency.TESTB_CCY_SETTL_CURRENCY,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag120CcySettlCurrency tagData;

        tagData = new Tag120CcySettlCurrency(new MyCurrencyType(Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY));
        assertEquals( "Tag120CcySettlCurrency\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag120CcySettlCurrency.TESTA_CCY_SETTL_CURRENCY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}