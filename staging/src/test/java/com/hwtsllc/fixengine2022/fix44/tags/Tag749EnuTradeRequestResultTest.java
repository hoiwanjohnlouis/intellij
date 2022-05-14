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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag749EnuTradeRequestResultTest {
    @Test
    void FIX0749Test() {
        FIX44 fixData = FIX44.FIX749_ENU_TRADE_REQUEST_RESULT;
        assertEquals( "749", fixData.getID());
        assertEquals( "TRADE_REQUEST_RESULT", fixData.getName());
        assertEquals( "TradeRequestResult", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0749Test() {
        Tag749EnuTradeRequestResult tagData;

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.SUCCESSFUL);
        assertEquals( Enum749TradeRequestResult.SUCCESSFUL.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNKNOWN_INSTRUMENT);
        assertEquals( Enum749TradeRequestResult.UNKNOWN_INSTRUMENT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRADE_TYPE);
        assertEquals( Enum749TradeRequestResult.INVALID_TRADE_TYPE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_PARTIES);
        assertEquals( Enum749TradeRequestResult.INVALID_PARTIES.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE);
        assertEquals( Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED);
        assertEquals( Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED);
        assertEquals( Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST);
        assertEquals( Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.OTHER);
        assertEquals( Enum749TradeRequestResult.OTHER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}