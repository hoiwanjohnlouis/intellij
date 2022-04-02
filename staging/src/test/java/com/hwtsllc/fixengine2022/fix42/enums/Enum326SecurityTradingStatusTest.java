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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum326SecurityTradingStatusTest {
    @Test
    void Enum0326Test() {
        Enum326SecurityTradingStatus enumType;

        /*
         * 1-10, 12-23 msg types. skipped 11.
         */

        /*
         * 1-10 msg types
         */
        enumType = Enum326SecurityTradingStatus.OPENING_DELAY;
        assertEquals( "1", enumType.getID());
        assertEquals( "OPENING_DELAY", enumType.getName());
        assertEquals( "1 - Opening delay", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.TRADING_HALT;
        assertEquals( "2", enumType.getID());
        assertEquals( "TRADING_HALT", enumType.getName());
        assertEquals( "2 - Trading halt", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.RESUME;
        assertEquals( "3", enumType.getID());
        assertEquals( "RESUME", enumType.getName());
        assertEquals( "3 - Resume", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME;
        assertEquals( "4", enumType.getID());
        assertEquals( "NO_OPEN_NO_RESUME", enumType.getName());
        assertEquals( "4 - No Open / No Resume", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.PRICE_INDICATION;
        assertEquals( "5", enumType.getID());
        assertEquals( "PRICE_INDICATION", enumType.getName());
        assertEquals( "5 - Price indication", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION;
        assertEquals( "6", enumType.getID());
        assertEquals( "TRADING_RANGE_INDICATION", enumType.getName());
        assertEquals( "6 - Trading Range Indication", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY;
        assertEquals( "7", enumType.getID());
        assertEquals( "MARKET_IMBALANCE_BUY", enumType.getName());
        assertEquals( "7 - Market Imbalance Buy", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL;
        assertEquals( "8", enumType.getID());
        assertEquals( "MARKET_IMBALANCE_SELL", enumType.getName());
        assertEquals( "8 - Market Imbalance Sell", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY;
        assertEquals( "9", enumType.getID());
        assertEquals( "MARKET_ON_CLOSE_IMBALANCE_BUY", enumType.getName());
        assertEquals( "9 - Market on Close Imbalance Buy", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL;
        assertEquals( "10", enumType.getID());
        assertEquals( "MARKET_ON_CLOSE_IMBALANCE_SELL", enumType.getName());
        assertEquals( "10 - Market on Close Imbalance Sell", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * 12-23 msg types
         */
        enumType = Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE;
        assertEquals( "12", enumType.getID());
        assertEquals( "NO_MARKET_IMBALANCE", enumType.getName());
        assertEquals( "12 - No Market Imbalance", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE;
        assertEquals( "13", enumType.getID());
        assertEquals( "NO_MARKET_ON_CLOSE_IMBALANCE", enumType.getName());
        assertEquals( "13 - No Market on Close Imbalance", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.ITS_PRE_OPENING;
        assertEquals( "14", enumType.getID());
        assertEquals( "ITS_PRE_OPENING", enumType.getName());
        assertEquals( "14 - ITS Pre-opening", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.NEW_PRICE_INDICATION;
        assertEquals( "15", enumType.getID());
        assertEquals( "NEW_PRICE_INDICATION", enumType.getName());
        assertEquals( "15 - New Price Indication", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME;
        assertEquals( "16", enumType.getID());
        assertEquals( "TRADE_DISSEMINATION_TIME", enumType.getName());
        assertEquals( "16 - Trade Dissemination Time", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.READY_TO_TRADE;
        assertEquals( "17", enumType.getID());
        assertEquals( "READY_TO_TRADE", enumType.getName());
        assertEquals( "17 - Ready to trade (start of session)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING;
        assertEquals( "18", enumType.getID());
        assertEquals( "NOT_AVAILABLE_FOR_TRADING", enumType.getName());
        assertEquals( "18 - Not available for trading (end of session)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET;
        assertEquals( "19", enumType.getID());
        assertEquals( "NOT_TRADED_ON_THIS_MARKET", enumType.getName());
        assertEquals( "19 - Not traded on this market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID;
        assertEquals( "20", enumType.getID());
        assertEquals( "UNKNOWN_OR_INVALID", enumType.getName());
        assertEquals( "20 - Unknown or Invalid", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.PRE_OPEN;
        assertEquals( "21", enumType.getID());
        assertEquals( "PRE_OPEN", enumType.getName());
        assertEquals( "21 - Pre-open", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.OPENING_ROTATION;
        assertEquals( "22", enumType.getID());
        assertEquals( "OPENING_ROTATION", enumType.getName());
        assertEquals( "22 - Opening Rotation", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum326SecurityTradingStatus.FAST_MARKET;
        assertEquals( "23", enumType.getID());
        assertEquals( "FAST_MARKET", enumType.getName());
        assertEquals( "23 - Fast Market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}