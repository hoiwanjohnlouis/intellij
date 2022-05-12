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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum590BookingUnitTest {
    /**
     *  Information is the same for TAGS 590
     */
    @Test
    void Enum0590Test() {
        Enum590BookingUnit enumType;

        /*
         *  0-2 types
         */
        enumType = Enum590BookingUnit.PARTIAL_EXECUTION_BOOKABLE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,PARTIAL_EXECUTION_BOOKABLE,0 - Each partial execution is a bookable unit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum590BookingUnit.AGGREGATE_PARTIAL_EXECUTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,AGGREGATE_PARTIAL_EXECUTION,1 - Aggregate partial executions on this order, and book one trade per order", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum590BookingUnit.AGGREGATE_EXECUTIONS;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,AGGREGATE_EXECUTIONS,2 - Aggregate executions for this symbol, side, and settlement date", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}