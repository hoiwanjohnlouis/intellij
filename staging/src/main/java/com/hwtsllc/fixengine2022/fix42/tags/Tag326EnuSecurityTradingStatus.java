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
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum326SecurityTradingStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Tag326EnuSecurityTradingStatus extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum326SecurityTradingStatus dataValue;

    public final static Enum326SecurityTradingStatus TESTA_ENU_SECURITY_TRADING_STATUS
            = Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING;
    public final static Enum326SecurityTradingStatus TESTB_ENU_SECURITY_TRADING_STATUS
            = Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY;

    public Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus dataValue) {
        setFixType(FIX42.FIX326_ENU_SECURITY_TRADING_STATUS);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag326EnuSecurityTradingStatus tagData;

        tagData = new Tag326EnuSecurityTradingStatus(TESTA_ENU_SECURITY_TRADING_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag326EnuSecurityTradingStatus(TESTB_ENU_SECURITY_TRADING_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
