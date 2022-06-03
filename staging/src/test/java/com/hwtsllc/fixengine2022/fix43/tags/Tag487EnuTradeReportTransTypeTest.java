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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum487TradeReportTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag487EnuTradeReportTransTypeTest {
    @Test
    void FIX0487Test() {
        FIX43 fixData = FIX43.FIX487_ENU_TRADE_REPORT_TRANS_TYPE;
        assertEquals( "487", fixData.toFIXIDString());
        assertEquals( "TRADE_REPORT_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "TradeReportTransType", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0487Test() {
        Tag487EnuTradeReportTransType tagData;

        /*
         * 0-5 types
         */
        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.NEW );
        assertEquals( Enum487TradeReportTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.CANCEL );
        assertEquals( Enum487TradeReportTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.REPLACE );
        assertEquals( Enum487TradeReportTransType.REPLACE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.RELEASE );
        assertEquals( Enum487TradeReportTransType.RELEASE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.REVERSE );
        assertEquals( Enum487TradeReportTransType.REVERSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE );
        assertEquals( Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}