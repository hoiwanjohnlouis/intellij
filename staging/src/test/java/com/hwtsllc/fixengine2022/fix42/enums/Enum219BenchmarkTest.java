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

package com.hwtsllc.fixengine2022.fix42.enums;

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
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("CURVE", enumType.toEnumNameString());
        assertEquals("1 - CURVE", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.FIVE_YEAR;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("5YR", enumType.toEnumNameString());
        assertEquals("2 - 5YR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.OLD_FIVE_YEAR;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("OLD5", enumType.toEnumNameString());
        assertEquals("3 - OLD5", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.TEN_YEAR;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("10YR", enumType.toEnumNameString());
        assertEquals("4 - 10YR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.OLD_TEN_YEAR;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("OLD10", enumType.toEnumNameString());
        assertEquals("5 - OLD10", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.THIRTY_YEAR;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("30YR", enumType.toEnumNameString());
        assertEquals("6 - 30YR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.OLD_THIRTY_YEAR;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("OLD30", enumType.toEnumNameString());
        assertEquals("7 - OLD30", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.THREE_MONTH;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("3MOLIBOR", enumType.toEnumNameString());
        assertEquals("8 - 3MOLIBOR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum219Benchmark.SIX_MONTH;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("6MOLIBOR", enumType.toEnumNameString());
        assertEquals("9 - 6MOLIBOR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}