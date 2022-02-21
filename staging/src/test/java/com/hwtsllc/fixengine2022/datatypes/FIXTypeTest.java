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

import com.hwtsllc.fixengine2022.TagType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FIXTypeTest {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
        // logger.info("@BeforeEach - executes before each test method in this class");
    }
    @AfterEach
    void tearDown() {
        // logger.info("@AfterEach - executes after each test method in this class");
    }

    /*
     * Start of FIX4.0 as defined by the FIX Protocol Specification 4.0
     *  Tags: 1-140
     */
    @Test
    void FIX0001Test() {
        FIXType fix1Account = FIXType.ACCOUNT;
        assertEquals( fix1Account.getFIXName(), "ACCOUNT");
        assertEquals( fix1Account.getFIXNumber(), 1);
        assertEquals( fix1Account.getFIXDescription(), "Account");
        assertNotEquals( fix1Account.getFIXName(), "Not My ACCOUNT");
        assertNotEquals( fix1Account.getFIXNumber(), 2);
        assertNotEquals( fix1Account.getFIXDescription(), "123 Account");
    }
    @Test
    void FIX0002Test() {
        FIXType fix2AdvID = FIXType.ADV_ID;
    }
    @Test
    void FIX0003Test() {
        FIXType fix3AdvRefID = FIXType.ADV_REF_ID;
    }
    @Test
    void FIX0004Test() {
        FIXType fix4AdvSide = FIXType.ADV_SIDE;
    }
    @Test
    void FIX0005Test() {
        FIXType fix5AdvTransType = FIXType.ADV_TRANS_TYPE;
    }
    @Test
    void FIX0006Test() {
        FIXType fix6AvgPx = FIXType.AVG_PX;
    }
    @Test
    void FIX0007Test() {
        FIXType fix7BeginSeqNo = FIXType.BEGIN_SEQ_NO;
    }
    @Test
    void FIX0008Test() {
        FIXType fix8BeginString = FIXType.BEGIN_STRING;
    }
    @Test
    void FIX0009Test() {
        FIXType fix9BodyLength = FIXType.BODY_LENGTH;
    }
    @Test
    void FIX0010Test() {
        FIXType fix10CheckSum = FIXType.CHECK_SUM;
    }
    @Test
    void FIX0011Test() {
        FIXType Tag11ClOrdID = FIXType.CL_ORD_ID;
    }
    @Test
    void FIX0012Test() {
        FIXType Tag12Commission = FIXType.COMMISSION;
    }
    @Test
    void FIX0013Test() {
        FIXType Tag13CommType = FIXType.COMM_TYPE;
    }
    @Test
    void FIX0014Test() {
        FIXType Tag14CumQty = FIXType.CUM_QTY;
    }
    @Test
    void FIX0015Test() {
        FIXType Tag15Currency = FIXType.CURRENCY;
    }
    @Test
    void FIX0016Test() {
        FIXType Tag16EndSeqNo = FIXType.END_SEQ_NO;
    }
    @Test
    void FIX0017Test() {
        FIXType Tag17ExecID = FIXType.EXEC_ID;
    }
    @Test
    void FIX0018Test() {
        FIXType Tag18ExecInst = FIXType.EXEC_INST;
    }
    @Test
    void FIX0019Test() {
        FIXType Tag19ExecRefID = FIXType.EXEC_REF_ID;
    }
    @Test
    void FIX0020Test() {
        FIXType Tag20ExecTransType = FIXType.EXEC_TRANS_TYPE;
    }
    @Test
    void FIX0021Test() {
        FIXType Tag21HandlInst = FIXType.HANDL_INST;
    }
    @Test
    void FIX0022Test() {
        FIXType Tag22IDSource = FIXType.ID_SOURCE;
    }
    @Test
    void FIX0023Test() {
        FIXType Tag23IOIID = FIXType.IOI_ID;
    }
    @Test
    void FIX0024Test() {
        FIXType Tag24IOIOthSvc = FIXType.IOI_OTH_SVC;
    }
    @Test
    void FIX0025Test() {
        FIXType Tag25IOIQltyInd = FIXType.IOI_QLTY_IND;
    }
    @Test
    void FIX0026Test() {
        FIXType Tag26IOIRefID = FIXType.IOI_REF_ID;
    }
    @Test
    void FIX0027Test() {
        FIXType Tag27IOIShares = FIXType.IOI_SHARES;
    }
    @Test
    void FIX0028Test() {
        FIXType Tag28IOITransType = FIXType.IOI_TRANS_TYPE;
    }
    @Test
    void FIX0029Test() {
        FIXType Tag29LastCapacity = FIXType.LAST_CAPACITY;
    }
    @Test
    void FIX0030Test() {
        FIXType Tag30LastMkt = FIXType.LAST_MKT;
    }
    @Test
    void FIX0031Test() {
        FIXType Tag31LastPx = FIXType.LAST_PX;
    }
    @Test
    void FIX0032Test() {
        FIXType Tag32LastQty = FIXType.LAST_SHARES;
    }
    @Test
    void FIX0033Test() {
        FIXType Tag33LinesOfText = FIXType.LINES_OF_TEXT;
    }
    @Test
    void FIX0034Test() {
        FIXType Tag34MsgSeqNum = FIXType.MSG_SEQ_NUM;
    }
    @Test
    void FIX0035Test() {
        FIXType Tag35MsgType = FIXType.MSG_TYPE;
    }
    @Test
    void FIX0036Test() {
        FIXType Tag36NewSeqNo = FIXType.NEW_SEQ_NO;
    }
    @Test
    void FIX0037Test() {
        FIXType Tag37OrderID = FIXType.ORDER_ID;
    }
    @Test
    void FIX0038Test() {
        FIXType Tag38OrderQty = FIXType.ORDER_QTY;
    }
    @Test
    void FIX0039Test() {
        FIXType Tag39OrdStatus = FIXType.ORD_STATUS;
    }
    @Test
    void FIX0040Test() {
        FIXType Tag40OrdType = FIXType.ORD_TYPE;
    }
    @Test
    void FIX0041Test() {
        FIXType Tag41OrigClOrdID = FIXType.ORIG_CL_ORD_ID;
    }
    @Test
    void FIX0042Test() {
        FIXType Tag42OrigTime = FIXType.ORIG_TIME;
    }
    @Test
    void FIX0043Test() {
        FIXType Tag43PossDupFlag = FIXType.POSS_DUP_FLAG;
    }
    @Test
    void FIX0044Test() {
        FIXType Tag44Price = FIXType.PRICE;
    }
    @Test
    void FIX0045Test() {
        FIXType Tag45RefSeqNum = FIXType.REF_SEQ_NUM;
    }
    @Test
    void FIX0046Test() {
        FIXType Tag46RelatdSym = FIXType.RELATD_SYM;
    }
    @Test
    void FIX0047Test() {
        FIXType Tag47Rule89A = FIXType.RULE_80_A;
    }
    @Test
    void FIX0048Test() {
        FIXType Tag48SecurityID = FIXType.SECURITY_ID;
    }
    @Test
    void FIX0049Test() {
        FIXType Tag49SenderCompID = FIXType.SENDER_COMP_ID;
    }
    @Test
    void FIX0050Test() {
        FIXType Tag50SenderSubID = FIXType.SENDER_SUB_ID;
    }
    @Test
    void FIX0051Test() {
        FIXType Tag51SendingDate = FIXType.SENDING_DATE;
    }
    @Test
    void FIX0052Test() {
        FIXType Tag52SendingTime = FIXType.SENDING_TIME;
    }
    @Test
    void FIX0053Test() {
        FIXType Tag53Quantity = FIXType.QUANTITY;
    }
    @Test
    void FIX0054Test() {
        FIXType Tag54Side = FIXType.SIDE;
    }
    @Test
    void FIX0055Test() {
        FIXType Tag55Symbol = FIXType.SYMBOL;
    }
    @Test
    void FIX0056Test() {
        FIXType Tag56TargetCompID = FIXType.TARGET_COMP_ID;
    }
    @Test
    void FIX0057Test() {
        FIXType Tag57TargetSubID = FIXType.TARGET_SUB_ID;
    }
    @Test
    void FIX0058Test() {
        FIXType Tag58Text = FIXType.TEXT;
    }
    @Test
    void FIX0059Test() {
        FIXType Tag59TimeInForce = FIXType.TIME_IN_FORCE;
    }
    @Test
    void FIX0060Test() {
        FIXType Tag60TransactTime = FIXType.TRANSACT_TIME;
    }
    @Test
    void FIX0061Test() {
        FIXType Tag61Urgency = FIXType.URGENCY;
    }
    @Test
    void FIX0062Test() {
        FIXType Tag62ValidUntilTime = FIXType.VALID_UNTIL_TIME;
    }
    @Test
    void FIX0063Test() {
        FIXType Tag63SettlmntTyp = FIXType.SETTLMNT_TYP;
    }
    @Test
    void FIX0064Test() {
        FIXType Tag64FutSettDate = FIXType.FUT_SETT_DATE;
    }
    @Test
    void FIX0065Test() {
        FIXType Tag65SymbolSfx = FIXType.SYMBOL_SFX;
    }
    @Test
    void FIX0066Test() {
        FIXType Tag66ListID = FIXType.LIST_ID;
    }
    @Test
    void FIX0067Test() {
        FIXType Tag67ListSeqNo = FIXType.LIST_SEQ_NO;
    }
    @Test
    void FIX0068Test() {
        FIXType Tag68TotNoOrders = FIXType.TOT_NO_ORDERS;
    }
    @Test
    void FIX0069Test() {
        FIXType Tag69ListExecInst = FIXType.LIST_EXEC_INST;
    }
    @Test
    void FIX0070Test() {
        FIXType Tag70AllocID = FIXType.ALLOC_ID;
    }
    @Test
    void FIX0071Test() {
        FIXType Tag71AllocTransType = FIXType.ALLOC_TRANS_TYPE;
    }
    @Test
    void FIX0072Test() {
        FIXType Tag72RefAllocID = FIXType.REF_ALLOC_ID;
    }
    @Test
    void FIX0073Test() {
        FIXType Tag73NoOrders = FIXType.NO_ORDERS;
    }
    @Test
    void FIX0074Test() {
        FIXType Tag74AvgPxPrecision = FIXType.AVG_PRX_PRECISION;
    }
    @Test
    void FIX0075Test() {
        FIXType Tag75TradeDate = FIXType.TRADE_DATE;
    }
    @Test
    void FIX0076Test() {
        FIXType Tag76ExecBroker = FIXType.EXEC_BROKER;
    }
    @Test
    void FIX0077Test() {
        FIXType Tag77OpenClose = FIXType.OPEN_CLOSE;
    }
    @Test
    void FIX0078Test() {
        FIXType Tag78NoAllocs = FIXType.NO_ALLOCS;
    }
    @Test
    void FIX0079Test() {
        FIXType Tag79AllocAccount = FIXType.ALLOC_ACCOUNT;
    }
    @Test
    void FIX0080Test() {
        FIXType Tag80AllocShares = FIXType.ALLOC_SHARES;
    }
    @Test
    void FIX0081Test() {
        FIXType Tag81ProcessCode = FIXType.PROCESS_CODE;
    }
    @Test
    void FIX0082Test() {
        FIXType Tag82NoRpts = FIXType.NO_RPTS;
    }
    @Test
    void FIX0083Test() {
        FIXType Tag83RptSeq = FIXType.RPT_SEQ;
    }
    @Test
    void FIX0084Test() {
        FIXType Tag84CxlQty = FIXType.CXL_QTY;
    }
    @Test
    void FIX0085Test() {
        FIXType Tag85NoDlvyInst = FIXType.NO_DLVY_INST;
    }
    @Test
    void FIX0086Test() {
        FIXType Tag86DlvyInst = FIXType.DLVY_INST;
    }
    @Test
    void FIX0087Test() {
        FIXType Tag87AllocStatus = FIXType.ALLOC_STATUS;
    }
    @Test
    void FIX0088Test() {
        FIXType Tag88AllocRejCode = FIXType.ALLOC_REJ_CODE;
    }
    @Test
    void FIX0089Test() {
        FIXType Tag89Signature = FIXType.SIGNATURE;
    }
    @Test
    void FIX0090Test() {
        FIXType Tag90SecureDataLen = FIXType.SECURE_DATA_LEN;
    }
    @Test
    void FIX0091Test() {
        FIXType Tag91SecureData = FIXType.SECURE_DATA;
    }
    @Test
    void FIX0092Test() {
        FIXType Tag92BrokerOfCredit = FIXType.BROKER_OF_CREDIT;
    }
    @Test
    void FIX0093Test() {
        FIXType Tag93SignatureLength = FIXType.SIGNATURE_LENGTH;
    }
    @Test
    void FIX0094Test() {
        FIXType Tag94EmailType = FIXType.EMAIL_TYPE;
    }
    @Test
    void FIX0095Test() {
        FIXType Tag95RawDataLength = FIXType.RAW_DATA_LENGTH;
    }
    @Test
    void FIX0096Test() {
        FIXType Tag96RawData = FIXType.RAW_DATA;
    }
    @Test
    void FIX0097Test() {
        FIXType Tag97PossResend = FIXType.POSS_RESEND;
    }
    @Test
    void FIX0098Test() {
        FIXType Tag98EncryptMethod = FIXType.ENCRYPT_METHOD;
    }
    @Test
    void FIX0099Test() {
        FIXType Tag99StopPx = FIXType.STOP_PX;
    }
    @Test
    void FIX0100Test() {
        FIXType fix100ExDestination = FIXType.EX_DESTINATION;
        assertEquals( fix100ExDestination.getFIXName(), "EX_DESTINATION");
        assertEquals( fix100ExDestination.getFIXNumber(), 100);
        assertEquals( fix100ExDestination.getFIXDescription(), "ExDestination");
        assertNotEquals( fix100ExDestination.getFIXName(), "Not My EX_DESTINATION");
        assertNotEquals( fix100ExDestination.getFIXNumber(), 2);
        assertNotEquals( fix100ExDestination.getFIXDescription(), "123 Account");
    }
    @Test
    @Deprecated
    void FIX0101Test() {
        /* Tag 101 not defined */
    }
    @Test
    void FIX0102Test() {
        FIXType fix102CxlRejReason = FIXType.CXL_REJ_REASON;
        assertEquals( fix102CxlRejReason.getFIXName(), "CXL_REJ_REASON");
        assertEquals( fix102CxlRejReason.getFIXNumber(), 102);
        assertEquals( fix102CxlRejReason.getFIXDescription(), "CxlRejReason");
    }
    @Test
    void FIX0103Test() {
        FIXType fix103OrdRejReason = FIXType.ORD_REJ_REASON;
        assertEquals( fix103OrdRejReason.getFIXName(), "ORD_REJ_REASON");
        assertEquals( fix103OrdRejReason.getFIXNumber(), 103);
        assertEquals( fix103OrdRejReason.getFIXDescription(), "OrdRejReason");
    }
    @Test
    void FIX0104Test() {
        FIXType fix104IOIQualifier = FIXType.IOI_QUALIFIER;
        assertEquals( fix104IOIQualifier.getFIXName(), "IOI_QUALIFIER");
        assertEquals( fix104IOIQualifier.getFIXNumber(), 104);
        assertEquals( fix104IOIQualifier.getFIXDescription(), "IOIQualifier");
    }
    @Test
    void FIX0105Test() {
        FIXType fix105WaveNo = FIXType.WAVE_NO;
        assertEquals( fix105WaveNo.getFIXName(), "WAVE_NO");
        assertEquals( fix105WaveNo.getFIXNumber(), 105);
        assertEquals( fix105WaveNo.getFIXDescription(), "WaveNo");
    }
    @Test
    void FIX0106Test() {
        FIXType fix106Issuer = FIXType.ISSUER;
        assertEquals( fix106Issuer.getFIXName(), "ISSUER");
        assertEquals( fix106Issuer.getFIXNumber(), 106);
        assertEquals( fix106Issuer.getFIXDescription(), "Issuer");
    }
    @Test
    void FIX0107Test() {
        FIXType fix107SecurityDesc = FIXType.SECURITY_DESC;
        assertEquals( fix107SecurityDesc.getFIXName(), "SECURITY_DESC");
        assertEquals( fix107SecurityDesc.getFIXNumber(), 107);
        assertEquals( fix107SecurityDesc.getFIXDescription(), "SecurityDesc");
    }
    @Test
    void FIX0108Test() {
        FIXType fix108HeartBtInt = FIXType.HEART_BT_INT;
        assertEquals( fix108HeartBtInt.getFIXName(), "HEART_BT_INT");
        assertEquals( fix108HeartBtInt.getFIXNumber(), 108);
        assertEquals( fix108HeartBtInt.getFIXDescription(), "HeartBtInt");
    }
    @Test
    void FIX0109Test() {
        FIXType fix109ClientID = FIXType.CLIENT_ID;
        assertEquals( fix109ClientID.getFIXName(), "CLIENT_ID");
        assertEquals( fix109ClientID.getFIXNumber(), 109);
        assertEquals( fix109ClientID.getFIXDescription(), "ClientID (replaced)");
    }
    @Test
    void FIX0110Test() {
        FIXType fix110MinQty = FIXType.MIN_QTY;
        assertEquals( fix110MinQty.getFIXName(), "MIN_QTY");
        assertEquals( fix110MinQty.getFIXNumber(), 110);
        assertEquals( fix110MinQty.getFIXDescription(), "MinQty");
    }
    @Test
    void FIX0111Test() {
        FIXType fix111MaxFloor = FIXType.MAX_FLOOR;
        assertEquals( fix111MaxFloor.getFIXName(), "MAX_FLOOR");
        assertEquals( fix111MaxFloor.getFIXNumber(), 111);
        assertEquals( fix111MaxFloor.getFIXDescription(), "MaxFloor");
    }
    @Test
    void FIX0112Test() {
        FIXType fix112TestReqID = FIXType.TEST_REQ_ID;
        assertEquals( fix112TestReqID.getFIXName(), "TEST_REQ_ID");
        assertEquals( fix112TestReqID.getFIXNumber(), 112);
        assertEquals( fix112TestReqID.getFIXDescription(), "TestReqID");
    }
    @Test
    void FIX0113Test() {
        FIXType fix113ReportToExch = FIXType.REPORT_TO_EXCH;
        assertEquals( fix113ReportToExch.getFIXName(), "REPORT_TO_EXCH");
        assertEquals( fix113ReportToExch.getFIXNumber(), 113);
        assertEquals( fix113ReportToExch.getFIXDescription(), "ReportToExch");
    }
    @Test
    void FIX0114Test() {
        FIXType fix114LocateReqd = FIXType.LOCATE_REQD;
        assertEquals( fix114LocateReqd.getFIXName(), "LOCATE_REQD");
        assertEquals( fix114LocateReqd.getFIXNumber(), 114);
        assertEquals( fix114LocateReqd.getFIXDescription(), "LocateReqd");
    }
    @Test
    void FIX0115Test() {
        FIXType fix115OnBehalfOfCompID = FIXType.ON_BEHALF_OF_COMP_ID;
        assertEquals( fix115OnBehalfOfCompID.getFIXName(), "ON_BEHALF_OF_COMP_ID");
        assertEquals( fix115OnBehalfOfCompID.getFIXNumber(), 115);
        assertEquals( fix115OnBehalfOfCompID.getFIXDescription(), "OnBehalfOfCompID");
    }
    @Test
    void FIX0116Test() {
        FIXType fix116OnBehalfOfSubID = FIXType.ON_BEHALF_OF_SUB_ID;
        assertEquals( fix116OnBehalfOfSubID.getFIXName(), "ON_BEHALF_OF_SUB_ID");
        assertEquals( fix116OnBehalfOfSubID.getFIXNumber(), 116);
        assertEquals( fix116OnBehalfOfSubID.getFIXDescription(), "OnBehalfOfSubID");
    }
    @Test
    void FIX0117Test() {
        FIXType fix117QuoteID = FIXType.QUOTE_ID;
        assertEquals( fix117QuoteID.getFIXName(), "QUOTE_ID");
        assertEquals( fix117QuoteID.getFIXNumber(), 117);
        assertEquals( fix117QuoteID.getFIXDescription(), "QuoteID");
    }
    @Test
    void FIX0118Test() {
        FIXType fix118NetMoney = FIXType.NET_MONEY;
        assertEquals( fix118NetMoney.getFIXName(), "NET_MONEY");
        assertEquals( fix118NetMoney.getFIXNumber(), 118);
        assertEquals( fix118NetMoney.getFIXDescription(), "NetMoney");
    }
    @Test
    void FIX0119Test() {
        FIXType fix119SettlCurrAmt = FIXType.SETTL_CURR_AMT;
        assertEquals( fix119SettlCurrAmt.getFIXName(), "SETTL_CURR_AMT");
        assertEquals( fix119SettlCurrAmt.getFIXNumber(), 119);
        assertEquals( fix119SettlCurrAmt.getFIXDescription(), "SettlCurrAmt");
    }
    @Test
    void FIX0120Test() {
        FIXType fix120SettlCurrency = FIXType.SETTL_CURRENCY;
        assertEquals( fix120SettlCurrency.getFIXName(), "SETTL_CURRENCY");
        assertEquals( fix120SettlCurrency.getFIXNumber(), 120);
        assertEquals( fix120SettlCurrency.getFIXDescription(), "SettlCurrency");
    }
    @Test
    void FIX0121Test() {
        FIXType fix121ForexReq = FIXType.FOREX_REQ;
        assertEquals( fix121ForexReq.getFIXName(), "FOREX_REQ");
        assertEquals( fix121ForexReq.getFIXNumber(), 121);
        assertEquals( fix121ForexReq.getFIXDescription(), "ForexReq");
    }
    @Test
    void FIX0122Test() {
        FIXType fix122OrigSendingTime = FIXType.ORIG_SENDING_TIME;
        assertEquals( fix122OrigSendingTime.getFIXName(), "ORIG_SENDING_TIME");
        assertEquals( fix122OrigSendingTime.getFIXNumber(), 122);
        assertEquals( fix122OrigSendingTime.getFIXDescription(), "OrigSendingTime");
    }
    @Test
    void FIX0123Test() {
        FIXType fix123GapFillFlag = FIXType.GAP_FILL_FLAG;
        assertEquals( fix123GapFillFlag.getFIXName(), "GAP_FILL_FLAG");
        assertEquals( fix123GapFillFlag.getFIXNumber(), 123);
        assertEquals( fix123GapFillFlag.getFIXDescription(), "GapFillFlag");
    }
    @Test
    void FIX0124Test() {
        FIXType fix124NoExecs = FIXType.NO_EXECS;
        assertEquals( fix124NoExecs.getFIXName(), "NO_EXECS");
        assertEquals( fix124NoExecs.getFIXNumber(), 124);
        assertEquals( fix124NoExecs.getFIXDescription(), "NoExecs");
    }
    @Test
    void FIX0125Test() {
        FIXType fix125CxlType = FIXType.CXL_TYPE;
        assertEquals( fix125CxlType.getFIXName(), "CXL_TYPE");
        assertEquals( fix125CxlType.getFIXNumber(), 125);
        assertEquals( fix125CxlType.getFIXDescription(), "CxlType (no longer used)");
    }
    @Test
    void FIX0126Test() {
        FIXType fix126ExpireTime = FIXType.EXPIRE_TIME;
        assertEquals( fix126ExpireTime.getFIXName(), "EXPIRE_TIME");
        assertEquals( fix126ExpireTime.getFIXNumber(), 126);
        assertEquals( fix126ExpireTime.getFIXDescription(), "ExpireTime");
    }
    @Test
    void FIX0127Test() {
        FIXType fix127DKReason = FIXType.DK_REASON;
        assertEquals( fix127DKReason.getFIXName(), "DK_REASON");
        assertEquals( fix127DKReason.getFIXNumber(), 127);
        assertEquals( fix127DKReason.getFIXDescription(), "DKReason");
    }
    @Test
    void FIX0128Test() {
        FIXType fix128DeliverToCompID = FIXType.DELIVER_TO_COMP_ID;
        assertEquals( fix128DeliverToCompID.getFIXName(), "DELIVER_TO_COMP_ID");
        assertEquals( fix128DeliverToCompID.getFIXNumber(), 128);
        assertEquals( fix128DeliverToCompID.getFIXDescription(), "DeliverToCompID");
    }
    @Test
    void FIX0129Test() {
        FIXType fix129DeliverToSubID = FIXType.DELIVER_TO_SUB_ID;
        assertEquals( fix129DeliverToSubID.getFIXName(), "DELIVER_TO_SUB_ID");
        assertEquals( fix129DeliverToSubID.getFIXNumber(), 129);
        assertEquals( fix129DeliverToSubID.getFIXDescription(), "DeliverToSubID");
    }
    @Test
    void FIX0130Test() {
        FIXType fix130IOINaturalFlag = FIXType.IOI_NATURAL_FLAG;
        assertEquals( fix130IOINaturalFlag.getFIXName(), "IOI_NATURAL_FLAG");
        assertEquals( fix130IOINaturalFlag.getFIXNumber(), 130);
        assertEquals( fix130IOINaturalFlag.getFIXDescription(), "IOINaturalFlag");
    }
    @Test
    void FIX0131Test() {
        FIXType fix131QuoteReqID = FIXType.QUOTE_REQ_ID;
        assertEquals( fix131QuoteReqID.getFIXName(), "QUOTE_REQ_ID");
        assertEquals( fix131QuoteReqID.getFIXNumber(), 131);
        assertEquals( fix131QuoteReqID.getFIXDescription(), "QuoteReqID");
    }
    @Test
    void FIX0132Test() {
        FIXType fix132BidPx = FIXType.BID_PX;
        assertEquals( fix132BidPx.getFIXName(), "BID_PX");
        assertEquals( fix132BidPx.getFIXNumber(), 132);
        assertEquals( fix132BidPx.getFIXDescription(), "BidPx");
    }
    @Test
    void FIX0133Test() {
        FIXType fix133OfferPx = FIXType.OFFER_PX;
        assertEquals( fix133OfferPx.getFIXName(), "OFFER_PX");
        assertEquals( fix133OfferPx.getFIXNumber(), 133);
        assertEquals( fix133OfferPx.getFIXDescription(), "OfferPx");
    }
    @Test
    void FIX0134Test() {
        FIXType fix134BidSize = FIXType.BID_SIZE;
        assertEquals( fix134BidSize.getFIXName(), "BID_SIZE");
        assertEquals( fix134BidSize.getFIXNumber(), 134);
        assertEquals( fix134BidSize.getFIXDescription(), "BidSize");
    }
    @Test
    void FIX0135Test() {
        FIXType fix135OfferSize = FIXType.OFFER_SIZE;
        assertEquals( fix135OfferSize.getFIXName(), "OFFER_SIZE");
        assertEquals( fix135OfferSize.getFIXNumber(), 135);
        assertEquals( fix135OfferSize.getFIXDescription(), "OfferSize");
    }
    @Test
    void FIX0136Test() {
        FIXType fix136NoMiscFees = FIXType.NO_MISC_FEES;
        assertEquals( fix136NoMiscFees.getFIXName(), "NO_MISC_FEES");
        assertEquals( fix136NoMiscFees.getFIXNumber(), 136);
        assertEquals( fix136NoMiscFees.getFIXDescription(), "NoMiscFees");
    }
    @Test
    void FIX0137Test() {
        FIXType fix137MiscFeeAmt = FIXType.MISC_FEE_AMT;
        assertEquals( fix137MiscFeeAmt.getFIXName(), "MISC_FEE_AMT");
        assertEquals( fix137MiscFeeAmt.getFIXNumber(), 137);
        assertEquals( fix137MiscFeeAmt.getFIXDescription(), "MiscFeeAmt");
    }
    @Test
    void FIX0138Test() {
        FIXType fix138MiscFeeCurr = FIXType.MISC_FEE_CURR;
        assertEquals( fix138MiscFeeCurr.getFIXName(), "MISC_FEE_CURR");
        assertEquals( fix138MiscFeeCurr.getFIXNumber(), 138);
        assertEquals( fix138MiscFeeCurr.getFIXDescription(), "MiscFeeCurr");
    }
    @Test
    void FIX0139Test() {
        FIXType fix139MiscFeeType = FIXType.MISC_FEE_TYPE;
        assertEquals( fix139MiscFeeType.getFIXName(), "MISC_FEE_TYPE");
        assertEquals( fix139MiscFeeType.getFIXNumber(), 139);
        assertEquals( fix139MiscFeeType.getFIXDescription(), "MiscFeeType");
    }
    @Test
    void FIX0140Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
        assertEquals( fix140PrevClosePx.getFIXName(), "PREV_CLOSE_PX");
        assertEquals( fix140PrevClosePx.getFIXNumber(), 140);
        assertEquals( fix140PrevClosePx.getFIXDescription(), "PrevClosePx");
    }
    /*
     *
     * END of complete FIX40 tags
     *
     */


    /*
     * Start of FIX4.2 as defined by the FIX Protocol Specification 4.2
     *  Tags: 141-446
     */
    @Test
    void FIX0141Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0142Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0143Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0144Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0145Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0146Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0147Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0148Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0149Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0150Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0151Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0152Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0153Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0154Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0155Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0156Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0157Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0158Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0159Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0160Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0161Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0162Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0163Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0164Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0165Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0166Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0167Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0168Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0169Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0170Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0171Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0172Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0173Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0174Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0175Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0176Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0177Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0178Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0179Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0180Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0181Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0182Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0183Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0184Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0185Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0186Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0187Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0188Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0189Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0190Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0191Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0192Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0193Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0194Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0195Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0196Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0197Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0198Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0199Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0200Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0201Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0202Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0203Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0204Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0205Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0206Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0207Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0208Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0209Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0210Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0211Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0212Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0213Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0214Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0215Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0216Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0217Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0218Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0219Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0220Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0221Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0222Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0223Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0224Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0225Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0226Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0227Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0228Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0229Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0230Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0231Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0232Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0233Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0234Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0235Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0236Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0237Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0238Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0239Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0240Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0241Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0242Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0243Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0244Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0245Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0246Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0247Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0248Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0249Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0250Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0251Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0252Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0253Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0254Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0255Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0256Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0257Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0258Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0259Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0260Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0261Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0262Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0263Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0264Test() {
    }
    @Test
    void FIX0265Test() {
    }
    @Test
    void FIX0266Test() {
    }
    @Test
    void FIX0267Test() {
    }
    @Test
    void FIX0268Test() {
    }
    @Test
    void FIX0269Test() {
    }
    @Test
    void FIX0270Test() {
    }
    @Test
    void FIX0271Test() {
    }
    @Test
    void FIX0272Test() {
    }
    @Test
    void FIX0273Test() {
    }
    @Test
    void FIX0274Test() {
    }
    @Test
    void FIX0275Test() {
    }
    @Test
    void FIX0276Test() {
    }
    @Test
    void FIX0277Test() {
    }
    @Test
    void FIX0278Test() {
    }
    @Test
    void FIX0279Test() {
    }
    @Test
    void FIX0280Test() {
    }
    @Test
    void FIX0281Test() {
    }
    @Test
    void FIX0282Test() {
    }
    @Test
    void FIX0283Test() {
    }
    @Test
    void FIX0284Test() {
    }
    @Test
    void FIX0285Test() {
    }
    @Test
    void FIX0286Test() {
    }
    @Test
    void FIX0287Test() {
    }
    @Test
    void FIX0288Test() {
    }
    @Test
    void FIX0289Test() {
    }
    @Test
    void FIX0290Test() {
    }
    @Test
    void FIX0291Test() {
    }
    @Test
    void FIX0292Test() {
    }
    @Test
    void FIX0293Test() {
    }
    @Test
    void FIX0294Test() {
    }
    @Test
    void FIX0295Test() {
    }
    @Test
    void FIX0296Test() {
    }
    @Test
    void FIX0297Test() {
    }
    @Test
    void FIX0298Test() {
    }
    @Test
    void FIX0299Test() {
    }
    @Test
    void FIX0300Test() {
    }
    @Test
    void FIX0301Test() {
    }
    @Test
    void FIX0302Test() {
    }
    @Test
    void FIX0303Test() {
    }
    @Test
    void FIX0304Test() {
    }
    @Test
    void FIX0305Test() {
    }
    @Test
    void FIX0306Test() {
    }
    @Test
    void FIX0307Test() {
    }
    @Test
    void FIX0308Test() {
    }
    @Test
    void FIX0309Test() {
    }
    @Test
    void FIX0310Test() {
    }
    @Test
    void FIX0311Test() {
    }
    @Test
    void FIX0312Test() {
    }
    @Test
    void FIX0313Test() {
    }
    @Test
    void FIX0314Test() {
    }
    @Test
    void FIX0315Test() {
    }
    @Test
    void FIX0316Test() {
    }
    @Test
    void FIX0317Test() {
    }
    @Test
    void FIX0318Test() {
    }
    @Test
    void FIX0319Test() {
    }
    @Test
    void FIX0320Test() {
    }
    @Test
    void FIX0321Test() {
    }
    @Test
    void FIX0322Test() {
    }
    @Test
    void FIX0323Test() {
    }
    @Test
    void FIX0324Test() {
    }
    @Test
    void FIX0325Test() {
    }
    @Test
    void FIX0326Test() {
    }
    @Test
    void FIX0327Test() {
    }
    @Test
    void FIX0328Test() {
    }
    @Test
    void FIX0329Test() {
    }
    @Test
    void FIX0330Test() {
    }
    @Test
    void FIX0331Test() {
    }
    @Test
    void FIX0332Test() {
    }
    @Test
    void FIX0333Test() {
    }
    @Test
    void FIX0334Test() {
    }
    @Test
    void FIX0335Test() {
    }
    @Test
    void FIX0336Test() {
    }
    @Test
    void FIX0337Test() {
    }
    @Test
    void FIX0338Test() {
    }
    @Test
    void FIX0339Test() {
    }
    @Test
    void FIX0340Test() {
    }
    @Test
    void FIX0341Test() {
    }
    @Test
    void FIX0342Test() {
    }
    @Test
    void FIX0343Test() {
    }
    @Test
    void FIX0344Test() {
    }
    @Test
    void FIX0345Test() {
    }
    @Test
    void FIX0346Test() {
    }
    @Test
    void FIX0347Test() {
    }
    @Test
    void FIX0348Test() {
    }
    @Test
    void FIX0349Test() {
    }
    @Test
    void FIX0350Test() {
    }
    @Test
    void FIX0351Test() {
    }
    @Test
    void FIX0352Test() {
    }
    @Test
    void FIX0353Test() {
    }
    @Test
    void FIX0354Test() {
    }
    @Test
    void FIX0355Test() {
    }
    @Test
    void FIX0356Test() {
    }
    @Test
    void FIX0357Test() {
    }
    @Test
    void FIX0358Test() {
    }
    @Test
    void FIX0359Test() {
    }
    @Test
    void FIX0360Test() {
    }
    @Test
    void FIX0361Test() {
    }
    @Test
    void FIX0362Test() {
    }
    @Test
    void FIX0363Test() {
    }
    @Test
    void FIX0364Test() {
    }
    @Test
    void FIX0365Test() {
    }
    @Test
    void FIX0366Test() {
    }
    @Test
    void FIX0367Test() {
    }
    @Test
    void FIX0368Test() {
    }
    @Test
    void FIX0369Test() {
    }
    @Test
    void FIX0370Test() {
    }
    @Test
    void FIX0371Test() {
    }
    @Test
    void FIX0372Test() {
    }
    @Test
    void FIX0373Test() {
    }
    @Test
    void FIX0374Test() {
    }
    @Test
    void FIX0375Test() {
    }
    @Test
    void FIX0376Test() {
    }
    @Test
    void FIX0377Test() {
    }
    @Test
    void FIX0378Test() {
    }
    @Test
    void FIX0379Test() {
    }
    @Test
    void FIX0380Test() {
    }
    @Test
    void FIX0381Test() {
    }
    @Test
    void FIX0382Test() {
    }
    @Test
    void FIX0383Test() {
    }
    @Test
    void FIX0384Test() {
    }
    @Test
    void FIX0385Test() {
    }
    @Test
    void FIX0386Test() {
    }
    @Test
    void FIX0387Test() {
    }
    @Test
    void FIX0388Test() {
    }
    @Test
    void FIX0389Test() {
    }
    @Test
    void FIX0390Test() {
    }
    @Test
    void FIX0391Test() {
    }
    @Test
    void FIX0392Test() {
    }
    @Test
    void FIX0393Test() {
    }
    @Test
    void FIX0394Test() {
    }
    @Test
    void FIX0395Test() {
    }
    @Test
    void FIX0396Test() {
    }
    @Test
    void FIX0397Test() {
    }
    @Test
    void FIX0398Test() {
    }
    @Test
    void FIX0399Test() {
    }
    @Test
    void FIX0400Test() {
    }
    @Test
    void FIX0401Test() {
    }
    @Test
    void FIX0402Test() {
    }
    @Test
    void FIX0403Test() {
    }
    @Test
    void FIX0404Test() {
    }
    @Test
    void FIX0405Test() {
    }
    @Test
    void FIX0406Test() {
    }
    @Test
    void FIX0407Test() {
    }
    @Test
    void FIX0408Test() {
    }
    @Test
    void FIX0409Test() {
    }
    @Test
    void FIX0410Test() {
    }
    @Test
    void FIX0411Test() {
    }
    @Test
    void FIX0412Test() {
    }
    @Test
    void FIX0413Test() {
    }
    @Test
    void FIX0414Test() {
    }
    @Test
    void FIX0415Test() {
    }
    @Test
    void FIX0416Test() {
    }
    @Test
    void FIX0417Test() {
    }
    @Test
    void FIX0418Test() {
    }
    @Test
    void FIX0419Test() {
    }
    @Test
    void FIX0420Test() {
    }
    @Test
    void FIX0421Test() {
    }
    @Test
    void FIX0422Test() {
    }
    @Test
    void FIX0423Test() {
    }
    @Test
    void FIX0424Test() {
    }
    @Test
    void FIX0425Test() {
    }
    @Test
    void FIX0426Test() {
    }
    @Test
    void FIX0427Test() {
    }
    @Test
    void FIX0428Test() {
    }
    @Test
    void FIX0429Test() {
    }
    @Test
    void FIX0430Test() {
    }
    @Test
    void FIX0431Test() {
    }
    @Test
    void FIX0432Test() {
    }
    @Test
    void FIX0433Test() {
    }
    @Test
    void FIX0434Test() {
    }
    @Test
    void FIX0435Test() {
    }
    @Test
    void FIX0436Test() {
    }
    @Test
    void FIX0437Test() {
    }
    @Test
    void FIX0438Test() {
    }
    @Test
    void FIX0439Test() {
    }
    @Test
    void FIX0440Test() {
    }
    @Test
    void FIX0441Test() {
    }
    @Test
    void FIX0442Test() {
    }
    @Test
    void FIX0443Test() {
    }
    @Test
    void FIX0444Test() {
    }
    @Test
    void FIX0445Test() {
    }
    @Test
    void FIX0446Test() {
    }
    /*
     *
     * END of complete FIX42 tags
     *
     */


    /*
     * Start of FIX4.3 as defined by the FIX Protocol Specification 4.3
     *  Tags: 447-659
     */
    @Test
    void FIX0447Test() {
    }
    @Test
    void FIX0448Test() {
    }
    @Test
    void FIX0449Test() {
    }
    @Test
    void FIX0450Test() {
    }
    @Test
    void FIX0451Test() {
    }
    @Test
    void FIX0452Test() {
    }
    @Test
    void FIX0453Test() {
    }
    @Test
    void FIX0454Test() {
    }
    @Test
    void FIX0455Test() {
    }
    @Test
    void FIX0456Test() {
    }
    @Test
    void FIX0457Test() {
    }
    @Test
    void FIX0458Test() {
    }
    @Test
    void FIX0459Test() {
    }
    @Test
    void FIX0460Test() {
    }
    @Test
    void FIX0461Test() {
    }
    @Test
    void FIX0462Test() {
    }
    @Test
    void FIX0463Test() {
    }
    @Test
    void FIX0464Test() {
    }
    @Test
    void FIX0465Test() {
    }
    @Test
    void FIX0466Test() {
    }
    @Test
    void FIX0467Test() {
    }
    @Test
    void FIX0468Test() {
    }
    @Test
    void FIX0469Test() {
    }
    @Test
    void FIX0470Test() {
    }
    @Test
    void FIX0471Test() {
    }
    @Test
    void FIX0472Test() {
    }
    @Test
    void FIX0473Test() {
    }
    @Test
    void FIX0474Test() {
    }
    @Test
    void FIX0475Test() {
    }
    @Test
    void FIX0476Test() {
    }
    @Test
    void FIX0477Test() {
    }
    @Test
    void FIX0478Test() {
    }
    @Test
    void FIX0479Test() {
    }
    @Test
    void FIX0480Test() {
    }
    @Test
    void FIX0481Test() {
    }
    @Test
    void FIX0482Test() {
    }
    @Test
    void FIX0483Test() {
    }
    @Test
    void FIX0484Test() {
    }
    @Test
    void FIX0485Test() {
    }
    @Test
    void FIX0486Test() {
    }
    @Test
    void FIX0487Test() {
    }
    @Test
    void FIX0488Test() {
    }
    @Test
    void FIX0489Test() {
    }
    @Test
    void FIX0490Test() {
    }
    @Test
    void FIX0491Test() {
    }
    @Test
    void FIX0492Test() {
    }
    @Test
    void FIX0493Test() {
    }
    @Test
    void FIX0494Test() {
    }
    @Test
    void FIX0495Test() {
    }
    @Test
    void FIX0496Test() {
    }
    @Test
    void FIX0497Test() {
    }
    @Test
    void FIX0498Test() {
    }
    @Test
    void FIX0499Test() {
    }
    @Test
    void FIX0500Test() {
    }
    @Test
    void FIX0501Test() {
    }
    @Test
    void FIX0502Test() {
    }
    @Test
    void FIX0503Test() {
    }
    @Test
    void FIX0504Test() {
    }
    @Test
    void FIX0505Test() {
    }
    @Test
    void FIX0506Test() {
    }
    @Test
    void FIX0507Test() {
    }
    @Test
    void FIX0508Test() {
    }
    @Test
    void FIX0509Test() {
    }
    @Test
    void FIX0510Test() {
    }
    @Test
    void FIX0511Test() {
    }
    @Test
    void FIX0512Test() {
    }
    @Test
    void FIX0513Test() {
    }
    @Test
    void FIX0514Test() {
    }
    @Test
    void FIX0515Test() {
    }
    @Test
    void FIX0516Test() {
    }
    @Test
    void FIX0517Test() {
    }
    @Test
    void FIX0518Test() {
    }
    @Test
    void FIX0519Test() {
    }
    @Test
    void FIX0520Test() {
    }
    @Test
    void FIX0521Test() {
    }
    @Test
    void FIX0522Test() {
    }
    @Test
    void FIX0523Test() {
    }
    @Test
    void FIX0524Test() {
    }
    @Test
    void FIX0525Test() {
    }
    @Test
    void FIX0526Test() {
    }
    @Test
    void FIX0527Test() {
    }
    @Test
    void FIX0528Test() {
    }
    @Test
    void FIX0529Test() {
    }
    @Test
    void FIX0530Test() {
    }
    @Test
    void FIX0531Test() {
    }
    @Test
    void FIX0532Test() {
    }
    @Test
    void FIX0533Test() {
    }
    @Test
    void FIX0534Test() {
    }
    @Test
    void FIX0535Test() {
    }
    @Test
    void FIX0536Test() {
    }
    @Test
    void FIX0537Test() {
    }
    @Test
    void FIX0538Test() {
    }
    @Test
    void FIX0539Test() {
    }
    @Test
    void FIX0540Test() {
    }
    @Test
    void FIX0541Test() {
    }
    @Test
    void FIX0542Test() {
    }
    @Test
    void FIX0543Test() {
    }
    @Test
    void FIX0544Test() {
    }
    @Test
    void FIX0545Test() {
    }
    @Test
    void FIX0546Test() {
    }
    @Test
    void FIX0547Test() {
    }
    @Test
    void FIX0548Test() {
    }
    @Test
    void FIX0549Test() {
    }
    @Test
    void FIX0550Test() {
    }
    @Test
    void FIX0551Test() {
    }
    @Test
    void FIX0552Test() {
    }
    @Test
    void FIX0553Test() {
    }
    @Test
    void FIX0554Test() {
    }
    @Test
    void FIX0555Test() {
    }
    @Test
    void FIX0556Test() {
    }
    @Test
    void FIX0557Test() {
    }
    @Test
    void FIX0558Test() {
    }
    @Test
    void FIX0559Test() {
    }
    @Test
    void FIX0560Test() {
    }
    @Test
    void FIX0561Test() {
    }
    @Test
    void FIX0562Test() {
    }
    @Test
    void FIX0563Test() {
    }
    @Test
    void FIX0564Test() {
    }
    @Test
    void FIX0565Test() {
    }
    @Test
    void FIX0566Test() {
    }
    @Test
    void FIX0567Test() {
    }
    @Test
    void FIX0568Test() {
    }
    @Test
    void FIX0569Test() {
    }
    @Test
    void FIX0570Test() {
    }
    @Test
    void FIX0571Test() {
    }
    @Test
    void FIX0572Test() {
    }
    @Test
    void FIX0573Test() {
    }
    @Test
    void FIX0574Test() {
    }
    @Test
    void FIX0575Test() {
    }
    @Test
    void FIX0576Test() {
    }
    @Test
    void FIX0577Test() {
    }
    @Test
    void FIX0578Test() {
    }
    @Test
    void FIX0579Test() {
    }
    @Test
    void FIX0580Test() {
    }
    @Test
    void FIX0581Test() {
    }
    @Test
    void FIX0582Test() {
    }
    @Test
    void FIX0583Test() {
    }
    @Test
    void FIX0584Test() {
    }
    @Test
    void FIX0585Test() {
    }
    @Test
    void FIX0586Test() {
    }
    @Test
    void FIX0587Test() {
    }
    @Test
    void FIX0588Test() {
    }
    @Test
    void FIX0589Test() {
    }
    @Test
    void FIX0590Test() {
    }
    @Test
    void FIX0591Test() {
    }
    @Test
    void FIX0592Test() {
    }
    @Test
    void FIX0593Test() {
    }
    @Test
    void FIX0594Test() {
    }
    @Test
    void FIX0595Test() {
    }
    @Test
    void FIX0596Test() {
    }
    @Test
    void FIX0597Test() {
    }
    @Test
    void FIX0598Test() {
    }
    @Test
    void FIX0599Test() {
    }
    @Test
    void FIX0600Test() {
    }
    @Test
    void FIX0601Test() {
    }
    @Test
    void FIX0602Test() {
    }
    @Test
    void FIX0603Test() {
    }
    @Test
    void FIX0604Test() {
    }
    @Test
    void FIX0605Test() {
    }
    @Test
    void FIX0606Test() {
    }
    @Test
    void FIX0607Test() {
    }
    @Test
    void FIX0608Test() {
    }
    @Test
    void FIX0609Test() {
    }
    @Test
    void FIX0610Test() {
    }
    @Test
    void FIX0611Test() {
    }
    @Test
    void FIX0612Test() {
    }
    @Test
    void FIX0613Test() {
    }
    @Test
    void FIX0614Test() {
    }
    @Test
    void FIX0615Test() {
    }
    @Test
    void FIX0616Test() {
    }
    @Test
    void FIX0617Test() {
    }
    @Test
    void FIX0618Test() {
    }
    @Test
    void FIX0619Test() {
    }
    @Test
    void FIX0620Test() {
    }
    @Test
    void FIX0621Test() {
    }
    @Test
    void FIX0622Test() {
    }
    @Test
    void FIX0623Test() {
    }
    @Test
    void FIX0624Test() {
    }
    @Test
    void FIX0625Test() {
    }
    @Test
    void FIX0626Test() {
    }
    @Test
    void FIX0627Test() {
    }
    @Test
    void FIX0628Test() {
    }
    @Test
    void FIX0629Test() {
    }
    @Test
    void FIX0630Test() {
    }
    @Test
    void FIX0631Test() {
    }
    @Test
    void FIX0632Test() {
    }
    @Test
    void FIX0633Test() {
    }
    @Test
    void FIX0634Test() {
    }
    @Test
    void FIX0635Test() {
    }
    @Test
    void FIX0636Test() {
    }
    @Test
    void FIX0637Test() {
    }
    @Test
    void FIX0638Test() {
    }
    @Test
    void FIX0639Test() {
    }
    @Test
    void FIX0640Test() {
    }
    @Test
    void FIX0641Test() {
    }
    @Test
    void FIX0642Test() {
    }
    @Test
    void FIX0643Test() {
    }
    @Test
    void FIX0644Test() {
    }
    @Test
    void FIX0645Test() {
    }
    @Test
    void FIX0646Test() {
    }
    @Test
    void FIX0647Test() {
    }
    @Test
    void FIX0648Test() {
    }
    @Test
    void FIX0649Test() {
    }
    @Test
    void FIX0650Test() {
    }
    @Test
    void FIX0651Test() {
    }
    @Test
    void FIX0652Test() {
    }
    @Test
    void FIX0653Test() {
    }
    @Test
    void FIX0654Test() {
    }
    @Test
    void FIX0655Test() {
    }
    @Test
    void FIX0656Test() {
    }
    @Test
    void FIX0657Test() {
    }
    @Test
    void FIX0658Test() {
    }
    @Test
    void FIX0659Test() {
    }
    /*
     *
     * END of complete FIX43 tags
     *
     */


    /*
     * Start of FIX4.4 as defined by the FIX Protocol Specification 4.4
     *  Tags: 660-956
     */
    @Test
    void FIX0660Test() {
    }
    @Test
    void FIX0661Test() {
    }
    @Test
    void FIX0662Test() {
    }
    @Test
    void FIX0663Test() {
    }
    @Test
    void FIX0664Test() {
    }
    @Test
    void FIX0665Test() {
    }
    @Test
    void FIX0666Test() {
    }
    @Test
    void FIX0667Test() {
    }
    @Test
    void FIX0668Test() {
    }
    @Test
    void FIX0669Test() {
    }
    @Test
    void FIX0670Test() {
    }
    @Test
    void FIX0671Test() {
    }
    @Test
    void FIX0672Test() {
    }
    @Test
    void FIX0673Test() {
    }
    @Test
    void FIX0674Test() {
    }
    @Test
    void FIX0675Test() {
    }
    @Test
    void FIX0676Test() {
    }
    @Test
    void FIX0677Test() {
    }
    @Test
    void FIX0678Test() {
    }
    @Test
    void FIX0679Test() {
    }
    @Test
    void FIX0680Test() {
    }
    @Test
    void FIX0681Test() {
    }
    @Test
    void FIX0682Test() {
    }
    @Test
    void FIX0683Test() {
    }
    @Test
    void FIX0684Test() {
    }
    @Test
    void FIX0685Test() {
    }
    @Test
    void FIX0686Test() {
    }
    @Test
    void FIX0687Test() {
    }
    @Test
    void FIX0688Test() {
    }
    @Test
    void FIX0689Test() {
    }
    @Test
    void FIX0690Test() {
    }
    @Test
    void FIX0691Test() {
    }
    @Test
    void FIX0692Test() {
    }
    @Test
    void FIX0693Test() {
    }
    @Test
    void FIX0694Test() {
    }
    @Test
    void FIX0695Test() {
    }
    @Test
    void FIX0696Test() {
    }
    @Test
    void FIX0697Test() {
    }
    @Test
    void FIX0698Test() {
    }
    @Test
    void FIX0699Test() {
    }
    @Test
    void FIX0700Test() {
    }
    @Test
    void FIX0701Test() {
    }
    @Test
    void FIX0702Test() {
    }
    @Test
    void FIX0703Test() {
    }
    @Test
    void FIX0704Test() {
    }
    @Test
    void FIX0705Test() {
    }
    @Test
    void FIX0706Test() {
    }
    @Test
    void FIX0707Test() {
    }
    @Test
    void FIX0708Test() {
    }
    @Test
    void FIX0709Test() {
    }
    @Test
    void FIX0710Test() {
    }
    @Test
    void FIX0711Test() {
    }
    @Test
    void FIX0712Test() {
    }
    @Test
    void FIX0713Test() {
    }
    @Test
    void FIX0714Test() {
    }
    @Test
    void FIX0715Test() {
    }
    @Test
    void FIX0716Test() {
    }
    @Test
    void FIX0717Test() {
    }
    @Test
    void FIX0718Test() {
    }
    @Test
    void FIX0719Test() {
    }
    @Test
    void FIX0720Test() {
    }
    @Test
    void FIX0721Test() {
    }
    @Test
    void FIX0722Test() {
    }
    @Test
    void FIX0723Test() {
    }
    @Test
    void FIX0724Test() {
    }
    @Test
    void FIX0725Test() {
    }
    @Test
    void FIX0726Test() {
    }
    @Test
    void FIX0727Test() {
    }
    @Test
    void FIX0728Test() {
    }
    @Test
    void FIX0729Test() {
    }
    @Test
    void FIX0730Test() {
    }
    @Test
    void FIX0731Test() {
    }
    @Test
    void FIX0732Test() {
    }
    @Test
    void FIX0733Test() {
    }
    @Test
    void FIX0734Test() {
    }
    @Test
    void FIX0735Test() {
    }
    @Test
    void FIX0736Test() {
    }
    @Test
    void FIX0737Test() {
    }
    @Test
    void FIX0738Test() {
    }
    @Test
    void FIX0739Test() {
    }
    @Test
    void FIX0740Test() {
    }
    @Test
    void FIX0741Test() {
    }
    @Test
    void FIX0742Test() {
    }
    @Test
    void FIX0743Test() {
    }
    @Test
    void FIX0744Test() {
    }
    @Test
    void FIX0745Test() {
    }
    @Test
    void FIX0746Test() {
    }
    @Test
    void FIX0747Test() {
    }
    @Test
    void FIX0748Test() {
    }
    @Test
    void FIX0749Test() {
    }
    @Test
    void FIX0750Test() {
    }
    @Test
    void FIX0751Test() {
    }
    @Test
    void FIX0752Test() {
    }
    @Test
    void FIX0753Test() {
    }
    @Test
    void FIX0754Test() {
    }
    @Test
    void FIX0755Test() {
    }
    @Test
    void FIX0756Test() {
    }
    @Test
    void FIX0757Test() {
    }
    @Test
    void FIX0758Test() {
    }
    @Test
    void FIX0759Test() {
    }
    @Test
    void FIX0760Test() {
    }
    @Test
    void FIX0761Test() {
    }
    @Test
    void FIX0762Test() {
    }
    @Test
    void FIX0763Test() {
    }
    @Test
    void FIX0764Test() {
    }
    @Test
    void FIX0765Test() {
    }
    @Test
    void FIX0766Test() {
    }
    @Test
    void FIX0767Test() {
    }
    @Test
    void FIX0768Test() {
    }
    @Test
    void FIX0769Test() {
    }
    @Test
    void FIX0770Test() {
    }
    @Test
    void FIX0771Test() {
    }
    @Test
    void FIX0772Test() {
    }
    @Test
    void FIX0773Test() {
    }
    @Test
    void FIX0774Test() {
    }
    @Test
    void FIX0775Test() {
    }
    @Test
    void FIX0776Test() {
    }
    @Test
    void FIX0777Test() {
    }
    @Test
    void FIX0778Test() {
    }
    @Test
    void FIX0779Test() {
    }
    @Test
    void FIX0780Test() {
    }
    @Test
    void FIX0781Test() {
    }
    @Test
    void FIX0782Test() {
    }
    @Test
    void FIX0783Test() {
    }
    @Test
    void FIX0784Test() {
    }
    @Test
    void FIX0785Test() {
    }
    @Test
    void FIX0786Test() {
    }
    @Test
    void FIX0787Test() {
    }
    @Test
    void FIX0788Test() {
    }
    @Test
    void FIX0789Test() {
    }
    @Test
    void FIX0790Test() {
    }
    @Test
    void FIX0791Test() {
    }
    @Test
    void FIX0792Test() {
    }
    @Test
    void FIX0793Test() {
    }
    @Test
    void FIX0794Test() {
    }
    @Test
    void FIX0795Test() {
    }
    @Test
    void FIX0796Test() {
    }
    @Test
    void FIX0797Test() {
    }
    @Test
    void FIX0798Test() {
    }
    @Test
    void FIX0799Test() {
    }
    @Test
    void FIX0800Test() {
    }
    @Test
    void FIX0801Test() {
    }
    @Test
    void FIX0802Test() {
    }
    @Test
    void FIX0803Test() {
    }
    @Test
    void FIX0804Test() {
    }
    @Test
    void FIX0805Test() {
    }
    @Test
    void FIX0806Test() {
    }
    @Test
    void FIX0807Test() {
    }
    @Test
    void FIX0808Test() {
    }
    @Test
    void FIX0809Test() {
    }
    @Test
    void FIX0810Test() {
    }
    @Test
    void FIX0811Test() {
    }
    @Test
    void FIX0812Test() {
    }
    @Test
    void FIX0813Test() {
    }
    @Test
    void FIX0814Test() {
    }
    @Test
    void FIX0815Test() {
    }
    @Test
    void FIX0816Test() {
    }
    @Test
    void FIX0817Test() {
    }
    @Test
    void FIX0818Test() {
    }
    @Test
    void FIX0819Test() {
    }
    @Test
    void FIX0820Test() {
    }
    @Test
    void FIX0821Test() {
    }
    @Test
    void FIX0822Test() {
    }
    @Test
    void FIX0823Test() {
    }
    @Test
    void FIX0824Test() {
    }
    @Test
    void FIX0825Test() {
    }
    @Test
    void FIX0826Test() {
    }
    @Test
    void FIX0827Test() {
    }
    @Test
    void FIX0828Test() {
    }
    @Test
    void FIX0829Test() {
    }
    @Test
    void FIX0830Test() {
    }
    @Test
    void FIX0831Test() {
    }
    @Test
    void FIX0832Test() {
    }
    @Test
    void FIX0833Test() {
    }
    @Test
    void FIX0834Test() {
    }
    @Test
    void FIX0835Test() {
    }
    @Test
    void FIX0836Test() {
    }
    @Test
    void FIX0837Test() {
    }
    @Test
    void FIX0838Test() {
    }
    @Test
    void FIX0839Test() {
    }
    @Test
    void FIX0840Test() {
    }
    @Test
    void FIX0841Test() {
    }
    @Test
    void FIX0842Test() {
    }
    @Test
    void FIX0843Test() {
    }
    @Test
    void FIX0844Test() {
    }
    @Test
    void FIX0845Test() {
    }
    @Test
    void FIX0846Test() {
    }
    @Test
    void FIX0847Test() {
    }
    @Test
    void FIX0848Test() {
    }
    @Test
    void FIX0849Test() {
    }
    @Test
    void FIX0850Test() {
    }
    @Test
    void FIX0851Test() {
    }
    @Test
    void FIX0852Test() {
    }
    @Test
    void FIX0853Test() {
    }
    @Test
    void FIX0854Test() {
    }
    @Test
    void FIX0855Test() {
    }
    @Test
    void FIX0856Test() {
    }
    @Test
    void FIX0857Test() {
    }
    @Test
    void FIX0858Test() {
    }
    @Test
    void FIX0859Test() {
    }
    @Test
    void FIX0860Test() {
    }
    @Test
    void FIX0861Test() {
    }
    @Test
    void FIX0862Test() {
    }
    @Test
    void FIX0863Test() {
    }
    @Test
    void FIX0864Test() {
    }
    @Test
    void FIX0865Test() {
    }
    @Test
    void FIX0866Test() {
    }
    @Test
    void FIX0867Test() {
    }
    @Test
    void FIX0868Test() {
    }
    @Test
    void FIX0869Test() {
    }
    @Test
    void FIX0870Test() {
    }
    @Test
    void FIX0871Test() {
    }
    @Test
    void FIX0872Test() {
    }
    @Test
    void FIX0873Test() {
    }
    @Test
    void FIX0874Test() {
    }
    @Test
    void FIX0875Test() {
    }
    @Test
    void FIX0876Test() {
    }
    @Test
    void FIX0877Test() {
    }
    @Test
    void FIX0878Test() {
    }
    @Test
    void FIX0879Test() {
    }
    @Test
    void FIX0880Test() {
    }
    @Test
    void FIX0881Test() {
    }
    @Test
    void FIX0882Test() {
    }
    @Test
    void FIX0883Test() {
    }
    @Test
    void FIX0884Test() {
    }
    @Test
    void FIX0885Test() {
    }
    @Test
    void FIX0886Test() {
    }
    @Test
    void FIX0887Test() {
    }
    @Test
    void FIX0888Test() {
    }
    @Test
    void FIX0889Test() {
    }
    @Test
    void FIX0890Test() {
    }
    @Test
    void FIX0891Test() {
    }
    @Test
    void FIX0892Test() {
    }
    @Test
    void FIX0893Test() {
    }
    @Test
    void FIX0894Test() {
    }
    @Test
    void FIX0895Test() {
    }
    @Test
    void FIX0896Test() {
    }
    @Test
    void FIX0897Test() {
    }
    @Test
    void FIX0898Test() {
    }
    @Test
    void FIX0899Test() {
    }
    @Test
    void FIX0900Test() {
    }
    @Test
    void FIX0901Test() {
    }
    @Test
    void FIX0902Test() {
    }
    @Test
    void FIX0903Test() {
    }
    @Test
    void FIX0904Test() {
    }
    @Test
    void FIX0905Test() {
    }
    @Test
    void FIX0906Test() {
    }
    @Test
    void FIX0907Test() {
    }
    @Test
    void FIX0908Test() {
    }
    @Test
    void FIX0909Test() {
    }
    @Test
    void FIX0910Test() {
    }
    @Test
    void FIX0911Test() {
    }
    @Test
    void FIX0912Test() {
    }
    @Test
    void FIX0913Test() {
    }
    @Test
    void FIX0914Test() {
    }
    @Test
    void FIX0915Test() {
    }
    @Test
    void FIX0916Test() {
    }
    @Test
    void FIX0917Test() {
    }
    @Test
    void FIX0918Test() {
    }
    @Test
    void FIX0919Test() {
    }
    @Test
    void FIX0920Test() {
    }
    @Test
    void FIX0921Test() {
    }
    @Test
    void FIX0922Test() {
    }
    @Test
    void FIX0923Test() {
    }
    @Test
    void FIX0924Test() {
    }
    @Test
    void FIX0925Test() {
    }
    @Test
    void FIX0926Test() {
    }
    @Test
    void FIX0927Test() {
    }
    @Test
    void FIX0928Test() {
    }
    @Test
    void FIX0929Test() {
    }
    @Test
    void FIX0930Test() {
    }
    @Test
    void FIX0931Test() {
    }
    @Test
    void FIX0932Test() {
    }
    @Test
    void FIX0933Test() {
    }
    @Test
    void FIX0934Test() {
    }
    @Test
    void FIX0935Test() {
    }
    @Test
    void FIX0936Test() {
    }
    @Test
    void FIX0937Test() {
    }
    @Test
    void FIX0938Test() {
    }
    @Test
    void FIX0939Test() {
    }
    @Test
    void FIX0940Test() {
    }
    @Test
    void FIX0941Test() {
    }
    @Test
    void FIX0942Test() {
    }
    @Test
    void FIX0943Test() {
    }
    @Test
    void FIX0944Test() {
    }
    @Test
    void FIX0945Test() {
    }
    @Test
    void FIX0946Test() {
    }
    @Test
    void FIX0947Test() {
    }
    @Test
    void FIX0948Test() {
    }
    @Test
    void FIX0949Test() {
    }
    @Test
    void FIX0950Test() {
    }
    @Test
    void FIX0951Test() {
    }
    @Test
    void FIX0952Test() {
    }
    @Test
    void FIX0953Test() {
    }
    @Test
    void FIX0954Test() {
    }
    @Test
    void FIX0955Test() {
    }
    @Test
    void FIX0956Test() {
    }
    /*
     *
     * END of complete FIX44 tags
     *
     */


    /*
     * Start of FIX5.0 as defined by the FIX Protocol Specification 5.0
     *  Tags: 957-1139
     */
    @Test
    void FIX0957Test() {
    }
    @Test
    void FIX0958Test() {
    }
    @Test
    void FIX0959Test() {
    }
    @Test
    void FIX0960Test() {
    }
    @Test
    void FIX0961Test() {
    }
    @Test
    void FIX0962Test() {
    }
    @Test
    void FIX0963Test() {
    }
    @Test
    void FIX0964Test() {
    }
    @Test
    void FIX0965Test() {
    }
    @Test
    void FIX0966Test() {
    }
    @Test
    void FIX0967Test() {
    }
    @Test
    void FIX0968Test() {
    }
    @Test
    void FIX0969Test() {
    }
    @Test
    void FIX0970Test() {
    }
    @Test
    void FIX0971Test() {
    }
    @Test
    void FIX0972Test() {
    }
    @Test
    void FIX0973Test() {
    }
    @Test
    void FIX0974Test() {
    }
    @Test
    void FIX0975Test() {
    }
    @Test
    void FIX0976Test() {
    }
    @Test
    void FIX0977Test() {
    }
    @Test
    void FIX0978Test() {
    }
    @Test
    void FIX0979Test() {
    }
    @Test
    void FIX0980Test() {
    }
    @Test
    void FIX0981Test() {
    }
    @Test
    void FIX0982Test() {
    }
    @Test
    void FIX0983Test() {
    }
    @Test
    void FIX0984Test() {
    }
    @Test
    void FIX0985Test() {
    }
    @Test
    void FIX0986Test() {
    }
    @Test
    void FIX0987Test() {
    }
    @Test
    void FIX0988Test() {
    }
    @Test
    void FIX0989Test() {
    }
    @Test
    void FIX0990Test() {
    }
    @Test
    void FIX0991Test() {
    }
    @Test
    void FIX0992Test() {
    }
    @Test
    void FIX0993Test() {
    }
    @Test
    void FIX0994Test() {
    }
    @Test
    void FIX0995Test() {
    }
    @Test
    void FIX0996Test() {
    }
    @Test
    void FIX0997Test() {
    }
    @Test
    void FIX0998Test() {
    }
    @Test
    void FIX0999Test() {
    }
    @Test
    void FIX1000Test() {
        FIXType fix1000UnderlyingTimeUnit = FIXType.UNDERLYING_TIME_UNIT;
        assertEquals( fix1000UnderlyingTimeUnit.getFIXName(), "UNDERLYING_TIME_UNIT");
        assertEquals( fix1000UnderlyingTimeUnit.getFIXNumber(), 1000);
        assertEquals( fix1000UnderlyingTimeUnit.getFIXDescription(), "OfferPx");
    }
    @Test
    void FIX1001Test() {
        FIXType Tag1001LegTimeUnit = FIXType.LEG_TIME_UNIT;
    }
    @Test
    void FIX1002Test() {
        FIXType Tag1002AllocMethod = FIXType.ALLOC_METHOD;
    }
    @Test
    void FIX1003Test() {
        FIXType Tag1003TradeID = FIXType.TRADE_ID;
    }
    @Test
    @Deprecated
    void FIX1004Test() {
    }
    @Test
    void FIX1005Test() {
        FIXType Tag1005SideTradeReportID = FIXType.SIDE_TRADE_REPORT_ID;
    }
    @Test
    void FIX1006Test() {
        FIXType Tag1006SideFillStationCd = FIXType.SIDE_FILL_STATION_CD;
    }
    @Test
    void FIX1007Test() {
        FIXType Tag1007SideReasonCd = FIXType.SIDE_REASON_CD;
    }
    @Test
    void FIX1008Test() {
        FIXType Tag1008SideTrdSubTyp = FIXType.SIDE_TRD_SUB_TYP;
    }
    @Test
    void FIX1009Test() {
        FIXType Tag1009SideQty = FIXType.SIDE_QTY;
    }
    @Test
    @Deprecated
    void FIX1010Test() {
    }
    @Test
    void FIX1011Test() {
        FIXType Tag1011MessageEventSource = FIXType.MESSAGE_EVENT_SOURCE;
    }
    @Test
    void FIX1012Test() {
        FIXType Tag1012SideTrdRegTimestamp = FIXType.SIDE_TRD_REG_TIMESTAMP;
    }
    @Test
    void FIX1013Test() {
        FIXType Tag1013SideTrdRegTimestampType = FIXType.SIDE_TRD_REG_TIMESTAMP_TYPE;
    }
    @Test
    void FIX1014Test() {
        FIXType Tag1014SideTrdRegTimestampSrc = FIXType.SIDE_TRD_REG_TIMESTAMP_SRC;
    }
    @Test
    void FIX1015Test() {
        FIXType Tag1015AsOfIndicator = FIXType.AS_OF_INDICATOR;
    }
    @Test
    void FIX1016Test() {
        FIXType Tag1016NoSideTrdRegTS = FIXType.NO_SIDE_TRD_REG_TS;
    }
    @Test
    void FIX1017Test() {
        FIXType Tag1017LegOptionRatio = FIXType.LEG_OPTION_RATIO;
    }
    @Test
    void FIX1018Test() {
        FIXType Tag1018NoInstrumentParties = FIXType.NO_INSTRUMENT_PARTIES;
    }
    @Test
    void FIX1019Test() {
        FIXType Tag1019InstrumentPartyID = FIXType.INSTRUMENT_PARTY_ID;
    }
    @Test
    void FIX1020Test() {
        FIXType Tag1020TradeVolume = FIXType.TRADE_VOLUME;
    }
    @Test
    void FIX1021Test() {
        FIXType Tag1021MDBookType = FIXType.MD_BOOK_TYPE;
    }
    @Test
    void FIX1022Test() {
        FIXType Tag1022MDFeedType = FIXType.MD_FEED_TYPE;
    }
    @Test
    void FIX1023Test() {
        FIXType Tag1023MDPriceLevel = FIXType.MD_PRICE_LEVEL;
    }
    @Test
    void FIX1024Test() {
        FIXType Tag1024MDOriginType = FIXType.MD_ORIGIN_TYPE;
    }
    @Test
    void FIX1025Test() {
        FIXType Tag1025FirstPx = FIXType.FIRST_PX;
    }
    @Test
    void FIX1026Test() {
        FIXType Tag1026MDEntrySpotRate = FIXType.MD_ENTRY_SPOT_RATE;
    }
    @Test
    void FIX1027Test() {
        FIXType Tag1027MDEntryForwardPoints = FIXType.MD_ENTRY_FORWARD_POINTS;
    }
    @Test
    void FIX1028Test() {
        FIXType Tag1028ManualOrderIndicator = FIXType.MANUAL_ORDER_INDICATOR;
    }
    @Test
    void FIX1029Test() {
        FIXType Tag1029CustDirectedOrder = FIXType.CUST_DIRECTED_ORDER;
    }
    @Test
    void FIX1030Test() {
        FIXType Tag1030ReceivedDeptID = FIXType.RECEIVED_DEPT_ID;
    }
    @Test
    void FIX1031Test() {
        FIXType Tag1031CustOrderHandlingInst = FIXType.CUST_ORDER_HANDLING_INST;
    }
    @Test
    void FIX1032Test() {
        FIXType Tag1032OrderHandlingInstSource = FIXType.ORDER_HANDLING_INST_SOURCE;
    }
    @Test
    void FIX1033Test() {
        FIXType Tag1033DeskType = FIXType.DESK_TYPE;
    }
    @Test
    void FIX1034Test() {
        FIXType Tag1034DeskTypeSource = FIXType.DESK_TYPE_SOURCE;
    }
    @Test
    void FIX1035Test() {
        FIXType Tag1035DeskOrderHandlingInst = FIXType.DESK_ORDER_HANDLING_INST;
    }
    @Test
    void FIX1036Test() {
        FIXType Tag1036ExecAckStatus = FIXType.EXEC_ACK_STATUS;
    }
    @Test
    void FIX1037Test() {
        FIXType Tag1037UnderlyingDeliveryAmount = FIXType.UNDERLYING_DELIVERY_AMOUNT;
    }
    @Test
    void FIX1038Test() {
        FIXType Tag1038UnderlyingCapValue = FIXType.UNDERLYING_CAP_VALUE;
    }
    @Test
    void FIX1039Test() {
        FIXType Tag1039UnderlyingSettlMethod = FIXType.UNDERLYING_SETTL_METHOD;
    }
    @Test
    void FIX1040Test() {
        FIXType Tag1040SecondaryTradeID = FIXType.SECONDARY_TRADE_ID;
    }
    @Test
    void FIX1041Test() {
        FIXType Tag1041FirmTradeID = FIXType.FIRM_TRADE_ID;
    }
    @Test
    void FIX1042Test() {
        FIXType Tag1042SecondaryFirmTradeID = FIXType.SECONDARY_FIRM_TRADE_ID;
    }
    @Test
    void FIX1043Test() {
        FIXType Tag1043CollApplType = FIXType.COLL_APPL_TYPE;
    }
    @Test
    void FIX1044Test() {
        FIXType Tag1044UnderlyingAdjustedQuantity = FIXType.UNDERLYING_ADJUSTED_QUANTITY;
    }
    @Test
    void FIX1045Test() {
        FIXType Tag1045UnderlyingFXRate = FIXType.UNDERLYING_FX_RATE;
    }
    @Test
    void FIX1046Test() {
        FIXType Tag1046UnderlyingFXRateCalc = FIXType.UNDERLYING_FX_RATE_CALC;
    }
    @Test
    void FIX1047Test() {
        FIXType Tag1047AllocPositionEffect = FIXType.ALLOC_POSITION_EFFECT;
    }
    @Test
    void FIX1048Test() {
        FIXType Tag1048DealingCapacity = FIXType.DEALING_CAPACITY;
    }
    @Test
    void FIX1049Test() {
        FIXType Tag1049InstrmtAssignmentMethod = FIXType.INSTRMT_ASSIGNMENT_METHOD;
    }
    @Test
    void FIX1050Test() {
        FIXType Tag1050InstrumentPartyIDSource = FIXType.INSTRUMENT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1051Test() {
        FIXType Tag1051InstrumentPartyRole = FIXType.INSTRUMENT_PARTY_ROLE;
    }
    @Test
    void FIX1052Test() {
        FIXType Tag1052NoInstrumentPartySubIDs = FIXType.NO_INSTRUMENT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1053Test() {
        FIXType Tag1053InstrumentPartySubID = FIXType.INSTRUMENT_PARTY_SUB_ID;
    }
    @Test
    void FIX1054Test() {
        FIXType Tag1054InstrumentPartySubIDType = FIXType.INSTRUMENT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1055Test() {
        FIXType Tag1055PositionCurrency = FIXType.POSITION_CURRENCY;
    }
    @Test
    void FIX1056Test() {
        FIXType Tag1056CalculatedCcyLastQty = FIXType.CALCULATED_CCY_LAST_QTY;
    }
    @Test
    void FIX1057Test() {
        FIXType Tag1057AggressorIndicator = FIXType.AGGRESSOR_INDICATOR;
    }
    @Test
    void FIX1058Test() {
        FIXType Tag1058NoUndlyInstrumentParties = FIXType.NO_UNDLY_INSTRUMENT_PARTIES;
    }
    @Test
    void FIX1059Test() {
        FIXType Tag1059UndlyInstrumentPartyID = FIXType.UNDLY_INSTRUMENT_PARTY_ID;
    }
    @Test
    void FIX1060Test() {
        FIXType Tag1060UndlyInstrumentPartyIDSource = FIXType.UNDLY_INSTRUMENT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1061Test() {
        FIXType Tag1061UndlyInstrumentPartyRole = FIXType.UNDLY_INSTRUMENT_PARTY_ROLE;
    }
    @Test
    void FIX1062Test() {
        FIXType Tag1062NoUndlyInstrumentPartySubIDs = FIXType.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1063Test() {
        FIXType Tag1063UndlyInstrumentPartySubID = FIXType.UNDLY_INSTRUMENT_PARTY_SUB_ID;
    }
    @Test
    void FIX1064Test() {
        FIXType Tag1064UndlyInstrumentPartySubIDType = FIXType.UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1065Test() {
        FIXType Tag1065BidSwapPoints = FIXType.BID_SWAP_POINTS;
    }
    @Test
    void FIX1066Test() {
        FIXType Tag1066OfferSwapPoints = FIXType.OFFER_SWAP_POINTS;
    }
    @Test
    void FIX1067Test() {
        FIXType Tag1067LegBidForwardPoints = FIXType.LEG_BID_FORWARD_POINTS;
    }
    @Test
    void FIX1068Test() {
        FIXType Tag1068LegOfferForwardPoints = FIXType.LEG_OFFER_FORWARD_POINTS;
    }
    @Test
    void FIX1069Test() {
        FIXType Tag1069SwapPoints = FIXType.SWAP_POINTS;
    }
    @Test
    void FIX1070Test() {
        FIXType Tag1070MDQuoteType = FIXType.MD_QUOTE_TYPE;
    }
    @Test
    void FIX1071Test() {
        FIXType Tag1071LastSwapPoints = FIXType.LAST_SWAP_POINTS;
    }
    @Test
    void FIX1072Test() {
        FIXType Tag1072SideGrossTradeAmt = FIXType.SIDE_GROSS_TRADE_AMT;
    }
    @Test
    void FIX1073Test() {
        FIXType Tag1073LegLastForwardPoints = FIXType.LEG_LAST_FORWARD_POINTS;
    }
    @Test
    void FIX1074Test() {
        FIXType Tag1074LegCalculatedCcyLastQty = FIXType.LEG_CALCULATED_CCY_LAST_QTY;
    }
    @Test
    void FIX1075Test() {
        FIXType Tag1075LegGrossTradeAmt = FIXType.LEG_GROSS_TRADE_AMT;
    }
    @Test
    @Deprecated
    void FIX1076Test() {
    }
    @Test
    @Deprecated
    void FIX1077Test() {
    }
    @Test
    @Deprecated
    void FIX1078Test() {
    }
    @Test
    void FIX1079Test() {
        FIXType Tag1079MaturityTime = FIXType.MATURITY_TIME;
    }
    @Test
    void FIX1080Test() {
        FIXType Tag1080RefOrderID = FIXType.REF_ORDER_ID;
    }
    @Test
    void FIX1081Test() {
        FIXType Tag1081RefOrderIDSource = FIXType.REF_ORDER_ID_SOURCE;
    }
    @Test
    void FIX1082Test() {
        FIXType Tag1082SecondaryDisplayQty = FIXType.SECONDARY_DISPLAY_QTY;
    }
    @Test
    void FIX1083Test() {
        FIXType Tag1083DisplayWhen = FIXType.DISPLAY_WHEN;
    }
    @Test
    void FIX1084Test() {
        FIXType Tag1084DisplayMethod = FIXType.DISPLAY_METHOD;
    }
    @Test
    void FIX1085Test() {
        FIXType Tag1085DisplayLowQty = FIXType.DISPLAY_LOW_QTY;
    }
    @Test
    void FIX1086Test() {
        FIXType Tag1086DisplayHighQty = FIXType.DISPLAY_HIGH_QTY;
    }
    @Test
    void FIX1087Test() {
        FIXType Tag1087DisplayMinIncr = FIXType.DISPLAY_MIN_INCR;
    }
    @Test
    void FIX1088Test() {
        FIXType Tag1088RefreshQty = FIXType.REFRESH_QTY;
    }
    @Test
    void FIX1089Test() {
        FIXType Tag1089MatchIncrement = FIXType.MATCH_INCREMENT;
    }
    @Test
    void FIX1090Test() {
        FIXType Tag1090MaxPriceLevels = FIXType.MAX_PRICE_LEVELS;
    }
    @Test
    void FIX1091Test() {
        FIXType Tag1091PreTradeAnonymity = FIXType.PRE_TRADE_ANONYMITY;
    }
    @Test
    void FIX1092Test() {
        FIXType Tag1092PriceProtectionScope = FIXType.PRICE_PROTECTION_SCOPE;
    }
    @Test
    void FIX1093Test() {
        FIXType Tag1093LotType = FIXType.LOT_TYPE;
    }
    @Test
    void FIX1094Test() {
        FIXType Tag1094PegPriceType = FIXType.PEG_PRICE_TYPE;
    }
    @Test
    void FIX1095Test() {
        FIXType Tag1095PeggedRefPrice = FIXType.PEGGED_REF_PRICE;
    }
    @Test
    void FIX1096Test() {
        FIXType Tag1096PegSecurityIDSource = FIXType.PEG_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX1097Test() {
        FIXType Tag1097PegSecurityID = FIXType.PEG_SECURITY_ID;
    }
    @Test
    void FIX1098Test() {
        FIXType Tag1098PegSymbol = FIXType.PEG_SYMBOL;
    }
    @Test
    void FIX1099Test() {
        FIXType Tag1099PegSecurityDesc = FIXType.PEG_SECURITY_DESC;
    }
    @Test
    void FIX1100Test() {
        FIXType Tag1100TriggerType = FIXType.TRIGGER_TYPE;
    }
    @Test
    void FIX1101Test() {
        FIXType Tag1101TriggerAction = FIXType.TRIGGER_ACTION;
    }
    @Test
    void FIX1102Test() {
        FIXType Tag1102TriggerPrice = FIXType.TRIGGER_PRICE;
    }
    @Test
    void FIX1103Test() {
        FIXType Tag1103TriggerSymbol = FIXType.TRIGGER_SYMBOL;
    }
    @Test
    void FIX1104Test() {
        FIXType Tag1104TriggerSecurityID = FIXType.TRIGGER_SECURITY_ID;
    }
    @Test
    void FIX1105Test() {
        FIXType Tag1105TriggerSecurityIDSource = FIXType.TRIGGER_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX1106Test() {
        FIXType Tag1106TriggerSecurityDesc = FIXType.TRIGGER_SECURITY_DESC;
    }
    @Test
    void FIX1107Test() {
        FIXType Tag1107TriggerPriceType = FIXType.TRIGGER_PRICE_TYPE;
    }
    @Test
    void FIX1108Test() {
        FIXType Tag1108TriggerPriceTypeScope = FIXType.TRIGGER_PRICE_TYPE_SCOPE;
    }
    @Test
    void FIX1109Test() {
        FIXType Tag1109TriggerPriceDirection = FIXType.TRIGGER_PRICE_DIRECTION;
    }
    @Test
    void FIX1110Test() {
        FIXType Tag1110TriggerNewPrice = FIXType.TRIGGER_NEW_PRICE;
    }
    @Test
    void FIX1111Test() {
        FIXType Tag1111TriggerOrderType = FIXType.TRIGGER_ORDER_TYPE;
    }
    @Test
    void FIX1112Test() {
        FIXType Tag1112TriggerNewQty = FIXType.TRIGGER_NEW_QTY;
    }
    @Test
    void FIX1113Test() {
        FIXType Tag1113TriggerTradingSessionID = FIXType.TRIGGER_TRADING_SESSION_ID;
    }
    @Test
    void FIX1114Test() {
        FIXType Tag1114TriggerTradingSessionSubID = FIXType.TRIGGER_TRADING_SESSION_SUB_ID;
    }
    @Test
    void FIX1115Test() {
        FIXType Tag1115OrderCategory = FIXType.ORDER_CATEGORY;
    }
    @Test
    void FIX1116Test() {
        FIXType Tag1116NoRootPartyIDs = FIXType.NO_ROOT_PARTY_IDS;
    }
    @Test
    void FIX1117Test() {
        FIXType Tag1117RootPartyID = FIXType.ROOT_PARTY_ID;
    }
    @Test
    void FIX1118Test() {
        FIXType Tag1118RootPartyIDSource = FIXType.ROOT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1119Test() {
        FIXType Tag1119RootPartyRole = FIXType.ROOT_PARTY_ROLE;
    }
    @Test
    void FIX1120Test() {
        FIXType Tag1120NoRootPartySubIDs = FIXType.NO_ROOT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1121Test() {
        FIXType Tag1121RootPartySubID = FIXType.ROOT_PARTY_SUB_ID;
    }
    @Test
    void FIX1122Test() {
        FIXType Tag1122RootPartySubIDType = FIXType.ROOT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1123Test() {
        FIXType Tag1123TradeHandlingInstr = FIXType.TRADE_HANDLING_INSTR;
    }
    @Test
    void FIX1124Test() {
        FIXType Tag1124OrigTradeHandlingInstr = FIXType.ORIG_TRADE_HANDLING_INSTR;
    }
    @Test
    void FIX1125Test() {
        FIXType Tag1125OrigTradeDate = FIXType.ORIG_TRADE_DATE;
    }
    @Test
    void FIX1126Test() {
        FIXType Tag1126OrigTradeID = FIXType.ORIG_TRADE_ID;
    }
    @Test
    void FIX1127Test() {
        FIXType Tag1127OrigSecondaryTradeID = FIXType.ORIG_SECONDARY_TRADE_ID;
    }
    @Test
    void FIX1128Test() {
        FIXType Tag1128ApplVerID = FIXType.APPL_VER_ID;
    }
    @Test
    void FIX1129Test() {
        FIXType Tag1129CstmApplVerID = FIXType.CSTM_APPL_VER_ID;
    }
    @Test
    void FIX1130Test() {
        FIXType Tag1130RefApplVerID = FIXType.REF_APPL_VER_ID;
    }
    @Test
    void FIX1131Test() {
        FIXType Tag1131RefCstmApplVerID = FIXType.REF_CSTM_APPL_VER_ID;
    }
    @Test
    void FIX1132Test() {
        FIXType Tag1132TZTransactTime = FIXType.TZ_TRANSACT_TIME;
    }
    @Test
    void FIX1133Test() {
        FIXType Tag1133ExDestinationIDSource = FIXType.EX_DESTINATION_ID_SOURCE;
    }
    @Test
    void FIX1134Test() {
        FIXType Tag1134ReportedPxDiff = FIXType.REPORTED_PX_DIFF;
    }
    @Test
    void FIX1135Test() {
        FIXType Tag1135RptSys = FIXType.RPT_SYS;
    }
    @Test
    void FIX1136Test() {
        FIXType Tag1136AllocClearingFeeIndicator = FIXType.ALLOC_CLEARING_FEE_INDICATOR;
    }
    @Test
    void FIX1137Test() {
        FIXType Tag1137DefaultApplVerID = FIXType.DEFAULT_APPL_VER_ID;
    }
    @Test
    void FIX1138Test() {
        FIXType Tag1138DisplayQty = FIXType.DISPLAY_QTY;
    }
    @Test
    void FIX1139Test() {
        FIXType fag1139ExchangeSpecialInstructions = FIXType.EXCHANGE_SPECIAL_INSTRUCTIONS;
    }
    /*
     *
     * END of complete FIX50 tags
     *
     */


    /*
     * Start of FIX5.x as defined by the FIX Protocol Specification 5.x?
     *  Tags: 1140-????
     * TODO: define tag stubs as needed
     */

//    @Test
//    void FIX1140Test() {
//    }

    /*
     *
     * END of complete FIX5x tags????
     *
     */

}
