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
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag556CcyLegCurrency;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  556
 *  LegCurrency
 *  Currency
 *  <p>
 *  Currency associated with a particular Leg's quantity
 */
class Tag556CcyLegCurrencyTest {
    @Test
    void FIX0556Test() {
        FIX43 fixData = FIX43.FIX556_CCY_LEG_CURRENCY;
        assertEquals( "556", fixData.toFIXIDString());
        assertEquals( "LEG_CURRENCY", fixData.toFIXNameString());
        assertEquals( "LegCurrency", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0556Test() {
        Tag556CcyLegCurrency tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag556CcyLegCurrency tagData;
        String oneElement;

        oneElement = Tag556CcyLegCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag556CcyLegCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag556CcyLegCurrency tagData;
        String oneElement;

        oneElement = Tag556CcyLegCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag556CcyLegCurrency tagData;
        String oneElement;

        oneElement = Tag556CcyLegCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag556CcyLegCurrency tagData;
        String oneElement;

        oneElement = Tag556CcyLegCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag556CcyLegCurrency tagData;
        String oneElement;

        oneElement = Tag556CcyLegCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag556CcyLegCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag556CcyLegCurrency\n" +
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