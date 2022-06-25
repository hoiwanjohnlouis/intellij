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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  FIX40 enum defines all the Financial Exchange Protocol's (FIX) fields.
 *  It consists of 3 fields.
 *  <p>
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Protocol document.
 *                      There may be a secondary prefix denoting the data type.
 *  <p>
 *  <p>                 BOOL = EnumType field
 *  <p>                 ENU = EnumType field
 *  <p>                 AMT = MyAmtType field, saved as double
 *  <p>                 CCY = MyCurrencyType field, saved as String
 *  <p>                 CHA = MyCharType field, saved as char
 *  <p>                 COU = MyCountryType field, saved as String
 *  <p>                 DAT = MyDataType field, saved as String
 *  <p>                 EXC = MyExchangeType field, saved as String
 *  <p>                 FLO = MyFloatType field, saved as float
 *  <p>                 INT = MyIntType field, saved as int
 *  <p>                 LEN = MyLengthType field, saved as int
 *  <p>                 LMD = MyLocalMktDateType field, saved as String
 *  <p>                 MMY = MyMonthYearType field, saved as String
 *  <p>                 NUM = MyNumInGroupType field, saved as int
 *  <p>                 PCT = MyPercentageType field, saved as String
 *  <p>                 PRC = MyPriceType field, saved as String
 *  <p>                 PXO = MyPriceOffsetType field, saved as String
 *  <p>                 QTY = MyQtyType field, saved as int
 *  <p>                 SEQ = MySeqNumType field, saved as int
 *  <p>                 STR = MyStringType field, saved as String
 *  <p>                 TZT = MyTZTimeOnlyType field, saved as String.  Expressed in local time with offset to UTC
 *  <p>                 UTC = MyUTCTimestampType field, saved as String
 *  <p>                 UTCD = MyUTCDateType field, saved as String
 *  <p>                 UTCT = MyUTCTimeType field, saved as String
 *  <p>                 others to follow
 *  <p>
 * String  id           The identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 *  <p>
 * String  name         The short NAME of the field as defined by the FIX protocol document, no duplicates
 *  <p>
 * String  description  A short blurb which describes what information the field contains
 */
public enum FIX40 implements LogFIXString, LogVerboseString {


    /*
     * Start of FIX4.0 as defined by the FIX Protocol Specification 4.0
     *  Tags: 114-140
     */
    FIX114_ENU_LOCATE_REQD(114, "LOCATE_REQD", "LocateReqd"),
    FIX115_STR_ON_BEHALF_OF_COMP_ID(115, "ON_BEHALF_OF_COMP_ID", "OnBehalfOfCompID"),
    FIX116_STR_ON_BEHALF_OF_SUB_ID(116, "ON_BEHALF_OF_SUB_ID", "OnBehalfOfSubID"),
    FIX117_STR_QUOTE_ID(117, "QUOTE_ID", "QuoteID"),
    FIX118_AMT_NET_MONEY(118, "NET_MONEY", "NetMoney"),
    FIX119_AMT_SETTL_CURR_AMT(119, "SETTL_CURR_AMT", "SettlCurrAmt"),
    FIX120_CCY_SETTL_CURRENCY(120, "SETTL_CURRENCY", "SettlCurrency"),

    FIX121_ENU_FOREX_REQ(121, "FOREX_REQ", "ForexReq"),
    FIX122_UTC_ORIG_SENDING_TIME(122, "ORIG_SENDING_TIME", "OrigSendingTime"),
    FIX123_ENU_GAP_FILL_FLAG(123, "GAP_FILL_FLAG", "GapFillFlag"),
    FIX124_NUM_NO_EXECS(124, "NO_EXECS", "NoExecs"),
    FIX125_STR_CXL_TYPE(125, "CXL_TYPE", "CxlType (no longer used)"),
    FIX126_UTC_EXPIRE_TIME(126, "EXPIRE_TIME", "ExpireTime"),
    FIX127_ENU_DK_REASON(127, "DK_REASON", "DKReason"),
    FIX128_STR_DELIVER_TO_COMP_ID(128, "DELIVER_TO_COMP_ID", "DeliverToCompID"),
    FIX129_STR_DELIVER_TO_SUB_ID(129, "DELIVER_TO_SUB_ID", "DeliverToSubID"),
    FIX130_ENU_IOI_NATURAL_FLAG(130, "IOI_NATURAL_FLAG", "IOINaturalFlag"),

    FIX131_STR_QUOTE_REQ_ID(131, "QUOTE_REQ_ID", "QuoteReqID"),
    FIX132_PRC_BID_PX(132, "BID_PX", "BidPx"),
    FIX133_PRC_OFFER_PX(133, "OFFER_PX", "OfferPx"),
    FIX134_QTY_BID_SIZE(134, "BID_SIZE", "BidSize"),
    FIX135_QTY_OFFER_SIZE(135, "OFFER_SIZE", "OfferSize"),
    FIX136_NUM_NO_MISC_FEES(136, "NO_MISC_FEES", "NoMiscFees"),
    FIX137_AMT_MISC_FEE_AMT(137, "MISC_FEE_AMT", "MiscFeeAmt"),
    FIX138_CCY_MISC_FEE_CURR(138, "MISC_FEE_CURR", "MiscFeeCurr"),
    FIX139_ENU_MISC_FEE_TYPE(139, "MISC_FEE_TYPE", "MiscFeeType"),
    FIX140_PRC_PREV_CLOSE_PX(140, "PREV_CLOSE_PX", "PrevClosePx"),
    /*
     *
     * End of FIX4.0
     *
     */


    ;


    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////


    private final String id;
    private final String name;
    private final String description;

    FIX40(final int id, final String name, final String description) {
        /*
         *  Even though fixNumber is an *int*, this app treats it as a String,
         *  so convert the field at load time instead of changing the lines.
         *
         *  todo: convert all definition lines to be String instead of int.
         *
         */
        this.id = String.valueOf(id);
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific ID code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (FIX40 oneFIX : FIX40.values()) {
            System.out.println(oneFIX);
        }
    }
}
