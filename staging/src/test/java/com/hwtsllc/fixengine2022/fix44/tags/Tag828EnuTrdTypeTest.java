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
class Tag828EnuTrdTypeTest {
    Tag828EnuTrdType tagData;

    @Test
    void FIXTest() {
    }
    @Test
    void Tag0828Test() {
        /*
         *  <p>    0 - Regular Trade
         *  <p>    1 - Block Trade
         *  <p>    2 - EFP (Exchange for physical)
         *  <p>    3 - Transfer
         *  <p>    4 - Late Trade
         */
        tagData = new Tag828EnuTrdType( Enum828TrdType.REGULAR_TRADE );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFP);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.TRANSFER);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_TRADE);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - T Trade
         *  <p>    6 - Weighted Average Price Trade
         *  <p>    7 - Bunched Trade
         *  <p>    8 - Late Bunched Trade
         *  <p>    9 - Prior Reference Price Trade
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.T_TRADE);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.WEIGHTED_AVERAGE_TRADE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.BUNCHED_TRADE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LATE_BUNCHED_TRADE);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIOR_REFERENCE_TRADE);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    10 - After Hours Trade
         *  <p>    11 - Exchange for Risk (EFR)
         *  <p>    12 - Exchange for Swap (EFS)
         *  <p>    13 - Exchange of Futures for (in Market) Futures (EFM)
         *              (e,g, full sized for mini)
         *  <p>    14 - Exchange of Options for Options (EOO)
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.AFTER_HOURS_TRADE);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFR);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFS);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFM);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EOO);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    15 - Trading at Settlement
         *  <p>    16 - All or None
         *  <p>    17 - Futures Large Order Execution
         *  <p>    18 - Exchange of Futures for Futures (external market) (EFF)
         *  <p>    19 - Option Interim Trade
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.TRADING_AT_SETTLEMENT);
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.AON);
        assertEquals( "16", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FUTURES_LARGE_ORDER_EXECUTION);
        assertEquals( "17", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.EFF);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_INTERIM_TRADE);
        assertEquals( "19", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    20 - Option Cabinet Trade
         *  <p>    22 - Privately Negotiated Trades
         *  <p>    23 - Substitution of Futures for Forwards
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_CABINET_TRADE);
        assertEquals( "20", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PRIVATELY_NEGOTIATED_TRADES);
        assertEquals( "22", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.SUBSTITUTION_OF_FUTURES_FORWARDS);
        assertEquals( "23", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    24 - Error trade
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.ERROR_TRADE);
        assertEquals( "24", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    25 - Special cum dividend (CD)
         *  <p>    26 - Special ex dividend (XD)
         *  <p>    27 - Special cum coupon (CC)
         *  <p>    28 - Special ex coupon (XC)
         *  <p>    29 - Cash settlement (CS)
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.CD);
        assertEquals( "25", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XD);
        assertEquals( "26", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CC);
        assertEquals( "27", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XC);
        assertEquals( "28", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CS);
        assertEquals( "29", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    30 - Special price (usually net- or all-in price) (SP)
         *  <p>    31 - Guaranteed delivery (GD)
         *  <p>    32 - Special cum rights (CR)
         *  <p>    33 - Special ex rights (XR)
         *  <p>    34 - Special cum capital repayments (CP)
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.SP);
        assertEquals( "30", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.GD);
        assertEquals( "31", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CR);
        assertEquals( "32", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XR);
        assertEquals( "33", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CP);
        assertEquals( "34", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    35 - Special ex capital repayments (XP)
         *  <p>    36 - Special cum bonus (CB)
         *  <p>    37 - Special ex bonus (XB)
         *  <p>    38 - Block trade (same as large trade)
         *  <p>    39 - Worked principal trade (UK-specific)
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.XP);
        assertEquals( "35", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.CB);
        assertEquals( "36", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.XB);
        assertEquals( "37", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.LARGE_TRADE);
        assertEquals( "38", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.WORKED_PRINCIPAL_TRADE);
        assertEquals( "39", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    40 - Block Trades - after market
         *  <p>    41 - Name change
         *  <p>    42 - Portfolio transfer
         *  <p>    43 - Prorogation buy - Euronext Paris only.
         *  <p>         Is used to defer settlement under French SRD (deferred settlement system).
         *  <p>         Trades must be reported as crosses at zero price.
         *  <p>    44 - Prorogation sell - see prorogation buy
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.BLOCK_TRADE_AFTER_MARKET);
        assertEquals( "40", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.NAME_CHANGE);
        assertEquals( "41", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PORTFOLIO_TRANSFER);
        assertEquals( "42", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_BUY);
        assertEquals( "43", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.PROROGATION_SELL);
        assertEquals( "44", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MiFID Values
         *  <p>    45 - Option exercise
         *  <p>    46 - Delta neutral transaction
         *  <p>    47 - Financing transaction (includes repo and stock lending)
         */
        tagData = new Tag828EnuTrdType(Enum828TrdType.OPTION_EXERCISE);
        assertEquals( "45", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.DELTA_NEUTRAL_TRANSACTION);
        assertEquals( "46", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag828EnuTrdType(Enum828TrdType.FINANCING_TRANSACTION);
        assertEquals( "47", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( "FIX828_ENU_TRD_TYPE", tagData.toEnumLabelString());
            assertEquals( "828", tagData.toEnumIDString());
            assertEquals( "TRD_TYPE", tagData.toEnumNameString());
            assertEquals( "TrdType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum828TrdType oneEnum : Enum828TrdType.values()) {
            tagData = new Tag828EnuTrdType(oneEnum);
            assertEquals( "Tag828EnuTrdType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}