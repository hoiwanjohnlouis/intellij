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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 * FIX40 enum defines all the Financial Exchange Protocol's (FIX) fields.
 * It consists of 3 fields.
 *
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Prootocol document.
 *                      There may be a secondary prefix denoting the data type.
 *                      ET = EnumType field
 *                      ST = StringType field
 *                      NIGT = NumInGroupType field, saved as int
 *                      LT = LengthType field, saved as int
 *                      QT = QtyType field, saved as int
 *                      SNT = SeqNumType field, saved as int
 *                      others to follow
 * String  id           this is the identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 * String  name         short NAME of the field as defined by the FIX protocol document, no duplicates
 * String  description  a short blurb which describes what information the field contains
 */
public enum FIX40 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX4.0 as defined by the FIX Protocol Specification 4.0
     *  Tags: 114-140
     */
    FIX114_ET_LOCATE_REQD(114, "LOCATE_REQD", "LocateReqd"),
    FIX115_ON_BEHALF_OF_COMP_ID(115, "ON_BEHALF_OF_COMP_ID", "OnBehalfOfCompID"),
    FIX116_ON_BEHALF_OF_SUB_ID(116, "ON_BEHALF_OF_SUB_ID", "OnBehalfOfSubID"),
    FIX117_QUOTE_ID(117, "QUOTE_ID", "QuoteID"),
    FIX118_NET_MONEY(118, "NET_MONEY", "NetMoney"),
    FIX119_SETTL_CURR_AMT(119, "SETTL_CURR_AMT", "SettlCurrAmt"),
    FIX120_SETTL_CURRENCY(120, "SETTL_CURRENCY", "SettlCurrency"),

    FIX121_ET_FOREX_REQ(121, "FOREX_REQ", "ForexReq"),
    FIX122_ORIG_SENDING_TIME(122, "ORIG_SENDING_TIME", "OrigSendingTime"),
    FIX123_ET_GAP_FILL_FLAG(123, "GAP_FILL_FLAG", "GapFillFlag"),
    FIX124_NO_EXECS(124, "NO_EXECS", "NoExecs"),
    FIX125_CXL_TYPE(125, "CXL_TYPE", "CxlType (no longer used)"),
    FIX126_EXPIRE_TIME(126, "EXPIRE_TIME", "ExpireTime"),
    FIX127_ET_DK_REASON(127, "DK_REASON", "DKReason"),
    FIX128_DELIVER_TO_COMP_ID(128, "DELIVER_TO_COMP_ID", "DeliverToCompID"),
    FIX129_DELIVER_TO_SUB_ID(129, "DELIVER_TO_SUB_ID", "DeliverToSubID"),
    FIX130_ET_IOI_NATURAL_FLAG(130, "IOI_NATURAL_FLAG", "IOINaturalFlag"),

    FIX131_QUOTE_REQ_ID(131, "QUOTE_REQ_ID", "QuoteReqID"),
    FIX132_BID_PX(132, "BID_PX", "BidPx"),
    FIX133_OFFER_PX(133, "OFFER_PX", "OfferPx"),
    FIX134_BID_SIZE(134, "BID_SIZE", "BidSize"),
    FIX135_OFFER_SIZE(135, "OFFER_SIZE", "OfferSize"),
    FIX136_NO_MISC_FEES(136, "NO_MISC_FEES", "NoMiscFees"),
    FIX137_MISC_FEE_AMT(137, "MISC_FEE_AMT", "MiscFeeAmt"),
    FIX138_MISC_FEE_CURR(138, "MISC_FEE_CURR", "MiscFeeCurr"),
    FIX139_ET_MISC_FEE_TYPE(139, "MISC_FEE_TYPE", "MiscFeeType"),
    FIX140_PREV_CLOSE_PX(140, "PREV_CLOSE_PX", "PrevClosePx"),
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

    /*
     * used in @Test routine.
     */
    public final static String JUNK_ENUM_NAME = "JunkEnumName";
    public final static String JUNK_ID = "JunkID";
    public final static String JUNK_NAME = "JunkName";
    public final static String JUNK_DESCRIPTION = "JunkDescription";
    public final static String JUNK_ST_DATA_VALUE = "JunkDataValue";
    public final static int JUNK_LT_DATA_VALUE = -65535;
    public final static int JUNK_NIGT_DATA_VALUE = -65535;
    public final static int JUNK_QT_DATA_VALUE = -65535;
    public final static int JUNK_SNT_DATA_VALUE = -65535;

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

    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific ID code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(getID())
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(getDescription())
                .concat("]");
    }
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
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
