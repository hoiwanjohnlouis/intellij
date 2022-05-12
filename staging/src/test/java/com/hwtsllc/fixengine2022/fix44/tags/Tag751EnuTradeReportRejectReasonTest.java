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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum751TradeReportRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag751EnuTradeReportRejectReasonTest {
    @Test
    void FIX0751Test() {
        FIX44 fixData = FIX44.FIX751_ENU_TRADE_REPORT_REJECT_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0751Test() {
        Log751EnuTradeReportRejectReason tagData;

        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.SUCCESSFUL);
        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION);
        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT);
        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES);
        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_TRADE_TYPE);
        tagData = new Log751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.OTHER);
    }
}