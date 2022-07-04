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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  220
 *  BenchmarkCurveCurrency
 *  Currency
 *  <p>
 *  Identifies currency used for  benchmark curve.
 *  <p></p>
 *  See "Appendix 6-A: Valid Currency Codes" for information on obtaining valid values.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag220CcyBenchmarkCurveCurrencyTest {
    @Test
    void FIX0220Test() {
        FIX42 fixData = FIX42.FIX220_CCY_BENCHMARK_CURVE_CURRENCY;
        assertEquals( "220", fixData.toEnumIDString());
        assertEquals( "BENCHMARK_CURVE_CURRENCY", fixData.toEnumNameString());
        assertEquals( "BenchmarkCurveCurrency", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0220Test() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag220CcyBenchmarkCurveCurrency\n" +
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