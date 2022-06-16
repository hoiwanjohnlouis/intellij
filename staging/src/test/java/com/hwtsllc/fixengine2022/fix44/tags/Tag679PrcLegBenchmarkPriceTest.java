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
        assertEquals( "679", fixData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_PRICE", fixData.toFIXNameString());
        assertEquals( "LegBenchmarkPrice", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0679Test() {
        Tag679PrcLegBenchmarkPrice tagData;
        double oneElement;

        oneElement = Tag679PrcLegBenchmarkPrice.TESTA_PRC_LEG_BENCHMARK_PRICE;
        tagData = new Tag679PrcLegBenchmarkPrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "679", tagData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_PRICE", tagData.toFIXNameString());
        assertEquals( "LegBenchmarkPrice", tagData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}