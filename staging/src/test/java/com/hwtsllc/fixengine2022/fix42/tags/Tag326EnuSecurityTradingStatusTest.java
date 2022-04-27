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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag326EnuSecurityTradingStatusTest {
    @Test
    void FIX0326Test() {
        FIX42 fixData = FIX42.FIX326_ENU_SECURITY_TRADING_STATUS;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-10, 12-23 msg types. skipped 11.
     */
    OPENING_DELAY( "1", "OPENING_DELAY", "1 - Opening delay" ),
    TRADING_HALT( "2", "TRADING_HALT", "2 - Trading halt" ),
    RESUME( "3", "RESUME", "3 - Resume" ),
    NO_OPEN_NO_RESUME( "4", "NO_OPEN_NO_RESUME", "4 - No Open / No Resume" ),
    PRICE_INDICATION( "5", "PRICE_INDICATION", "5 - Price indication" ),
    TRADING_RANGE_INDICATION( "6", "TRADING_RANGE_INDICATION", "6 - Trading Range Indication" ),
    MARKET_IMBALANCE_BUY( "7", "MARKET_IMBALANCE_BUY", "7 - Market Imbalance Buy" ),
    MARKET_IMBALANCE_SELL( "8", "MARKET_IMBALANCE_SELL", "8 - Market Imbalance Sell" ),
    MARKET_ON_CLOSE_IMBALANCE_BUY( "9", "MARKET_ON_CLOSE_IMBALANCE_BUY", "9 - Market on Close Imbalance Buy" ),
    MARKET_ON_CLOSE_IMBALANCE_SELL( "10", "MARKET_ON_CLOSE_IMBALANCE_SELL", "10 - Market on Close Imbalance Sell" ),
    NO_MARKET_IMBALANCE( "12", "NO_MARKET_IMBALANCE", "12 - No Market Imbalance" ),
    NO_MARKET_ON_CLOSE_IMBALANCE( "13", "NO_MARKET_ON_CLOSE_IMBALANCE", "13 - No Market on Close Imbalance" ),
    ITS_PRE_OPENING( "14", "ITS_PRE_OPENING", "14 - ITS Pre-opening" ),
    NEW_PRICE_INDICATION( "15", "NEW_PRICE_INDICATION", "15 - New Price Indication" ),
    TRADE_DISSEMINATION_TIME( "16", "TRADE_DISSEMINATION_TIME", "16 - Trade Dissemination Time" ),
    READY_TO_TRADE( "17", "READY_TO_TRADE", "17 - Ready to trade (start of session)" ),
    NOT_AVAILABLE_FOR_TRADING( "18", "NOT_AVAILABLE_FOR_TRADING", "18 - Not available for trading (end of session)" ),
    NOT_TRADED_ON_THIS_MARKET( "19", "NOT_TRADED_ON_THIS_MARKET", "19 - Not traded on this market" ),
    UNKNOWN_OR_INVALID( "20", "UNKNOWN_OR_INVALID", "20 - Unknown or Invalid" ),
    PRE_OPEN( "21", "PRE_OPEN", "21 - Pre-open" ),
    OPENING_ROTATION( "22", "OPENING_ROTATION", "22 - Opening Rotation" ),
    FAST_MARKET( "23", "FAST_MARKET", "23 - Fast Market" ),
    @Test
    void Tag0326Test() {
        Tag326EnuSecurityTradingStatus tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}