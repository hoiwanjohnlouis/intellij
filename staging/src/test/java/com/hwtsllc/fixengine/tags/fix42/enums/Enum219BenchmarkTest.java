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

package com.hwtsllc.fixengine.tags.fix42.enums;

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
class Enum219BenchmarkTest {
    @Test
    void Enum0219Test() {
        Enum219Benchmark enumType;

        /*
         * 1-9 msg types
         */
        enumType = Enum219Benchmark.CURVE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CURVE", enumType.toFIXNameString());
        assertEquals("1 - CURVE", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.FIVE_YEAR;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("5YR", enumType.toFIXNameString());
        assertEquals("2 - 5YR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.OLD_FIVE_YEAR;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("OLD5", enumType.toFIXNameString());
        assertEquals("3 - OLD5", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.TEN_YEAR;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("10YR", enumType.toFIXNameString());
        assertEquals("4 - 10YR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.OLD_TEN_YEAR;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("OLD10", enumType.toFIXNameString());
        assertEquals("5 - OLD10", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.THIRTY_YEAR;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("30YR", enumType.toFIXNameString());
        assertEquals("6 - 30YR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.OLD_THIRTY_YEAR;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("OLD30", enumType.toFIXNameString());
        assertEquals("7 - OLD30", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.THREE_MONTH;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("3MOLIBOR", enumType.toFIXNameString());
        assertEquals("8 - 3MOLIBOR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum219Benchmark.SIX_MONTH;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("6MOLIBOR", enumType.toFIXNameString());
        assertEquals("9 - 6MOLIBOR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}