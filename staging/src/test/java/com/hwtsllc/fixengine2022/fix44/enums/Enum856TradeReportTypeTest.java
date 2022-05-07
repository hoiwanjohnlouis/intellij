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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  856
 *  TradeReportType
 *  int
 *  Type of Trade Report
 *  Valid values:
 *      0 - Submit
 *      1 - Alleged
 *      2 - Accept
 *      3 - Decline
 *      4 - Addendum
 *      5 - No-Was
 *      6 - Trade Report Cancel
 *      7 - (Locked-In) Trade Break
 *      8 - Defaulted
 *      9 - Invalid CMTA
 *      10 - Pended
 *      11 - Alleged New
 *      12 - Alleged Addendum
 *      13 - Alleged No-Was
 *      14 - Alleged Trade Report Cancel
 *      15 - Alleged (Locked-In) Trade Break
 */
class Enum856TradeReportTypeTest {
    @Test
    void EnumTest() {
        Enum856TradeReportType enumType;

        enumType = Enum856TradeReportType.SUBMIT;
        assertEquals("0", enumType.getID());
        assertEquals("SUBMIT", enumType.getName());
        assertEquals("0 - Submit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ALLEGED;
        assertEquals("1", enumType.getID());
        assertEquals("ALLEGED", enumType.getName());
        assertEquals("1 - Alleged", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ACCEPT;
        assertEquals("2", enumType.getID());
        assertEquals("ACCEPT", enumType.getName());
        assertEquals("2 - Accept", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.DECLINE;
        assertEquals("3", enumType.getID());
        assertEquals("DECLINE", enumType.getName());
        assertEquals("3 - Decline", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ADDENDUM;
        assertEquals("4", enumType.getID());
        assertEquals("ADDENDUM", enumType.getName());
        assertEquals("4 - Addendum", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum856TradeReportType.NO_WAS;
        assertEquals("5", enumType.getID());
        assertEquals("NO_WAS", enumType.getName());
        assertEquals("5 - No-Was", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.TRADE_REPORT_CANCEL;
        assertEquals("6", enumType.getID());
        assertEquals("TRADE_REPORT_CANCEL", enumType.getName());
        assertEquals("6 - Trade Report Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.LOCKED_IN_TRADE_BREAK;
        assertEquals("7", enumType.getID());
        assertEquals("LOCKED_IN_TRADE_BREAK", enumType.getName());
        assertEquals("7 - (Locked-In) Trade Break", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.DEFAULTED;
        assertEquals("8", enumType.getID());
        assertEquals("DEFAULTED", enumType.getName());
        assertEquals("8 - Defaulted", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.INVALID_CMTA;
        assertEquals("9", enumType.getID());
        assertEquals("INVALID_CMTA", enumType.getName());
        assertEquals("9 - Invalid CMTA", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum856TradeReportType.PENDED;
        assertEquals("10", enumType.getID());
        assertEquals("PENDED", enumType.getName());
        assertEquals("10 - Pended", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ALLEGED_NEW;
        assertEquals("11", enumType.getID());
        assertEquals("ALLEGED_NEW", enumType.getName());
        assertEquals("11 - Alleged New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ALLEGED_ADDENDUM;
        assertEquals("12", enumType.getID());
        assertEquals("ALLEGED_ADDENDUM", enumType.getName());
        assertEquals("12 - Alleged Addendum", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ALLEGED_NO_WAS;
        assertEquals("13", enumType.getID());
        assertEquals("ALLEGED_NO_WAS", enumType.getName());
        assertEquals("13 - Alleged No-Was", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL;
        assertEquals("14", enumType.getID());
        assertEquals("ALLEGED_TRADE_REPORT_CANCEL", enumType.getName());
        assertEquals("14 - Alleged Trade Report Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK;
        assertEquals("15", enumType.getID());
        assertEquals("ALLEGED_LOCKED_IN_TRADE_BREAK", enumType.getName());
        assertEquals("Alleged (Locked-In) Trade Break", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}