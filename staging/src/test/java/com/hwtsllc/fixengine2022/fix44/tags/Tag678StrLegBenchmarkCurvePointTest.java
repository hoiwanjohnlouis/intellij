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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  678
 *  LegBenchmarkCurvePoint
 *  String
 *  <p></p>
 *  Identifies the point on the Leg Benchmark Curve.
 *  <p></p>
 *  See BenchmarkCurvePoint (222) for description and valid values.
 */
class Tag678StrLegBenchmarkCurvePointTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX678_STR_LEG_BENCHMARK_CURVE_POINT;
        assertEquals( "678", fixData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_POINT", fixData.toEnumNameString());
        assertEquals( "LegBenchmarkCurvePoint", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0678Test() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTA_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "678", tagData.toEnumIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_POINT", tagData.toEnumNameString());
        assertEquals( "LegBenchmarkCurvePoint", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTB_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTA_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTB_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTB_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTB_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTB_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTA_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( "Tag678StrLegBenchmarkCurvePoint\n" +
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