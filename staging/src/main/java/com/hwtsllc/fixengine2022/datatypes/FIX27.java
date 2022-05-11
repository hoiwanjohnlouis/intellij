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
 *  FIX27 enum defines all the Financial Exchange Protocol's (FIX) fields.
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
 *  <p>                 NUM = MyNumInGroupType field, saved as int
 *  <p>                 PCT = MyPercentageType field, saved as String
 *  <p>                 PRC = MyPriceType field, saved as String
 *  <p>                 PXO = MyPriceOffsetType field, saved as String
 *  <p>                 QTY = MyQtyType field, saved as int
 *  <p>                 SEQ = MySeqNumType field, saved as int
 *  <p>                 STR = MyStringType field, saved as String
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
public enum FIX27 implements EnumAccessors, LogStringVerbose, MyTestValues {


    /*
     * Start of FIX2.7 as defined by the FIX Protocol Specification 2.7
     *  Tags: 1-103
     */
    FIX1_STR_ACCOUNT(1, "ACCOUNT", "Account"),
    FIX2_STR_ADV_ID(2, "ADV_ID", "AdvId"),
    FIX3_STR_ADV_REF_ID(3, "ADV_REF_ID", "AdvRefId"),
    FIX4_ENU_ADV_SIDE(4, "ADV_SIDE", "AdvSide"),
    FIX5_ENU_ADV_TRANS_TYPE(5, "ADV_TRANS_TYPE", "Enum5AdvTransType"),
    FIX6_PRC_AVG_PX(6, "AVG_PX", "AvgPx"),
    FIX7_SEQ_BEGIN_SEQ_NO(7, "BEGIN_SEQ_NO", "BeginSeqNo"),
    FIX8_ENU_BEGIN_STRING(8, "BEGIN_STRING", "BeginString"),
    FIX9_LEN_BODY_LENGTH(9, "BODY_LENGTH", "BodyLength"),
    FIX10_STR_CHECK_SUM(10, "CHECK_SUM", "CheckSum"),

    FIX11_STR_CL_ORD_ID(11, "CL_ORD_ID", "ClOrdID"),
    FIX12_AMT_COMMISSION(12, "COMMISSION", "Commission"),
    FIX13_ENU_COMM_TYPE(13, "COMM_TYPE", "CommType"),
    FIX14_QTY_CUM_QTY(14, "CUM_QTY", "CumQty"),
    FIX15_CCY_CURRENCY(15, "CURRENCY", "Currency"),
    FIX16_SEQ_END_SEQ_NO(16, "END_SEQ_NO", "EndSeqNo"),
    FIX17_STR_EXEC_ID(17, "EXEC_ID", "ExecID"),
    FIX18_ENU_EXEC_INST(18, "EXEC_INST", "ExecInst"),
    FIX19_STR_EXEC_REF_ID(19, "EXEC_REF_ID", "ExecRefID"),
    FIX20_ENU_EXEC_TRANS_TYPE(20, "EXEC_TRANS_TYPE", "ExecTransType (replaced)"),

    FIX21_ENU_HANDL_INST(21, "HANDL_INST", "HandlInst"),
    FIX22_ENU_SECURITY_ID_SOURCE(22, "SECURITY_ID_SOURCE", "SecurityIDSource"),
    FIX23_STR_IOI_ID(23, "IOI_ID", "IOIid"),
    FIX24_STR_IOI_OTH_SVC(24, "IOI_OTH_SVC", "IOIOthSvc (no longer used)"),
    FIX25_ENU_IOI_QLTY_IND(25, "IOI_QLTY_IND", "IOIQltyInd"),
    FIX26_STR_IOI_REF_ID(26, "IOI_REF_ID", "IOIRefID"),
    FIX27_ENU_IOI_SHARES(27, "IOI_SHARES", "IOIShares"),
    FIX28_ENU_IOI_TRANS_TYPE(28, "IOI_TRANS_TYPE", "IOITransType"),
    FIX29_ENU_LAST_CAPACITY(29, "LAST_CAPACITY", "LastCapacity"),
    FIX30_STR_LAST_MKT(30, "LAST_MKT", "LastMkt"),

