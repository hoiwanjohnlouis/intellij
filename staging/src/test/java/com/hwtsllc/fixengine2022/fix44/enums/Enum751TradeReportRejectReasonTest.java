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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum751TradeReportRejectReasonTest {
    /**
     *  751
     *  TradeReportRejectReason
     *  Reason Trade Capture Request was rejected.
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Successful (default)
     *      1 - Invalid party information
     *      2 - Unknown instrument
     *      3 - Unauthorized to report trades
     *      4 - Invalid trade type
     *      99 - Other
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void EnumTest() {
        Enum751TradeReportRejectReason enumType;

        enumType = Enum751TradeReportRejectReason.SUCCESSFUL;
        assertEquals( "0", enumType.getID());
        assertEquals( "SUCCESSFUL", enumType.getName());
        assertEquals( "0 - Successful (default)", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION;
        assertEquals( "1", enumType.getID());
        assertEquals( "INVALID_PARTY_INFORMATION", enumType.getName());
        assertEquals( "1 - Invalid party information", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT;
        assertEquals( "2", enumType.getID());
        assertEquals( "UNKNOWN_INSTRUMENT", enumType.getName());
        assertEquals( "2 - Unknown instrument", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES;
        assertEquals( "3", enumType.getID());
        assertEquals( "UNAUTHORIZED_TO_REPORT_TRADES", enumType.getName());
        assertEquals( "3 - Unauthorized to report trades", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum751TradeReportRejectReason.INVALID_TRADE_TYPE;
        assertEquals( "4", enumType.getID());
        assertEquals( "INVALID_TRADE_TYPE", enumType.getName());
        assertEquals( "4 - Invalid trade type", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum751TradeReportRejectReason.OTHER;
        assertEquals( "99", enumType.getID());
        assertEquals( "OTHER", enumType.getName());
        assertEquals( "99 - Other", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}