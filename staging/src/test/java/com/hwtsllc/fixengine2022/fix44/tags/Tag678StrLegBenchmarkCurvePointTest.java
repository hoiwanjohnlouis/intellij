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
        assertEquals( "678", fixData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_POINT", fixData.toFIXNameString());
        assertEquals( "LegBenchmarkCurvePoint", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0678Test() {
        Tag678StrLegBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag678StrLegBenchmarkCurvePoint.TESTA_STR_LEG_BENCHMARK_CURVE_POINT;
        tagData = new Tag678StrLegBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "678", tagData.toFIXIDString());
        assertEquals( "LEG_BENCHMARK_CURVE_POINT", tagData.toFIXNameString());
        assertEquals( "LegBenchmarkCurvePoint", tagData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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