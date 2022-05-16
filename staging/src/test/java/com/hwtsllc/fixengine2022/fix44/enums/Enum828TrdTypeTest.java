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
 *  Type of Trade:
 *  Valid values:
 *      0 - Regular Trade
 *      1 - Block Trade
 *      2 - EFP (Exchange for physical)
 *      3 - Transfer
 *      4 - Late Trade
 *      5 - T Trade
 *      6 - Weighted Average Price Trade
 *      7 - Bunched Trade
 *      8 - Late Bunched Trade
 *      9 - Prior Reference Price Trade
 *      10 - After Hours Trade
 *      11 - Exchange for Risk (EFR)
 *      12 - Exchange for Swap (EFS)
 *      13 - Exchange of Futures for (in Market) Futures (EFM) (e,g, full sized for mini)
 *      14 - Exchange of Options for Options (EOO)
 *      15 - Trading at Settlement
 *      16 - All or None
 *      17 - Futures Large Order Execution
 *      18 - Exchange of Futures for Futures (external market) (EFF)
 *      19 - Option Interim Trade
 *      20 - Option Cabinet Trade
 *      22 - Privately Negotiated Trades
 *      23 - Substitution of Futures for Forwards
 *
 *      MiFID Values
 *      24 - Error trade
 *      25 - Special cum dividend (CD)
 *      26 - Special ex dividend (XD)
 *      27 - Special cum coupon (CC)
 *      28 - Special ex coupon (XC)
 *      29 - Cash settlement (CS)
 *      30 - Special price (usually net- or all-in price) (SP)
 *      31 - Guaranteed delivery (GD)
 *      32 - Special cum rights (CR)
 *      33 - Special ex rights (XR)
 *      34 - Special cum capital repayments (CP)
 *      35 - Special ex capital repayments (XP)
 *      36 - Special cum bonus (CB)
 *      37 - Special ex bonus (XB)
 *      38 - Block trade (same as large trade)
 *      39 - Worked principal trade (UK-specific)
 *      40 - Block Trades - after market
 *      41 - Name change
 *      42 - Portfolio transfer
 *      43 - Prorogation buy - Euronext Paris only.
 *                  Is used to defer settlement under French SRD (deferred settlement system).
 *                  Trades must be reported as crosses at zero price.
 *      44 - Prorogation sell - see prorogation buy
 *      45 - Option exercise
 *      46 - Delta neutral transaction
 *      47 - Financing transaction (includes repo and stock lending)
 */
