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
import com.hwtsllc.fixengine2022.fix42.enums.Enum326SecurityTradingStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  326
 *  Enu
 *  SecurityTradingStatus
 *
 *      1-10, 12-23 msg types. skipped 11.
 *      OPENING_DELAY( "1", "OPENING_DELAY", "1 - Opening delay" ),
 *      TRADING_HALT( "2", "TRADING_HALT", "2 - Trading halt" ),
 *      RESUME( "3", "RESUME", "3 - Resume" ),
 *      NO_OPEN_NO_RESUME( "4", "NO_OPEN_NO_RESUME", "4 - No Open / No Resume" ),
 *      PRICE_INDICATION( "5", "PRICE_INDICATION", "5 - Price indication" ),
 *      TRADING_RANGE_INDICATION( "6", "TRADING_RANGE_INDICATION", "6 - Trading Range Indication" ),
 *      MARKET_IMBALANCE_BUY( "7", "MARKET_IMBALANCE_BUY", "7 - Market Imbalance Buy" ),
 *      MARKET_IMBALANCE_SELL( "8", "MARKET_IMBALANCE_SELL", "8 - Market Imbalance Sell" ),
 *      MARKET_ON_CLOSE_IMBALANCE_BUY( "9", "MARKET_ON_CLOSE_IMBALANCE_BUY",
 *                          "9 - Market on Close Imbalance Buy" ),
 *      MARKET_ON_CLOSE_IMBALANCE_SELL( "10", "MARKET_ON_CLOSE_IMBALANCE_SELL",
 *                          "10 - Market on Close Imbalance Sell" ),
 *      NO_MARKET_IMBALANCE( "12", "NO_MARKET_IMBALANCE", "12 - No Market Imbalance" ),
 *      NO_MARKET_ON_CLOSE_IMBALANCE( "13", "NO_MARKET_ON_CLOSE_IMBALANCE",
 *                          "13 - No Market on Close Imbalance" ),
 *      ITS_PRE_OPENING( "14", "ITS_PRE_OPENING", "14 - ITS Pre-opening" ),
 *      NEW_PRICE_INDICATION( "15", "NEW_PRICE_INDICATION", "15 - New Price Indication" ),
 *      TRADE_DISSEMINATION_TIME( "16", "TRADE_DISSEMINATION_TIME", "16 - Trade Dissemination Time" ),
 *      READY_TO_TRADE( "17", "READY_TO_TRADE", "17 - Ready to trade (start of session)" ),
 *      NOT_AVAILABLE_FOR_TRADING( "18", "NOT_AVAILABLE_FOR_TRADING",
 *                          "18 - Not available for trading (end of session)" ),
 *      NOT_TRADED_ON_THIS_MARKET( "19", "NOT_TRADED_ON_THIS_MARKET", "19 - Not traded on this market" ),
 *      UNKNOWN_OR_INVALID( "20", "UNKNOWN_OR_INVALID", "20 - Unknown or Invalid" ),
 *      PRE_OPEN( "21", "PRE_OPEN", "21 - Pre-open" ),
 *      OPENING_ROTATION( "22", "OPENING_ROTATION", "22 - Opening Rotation" ),
 *      FAST_MARKET( "23", "FAST_MARKET", "23 - Fast Market" ),
 */
class Tag326EnuSecurityTradingStatusTest {
    @Test
    void FIX0326Test() {
        FIX42 fixData = FIX42.FIX326_ENU_SECURITY_TRADING_STATUS;
        assertEquals( "326", fixData.toFIXIDString());
        assertEquals( "SECURITY_TRADING_STATUS", fixData.toFIXNameString());
        assertEquals( "SecurityTradingStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0326Test() {
        Tag326EnuSecurityTradingStatus tagData;

        /*
         * 1-10, 12-23 msg types. skipped 11.
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_DELAY);
        assertEquals( Enum326SecurityTradingStatus.OPENING_DELAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_HALT);
        assertEquals( Enum326SecurityTradingStatus.TRADING_HALT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.RESUME);
        assertEquals( Enum326SecurityTradingStatus.RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME);
        assertEquals( Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.PRICE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.ITS_PRE_OPENING);
        assertEquals( Enum326SecurityTradingStatus.ITS_PRE_OPENING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NEW_PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.NEW_PRICE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME);
        assertEquals( Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.READY_TO_TRADE);
        assertEquals( Enum326SecurityTradingStatus.READY_TO_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING);
        assertEquals( Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET);
        assertEquals( Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID);
        assertEquals( Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRE_OPEN);
        assertEquals( Enum326SecurityTradingStatus.PRE_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_ROTATION);
        assertEquals( Enum326SecurityTradingStatus.OPENING_ROTATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.FAST_MARKET);
        assertEquals( Enum326SecurityTradingStatus.FAST_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}