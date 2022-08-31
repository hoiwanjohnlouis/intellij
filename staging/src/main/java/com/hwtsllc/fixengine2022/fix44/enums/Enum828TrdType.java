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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  828
 *  TrdType
 *  int
 *  <p></p>
 *  Type of Trade:
 *  Valid values:
 *  <p>    0 - Regular Trade
 *  <p>    1 - Block Trade
 *  <p>    2 - EFP (Exchange for physical)
 *  <p>    3 - Transfer
 *  <p>    4 - Late Trade
 *  <p></p>
 *  <p>    5 - T Trade
 *  <p>    6 - Weighted Average Price Trade
 *  <p>    7 - Bunched Trade
 *  <p>    8 - Late Bunched Trade
 *  <p>    9 - Prior Reference Price Trade
 *  <p></p>
 *  <p>    10 - After Hours Trade
 *  <p>    11 - Exchange for Risk (EFR)
 *  <p>    12 - Exchange for Swap (EFS)
 *  <p>    13 - Exchange of Futures for (in Market) Futures (EFM)
 *              (e,g, full sized for mini)
 *  <p>    14 - Exchange of Options for Options (EOO)
 *  <p></p>
 *  <p>    15 - Trading at Settlement
 *  <p>    16 - All or None
 *  <p>    17 - Futures Large Order Execution
 *  <p>    18 - Exchange of Futures for Futures (external market) (EFF)
 *  <p>    19 - Option Interim Trade
 *  <p></p>
 *  <p>    20 - Option Cabinet Trade
 *  <p>    22 - Privately Negotiated Trades
 *  <p>    23 - Substitution of Futures for Forwards
 *  <p></p>
 *  <p>    MiFID Values
 *  <p>    24 - Error trade
 *  <p></p>
 *  <p>    25 - Special cum dividend (CD)
 *  <p>    26 - Special ex dividend (XD)
 *  <p>    27 - Special cum coupon (CC)
 *  <p>    28 - Special ex coupon (XC)
 *  <p>    29 - Cash settlement (CS)
 *  <p></p>
 *  <p>    30 - Special price (usually net- or all-in price) (SP)
 *  <p>    31 - Guaranteed delivery (GD)
 *  <p>    32 - Special cum rights (CR)
 *  <p>    33 - Special ex rights (XR)
 *  <p>    34 - Special cum capital repayments (CP)
 *  <p></p>
 *  <p>    35 - Special ex capital repayments (XP)
 *  <p>    36 - Special cum bonus (CB)
 *  <p>    37 - Special ex bonus (XB)
 *  <p>    38 - Block trade (same as large trade)
 *  <p>    39 - Worked principal trade (UK-specific)
 *  <p></p>
 *  <p>    40 - Block Trades - after market
 *  <p>    41 - Name change
 *  <p>    42 - Portfolio transfer
 *  <p>    43 - Prorogation buy - Euronext Paris only.
 *  <p>         Is used to defer settlement under French SRD (deferred settlement system).
 *  <p>         Trades must be reported as crosses at zero price.
 *  <p>    44 - Prorogation sell - see prorogation buy
 *  <p></p>
 *  <p>    45 - Option exercise
 *  <p>    46 - Delta neutral transaction
 *  <p>    47 - Financing transaction (includes repo and stock lending)
 */
public enum Enum828TrdType implements LogFIXString, LogVerboseString {
    REGULAR_TRADE( "0", "REGULAR_TRADE", "0 - Regular Trade" ),
    BLOCK_TRADE( "1", "BLOCK_TRADE", "1 - Block Trade" ),
    EFP( "2", "EFP", "2 - EFP (Exchange for physical)" ),
    TRANSFER( "3", "TRANSFER", "3 - Transfer" ),
    LATE_TRADE( "4", "LATE_TRADE", "4 - Late Trade" ),

    T_TRADE( "5", "T_TRADE", "5 - T Trade" ),
    WEIGHTED_AVERAGE_TRADE( "6", "WEIGHTED_AVERAGE_TRADE", "6 - Weighted Average Price Trade" ),
    BUNCHED_TRADE( "7", "BUNCHED_TRADE", "7 - Bunched Trade" ),
    LATE_BUNCHED_TRADE( "8", "LATE_BUNCHED_TRADE", "8 - Late Bunched Trade" ),
    PRIOR_REFERENCE_TRADE( "9", "PRIOR_REFERENCE_TRADE", "9 - Prior Reference Price Trade" ),

