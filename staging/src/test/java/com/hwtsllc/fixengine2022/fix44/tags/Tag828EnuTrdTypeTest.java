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
import com.hwtsllc.fixengine2022.fix44.enums.Enum828TrdType;
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
 *  <p>    25 - Special cum dividend (CD)
 *  <p>    26 - Special ex dividend (XD)
 *  <p>    27 - Special cum coupon (CC)
 *  <p>    28 - Special ex coupon (XC)
 *  <p></p>
 *  <p>    29 - Cash settlement (CS)
 *  <p>    30 - Special price (usually net- or all-in price) (SP)
 *  <p>    31 - Guaranteed delivery (GD)
 *  <p>    32 - Special cum rights (CR)
 *  <p>    33 - Special ex rights (XR)
 *  <p></p>
 *  <p>    34 - Special cum capital repayments (CP)
 *  <p>    35 - Special ex capital repayments (XP)
 *  <p>    36 - Special cum bonus (CB)
 *  <p>    37 - Special ex bonus (XB)
 *  <p>    38 - Block trade (same as large trade)
 *  <p></p>
 *  <p>    39 - Worked principal trade (UK-specific)
 *  <p>    40 - Block Trades - after market
 *  <p>    41 - Name change
 *  <p>    42 - Portfolio transfer
 *  <p>    43 - Prorogation buy - Euronext Paris only.
 *  <p>         Is used to defer settlement under French SRD (deferred settlement system).
 *  <p>         Trades must be reported as crosses at zero price.
 *  <p></p>
 *  <p>    44 - Prorogation sell - see prorogation buy
 *  <p>    45 - Option exercise
 *  <p>    46 - Delta neutral transaction
 *  <p>    47 - Financing transaction (includes repo and stock lending)
 */
class Tag828EnuTrdTypeTest {
    @Test
    void FIX0828Test() {
        FIX44 fixData = FIX44.FIX828_ENU_TRD_TYPE;
        assertEquals( "828", fixData.toFIXIDString());
        assertEquals( "TRD_TYPE", fixData.toFIXNameString());
        assertEquals( "TrdType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0828Test() {
        Tag828EnuTrdType tagData;

        tagData = new Tag828EnuTrdType(Enum828TrdType.REGULAR_TRADE);
        assertEquals( Enum828TrdType.REGULAR_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE);
        assertEquals( Enum828TrdType.BLOCK_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFP);
        assertEquals( Enum828TrdType.EFP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.TRANSFER);
        assertEquals( Enum828TrdType.TRANSFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_TRADE);
        assertEquals( Enum828TrdType.LATE_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.T_TRADE);
        assertEquals( Enum828TrdType.T_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.WEIGHTED_AVERAGE_TRADE);
        assertEquals( Enum828TrdType.WEIGHTED_AVERAGE_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BUNCHED_TRADE);
        assertEquals( Enum828TrdType.BUNCHED_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_BUNCHED_TRADE);
        assertEquals( Enum828TrdType.LATE_BUNCHED_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIOR_REFERENCE_TRADE);
        assertEquals( Enum828TrdType.PRIOR_REFERENCE_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.AFTER_HOURS_TRADE);
        assertEquals( Enum828TrdType.AFTER_HOURS_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFR);
        assertEquals( Enum828TrdType.EFR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFS);
        assertEquals( Enum828TrdType.EFS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFM);
        assertEquals( Enum828TrdType.EFM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EOO);
        assertEquals( Enum828TrdType.EOO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.TRADING_AT_SETTLEMENT);
        assertEquals( Enum828TrdType.TRADING_AT_SETTLEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.AON);
        assertEquals( Enum828TrdType.AON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION);
        assertEquals( Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFF);
        assertEquals( Enum828TrdType.EFF.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_INTERIM_TRADE);
        assertEquals( Enum828TrdType.OPTION_INTERIM_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_CABINET_TRADE);
        assertEquals( Enum828TrdType.OPTION_CABINET_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES);
        assertEquals( Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS);
        assertEquals( Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  MiFID Values
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.ERROR_TRADE);
        assertEquals( Enum828TrdType.ERROR_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CD);
        assertEquals( Enum828TrdType.CD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XD);
        assertEquals( Enum828TrdType.XD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CC);
        assertEquals( Enum828TrdType.CC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XC);
        assertEquals( Enum828TrdType.XC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.CS);
        assertEquals( Enum828TrdType.CS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.SP);
        assertEquals( Enum828TrdType.SP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.GD);
        assertEquals( Enum828TrdType.GD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CR);
        assertEquals( Enum828TrdType.CR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XR);
        assertEquals( Enum828TrdType.XR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.CP);
        assertEquals( Enum828TrdType.CP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XP);
        assertEquals( Enum828TrdType.XP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CB);
        assertEquals( Enum828TrdType.CB.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XB);
        assertEquals( Enum828TrdType.XB.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LARGE_TRADE);
        assertEquals( Enum828TrdType.LARGE_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.WORKED_PRINCIPAL_TRADE);
        assertEquals( Enum828TrdType.WORKED_PRINCIPAL_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE_AFTER_MARKET);
        assertEquals( Enum828TrdType.BLOCK_TRADE_AFTER_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.NAME_CHANGE);
        assertEquals( Enum828TrdType.NAME_CHANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PORTFOLIO_TRANSFER);
        assertEquals( Enum828TrdType.PORTFOLIO_TRANSFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_BUY);
        assertEquals( Enum828TrdType.PROROGATION_BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_SELL);
        assertEquals( Enum828TrdType.PROROGATION_SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_EXERCISE);
        assertEquals( Enum828TrdType.OPTION_EXERCISE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.DELTA_NEUTRAL_TRANSACTION);
        assertEquals( Enum828TrdType.DELTA_NEUTRAL_TRANSACTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FINANCING_TRANSACTION);
        assertEquals( Enum828TrdType.FINANCING_TRANSACTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag828EnuTrdType tagData;

        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag828EnuTrdType tagData;

        // loop around the ENUM and process
        for (Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag828EnuTrdType tagData;

        // loop around the ENUM and process
        for (Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag828EnuTrdType tagData;

        // loop around the ENUM and process
        for (Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag828EnuTrdType tagData;

        // loop around the ENUM and process
        for (Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( "Tag828EnuTrdType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}