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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  222
 *  BenchmarkCurvePoint
 *  String
 *  <p>
 *  Point on benchmark curve.  Free form values:  e.g. "Y", "7Y", "INTERPOLATED".
 *  <p>
 *  Sample values:
 *  <p>
 *  M = combination of a number between 1-12 and a "M" for month
 *  <p>
 *  Y = combination of number between 1-100 and a "Y" for year}
 *  <p>
 *  10Y-OLD = see above, then add "-OLD" when appropriate
 *  <p>
 *  INTERPOLATED = the point is mathematically derived
 *  <p>
 *  2/2031 5 3/8 = the point is stated via a combination of maturity month / year and coupon
 *  <p></p>
 *  See Fixed Income-specific documentation at http://www.fixprotocol.org for additional values.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag222StrBenchmarkCurvePointTest {
    @Test
    void FIX0222Test() {
        FIX42 fixData = FIX42.FIX222_STR_BENCHMARK_CURVE_POINT;
        assertEquals( "222", fixData.toFIXIDString());
        assertEquals( "BENCHMARK_CURVE_POINT", fixData.toFIXNameString());
        assertEquals( "BenchmarkCurvePoint", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0222Test() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTA_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag222StrBenchmarkCurvePoint.TESTB_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTB_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTB_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTB_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTB_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag222StrBenchmarkCurvePoint tagData;
        String oneElement;

        oneElement = Tag222StrBenchmarkCurvePoint.TESTA_STR_BENCHMARK_CURVE_POINT;
        tagData = new Tag222StrBenchmarkCurvePoint( new MyStringType( oneElement ) );
        assertEquals( "Tag222StrBenchmarkCurvePoint\n" +
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