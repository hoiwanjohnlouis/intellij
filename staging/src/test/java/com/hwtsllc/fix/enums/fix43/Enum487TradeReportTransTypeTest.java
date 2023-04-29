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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  487
 *  TradeReportTransType
 *  int
 *  <p></p>
 *  Identifies Trade Report message transaction type
 *  <p></p>
 *  (Prior to FIX 4.4 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Cancel
 *  <p>    2 - Replace
 *  <p>    3 - Release
 *  <p>    4 - Reverse
 *  <p></p>
 *  <p>    5 - Cancel Due To Back Out of Trade
 */
class Enum487TradeReportTransTypeTest {
    /*
     *  Information is the same for TAGS 487
     */
    @Test
    void Enum0487Test() {
        Enum487TradeReportTransType enumType;

        /*
         * 0-5 types
         */
        enumType = Enum487TradeReportTransType.NEW;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toFIXNameString());
        assertEquals("0 - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum487TradeReportTransType.CANCEL;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toFIXNameString());
        assertEquals("1 - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum487TradeReportTransType.REPLACE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toFIXNameString());
        assertEquals("2 - Replace", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum487TradeReportTransType.RELEASE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("RELEASE", enumType.toFIXNameString());
        assertEquals("3 - Release", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum487TradeReportTransType.REVERSE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("REVERSE", enumType.toFIXNameString());
        assertEquals("4 - Reverse", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("CANCEL_BACK_OUT_TRADE", enumType.toFIXNameString());
        assertEquals("5 - Cancel Due To Back Out of Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}