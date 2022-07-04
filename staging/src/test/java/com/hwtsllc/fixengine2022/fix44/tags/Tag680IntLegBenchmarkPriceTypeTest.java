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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  680
 *  LegBenchmarkPriceType
 *  int
 *  <p></p>
 *  The price type of the LegBenchmarkPrice.
 *  <p></p>
 *  See BenchmarkPriceType (663) for description and valid values.
 */
class Tag680IntLegBenchmarkPriceTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX680_INT_LEG_BENCHMARK_PRICE_TYPE;
        assertEquals( "680", fixData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_PRICE_TYPE", fixData.toEnumNameString());
        assertEquals( "LegBenchmarkPriceType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0680Test() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTA_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "680", tagData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_PRICE_TYPE", tagData.toEnumNameString());
        assertEquals( "LegBenchmarkPriceType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag680IntLegBenchmarkPriceType.TESTB_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTA_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag680IntLegBenchmarkPriceType.TESTB_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTB_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTB_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTB_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag680IntLegBenchmarkPriceType tagData;
        int oneElement;

        oneElement = Tag680IntLegBenchmarkPriceType.TESTA_INT_LEG_BENCHMARK_PRICE_TYPE;
        tagData = new Tag680IntLegBenchmarkPriceType( new MyIntType( oneElement ) );
        assertEquals( "Tag680IntLegBenchmarkPriceType\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}