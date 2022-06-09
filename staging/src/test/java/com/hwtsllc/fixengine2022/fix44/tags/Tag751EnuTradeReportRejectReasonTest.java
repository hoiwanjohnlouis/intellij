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
import com.hwtsllc.fixengine2022.fix44.enums.Enum751TradeReportRejectReason;
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
class Tag751EnuTradeReportRejectReasonTest {
    @Test
    void FIX0751Test() {
        FIX44 fixData = FIX44.FIX751_ENU_TRADE_REPORT_REJECT_REASON;
        assertEquals( "751", fixData.toFIXIDString());
        assertEquals( "TRADE_REPORT_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "TradeReportRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0751Test() {
        Tag751EnuTradeReportRejectReason tagData;

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.SUCCESSFUL);
        assertEquals( Enum751TradeReportRejectReason.SUCCESSFUL.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION);
        assertEquals( Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT);
        assertEquals( Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES);
        assertEquals( Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_TRADE_TYPE);
        assertEquals( Enum751TradeReportRejectReason.INVALID_TRADE_TYPE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.OTHER);
        assertEquals( Enum751TradeReportRejectReason.OTHER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}