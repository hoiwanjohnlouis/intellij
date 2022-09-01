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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  326
 *  SecurityTradingStatus
 *  int
 *  <p>
 *  Identifies the trading status applicable to the transaction.
 *  <p></p>
 *  Valid values:
 *  <p>    1-10, 12-23 msg types. skipped 11.
 *  <p>    1 - Opening delay
 *  <p>    2 - Trading halt
 *  <p>    3 - Resume
 *  <p>    4 - No Open / No Resume
 *  <p>    5 - Price indication
 *  <p></p>
 *  <p>    6 - Trading Range Indication
 *  <p>    7 - Market Imbalance Buy
 *  <p>    8 - Market Imbalance Sell
 *  <p>    9 - Market on Close Imbalance Buy
 *  <p>    10 - Market on Close Imbalance Sell
 *  <p></p>
 *  <p>    12 - No Market Imbalance
 *  <p>    13 - No Market on Close Imbalance
 *  <p>    14 - ITS Pre-opening
 *  <p>    15 - New Price Indication
 *  <p></p>
 *  <p>    16 - Trade Dissemination Time
 *  <p>    17 - Ready to trade (start of session)
 *  <p>    18 - Not available for trading (end of session)
 *  <p>    19 - Not traded on this market
 *  <p>    20 - Unknown or Invalid
 *  <p></p>
 *  <p>    21 - Pre-open
 *  <p>    22 - Opening Rotation
 *  <p>    23 - Fast Market
 */
class Enum326SecurityTradingStatusTest {
    @Test
    void Enum0326Test() {
        Enum326SecurityTradingStatus enumType;

        /*
         *  1-10, 12-23, msg types. skipped 11.
         */

        /*
         *  1-10, msg types
         */
        enumType = Enum326SecurityTradingStatus.OPENING_DELAY;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "OPENING_DELAY", enumType.toEnumNameString());
        assertEquals( "1 - Opening delay", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.TRADING_HALT;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TRADING_HALT", enumType.toEnumNameString());
        assertEquals( "2 - Trading halt", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.RESUME;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "RESUME", enumType.toEnumNameString());
        assertEquals( "3 - Resume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "NO_OPEN_NO_RESUME", enumType.toEnumNameString());
        assertEquals( "4 - No Open / No Resume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.PRICE_INDICATION;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "PRICE_INDICATION", enumType.toEnumNameString());
        assertEquals( "5 - Price indication", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "TRADING_RANGE_INDICATION", enumType.toEnumNameString());
        assertEquals( "6 - Trading Range Indication", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "MARKET_IMBALANCE_BUY", enumType.toEnumNameString());
        assertEquals( "7 - Market Imbalance Buy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "MARKET_IMBALANCE_SELL", enumType.toEnumNameString());
        assertEquals( "8 - Market Imbalance Sell", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "MARKET_ON_CLOSE_IMBALANCE_BUY", enumType.toEnumNameString());
        assertEquals( "9 - Market on Close Imbalance Buy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "MARKET_ON_CLOSE_IMBALANCE_SELL", enumType.toEnumNameString());
        assertEquals( "10 - Market on Close Imbalance Sell", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  12-23, msg types
         */
        enumType = Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE;
        assertEquals( "12", enumType.toFIXIDString());
        assertEquals( "NO_MARKET_IMBALANCE", enumType.toEnumNameString());
        assertEquals( "12 - No Market Imbalance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "NO_MARKET_ON_CLOSE_IMBALANCE", enumType.toEnumNameString());
        assertEquals( "13 - No Market on Close Imbalance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.ITS_PRE_OPENING;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "ITS_PRE_OPENING", enumType.toEnumNameString());
        assertEquals( "14 - ITS Pre-opening", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.NEW_PRICE_INDICATION;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "NEW_PRICE_INDICATION", enumType.toEnumNameString());
        assertEquals( "15 - New Price Indication", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME;
        assertEquals( "16", enumType.toFIXIDString());
        assertEquals( "TRADE_DISSEMINATION_TIME", enumType.toEnumNameString());
        assertEquals( "16 - Trade Dissemination Time", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.READY_TO_TRADE;
        assertEquals( "17", enumType.toFIXIDString());
        assertEquals( "READY_TO_TRADE", enumType.toEnumNameString());
        assertEquals( "17 - Ready to trade (start of session)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING;
        assertEquals( "18", enumType.toFIXIDString());
        assertEquals( "NOT_AVAILABLE_FOR_TRADING", enumType.toEnumNameString());
        assertEquals( "18 - Not available for trading (end of session)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET;
        assertEquals( "19", enumType.toFIXIDString());
        assertEquals( "NOT_TRADED_ON_THIS_MARKET", enumType.toEnumNameString());
        assertEquals( "19 - Not traded on this market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID;
        assertEquals( "20", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_OR_INVALID", enumType.toEnumNameString());
        assertEquals( "20 - Unknown or Invalid", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum326SecurityTradingStatus.PRE_OPEN;
        assertEquals( "21", enumType.toFIXIDString());
        assertEquals( "PRE_OPEN", enumType.toEnumNameString());
        assertEquals( "21 - Pre-open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.OPENING_ROTATION;
        assertEquals( "22", enumType.toFIXIDString());
        assertEquals( "OPENING_ROTATION", enumType.toEnumNameString());
        assertEquals( "22 - Opening Rotation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum326SecurityTradingStatus.FAST_MARKET;
        assertEquals( "23", enumType.toFIXIDString());
        assertEquals( "FAST_MARKET", enumType.toEnumNameString());
        assertEquals( "23 - Fast Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}