    FIX31_PRC_LAST_PX(31, "LAST_PX", "LastPx"),
    FIX32_QTY_LAST_QTY(32, "LAST_QTY", "LastQty"),
    FIX33_NUM_NO_LINES_OF_TEXT(33, "NO_LINES_OF_TEXT", "NoLinesOfText"),
    FIX34_SEQ_MSG_SEQ_NUM(34, "MSG_SEQ_NUM", "MsgSeqNum"),
    FIX35_ENU_MSG_TYPE(35, "MSG_TYPE", "MsgType"),
    FIX36_SEQ_NEW_SEQ_NO(36, "NEW_SEQ_NO", "NewSeqNo"),
    FIX37_STR_ORDER_ID(37, "ORDER_ID", "OrderID"),
    FIX38_QTY_ORDER_QTY(38, "ORDER_QTY", "OrderQty"),
    FIX39_ENU_ORD_STATUS(39, "ORD_STATUS", "OrdStatus"),
    FIX40_ENU_ORD_TYPE(40, "ORD_TYPE", "OrdType"),

    FIX41_STR_ORIG_CL_ORD_ID(41, "ORIG_CL_ORD_ID", "OrigClOrdID"),
    FIX42_UTC_ORIG_TIME(42, "ORIG_TIME", "OrigTime"),
    FIX43_BOOL_POSS_DUP_FLAG(43, "POSS_DUP_FLAG", "PossDupFlag"),
    FIX44_PRC_PRICE(44, "PRICE", "Price"),
    FIX45_SEQ_REF_SEQ_NUM(45, "REF_SEQ_NUM", "RefSeqNum"),
    FIX46_STR_RELATD_SYM(46, "RELATD_SYM", "RelatdSym (No longer used)"),
    FIX47_ENU_RULE_80_A(47, "RULE_80_A", "Rule80A (no longer used)"),
    FIX48_STR_SECURITY_ID(48, "SECURITY_ID", "SecurityID"),
    FIX49_STR_SENDER_COMP_ID(49, "SENDER_COMP_ID", "SenderCompID"),
    FIX50_STR_SENDER_SUB_ID(50, "SENDER_SUB_ID", "SenderSubID"),

    FIX51_UTC_SENDING_DATE(51, "SENDING_DATE", "SendingDate (no longer used)"),
    FIX52_UTC_SENDING_TIME(52, "SENDING_TIME", "SendingTime"),
    FIX53_QTY_QUANTITY(53, "QUANTITY", "Quantity (formerly Shares)"),
    FIX54_ENU_SIDE(54, "SIDE", "Side"),
    FIX55_STR_SYMBOL(55, "SYMBOL", "Symbol"),
    FIX56_STR_TARGET_COMP_ID(56, "TARGET_COMP_ID", "TargetCompID"),
    FIX57_STR_TARGET_SUB_ID(57, "TARGET_SUB_ID", "TargetSubID"),
    FIX58_STR_TEXT(58, "TEXT", "Text"),
    FIX59_ENU_TIME_IN_FORCE(59, "TIME_IN_FORCE", "TimeInForce"),
    FIX60_UTC_TRANSACT_TIME(60, "TRANSACT_TIME", "TransactTime"),

    FIX61_ENU_URGENCY(61, "URGENCY", "Urgency"),
    FIX62_STR_VALID_UNTIL_TIME(62, "VALID_UNTIL_TIME", "ValidUntilTime"),
    FIX63_ENU_SETTLMNT_TYP(63, "SETTLMNT_TYP", "SettlmntTyp"),
    FIX64_STR_SETTL_DATE(64, "SETTL_DATE", "SettlDate"),
    FIX65_ENU_SYMBOL_SFX(65, "SYMBOL_SFX", "SymbolSfx"),
    FIX66_STR_LIST_ID(66, "LIST_ID", "ListID"),
    FIX67_STR_LIST_SEQ_NO(67, "LIST_SEQ_NO", "ListSeqNo"),
    FIX68_INT_TOT_NO_ORDERS(68, "TOT_NO_ORDERS", "TotNoOrders (formerly named: ListNoOrds)"),
    FIX69_STR_LIST_EXEC_INST(69, "LIST_EXEC_INST", "ListExecInst"),
    FIX70_STR_ALLOC_ID(70, "ALLOC_ID", "AllocID"),

