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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum219Benchmark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag219EnuBenchmarkTest {
    @Test
    void FIX0219Test() {
        FIX42 fixData = FIX42.FIX219_ENU_BENCHMARK;
        assertEquals( "219", fixData.getID());
        assertEquals( "BENCHMARK", fixData.getName());
        assertEquals( "Benchmark", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  219
     *  EnuBenchmarkTest
     *      1-9 msg types
     *      "1 - CURVE"
     *      "2 - 5YR"
     *      "3 - OLD5"
     *      "4 - 10YR"
     *      "5 - OLD10"
     *      "6 - 30YR"
     *      "7 - OLD30"
     *      "8 - 3MOLIBOR"
     *      "9 - 6MOLIBOR"
     */
    @Test
    void Tag0219Test() {
        Log219EnuBenchmark tagData;

        /**
         * 1-9 msg types
         */
        tagData = new Log219EnuBenchmark(Enum219Benchmark.CURVE);
        assertEquals( Enum219Benchmark.CURVE.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.FIVE_YEAR);
        assertEquals( Enum219Benchmark.FIVE_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.OLD_FIVE_YEAR);
        assertEquals( Enum219Benchmark.OLD_FIVE_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.TEN_YEAR);
        assertEquals( Enum219Benchmark.TEN_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.OLD_TEN_YEAR);
        assertEquals( Enum219Benchmark.OLD_TEN_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.THIRTY_YEAR);
        assertEquals( Enum219Benchmark.THIRTY_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.OLD_THIRTY_YEAR);
        assertEquals( Enum219Benchmark.OLD_THIRTY_YEAR.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.THREE_MONTH);
        assertEquals( Enum219Benchmark.THREE_MONTH.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log219EnuBenchmark(Enum219Benchmark.SIX_MONTH);
        assertEquals( Enum219Benchmark.SIX_MONTH.getID(),
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}