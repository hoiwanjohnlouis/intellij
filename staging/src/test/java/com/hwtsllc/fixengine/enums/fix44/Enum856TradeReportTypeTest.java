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

package com.hwtsllc.fixengine.enums.fix44;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  856
 *  TradeReportType
 *  int
 *  <p></p>
 *  Type of Trade Report
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submit
 *  <p>    1 - Alleged
 *  <p>    2 - Accept
 *  <p>    3 - Decline
 *  <p>    4 - Addendum
 *  <p></p>
 *  <p>    5 - No-Was
 *  <p>    6 - Trade Report Cancel
 *  <p>    7 - (Locked-In) Trade Break
 *  <p>    8 - Defaulted
 *  <p>    9 - Invalid CMTA
 *  <p></p>
 *  <p>    10 - Pended
 *  <p>    11 - Alleged New
 *  <p>    12 - Alleged Addendum
 *  <p>    13 - Alleged No-Was
 *  <p>    14 - Alleged Trade Report Cancel
 *  <p></p>
 *  <p>    15 - Alleged (Locked-In) Trade Break
 */
class Enum856TradeReportTypeTest {
    @Test
    void EnumTest() {
        Enum856TradeReportType enumType;

        enumType = Enum856TradeReportType.SUBMIT;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("SUBMIT", enumType.toFIXNameString());
        assertEquals("0 - Submit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("ALLEGED", enumType.toFIXNameString());
        assertEquals("1 - Alleged", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ACCEPT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ACCEPT", enumType.toFIXNameString());
        assertEquals("2 - Accept", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.DECLINE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("DECLINE", enumType.toFIXNameString());
        assertEquals("3 - Decline", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ADDENDUM;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("ADDENDUM", enumType.toFIXNameString());
        assertEquals("4 - Addendum", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum856TradeReportType.NO_WAS;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("NO_WAS", enumType.toFIXNameString());
        assertEquals("5 - No-Was", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.TRADE_REPORT_CANCEL;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("TRADE_REPORT_CANCEL", enumType.toFIXNameString());
        assertEquals("6 - Trade Report Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.LOCKED_IN_TRADE_BREAK;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("LOCKED_IN_TRADE_BREAK", enumType.toFIXNameString());
        assertEquals("7 - (Locked-In) Trade Break", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.DEFAULTED;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("DEFAULTED", enumType.toFIXNameString());
        assertEquals("8 - Defaulted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.INVALID_CMTA;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("INVALID_CMTA", enumType.toFIXNameString());
        assertEquals("9 - Invalid CMTA", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum856TradeReportType.PENDED;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("PENDED", enumType.toFIXNameString());
        assertEquals("10 - Pended", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_NEW;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("ALLEGED_NEW", enumType.toFIXNameString());
        assertEquals("11 - Alleged New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_ADDENDUM;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("ALLEGED_ADDENDUM", enumType.toFIXNameString());
        assertEquals("12 - Alleged Addendum", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_NO_WAS;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("ALLEGED_NO_WAS", enumType.toFIXNameString());
        assertEquals("13 - Alleged No-Was", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("ALLEGED_TRADE_REPORT_CANCEL", enumType.toFIXNameString());
        assertEquals("14 - Alleged Trade Report Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("ALLEGED_LOCKED_IN_TRADE_BREAK", enumType.toFIXNameString());
        assertEquals("15 - Alleged (Locked-In) Trade Break", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}