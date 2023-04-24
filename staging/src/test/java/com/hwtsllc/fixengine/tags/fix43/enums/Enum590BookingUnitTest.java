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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  590
 *  BookingUnit
 *  char
 *  <p></p>
 *  Indicates what constitutes a bookable unit.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Each partial execution is a bookable unit
 *  <p>    1 - Aggregate partial executions on this order, and book one trade per order
 *  <p>    2 - Aggregate executions for this symbol, side, and settlement date
 */
class Enum590BookingUnitTest {
    /*
     *  Information is the same for TAGS 590
     */
    @Test
    void Enum0590Test() {
        Enum590BookingUnit enumType;

        /*
         *  0-2 types
         */
        enumType = Enum590BookingUnit.PARTIAL_EXECUTION_BOOKABLE;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("PARTIAL_EXECUTION_BOOKABLE", enumType.toFIXNameString());
        assertEquals("0 - Each partial execution is a bookable unit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum590BookingUnit.AGGREGATE_PARTIAL_EXECUTION;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("AGGREGATE_PARTIAL_EXECUTION", enumType.toFIXNameString());
        assertEquals("1 - Aggregate partial executions on this order, and book one trade per order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum590BookingUnit.AGGREGATE_EXECUTIONS;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("AGGREGATE_EXECUTIONS", enumType.toFIXNameString());
        assertEquals("2 - Aggregate executions for this symbol, side, and settlement date", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}