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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  679
 *  LegBenchmarkPrice
 *  Price
 *  <p></p>
 *  Used to identify the price of the benchmark security.
 *  <p></p>
 *  See BenchmarkPrice (662) for description and valid values.
 */
class Tag679PrcLegBenchmarkPriceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX679_PRC_LEG_BENCHMARK_PRICE;
        assertEquals( "679", fixData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_PRICE", fixData.toEnumNameString());
        assertEquals( "LegBenchmarkPrice", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0679Test() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTA_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "679", tagData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_PRICE", tagData.toEnumNameString());
        assertEquals( "LegBenchmarkPrice", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag679PrcLegBenchmarkPrice.TESTB_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTA_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag679PrcLegBenchmarkPrice.TESTB_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTB_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTB_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTB_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTA_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( "Tag679PrcLegBenchmarkPrice\n" +
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