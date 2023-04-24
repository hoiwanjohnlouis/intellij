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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.enums.fix42.Enum219Benchmark;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag219EnuBenchmarkTest {
    Tag219EnuBenchmark tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( "FIX219_ENU_BENCHMARK", tagData.toFIXLabelString());
            assertEquals( "219", tagData.toFIXIDString());
            assertEquals( "BENCHMARK", tagData.toFIXNameString());
            assertEquals( "Benchmark (no longer used)", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  219
         *  EnuBenchmarkTest
         *  char
         *  <p>    "1 - CURVE"
         *  <p>    "2 - 5YR"
         *  <p>    "3 - OLD5"
         *  <p>    "4 - 10YR"
         *  <p>    "5 - OLD10"
         */
        tagData = new Tag219EnuBenchmark(Enum219Benchmark.CURVE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.FIVE_YEAR);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_FIVE_YEAR);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.TEN_YEAR);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_TEN_YEAR);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "6 - 30YR"
         *  <p>    "7 - OLD30"
         *  <p>    "8 - 3MOLIBOR"
         *  <p>    "9 - 6MOLIBOR"
         */
        tagData = new Tag219EnuBenchmark(Enum219Benchmark.THIRTY_YEAR);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.OLD_THIRTY_YEAR);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.THREE_MONTH);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag219EnuBenchmark(Enum219Benchmark.SIX_MONTH);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            tagData = new Tag219EnuBenchmark(oneEnum);
            assertEquals( "Tag219EnuBenchmark\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}