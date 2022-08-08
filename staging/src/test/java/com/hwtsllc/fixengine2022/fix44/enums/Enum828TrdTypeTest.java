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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum828TrdTypeTest {
    @Test
    void EnumTest() {
        Enum828TrdType enumType;

        enumType = Enum828TrdType.REGULAR_TRADE;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("REGULAR_TRADE", enumType.toEnumNameString());
        assertEquals("0 - Regular Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.BLOCK_TRADE;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("BLOCK_TRADE", enumType.toEnumNameString());
        assertEquals("1 - Block Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EFP;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("EFP", enumType.toEnumNameString());
        assertEquals("2 - EFP (Exchange for physical)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.TRANSFER;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("TRANSFER", enumType.toEnumNameString());
        assertEquals("3 - Transfer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.LATE_TRADE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("LATE_TRADE", enumType.toEnumNameString());
        assertEquals("4 - Late Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.T_TRADE;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("T_TRADE", enumType.toEnumNameString());
        assertEquals("5 - T Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.WEIGHTED_AVERAGE_TRADE;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("WEIGHTED_AVERAGE_TRADE", enumType.toEnumNameString());
        assertEquals("6 - Weighted Average Price Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.BUNCHED_TRADE;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("BUNCHED_TRADE", enumType.toEnumNameString());
        assertEquals("7 - Bunched Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.LATE_BUNCHED_TRADE;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("LATE_BUNCHED_TRADE", enumType.toEnumNameString());
        assertEquals("8 - Late Bunched Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.PRIOR_REFERENCE_TRADE;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("PRIOR_REFERENCE_TRADE", enumType.toEnumNameString());
        assertEquals("9 - Prior Reference Price Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.AFTER_HOURS_TRADE;
        assertEquals("10", enumType.toEnumIDString());
        assertEquals("AFTER_HOURS_TRADE", enumType.toEnumNameString());
        assertEquals("10 - After Hours Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EFR;
        assertEquals("11", enumType.toEnumIDString());
        assertEquals("EFR", enumType.toEnumNameString());
        assertEquals("11 - Exchange for Risk (EFR)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EFS;
        assertEquals("12", enumType.toEnumIDString());
        assertEquals("EFS", enumType.toEnumNameString());
        assertEquals("12 - Exchange for Swap (EFS)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EFM;
        assertEquals("13", enumType.toEnumIDString());
        assertEquals("EFM", enumType.toEnumNameString());
        assertEquals("13 - Exchange of Futures for (in Market) Futures (EFM) (e,g, full sized for mini)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EOO;
        assertEquals("14", enumType.toEnumIDString());
        assertEquals("EOO", enumType.toEnumNameString());
        assertEquals("14 - Exchange of Options for Options (EOO)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.TRADING_AT_SETTLEMENT;
        assertEquals("15", enumType.toEnumIDString());
        assertEquals("TRADING_AT_SETTLEMENT", enumType.toEnumNameString());
        assertEquals("15 - Trading at Settlement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.AON;
        assertEquals("16", enumType.toEnumIDString());
        assertEquals("AON", enumType.toEnumNameString());
        assertEquals("16 - All or None", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION;
        assertEquals("17", enumType.toEnumIDString());
        assertEquals("FUTURES_LARGE_ORDER_EXECUTION", enumType.toEnumNameString());
        assertEquals("17 - Futures Large Order Execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.EFF;
        assertEquals("18", enumType.toEnumIDString());
        assertEquals("EFF", enumType.toEnumNameString());
        assertEquals("18 - Exchange of Futures for Futures (external market) (EFF)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.OPTION_INTERIM_TRADE;
        assertEquals("19", enumType.toEnumIDString());
        assertEquals("OPTION_INTERIM_TRADE", enumType.toEnumNameString());
        assertEquals("19 - Option Interim Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.OPTION_CABINET_TRADE;
        assertEquals("20", enumType.toEnumIDString());
        assertEquals("OPTION_CABINET_TRADE", enumType.toEnumNameString());
        assertEquals("20 - Option Cabinet Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES;
        assertEquals("22", enumType.toEnumIDString());
        assertEquals("PRIVATELY_NEGOTIATED_TRADES", enumType.toEnumNameString());
        assertEquals("22 - Privately Negotiated Trades", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS;
        assertEquals("23", enumType.toEnumIDString());
        assertEquals("SUBSTITUTION_OF_FUTURES_FORWARDS", enumType.toEnumNameString());
        assertEquals("23 - Substitution of Futures for Forwards", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         *  MiFID Values
         */
        enumType = Enum828TrdType.ERROR_TRADE;
        assertEquals("24", enumType.toEnumIDString());
        assertEquals("ERROR_TRADE", enumType.toEnumNameString());
        assertEquals("24 - Error trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.CD;
        assertEquals("25", enumType.toEnumIDString());
        assertEquals("CD", enumType.toEnumNameString());
        assertEquals("25 - Special cum dividend (CD)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.XD;
        assertEquals("26", enumType.toEnumIDString());
        assertEquals("XD", enumType.toEnumNameString());
        assertEquals("26 - Special ex dividend (XD)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.CC;
        assertEquals("27", enumType.toEnumIDString());
        assertEquals("CC", enumType.toEnumNameString());
        assertEquals("27 - Special cum coupon (CC)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.XC;
        assertEquals("28", enumType.toEnumIDString());
        assertEquals("XC", enumType.toEnumNameString());
        assertEquals("28 - Special ex coupon (XC)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.CS;
        assertEquals("29", enumType.toEnumIDString());
        assertEquals("CS", enumType.toEnumNameString());
        assertEquals("29 - Cash settlement (CS)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.SP;
        assertEquals("30", enumType.toEnumIDString());
        assertEquals("SP", enumType.toEnumNameString());
        assertEquals("30 - Special price (usually net- or all-in price) (SP)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.GD;
        assertEquals("31", enumType.toEnumIDString());
        assertEquals("GD", enumType.toEnumNameString());
        assertEquals("31 - Guaranteed delivery (GD)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.CR;
        assertEquals("32", enumType.toEnumIDString());
        assertEquals("CR", enumType.toEnumNameString());
        assertEquals("32 - Special cum rights (CR)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.XR;
        assertEquals("33", enumType.toEnumIDString());
        assertEquals("XR", enumType.toEnumNameString());
        assertEquals("33 - Special ex rights (XR)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.CP;
        assertEquals("34", enumType.toEnumIDString());
        assertEquals("CP", enumType.toEnumNameString());
        assertEquals("34 - Special cum capital repayments (CP)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.XP;
        assertEquals("35", enumType.toEnumIDString());
        assertEquals("XP", enumType.toEnumNameString());
        assertEquals("35 - Special ex capital repayments (XP)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.CB;
        assertEquals("36", enumType.toEnumIDString());
        assertEquals("CB", enumType.toEnumNameString());
        assertEquals("36 - Special cum bonus (CB)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.XB;
        assertEquals("37", enumType.toEnumIDString());
        assertEquals("XB", enumType.toEnumNameString());
        assertEquals("37 - Special ex bonus (XB)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.LARGE_TRADE;
        assertEquals("38", enumType.toEnumIDString());
        assertEquals("LARGE_TRADE", enumType.toEnumNameString());
        assertEquals("38 - Block trade (same as large trade)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.WORKED_PRINCIPAL_TRADE;
        assertEquals("39", enumType.toEnumIDString());
        assertEquals("WORKED_PRINCIPAL_TRADE", enumType.toEnumNameString());
        assertEquals("39 - Worked principal trade (UK-specific)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.BLOCK_TRADE_AFTER_MARKET;
        assertEquals("40", enumType.toEnumIDString());
        assertEquals("BLOCK_TRADE_AFTER_MARKET", enumType.toEnumNameString());
        assertEquals("40 - Block Trades - after market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.NAME_CHANGE;
        assertEquals("41", enumType.toEnumIDString());
        assertEquals("NAME_CHANGE", enumType.toEnumNameString());
        assertEquals("41 - Name change", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.PORTFOLIO_TRANSFER;
        assertEquals("42", enumType.toEnumIDString());
        assertEquals("PORTFOLIO_TRANSFER", enumType.toEnumNameString());
        assertEquals("42 - Portfolio transfer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.PROROGATION_BUY;
        assertEquals("43", enumType.toEnumIDString());
        assertEquals("PROROGATION_BUY", enumType.toEnumNameString());
        assertEquals("43 - Prorogation buy - Euronext Paris only. " +
                "Is used to defer settlement under French SRD (deferred settlement system). " +
                "Trades must be reported_as_crosses_zero_price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum828TrdType.PROROGATION_SELL;
        assertEquals("44", enumType.toEnumIDString());
        assertEquals("PROROGATION_SELL", enumType.toEnumNameString());
        assertEquals("44 - Prorogation sell - see prorogation buy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.OPTION_EXERCISE;
        assertEquals("45", enumType.toEnumIDString());
        assertEquals("OPTION_EXERCISE", enumType.toEnumNameString());
        assertEquals("45 - Option exercise", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.DELTA_NEUTRAL_TRANSACTION;
        assertEquals("46", enumType.toEnumIDString());
        assertEquals("DELTA_NEUTRAL_TRANSACTION", enumType.toEnumNameString());
        assertEquals("46 - Delta neutral transaction", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum828TrdType.FINANCING_TRANSACTION;
        assertEquals("47", enumType.toEnumIDString());
        assertEquals("FINANCING_TRANSACTION", enumType.toEnumNameString());
        assertEquals("47 - Financing transaction (includes repo and stock lending)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}