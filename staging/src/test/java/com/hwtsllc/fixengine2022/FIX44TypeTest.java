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

package com.hwtsllc.fixengine2022;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FIX44TypeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1Account.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void Test() {
        assertEquals(1,1);
        assertNotEquals(2,1);
        logger.info(WHERE_AM_I + ":Successful Test(). More testing is needed.");
    }

    /*
     * Start of FIX4.4 as defined by the FIX Protocol Specification 4.4
     *  Tags: 660-956
     */
    @Test
    void FIX0660Test() {
        FIXType Tag660AcctIDSource = FIXType.ACCT_ID_SOURCE;
    }
    @Test
    void FIX0661Test() {
        FIXType Tag661AllocAcctIDSource = FIXType.ALLOC_ACCT_ID_SOURCE;
    }
    @Test
    void FIX0662Test() {
        FIXType Tag662BenchmarkPrice = FIXType.BENCHMARK_PRICE;
    }
    @Test
    void FIX0663Test() {
        FIXType Tag663BenchmarkPriceType = FIXType.BENCHMARK_PRICE_TYPE;
    }
    @Test
    void FIX0664Test() {
        FIXType Tag664ConfirmID = FIXType.CONFIRM_ID;
    }
    @Test
    void FIX0665Test() {
        FIXType Tag665ConfirmStatus = FIXType.CONFIRM_STATUS;
    }
    @Test
    void FIX0666Test() {
        FIXType Tag666ConfirmTransType = FIXType.CONFIRM_TRANS_TYPE;
    }
    @Test
    void FIX0667Test() {
        FIXType Tag667ContractSettlMonth = FIXType.CONTRACT_SETTL_MONTH;
    }
    @Test
    void FIX0668Test() {
        FIXType Tag668DeliveryForm = FIXType.DELIVERY_FORM;
    }
    @Test
    void FIX0669Test() {
        FIXType Tag669LastParPx = FIXType.LAST_PAR_PX;
    }
    @Test
    void FIX0670Test() {
        FIXType Tag670NoLegAllocs = FIXType.NO_LEG_ALLOCS;
    }
    @Test
    void FIX0671Test() {
        FIXType Tag671LegAllocAccount = FIXType.LEG_ALLOC_ACCOUNT;
    }
    @Test
    void FIX0672Test() {
        FIXType Tag672LegIndividualAllocID = FIXType.LEG_INDIVIDUAL_ALLOC_ID;
    }
    @Test
    void FIX0673Test() {
        FIXType Tag673LegAllocQty = FIXType.LEG_ALLOC_QTY;
    }
    @Test
    void FIX0674Test() {
        FIXType Tag674LegAllocAcctIDSource = FIXType.LEG_ALLOC_ACCT_ID_SOURCE;
    }
    @Test
    void FIX0675Test() {
        FIXType Tag675LegSettlCurrency = FIXType.LEG_SETTL_CURRENCY;
    }
    @Test
    void FIX0676Test() {
        FIXType Tag676LegBenchmarkCurveCurrency = FIXType.LEG_BENCHMARK_CURVE_CURRENCY;
    }
    @Test
    void FIX0677Test() {
        FIXType Tag677LegBenchmarkCurveName = FIXType.LEG_BENCHMARK_CURVE_NAME;
    }
    @Test
    void FIX0678Test() {
        FIXType Tag678LegBenchmarkCurvePoint = FIXType.LEG_BENCHMARK_CURVE_POINT;
    }
    @Test
    void FIX0679Test() {
        FIXType Tag679LegBenchmarkPrice = FIXType.LEG_BENCHMARK_PRICE;
    }
    @Test
    void FIX0680Test() {
        FIXType Tag680LegBenchmarkPriceType = FIXType.LEG_BENCHMARK_PRICE_TYPE;
    }
    @Test
    void FIX0681Test() {
        FIXType Tag681LegBidPx = FIXType.LEG_BID_PX;
    }
    @Test
    void FIX0682Test() {
        FIXType Tag682LegIOIQty = FIXType.LEG_IOI_QTY;
    }
    @Test
    void FIX0683Test() {
        FIXType Tag683NoLegStipulations = FIXType.NO_LEG_STIPULATIONS;
    }
    @Test
    void FIX0684Test() {
        FIXType Tag684LegOfferPx = FIXType.LEG_OFFER_PX;
    }
    @Test
    void FIX0685Test() {
        FIXType Tag685LegOrderQty = FIXType.LEG_ORDER_QTY;
    }
    @Test
    void FIX0686Test() {
        FIXType Tag686LegPriceType = FIXType.LEG_PRICE_TYPE;
    }
    @Test
    void FIX0687Test() {
        FIXType Tag687LegQty = FIXType.LEG_QTY;
    }
    @Test
    void FIX0688Test() {
        FIXType Tag688LegStipulationType = FIXType.LEG_STIPULATION_TYPE;
    }
    @Test
    void FIX0689Test() {
        FIXType Tag689LegStipulationValue = FIXType.LEG_STIPULATION_VALUE;
    }
    @Test
    void FIX0690Test() {
        FIXType Tag690LegSwapType = FIXType.LEG_SWAP_TYPE;
    }
    @Test
    void FIX0691Test() {
        FIXType Tag691Pool = FIXType.POOL;
    }
    @Test
    void FIX0692Test() {
        FIXType Tag692QuotePriceType = FIXType.QUOTE_PRICE_TYPE;
    }
    @Test
    void FIX0693Test() {
        FIXType Tag693QuoteRespID = FIXType.QUOTE_RESP_ID;
    }
    @Test
    void FIX0694Test() {
        FIXType Tag694QuoteRespType = FIXType.QUOTE_RESP_TYPE;
    }
    @Test
    void FIX0695Test() {
        FIXType Tag695QuoteQualifier = FIXType.QUOTE_QUALIFIER;
    }
    @Test
    void FIX0696Test() {
        FIXType Tag696YieldRedemptionDate = FIXType.YIELD_REDEMPTION_DATE;
    }
    @Test
    void FIX0697Test() {
        FIXType Tag697YieldRedemptionPrice = FIXType.YIELD_REDEMPTION_PRICE;
    }
    @Test
    void FIX0698Test() {
        FIXType Tag698YieldRedemptionPriceType = FIXType.YIELD_REDEMPTION_PRICE_TYPE;
    }
    @Test
    void FIX0699Test() {
        FIXType Tag699BenchmarkSecurityID = FIXType.BENCHMARK_SECURITY_ID;
    }
    @Test
    void FIX0700Test() {
        FIXType Tag700ReversalIndicator = FIXType.REVERSAL_INDICATOR;
    }
    @Test
    void FIX0701Test() {
        FIXType Tag701YieldCalcDate = FIXType.YIELD_CALC_DATE;
    }
    @Test
    void FIX0702Test() {
        FIXType Tag702NoPositions = FIXType.NO_POSITIONS;
    }
    @Test
    void FIX0703Test() {
        FIXType Tag703PosType = FIXType.POS_TYPE;
    }
    @Test
    void FIX0704Test() {
        FIXType Tag704LongQty = FIXType.LONG_QTY;
    }
    @Test
    void FIX0705Test() {
        FIXType Tag705ShortQty = FIXType.SHORT_QTY;
    }
    @Test
    void FIX0706Test() {
        FIXType Tag706PosQtyStatus = FIXType.POS_QTY_STATUS;
    }
    @Test
    void FIX0707Test() {
        FIXType Tag707PosAmtType = FIXType.POS_AMT_TYPE;
    }
    @Test
    void FIX0708Test() {
        FIXType Tag708PosAmt = FIXType.POS_AMT;
    }
    @Test
    void FIX0709Test() {
        FIXType Tag709PosTransType = FIXType.POS_TRANS_TYPE;
    }
    @Test
    void FIX0710Test() {
        FIXType Tag710PosReqID = FIXType.POS_REQ_ID;
    }
    @Test
    void FIX0711Test() {
        FIXType Tag711NoUnderlyings = FIXType.NO_UNDERLYINGS;
    }
    @Test
    void FIX0712Test() {
        FIXType Tag712PosMaintAction = FIXType.POS_MAINT_ACTION;
    }
    @Test
    void FIX0713Test() {
        FIXType Tag713OrigPosReqRefID = FIXType.ORIG_POS_REQ_REF_ID;
    }
    @Test
    void FIX0714Test() {
        FIXType Tag714PosMaintRptRefID = FIXType.POS_MAINT_RPT_REF_ID;
    }
    @Test
    void FIX0715Test() {
        FIXType Tag715ClearingBusinessDate = FIXType.CLEARING_BUSINESS_DATE;
    }
    @Test
    void FIX0716Test() {
        FIXType Tag716SettlSessID = FIXType.SETTL_SESS_ID;
    }
    @Test
    void FIX0717Test() {
        FIXType Tag717SettlSessSubID = FIXType.SETTL_SESS_SUB_ID;
    }
    @Test
    void FIX0718Test() {
        FIXType Tag718AdjustmentType = FIXType.ADJUSTMENT_TYPE;
    }
    @Test
    void FIX0719Test() {
        FIXType Tag719ContraryInstructionIndicator = FIXType.CONTRARY_INSTRUCTION_INDICATOR;
    }
    @Test
    void FIX0720Test() {
        FIXType Tag720PriorSpreadIndicator = FIXType.PRIOR_SPREAD_INDICATOR;
    }
    @Test
    void FIX0721Test() {
        FIXType Tag721PosMaintRptID = FIXType.POS_MAINT_RPT_ID;
    }
    @Test
    void FIX0722Test() {
        FIXType Tag722PosMaintStatus = FIXType.POS_MAINT_STATUS;
    }
    @Test
    void FIX0723Test() {
        FIXType Tag723PosMaintResult = FIXType.POS_MAINT_RESULT;
    }
    @Test
    void FIX0724Test() {
        FIXType Tag724PosReqType = FIXType.POS_REQ_TYPE;
    }
    @Test
    void FIX0725Test() {
        FIXType Tag725ResponseTransportType = FIXType.RESPONSE_TRANSPORT_TYPE;
    }
    @Test
    void FIX0726Test() {
        FIXType Tag726ResponseDestination = FIXType.RESPONSE_DESTINATION;
    }
    @Test
    void FIX0727Test() {
        FIXType Tag727TotalNumPosReports = FIXType.TOTAL_NUM_POS_REPORTS;
    }
    @Test
    void FIX0728Test() {
        FIXType Tag728PosReqResult = FIXType.POS_REQ_RESULT;
    }
    @Test
    void FIX0729Test() {
        FIXType Tag729PosReqStatus = FIXType.POS_REQ_STATUS;
    }
    @Test
    void FIX0730Test() {
        FIXType Tag730SettlPrice = FIXType.SETTL_PRICE;
    }
    @Test
    void FIX0731Test() {
        FIXType Tag731SettlPriceType = FIXType.SETTL_PRICE_TYPE;
    }
    @Test
    void FIX0732Test() {
        FIXType Tag732UnderlyingSettlPrice = FIXType.UNDERLYING_SETTL_PRICE;
    }
    @Test
    void FIX0733Test() {
        FIXType Tag733UnderlyingSettlPriceType = FIXType.UNDERLYING_SETTL_PRICE_TYPE;
    }
    @Test
    void FIX0734Test() {
        FIXType Tag734PriorSettlPrice = FIXType.PRIOR_SETTL_PRICE;
    }
    @Test
    void FIX0735Test() {
        FIXType Tag735NoQuoteQualifiers = FIXType.NO_QUOTE_QUALIFIERS;
    }
    @Test
    void FIX0736Test() {
        FIXType Tag736AllocSettlCurrency = FIXType.ALLOC_SETTL_CURRENCY;
    }
    @Test
    void FIX0737Test() {
        FIXType Tag737AllocSettlCurrAmt = FIXType.ALLOC_SETTL_CURR_AMT;
    }
    @Test
    void FIX0738Test() {
        FIXType Tag738InterestAtMaturity = FIXType.INTEREST_AT_MATURITY;
    }
    @Test
    void FIX0739Test() {
        FIXType Tag739LegDatedDate = FIXType.LEG_DATED_DATE;
    }
    @Test
    void FIX0740Test() {
        FIXType Tag740LegPool = FIXType.LEG_POOL;
    }
    @Test
    void FIX0741Test() {
        FIXType Tag741AllocInterestAtMaturity = FIXType.ALLOC_INTEREST_AT_MATURITY;
    }
    @Test
    void FIX0742Test() {
        FIXType Tag742AllocAccruedInterestAmt = FIXType.ALLOC_ACCRUED_INTEREST_AMT;
    }
    @Test
    void FIX0743Test() {
        FIXType Tag743DeliveryDate = FIXType.DELIVERY_DATE;
    }
    @Test
    void FIX0744Test() {
        FIXType Tag744AssignmentMethod = FIXType.ASSIGNMENT_METHOD;
    }
    @Test
    void FIX0745Test() {
        FIXType Tag745AssignmentUnit = FIXType.ASSIGNMENT_UNIT;
    }
    @Test
    void FIX0746Test() {
        FIXType Tag746OpenInterest = FIXType.OPEN_INTEREST;
    }
    @Test
    void FIX0747Test() {
        FIXType Tag747ExerciseMethod = FIXType.EXERCISE_METHOD;
    }
    @Test
    void FIX0748Test() {
        FIXType Tag748TotNumTradeReports = FIXType.TOT_NUM_TRADE_REPORTS;
    }
    @Test
    void FIX0749Test() {
        FIXType Tag749TradeRequestResult = FIXType.TRADE_REQUEST_RESULT;
    }
    @Test
    void FIX0750Test() {
        FIXType Tag750TradeRequestStatus = FIXType.TRADE_REQUEST_STATUS;
    }
    @Test
    void FIX0751Test() {
        FIXType Tag751TradeReportRejectReason = FIXType.TRADE_REPORT_REJECT_REASON;
    }
    @Test
    void FIX0752Test() {
        FIXType Tag752SideMultiLegReportingType = FIXType.SIDE_MULTI_LEG_REPORTING_TYPE;
    }
    @Test
    void FIX0753Test() {
        FIXType Tag753NoPosAmt = FIXType.NO_POS_AMT;
    }
    @Test
    void FIX0754Test() {
        FIXType Tag754AutoAcceptIndicator = FIXType.AUTO_ACCEPT_INDICATOR;
    }
    @Test
    void FIX0755Test() {
        FIXType Tag755AllocReportID = FIXType.ALLOC_REPORT_ID;
    }
    @Test
    void FIX0756Test() {
        FIXType Tag756NoNested2PartyIDs = FIXType.NO_NESTED_2_PARTY_IDS;
    }
    @Test
    void FIX0757Test() {
        FIXType Tag757Nested2PartyID = FIXType.NESTED_2_PARTY_ID;
    }
    @Test
    void FIX0758Test() {
        FIXType Tag758Nested2PartyIDSource = FIXType.NESTED_2_PARTY_ID_SOURCE;
    }
    @Test
    void FIX0759Test() {
        FIXType Tag759Nested2PartyRole = FIXType.NESTED_2_PARTY_ROLE;
    }
    @Test
    void FIX0760Test() {
        FIXType Tag760Nested2PartySubID = FIXType.NESTED_2_PARTY_SUB_ID;
    }
    @Test
    void FIX0761Test() {
        FIXType Tag761BenchmarkSecurityIDSource = FIXType.BENCHMARK_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX0762Test() {
        FIXType Tag762SecuritySubType = FIXType.SECURITY_SUB_TYPE;
    }
    @Test
    void FIX0763Test() {
        FIXType Tag763UnderlyingSecuritySubType = FIXType.UNDERLYING_SECURITY_SUB_TYPE;
    }
    @Test
    void FIX0764Test() {
        FIXType Tag764LegSecuritySubType = FIXType.LEG_SECURITY_SUB_TYPE;
    }
    @Test
    void FIX0765Test() {
        FIXType Tag765AllowableOneSidednessPct = FIXType.ALLOWABLE_ONE_SIDEDNESS_PCT;
    }
    @Test
    void FIX0766Test() {
        FIXType Tag766AllowableOneSidednessValue = FIXType.ALLOWABLE_ONE_SIDEDNESS_VALUE;
    }
    @Test
    void FIX0767Test() {
        FIXType Tag767AllowableOneSidednessCurr = FIXType.ALLOWABLE_ONE_SIDEDNESS_CURR;
    }
    @Test
    void FIX0768Test() {
        FIXType Tag768NoTrdRegTimestamps = FIXType.NO_TRD_REG_TIMESTAMPS;
    }
    @Test
    void FIX0769Test() {
        FIXType Tag769TrdRegTimestamp = FIXType.TRD_REG_TIMESTAMP;
    }
    @Test
    void FIX0770Test() {
        FIXType Tag770TrdRegTimestampType = FIXType.TRD_REG_TIMESTAMP_TYPE;
    }
    @Test
    void FIX0771Test() {
        FIXType Tag771TrdRegTimestampOrigin = FIXType.TRD_REG_TIMESTAMP_ORIGIN;
    }
    @Test
    void FIX0772Test() {
        FIXType Tag772ConfirmRefID = FIXType.CONFIRM_REF_ID;
    }
    @Test
    void FIX0773Test() {
        FIXType Tag773ConfirmType = FIXType.CONFIRM_TYPE;
    }
    @Test
    void FIX0774Test() {
        FIXType Tag774ConfirmRejReason = FIXType.CONFIRM_REJ_REASON;
    }
    @Test
    void FIX0775Test() {
        FIXType Tag775BookingType = FIXType.BOOKING_TYPE;
    }
    @Test
    void FIX0776Test() {
        FIXType Tag776IndividualAllocRejCode = FIXType.INDIVIDUAL_ALLOC_REJ_CODE;
    }
    @Test
    void FIX0777Test() {
        FIXType Tag777SettlInstMsgID = FIXType.SETTL_INST_MSG_ID;
    }
    @Test
    void FIX0778Test() {
        FIXType Tag778NoSettlInst = FIXType.NO_SETTL_INST;
    }
    @Test
    void FIX0779Test() {
        FIXType Tag779LastUpdateTime = FIXType.LAST_UPDATE_TIME;
    }
    @Test
    void FIX0780Test() {
        FIXType Tag780AllocSettlInstType = FIXType.ALLOC_SETTL_INST_TYPE;
    }
    @Test
    void FIX0781Test() {
        FIXType Tag781NoSettlPartyIDs = FIXType.NO_SETTL_PARTY_IDS;
    }
    @Test
    void FIX0782Test() {
        FIXType Tag782SettlPartyID = FIXType.SETTL_PARTY_ID;
    }
    @Test
    void FIX0783Test() {
        FIXType Tag783SettlPartyIDSource = FIXType.SETTL_PARTY_ID_SOURCE;
    }
    @Test
    void FIX0784Test() {
        FIXType Tag784SettlPartyRole = FIXType.SETTL_PARTY_ROLE;
    }
    @Test
    void FIX0785Test() {
        FIXType Tag785SettlPartySubID = FIXType.SETTL_PARTY_SUB_ID;
    }
    @Test
    void FIX0786Test() {
        FIXType Tag786SettlPartySubIDType = FIXType.SETTL_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX0787Test() {
        FIXType Tag787DlvyInstType = FIXType.DLVY_INST_TYPE;
    }
    @Test
    void FIX0788Test() {
        FIXType Tag788TerminationType = FIXType.TERMINATION_TYPE;
    }
    @Test
    void FIX0789Test() {
        FIXType Tag789NextExpectedMsgSeqNum = FIXType.NEXT_EXPECTED_MSG_SEQ_NUM;
    }
    @Test
    void FIX0790Test() {
        FIXType Tag790OrdStatusReqID = FIXType.ORD_STATUS_REQ_ID;
    }
    @Test
    void FIX0791Test() {
        FIXType Tag791SettlInstReqID = FIXType.SETTL_INST_REQ_ID;
    }
    @Test
    void FIX0792Test() {
        FIXType Tag792SettlInstReqRejCode = FIXType.SETTL_INST_REQ_REJ_CODE;
    }
    @Test
    void FIX0793Test() {
        FIXType Tag793SecondaryAllocID = FIXType.SECONDARY_ALLOC_ID;
    }
    @Test
    void FIX0794Test() {
        FIXType Tag794AllocReportType = FIXType.ALLOC_REPORT_TYPE;
    }
    @Test
    void FIX0795Test() {
        FIXType Tag795AllocReportRefID = FIXType.ALLOC_REPORT_REF_ID;
    }
    @Test
    void FIX0796Test() {
        FIXType Tag796AllocCancReplaceReason = FIXType.ALLOC_CANC_REPLACE_REASON;
    }
    @Test
    void FIX0797Test() {
        FIXType Tag797CopyMsgIndicator = FIXType.COPY_MSG_INDICATOR;
    }
    @Test
    void FIX0798Test() {
        FIXType Tag798AllocAccountType = FIXType.ALLOC_ACCOUNT_TYPE;
    }
    @Test
    void FIX0799Test() {
        FIXType Tag799OrderAvgPx = FIXType.ORDER_AVG_PX;
    }
    @Test
    void FIX0800Test() {
        FIXType Tag800OrderBookingQty = FIXType.ORDER_BOOKING_QTY;
    }
    @Test
    void FIX0801Test() {
        FIXType Tag801NoSettlPartySubIDs = FIXType.NO_SETTL_PARTY_SUB_IDS;
    }
    @Test
    void FIX0802Test() {
        FIXType Tag802NoPartySubIDs = FIXType.NO_PARTY_SUB_IDS;
    }
    @Test
    void FIX0803Test() {
        FIXType Tag803PartySubIDType = FIXType.PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX0804Test() {
        FIXType Tag804NoNestedPartySubIDs = FIXType.NO_NESTED_PARTY_SUB_IDS;
    }
    @Test
    void FIX0805Test() {
        FIXType Tag805NestedPartySubIDType = FIXType.NESTED_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX0806Test() {
        FIXType Tag806NoNested2PartySubIDs = FIXType.NO_NESTED_2_PARTY_SUB_IDS;
    }
    @Test
    void FIX0807Test() {
        FIXType Tag807Nested2PartySubIDType = FIXType.NESTED_2_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX0808Test() {
        FIXType Tag808AllocIntermedReqType = FIXType.ALLOC_INTERMED_REQ_TYPE;
    }
    @Test
    void FIX0810Test() {
        FIXType Tag810UnderlyingPx = FIXType.UNDERLYING_PX;
    }
    @Test
    void FIX0811Test() {
        FIXType Tag811PriceDelta = FIXType.PRICE_DELTA;
    }
    @Test
    void FIX0812Test() {
        FIXType tag812ApplQueueMax = FIXType.APPL_QUEUE_MAX;
    }
    @Test
    void FIX0813Test() {
        FIXType Tag813ApplQueueDepth = FIXType.APPL_QUEUE_DEPTH;
    }
    @Test
    void FIX0814Test() {
        FIXType Tag814ApplQueueResolution = FIXType.APPL_QUEUE_RESOLUTION;
    }
    @Test
    void FIX0815Test() {
        FIXType Tag815ApplQueueAction = FIXType.APPL_QUEUE_ACTION;
    }
    @Test
    void FIX0816Test() {
        FIXType Tag816NoAltMDSource = FIXType.NO_ALT_MD_SOURCE;
    }
    @Test
    void FIX0817Test() {
        FIXType Tag817AltMDSourceID = FIXType.ALT_MD_SOURCE_ID;
    }
    @Test
    void FIX0818Test() {
        FIXType Tag818SecondaryTradeReportID = FIXType.SECONDARY_TRADE_REPORT_ID;
    }
    @Test
    void FIX0819Test() {
        FIXType Tag819AvgPxIndicator = FIXType.AVG_PX_INDICATOR;
    }
    @Test
    void FIX0820Test() {
        FIXType Tag820TradeLinkID = FIXType.TRADE_LINK_ID;
    }
    @Test
    void FIX0821Test() {
        FIXType Tag821OrderInputDevice = FIXType.ORDER_INPUT_DEVICE;
    }
    @Test
    void FIX0822Test() {
        FIXType Tag822UnderlyingTradingSessionID = FIXType.UNDERLYING_TRADING_SESSION_ID;
    }
    @Test
    void FIX0823Test() {
        FIXType Tag823UnderlyingTradingSessionSubID = FIXType.UNDERLYING_TRADING_SESSION_SUB_ID;
    }
    @Test
    void FIX0824Test() {
        FIXType Tag824TradeLegRefID = FIXType.TRADE_LEG_REF_ID;
    }
    @Test
    void FIX0825Test() {
        FIXType Tag825ExchangeRule = FIXType.EXCHANGE_RULE;
    }
    @Test
    void FIX0826Test() {
        FIXType Tag826TradeAllocIndicator = FIXType.TRADE_ALLOC_INDICATOR;
    }
    @Test
    void FIX0827Test() {
        FIXType Tag827ExpirationCycle = FIXType.EXPIRATION_CYCLE;
    }
    @Test
    void FIX0828Test() {
        FIXType Tag828TrdType = FIXType.TRD_TYPE;
    }
    @Test
    void FIX0829Test() {
        FIXType Tag829TrdSubType = FIXType.TRD_SUB_TYPE;
    }
    @Test
    void FIX0830Test() {
        FIXType Tag830TransferReason = FIXType.TRANSFER_REASON;
    }
    @Test
    void FIX0831Test() {
        FIXType Tag831AsgnReqID = FIXType.ASGN_REQ_ID;
    }
    @Test
    void FIX0832Test() {
        FIXType Tag832TotNumAssignmentReports = FIXType.TOT_NUM_ASSIGNMENT_REPORTS;
    }
    @Test
    void FIX0833Test() {
        FIXType Tag833AsgnRptID = FIXType.ASGN_RPT_ID;
    }
    @Test
    void FIX0834Test() {
        FIXType Tag834ThresholdAmount = FIXType.THRESHOLD_AMOUNT;
    }
    @Test
    void FIX0835Test() {
        FIXType Tag835PegMoveType = FIXType.PEG_MOVE_TYPE;
    }
    @Test
    void FIX0836Test() {
        FIXType Tag836PegOffsetType = FIXType.PEG_OFFSET_TYPE;
    }
    @Test
    void FIX0837Test() {
        FIXType Tag837PegLimitType = FIXType.PEG_LIMIT_TYPE;
    }
    @Test
    void FIX0838Test() {
        FIXType Tag838PegRoundDirection = FIXType.PEG_ROUND_DIRECTION;
    }
    @Test
    void FIX0839Test() {
        FIXType Tag839PeggedPrice = FIXType.PEGGED_PRICE;
    }
    @Test
    void FIX0840Test() {
        FIXType Tag840PegScope = FIXType.PEG_SCOPE;
    }
    @Test
    void FIX0841Test() {
        FIXType Tag841DiscretionMoveType = FIXType.DISCRETION_MOVE_TYPE;
    }
    @Test
    void FIX0842Test() {
        FIXType Tag842DiscretionOffsetType = FIXType.DISCRETION_OFFSET_TYPE;
    }
    @Test
    void FIX0843Test() {
        FIXType Tag843DiscretionLimitType = FIXType.DISCRETION_LIMIT_TYPE;
    }
    @Test
    void FIX0844Test() {
        FIXType Tag844DiscretionRoundDirection = FIXType.DISCRETION_ROUND_DIRECTION;
    }
    @Test
    void FIX0845Test() {
        FIXType Tag845DiscretionPrice = FIXType.DISCRETION_PRICE;
    }
    @Test
    void FIX0846Test() {
        FIXType Tag846DiscretionScope = FIXType.DISCRETION_SCOPE;
    }
    @Test
    void FIX0847Test() {
        FIXType Tag847TargetStrategy = FIXType.TARGET_STRATEGY;
    }
    @Test
    void FIX0848Test() {
        FIXType Tag848TargetStrategyParameters = FIXType.TARGET_STRATEGY_PARAMETERS;
    }
    @Test
    void FIX0849Test() {
        FIXType Tag849ParticipationRate = FIXType.PARTICIPATION_RATE;
    }
    @Test
    void FIX0850Test() {
        FIXType Tag850TargetStrategyPerformance = FIXType.TARGET_STRATEGY_PERFORMANCE;
    }
    @Test
    void FIX0851Test() {
        FIXType Tag851LastLiquidityInd = FIXType.LAST_LIQUIDITY_IND;
    }
    @Test
    void FIX0852Test() {
        FIXType Tag852PublishTrdIndicator = FIXType.PUBLISH_TRD_INDICATOR;
    }
    @Test
    void FIX0853Test() {
        FIXType Tag853ShortSaleReason = FIXType.SHORT_SALE_REASON;
    }
    @Test
    void FIX0854Test() {
        FIXType Tag854QtyType = FIXType.QTY_TYPE;
    }
    @Test
    void FIX0855Test() {
        FIXType Tag855SecondaryTrdType = FIXType.SECONDARY_TRD_TYPE;
    }
    @Test
    void FIX0856Test() {
        FIXType Tag856TradeReportType = FIXType.TRADE_REPORT_TYPE;
    }
    @Test
    void FIX0857Test() {
        FIXType Tag857AllocNoOrdersType = FIXType.ALLOC_NO_ORDERS_TYPE;
    }
    @Test
    void FIX0858Test() {
        FIXType Tag858SharedCommission = FIXType.SHARED_COMMISSION;
    }
    @Test
    void FIX0859Test() {
        FIXType Tag859ConfirmReqID = FIXType.CONFIRM_REQ_ID;
    }
    @Test
    void FIX0860Test() {
        FIXType Tag860AvgParPx = FIXType.AVG_PAR_PX;
    }
    @Test
    void FIX0861Test() {
        FIXType Tag861ReportedPx = FIXType.REPORTED_PX;
    }
    @Test
    void FIX0862Test() {
        FIXType Tag862NoCapacities = FIXType.NO_CAPACITIES;
    }
    @Test
    void FIX0863Test() {
        FIXType Tag863OrderCapacityQty = FIXType.ORDER_CAPACITY_QTY;
    }
    @Test
    void FIX0864Test() {
        FIXType Tag864NoEvents = FIXType.NO_EVENTS;
    }
    @Test
    void FIX0865Test() {
        FIXType Tag865EventType = FIXType.EVENT_TYPE;
    }
    @Test
    void FIX0866Test() {
        FIXType Tag866EventDate = FIXType.EVENT_DATE;
    }
    @Test
    void FIX0867Test() {
        FIXType Tag867EventPx = FIXType.EVENT_PX;
    }
    @Test
    void FIX0868Test() {
        FIXType Tag868EventText = FIXType.EVENT_TEXT;
    }
    @Test
    void FIX0869Test() {
        FIXType Tag869PctAtRisk = FIXType.PCT_AT_RISK;
    }
    @Test
    void FIX0870Test() {
        FIXType Tag870NoInstrAttrib = FIXType.NO_INSTR_ATTRIB;
    }
    @Test
    void FIX0871Test() {
        FIXType Tag871InstrAttribType = FIXType.INSTR_ATTRIB_TYPE;
    }
    @Test
    void FIX0872Test() {
        FIXType Tag872InstrAttribValue = FIXType.INSTR_ATTRIB_VALUE;
    }
    @Test
    void FIX0873Test() {
        FIXType Tag873DatedDate = FIXType.DATED_DATE;
    }
    @Test
    void FIX0874Test() {
        FIXType Tag874InterestAccrualDate = FIXType.INTEREST_ACCRUAL_DATE;
    }
    @Test
    void FIX0875Test() {
        FIXType Tag875CPProgram = FIXType.CP_PROGRAM;
    }
    @Test
    void FIX0876Test() {
        FIXType Tag876CPRegType = FIXType.CP_REG_TYPE;
    }
    @Test
    void FIX0877Test() {
        FIXType Tag877UnderlyingCPProgram = FIXType.UNDERLYING_CP_PROGRAM;
    }
    @Test
    void FIX0878Test() {
        FIXType Tag878UnderlyingCPRegType = FIXType.UNDERLYING_CP_REGTYPE;
    }
    @Test
    void FIX0879Test() {
        FIXType Tag879UnderlyingQty = FIXType.UNDERLYING_QTY;
    }
    @Test
    void FIX0880Test() {
        FIXType Tag880TrdMatchID = FIXType.TRD_MATCH_ID;
    }
    @Test
    void FIX0881Test() {
        FIXType Tag881SecondaryTradeReportRefID = FIXType.SECONDARY_TRADE_REPORT_REF_ID;
    }
    @Test
    void FIX0882Test() {
        FIXType Tag882UnderlyingDirtyPrice = FIXType.UNDERLYING_DIRTY_PRICE;
    }
    @Test
    void FIX0883Test() {
        FIXType Tag883UnderlyingEndPrice = FIXType.UNDERLYING_END_PRICE;
    }
    @Test
    void FIX0884Test() {
        FIXType Tag884UnderlyingStartValue = FIXType.UNDERLYING_START_VALUE;
    }
    @Test
    void FIX0885Test() {
        FIXType Tag885UnderlyingCurrentValue = FIXType.UNDERLYING_CURRENT_VALUE;
    }
    @Test
    void FIX0886Test() {
        FIXType Tag886UnderlyingEndValue = FIXType.UNDERLYING_END_VALUE;
    }
    @Test
    void FIX0887Test() {
        FIXType Tag887NoUnderlyingStips = FIXType.NO_UNDERLYING_STIPS;
    }
    @Test
    void FIX0888Test() {
        FIXType Tag888UnderlyingStipType = FIXType.UNDERLYING_STIP_TYPE;
    }
    @Test
    void FIX0889Test() {
        FIXType Tag889UnderlyingStipValue = FIXType.UNDERLYING_STIP_VALUE;
    }
    @Test
    void FIX0890Test() {
        FIXType Tag890MaturityNetMoney = FIXType.MATURITY_NET_MONEY;
    }
    @Test
    void FIX0891Test() {
        FIXType Tag891MiscFeeBasis = FIXType.MISC_FEE_BASIS;
    }
    @Test
    void FIX0892Test() {
        FIXType Tag892TotNoAllocs = FIXType.TOT_NO_ALLOCS;
    }
    @Test
    void FIX0893Test() {
        FIXType Tag893LastFragment = FIXType.LAST_FRAGMENT;
    }
    @Test
    void FIX0894Test() {
        FIXType Tag894CollReqID = FIXType.COLL_REQ_ID;
    }
    @Test
    void FIX0895Test() {
        FIXType Tag895CollAsgnReason = FIXType.COLL_ASGN_REASON;
    }
    @Test
    void FIX0896Test() {
        FIXType Tag896CollInquiryQualifier = FIXType.COLL_INQUIRY_QUALIFIER;
    }
    @Test
    void FIX0897Test() {
        FIXType Tag897NoTrades = FIXType.NO_TRADES;
    }
    @Test
    void FIX0898Test() {
        FIXType Tag898MarginRatio = FIXType.MARGIN_RATIO;
    }
    @Test
    void FIX0899Test() {
        FIXType Tag899MarginExcess = FIXType.MARGIN_EXCESS;
    }
    @Test
    void FIX0900Test() {
        FIXType Tag900TotalNetValue = FIXType.TOTAL_NET_VALUE;
    }
    @Test
    void FIX0901Test() {
        FIXType Tag901CashOutstanding = FIXType.CASH_OUTSTANDING;
    }
    @Test
    void FIX0902Test() {
        FIXType Tag902CollAsgnID = FIXType.COLL_ASGN_ID;
    }
    @Test
    void FIX0903Test() {
        FIXType Tag903CollAsgnTransType = FIXType.COLL_ASGN_TRANS_TYPE;
    }
    @Test
    void FIX0904Test() {
        FIXType Tag904CollRespID = FIXType.COLL_RESP_ID;
    }
    @Test
    void FIX0905Test() {
        FIXType Tag905CollAsgnRespType = FIXType.COLL_ASGN_RESP_TYPE;
    }
    @Test
    void FIX0906Test() {
        FIXType Tag906CollAsgnRejectReason = FIXType.COLL_ASGN_REJECT_REASON;
    }
    @Test
    void FIX0907Test() {
        FIXType Tag907CollAsgnRefID = FIXType.COLL_ASGN_REF_ID;
    }
    @Test
    void FIX0908Test() {
        FIXType Tag908CollRptID = FIXType.COLL_RPT_ID;
    }
    @Test
    void FIX0909Test() {
        FIXType Tag909CollInquiryID = FIXType.COLL_INQUIRY_ID;
    }
    @Test
    void FIX0910Test() {
        FIXType Tag910CollStatus = FIXType.COLL_STATUS;
    }
    @Test
    void FIX0911Test() {
        FIXType Tag911TotNumReports = FIXType.TOT_NUM_REPORTS;
    }
    @Test
    void FIX0912Test() {
        FIXType Tag912LastRptRequested = FIXType.LAST_RPT_REQUESTED;
    }
    @Test
    void FIX0913Test() {
        FIXType Tag913AgreementDesc = FIXType.AGREEMENT_DESC;
    }
    @Test
    void FIX0914Test() {
        FIXType Tag914AgreementID = FIXType.AGREEMENT_ID;
    }
    @Test
    void FIX0915Test() {
        FIXType Tag915AgreementDate = FIXType.AGREEMENT_DATE;
    }
    @Test
    void FIX0916Test() {
        FIXType Tag916StartDate = FIXType.START_DATE;
    }
    @Test
    void FIX0917Test() {
        FIXType Tag917EndDate = FIXType.END_DATE;
    }
    @Test
    void FIX0918Test() {
        FIXType Tag918AgreementCurrency = FIXType.AGREEMENT_CURRENCY;
    }
    @Test
    void FIX0919Test() {
        FIXType Tag919DeliveryType = FIXType.DELIVERY_TYPE;
    }
    @Test
    void FIX0920Test() {
        FIXType Tag920EndAccruedInterestAmt = FIXType.END_ACCRUED_INTEREST_AMT;
    }
    @Test
    void FIX0921Test() {
        FIXType Tag921StartCash = FIXType.START_CASH;
    }
    @Test
    void FIX0922Test() {
        FIXType Tag922EndCash = FIXType.END_CASH;
    }
    @Test
    void FIX0923Test() {
        FIXType Tag923UserRequestID = FIXType.USER_REQUEST_ID;
    }
    @Test
    void FIX0924Test() {
        FIXType Tag924UserRequestType = FIXType.USER_REQUEST_TYPE;
    }
    @Test
    void FIX0925Test() {
        FIXType Tag925NewPassword = FIXType.NEW_PASSWORD;
    }
    @Test
    void FIX0926Test() {
        FIXType Tag926UserStatus = FIXType.USER_STATUS;
    }
    @Test
    void FIX0927Test() {
        FIXType Tag927UserStatusText = FIXType.USER_STATUS_TEXT;
    }
    @Test
    void FIX0928Test() {
        FIXType Tag928StatusValue = FIXType.STATUS_VALUE;
    }
    @Test
    void FIX0929Test() {
        FIXType Tag929StatusText = FIXType.STATUS_TEXT;
    }
    @Test
    void FIX0930Test() {
        FIXType Tag930RefCompID = FIXType.REF_COMP_ID;
    }
    @Test
    void FIX0931Test() {
        FIXType Tag931RefSubID = FIXType.REF_SUB_ID;
    }
    @Test
    void FIX0932Test() {
        FIXType Tag932NetworkResponseID = FIXType.NETWORK_RESPONSE_ID;
    }
    @Test
    void FIX0933Test() {
        FIXType Tag933NetworkRequestID = FIXType.NETWORK_REQUEST_ID;
    }
    @Test
    void FIX0934Test() {
        FIXType Tag934LastNetworkResponseID = FIXType.LAST_NETWORK_RESPONSE_ID;
    }
    @Test
    void FIX0935Test() {
        FIXType Tag935NetworkRequestType = FIXType.NETWORK_REQUEST_TYPE;
    }
    @Test
    void FIX0936Test() {
        FIXType Tag936NoCompIDs = FIXType.NO_COMP_IDS;
    }
    @Test
    void FIX0937Test() {
        FIXType Tag937NetworkStatusResponseType = FIXType.NETWORK_STATUS_RESPONSE_TYPE;
    }
    @Test
    void FIX0938Test() {
        FIXType Tag938NoCollInquiryQualifier = FIXType.NO_COLL_INQUIRY_QUALIFIER;
    }
    @Test
    void FIX0939Test() {
        FIXType Tag939TrdRptStatus = FIXType.TRD_RPT_STATUS;
    }
    @Test
    void FIX0940Test() {
        FIXType Tag940AffirmStatus = FIXType.AFFIRM_STATUS;
    }
    @Test
    void FIX0941Test() {
        FIXType Tag941UnderlyingStrikeCurrency = FIXType.UNDERLYING_STRIKE_CURRENCY;
    }
    @Test
    void FIX0942Test() {
        FIXType Tag942LegStrikeCurrency = FIXType.LEG_STRIKE_CURRENCY;
    }
    @Test
    void FIX0943Test() {
        FIXType Tag943TimeBracket = FIXType.TIME_BRACKET;
    }
    @Test
    void FIX0944Test() {
        FIXType Tag944CollAction = FIXType.COLL_ACTION;
    }
    @Test
    void FIX0945Test() {
        FIXType Tag945CollInquiryStatus = FIXType.COLL_INQUIRY_STATUS;
    }
    @Test
    void FIX0946Test() {
        FIXType Tag946CollInquiryResult = FIXType.COLL_INQUIRY_RESULT;
    }
    @Test
    void FIX0947Test() {
        FIXType Tag947StrikeCurrency = FIXType.STRIKE_CURRENCY;
    }
    @Test
    void FIX0948Test() {
        FIXType Tag948NoNested3PartyIDs = FIXType.NO_NESTED_3_PARTY_IDS;
    }
    @Test
    void FIX0949Test() {
        FIXType Tag949Nested3PartyID = FIXType.NESTED_3_PARTY_ID;
    }
    @Test
    void FIX0950Test() {
        FIXType Tag950Nested3PartyIDSource = FIXType.NESTED_3_PARTY_ID_SOURCE;
    }
    @Test
    void FIX0951Test() {
        FIXType Tag951Nested3PartyRole = FIXType.NESTED_3_PARTY_ROLE;
    }
    @Test
    void FIX0952Test() {
        FIXType Tag952NoNested3PartySubIDs = FIXType.NO_NESTED_3_PARTY_SUB_IDS;
    }
    @Test
    void FIX0953Test() {
        FIXType Tag953Nested3PartySubID = FIXType.NESTED_3_PARTY_SUB_ID;
    }
    @Test
    void FIX0954Test() {
        FIXType Tag954Nested3PartySubIDType = FIXType.NESTED_3_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX0955Test() {
        FIXType Tag955LegContractSettlMonth = FIXType.LEG_CONTRACT_SETTL_MONTH;
    }
    @Test
    void FIX0956Test() {
        FIXType Tag956LegInterestAccrualDate = FIXType.LEG_INTEREST_ACCRUAL_DATE;
    }
    /*
     *
     * END of complete FIX44 tags
     *
     */
}
