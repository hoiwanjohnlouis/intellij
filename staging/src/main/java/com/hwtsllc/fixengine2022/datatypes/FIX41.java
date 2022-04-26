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
 * FIX41 enum defines all the Financial Exchange Protocol's (FIX) fields.
 * It consists of 3 fields.
 *
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Prootocol document.
 *                      There may be a secondary prefix denoting the data type.
 *                      BOOL = EnumType field
 *                      ENU = EnumType field
 *                      AMT = MyAmtType field
 *                      COU = MyCountryType field
 *                      DAT = MyDataType field
 *                      EXC = MyExchangeType field, saved as String
 *                      FLO = MyFloatType field, saved as String
 *                      INT = MyIntType field, saved as int
 *                      LEN = MyLengthType field, saved as int
 *                      LMD = MyLocalMktDateType field, saved as String
 *                      NUM = MyNumInGroupType field, saved as int
 *                      PCT = MyPercentageType field, saved as String
 *                      PRC = MyPriceType field, saved as String
 *                      PXO = MyPriceOffsetType field, saved as String
 *                      QTY = MyQtyType field, saved as int
 *                      SEQ = MySeqNumType field, saved as int
 *                      STR = MyStringType field, saved as String
 *                      UTC = MyUTCTimestampType field, saved as String
 *                      others to follow
 * String  id           The identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 * String  name         The short NAME of the field as defined by the FIX protocol document, no duplicates
 * String  description  A short blurb which describes what information the field contains
 */
