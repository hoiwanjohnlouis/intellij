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
import com.hwtsllc.fixengine2022.fix42.enums.Enum219Benchmark;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  219
 *  EnuBenchmarkTest
 *  char
 *  <p>
 *  Deprecated in FIX.4.2 For Fixed Income.
 *  <p>
 *  Identifies the benchmark (e.g. used in conjunction with the Spread field).
 *  <p></p>
 *  Valid values:
 *  <p>    "1 - CURVE"
 *  <p>    "2 - 5YR"
 *  <p>    "3 - OLD5"
 *  <p>    "4 - 10YR"
 *  <p>    "5 - OLD10"
 *  <p></p>
 *  <p>    "6 - 30YR"
 *  <p>    "7 - OLD30"
 *  <p>    "8 - 3MOLIBOR"
 *  <p>    "9 - 6MOLIBOR"
 */
// @Deprecated
class Tag219EnuBenchmarkTest {
    @Test
    void FIX0219Test() {
        FIX42 fixData = FIX42.FIX219_ENU_BENCHMARK;
        assertEquals( "219", fixData.toEnumIDString());
        assertEquals( "BENCHMARK", fixData.toEnumNameString());
        assertEquals( "Benchmark (no longer used)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0219Test() {
        Tag219EnuBenchmark tagData;

        /*
         * 1-9 msg types
         */
        tagData = new Tag219EnuBenchmark(Enum219Benchmark.CURVE);
        assertEquals( Enum219Benchmark.CURVE.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.FIVE_YEAR);
        assertEquals( Enum219Benchmark.FIVE_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_FIVE_YEAR);
        assertEquals( Enum219Benchmark.OLD_FIVE_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.TEN_YEAR);
        assertEquals( Enum219Benchmark.TEN_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_TEN_YEAR);
        assertEquals( Enum219Benchmark.OLD_TEN_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.THIRTY_YEAR);
        assertEquals( Enum219Benchmark.THIRTY_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_THIRTY_YEAR);
        assertEquals( Enum219Benchmark.OLD_THIRTY_YEAR.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.THREE_MONTH);
        assertEquals( Enum219Benchmark.THREE_MONTH.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.SIX_MONTH);
        assertEquals( Enum219Benchmark.SIX_MONTH.toEnumIDString(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag219EnuBenchmark tagData;

        // loop around the ENUM and process
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag219EnuBenchmark tagData;

        // loop around the ENUM and process
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag219EnuBenchmark tagData;

        // loop around the ENUM and process
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag219EnuBenchmark tagData;

        // loop around the ENUM and process
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag219EnuBenchmark tagData;

        // loop around the ENUM and process
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( "Tag219EnuBenchmark\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}