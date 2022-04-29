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
import com.hwtsllc.fixengine2022.fix44.enums.Enum749TradeRequestResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag749EnuTradeRequestResultTest {
    @Test
    void FIX0749Test() {
        FIX44 fixData = FIX44.FIX749_ENU_TRADE_REQUEST_RESULT;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  749
     *  TradeRequestResult
     *  Result of Trade Request
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Successful (default)
     *      1 - Invalid or unknown instrument
     *      2 - Invalid type of trade requested
     *      3 - Invalid parties
     *      4 - Invalid transport type requested
     *      5 - Invalid destination requested
     *      8 - TradeRequestType not supported
     *      9 - Unauthorized for Trade Capture Report Request
     *      99 - Other
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void Tag0749Test() {
        Tag749EnuTradeRequestResult tagData;

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.SUCCESSFUL);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNKNOWN_INSTRUMENT);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRADE_TYPE);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_PARTIES);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST);
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.OTHER);
    }
}