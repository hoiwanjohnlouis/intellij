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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum418BidTradeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag418EnuBidTradeTypeTest {
    @Test
    void FIX0418Test() {
        FIX42 fixData = FIX42.FIX418_ENU_BID_TRADE_TYPE;
        assertEquals( "418", fixData.getID());
        assertEquals( "BID_TRADE_TYPE", fixData.getName());
        assertEquals( "BidTradeType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag418
     *  Enu
     *  BidTradeType
     *
     *      A, G, J, and R msg types
     *      AGENCY( "A", "AGENCY", "A - Agency" ),
     *      VWAP_GUARANTEE( "G", "VWAP_GUARANTEE", "G - VWAP Guarantee" ),
     *      GUARANTEED_CLOSE( "J", "GUARANTEED_CLOSE", "J - Guaranteed Close" ),
     *      RISK_TRADE( "R", "RISK_TRADE", "R - Risk Trade" ),
     */
    @Test
    void Tag0418Test() {
        Log418EnuBidTradeType tagData;

        /**
         * A, G, J, and R msg types
         */
        tagData = new Log418EnuBidTradeType(Enum418BidTradeType.AGENCY);
        assertEquals( Enum418BidTradeType.AGENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log418EnuBidTradeType(Enum418BidTradeType.VWAP_GUARANTEE);
        assertEquals( Enum418BidTradeType.VWAP_GUARANTEE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log418EnuBidTradeType(Enum418BidTradeType.GUARANTEED_CLOSE);
        assertEquals( Enum418BidTradeType.GUARANTEED_CLOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log418EnuBidTradeType(Enum418BidTradeType.RISK_TRADE);
        assertEquals( Enum418BidTradeType.RISK_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}