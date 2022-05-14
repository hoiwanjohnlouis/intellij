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
import com.hwtsllc.fixengine2022.fix42.enums.Enum277TradeCondition;
import com.hwtsllc.fixengine2022.interfaces.LogEnumString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  277
 *  TradeCondition
 *
 *      0
 *      "0 - Cancel"
 *
 *      A-Z
 *      "A - Cash (only) Market"
 *      "B - Average Price Trade"
 *      "C - Cash Trade (same day clearing)"
 *      "D - Next Day (only) Market"
 *      "E - Opening/Reopening Trade Detail"
 *      "F - Intraday Trade Detail"
 *      "G - Rule 127 Trade (NYSE)"
 *      "H - Rule 155 Trade (AMEX)"
 *      "I - Sold Last (late reporting)"
 *      "J - Next Day Trade (next day clearing)"
 *      "K - Opened (late report of opened trade)"
 *      "L - Seller"
 *      "M - Sold (out of sequence)"
 *      "N - Stopped Stock (guarantee of price but does not execute the order)"
 *      "P - Imbalance More Buyers (cannot be used in combination with Q)"
 *      "Q - Imbalance More Sellers (cannot be used in combination with P)"
 *      "R - Opening Price"
 *      "S - Bargain Condition (LSE)"
 *      "T - Converted Price Indicator"
 *      "U - Exchange Last"
 *      "V - Final Price of Session"
 *      "W - Ex-pit"
 *      "X - Crossed"
 *      "Y - Trades resulting from manual/slow quote"
 *      "Z - Trades resulting from intermarket sweep"
 *
 *      a-z
 *     "a - Volume Only"
 *     "b - Direct Plus"
 *     "c - Acquisition"
 *     "d - Bunched"
 *     "e - Distribution"
 *     "f - Bunched Sale"
 *     "g - Split Trade"
 *     "h - Cancel Stopped"
 *     "i - Cancel ETH"
 *     "j - Cancel Stopped ETH"
 *     "k - Out of Sequence ETH"
 *     "l - Cancel Last ETH"
 *     "m - Sold Last Sale ETH"
 *     "n - Cancel Last"
 *     "o - Sold Last Sale"
 *     "p - Cancel Open"
 *     "q - Cancel Open ETH"
 *     "r - Opened Sale ETH"
 *     "s - Cancel Only"
 *     "t - Cancel Only ETH"
 *     "u - Late Open ETH"
 *     "v - Auto Execution ETH"
 *     "w - Reopen"
 *     "x - Reopen ETH"
 *     "y - Adjusted"
 *     "z - Adjusted ETH"
 *
 *      AA-AT
 *      "AA - Spread"
 *      "AB - Spread ETH"
 *      "AC - Straddle"
 *      "AD - Straddle ETH"
 *      "AE - Stopped"
 *      "AF - Stopped ETH"
 *      "AG - Regular ETH"
 *      "AH - Combo"
 *      "AI - Combo ETH"
 *      "AJ - Official Closing Price"
 *      "AK - Prior Reference Price"
 *      "AL - Stopped Sold Last"
 *      "AM - Stopped Out of Sequence"
 *      "AN - Offical Closing Price"
 *      "AO - Crossed"
 *      "AP - Fast Market"
 *      "AQ - Automatic Execution"
 *      "AR - Form T"
 *      "AS - Basket Index"
 *      "AT - Burst Basket"
 */
public class Tag277EnuTradeCondition extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogEnumString {
    private final Enum277TradeCondition dataValue;

    public final static Enum277TradeCondition TESTA_ENU_TRADE_CONDITION = Enum277TradeCondition.BARGAIN_CONDITION_LSE;
    public final static Enum277TradeCondition TESTB_ENU_TRADE_CONDITION = Enum277TradeCondition.CANCEL_LAST_ETH;

    public Tag277EnuTradeCondition(Enum277TradeCondition dataValue) {
        setFixType(FIX42.FIX277_ENU_TRADE_CONDITION);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
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
     * wrapper to return the description of the underlying ENUM data
     */
    @Override
    public String toEnumString() {
        return this.dataValue.getDescription();
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
        Tag277EnuTradeCondition tagData;

        tagData = new Tag277EnuTradeCondition(TESTA_ENU_TRADE_CONDITION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());

        tagData = new Tag277EnuTradeCondition(TESTB_ENU_TRADE_CONDITION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toEnumString());
    }
}
