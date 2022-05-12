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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum828TrdType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Log828EnuTrdType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum828TrdType dataValue;

    public final static Enum828TrdType TESTA_ENU_TRD_TYPE
            = Enum828TrdType.ERROR_TRADE;
    public final static Enum828TrdType TESTB_ENU_TRD_TYPE
            = Enum828TrdType.BUNCHED_TRADE;

    public Log828EnuTrdType(Enum828TrdType dataValue) {
        setFixType(FIX44.FIX828_ENU_TRD_TYPE);
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
     * standard wrapper to format a simple string describing the data
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
        Log828EnuTrdType tagData;

        tagData = new Log828EnuTrdType(TESTA_ENU_TRD_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log828EnuTrdType(TESTB_ENU_TRD_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
