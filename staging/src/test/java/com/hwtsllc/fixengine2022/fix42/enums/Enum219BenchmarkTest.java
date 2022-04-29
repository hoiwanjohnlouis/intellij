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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum219BenchmarkTest {
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
    void Enum0219Test() {
        Enum219Benchmark enumType;

        /**
         * 1-9 msg types
         */
        enumType = Enum219Benchmark.CURVE;
        assertEquals("1", enumType.getID());
        assertEquals("CURVE", enumType.getName());
        assertEquals("1 - CURVE", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.FIVE_YEAR;
        assertEquals("2", enumType.getID());
        assertEquals("5YR", enumType.getName());
        assertEquals("2 - 5YR", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.OLD_FIVE_YEAR;
        assertEquals("3", enumType.getID());
        assertEquals("OLD5", enumType.getName());
        assertEquals("3 - OLD5", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.TEN_YEAR;
        assertEquals("4", enumType.getID());
        assertEquals("10YR", enumType.getName());
        assertEquals("4 - 10YR", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.OLD_TEN_YEAR;
        assertEquals("5", enumType.getID());
        assertEquals("OLD10", enumType.getName());
        assertEquals("5 - OLD10", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.THIRTY_YEAR;
        assertEquals("6", enumType.getID());
        assertEquals("30YR", enumType.getName());
        assertEquals("6 - 30YR", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.OLD_THIRTY_YEAR;
        assertEquals("7", enumType.getID());
        assertEquals("OLD30", enumType.getName());
        assertEquals("7 - OLD30", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.THREE_MONTH;
        assertEquals("8", enumType.getID());
        assertEquals("3MOLIBOR", enumType.getName());
        assertEquals("8 - 3MOLIBOR", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum219Benchmark.SIX_MONTH;
        assertEquals("9", enumType.getID());
        assertEquals("6MOLIBOR", enumType.getName());
        assertEquals("9 - 6MOLIBOR", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}