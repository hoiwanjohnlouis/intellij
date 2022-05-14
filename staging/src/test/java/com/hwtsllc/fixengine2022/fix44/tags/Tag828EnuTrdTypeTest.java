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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum828TrdType;
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
class Tag828EnuTrdTypeTest {
    @Test
    void FIX0828Test() {
        FIX44 fixData = FIX44.FIX828_ENU_TRD_TYPE;
        assertEquals( "828", fixData.getID());
        assertEquals( "TRD_TYPE", fixData.getName());
        assertEquals( "TrdType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0828Test() {
        Tag828EnuTrdType tagData;

        tagData = new Tag828EnuTrdType(Enum828TrdType.REGULAR_TRADE);
        assertEquals( Enum828TrdType.REGULAR_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE);
        assertEquals( Enum828TrdType.BLOCK_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFP);
        assertEquals( Enum828TrdType.EFP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.TRANSFER);
        assertEquals( Enum828TrdType.TRANSFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_TRADE);
        assertEquals( Enum828TrdType.LATE_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.T_TRADE);
        assertEquals( Enum828TrdType.T_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.WEIGHTED_AVERAGE_TRADE);
        assertEquals( Enum828TrdType.WEIGHTED_AVERAGE_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BUNCHED_TRADE);
        assertEquals( Enum828TrdType.BUNCHED_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_BUNCHED_TRADE);
        assertEquals( Enum828TrdType.LATE_BUNCHED_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIOR_REFERENCE_TRADE);
        assertEquals( Enum828TrdType.PRIOR_REFERENCE_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.AFTER_HOURS_TRADE);
        assertEquals( Enum828TrdType.AFTER_HOURS_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFR);
        assertEquals( Enum828TrdType.EFR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFS);
        assertEquals( Enum828TrdType.EFS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFM);
        assertEquals( Enum828TrdType.EFM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EOO);
        assertEquals( Enum828TrdType.EOO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.TRADING_AT_SETTLEMENT);
        assertEquals( Enum828TrdType.TRADING_AT_SETTLEMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.AON);
        assertEquals( Enum828TrdType.AON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION);
        assertEquals( Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFF);
        assertEquals( Enum828TrdType.EFF.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_INTERIM_TRADE);
        assertEquals( Enum828TrdType.OPTION_INTERIM_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_CABINET_TRADE);
        assertEquals( Enum828TrdType.OPTION_CABINET_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES);
        assertEquals( Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS);
        assertEquals( Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  MiFID Values
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.ERROR_TRADE);
        assertEquals( Enum828TrdType.ERROR_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CD);
        assertEquals( Enum828TrdType.CD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XD);
        assertEquals( Enum828TrdType.XD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CC);
        assertEquals( Enum828TrdType.CC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XC);
        assertEquals( Enum828TrdType.XC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.CS);
        assertEquals( Enum828TrdType.CS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.SP);
        assertEquals( Enum828TrdType.SP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.GD);
        assertEquals( Enum828TrdType.GD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CR);
        assertEquals( Enum828TrdType.CR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XR);
        assertEquals( Enum828TrdType.XR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.CP);
        assertEquals( Enum828TrdType.CP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XP);
        assertEquals( Enum828TrdType.XP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CB);
        assertEquals( Enum828TrdType.CB.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XB);
        assertEquals( Enum828TrdType.XB.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LARGE_TRADE);
        assertEquals( Enum828TrdType.LARGE_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.WORKED_PRINCIPAL_TRADE);
        assertEquals( Enum828TrdType.WORKED_PRINCIPAL_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE_AFTER_MARKET);
        assertEquals( Enum828TrdType.BLOCK_TRADE_AFTER_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.NAME_CHANGE);
        assertEquals( Enum828TrdType.NAME_CHANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PORTFOLIO_TRANSFER);
        assertEquals( Enum828TrdType.PORTFOLIO_TRANSFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_BUY);
        assertEquals( Enum828TrdType.PROROGATION_BUY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_SELL);
        assertEquals( Enum828TrdType.PROROGATION_SELL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_EXERCISE);
        assertEquals( Enum828TrdType.OPTION_EXERCISE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.DELTA_NEUTRAL_TRANSACTION);
        assertEquals( Enum828TrdType.DELTA_NEUTRAL_TRANSACTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FINANCING_TRANSACTION);
        assertEquals( Enum828TrdType.FINANCING_TRANSACTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}