public enum FIX41 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX4.1 as defined by the FIX Protocol Specification 4.1
     *  Tags: 141-211
     */
    FIX141_BOOL_RESET_SEQ_NUM_FLAG(141, "RESET_SEQ_NUM_FLAG", "ResetSeqNumFlag"),
    FIX142_STR_SENDER_LOCATION_ID(142, "SENDER_LOCATION_ID", "SenderLocationID"),
    FIX143_STR_TARGET_LOCATION_ID(143, "TARGET_LOCATION_ID", "TargetLocationID"),
    FIX144_STR_ON_BEHALF_OF_LOCATION_ID(144, "ON_BEHALF_OF_LOCATION_ID", "OnBehalfOfLocationID"),
    FIX145_STR_DELIVER_TO_LOCATION_ID(145, "DELIVER_TO_LOCATION_ID", "DeliverToLocationID"),
    FIX146_NUM_NO_RELATED_SYM(146, "NO_RELATED_SYM", "NoRelatedSym"),
    FIX147_STR_SUBJECT(147, "SUBJECT", "Subject"),
    FIX148_STR_HEADLINE(148, "HEADLINE", "Headline"),
    FIX149_STR_URL_LINK(149, "URL_LINK", "URLLink"),
    FIX150_ENU_EXEC_TYPE(150, "EXEC_TYPE", "ExecType"),

    FIX151_QTY_LEAVES_QTY(151, "LEAVES_QTY", "LeavesQty"),
    FIX152_QTY_CASH_ORDER_QTY(152, "CASH_ORDER_QTY", "CashOrderQty"),
    FIX153_PRC_ALLOC_AVG_PX(153, "ALLOC_AVG_PX", "AllocAvgPx"),
    FIX154_AMT_ALLOC_NET_MONEY(154, "ALLOC_NET_MONEY", "AllocNetMoney"),
    FIX155_FLO_SETTL_CURR_FX_RATE(155, "SETTL_CURR_FX_RATE", "SettlCurrFxRate"),
    FIX156_SETTL_CURR_FX_RATE_CALC(156, "SETTL_CURR_FX_RATE_CALC", "SettlCurrFxRateCalc"),
    FIX157_INT_NUM_DAYS_INTEREST(157, "NUM_DAYS_INTEREST", "NumDaysInterest"),
    FIX158_PCT_ACCRUED_INTEREST_RATE(158, "ACCRUED_INTEREST_RATE", "AccruedInterestRate"),
    FIX159_AMT_ACCRUED_INTEREST_AMT(159, "ACCRUED_INTEREST_AMT", "AccruedInterestAmt"),
    FIX160_ENU_SETTL_INST_MODE(160, "SETTL_INST_MODE", "SettlInstMode"),

    FIX161_STR_ALLOC_TEXT(161, "ALLOC_TEXT", "AllocText"),
    FIX162_STR_SETTL_INST_ID(162, "SETTL_INST_ID", "SettlInstID"),
    FIX163_ENU_SETTL_INST_TRANS_TYPE(163, "SETTL_INST_TRANS_TYPE", "SettlInstTransType"),
    FIX164_STR_EMAIL_THREAD_ID(164, "EMAIL_THREAD_ID", "EmailThreadID"),
    FIX165_ENU_SETTL_INST_SOURCE(165, "SETTL_INST_SOURCE", "SettlInstSource"),
    FIX166_ENU_SETTL_LOCATION(166, "SETTL_LOCATION", "SettlLocation (replaced)"),
    FIX167_ENU_SECURITY_TYPE(167, "SECURITY_TYPE", "SecurityType"),
    FIX168_UTC_EFFECTIVE_TIME(168, "EFFECTIVE_TIME", "EffectiveTime"),
    FIX169_ENU_STAND_INST_DB_TYPE(169, "STAND_INST_DB_TYPE", "StandInstDbType"),
    FIX170_STR_STAND_INST_DB_NAME(170, "STAND_INST_DB_NAME", "StandInstDbName"),

    FIX171_STR_STAND_INST_DB_ID(171, "STAND_INST_DB_ID", "StandInstDbID"),
    FIX172_ENU_SETTL_DELIVERY_TYPE(172, "SETTL_DELIVERY_TYPE", "SettlDeliveryType"),
    FIX173_STR_SETTL_DEPOSITORY_CODE(173, "SETTL_DEPOSITORY_CODE", "SettlDepositoryCode (replaced)"),
    FIX174_STR_SETTL_BRKR_CODE(174, "SETTL_BRKR_CODE", "SettlBrkrCode (replaced)"),
    FIX175_STR_SETTL_INST_CODE(175, "SETTL_INST_CODE", "SettlInstCode (replaced)"),
    FIX176_STR_SECURITY_SETTL_AGENT_NAME(176, "SECURITY_SETTL_AGENT_NAME", "SecuritySettlAgentName (replaced)"),
    FIX177_STR_SECURITY_SETTL_AGENT_CODE(177, "SECURITY_SETTL_AGENT_CODE", "SecuritySettlAgentCode (replaced)"),
    FIX178_STR_SECURITY_SETTL_AGENT_ACCT_NUM(178, "SECURITY_SETTL_AGENT_ACCT_NUM", "SecuritySettlAgentAcctNum (replaced)"),
    FIX179_STR_SECURITY_SETTL_AGENT_ACCT_NAME(179, "SECURITY_SETTL_AGENT_ACCT_NAME", "SecuritySettlAgentAcctName (replaced)"),
    FIX180_STR_SECURITY_SETTL_AGENT_CONTACT_NAME(180, "SECURITY_SETTL_AGENT_CONTACT_NAME", "SecuritySettlAgentContactName (replaced)"),

    FIX181_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE(181, "SECURITY_SETTL_AGENT_CONTACT_PHONE", "SecuritySettlAgentContactPhone (replaced)"),
    FIX182_STR_CASH_SETTL_AGENT_NAME(182, "CASH_SETTL_AGENT_NAME", "CashSettlAgentName (replaced)"),
    FIX183_STR_CASH_SETTL_AGENT_CODE(183, "CASH_SETTL_AGENT_CODE", "CashSettlAgentCode (replaced)"),
    FIX184_STR_CASH_SETTL_AGENT_ACCT_NUM(184, "CASH_SETTL_AGENT_ACCT_NUM", "CashSettlAgentAcctNum (replaced)"),
    FIX185_STR_CASH_SETTL_AGENT_ACCT_NAME(185, "CASH_SETTL_AGENT_ACCT_NAME", "CashSettlAgentAcctName (replaced)"),
    FIX186_STR_CASH_SETTL_AGENT_CONTACT_NAME(186, "CASH_SETTL_AGENT_CONTACT_NAME", "CashSettlAgentContactName (replaced)"),
    FIX187_STR_CASH_SETTL_AGENT_CONTACT_PHONE(187, "CASH_SETTL_AGENT_CONTACT_PHONE", "CashSettlAgentContactPhone (replaced)"),
    FIX188_PRC_BID_SPOT_RATE(188, "BID_SPOT_RATE", "BidSpotRate"),
    FIX189_PXO_BID_FORWARD_POINTS(189, "BID_FORWARD_POINTS", "BidForwardPoints"),
    FIX190_PRC_OFFER_SPOT_RATE(190, "OFFER_SPOT_RATE", "OfferSpotRate"),

    FIX191_PXO_OFFER_FORWARD_POINTS(191, "OFFER_FORWARD_POINTS", "OfferForwardPoints"),
    FIX192_QTY_ORDER_QTY_2(192, "ORDER_QTY_2", "OrderQty2"),
    FIX193_LMD_SETTL_DATE_2(193, "FUT_SETT_DATE_2", "FutSettDate2"),
    FIX194_PRC_LAST_SPOT_RATE(194, "LAST_SPOT_RATE", "LastSpotRate"),
    FIX195_PXO_LAST_FORWARD_POINTS(195, "LAST_FORWARD_POINTS", "LastForwardPoints"),
    FIX196_STR_ALLOC_LINK_ID(196, "ALLOC_LINK_ID", "AllocLinkID"),
    FIX197_ENU_ALLOC_LINK_TYPE(197, "ALLOC_LINK_TYPE", "AllocLinkType"),
    FIX198_STR_SECONDARY_ORDER_ID(198, "SECONDARY_ORDER_ID", "SecondaryOrderID"),
    FIX199_NUM_NO_IOI_QUALIFIERS(199, "NO_IOI_QUALIFIERS", "NoIOIQualifiers"),
    FIX200_STR_MATURITY_MONTH_YEAR(200, "MATURITY_MONTH_YEAR", "MaturityMonthYear"),


    // 201-300

    FIX201_ENU_PUT_OR_CALL(201, "PUT_OR_CALL", "PutOrCall (replaced)"),
    FIX202_PRC_STRIKE_PRICE(202, "STRIKE_PRICE", "StrikePrice"),
    FIX203_ENU_COVERED_OR_UNCOVERED(203, "COVERED_OR_UNCOVERED", "CoveredOrUncovered"),
    FIX204_ENU_CUSTOMER_OR_FIRM(204, "CUSTOMER_OR_FIRM", "CustomerOrFirm (replaced)"),
    FIX205_INT_MATURITY_DAY(205, "MATURITY_DAY", "MaturityDay (replaced)"),
    FIX206_STR_OPT_ATTRIBUTE(206, "OPT_ATTRIBUTE", "OptAttribute"),
    FIX207_EXC_SECURITY_EXCHANGE(207, "SECURITY_EXCHANGE", "SecurityExchange"),
    FIX208_BOOL_NOTIFY_BROKER_OF_CREDIT(208, "NOTIFY_BROKER_OF_CREDIT", "NotifyBrokerOfCredit"),
    FIX209_ENU_ALLOC_HANDL_INST(209, "ALLOC_HANDL_INST", "AllocHandlInst"),
    FIX210_QTY_MAX_SHOW(210, "MAX_SHOW", "MaxShow"),

    FIX211_FLO_PEG_DIFFERENCE(211, "PEG_DIFFERENCE", "PegDifference"),
    /*
     *
     * End of FIX4.1
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
    public final static double JUNK_AMT_DATA_VALUE = -65535D;
    public final static String JUNK_DAT_DATA_VALUE = "JunkData";
    public final static String JUNK_EXC_DATA_VALUE = "JunkExchange";
    public final static float JUNK_FLO_DATA_VALUE = -65535F;
    public final static int JUNK_INT_DATA_VALUE = -65535;
    public final static int JUNK_LEN_DATA_VALUE = -65535;
    public final static String JUNK_LMD_DATA_VALUE = "JunkLocalMktDateDataValue";
    public final static int JUNK_NUM_DATA_VALUE = -65535;
    public final static double JUNK_PCT_DATA_VALUE = -0.05D;
    public final static double JUNK_PXO_DATA_VALUE = -0.032D;
    public final static double JUNK_PRC_DATA_VALUE = -65535D;
    public final static int JUNK_QTY_DATA_VALUE = -65535;
    public final static int JUNK_SEQ_DATA_VALUE = -65535;
    public final static String JUNK_STR_DATA_VALUE = "JunkStringDataValue";
    public final static String JUNK_UTC_DATA_VALUE = "18991231_235959";

    FIX41(final int id, final String name, final String description) {
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
        for (FIX41 oneFIX : FIX41.values()) {
            System.out.println(oneFIX);
        }
    }
}