class Enum828TrdTypeTest {
    @Test
    void EnumTest() {
        Enum828TrdType enumType;

        enumType = Enum828TrdType.REGULAR_TRADE;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("REGULAR_TRADE", enumType.toFIXNameString());
        assertEquals("0 - Regular Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.BLOCK_TRADE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("BLOCK_TRADE", enumType.toFIXNameString());
        assertEquals("1 - Block Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EFP;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("EFP", enumType.toFIXNameString());
        assertEquals("2 - EFP (Exchange for physical)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.TRANSFER;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("TRANSFER", enumType.toFIXNameString());
        assertEquals("3 - Transfer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.LATE_TRADE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("LATE_TRADE", enumType.toFIXNameString());
        assertEquals("4 - Late Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.T_TRADE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("T_TRADE", enumType.toFIXNameString());
        assertEquals("5 - T Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.WEIGHTED_AVERAGE_TRADE;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("WEIGHTED_AVERAGE_TRADE", enumType.toFIXNameString());
        assertEquals("6 - Weighted Average Price Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.BUNCHED_TRADE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("BUNCHED_TRADE", enumType.toFIXNameString());
        assertEquals("7 - Bunched Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.LATE_BUNCHED_TRADE;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("LATE_BUNCHED_TRADE", enumType.toFIXNameString());
        assertEquals("8 - Late Bunched Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.PRIOR_REFERENCE_TRADE;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("PRIOR_REFERENCE_TRADE", enumType.toFIXNameString());
        assertEquals("9 - Prior Reference Price Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.AFTER_HOURS_TRADE;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("AFTER_HOURS_TRADE", enumType.toFIXNameString());
        assertEquals("10 - After Hours Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EFR;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("EFR", enumType.toFIXNameString());
        assertEquals("11 - Exchange for Risk (EFR)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EFS;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("EFS", enumType.toFIXNameString());
        assertEquals("12 - Exchange for Swap (EFS)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EFM;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("EFM", enumType.toFIXNameString());
        assertEquals("13 - Exchange of Futures for (in Market) Futures (EFM) (e,g, full sized for mini)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EOO;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("EOO", enumType.toFIXNameString());
        assertEquals("14 - Exchange of Options for Options (EOO)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.TRADING_AT_SETTLEMENT;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("TRADING_AT_SETTLEMENT", enumType.toFIXNameString());
        assertEquals("15 - Trading at Settlement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.AON;
        assertEquals("16", enumType.toFIXIDString());
        assertEquals("AON", enumType.toFIXNameString());
        assertEquals("16 - All or None", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION;
        assertEquals("17", enumType.toFIXIDString());
        assertEquals("FUTURES_LARGE_ORDER_EXECUTION", enumType.toFIXNameString());
        assertEquals("17 - Futures Large Order Execution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.EFF;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("EFF", enumType.toFIXNameString());
        assertEquals("18 - Exchange of Futures for Futures (external market) (EFF)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.OPTION_INTERIM_TRADE;
        assertEquals("19", enumType.toFIXIDString());
        assertEquals("OPTION_INTERIM_TRADE", enumType.toFIXNameString());
        assertEquals("19 - Option Interim Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.OPTION_CABINET_TRADE;
        assertEquals("20", enumType.toFIXIDString());
        assertEquals("OPTION_CABINET_TRADE", enumType.toFIXNameString());
        assertEquals("20 - Option Cabinet Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES;
        assertEquals("22", enumType.toFIXIDString());
        assertEquals("PRIVATELY_NEGOTIATED_TRADES", enumType.toFIXNameString());
        assertEquals("22 - Privately Negotiated Trades", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS;
        assertEquals("23", enumType.toFIXIDString());
        assertEquals("SUBSTITUTION_OF_FUTURES_FORWARDS", enumType.toFIXNameString());
        assertEquals("23 - Substitution of Futures for Forwards", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  MiFID Values
         */
        enumType = Enum828TrdType.ERROR_TRADE;
        assertEquals("24", enumType.toFIXIDString());
        assertEquals("ERROR_TRADE", enumType.toFIXNameString());
        assertEquals("24 - Error trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.CD;
        assertEquals("25", enumType.toFIXIDString());
        assertEquals("CD", enumType.toFIXNameString());
        assertEquals("25 - Special cum dividend (CD)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.XD;
        assertEquals("26", enumType.toFIXIDString());
        assertEquals("XD", enumType.toFIXNameString());
        assertEquals("26 - Special ex dividend (XD)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.CC;
        assertEquals("27", enumType.toFIXIDString());
        assertEquals("CC", enumType.toFIXNameString());
        assertEquals("27 - Special cum coupon (CC)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.XC;
        assertEquals("28", enumType.toFIXIDString());
        assertEquals("XC", enumType.toFIXNameString());
        assertEquals("28 - Special ex coupon (XC)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.CS;
        assertEquals("29", enumType.toFIXIDString());
        assertEquals("CS", enumType.toFIXNameString());
        assertEquals("29 - Cash settlement (CS)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.SP;
        assertEquals("30", enumType.toFIXIDString());
        assertEquals("SP", enumType.toFIXNameString());
        assertEquals("30 - Special price (usually net- or all-in price) (SP)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.GD;
        assertEquals("31", enumType.toFIXIDString());
        assertEquals("GD", enumType.toFIXNameString());
        assertEquals("31 - Guaranteed delivery (GD)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.CR;
        assertEquals("32", enumType.toFIXIDString());
        assertEquals("CR", enumType.toFIXNameString());
        assertEquals("32 - Special cum rights (CR)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.XR;
        assertEquals("33", enumType.toFIXIDString());
        assertEquals("XR", enumType.toFIXNameString());
        assertEquals("33 - Special ex rights (XR)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.CP;
        assertEquals("34", enumType.toFIXIDString());
        assertEquals("CP", enumType.toFIXNameString());
        assertEquals("34 - Special cum capital repayments (CP)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.XP;
        assertEquals("35", enumType.toFIXIDString());
        assertEquals("XP", enumType.toFIXNameString());
        assertEquals("35 - Special ex capital repayments (XP)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.CB;
        assertEquals("36", enumType.toFIXIDString());
        assertEquals("CB", enumType.toFIXNameString());
        assertEquals("36 - Special cum bonus (CB)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.XB;
        assertEquals("37", enumType.toFIXIDString());
        assertEquals("XB", enumType.toFIXNameString());
        assertEquals("37 - Special ex bonus (XB)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.LARGE_TRADE;
        assertEquals("38", enumType.toFIXIDString());
        assertEquals("LARGE_TRADE", enumType.toFIXNameString());
        assertEquals("38 - Block trade (same as large trade)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.WORKED_PRINCIPAL_TRADE;
        assertEquals("39", enumType.toFIXIDString());
        assertEquals("WORKED_PRINCIPAL_TRADE", enumType.toFIXNameString());
        assertEquals("39 - Worked principal trade (UK-specific)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.BLOCK_TRADE_AFTER_MARKET;
        assertEquals("40", enumType.toFIXIDString());
        assertEquals("BLOCK_TRADE_AFTER_MARKET", enumType.toFIXNameString());
        assertEquals("40 - Block Trades - after market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.NAME_CHANGE;
        assertEquals("41", enumType.toFIXIDString());
        assertEquals("NAME_CHANGE", enumType.toFIXNameString());
        assertEquals("41 - Name change", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.PORTFOLIO_TRANSFER;
        assertEquals("42", enumType.toFIXIDString());
        assertEquals("PORTFOLIO_TRANSFER", enumType.toFIXNameString());
        assertEquals("42 - Portfolio transfer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.PROROGATION_BUY;
        assertEquals("43", enumType.toFIXIDString());
        assertEquals("PROROGATION_BUY", enumType.toFIXNameString());
        assertEquals("43 - Prorogation buy - Euronext Paris only. " +
                "Is used to defer settlement under French SRD (deferred settlement system). " +
                "Trades must be reported_as_crosses_zero_price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum828TrdType.PROROGATION_SELL;
        assertEquals("44", enumType.toFIXIDString());
        assertEquals("PROROGATION_SELL", enumType.toFIXNameString());
        assertEquals("44 - Prorogation sell - see prorogation buy", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.OPTION_EXERCISE;
        assertEquals("45", enumType.toFIXIDString());
        assertEquals("OPTION_EXERCISE", enumType.toFIXNameString());
        assertEquals("45 - Option exercise", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.DELTA_NEUTRAL_TRANSACTION;
        assertEquals("46", enumType.toFIXIDString());
        assertEquals("DELTA_NEUTRAL_TRANSACTION", enumType.toFIXNameString());
        assertEquals("46 - Delta neutral transaction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum828TrdType.FINANCING_TRANSACTION;
        assertEquals("47", enumType.toFIXIDString());
        assertEquals("FINANCING_TRANSACTION", enumType.toFIXNameString());
        assertEquals("47 - Financing transaction (includes repo and stock lending)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}