    FIX71_ENU_ALLOC_TRANS_TYPE(71, "ALLOC_TRANS_TYPE", "AllocTransType"),
    FIX72_STR_REF_ALLOC_ID(72, "REF_ALLOC_ID", "RefAllocID"),
    FIX73_NUM_NO_ORDERS(73, "NO_ORDERS", "NoOrders"),
    FIX74_STR_AVG_PX_PRECISION(74, "AVG_PX_PRECISION", "AvgPxPrecision"),
    FIX75_STR_TRADE_DATE(75, "TRADE_DATE", "TradeDate"),
    FIX76_STR_EXEC_BROKER(76, "EXEC_BROKER", "ExecBroker (replaced)"),
    FIX77_ENU_POSITION_EFFECT(77, "POSITION_EFFECT", "PositionEffect"),
    FIX78_NUM_NO_ALLOCS(78, "NO_ALLOCS", "NoAllocs"),
    FIX79_STR_ALLOC_ACCOUNT(79, "ALLOC_ACCOUNT", "AllocAccount"),
    FIX80_QTY_ALLOC_SHARES(80, "ALLOC_SHARES", "AllocShares"),

    FIX81_ENU_PROCESS_CODE(81, "PROCESS_CODE", "ProcessCode"),
    FIX82_INT_NO_RPTS(82, "NO_RPTS", "NoRpts"),
    FIX83_STR_RPT_SEQ(83, "RPT_SEQ", "RptSeq"),
    FIX84_QTY_CXL_QTY(84, "CXL_QTY", "CxlQty"),
    FIX85_NUM_NO_DLVY_INST(85, "NO_DLVY_INST", "NoDlvyInst (no longer used)"),
    FIX86_STR_DLVY_INST(86, "DLVY_INST", "DlvyInst (no longer used)"),
    FIX87_ENU_ALLOC_STATUS(87, "ALLOC_STATUS", "AllocStatus"),
    FIX88_ENU_ALLOC_REJ_CODE(88, "ALLOC_REJ_CODE", "AllocRejCode"),
    FIX89_DAT_SIGNATURE(89, "SIGNATURE", "Signature"),
    FIX90_LEN_SECURE_DATA_LEN(90, "SECURE_DATA_LEN", "SecureDataLen"),

    FIX91_DAT_SECURE_DATA(91, "SECURE_DATA", "SecureData"),
    FIX92_STR_BROKER_OF_CREDIT(92, "BROKER_OF_CREDIT", "BrokerOfCredit (replaced)"),
    FIX93_LEN_SIGNATURE_LENGTH(93, "SIGNATURE_LENGTH", "SignatureLength"),
    FIX94_ENU_EMAIL_TYPE(94, "EMAIL_TYPE", "EmailType"),
    FIX95_LEN_RAW_DATA_LENGTH(95, "RAW_DATA_LENGTH", "RawDataLength"),
    FIX96_DAT_RAW_DATA(96, "RAW_DATA", "RawData"),
    FIX97_BOOL_POSS_RESEND(97, "POSS_RESEND", "PossResend"),
    FIX98_ENU_ENCRYPT_METHOD(98, "ENCRYPT_METHOD", "EncryptMethod"),
    FIX99_PRC_STOP_PX(99, "STOP_PX", "StopPx"),
    FIX100_STR_EX_DESTINATION(100, "EX_DESTINATION", "ExDestination"),


    // 101-200

    FIX102_ENU_CXL_REJ_REASON(102, "CXL_REJ_REASON", "CxlRejReason"),
    FIX103_ENU_ORD_REJ_REASON(103, "ORD_REJ_REASON", "OrdRejReason"),
    /*
     *
     * End of FIX2.7
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

    FIX27(final int id, final String name, final String description) {
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
        for (FIX27 oneFIX : FIX27.values()) {
            System.out.println(oneFIX);
        }
    }
}