    AFTER_HOURS_TRADE( "10", "AFTER_HOURS_TRADE", "10 - After Hours Trade" ),
    EFR( "11", "EFR", "11 - Exchange for Risk (EFR)" ),
    EFS( "12", "EFS", "12 - Exchange for Swap (EFS)" ),
    EFM( "13", "EFM",
            "13 - Exchange of Futures for (in Market) Futures (EFM) (e,g, full sized for mini)" ),
    EOO( "14", "EOO", "14 - Exchange of Options for Options (EOO)" ),

    TRADING_AT_SETTLEMENT( "15", "TRADING_AT_SETTLEMENT", "15 - Trading at Settlement" ),
    AON( "16", "AON", "16 - All or None" ),
    FUTURES_LARGE_ORDER_EXECUTION( "17", "FUTURES_LARGE_ORDER_EXECUTION",
            "17 - Futures Large Order Execution" ),
    EFF( "18", "EFF", "18 - Exchange of Futures for Futures (external market) (EFF)" ),
    OPTION_INTERIM_TRADE( "19", "OPTION_INTERIM_TRADE", "19 - Option Interim Trade" ),

    OPTION_CABINET_TRADE( "20", "OPTION_CABINET_TRADE", "20 - Option Cabinet Trade" ),
    PRIVATELY_NEGOTIATED_TRADES( "22", "PRIVATELY_NEGOTIATED_TRADES",
            "22 - Privately Negotiated Trades" ),
    SUBSTITUTION_OF_FUTURES_FORWARDS( "23", "SUBSTITUTION_OF_FUTURES_FORWARDS",
            "23 - Substitution of Futures for Forwards" ),

    /**
     *  MiFID Values
     */
    ERROR_TRADE( "24", "ERROR_TRADE", "24 - Error trade" ),

    CD( "25", "CD", "25 - Special cum dividend (CD)" ),
    XD( "26", "XD", "26 - Special ex dividend (XD)" ),
    CC( "27", "CC", "27 - Special cum coupon (CC)" ),
    XC( "28", "XC", "28 - Special ex coupon (XC)" ),
    CS( "29", "CS", "29 - Cash settlement (CS)" ),

    SP( "30", "SP", "30 - Special price (usually net- or all-in price) (SP)" ),
    GD( "31", "GD", "31 - Guaranteed delivery (GD)" ),
    CR( "32", "CR", "32 - Special cum rights (CR)" ),
    XR( "33", "XR", "33 - Special ex rights (XR)" ),
    CP( "34", "CP", "34 - Special cum capital repayments (CP)" ),

    XP( "35", "XP", "35 - Special ex capital repayments (XP)" ),
    CB( "36", "CB", "36 - Special cum bonus (CB)" ),
    XB( "37", "XB", "37 - Special ex bonus (XB)" ),
    LARGE_TRADE( "38", "LARGE_TRADE", "38 - Block trade (same as large trade)" ),
    WORKED_PRINCIPAL_TRADE( "39", "WORKED_PRINCIPAL_TRADE",
            "39 - Worked principal trade (UK-specific)" ),

    BLOCK_TRADE_AFTER_MARKET( "40", "BLOCK_TRADE_AFTER_MARKET",
            "40 - Block Trades - after market" ),
    NAME_CHANGE( "41", "NAME_CHANGE", "41 - Name change" ),
    PORTFOLIO_TRANSFER( "42", "PORTFOLIO_TRANSFER", "42 - Portfolio transfer" ),
    PROROGATION_BUY( "43", "PROROGATION_BUY",
            "43 - Prorogation buy - Euronext Paris only. " +
                    "Is used to defer settlement under French SRD (deferred settlement system). " +
                    "Trades must be reported_as_crosses_zero_price" ),
    PROROGATION_SELL( "44", "PROROGATION_SELL", "44 - Prorogation sell - see prorogation buy" ),

    OPTION_EXERCISE( "45", "OPTION_EXERCISE", "45 - Option exercise" ),
    DELTA_NEUTRAL_TRANSACTION( "46", "DELTA_NEUTRAL_TRANSACTION", "46 - Delta neutral transaction" ),
    FINANCING_TRANSACTION( "47", "FINANCING_TRANSACTION",
            "47 - Financing transaction (includes repo and stock lending)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum828TrdType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum828TrdType oneEnum : Enum828TrdType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
