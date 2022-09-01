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
 *  751
 *  TradeReportRejectReason
 *  int
 *  <p></p>
 *  Reason Trade Capture Request was rejected.
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid party information
 *  <p>    2 - Unknown instrument
 *  <p>    3 - Unauthorized to report trades
 *  <p>    4 - Invalid trade type
 *  <p></p>
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum751TradeReportRejectReasonTest {
    @Test
    void EnumTest() {
        Enum751TradeReportRejectReason enumType;

        enumType = Enum751TradeReportRejectReason.SUCCESSFUL;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "SUCCESSFUL", enumType.toFIXNameString());
        assertEquals( "0 - Successful (default)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "INVALID_PARTY_INFORMATION", enumType.toFIXNameString());
        assertEquals( "1 - Invalid party information", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_INSTRUMENT", enumType.toFIXNameString());
        assertEquals( "2 - Unknown instrument", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "UNAUTHORIZED_TO_REPORT_TRADES", enumType.toFIXNameString());
        assertEquals( "3 - Unauthorized to report trades", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum751TradeReportRejectReason.INVALID_TRADE_TYPE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "INVALID_TRADE_TYPE", enumType.toFIXNameString());
        assertEquals( "4 - Invalid trade type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum751TradeReportRejectReason.OTHER;
        assertEquals( "99", enumType.toFIXIDString());
        assertEquals( "OTHER", enumType.toFIXNameString());
        assertEquals( "99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}