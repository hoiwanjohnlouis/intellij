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

import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  220
 *  BenchmarkCurveCurrency
 *  Currency
 *  <p></p>
 *  Identifies currency used for  benchmark curve.
 *  <p></p>
 *  See "Appendix 6-A: Valid Currency Codes" for information on obtaining valid values.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag220CcyBenchmarkCurveCurrencyTest {
    @Test
    void PrintTest() {
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
    void FIXTagTest() {
        Tag220CcyBenchmarkCurveCurrency tagData;
        String oneElement;

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTA_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag220CcyBenchmarkCurveCurrency.TESTB_CCY_BENCHMARK_CURVE_CURRENCY;
        tagData = new Tag220CcyBenchmarkCurveCurrency( new MyCurrencyType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag220CcyBenchmarkCurveCurrency tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag220CcyBenchmarkCurveCurrency tagData ) {
        assertEquals( "FIX220_CCY_BENCHMARK_CURVE_CURRENCY", tagData.toEnumLabelString());
        assertEquals( "220", tagData.toEnumIDString());
        assertEquals( "BENCHMARK_CURVE_CURRENCY", tagData.toEnumNameString());
        assertEquals( "BenchmarkCurveCurrency", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag220CcyBenchmarkCurveCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag220CcyBenchmarkCurveCurrency tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag220CcyBenchmarkCurveCurrency tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag220CcyBenchmarkCurveCurrency tagData ) {
        assertEquals( "Tag220CcyBenchmarkCurveCurrency\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}