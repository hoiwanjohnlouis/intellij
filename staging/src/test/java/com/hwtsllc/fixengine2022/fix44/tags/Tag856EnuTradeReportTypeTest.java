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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum856TradeReportType;
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
 *      5 - No/Was
 *      6 - Trade Report Cancel
 *      7 - (Locked-In) Trade Break
 *      8 - Defaulted
 *      9 - Invalid CMTA
 *      10 - Pended
 *      11 - Alleged New
 *      12 - Alleged Addendum
 *      13 - Alleged No/Was
 *      14 - Alleged Trade Report Cancel
 *      15 - Alleged (Locked-In) Trade Break
 */
class Tag856EnuTradeReportTypeTest {
    @Test
    void FIX0856Test() {
        FIX44 fixData = FIX44.FIX856_ENU_TRADE_REPORT_TYPE;
        assertEquals( "856", fixData.getID());
        assertEquals( "TRADE_REPORT_TYPE", fixData.getName());
        assertEquals( "TradeReportType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0856Test() {
        Tag856EnuTradeReportType tagData;

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.SUBMIT);
        assertEquals( Enum856TradeReportType.SUBMIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED);
        assertEquals( Enum856TradeReportType.ALLEGED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ACCEPT);
        assertEquals( Enum856TradeReportType.ACCEPT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DECLINE);
        assertEquals( Enum856TradeReportType.DECLINE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ADDENDUM);
        assertEquals( Enum856TradeReportType.ADDENDUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.NO_WAS);
        assertEquals( Enum856TradeReportType.NO_WAS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.TRADE_REPORT_CANCEL);
        assertEquals( Enum856TradeReportType.TRADE_REPORT_CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.LOCKED_IN_TRADE_BREAK);
        assertEquals( Enum856TradeReportType.LOCKED_IN_TRADE_BREAK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DEFAULTED);
        assertEquals( Enum856TradeReportType.DEFAULTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.INVALID_CMTA);
        assertEquals( Enum856TradeReportType.INVALID_CMTA.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.PENDED);
        assertEquals( Enum856TradeReportType.PENDED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NEW);
        assertEquals( Enum856TradeReportType.ALLEGED_NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_ADDENDUM);
        assertEquals( Enum856TradeReportType.ALLEGED_ADDENDUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NO_WAS);
        assertEquals( Enum856TradeReportType.ALLEGED_NO_WAS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL);
        assertEquals( Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK);
        assertEquals( Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}