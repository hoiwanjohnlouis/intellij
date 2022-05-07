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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum828TrdTypeTest {
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
    @Test
    void EnumTest() {
        Enum828TrdType enumType;

        enumType = Enum828TrdType.REGULAR_TRADE;
        assertEquals("0", enumType.getID());
        assertEquals("REGULAR_TRADE", enumType.getName());
        assertEquals("0 - Regular Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.BLOCK_TRADE;
        assertEquals("1", enumType.getID());
        assertEquals("BLOCK_TRADE", enumType.getName());
        assertEquals("1 - Block Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EFP;
        assertEquals("2", enumType.getID());
        assertEquals("EFP", enumType.getName());
        assertEquals("2 - EFP (Exchange for physical)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.TRANSFER;
        assertEquals("3", enumType.getID());
        assertEquals("TRANSFER", enumType.getName());
        assertEquals("3 - Transfer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.LATE_TRADE;
        assertEquals("4", enumType.getID());
        assertEquals("LATE_TRADE", enumType.getName());
        assertEquals("4 - Late Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.T_TRADE;
        assertEquals("5", enumType.getID());
        assertEquals("T_TRADE", enumType.getName());
        assertEquals("5 - T Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.WEIGHTED_AVERAGE_TRADE;
        assertEquals("6", enumType.getID());
        assertEquals("WEIGHTED_AVERAGE_TRADE", enumType.getName());
        assertEquals("6 - Weighted Average Price Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.BUNCHED_TRADE;
        assertEquals("7", enumType.getID());
        assertEquals("BUNCHED_TRADE", enumType.getName());
        assertEquals("7 - Bunched Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.LATE_BUNCHED_TRADE;
        assertEquals("8", enumType.getID());
        assertEquals("LATE_BUNCHED_TRADE", enumType.getName());
        assertEquals("8 - Late Bunched Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.PRIOR_REFERENCE_TRADE;
        assertEquals("9", enumType.getID());
        assertEquals("PRIOR_REFERENCE_TRADE", enumType.getName());
        assertEquals("9 - Prior Reference Price Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.AFTER_HOURS_TRADE;
        assertEquals("10", enumType.getID());
        assertEquals("AFTER_HOURS_TRADE", enumType.getName());
        assertEquals("10 - After Hours Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EFR;
        assertEquals("11", enumType.getID());
        assertEquals("EFR", enumType.getName());
        assertEquals("11 - Exchange for Risk (EFR)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EFS;
        assertEquals("12", enumType.getID());
        assertEquals("EFS", enumType.getName());
        assertEquals("12 - Exchange for Swap (EFS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EFM;
        assertEquals("13", enumType.getID());
        assertEquals("EFM", enumType.getName());
        assertEquals("13 - Exchange of Futures for (in Market) Futures (EFM) (e,g, full sized for mini)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EOO;
        assertEquals("14", enumType.getID());
        assertEquals("EOO", enumType.getName());
        assertEquals("14 - Exchange of Options for Options (EOO)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.TRADING_AT_SETTLEMENT;
        assertEquals("15", enumType.getID());
        assertEquals("TRADING_AT_SETTLEMENT", enumType.getName());
        assertEquals("15 - Trading at Settlement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.AON;
        assertEquals("16", enumType.getID());
        assertEquals("AON", enumType.getName());
        assertEquals("16 - All or None", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION;
        assertEquals("17", enumType.getID());
        assertEquals("FUTURES_LARGE_ORDER_EXECUTION", enumType.getName());
        assertEquals("17 - Futures Large Order Execution", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.EFF;
        assertEquals("18", enumType.getID());
        assertEquals("EFF", enumType.getName());
        assertEquals("18 - Exchange of Futures for Futures (external market) (EFF)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.OPTION_INTERIM_TRADE;
        assertEquals("19", enumType.getID());
        assertEquals("OPTION_INTERIM_TRADE", enumType.getName());
        assertEquals("19 - Option Interim Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.OPTION_CABINET_TRADE;
        assertEquals("20", enumType.getID());
        assertEquals("OPTION_CABINET_TRADE", enumType.getName());
        assertEquals("20 - Option Cabinet Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES;
        assertEquals("21", enumType.getID());
        assertEquals("PRIVATELY_NEGOTIATED_TRADES", enumType.getName());
        assertEquals("22 - Privately Negotiated Trades", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS;
        assertEquals("22", enumType.getID());
        assertEquals("SUBSTITUTION_OF_FUTURES_FORWARDS", enumType.getName());
        assertEquals("23 - Substitution of Futures for Forwards", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  MiFID Values
         */
        enumType = Enum828TrdType.ERROR_TRADE;
        assertEquals("24", enumType.getID());
        assertEquals("ERROR_TRADE", enumType.getName());
        assertEquals("24 - Error trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.CD;
        assertEquals("25", enumType.getID());
        assertEquals("CD", enumType.getName());
        assertEquals("25 - Special cum dividend (CD)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.XD;
        assertEquals("26", enumType.getID());
        assertEquals("XD", enumType.getName());
        assertEquals("26 - Special ex dividend (XD)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.CC;
        assertEquals("27", enumType.getID());
        assertEquals("CC", enumType.getName());
        assertEquals("27 - Special cum coupon (CC)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.XC;
        assertEquals("28", enumType.getID());
        assertEquals("XC", enumType.getName());
        assertEquals("28 - Special ex coupon (XC)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.CS;
        assertEquals("29", enumType.getID());
        assertEquals("CS", enumType.getName());
        assertEquals("29 - Cash settlement (CS)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.SP;
        assertEquals("30", enumType.getID());
        assertEquals("SP", enumType.getName());
        assertEquals("30 - Special price (usually net- or all-in price) (SP)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.GD;
        assertEquals("31", enumType.getID());
        assertEquals("GD", enumType.getName());
        assertEquals("31 - Guaranteed delivery (GD)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.CR;
        assertEquals("32", enumType.getID());
        assertEquals("CR", enumType.getName());
        assertEquals("32 - Special cum rights (CR)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.XR;
        assertEquals("33", enumType.getID());
        assertEquals("XR", enumType.getName());
        assertEquals("33 - Special ex rights (XR)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.CP;
        assertEquals("34", enumType.getID());
        assertEquals("CP", enumType.getName());
        assertEquals("34 - Special cum capital repayments (CP)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.XP;
        assertEquals("35", enumType.getID());
        assertEquals("XP", enumType.getName());
        assertEquals("35 - Special ex capital repayments (XP)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.CB;
        assertEquals("36", enumType.getID());
        assertEquals("CB", enumType.getName());
        assertEquals("36 - Special cum bonus (CB)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.XB;
        assertEquals("37", enumType.getID());
        assertEquals("XB", enumType.getName());
        assertEquals("37 - Special ex bonus (XB)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.LARGE_TRADE;
        assertEquals("38", enumType.getID());
        assertEquals("LARGE_TRADE", enumType.getName());
        assertEquals("38 - Block trade (same as large trade)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.WORKED_PRINCIPAL_TRADE;
        assertEquals("39", enumType.getID());
        assertEquals("WORKED_PRINCIPAL_TRADE", enumType.getName());
        assertEquals("39 - Worked principal trade (UK-specific)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.BLOCK_TRADE_AFTER_MARKET;
        assertEquals("40", enumType.getID());
        assertEquals("BLOCK_TRADE_AFTER_MARKET", enumType.getName());
        assertEquals("40 - Block Trades - after market", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.NAME_CHANGE;
        assertEquals("41", enumType.getID());
        assertEquals("NAME_CHANGE", enumType.getName());
        assertEquals("41 - Name change", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.PORTFOLIO_TRANSFER;
        assertEquals("42", enumType.getID());
        assertEquals("PORTFOLIO_TRANSFER", enumType.getName());
        assertEquals("42 - Portfolio transfer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.PROROGATION_BUY;
        assertEquals("43", enumType.getID());
        assertEquals("PROROGATION_BUY", enumType.getName());
        assertEquals("43 - Prorogation buy - Euronext Paris only. " +
                "Is used to defer settlement under French SRD (deferred settlement system). " +
                "Trades must be reported_as_crosses_zero_price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum828TrdType.PROROGATION_SELL;
        assertEquals("44", enumType.getID());
        assertEquals("PROROGATION_SELL", enumType.getName());
        assertEquals("44 - Prorogation sell - see prorogation buy", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.OPTION_EXERCISE;
        assertEquals("45", enumType.getID());
        assertEquals("OPTION_EXERCISE", enumType.getName());
        assertEquals("45 - Option exercise", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.DELTA_NEUTRAL_TRANSACTION;
        assertEquals("46", enumType.getID());
        assertEquals("DELTA_NEUTRAL_TRANSACTION", enumType.getName());
        assertEquals("46 - Delta neutral transaction", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum828TrdType.FINANCING_TRANSACTION;
        assertEquals("47", enumType.getID());
        assertEquals("FINANCING_TRANSACTION", enumType.getName());
        assertEquals("47 - Financing transaction (includes repo and stock lending)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}