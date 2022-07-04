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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("SUBMIT", enumType.toEnumNameString());
        assertEquals("0 - Submit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("ALLEGED", enumType.toEnumNameString());
        assertEquals("1 - Alleged", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ACCEPT;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("ACCEPT", enumType.toEnumNameString());
        assertEquals("2 - Accept", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.DECLINE;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("DECLINE", enumType.toEnumNameString());
        assertEquals("3 - Decline", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ADDENDUM;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("ADDENDUM", enumType.toEnumNameString());
        assertEquals("4 - Addendum", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum856TradeReportType.NO_WAS;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("NO_WAS", enumType.toEnumNameString());
        assertEquals("5 - No-Was", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.TRADE_REPORT_CANCEL;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("TRADE_REPORT_CANCEL", enumType.toEnumNameString());
        assertEquals("6 - Trade Report Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.LOCKED_IN_TRADE_BREAK;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("LOCKED_IN_TRADE_BREAK", enumType.toEnumNameString());
        assertEquals("7 - (Locked-In) Trade Break", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.DEFAULTED;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("DEFAULTED", enumType.toEnumNameString());
        assertEquals("8 - Defaulted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.INVALID_CMTA;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("INVALID_CMTA", enumType.toEnumNameString());
        assertEquals("9 - Invalid CMTA", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum856TradeReportType.PENDED;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("PENDED", enumType.toEnumNameString());
        assertEquals("10 - Pended", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_NEW;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("ALLEGED_NEW", enumType.toEnumNameString());
        assertEquals("11 - Alleged New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_ADDENDUM;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("ALLEGED_ADDENDUM", enumType.toEnumNameString());
        assertEquals("12 - Alleged Addendum", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_NO_WAS;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("ALLEGED_NO_WAS", enumType.toEnumNameString());
        assertEquals("13 - Alleged No-Was", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("ALLEGED_TRADE_REPORT_CANCEL", enumType.toEnumNameString());
        assertEquals("14 - Alleged Trade Report Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK;
        assertEquals("15", enumType.toEnumIDString());
        assertEquals("ALLEGED_LOCKED_IN_TRADE_BREAK", enumType.toEnumNameString());
        assertEquals("15 - Alleged (Locked-In) Trade Break", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}