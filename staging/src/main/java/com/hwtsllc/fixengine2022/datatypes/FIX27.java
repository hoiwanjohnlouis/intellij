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
 * FIX27 enum defines all the Financial Exchange Protocol's (FIX) fields.
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
public enum FIX27 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX2.7 as defined by the FIX Protocol Specification 2.7
     *  Tags: 1-103
     */
    FIX1_ST_ACCOUNT(1, "ACCOUNT", "Account"),
    FIX2_ST_ADV_ID(2, "ADV_ID", "AdvId"),
    FIX3_ST_ADV_REF_ID(3, "ADV_REF_ID", "AdvRefId"),
    FIX4_ET_ADV_SIDE(4, "ADV_SIDE", "AdvSide"),
    FIX5_ET_ADV_TRANS_TYPE(5, "ADV_TRANS_TYPE", "Enum5AdvTransType"),
    FIX6_AVG_PX(6, "AVG_PX", "AvgPx"),
    FIX7_SNT_BEGIN_SEQ_NO(7, "BEGIN_SEQ_NO", "BeginSeqNo"),
    FIX8_ET_BEGIN_STRING(8, "BEGIN_STRING", "BeginString"),
    FIX9_LT_BODY_LENGTH(9, "BODY_LENGTH", "BodyLength"),
    FIX10_ST_CHECK_SUM(10, "CHECK_SUM", "CheckSum"),

    FIX11_ST_CL_ORD_ID(11, "CL_ORD_ID", "ClOrdID"),
    FIX12_COMMISSION(12, "COMMISSION", "Commission"),
    FIX13_ET_COMM_TYPE(13, "COMM_TYPE", "CommType"),
    FIX14_QT_CUM_QTY(14, "CUM_QTY", "CumQty"),
    FIX15_CURRENCY(15, "CURRENCY", "Currency"),
    FIX16_SNT_END_SEQ_NO(16, "END_SEQ_NO", "EndSeqNo"),
    FIX17_ST_EXEC_ID(17, "EXEC_ID", "ExecID"),
    FIX18_ET_EXEC_INST(18, "EXEC_INST", "ExecInst"),
    FIX19_ST_EXEC_REF_ID(19, "EXEC_REF_ID", "ExecRefID"),
    FIX20_ET_EXEC_TRANS_TYPE(20, "EXEC_TRANS_TYPE", "ExecTransType (replaced)"),

    FIX21_ET_HANDL_INST(21, "HANDL_INST", "HandlInst"),
    FIX22_ET_SECURITY_ID_SOURCE(22, "SECURITY_ID_SOURCE", "SecurityIDSource"),
    FIX23_ST_IOI_ID(23, "IOI_ID", "IOIid"),
    FIX24_IOI_OTH_SVC(24, "IOI_OTH_SVC", "IOIOthSvc (no longer used)"),
    FIX25_ET_IOI_QLTY_IND(25, "IOI_QLTY_IND", "IOIQltyInd"),
    FIX26_ST_IOI_REF_ID(26, "IOI_REF_ID", "IOIRefID"),
    FIX27_ET_IOI_SHARES(27, "IOI_SHARES", "IOIShares"),
    FIX28_ET_IOI_TRANS_TYPE(28, "IOI_TRANS_TYPE", "IOITransType"),
    FIX29_ET_LAST_CAPACITY(29, "LAST_CAPACITY", "LastCapacity"),
    FIX30_LAST_MKT(30, "LAST_MKT", "LastMkt"),

    FIX31_LAST_PX(31, "LAST_PX", "LastPx"),
    FIX32_QT_LAST_QTY(32, "LAST_QTY", "LastQty"),
    FIX33_NIGT_NO_LINES_OF_TEXT(33, "NO_LINES_OF_TEXT", "NoLinesOfText"),
    FIX34_MSG_SEQ_NUM(34, "MSG_SEQ_NUM", "MsgSeqNum"),
    FIX35_ET_MSG_TYPE(35, "MSG_TYPE", "MsgType"),
    FIX36_SNT_NEW_SEQ_NO(36, "NEW_SEQ_NO", "NewSeqNo"),
    FIX37_ST_ORDER_ID(37, "ORDER_ID", "OrderID"),
    FIX38_QT_ORDER_QTY(38, "ORDER_QTY", "OrderQty"),
    FIX39_ET_ORD_STATUS(39, "ORD_STATUS", "OrdStatus"),
    FIX40_ET_ORD_TYPE(40, "ORD_TYPE", "OrdType"),

    FIX41_ST_ORIG_CL_ORD_ID(41, "ORIG_CL_ORD_ID", "OrigClOrdID"),
    FIX42_ORIG_TIME(42, "ORIG_TIME", "OrigTime"),
    FIX43_ET_POSS_DUP_FLAG(43, "POSS_DUP_FLAG", "PossDupFlag"),
    FIX44_PRICE(44, "PRICE", "Price"),
    FIX45_REF_SEQ_NUM(45, "REF_SEQ_NUM", "RefSeqNum"),
    FIX46_ST_RELATD_SYM(46, "RELATD_SYM", "RelatdSym (No longer used)"),
    FIX47_ET_RULE_80_A(47, "RULE_80_A", "Rule80A (no longer used)"),
    FIX48_ST_SECURITY_ID(48, "SECURITY_ID", "SecurityID"),
    FIX49_ST_SENDER_COMP_ID(49, "SENDER_COMP_ID", "SenderCompID"),
    FIX50_ST_SENDER_SUB_ID(50, "SENDER_SUB_ID", "SenderSubID"),

    FIX51_SENDING_DATE(51, "SENDING_DATE", "SendingDate (no longer used)"),
    FIX52_SENDING_TIME(52, "SENDING_TIME", "SendingTime"),
    FIX53_QT_QUANTITY(53, "QUANTITY", "Quantity (formerly Shares)"),
    FIX54_ET_SIDE(54, "SIDE", "Side"),
    FIX55_ST_SYMBOL(55, "SYMBOL", "Symbol"),
    FIX56_ST_TARGET_COMP_ID(56, "TARGET_COMP_ID", "TargetCompID"),
    FIX57_ST_TARGET_SUB_ID(57, "TARGET_SUB_ID", "TargetSubID"),
    FIX58_ST_TEXT(58, "TEXT", "Text"),
    FIX59_ET_TIME_IN_FORCE(59, "TIME_IN_FORCE", "TimeInForce"),
    FIX60_TRANSACT_TIME(60, "TRANSACT_TIME", "TransactTime"),

    FIX61_ET_URGENCY(61, "URGENCY", "Urgency"),
    FIX62_VALID_UNTIL_TIME(62, "VALID_UNTIL_TIME", "ValidUntilTime"),
    FIX63_SETTLMNT_TYP(63, "SETTLMNT_TYP", "SettlmntTyp"),
    FIX64_SETTL_DATE(64, "SETTL_DATE", "SettlDate"),
    FIX65_ST_SYMBOL_SFX(65, "SYMBOL_SFX", "SymbolSfx"),
    FIX66_ST_LIST_ID(66, "LIST_ID", "ListID"),
    FIX67_LIST_SEQ_NO(67, "LIST_SEQ_NO", "ListSeqNo"),
    FIX68_TOT_NO_ORDERS(68, "TOT_NO_ORDERS", "TotNoOrders (formerly named: ListNoOrds)"),
    FIX69_LIST_EXEC_INST(69, "LIST_EXEC_INST", "ListExecInst"),
    FIX70_ST_ALLOC_ID(70, "ALLOC_ID", "AllocID"),

    FIX71_ET_ALLOC_TRANS_TYPE(71, "ALLOC_TRANS_TYPE", "AllocTransType"),
    FIX72_ST_REF_ALLOC_ID(72, "REF_ALLOC_ID", "RefAllocID"),
    FIX73_NO_ORDERS(73, "NO_ORDERS", "NoOrders"),
    FIX74_AVG_PX_PRECISION(74, "AVG_PX_PRECISION", "AvgPxPrecision"),
    FIX75_TRADE_DATE(75, "TRADE_DATE", "TradeDate"),
    FIX76_EXEC_BROKER(76, "EXEC_BROKER", "ExecBroker (replaced)"),
    FIX77_ET_POSITION_EFFECT(77, "POSITION_EFFECT", "PositionEffect"),
    FIX78_NO_ALLOCS(78, "NO_ALLOCS", "NoAllocs"),
    FIX79_ST_ALLOC_ACCOUNT(79, "ALLOC_ACCOUNT", "AllocAccount"),
    FIX80_QT_ALLOC_SHARES(80, "ALLOC_SHARES", "AllocShares"),

    FIX81_ET_PROCESS_CODE(81, "PROCESS_CODE", "ProcessCode"),
    FIX82_NO_RPTS(82, "NO_RPTS", "NoRpts"),
    FIX83_RPT_SEQ(83, "RPT_SEQ", "RptSeq"),
    FIX84_QT_CXL_QTY(84, "CXL_QTY", "CxlQty"),
    FIX85_NO_DLVY_INST(85, "NO_DLVY_INST", "NoDlvyInst (no longer used)"),
    FIX86_ST_DLVY_INST(86, "DLVY_INST", "DlvyInst (no longer used)"),
    FIX87_ET_ALLOC_STATUS(87, "ALLOC_STATUS", "AllocStatus"),
    FIX88_ET_ALLOC_REJ_CODE(88, "ALLOC_REJ_CODE", "AllocRejCode"),
    FIX89_ST_SIGNATURE(89, "SIGNATURE", "Signature"),
    FIX90_LT_SECURE_DATA_LEN(90, "SECURE_DATA_LEN", "SecureDataLen"),

    FIX91_ST_SECURE_DATA(91, "SECURE_DATA", "SecureData"),
    FIX92_BROKER_OF_CREDIT(92, "BROKER_OF_CREDIT", "BrokerOfCredit (replaced)"),
    FIX93_LT_SIGNATURE_LENGTH(93, "SIGNATURE_LENGTH", "SignatureLength"),
    FIX94_ET_EMAIL_TYPE(94, "EMAIL_TYPE", "EmailType"),
    FIX95_RAW_DATA_LENGTH(95, "RAW_DATA_LENGTH", "RawDataLength"),
    FIX96_ST_RAW_DATA(96, "RAW_DATA", "RawData"),
    FIX97_ET_POSS_RESEND(97, "POSS_RESEND", "PossResend"),
    FIX98_ET_ENCRYPT_METHOD(98, "ENCRYPT_METHOD", "EncryptMethod"),
    FIX99_STOP_PX(99, "STOP_PX", "StopPx"),
    FIX100_EX_DESTINATION(100, "EX_DESTINATION", "ExDestination"),


    // 101-200

    FIX102_ET_CXL_REJ_REASON(102, "CXL_REJ_REASON", "CxlRejReason"),
    FIX103_ET_ORD_REJ_REASON(103, "ORD_REJ_REASON", "OrdRejReason"),
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
