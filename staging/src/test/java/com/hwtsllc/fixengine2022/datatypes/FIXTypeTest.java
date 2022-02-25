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

import static org.junit.jupiter.api.Assertions.*;

public class FIXTypeTest {
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
        FIXType Tag141ResetSeqNumFlag = FIXType.RESET_SEQ_NUM_FLAG;
    }
    @Test
    void FIX0142Test() {
        FIXType Tag142SenderLocationID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0143Test() {
        FIXType Tag143TargetLocationID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0144Test() {
        FIXType Tag144OnBehalfOfLocationID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0145Test() {
        FIXType Tag145DeliverToLocationID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0146Test() {
        FIXType Tag146NoRelatedSym = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0147Test() {
        FIXType Tag147Subject = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0148Test() {
        FIXType Tag148Headline = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0149Test() {
        FIXType Tag149URLLink = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0150Test() {
        FIXType Tag150ExecType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0151Test() {
        FIXType Tag151LeavesQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0152Test() {
        FIXType Tag152CashOrderQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0153Test() {
        FIXType Tag153AllocAvgPx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0154Test() {
        FIXType Tag154AllocNetMoney = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0155Test() {
        FIXType Tag155SettlCurrFxRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0156Test() {
        FIXType Tag156SettlCurrFxRateCalc = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0157Test() {
        FIXType Tag157NumDaysInterest = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0158Test() {
        FIXType Tag158AccruedInterestRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0159Test() {
        FIXType Tag159AccruedInterestAmt = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0160Test() {
        FIXType Tag160SettlInstMode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0161Test() {
        FIXType Tag161AllocText = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0162Test() {
        FIXType Tag162SettlInstID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0163Test() {
        FIXType Tag163SettlInstTransType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0164Test() {
        FIXType Tag164EmailThreadID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0165Test() {
        FIXType Tag165SettlInstSource = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0166Test() {
        FIXType Tag166SettlLocation = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0167Test() {
        FIXType Tag167SecurityType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0168Test() {
        FIXType Tag168EffectiveTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0169Test() {
        FIXType Tag169StandInstDBType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0170Test() {
        FIXType Tag170StandInstDBName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0171Test() {
        FIXType Tag171StandInstDBID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0172Test() {
        FIXType Tag172SettlDeliveryType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0173Test() {
        FIXType Tag173SettlDepositoryCode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0174Test() {
        FIXType Tag174SettlBrkrCode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0175Test() {
        FIXType Tag175SettlInstCode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0176Test() {
        FIXType Tag176SecuritySettlAgentName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0177Test() {
        FIXType Tag177SecuritySettlAgentCode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0178Test() {
        FIXType Tag178SecuritySettlAgentAcctNum = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0179Test() {
        FIXType Tag179SecuritySettlAgentAcctName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0180Test() {
        FIXType Tag180SecuritySettlAgentContactName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0181Test() {
        FIXType Tag181SecuritySettlAgentContachPhone = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0182Test() {
        FIXType Tag182CashSettlAgentName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0183Test() {
        FIXType Tag183CashSettlAgentCode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0184Test() {
        FIXType Tag184CashSettlAgentAcctNum = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0185Test() {
        FIXType Tag185CashSettlAgentAcctName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0186Test() {
        FIXType Tag186CashSettlAgentContactName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0187Test() {
        FIXType Tag187CashSettlAgentContactPhone = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0188Test() {
        FIXType Tag188BidSpotRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0189Test() {
        FIXType Tag189BidForwardPoints = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0190Test() {
        FIXType Tag190OfferSpotRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0191Test() {
        FIXType Tag191OfferForwardPoints = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0192Test() {
        FIXType Tag192OrderQty2 = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0193Test() {
        FIXType Tag193SettlDate2 = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0194Test() {
        FIXType Tag194LastSpotRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0195Test() {
        FIXType Tag195LastForwardPoints = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0196Test() {
        FIXType Tag196AllocLinkID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0197Test() {
        FIXType Tag197AllocLinkType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0198Test() {
        FIXType Tag198SecondaryOrderID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0199Test() {
        FIXType Tag199NoIOIQualifiers = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0200Test() {
        FIXType Tag200MaturityMonthYear = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0201Test() {
        FIXType Tag201PutOrCall = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0202Test() {
        FIXType Tag202StrikePrice = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0203Test() {
        FIXType Tag203CoveredOrUncovered = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0204Test() {
        FIXType Tag204CustomerOrFirm = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0205Test() {
        FIXType Tag205MaturityDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0206Test() {
        FIXType Tag206OptAttribute = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0207Test() {
        FIXType Tag207SecurityExchange = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0208Test() {
        FIXType Tag208NotifyBrokerOfCredit = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0209Test() {
        FIXType Tag209AllocHandlInst = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0210Test() {
        FIXType Tag210MaxShow = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0211Test() {
        FIXType Tag211PegOffsetValue = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0212Test() {
        FIXType Tag212XmlDataLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0213Test() {
        FIXType Tag213XmlData = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0214Test() {
        FIXType Tag214SettlInstRefID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0215Test() {
        FIXType Tag215NoRoutingIDs = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0216Test() {
        FIXType Tag216RoutingType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0217Test() {
        FIXType Tag217RoutingID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0218Test() {
        FIXType Tag218Spread = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0219Test() {
        FIXType Tag219Benchmark = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0220Test() {
        FIXType Tag220BenchmarkCurveCurrency = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0221Test() {
        FIXType Tag221BenchmarkCurveName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0222Test() {
        FIXType Tag222BenchmarkCurvePoint = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0223Test() {
        FIXType Tag223CouponRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0224Test() {
        FIXType Tag224CouponPaymentDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0225Test() {
        FIXType Tag225IssueDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0226Test() {
        FIXType Tag226RepurchaseTerm = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0227Test() {
        FIXType Tag227RepurchaseRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0228Test() {
        FIXType Tag228Factor = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0229Test() {
        FIXType Tag229TradeOriginatingDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0230Test() {
        FIXType Tag230ExDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0231Test() {
        FIXType Tag231ContractMultiplier = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0232Test() {
        FIXType Tag232NoStipulations = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0233Test() {
        FIXType Tag233StipulationType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0234Test() {
        FIXType Tag234StipulationValue = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0235Test() {
        FIXType Tag235YieldType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0236Test() {
        FIXType Tag236Yield = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0237Test() {
        FIXType Tag237TotalTakedown = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0238Test() {
        FIXType Tag238Concession = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0239Test() {
        FIXType Tag239RepoCollateralSecurityType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0240Test() {
        FIXType Tag240RedemptionDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0241Test() {
        FIXType Tag241UnderlyingCouponPaymentDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0242Test() {
        FIXType Tag242UnderlyingIssueDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0243Test() {
        FIXType Tag243UnderlyingRepoCollateralSecurityType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0244Test() {
        FIXType Tag244UnderlyingRepurchaseTerm = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0245Test() {
        FIXType Tag245UnderlyingRepurchaseRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0246Test() {
        FIXType Tag246UnderlyingFactor = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0247Test() {
        FIXType Tag247UnderlyingRedemptionDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0248Test() {
        FIXType Tag248LegCouponPaymentDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0249Test() {
        FIXType Tag249LegIssueDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0250Test() {
        FIXType Tag250LegRepoCollateralSecurityType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0251Test() {
        FIXType Tag251LegRepurchaseTerm = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0252Test() {
        FIXType Tag252LegRepurchaseRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0253Test() {
        FIXType Tag253LegFactor = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0254Test() {
        FIXType Tag254LegRedemptionDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0255Test() {
        FIXType Tag255CreditRating = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0256Test() {
        FIXType Tag256UnderlyingCreditRating = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0257Test() {
        FIXType Tag257LegCreditRating = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0258Test() {
        FIXType Tag258TradedFlatSwitch = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0259Test() {
        FIXType Tag259BasisFeatureDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0260Test() {
        FIXType Tag260BasisFeaturePrice = FIXType.PREV_CLOSE_PX;
    }
    @Test
    @Deprecated
    void FIX0261Test() {
    }
    @Test
    void FIX0262Test() {
        FIXType Tag262MDReqID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0263Test() {
        FIXType Tag263SubscriptionRequestType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0264Test() {
        FIXType Tag264MarketDepth = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0265Test() {
        FIXType Tag265MDUpdateType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0266Test() {
        FIXType Tag266AggregatedBook = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0267Test() {
        FIXType Tag267NoMDEntryTypes = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0268Test() {
        FIXType Tag268NoMDEntries = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0269Test() {
        FIXType Tag269MDEntryType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0270Test() {
        FIXType Tag270MDEntryPx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0271Test() {
        FIXType Tag271MDEntrySize = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0272Test() {
        FIXType Tag272MDEntryDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0273Test() {
        FIXType Tag273MDEntryTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0274Test() {
        FIXType Tag274TickDirection = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0275Test() {
        FIXType Tag275MDMkt = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0276Test() {
        FIXType Tag276QuoteCondition = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0277Test() {
        FIXType Tag277TradeCondition = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0278Test() {
        FIXType Tag278MDEntryID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0279Test() {
        FIXType Tag279MDUpdateAction = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0280Test() {
        FIXType Tag280MDEntryRefID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0281Test() {
        FIXType Tag281MDReqRejReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0282Test() {
        FIXType Tag282MDEntryOriginator = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0283Test() {
        FIXType Tag283LocationID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0284Test() {
        FIXType Tag284DeskID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0285Test() {
        FIXType Tag285DeleteReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0286Test() {
        FIXType Tag286OpenCloseSettleFlag = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0287Test() {
        FIXType Tag287SellerDays = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0288Test() {
        FIXType Tag288MDEntryBuyer = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0289Test() {
        FIXType Tag289MDEntrySeller = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0290Test() {
        FIXType Tag290MDEntryPositionNo = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0291Test() {
        FIXType Tag291FinancialStatus = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0292Test() {
        FIXType Tag292CorporateAction = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0293Test() {
        FIXType Tag293DefBidSize = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0294Test() {
        FIXType Tag294DefOfferSize = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0295Test() {
        FIXType Tag295NoQuoteEntries = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0296Test() {
        FIXType Tag296NoQuoteSets = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0297Test() {
        FIXType Tag297QuoteAckStatus = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0298Test() {
        FIXType Tag298QuoteCancelType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0299Test() {
        FIXType Tag299QuoteEntryID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0300Test() {
        FIXType Tag300QuoteRejectReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0301Test() {
        FIXType Tag301QuoteResponseLevel = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0302Test() {
        FIXType Tag302QuoteSetID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0303Test() {
        FIXType Tag303QuoteRequestType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0304Test() {
        FIXType Tag304TotQuoteEntries = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0305Test() {
        FIXType Tag305UnderlyingIDSource = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0306Test() {
        FIXType Tag306UnderlyingIssuer = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0307Test() {
        FIXType Tag307UnderlyingSecurityDesc = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0308Test() {
        FIXType Tag308UnderlyingSecurityExchange = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0309Test() {
        FIXType Tag309UnderlyingSecurityID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0310Test() {
        FIXType Tag310UnderlyingSecurityType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0311Test() {
        FIXType Tag311UnderlyingSymbol = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0312Test() {
        FIXType Tag312UnderlyingSymbolSfx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0313Test() {
        FIXType Tag313UnderlyingMaturityMonthYear = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0314Test() {
        FIXType Tag314UnderlyingMaturityDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0315Test() {
        FIXType Tag315UnderlyingPutOrCall = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0316Test() {
        FIXType Tag316UnderlyingStrikePrice = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0317Test() {
        FIXType Tag317UnderlyingOptAttribute = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0318Test() {
        FIXType Tag318UnderlyingCurrency = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0319Test() {
        FIXType Tag319RatioQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0320Test() {
        FIXType Tag320SecurityReqID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0321Test() {
        FIXType Tag321SecurityRequestType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0322Test() {
        FIXType Tag322SecurityResponseID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0323Test() {
        FIXType Tag323SecurityResponseType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0324Test() {
        FIXType Tag324SecurityStatusReqID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0325Test() {
        FIXType Tag325UnsolicitedIndicator = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0326Test() {
        FIXType Tag326SecurityTradingStatus = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0327Test() {
        FIXType Tag327HaltReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0328Test() {
        FIXType Tag328InViewOfCommon = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0329Test() {
        FIXType Tag329DueToRelated = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0330Test() {
        FIXType Tag330BuyVolume = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0331Test() {
        FIXType Tag331SellVolume = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0332Test() {
        FIXType Tag332HighPx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0333Test() {
        FIXType Tag333LowPx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0334Test() {
        FIXType Tag334Adjustment = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0335Test() {
        FIXType Tag335TradSesReqID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0336Test() {
        FIXType Tag336TradingSessionID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0337Test() {
        FIXType Tag337ContraTrader = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0338Test() {
        FIXType Tag338TradSesMethod = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0339Test() {
        FIXType Tag339TradSesMode = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0340Test() {
        FIXType Tag340TradSesStatus = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0341Test() {
        FIXType Tag341TradSesStartTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0342Test() {
        FIXType Tag342TradSesOpenTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0343Test() {
        FIXType Tag343TradSesPreCloseTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0344Test() {
        FIXType Tag344TradSesCloseTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0345Test() {
        FIXType Tag345TradSesEndTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0346Test() {
        FIXType Tag346NumberOfOrders = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0347Test() {
        FIXType Tag347MessageEncoding = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0348Test() {
        FIXType Tag348EncodedIssuerLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0349Test() {
        FIXType Tag349EncodedIssuer = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0350Test() {
        FIXType Tag350EncodedSecurityDescLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0351Test() {
        FIXType Tag351EncodedSecurityDesc = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0352Test() {
        FIXType Tag352EncodedListExecInstLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0353Test() {
        FIXType Tag353EncodedListExecInst = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0354Test() {
        FIXType Tag354EncodedTextLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0355Test() {
        FIXType Tag355EncodedText = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0356Test() {
        FIXType Tag356EncodedSubjectLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0357Test() {
        FIXType Tag357EncodedSubject = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0358Test() {
        FIXType Tag358EncodedHeadlineLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0359Test() {
        FIXType Tag359EncodedHeadline = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0360Test() {
        FIXType Tag360EncodedAllocTextLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0361Test() {
        FIXType Tag361EncodedAllocText = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0362Test() {
        FIXType Tag362EncodedUnderlyingIssuerLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0363Test() {
        FIXType Tag363EncodedUnderlyingIssuer = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0364Test() {
        FIXType Tag364EncodedUnderlyingSecurityDescLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0365Test() {
        FIXType Tag365EncodedUnderlyingSecurityDesc = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0366Test() {
        FIXType Tag366AllocPrice = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0367Test() {
        FIXType Tag367QuoteSetValidUntilTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0368Test() {
        FIXType Tag368QuoteEntryRejectReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0369Test() {
        FIXType Tag369LastMsgSeqNumProcessed = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0370Test() {
        FIXType Tag370OnBehalfOfSendingTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0371Test() {
        FIXType Tag371RefTagID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0372Test() {
        FIXType Tag372RefMsgType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0373Test() {
        FIXType Tag373SessionRejectReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0374Test() {
        FIXType Tag374BidRequestTransType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0375Test() {
        FIXType Tag375ContraBroker = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0376Test() {
        FIXType Tag376ComplianceID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0377Test() {
        FIXType Tag377SolicitedFlag = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0378Test() {
        FIXType Tag378ExecRestatementReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0379Test() {
        FIXType Tag379BusinessRejectRefID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0380Test() {
        FIXType Tag380BusinessRejectReason = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0381Test() {
        FIXType Tag381GrossTradeAmt = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0382Test() {
        FIXType Tag382NoContraBrokers = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0383Test() {
        FIXType Tag383MaxMessageSize = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0384Test() {
        FIXType Tag384NoMsgTypes = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0385Test() {
        FIXType Tag385MsgDirection = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0386Test() {
        FIXType Tag386NoTradingSessions = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0387Test() {
        FIXType Tag387TotalVolumeTraded = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0388Test() {
        FIXType Tag388DiscretionInst = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0389Test() {
        FIXType Tag389DiscretionOffset = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0390Test() {
        FIXType Tag390BidID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0391Test() {
        FIXType Tag391ClientBidID = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0392Test() {
        FIXType Tag392ListName = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0393Test() {
        FIXType Tag393TotalNumSecurities = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0394Test() {
        FIXType Tag394BidType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0395Test() {
        FIXType Tag395NumTickets = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0396Test() {
        FIXType Tag396SideValue1 = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0397Test() {
        FIXType Tag397SideValue2 = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0398Test() {
        FIXType Tag398NoBidDescriptors = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0399Test() {
        FIXType Tag399BidDescriptorType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0400Test() {
        FIXType Tag400BidDescriptor = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0401Test() {
        FIXType Tag401SideValueInd = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0402Test() {
        FIXType Tag402LiquidityPctLow = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0403Test() {
        FIXType Tag403LiquidityPctHigh = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0404Test() {
        FIXType Tag404LiquidityValue = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0405Test() {
        FIXType Tag405EFPTrackingError = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0406Test() {
        FIXType Tag406FairValue = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0407Test() {
        FIXType Tag407OutsideIndexPct = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0408Test() {
        FIXType Tag408ValueOfFutures = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0409Test() {
        FIXType Tag409LiquidityIndType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0410Test() {
        FIXType Tag410WtAverageLiquidity = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0411Test() {
        FIXType Tag411ExchangeForPhysical = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0412Test() {
        FIXType Tag412OutMainCntryUIndex = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0413Test() {
        FIXType Tag413CrossPercent = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0414Test() {
        FIXType Tag414ProgRptReqs = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0415Test() {
        FIXType Tag415ProgPeriodInterval = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0416Test() {
        FIXType Tag416IncTaxInd = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0417Test() {
        FIXType Tag417NumBidders = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0418Test() {
        FIXType Tag418TradeType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0419Test() {
        FIXType Tag419BasisPxType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0420Test() {
        FIXType Tag420NoBidComponents = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0421Test() {
        FIXType Tag421Country = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0422Test() {
        FIXType Tag422TotNoStrikes = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0423Test() {
        FIXType Tag423PriceType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0424Test() {
        FIXType Tag424DayOrderQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0425Test() {
        FIXType Tag425DayCumQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0426Test() {
        FIXType Tag426DayAvgPx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0427Test() {
        FIXType Tag427GTBookingInst = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0428Test() {
        FIXType Tag428NoStrikes = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0429Test() {
        FIXType Tag429ListStatusType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0430Test() {
        FIXType Tag430NetGrossInd = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0431Test() {
        FIXType Tag431ListOrderStatus = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0432Test() {
        FIXType Tag432ExpireDate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0433Test() {
        FIXType Tag433ListExecInstType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0434Test() {
        FIXType Tag434CxlRejResponseTo = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0435Test() {
        FIXType Tag435UnderlyingCouponRate = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0436Test() {
        FIXType Tag436UnderlyingContractMultiplier = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0437Test() {
        FIXType Tag437ContraTradeQty = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0438Test() {
        FIXType Tag438ContraTradeTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0439Test() {
        FIXType Tag439ClearingFirm = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0440Test() {
        FIXType Tag440ClearingAccount = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0441Test() {
        FIXType Tag441LiquidityNumSecurities = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0442Test() {
        FIXType Tag442MultiLegReportingType = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0443Test() {
        FIXType Tag443StrikeTime = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0444Test() {
        FIXType Tag444ListStatusText = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0445Test() {
        FIXType Tag445ListStatusEncodedTextLen = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0446Test() {
        FIXType fix446ListStatusEncodedText = FIXType.LIST_STATUS_ENCODED_TEXT;
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
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0448Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0449Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0450Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0451Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0452Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0453Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0454Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0455Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0456Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0457Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0458Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0459Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0460Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0461Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0462Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0463Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0464Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0465Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0466Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0467Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0468Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0469Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0470Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0471Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0472Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0473Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0474Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0475Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0476Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0477Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0478Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0479Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0480Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0481Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0482Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0483Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0484Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0485Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0486Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0487Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0488Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0489Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0490Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0491Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0492Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0493Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0494Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0495Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0496Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0497Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0498Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0499Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0500Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0501Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0502Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0503Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0504Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0505Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0506Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0507Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0508Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0509Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0510Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0511Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0512Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0513Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0514Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0515Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0516Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0517Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0518Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0519Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0520Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0521Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0522Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0523Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0524Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0525Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0526Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0527Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0528Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0529Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0530Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0531Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0532Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0533Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0534Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0535Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0536Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0537Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0538Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0539Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0540Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0541Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0542Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0543Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0544Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0545Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0546Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0547Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0548Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0549Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0550Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0551Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0552Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0553Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0554Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0555Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0556Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0557Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0558Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0559Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0560Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0561Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0562Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0563Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0564Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0565Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0566Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0567Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0568Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0569Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0570Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0571Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0572Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0573Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0574Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0575Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0576Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0577Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0578Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0579Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0580Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0581Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0582Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0583Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0584Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0585Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0586Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0587Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0588Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0589Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0590Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0591Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0592Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0593Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0594Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0595Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0596Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0597Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0598Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0599Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0600Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0601Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0602Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0603Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0604Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0605Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0606Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0607Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0608Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0609Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0610Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0611Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0612Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0613Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0614Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0615Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0616Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0617Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0618Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0619Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0620Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0621Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0622Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0623Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0624Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0625Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0626Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0627Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0628Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0629Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0630Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0631Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0632Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0633Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0634Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0635Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0636Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0637Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0638Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0639Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0640Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0641Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0642Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0643Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0644Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0645Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0646Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0647Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0648Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0649Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0650Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0651Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0652Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0653Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0654Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0655Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0656Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0657Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0658Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0659Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
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
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0661Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0662Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0663Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0664Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0665Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0666Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0667Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0668Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0669Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0670Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0671Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0672Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0673Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0674Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0675Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0676Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0677Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0678Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0679Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0680Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0681Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0682Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0683Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0684Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0685Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0686Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0687Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0688Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0689Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0690Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0691Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0692Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0693Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0694Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0695Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0696Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0697Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0698Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0699Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0700Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0701Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0702Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0703Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0704Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0705Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0706Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0707Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0708Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0709Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0710Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0711Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0712Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0713Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0714Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0715Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0716Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0717Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0718Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0719Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0720Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0721Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0722Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0723Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0724Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0725Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0726Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0727Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0728Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0729Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0730Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0731Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0732Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0733Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0734Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0735Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0736Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0737Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0738Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0739Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0740Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0741Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0742Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0743Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0744Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0745Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0746Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0747Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0748Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0749Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0750Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0751Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0752Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0753Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0754Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0755Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0756Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0757Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0758Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0759Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0760Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0761Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0762Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0763Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0764Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0765Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0766Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0767Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0768Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0769Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0770Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0771Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0772Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0773Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0774Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0775Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0776Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0777Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0778Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0779Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0780Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0781Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0782Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0783Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0784Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0785Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0786Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0787Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0788Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0789Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0790Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0791Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0792Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0793Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0794Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0795Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0796Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0797Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0798Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0799Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0800Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0801Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0802Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0803Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0804Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0805Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0806Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0807Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0808Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0809Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0810Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0811Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0812Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0813Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0814Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0815Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0816Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0817Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0818Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0819Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0820Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0821Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0822Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0823Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0824Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0825Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0826Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0827Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0828Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0829Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0830Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0831Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0832Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0833Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0834Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0835Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0836Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0837Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0838Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0839Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0840Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0841Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0842Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0843Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0844Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0845Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0846Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0847Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0848Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0849Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0850Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0851Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0852Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0853Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0854Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0855Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0856Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0857Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0858Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0859Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0860Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0861Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0862Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0863Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0864Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0865Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0866Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0867Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0868Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0869Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0870Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0871Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0872Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0873Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0874Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0875Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0876Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0877Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0878Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0879Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0880Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0881Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0882Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0883Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0884Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0885Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0886Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0887Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0888Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0889Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0890Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0891Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0892Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0893Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0894Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0895Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0896Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0897Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0898Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0899Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0900Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0901Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0902Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0903Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0904Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0905Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0906Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0907Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0908Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0909Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0910Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0911Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0912Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0913Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0914Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0915Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0916Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0917Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0918Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0919Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0920Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0921Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0922Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0923Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0924Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0925Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0926Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0927Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0928Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0929Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0930Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0931Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0932Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0933Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0934Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0935Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0936Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0937Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0938Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0939Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0940Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0941Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0942Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0943Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0944Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0945Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0946Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0947Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0948Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0949Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0950Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0951Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0952Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0953Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0954Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0955Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
    }
    @Test
    void FIX0956Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
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
        FIXType fix957NoStrategyParameters = FIXType.NO_STRATEGY_PARAMETERS;
    }
    @Test
    void FIX0958Test() {
        FIXType fix958StrategyParameterName = FIXType.STRATEGY_PARAMETER_NAME;
    }
    @Test
    void FIX0959Test() {
        FIXType fix959StrategyParameterType = FIXType.STRATEGY_PARAMETER_TYPE;
    }
    @Test
    void FIX0960Test() {
        FIXType fix960StrategyParameterValue = FIXType.STRATEGY_PARAMETER_VALUE;
    }
    @Test
    void FIX0961Test() {
        FIXType fix961HostCrossID = FIXType.HOST_CROSS_ID;
    }
    @Test
    void FIX0962Test() {
        FIXType fix962SideTimeInForce = FIXType.SIDE_TIME_IN_FORCE;
    }
    @Test
    void FIX0963Test() {
        FIXType fix963MDReportID = FIXType.MD_REPORT_ID;
    }
    @Test
    void FIX0964Test() {
        FIXType fix964SecurityReportID = FIXType.SECURITY_REPORT_ID;
    }
    @Test
    void FIX0965Test() {
        FIXType fix965SecurityStatus = FIXType.SECURITY_STATUS;
    }
    @Test
    void FIX0966Test() {
        FIXType fix966SettleOnOpenFlag = FIXType.SETTLE_ON_OPEN_FLAG;
    }
    @Test
    void FIX0967Test() {
        FIXType fix967StrikeMultiplier = FIXType.STRIKE_MULTIPLIER;
    }
    @Test
    void FIX0968Test() {
        FIXType fix968StrikeValue = FIXType.STRIKE_VALUE;
    }
    @Test
    void FIX0969Test() {
        FIXType fix969MinPriceIncrement = FIXType.MIN_PRICE_INCREMENT;
    }
    @Test
    void FIX0970Test() {
        FIXType fix970PositionLimit = FIXType.POSITION_LIMIT;
    }
    @Test
    void FIX0971Test() {
        FIXType fix971NTPositionLimit = FIXType.NT_POSITION_LIMIT;
    }
    @Test
    void FIX0972Test() {
        FIXType fix972UnderlyingAllocationPercent = FIXType.UNDERLYING_ALLOCATION_PERCENT;
    }
    @Test
    void FIX0973Test() {
        FIXType fix973UnderlyingCashAmount = FIXType.UNDERLYING_CASH_AMOUNT;
    }
    @Test
    void FIX0974Test() {
        FIXType fix974UnderlyingCashType = FIXType.UNDERLYING_CASH_TYPE;
    }
    @Test
    void FIX0975Test() {
        FIXType fix975UnderlyingSettlementType = FIXType.UNDERLYING_SETTLEMENT_TYPE;
    }
    @Test
    void FIX0976Test() {
        FIXType fix976QuantityDate = FIXType.QUANTITY_DATE;
    }
    @Test
    void FIX0977Test() {
        FIXType fix977ContIntRptID = FIXType.CONT_INT_RPT_ID;
    }
    @Test
    void FIX0978Test() {
        FIXType fix978LateIndicator = FIXType.LATE_INDICATOR;
    }
    @Test
    void FIX0979Test() {
        FIXType fix979InputSource = FIXType.INPUT_SOURCE;
    }
    @Test
    void FIX0980Test() {
        FIXType fix980SecurityUpdateAction = FIXType.SECURITY_UPDATE_ACTION;
    }
    @Test
    void FIX0981Test() {
        FIXType fix981NoExpiration = FIXType.NO_EXPIRATION;
    }
    @Test
    void FIX0982Test() {
        FIXType fix982ExpType = FIXType.EXP_TYPE;
    }
    @Test
    void FIX0983Test() {
        FIXType fix983ExpQty = FIXType.EXP_QTY;
    }
    @Test
    void FIX0984Test() {
        FIXType fix984NoUnderlyingAmounts = FIXType.NO_UNDERLYING_AMOUNTS;
    }
    @Test
    void FIX0985Test() {
        FIXType fix985UnderlyingPayAmount = FIXType.UNDERLYING_PAY_AMOUNT;
    }
    @Test
    void FIX0986Test() {
        FIXType fix986UnderlyingCollectAmount = FIXType.UNDERLYING_COLLECT_AMOUNT;
    }
    @Test
    void FIX0987Test() {
        FIXType fix987UnderlyingSettlementDate = FIXType.UNDERLYING_SETTLEMENT_DATE;
    }
    @Test
    void FIX0988Test() {
        FIXType fix988UnderlyingSettlementStatus = FIXType.UNDERLYING_SETTLEMENT_STATUS;
    }
    @Test
    void FIX0989Test() {
        FIXType fix989SecondaryIndividualAllocID = FIXType.SECONDARY_INDIVIDUAL_ALLOC_ID;
    }
    @Test
    void FIX0990Test() {
        FIXType fix990LegReportID = FIXType.LEG_REPORT_ID;
    }
    @Test
    void FIX0991Test() {
        FIXType fix991RndPx = FIXType.RND_PX;
    }
    @Test
    void FIX0992Test() {
        FIXType fix992IndividualAllocType = FIXType.INDIVIDUAL_ALLOC_TYPE;
    }
    @Test
    void FIX0993Test() {
        FIXType fix993AllocCustomerCapacity = FIXType.ALLOC_CUSTOMER_CAPACITY;
    }
    @Test
    void FIX0994Test() {
        FIXType fix994TierCode = FIXType.TIER_CODE;
    }
    @Test
    @Deprecated
    void FIX0995Test() {
    }
    @Test
    void FIX0996Test() {
        FIXType fix996UnitofMeasure = FIXType.UNIT_OF_MEASURE;
    }
    @Test
    void FIX0997Test() {
        FIXType fix997TimeUnit = FIXType.TIME_UNIT;
    }
    @Test
    void FIX0998Test() {
        FIXType fix998UnderlyingUnitofMeasure = FIXType.UNDERLYING_UNIT_OF_MEASURE;
    }
    @Test
    void FIX0999Test() {
        FIXType fix999LegUnitofMeasure = FIXType.LEG_UNIT_OF_MEASURE;
    }
    @Test
    void FIX1000Test() {
        FIXType fix1000UnderlyingTimeUnit = FIXType.UNDERLYING_TIME_UNIT;
        assertEquals( fix1000UnderlyingTimeUnit.getFIXName(), "UNDERLYING_TIME_UNIT");
        assertEquals( fix1000UnderlyingTimeUnit.getFIXNumber(), 1000);
        assertEquals( fix1000UnderlyingTimeUnit.getFIXDescription(), "UnderlyingTimeUnit");
    }
    @Test
    void FIX1001Test() {
        FIXType fix1001LegTimeUnit = FIXType.LEG_TIME_UNIT;
    }
    @Test
    void FIX1002Test() {
        FIXType fix1002AllocMethod = FIXType.ALLOC_METHOD;
    }
    @Test
    void FIX1003Test() {
        FIXType fix1003TradeID = FIXType.TRADE_ID;
    }
    @Test
    @Deprecated
    void FIX1004Test() {
    }
    @Test
    void FIX1005Test() {
        FIXType fix1005SideTradeReportID = FIXType.SIDE_TRADE_REPORT_ID;
    }
    @Test
    void FIX1006Test() {
        FIXType fix1006SideFillStationCd = FIXType.SIDE_FILL_STATION_CD;
    }
    @Test
    void FIX1007Test() {
        FIXType fix1007SideReasonCd = FIXType.SIDE_REASON_CD;
    }
    @Test
    void FIX1008Test() {
        FIXType fix1008SideTrdSubTyp = FIXType.SIDE_TRD_SUB_TYP;
    }
    @Test
    void FIX1009Test() {
        FIXType fix1009SideQty = FIXType.SIDE_QTY;
    }
    @Test
    @Deprecated
    void FIX1010Test() {
    }
    @Test
    void FIX1011Test() {
        FIXType fix1011MessageEventSource = FIXType.MESSAGE_EVENT_SOURCE;
    }
    @Test
    void FIX1012Test() {
        FIXType fix1012SideTrdRegTimestamp = FIXType.SIDE_TRD_REG_TIMESTAMP;
    }
    @Test
    void FIX1013Test() {
        FIXType fix1013SideTrdRegTimestampType = FIXType.SIDE_TRD_REG_TIMESTAMP_TYPE;
    }
    @Test
    void FIX1014Test() {
        FIXType fix1014SideTrdRegTimestampSrc = FIXType.SIDE_TRD_REG_TIMESTAMP_SRC;
    }
    @Test
    void FIX1015Test() {
        FIXType fix1015AsOfIndicator = FIXType.AS_OF_INDICATOR;
    }
    @Test
    void FIX1016Test() {
        FIXType fix1016NoSideTrdRegTS = FIXType.NO_SIDE_TRD_REG_TS;
    }
    @Test
    void FIX1017Test() {
        FIXType fix1017LegOptionRatio = FIXType.LEG_OPTION_RATIO;
    }
    @Test
    void FIX1018Test() {
        FIXType fix1018NoInstrumentParties = FIXType.NO_INSTRUMENT_PARTIES;
    }
    @Test
    void FIX1019Test() {
        FIXType fix1019InstrumentPartyID = FIXType.INSTRUMENT_PARTY_ID;
    }
    @Test
    void FIX1020Test() {
        FIXType fix1020TradeVolume = FIXType.TRADE_VOLUME;
    }
    @Test
    void FIX1021Test() {
        FIXType fix1021MDBookType = FIXType.MD_BOOK_TYPE;
    }
    @Test
    void FIX1022Test() {
        FIXType fix1022MDFeedType = FIXType.MD_FEED_TYPE;
    }
    @Test
    void FIX1023Test() {
        FIXType fix1023MDPriceLevel = FIXType.MD_PRICE_LEVEL;
    }
    @Test
    void FIX1024Test() {
        FIXType fix1024MDOriginType = FIXType.MD_ORIGIN_TYPE;
    }
    @Test
    void FIX1025Test() {
        FIXType fix1025FirstPx = FIXType.FIRST_PX;
    }
    @Test
    void FIX1026Test() {
        FIXType fix1026MDEntrySpotRate = FIXType.MD_ENTRY_SPOT_RATE;
    }
    @Test
    void FIX1027Test() {
        FIXType fix1027MDEntryForwardPoints = FIXType.MD_ENTRY_FORWARD_POINTS;
    }
    @Test
    void FIX1028Test() {
        FIXType fix1028ManualOrderIndicator = FIXType.MANUAL_ORDER_INDICATOR;
    }
    @Test
    void FIX1029Test() {
        FIXType fix1029CustDirectedOrder = FIXType.CUST_DIRECTED_ORDER;
    }
    @Test
    void FIX1030Test() {
        FIXType fix1030ReceivedDeptID = FIXType.RECEIVED_DEPT_ID;
    }
    @Test
    void FIX1031Test() {
        FIXType fix1031CustOrderHandlingInst = FIXType.CUST_ORDER_HANDLING_INST;
    }
    @Test
    void FIX1032Test() {
        FIXType fix1032OrderHandlingInstSource = FIXType.ORDER_HANDLING_INST_SOURCE;
    }
    @Test
    void FIX1033Test() {
        FIXType fix1033DeskType = FIXType.DESK_TYPE;
    }
    @Test
    void FIX1034Test() {
        FIXType fix1034DeskTypeSource = FIXType.DESK_TYPE_SOURCE;
    }
    @Test
    void FIX1035Test() {
        FIXType fix1035DeskOrderHandlingInst = FIXType.DESK_ORDER_HANDLING_INST;
    }
    @Test
    void FIX1036Test() {
        FIXType fix1036ExecAckStatus = FIXType.EXEC_ACK_STATUS;
    }
    @Test
    void FIX1037Test() {
        FIXType fix1037UnderlyingDeliveryAmount = FIXType.UNDERLYING_DELIVERY_AMOUNT;
    }
    @Test
    void FIX1038Test() {
        FIXType fix1038UnderlyingCapValue = FIXType.UNDERLYING_CAP_VALUE;
    }
    @Test
    void FIX1039Test() {
        FIXType fix1039UnderlyingSettlMethod = FIXType.UNDERLYING_SETTL_METHOD;
    }
    @Test
    void FIX1040Test() {
        FIXType fix1040SecondaryTradeID = FIXType.SECONDARY_TRADE_ID;
    }
    @Test
    void FIX1041Test() {
        FIXType fix1041FirmTradeID = FIXType.FIRM_TRADE_ID;
    }
    @Test
    void FIX1042Test() {
        FIXType fix1042SecondaryFirmTradeID = FIXType.SECONDARY_FIRM_TRADE_ID;
    }
    @Test
    void FIX1043Test() {
        FIXType fix1043CollApplType = FIXType.COLL_APPL_TYPE;
    }
    @Test
    void FIX1044Test() {
        FIXType fix1044UnderlyingAdjustedQuantity = FIXType.UNDERLYING_ADJUSTED_QUANTITY;
    }
    @Test
    void FIX1045Test() {
        FIXType fix1045UnderlyingFXRate = FIXType.UNDERLYING_FX_RATE;
    }
    @Test
    void FIX1046Test() {
        FIXType fix1046UnderlyingFXRateCalc = FIXType.UNDERLYING_FX_RATE_CALC;
    }
    @Test
    void FIX1047Test() {
        FIXType fix1047AllocPositionEffect = FIXType.ALLOC_POSITION_EFFECT;
    }
    @Test
    void FIX1048Test() {
        FIXType fix1048DealingCapacity = FIXType.DEALING_CAPACITY;
    }
    @Test
    void FIX1049Test() {
        FIXType fix1049InstrmtAssignmentMethod = FIXType.INSTRMT_ASSIGNMENT_METHOD;
    }
    @Test
    void FIX1050Test() {
        FIXType fix1050InstrumentPartyIDSource = FIXType.INSTRUMENT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1051Test() {
        FIXType fix1051InstrumentPartyRole = FIXType.INSTRUMENT_PARTY_ROLE;
    }
    @Test
    void FIX1052Test() {
        FIXType fix1052NoInstrumentPartySubIDs = FIXType.NO_INSTRUMENT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1053Test() {
        FIXType fix1053InstrumentPartySubID = FIXType.INSTRUMENT_PARTY_SUB_ID;
    }
    @Test
    void FIX1054Test() {
        FIXType fix1054InstrumentPartySubIDType = FIXType.INSTRUMENT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1055Test() {
        FIXType fix1055PositionCurrency = FIXType.POSITION_CURRENCY;
    }
    @Test
    void FIX1056Test() {
        FIXType fix1056CalculatedCcyLastQty = FIXType.CALCULATED_CCY_LAST_QTY;
    }
    @Test
    void FIX1057Test() {
        FIXType fix1057AggressorIndicator = FIXType.AGGRESSOR_INDICATOR;
    }
    @Test
    void FIX1058Test() {
        FIXType fix1058NoUndlyInstrumentParties = FIXType.NO_UNDLY_INSTRUMENT_PARTIES;
    }
    @Test
    void FIX1059Test() {
        FIXType fix1059UndlyInstrumentPartyID = FIXType.UNDLY_INSTRUMENT_PARTY_ID;
    }
    @Test
    void FIX1060Test() {
        FIXType fix1060UndlyInstrumentPartyIDSource = FIXType.UNDLY_INSTRUMENT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1061Test() {
        FIXType fix1061UndlyInstrumentPartyRole = FIXType.UNDLY_INSTRUMENT_PARTY_ROLE;
    }
    @Test
    void FIX1062Test() {
        FIXType fix1062NoUndlyInstrumentPartySubIDs = FIXType.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1063Test() {
        FIXType fix1063UndlyInstrumentPartySubID = FIXType.UNDLY_INSTRUMENT_PARTY_SUB_ID;
    }
    @Test
    void FIX1064Test() {
        FIXType fix1064UndlyInstrumentPartySubIDType = FIXType.UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1065Test() {
        FIXType fix1065BidSwapPoints = FIXType.BID_SWAP_POINTS;
    }
    @Test
    void FIX1066Test() {
        FIXType fix1066OfferSwapPoints = FIXType.OFFER_SWAP_POINTS;
    }
    @Test
    void FIX1067Test() {
        FIXType fix1067LegBidForwardPoints = FIXType.LEG_BID_FORWARD_POINTS;
    }
    @Test
    void FIX1068Test() {
        FIXType fix1068LegOfferForwardPoints = FIXType.LEG_OFFER_FORWARD_POINTS;
    }
    @Test
    void FIX1069Test() {
        FIXType fix1069SwapPoints = FIXType.SWAP_POINTS;
    }
    @Test
    void FIX1070Test() {
        FIXType fix1070MDQuoteType = FIXType.MD_QUOTE_TYPE;
    }
    @Test
    void FIX1071Test() {
        FIXType fix1071LastSwapPoints = FIXType.LAST_SWAP_POINTS;
    }
    @Test
    void FIX1072Test() {
        FIXType fix1072SideGrossTradeAmt = FIXType.SIDE_GROSS_TRADE_AMT;
    }
    @Test
    void FIX1073Test() {
        FIXType fix1073LegLastForwardPoints = FIXType.LEG_LAST_FORWARD_POINTS;
    }
    @Test
    void FIX1074Test() {
        FIXType fix1074LegCalculatedCcyLastQty = FIXType.LEG_CALCULATED_CCY_LAST_QTY;
    }
    @Test
    void FIX1075Test() {
        FIXType fix1075LegGrossTradeAmt = FIXType.LEG_GROSS_TRADE_AMT;
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
        FIXType fix1079MaturityTime = FIXType.MATURITY_TIME;
    }
    @Test
    void FIX1080Test() {
        FIXType fix1080RefOrderID = FIXType.REF_ORDER_ID;
    }
    @Test
    void FIX1081Test() {
        FIXType fix1081RefOrderIDSource = FIXType.REF_ORDER_ID_SOURCE;
    }
    @Test
    void FIX1082Test() {
        FIXType fix1082SecondaryDisplayQty = FIXType.SECONDARY_DISPLAY_QTY;
    }
    @Test
    void FIX1083Test() {
        FIXType fix1083DisplayWhen = FIXType.DISPLAY_WHEN;
    }
    @Test
    void FIX1084Test() {
        FIXType fix1084DisplayMethod = FIXType.DISPLAY_METHOD;
    }
    @Test
    void FIX1085Test() {
        FIXType fix1085DisplayLowQty = FIXType.DISPLAY_LOW_QTY;
    }
    @Test
    void FIX1086Test() {
        FIXType fix1086DisplayHighQty = FIXType.DISPLAY_HIGH_QTY;
    }
    @Test
    void FIX1087Test() {
        FIXType fix1087DisplayMinIncr = FIXType.DISPLAY_MIN_INCR;
    }
    @Test
    void FIX1088Test() {
        FIXType fix1088RefreshQty = FIXType.REFRESH_QTY;
    }
    @Test
    void FIX1089Test() {
        FIXType fix1089MatchIncrement = FIXType.MATCH_INCREMENT;
    }
    @Test
    void FIX1090Test() {
        FIXType fix1090MaxPriceLevels = FIXType.MAX_PRICE_LEVELS;
    }
    @Test
    void FIX1091Test() {
        FIXType fix1091PreTradeAnonymity = FIXType.PRE_TRADE_ANONYMITY;
    }
    @Test
    void FIX1092Test() {
        FIXType fix1092PriceProtectionScope = FIXType.PRICE_PROTECTION_SCOPE;
    }
    @Test
    void FIX1093Test() {
        FIXType fix1093LotType = FIXType.LOT_TYPE;
    }
    @Test
    void FIX1094Test() {
        FIXType fix1094PegPriceType = FIXType.PEG_PRICE_TYPE;
    }
    @Test
    void FIX1095Test() {
        FIXType fix1095PeggedRefPrice = FIXType.PEGGED_REF_PRICE;
    }
    @Test
    void FIX1096Test() {
        FIXType fix1096PegSecurityIDSource = FIXType.PEG_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX1097Test() {
        FIXType fix1097PegSecurityID = FIXType.PEG_SECURITY_ID;
    }
    @Test
    void FIX1098Test() {
        FIXType fix1098PegSymbol = FIXType.PEG_SYMBOL;
    }
    @Test
    void FIX1099Test() {
        FIXType fix1099PegSecurityDesc = FIXType.PEG_SECURITY_DESC;
    }
    @Test
    void FIX1100Test() {
        FIXType fix1100TriggerType = FIXType.TRIGGER_TYPE;
    }
    @Test
    void FIX1101Test() {
        FIXType fix1101TriggerAction = FIXType.TRIGGER_ACTION;
    }
    @Test
    void FIX1102Test() {
        FIXType fix1102TriggerPrice = FIXType.TRIGGER_PRICE;
    }
    @Test
    void FIX1103Test() {
        FIXType fix1103TriggerSymbol = FIXType.TRIGGER_SYMBOL;
    }
    @Test
    void FIX1104Test() {
        FIXType fix1104TriggerSecurityID = FIXType.TRIGGER_SECURITY_ID;
    }
    @Test
    void FIX1105Test() {
        FIXType fix1105TriggerSecurityIDSource = FIXType.TRIGGER_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX1106Test() {
        FIXType fix1106TriggerSecurityDesc = FIXType.TRIGGER_SECURITY_DESC;
    }
    @Test
    void FIX1107Test() {
        FIXType fix1107TriggerPriceType = FIXType.TRIGGER_PRICE_TYPE;
    }
    @Test
    void FIX1108Test() {
        FIXType fix1108TriggerPriceTypeScope = FIXType.TRIGGER_PRICE_TYPE_SCOPE;
    }
    @Test
    void FIX1109Test() {
        FIXType fix1109TriggerPriceDirection = FIXType.TRIGGER_PRICE_DIRECTION;
    }
    @Test
    void FIX1110Test() {
        FIXType fix1110TriggerNewPrice = FIXType.TRIGGER_NEW_PRICE;
    }
    @Test
    void FIX1111Test() {
        FIXType fix1111TriggerOrderType = FIXType.TRIGGER_ORDER_TYPE;
    }
    @Test
    void FIX1112Test() {
        FIXType fix1112TriggerNewQty = FIXType.TRIGGER_NEW_QTY;
    }
    @Test
    void FIX1113Test() {
        FIXType fix1113TriggerTradingSessionID = FIXType.TRIGGER_TRADING_SESSION_ID;
    }
    @Test
    void FIX1114Test() {
        FIXType fix1114TriggerTradingSessionSubID = FIXType.TRIGGER_TRADING_SESSION_SUB_ID;
    }
    @Test
    void FIX1115Test() {
        FIXType fix1115OrderCategory = FIXType.ORDER_CATEGORY;
    }
    @Test
    void FIX1116Test() {
        FIXType fix1116NoRootPartyIDs = FIXType.NO_ROOT_PARTY_IDS;
    }
    @Test
    void FIX1117Test() {
        FIXType fix1117RootPartyID = FIXType.ROOT_PARTY_ID;
    }
    @Test
    void FIX1118Test() {
        FIXType fix1118RootPartyIDSource = FIXType.ROOT_PARTY_ID_SOURCE;
    }
    @Test
    void FIX1119Test() {
        FIXType fix1119RootPartyRole = FIXType.ROOT_PARTY_ROLE;
    }
    @Test
    void FIX1120Test() {
        FIXType fix1120NoRootPartySubIDs = FIXType.NO_ROOT_PARTY_SUB_IDS;
    }
    @Test
    void FIX1121Test() {
        FIXType fix1121RootPartySubID = FIXType.ROOT_PARTY_SUB_ID;
    }
    @Test
    void FIX1122Test() {
        FIXType fix1122RootPartySubIDType = FIXType.ROOT_PARTY_SUB_ID_TYPE;
    }
    @Test
    void FIX1123Test() {
        FIXType fix1123TradeHandlingInstr = FIXType.TRADE_HANDLING_INSTR;
    }
    @Test
    void FIX1124Test() {
        FIXType fix1124OrigTradeHandlingInstr = FIXType.ORIG_TRADE_HANDLING_INSTR;
    }
    @Test
    void FIX1125Test() {
        FIXType fix1125OrigTradeDate = FIXType.ORIG_TRADE_DATE;
    }
    @Test
    void FIX1126Test() {
        FIXType fix1126OrigTradeID = FIXType.ORIG_TRADE_ID;
    }
    @Test
    void FIX1127Test() {
        FIXType fix1127OrigSecondaryTradeID = FIXType.ORIG_SECONDARY_TRADE_ID;
    }
    @Test
    void FIX1128Test() {
        FIXType fix1128ApplVerID = FIXType.APPL_VER_ID;
    }
    @Test
    void FIX1129Test() {
        FIXType fix1129CstmApplVerID = FIXType.CSTM_APPL_VER_ID;
    }
    @Test
    void FIX1130Test() {
        FIXType fix1130RefApplVerID = FIXType.REF_APPL_VER_ID;
    }
    @Test
    void FIX1131Test() {
        FIXType fix1131RefCstmApplVerID = FIXType.REF_CSTM_APPL_VER_ID;
    }
    @Test
    void FIX1132Test() {
        FIXType fix1132TZTransactTime = FIXType.TZ_TRANSACT_TIME;
    }
    @Test
    void FIX1133Test() {
        FIXType fix1133ExDestinationIDSource = FIXType.EX_DESTINATION_ID_SOURCE;
    }
    @Test
    void FIX1134Test() {
        FIXType fix1134ReportedPxDiff = FIXType.REPORTED_PX_DIFF;
    }
    @Test
    void FIX1135Test() {
        FIXType fix1135RptSys = FIXType.RPT_SYS;
    }
    @Test
    void FIX1136Test() {
        FIXType fix1136AllocClearingFeeIndicator = FIXType.ALLOC_CLEARING_FEE_INDICATOR;
    }
    @Test
    void FIX1137Test() {
        FIXType fix1137DefaultApplVerID = FIXType.DEFAULT_APPL_VER_ID;
    }
    @Test
    void FIX1138Test() {
        FIXType fix1138DisplayQty = FIXType.DISPLAY_QTY;
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
