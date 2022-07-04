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
 *  676
 *  LegBenchmarkCurveCurrency
 *  Currency
 *  <p></p>
 *  LegBenchmarkPrice (679) currency
 *  <p></p>
 *  See BenchmarkCurveCurrency (220) for description and valid values.
 */
class Tag676CcyLegBenchmarkCurveCurrencyTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX676_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        assertEquals( "676", fixData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_CURRENCY", fixData.toEnumNameString());
        assertEquals( "LegBenchmarkCurveCurrency", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0676Test() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTA_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "676", tagData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_CURRENCY", tagData.toEnumNameString());
        assertEquals( "LegBenchmarkCurveCurrency", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTA_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag676CcyLegBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag676CcyLegBenchmarkCurveCurrency.TESTA_CCY_LEG_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag676CcyLegBenchmarkCurveCurrency\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}