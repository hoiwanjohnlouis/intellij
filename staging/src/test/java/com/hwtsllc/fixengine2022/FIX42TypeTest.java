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

import static org.junit.jupiter.api.Assertions.*;

class FIX42TypeTest {
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
     * Start of FIX4.2 as defined by the FIX Protocol Specification 4.2
     *  Tags: 141-446
     */
    @Test
    void FIX0141Test() {
        FIXType fix141ResetSeqNumFlag = FIXType.RESET_SEQ_NUM_FLAG;
    }
    @Test
    void FIX0142Test() {
        FIXType fix142SenderLocationID = FIXType.SENDER_LOCATION_ID;
    }
    @Test
    void FIX0143Test() {
        FIXType fix143TargetLocationID = FIXType.TARGET_LOCATION_ID;
    }
    @Test
    void FIX0144Test() {
        FIXType fix144OnBehalfOfLocationID = FIXType.ON_BEHALF_OF_LOCATION_ID;
    }
    @Test
    void FIX0145Test() {
        FIXType fix145DeliverToLocationID = FIXType.DELIVER_TO_LOCATION_ID;
    }
    @Test
    void FIX0146Test() {
        FIXType fix146NoRelatedSym = FIXType.NO_RELATED_SYM;
    }
    @Test
    void FIX0147Test() {
        FIXType fix147Subject = FIXType.SUBJECT;
    }
    @Test
    void FIX0148Test() {
        FIXType fix148Headline = FIXType.HEADLINE;
    }
    @Test
    void FIX0149Test() {
        FIXType fix149URLLink = FIXType.URL_LINK;
    }
    @Test
    void FIX0150Test() {
        FIXType fix150ExecType = FIXType.EXEC_TYPE;
    }
    @Test
    void FIX0151Test() {
        FIXType fix151LeavesQty = FIXType.LEAVES_QTY;
    }
    @Test
    void FIX0152Test() {
        FIXType fix152CashOrderQty = FIXType.CASH_ORDER_QTY;
    }
    @Test
    void FIX0153Test() {
        FIXType fix153AllocAvgPx = FIXType.ALLOC_AVG_PX;
    }
    @Test
    void FIX0154Test() {
        FIXType fix154AllocNetMoney = FIXType.ALLOC_NET_MONEY;
    }
    @Test
    void FIX0155Test() {
        FIXType fix155SettlCurrFxRate = FIXType.SETTL_CURR_FX_RATE;
    }
    @Test
    void FIX0156Test() {
        FIXType fix156SettlCurrFxRateCalc = FIXType.SETTL_CURR_FX_RATE_CALC;
    }
    @Test
    void FIX0157Test() {
        FIXType fix157NumDaysInterest = FIXType.NUM_DAYS_INTEREST;
    }
    @Test
    void FIX0158Test() {
        FIXType fix158AccruedInterestRate = FIXType.ACCRUED_INTEREST_RATE;
    }
    @Test
    void FIX0159Test() {
        FIXType fix159AccruedInterestAmt = FIXType.ACCRUED_INTEREST_AMT;
    }
    @Test
    void FIX0160Test() {
        FIXType fix160SettlInstMode = FIXType.SETTL_INST_MODE;
    }
    @Test
    void FIX0161Test() {
        FIXType fix161AllocText = FIXType.ALLOC_TEXT;
    }
    @Test
    void FIX0162Test() {
        FIXType fix162SettlInstID = FIXType.SETTL_INST_ID;
    }
    @Test
    void FIX0163Test() {
        FIXType fix163SettlInstTransType = FIXType.SETTL_INST_TRANS_TYPE;
    }
    @Test
    void FIX0164Test() {
        FIXType fix164EmailThreadID = FIXType.EMAIL_THREAD_ID;
    }
    @Test
    void FIX0165Test() {
        FIXType fix165SettlInstSource = FIXType.SETTL_INST_SOURCE;
    }
    @Test
    void FIX0166Test() {
        FIXType fix166SettlLocation = FIXType.SETTL_LOCATION;
    }
    @Test
    void FIX0167Test() {
        FIXType fix167SecurityType = FIXType.SECURITY_TYPE;
    }
    @Test
    void FIX0168Test() {
        FIXType fix168EffectiveTime = FIXType.EFFECTIVE_TIME;
    }
    @Test
    void FIX0169Test() {
        FIXType fix169StandInstDBType = FIXType.STAND_INST_DB_TYPE;
    }
    @Test
    void FIX0170Test() {
        FIXType fix170StandInstDBName = FIXType.STAND_INST_DB_NAME;
    }
    @Test
    void FIX0171Test() {
        FIXType fix171StandInstDBID = FIXType.STAND_INST_DB_ID;
    }
    @Test
    void FIX0172Test() {
        FIXType fix172SettlDeliveryType = FIXType.SETTL_DELIVERY_TYPE;
    }
    @Test
    void FIX0173Test() {
        FIXType fix173SettlDepositoryCode = FIXType.SETTL_DEPOSITORY_CODE;
    }
    @Test
    void FIX0174Test() {
        FIXType fix174SettlBrkrCode = FIXType.SETTL_BRKR_CODE;
    }
    @Test
    void FIX0175Test() {
        FIXType fix175SettlInstCode = FIXType.SETTL_INST_CODE;
    }
    @Test
    void FIX0176Test() {
        FIXType fix176SecuritySettlAgentName = FIXType.SECURITY_SETTL_AGENT_NAME;
    }
    @Test
    void FIX0177Test() {
        FIXType fix177SecuritySettlAgentCode = FIXType.SECURITY_SETTL_AGENT_CODE;
    }
    @Test
    void FIX0178Test() {
        FIXType fix178SecuritySettlAgentAcctNum = FIXType.SECURITY_SETTL_AGENT_ACCT_NUM;
    }
    @Test
    void FIX0179Test() {
        FIXType fix179SecuritySettlAgentAcctName = FIXType.SECURITY_SETTL_AGENT_ACCT_NAME;
    }
    @Test
    void FIX0180Test() {
        FIXType fix180SecuritySettlAgentContactName = FIXType.SECURITY_SETTL_AGENT_CONTACT_NAME;
    }
    @Test
    void FIX0181Test() {
        FIXType fix181SecuritySettlAgentContactPhone = FIXType.SECURITY_SETTL_AGENT_CONTACT_PHONE;
    }
    @Test
    void FIX0182Test() {
        FIXType fix182CashSettlAgentName = FIXType.CASH_SETTL_AGENT_NAME;
    }
    @Test
    void FIX0183Test() {
        FIXType fix183CashSettlAgentCode = FIXType.CASH_SETTL_AGENT_CODE;
    }
    @Test
    void FIX0184Test() {
        FIXType fix184CashSettlAgentAcctNum = FIXType.CASH_SETTL_AGENT_ACCT_NUM;
    }
    @Test
    void FIX0185Test() {
        FIXType fix185CashSettlAgentAcctName = FIXType.CASH_SETTL_AGENT_ACCT_NAME;
    }
    @Test
    void FIX0186Test() {
        FIXType fix186CashSettlAgentContactName = FIXType.CASH_SETTL_AGENT_CONTACT_NAME;
    }
    @Test
    void FIX0187Test() {
        FIXType fix187CashSettlAgentContactPhone = FIXType.CASH_SETTL_AGENT_CONTACT_PHONE;
    }
    @Test
    void FIX0188Test() {
        FIXType fix188BidSpotRate = FIXType.BID_SPOT_RATE;
    }
    @Test
    void FIX0189Test() {
        FIXType fix189BidForwardPoints = FIXType.BID_FORWARD_POINTS;
    }
    @Test
    void FIX0190Test() {
        FIXType fix190OfferSpotRate = FIXType.OFFER_SPOT_RATE;
    }
    @Test
    void FIX0191Test() {
        FIXType fix191OfferForwardPoints = FIXType.OFFER_FORWARD_POINTS;
    }
    @Test
    void FIX0192Test() {
        FIXType fix192OrderQty2 = FIXType.ORDER_QTY_2;
    }
    @Test
    void FIX0193Test() {
        FIXType fix193SettlDate2 = FIXType.FUT_SETT_DATE_2;
    }
    @Test
    void FIX0194Test() {
        FIXType fix194LastSpotRate = FIXType.LAST_SPOT_RATE;
    }
    @Test
    void FIX0195Test() {
        FIXType fix195LastForwardPoints = FIXType.LAST_FORWARD_POINTS;
    }
    @Test
    void FIX0196Test() {
        FIXType fix196AllocLinkID = FIXType.ALLOC_LINK_ID;
    }
    @Test
    void FIX0197Test() {
        FIXType fix197AllocLinkType = FIXType.ALLOC_LINK_TYPE;
    }
    @Test
    void FIX0198Test() {
        FIXType fix198SecondaryOrderID = FIXType.SECONDARY_ORDER_ID;
    }
    @Test
    void FIX0199Test() {
        FIXType fix199NoIOIQualifiers = FIXType.NO_IOI_QUALIFIERS;
    }
    @Test
    void FIX0200Test() {
        FIXType fix200MaturityMonthYear = FIXType.MATURITY_MONTH_YEAR;
    }
    @Test
    void FIX0201Test() {
        FIXType fix201PutOrCall = FIXType.PUT_OR_CALL;
    }
    @Test
    void FIX0202Test() {
        FIXType fix202StrikePrice = FIXType.STRIKE_PRICE;
    }
    @Test
    void FIX0203Test() {
        FIXType fix203CoveredOrUncovered = FIXType.COVERED_OR_UNCOVERED;
    }
    @Test
    void FIX0204Test() {
        FIXType fix204CustomerOrFirm = FIXType.CUSTOMER_OR_FIRM;
    }
    @Test
    void FIX0205Test() {
        FIXType fix205MaturityDay = FIXType.MATURITY_DAY;
    }
    @Test
    void FIX0206Test() {
        FIXType fix206OptAttribute = FIXType.OPT_ATTRIBUTE;
    }
    @Test
    void FIX0207Test() {
        FIXType fix207SecurityExchange = FIXType.SECURITY_EXCHANGE;
    }
    @Test
    void FIX0208Test() {
        FIXType fix208NotifyBrokerOfCredit = FIXType.NOTIFY_BROKER_OF_CREDIT;
    }
    @Test
    void FIX0209Test() {
        FIXType fix209AllocHandlInst = FIXType.ALLOC_HANDL_INST;
    }
    @Test
    void FIX0210Test() {
        FIXType fix210MaxShow = FIXType.MAX_SHOW;
    }
    @Test
    void FIX0211Test() {
        FIXType fix211PegDifference = FIXType.PEG_DIFFERENCE;
    }
    @Test
    void FIX0212Test() {
        FIXType fix212XmlDataLen = FIXType.XML_DATA_LEN;
    }
    @Test
    void FIX0213Test() {
        FIXType fix213XmlData = FIXType.XML_DATA;
    }
    @Test
    void FIX0214Test() {
        FIXType fix214SettlInstRefID = FIXType.SETTL_INST_REF_ID;
    }
    @Test
    void FIX0215Test() {
        FIXType fix215NoRoutingIDs = FIXType.NO_ROUTING_IDS;
    }
    @Test
    void FIX0216Test() {
        FIXType fix216RoutingType = FIXType.ROUTING_TYPE;
    }
    @Test
    void FIX0217Test() {
        FIXType fix217RoutingID = FIXType.ROUTING_ID;
    }
    @Test
    void FIX0218Test() {
        FIXType fix218Spread = FIXType.SPREAD_TO_BENCHMARK;
    }
    @Test
    void FIX0219Test() {
        FIXType fix219Benchmark = FIXType.BENCHMARK;
    }
    @Test
    void FIX0220Test() {
        FIXType fix220BenchmarkCurveCurrency = FIXType.BENCHMARK_CURVE_CURRENCY;
    }
    @Test
    void FIX0221Test() {
        FIXType fix221BenchmarkCurveName = FIXType.BENCHMARK_CURVE_NAME;
    }
    @Test
    void FIX0222Test() {
        FIXType fix222BenchmarkCurvePoint = FIXType.BENCHMARK_CURVE_POINT;
    }
    @Test
    void FIX0223Test() {
        FIXType fix223CouponRate = FIXType.COUPON_RATE;
    }
    @Test
    void FIX0224Test() {
        FIXType fix224CouponPaymentDate = FIXType.COUPON_PAYMENT_DATE;
    }
    @Test
    void FIX0225Test() {
        FIXType fix225IssueDate = FIXType.ISSUE_DATE;
    }
    @Test
    void FIX0226Test() {
        FIXType fix226RepurchaseTerm = FIXType.REPURCHASE_TERM;
    }
    @Test
    void FIX0227Test() {
        FIXType fix227RepurchaseRate = FIXType.REPURCHASE_RATE;
    }
    @Test
    void FIX0228Test() {
        FIXType fix228Factor = FIXType.FACTOR;
    }
    @Test
    void FIX0229Test() {
        FIXType fix229TradeOriginatingDate = FIXType.TRADE_ORIGINATION_DATE;
    }
    @Test
    void FIX0230Test() {
        FIXType fix230ExDate = FIXType.EX_DATE;
    }
    @Test
    void FIX0231Test() {
        FIXType fix231ContractMultiplier = FIXType.CONTRACT_MULTIPLIER;
    }
    @Test
    void FIX0232Test() {
        FIXType fix232NoStipulations = FIXType.NO_STIPULATIONS;
    }
    @Test
    void FIX0233Test() {
        FIXType fix233StipulationType = FIXType.STIPULATION_TYPE;
    }
    @Test
    void FIX0234Test() {
        FIXType fix234StipulationValue = FIXType.STIPULATION_VALUE;
    }
    @Test
    void FIX0235Test() {
        FIXType fix235YieldType = FIXType.YIELD_TYPE;
    }
    @Test
    void FIX0236Test() {
        FIXType fix236Yield = FIXType.YIELD;
    }
    @Test
    void FIX0237Test() {
        FIXType fix237TotalTakedown = FIXType.TOTAL_TAKEDOWN;
    }
    @Test
    void FIX0238Test() {
        FIXType fix238Concession = FIXType.CONCESSION;
    }
    @Test
    void FIX0239Test() {
        FIXType fix239RepoCollateralSecurityType = FIXType.REPO_COLLATERAL_SECURITY_TYPE;
    }
    @Test
    void FIX0240Test() {
        FIXType fix240RedemptionDate = FIXType.REDEMPTION_DATE;
    }
    @Test
    void FIX0241Test() {
        FIXType fix241UnderlyingCouponPaymentDate = FIXType.UNDERLYING_COUPON_PAYMENT_DATE;
    }
    @Test
    void FIX0242Test() {
        FIXType fix242UnderlyingIssueDate = FIXType.UNDERLYING_ISSUE_DATE;
    }
    @Test
    void FIX0243Test() {
        FIXType fix243UnderlyingRepoCollateralSecurityType = FIXType.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE;
    }
    @Test
    void FIX0244Test() {
        FIXType fix244UnderlyingRepurchaseTerm = FIXType.UNDERLYING_REPURCHASE_TERM;
    }
    @Test
    void FIX0245Test() {
        FIXType fix245UnderlyingRepurchaseRate = FIXType.UNDERLYING_REPURCHASE_RATE;
    }
    @Test
    void FIX0246Test() {
        FIXType fix246UnderlyingFactor = FIXType.UNDERLYING_FACTOR;
    }
    @Test
    void FIX0247Test() {
        FIXType fix247UnderlyingRedemptionDate = FIXType.UNDERLYING_REDEMPTION_DATE;
    }
    @Test
    void FIX0248Test() {
        FIXType fix248LegCouponPaymentDate = FIXType.LEG_COUPON_PAYMENT_DATE;
    }
    @Test
    void FIX0249Test() {
        FIXType fix249LegIssueDate = FIXType.LEG_ISSUE_DATE;
    }
    @Test
    void FIX0250Test() {
        FIXType fix250LegRepoCollateralSecurityType = FIXType.LEG_REPO_COLLATERAL_SECURITY_TYPE;
    }
    @Test
    void FIX0251Test() {
        FIXType fix251LegRepurchaseTerm = FIXType.LEG_REPURCHASE_TERM;
    }
    @Test
    void FIX0252Test() {
        FIXType fix252LegRepurchaseRate = FIXType.LEG_REPURCHASE_RATE;
    }
    @Test
    void FIX0253Test() {
        FIXType fix253LegFactor = FIXType.LEG_FACTOR;
    }
    @Test
    void FIX0254Test() {
        FIXType fix254LegRedemptionDate = FIXType.LEG_REDEMPTION_DATE;
    }
    @Test
    void FIX0255Test() {
        FIXType fix255CreditRating = FIXType.CREDIT_RATING;
    }
    @Test
    void FIX0256Test() {
        FIXType fix256UnderlyingCreditRating = FIXType.UNDERLYING_CREDIT_RATING;
    }
    @Test
    void FIX0257Test() {
        FIXType fix257LegCreditRating = FIXType.LEG_CREDIT_RATING;
    }
    @Test
    void FIX0258Test() {
        FIXType fix258TradedFlatSwitch = FIXType.TRADED_FLAT_SWITCH;
    }
    @Test
    void FIX0259Test() {
        FIXType fix259BasisFeatureDate = FIXType.BASIS_FEATURE_DATE;
    }
    @Test
    void FIX0260Test() {
        FIXType fix260BasisFeaturePrice = FIXType.BASIS_FEATURE_PRICE;
    }
    @Test
    void FIX0262Test() {
        FIXType fix262MDReqID = FIXType.MD_REQ_ID;
    }
    @Test
    void FIX0263Test() {
        FIXType fix263SubscriptionRequestType = FIXType.SUBSCRIPTION_REQUEST_TYPE;
    }
    @Test
    void FIX0264Test() {
        FIXType fix264MarketDepth = FIXType.MARKET_DEPTH;
    }
    @Test
    void FIX0265Test() {
        FIXType fix265MDUpdateType = FIXType.MD_UPDATE_TYPE;
    }
    @Test
    void FIX0266Test() {
        FIXType fix266AggregatedBook = FIXType.AGGREGATED_BOOK;
    }
    @Test
    void FIX0267Test() {
        FIXType fix267NoMDEntryTypes = FIXType.NO_MD_ENTRY_TYPES;
    }
    @Test
    void FIX0268Test() {
        FIXType fix268NoMDEntries = FIXType.NO_MD_ENTRIES;
    }
    @Test
    void FIX0269Test() {
        FIXType fix269MDEntryType = FIXType.MD_ENTRY_TYPE;
    }
    @Test
    void FIX0270Test() {
        FIXType fix270MDEntryPx = FIXType.MD_ENTRY_PX;
    }
    @Test
    void FIX0271Test() {
        FIXType fix271MDEntrySize = FIXType.MD_ENTRY_SIZE;
    }
    @Test
    void FIX0272Test() {
        FIXType fix272MDEntryDate = FIXType.MD_ENTRY_DATE;
    }
    @Test
    void FIX0273Test() {
        FIXType fix273MDEntryTime = FIXType.MD_ENTRY_TIME;
    }
    @Test
    void FIX0274Test() {
        FIXType fix274TickDirection = FIXType.TICK_DIRECTION;
    }
    @Test
    void FIX0275Test() {
        FIXType fix275MDMkt = FIXType.MD_MKT;
    }
    @Test
    void FIX0276Test() {
        FIXType fix276QuoteCondition = FIXType.QUOTE_CONDITION;
    }
    @Test
    void FIX0277Test() {
        FIXType fix277TradeCondition = FIXType.TRADE_CONDITION;
    }
    @Test
    void FIX0278Test() {
        FIXType fix278MDEntryID = FIXType.MD_ENTRY_ID;
    }
    @Test
    void FIX0279Test() {
        FIXType fix279MDUpdateAction = FIXType.MD_UPDATE_ACTION;
    }
    @Test
    void FIX0280Test() {
        FIXType fix280MDEntryRefID = FIXType.MD_ENTRY_REF_ID;
    }
    @Test
    void FIX0281Test() {
        FIXType fix281MDReqRejReason = FIXType.MD_REQ_REJ_REASON;
    }
    @Test
    void FIX0282Test() {
        FIXType fix282MDEntryOriginator = FIXType.MD_ENTRY_ORIGINATOR;
    }
    @Test
    void FIX0283Test() {
        FIXType fix283LocationID = FIXType.LOCATION_ID;
    }
    @Test
    void FIX0284Test() {
        FIXType fix284DeskID = FIXType.DESK_ID;
    }
    @Test
    void FIX0285Test() {
        FIXType fix285DeleteReason = FIXType.DELETE_REASON;
    }
    @Test
    void FIX0286Test() {
        FIXType fix286OpenCloseSettleFlag = FIXType.OPEN_CLOSE_SETTLE_FLAG;
    }
    @Test
    void FIX0287Test() {
        FIXType fix287SellerDays = FIXType.SELLER_DAYS;
    }
    @Test
    void FIX0288Test() {
        FIXType fix288MDEntryBuyer = FIXType.MD_ENTRY_BUYER;
    }
    @Test
    void FIX0289Test() {
        FIXType fix289MDEntrySeller = FIXType.MD_ENTRY_SELLER;
    }
    @Test
    void FIX0290Test() {
        FIXType fix290MDEntryPositionNo = FIXType.MD_ENTRY_POSITION_NO;
    }
    @Test
    void FIX0291Test() {
        FIXType fix291FinancialStatus = FIXType.FINANCIAL_STATUS;
    }
    @Test
    void FIX0292Test() {
        FIXType fix292CorporateAction = FIXType.CORPORATE_ACTION;
    }
    @Test
    void FIX0293Test() {
        FIXType fix293DefBidSize = FIXType.DEF_BID_SIZE;
    }
    @Test
    void FIX0294Test() {
        FIXType fix294DefOfferSize = FIXType.DEF_OFFER_SIZE;
    }
    @Test
    void FIX0295Test() {
        FIXType fix295NoQuoteEntries = FIXType.NO_QUOTE_ENTRIES;
    }
    @Test
    void FIX0296Test() {
        FIXType fix296NoQuoteSets = FIXType.NO_QUOTE_SETS;
    }
    @Test
    void FIX0297Test() {
        FIXType fix297QuoteAckStatus = FIXType.QUOTE_ACK_STATUS;
    }
    @Test
    void FIX0298Test() {
        FIXType fix298QuoteCancelType = FIXType.QUOTE_CANCEL_TYPE;
    }
    @Test
    void FIX0299Test() {
        FIXType fix299QuoteEntryID = FIXType.QUOTE_ENTRY_ID;
    }
    @Test
    void FIX0300Test() {
        FIXType fix300QuoteRejectReason = FIXType.QUOTE_REJECT_REASON;
    }
    @Test
    void FIX0301Test() {
        FIXType fix301QuoteResponseLevel = FIXType.QUOTE_RESPONSE_LEVEL;
    }
    @Test
    void FIX0302Test() {
        FIXType fix302QuoteSetID = FIXType.QUOTE_SET_ID;
    }
    @Test
    void FIX0303Test() {
        FIXType fix303QuoteRequestType = FIXType.QUOTE_REQUEST_TYPE;
    }
    @Test
    void FIX0304Test() {
        FIXType fix304TotQuoteEntries = FIXType.TOT_QUOTE_ENTRIES;
    }
    @Test
    void FIX0305Test() {
        FIXType fix305UnderlyingIDSource = FIXType.UNDERLYING_ID_SOURCE;
    }
    @Test
    void FIX0306Test() {
        FIXType fix306UnderlyingIssuer = FIXType.UNDERLYING_ISSUER;
    }
    @Test
    void FIX0307Test() {
        FIXType fix307UnderlyingSecurityDesc = FIXType.UNDERLYING_SECURITY_DESC;
    }
    @Test
    void FIX0308Test() {
        FIXType fix308UnderlyingSecurityExchange = FIXType.UNDERLYING_SECURITY_EXCHANGE;
    }
    @Test
    void FIX0309Test() {
        FIXType fix309UnderlyingSecurityID = FIXType.UNDERLYING_SECURITY_ID;
    }
    @Test
    void FIX0310Test() {
        FIXType fix310UnderlyingSecurityType = FIXType.UNDERLYING_SECURITY_TYPE;
    }
    @Test
    void FIX0311Test() {
        FIXType fix311UnderlyingSymbol = FIXType.UNDERLYING_SYMBOL;
    }
    @Test
    void FIX0312Test() {
        FIXType fix312UnderlyingSymbolSfx = FIXType.UNDERLYING_SYMBOL_SFX;
    }
    @Test
    void FIX0313Test() {
        FIXType fix313UnderlyingMaturityMonthYear = FIXType.UNDERLYING_MATURITY_MONTH_YEAR;
    }
    @Test
    void FIX0314Test() {
        FIXType fix314UnderlyingMaturityDate = FIXType.UNDERLYING_MATURITY_DAY;
    }
    @Test
    void FIX0315Test() {
        FIXType fix315UnderlyingPutOrCall = FIXType.UNDERLYING_PUT_OR_CALL;
    }
    @Test
    void FIX0316Test() {
        FIXType fix316UnderlyingStrikePrice = FIXType.UNDERLYING_STRIKE_PRICE;
    }
    @Test
    void FIX0317Test() {
        FIXType fix317UnderlyingOptAttribute = FIXType.UNDERLYING_OPT_ATTRIBUTE;
    }
    @Test
    void FIX0318Test() {
        FIXType fix318UnderlyingCurrency = FIXType.UNDERLYING_CURRENCY;
    }
    @Test
    void FIX0319Test() {
        FIXType fix319RatioQty = FIXType.RATIO_QTY;
    }
    @Test
    void FIX0320Test() {
        FIXType fix320SecurityReqID = FIXType.SECURITY_REQ_ID;
    }
    @Test
    void FIX0321Test() {
        FIXType fix321SecurityRequestType = FIXType.SECURITY_REQUEST_TYPE;
    }
    @Test
    void FIX0322Test() {
        FIXType fix322SecurityResponseID = FIXType.SECURITY_RESPONSE_ID;
    }
    @Test
    void FIX0323Test() {
        FIXType fix323SecurityResponseType = FIXType.SECURITY_RESPONSE_TYPE;
    }
    @Test
    void FIX0324Test() {
        FIXType fix324SecurityStatusReqID = FIXType.SECURITY_STATUS_REQ_ID;
    }
    @Test
    void FIX0325Test() {
        FIXType fix325UnsolicitedIndicator = FIXType.UNSOLICITED_INDICATOR;
    }
    @Test
    void FIX0326Test() {
        FIXType fix326SecurityTradingStatus = FIXType.SECURITY_TRADING_STATUS;
    }
    @Test
    void FIX0327Test() {
        FIXType fix327HaltReason = FIXType.HALT_REASON;
    }
    @Test
    void FIX0328Test() {
        FIXType fix328InViewOfCommon = FIXType.IN_VIEW_OF_COMMON;
    }
    @Test
    void FIX0329Test() {
        FIXType fix329DueToRelated = FIXType.DUE_TO_RELATED;
    }
    @Test
    void FIX0330Test() {
        FIXType fix330BuyVolume = FIXType.BUY_VOLUME;
    }
    @Test
    void FIX0331Test() {
        FIXType fix331SellVolume = FIXType.SELL_VOLUME;
    }
    @Test
    void FIX0332Test() {
        FIXType fix332HighPx = FIXType.HIGH_PX;
    }
    @Test
    void FIX0333Test() {
        FIXType fix333LowPx = FIXType.LOW_PX;
    }
    @Test
    void FIX0334Test() {
        FIXType fix334Adjustment = FIXType.ADJUSTMENT;
    }
    @Test
    void FIX0335Test() {
        FIXType fix335TradSesReqID = FIXType.TRAD_SES_REQ_ID;
    }
    @Test
    void FIX0336Test() {
        FIXType fix336TradingSessionID = FIXType.TRADING_SESSION_ID;
    }
    @Test
    void FIX0337Test() {
        FIXType fix337ContraTrader = FIXType.CONTRA_TRADER;
    }
    @Test
    void FIX0338Test() {
        FIXType fix338TradSesMethod = FIXType.TRAD_SES_METHOD;
    }
    @Test
    void FIX0339Test() {
        FIXType fix339TradSesMode = FIXType.TRAD_SES_MODE;
    }
    @Test
    void FIX0340Test() {
        FIXType fix340TradSesStatus = FIXType.TRAD_SES_STATUS;
    }
    @Test
    void FIX0341Test() {
        FIXType fix341TradSesStartTime = FIXType.TRAD_SES_START_TIME;
    }
    @Test
    void FIX0342Test() {
        FIXType fix342TradSesOpenTime = FIXType.TRAD_SES_OPEN_TIME;
    }
    @Test
    void FIX0343Test() {
        FIXType fix343TradSesPreCloseTime = FIXType.TRAD_SES_PRE_CLOSE_TIME;
    }
    @Test
    void FIX0344Test() {
        FIXType fix344TradSesCloseTime = FIXType.TRAD_SES_CLOSE_TIME;
    }
    @Test
    void FIX0345Test() {
        FIXType fix345TradSesEndTime = FIXType.TRAD_SES_END_TIME;
    }
    @Test
    void FIX0346Test() {
        FIXType fix346NumberOfOrders = FIXType.NUMBER_OF_ORDERS;
    }
    @Test
    void FIX0347Test() {
        FIXType fix347MessageEncoding = FIXType.MESSAGE_ENCODING;
    }
    @Test
    void FIX0348Test() {
        FIXType fix348EncodedIssuerLen = FIXType.ENCODED_ISSUER_LEN;
    }
    @Test
    void FIX0349Test() {
        FIXType fix349EncodedIssuer = FIXType.ENCODED_ISSUER;
    }
    @Test
    void FIX0350Test() {
        FIXType fix350EncodedSecurityDescLen = FIXType.ENCODED_SECURITY_DESC_LEN;
    }
    @Test
    void FIX0351Test() {
        FIXType fix351EncodedSecurityDesc = FIXType.ENCODED_SECURITY_DESC;
    }
    @Test
    void FIX0352Test() {
        FIXType fix352EncodedListExecInstLen = FIXType.ENCODED_LIST_EXEC_INST_LEN;
    }
    @Test
    void FIX0353Test() {
        FIXType fix353EncodedListExecInst = FIXType.ENCODED_LIST_EXEC_INST;
    }
    @Test
    void FIX0354Test() {
        FIXType fix354EncodedTextLen = FIXType.ENCODED_TEXT_LEN;
    }
    @Test
    void FIX0355Test() {
        FIXType fix355EncodedText = FIXType.ENCODED_TEXT;
    }
    @Test
    void FIX0356Test() {
        FIXType fix356EncodedSubjectLen = FIXType.ENCODED_SUBJECT_LEN;
    }
    @Test
    void FIX0357Test() {
        FIXType fix357EncodedSubject = FIXType.ENCODED_SUBJECT;
    }
    @Test
    void FIX0358Test() {
        FIXType fix358EncodedHeadlineLen = FIXType.ENCODED_HEADLINE_LEN;
    }
    @Test
    void FIX0359Test() {
        FIXType fix359EncodedHeadline = FIXType.ENCODED_HEADLINE;
    }
    @Test
    void FIX0360Test() {
        FIXType fix360EncodedAllocTextLen = FIXType.ENCODED_ALLOC_TEXT_LEN;
    }
    @Test
    void FIX0361Test() {
        FIXType fix361EncodedAllocText = FIXType.ENCODED_ALLOC_TEXT;
    }
    @Test
    void FIX0362Test() {
        FIXType fix362EncodedUnderlyingIssuerLen = FIXType.ENCODED_UNDERLYING_ISSUER_LEN;
    }
    @Test
    void FIX0363Test() {
        FIXType fix363EncodedUnderlyingIssuer = FIXType.ENCODED_UNDERLYING_ISSUER;
    }
    @Test
    void FIX0364Test() {
        FIXType fix364EncodedUnderlyingSecurityDescLen = FIXType.ENCODED_UNDERLYING_SECURITY_DESC_LEN;
    }
    @Test
    void FIX0365Test() {
        FIXType fix365EncodedUnderlyingSecurityDesc = FIXType.ENCODED_UNDERLYING_SECURITY_DESC;
    }
    @Test
    void FIX0366Test() {
        FIXType fix366AllocPrice = FIXType.ALLOC_PRICE;
    }
    @Test
    void FIX0367Test() {
        FIXType fix367QuoteSetValidUntilTime = FIXType.QUOTE_SET_VALID_UNTIL_TIME;
    }
    @Test
    void FIX0368Test() {
        FIXType fix368QuoteEntryRejectReason = FIXType.QUOTE_ENTRY_REJECT_REASON;
    }
    @Test
    void FIX0369Test() {
        FIXType fix369LastMsgSeqNumProcessed = FIXType.LAST_MSG_SEQ_NUM_PROCESSED;
    }
    @Test
    void FIX0370Test() {
        FIXType fix370OnBehalfOfSendingTime = FIXType.ON_BEHALF_OF_SENDING_TIME;
    }
    @Test
    void FIX0371Test() {
        FIXType fix371RefTagID = FIXType.REF_TAG_ID;
    }
    @Test
    void FIX0372Test() {
        FIXType fix372RefMsgType = FIXType.REF_MSG_TYPE;
    }
    @Test
    void FIX0373Test() {
        FIXType fix373SessionRejectReason = FIXType.SESSION_REJECT_REASON;
    }
    @Test
    void FIX0374Test() {
        FIXType fix374BidRequestTransType = FIXType.BID_REQUEST_TRANS_TYPE;
    }
    @Test
    void FIX0375Test() {
        FIXType fix375ContraBroker = FIXType.CONTRA_BROKER;
    }
    @Test
    void FIX0376Test() {
        FIXType fix376ComplianceID = FIXType.COMPLIANCE_ID;
    }
    @Test
    void FIX0377Test() {
        FIXType fix377SolicitedFlag = FIXType.SOLICITED_FLAG;
    }
    @Test
    void FIX0378Test() {
        FIXType fix378ExecRestatementReason = FIXType.EXEC_RESTATEMENT_REASON;
    }
    @Test
    void FIX0379Test() {
        FIXType fix379BusinessRejectRefID = FIXType.BUSINESS_REJECT_REF_ID;
    }
    @Test
    void FIX0380Test() {
        FIXType fix380BusinessRejectReason = FIXType.BUSINESS_REJECT_REASON;
    }
    @Test
    void FIX0381Test() {
        FIXType fix381GrossTradeAmt = FIXType.GROSS_TRADE_AMT;
    }
    @Test
    void FIX0382Test() {
        FIXType fix382NoContraBrokers = FIXType.NO_CONTRA_BROKERS;
    }
    @Test
    void FIX0383Test() {
        FIXType fix383MaxMessageSize = FIXType.MAX_MESSAGE_SIZE;
    }
    @Test
    void FIX0384Test() {
        FIXType fix384NoMsgTypes = FIXType.NO_MSG_TYPES;
    }
    @Test
    void FIX0385Test() {
        FIXType fix385MsgDirection = FIXType.MSG_DIRECTION;
    }
    @Test
    void FIX0386Test() {
        FIXType fix386NoTradingSessions = FIXType.NO_TRADING_SESSIONS;
    }
    @Test
    void FIX0387Test() {
        FIXType fix387TotalVolumeTraded = FIXType.TOTAL_VOLUME_TRADED;
    }
    @Test
    void FIX0388Test() {
        FIXType fix388DiscretionInst = FIXType.DISCRETION_INST;
    }
    @Test
    void FIX0389Test() {
        FIXType fix389DiscretionOffset = FIXType.DISCRETION_OFFSET;
    }
    @Test
    void FIX0390Test() {
        FIXType fix390BidID = FIXType.BID_ID;
    }
    @Test
    void FIX0391Test() {
        FIXType fix391ClientBidID = FIXType.CLIENT_BID_ID;
    }
    @Test
    void FIX0392Test() {
        FIXType fix392ListName = FIXType.LIST_NAME;
    }
    @Test
    void FIX0393Test() {
        FIXType fix393TotalNumSecurities = FIXType.TOTAL_NUM_SECURITIES;
    }
    @Test
    void FIX0394Test() {
        FIXType fix394BidType = FIXType.BID_TYPE;
    }
    @Test
    void FIX0395Test() {
        FIXType fix395NumTickets = FIXType.NUM_TICKETS;
    }
    @Test
    void FIX0396Test() {
        FIXType fix396SideValue1 = FIXType.SIDE_VALUE1;
    }
    @Test
    void FIX0397Test() {
        FIXType fix397SideValue2 = FIXType.SIDE_VALUE2;
    }
    @Test
    void FIX0398Test() {
        FIXType fix398NoBidDescriptors = FIXType.NO_BID_DESCRIPTORS;
    }
    @Test
    void FIX0399Test() {
        FIXType fix399BidDescriptorType = FIXType.BID_DESCRIPTOR_TYPE;
    }
    @Test
    void FIX0400Test() {
        FIXType fix400BidDescriptor = FIXType.BID_DESCRIPTOR;
    }
    @Test
    void FIX0401Test() {
        FIXType fix401SideValueInd = FIXType.SIDE_VALUE_IND;
    }
    @Test
    void FIX0402Test() {
        FIXType fix402LiquidityPctLow = FIXType.LIQUIDITY_PCT_LOW;
    }
    @Test
    void FIX0403Test() {
        FIXType fix403LiquidityPctHigh = FIXType.LIQUIDITY_PCT_HIGH;
    }
    @Test
    void FIX0404Test() {
        FIXType fix404LiquidityValue = FIXType.LIQUIDITY_VALUE;
    }
    @Test
    void FIX0405Test() {
        FIXType fix405EFPTrackingError = FIXType.EFP_TRACKING_ERROR;
    }
    @Test
    void FIX0406Test() {
        FIXType fix406FairValue = FIXType.FAIR_VALUE;
    }
    @Test
    void FIX0407Test() {
        FIXType fix407OutsideIndexPct = FIXType.OUTSIDE_INDEX_PCT;
    }
    @Test
    void FIX0408Test() {
        FIXType fix408ValueOfFutures = FIXType.VALUE_OF_FUTURES;
    }
    @Test
    void FIX0409Test() {
        FIXType fix409LiquidityIndType = FIXType.LIQUIDITY_IND_TYPE;
    }
    @Test
    void FIX0410Test() {
        FIXType fix410WtAverageLiquidity = FIXType.WT_AVERAGE_LIQUIDITY;
    }
    @Test
    void FIX0411Test() {
        FIXType fix411ExchangeForPhysical = FIXType.EXCHANGE_FOR_PHYSICAL;
    }
    @Test
    void FIX0412Test() {
        FIXType fix412OutMainCntryUIndex = FIXType.OUT_MAIN_CNTRY_U_INDEX;
    }
    @Test
    void FIX0413Test() {
        FIXType fix413CrossPercent = FIXType.CROSS_PERCENT;
    }
    @Test
    void FIX0414Test() {
        FIXType fix414ProgRptReqs = FIXType.PROG_RPT_REQS;
    }
    @Test
    void FIX0415Test() {
        FIXType fix415ProgPeriodInterval = FIXType.PROG_PERIOD_INTERVAL;
    }
    @Test
    void FIX0416Test() {
        FIXType fix416IncTaxInd = FIXType.INC_TAX_IND;
    }
    @Test
    void FIX0417Test() {
        FIXType fix417NumBidders = FIXType.NUM_BIDDERS;
    }
    @Test
    void FIX0418Test() {
        FIXType fix418TradeType = FIXType.TRADE_TYPE;
    }
    @Test
    void FIX0419Test() {
        FIXType fix419BasisPxType = FIXType.BASIS_PX_TYPE;
    }
    @Test
    void FIX0420Test() {
        FIXType fix420NoBidComponents = FIXType.NO_BID_COMPONENTS;
    }
    @Test
    void FIX0421Test() {
        FIXType fix421Country = FIXType.COUNTRY;
    }
    @Test
    void FIX0422Test() {
        FIXType fix422TotNoStrikes = FIXType.TOT_NO_STRIKES;
    }
    @Test
    void FIX0423Test() {
        FIXType fix423PriceType = FIXType.PRICE_TYPE;
    }
    @Test
    void FIX0424Test() {
        FIXType fix424DayOrderQty = FIXType.DAY_ORDER_QTY;
    }
    @Test
    void FIX0425Test() {
        FIXType fix425DayCumQty = FIXType.DAY_CUM_QTY;
    }
    @Test
    void FIX0426Test() {
        FIXType fix426DayAvgPx = FIXType.DAY_AVG_PX;
    }
    @Test
    void FIX0427Test() {
        FIXType fix427GTBookingInst = FIXType.GT_BOOKING_INST;
    }
    @Test
    void FIX0428Test() {
        FIXType fix428NoStrikes = FIXType.NO_STRIKES;
    }
    @Test
    void FIX0429Test() {
        FIXType fix429ListStatusType = FIXType.LIST_STATUS_TYPE;
    }
    @Test
    void FIX0430Test() {
        FIXType fix430NetGrossInd = FIXType.NET_GROSS_IND;
    }
    @Test
    void FIX0431Test() {
        FIXType fix431ListOrderStatus = FIXType.LIST_ORDER_STATUS;
    }
    @Test
    void FIX0432Test() {
        FIXType fix432ExpireDate = FIXType.EXPIRE_DATE;
    }
    @Test
    void FIX0433Test() {
        FIXType fix433ListExecInstType = FIXType.LIST_EXEC_INST_TYPE;
    }
    @Test
    void FIX0434Test() {
        FIXType fix434CxlRejResponseTo = FIXType.CXL_REJ_RESPONSE_TO;
    }
    @Test
    void FIX0435Test() {
        FIXType fix435UnderlyingCouponRate = FIXType.UNDERLYING_COUPON_RATE;
    }
    @Test
    void FIX0436Test() {
        FIXType fix436UnderlyingContractMultiplier = FIXType.UNDERLYING_CONTRACT_MULTIPLIER;
    }
    @Test
    void FIX0437Test() {
        FIXType fix437ContraTradeQty = FIXType.CONTRA_TRADE_QTY;
    }
    @Test
    void FIX0438Test() {
        FIXType fix438ContraTradeTime = FIXType.CONTRA_TRADE_TIME;
    }
    @Test
    void FIX0439Test() {
        FIXType fix439ClearingFirm = FIXType.CLEARING_FIRM;
    }
    @Test
    void FIX0440Test() {
        FIXType fix440ClearingAccount = FIXType.CLEARING_ACCOUNT;
    }
    @Test
    void FIX0441Test() {
        FIXType fix441LiquidityNumSecurities = FIXType.LIQUIDITY_NUM_SECURITIES;
    }
    @Test
    void FIX0442Test() {
        FIXType fix442MultiLegReportingType = FIXType.MULTI_LEG_REPORTING_TYPE;
    }
    @Test
    void FIX0443Test() {
        FIXType fix443StrikeTime = FIXType.STRIKE_TIME;
    }
    @Test
    void FIX0444Test() {
        FIXType fix444ListStatusText = FIXType.LIST_STATUS_TEXT;
    }
    @Test
    void FIX0445Test() {
        FIXType fix445ListStatusEncodedTextLen = FIXType.LIST_STATUS_ENCODED_TEXT_LEN;
    }
    @Test
    void FIX0446Test() {
        FIXType fix446ListStatusEncodedText = FIXType.LIST_STATUS_ENCODED_TEXT;
    }
    /*
     *
     * Completed FIX42 tags
     *
     */


}