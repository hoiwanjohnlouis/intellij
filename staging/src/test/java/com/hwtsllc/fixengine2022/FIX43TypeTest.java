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

public class FIX43TypeTest {
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
     * Start of FIX4.3 as defined by the FIX Protocol Specification 4.3
     *  Tags: 447-659
     */
    @Test
    void FIX0447Test() {
        FIXType fix447PartyIDSource = FIXType.PARTY_ID_SOURCE;
    }
    @Test
    void FIX0448Test() {
        FIXType fix448PartyID = FIXType.PARTY_ID;
    }
    @Test
    void FIX0449Test() {
        FIXType fix449TotalVolumeTradedDate = FIXType.TOTAL_VOLUME_TRADED_DATE;
    }
    @Test
    void FIX0450Test() {
        FIXType fix450TotalVolumeTradedTime = FIXType.TOTAL_VOLUME_TRADED_TIME;
    }
    @Test
    void FIX0451Test() {
        FIXType fix451NetChgPrevDay = FIXType.NET_CHG_PREV_DAY;
    }
    @Test
    void FIX0452Test() {
        FIXType fix452PartyRole = FIXType.PARTY_ROLE;
    }
    @Test
    void FIX0453Test() {
        FIXType fix453NoPartyIDs = FIXType.NO_PARTY_IDS;
    }
    @Test
    void FIX0454Test() {
        FIXType fix454NoSecurityAltID = FIXType.NO_SECURITY_ALT_ID;
    }
    @Test
    void FIX0455Test() {
        FIXType fix455SecurityAltID = FIXType.SECURITY_ALT_ID;
    }
    @Test
    void FIX0456Test() {
        FIXType fix456SecurityAltIDSource = FIXType.SECURITY_ALT_ID_SOURCE;
    }
    @Test
    void FIX0457Test() {
        FIXType fix457NoUnderlyingSecurityAltID = FIXType.NO_UNDERLYING_SECURITY_ALT_ID;
    }
    @Test
    void FIX0458Test() {
        FIXType fix458UnderlyingSecurityAltID = FIXType.UNDERLYING_SECURITY_ALT_ID;
    }
    @Test
    void FIX0459Test() {
        FIXType fix459UnderlyingSecurityAltIDSource = FIXType.UNDERLYING_SECURITY_ALT_ID_SOURCE;
    }
    @Test
    void FIX0460Test() {
        FIXType fix460Product = FIXType.PRODUCT;
    }
    @Test
    void FIX0461Test() {
        FIXType fix461CFICode = FIXType.CFI_CODE;
    }
    @Test
    void FIX0462Test() {
        FIXType fix462UnderlyingProduct = FIXType.UNDERLYING_PRODUCT;
    }
    @Test
    void FIX0463Test() {
        FIXType fix463UnderlyingCFICode = FIXType.UNDERLYING_CFI_CODE;
    }
    @Test
    void FIX0464Test() {
        FIXType fix464TestMessageIndicator = FIXType.TEST_MESSAGE_INDICATOR;
    }
    @Test
    void FIX0465Test() {
        FIXType fix465QuantityType = FIXType.QUANTITY_TYPE;
    }
    @Test
    void FIX0466Test() {
        FIXType fix466BookingRefID = FIXType.BOOKING_REF_ID;
    }
    @Test
    void FIX0467Test() {
        FIXType fix467IndividualAllocID = FIXType.INDIVIDUAL_ALLOC_ID;
    }
    @Test
    void FIX0468Test() {
        FIXType fix468RoundingDirection = FIXType.ROUNDING_DIRECTION;
    }
    @Test
    void FIX0469Test() {
        FIXType fix469RoundingModulus = FIXType.ROUNDING_MODULUS;
    }
    @Test
    void FIX0470Test() {
        FIXType fix470CountryOfIssue = FIXType.COUNTRY_OF_ISSUE;
    }
    @Test
    void FIX0471Test() {
        FIXType fix471StateOrProvinceOfIssue = FIXType.STATE_OR_PROVINCE_OF_ISSUE;
    }
    @Test
    void FIX0472Test() {
        FIXType fix472LocaleOfIssue = FIXType.LOCALE_OF_ISSUE;
    }
    @Test
    void FIX0473Test() {
        FIXType fix473NoRegistDtls = FIXType.NO_REGIST_DTLS;
    }
    @Test
    void FIX0474Test() {
        FIXType fix474MailingDtls = FIXType.MAILING_DTLS;
    }
    @Test
    void FIX0475Test() {
        FIXType fix475InvestorCountryOfResidence = FIXType.INVESTOR_COUNTRY_OF_RESIDENCE;
    }
    @Test
    void FIX0476Test() {
        FIXType fix476PaymentRef = FIXType.PAYMENT_REF;
    }
    @Test
    void FIX0477Test() {
        FIXType fix477DistribPaymentMethod = FIXType.DISTRIB_PAYMENT_METHOD;
    }
    @Test
    void FIX0478Test() {
        FIXType fix478CashDistribCurr = FIXType.CASH_DISTRIB_CURR;
    }
    @Test
    void FIX0479Test() {
        FIXType fix479CommCurrency = FIXType.COMM_CURRENCY;
    }
    @Test
    void FIX0480Test() {
        FIXType fix480CancellationRights = FIXType.CANCELLATION_RIGHTS;
    }
    @Test
    void FIX0481Test() {
        FIXType fix481MoneyLaunderingStatus = FIXType.MONEY_LAUNDERING_STATUS;
    }
    @Test
    void FIX0482Test() {
        FIXType fix482MailingInst = FIXType.MAILING_INST;
    }
    @Test
    void FIX0483Test() {
        FIXType fix483TransBkdTime = FIXType.TRANS_BKD_TIME;
    }
    @Test
    void FIX0484Test() {
        FIXType fix484ExecPriceType = FIXType.EXEC_PRICE_TYPE;
    }
    @Test
    void FIX0485Test() {
        FIXType fix485ExecPriceAdjustment = FIXType.EXEC_PRICE_ADJUSTMENT;
    }
    @Test
    void FIX0486Test() {
        FIXType fix486DateOfBirth = FIXType.DATE_OF_BIRTH;
    }
    @Test
    void FIX0487Test() {
        FIXType fix487TradeReportTransType = FIXType.TRADE_REPORT_TRANS_TYPE;
    }
    @Test
    void FIX0488Test() {
        FIXType fix488CardHolderName = FIXType.CARD_HOLDER_NAME;
    }
    @Test
    void FIX0489Test() {
        FIXType fix489CardNumber = FIXType.CARD_NUMBER;
    }
    @Test
    void FIX0490Test() {
        FIXType fix490CardExpDate = FIXType.CARD_EXP_DATE;
    }
    @Test
    void FIX0491Test() {
        FIXType fix491CardIssNum = FIXType.CARD_ISS_NUM;
    }
    @Test
    void FIX0492Test() {
        FIXType fix492PaymentMethod = FIXType.PAYMENT_METHOD;
    }
    @Test
    void FIX0493Test() {
        FIXType fix493RegistAcctType = FIXType.REGIST_ACCT_TYPE;
    }
    @Test
    void FIX0494Test() {
        FIXType fix494Designation = FIXType.DESIGNATION;
    }
    @Test
    void FIX0495Test() {
        FIXType fix495TaxAdvantageType = FIXType.TAX_ADVANTAGE_TYPE;
    }
    @Test
    void FIX0496Test() {
        FIXType fix496RegistRejReasonText = FIXType.REGIST_REJ_REASON_TEXT;
    }
    @Test
    void FIX0497Test() {
        FIXType fix497FundRenewWaiv = FIXType.FUND_RENEW_WAIV;
    }
    @Test
    void FIX0498Test() {
        FIXType fix498CashDistribAgentName = FIXType.CASH_DISTRIB_AGENT_NAME;
    }
    @Test
    void FIX0499Test() {
        FIXType fix499CashDistribAgentCode = FIXType.CASH_DISTRIB_AGENT_CODE;
    }
    @Test
    void FIX0500Test() {
        FIXType fix500CashDistribAgentAcctNumber = FIXType.CASH_DISTRIB_AGENT_ACCT_NUMBER;
    }
    @Test
    void FIX0501Test() {
        FIXType fix501CashDistribPayRef = FIXType.CASH_DISTRIB_PAY_REF;
    }
    @Test
    void FIX0502Test() {
        FIXType fix502CashDistribAgentAcctName = FIXType.CASH_DISTRIB_AGENT_ACCT_NAME;
    }
    @Test
    void FIX0503Test() {
        FIXType fix503CardStartDate = FIXType.CARD_START_DATE;
    }
    @Test
    void FIX0504Test() {
        FIXType fix504PaymentDate = FIXType.PAYMENT_DATE;
    }
    @Test
    void FIX0505Test() {
        FIXType fix505PaymentRemitterID = FIXType.PAYMENT_REMITTER_ID;
    }
    @Test
    void FIX0506Test() {
        FIXType fix506RegistStatus = FIXType.REGIST_STATUS;
    }
    @Test
    void FIX0507Test() {
        FIXType fix507RegistRejReasonCode = FIXType.REGIST_REJ_REASON_CODE;
    }
    @Test
    void FIX0508Test() {
        FIXType fix508RegistRefID = FIXType.REGIST_REF_ID;
    }
    @Test
    void FIX0509Test() {
        FIXType fix509RegistDtls = FIXType.REGIST_DTLS;
    }
    @Test
    void FIX0510Test() {
        FIXType fix510NoDistribInsts = FIXType.NO_DISTRIB_INSTS;
    }
    @Test
    void FIX0511Test() {
        FIXType fix511RegistEmail = FIXType.REGIST_EMAIL;
    }
    @Test
    void FIX0512Test() {
        FIXType fix512DistribPercentage = FIXType.DISTRIB_PERCENTAGE;
    }
    @Test
    void FIX0513Test() {
        FIXType fix513RegistID = FIXType.REGIST_ID;
    }
    @Test
    void FIX0514Test() {
        FIXType fix514RegistTransType = FIXType.REGIST_TRANS_TYPE;
    }
    @Test
    void FIX0515Test() {
        FIXType fix515ExecValuationPoint = FIXType.EXEC_VALUATION_POINT;
    }
    @Test
    void FIX0516Test() {
        FIXType fix516OrderPercent = FIXType.ORDER_PERCENT;
    }
    @Test
    void FIX0517Test() {
        FIXType fix517OwnershipType = FIXType.OWNERSHIP_TYPE;
    }
    @Test
    void FIX0518Test() {
        FIXType fix518NoContAmts = FIXType.NO_CONT_AMTS;
    }
    @Test
    void FIX0519Test() {
        FIXType fix519ContAmtType = FIXType.CONT_AMT_TYPE;
    }
    @Test
    void FIX0520Test() {
        FIXType fix520ContAmtValue = FIXType.CONT_AMT_VALUE;
    }
    @Test
    void FIX0521Test() {
        FIXType fix521ContAmtCurr = FIXType.CONT_AMT_CURR;
    }
    @Test
    void FIX0522Test() {
        FIXType fix522OwnerType = FIXType.OWNER_TYPE;
    }
    @Test
    void FIX0523Test() {
        FIXType fix523PartySubID = FIXType.PARTY_SUB_ID;
    }
    @Test
    void FIX0524Test() {
        FIXType fix524NestedPartyID = FIXType.NESTED_PARTY_ID;
    }
    @Test
    void FIX0525Test() {
        FIXType fix525NestedPartyIDSource = FIXType.NESTED_PARTY_ID_SOURCE;
    }
    @Test
    void FIX0526Test() {
        FIXType fix526SecondaryClOrdID = FIXType.SECONDARY_CL_ORD_ID;
    }
    @Test
    void FIX0527Test() {
        FIXType fix527SecondaryExecID = FIXType.SECONDARY_EXEC_ID;
    }
    @Test
    void FIX0528Test() {
        FIXType fix528OrderCapacity = FIXType.ORDER_CAPACITY;
    }
    @Test
    void FIX0529Test() {
        FIXType fix529OrderRestrictions = FIXType.ORDER_RESTRICTIONS;
    }
    @Test
    void FIX0530Test() {
        FIXType fix530MassCancelRequestType = FIXType.MASS_CANCEL_REQUEST_TYPE;
    }
    @Test
    void FIX0531Test() {
        FIXType fix531MassCancelResponse = FIXType.MASS_CANCEL_RESPONSE;
    }
    @Test
    void FIX0532Test() {
        FIXType fix532MassCancelRejectReason = FIXType.MASS_CANCEL_REJECT_REASON;
    }
    @Test
    void FIX0533Test() {
        FIXType fix533TotalAffectedOrders = FIXType.TOTAL_AFFECTED_ORDERS;
    }
    @Test
    void FIX0534Test() {
        FIXType fix534NoAffectedOrders = FIXType.NO_AFFECTED_ORDERS;
    }
    @Test
    void FIX0535Test() {
        FIXType fix535AffectedOrderID = FIXType.AFFECTED_ORDER_ID;
    }
    @Test
    void FIX0536Test() {
        FIXType fix536AffectedSecondaryOrderID = FIXType.AFFECTED_SECONDARY_ORDER_ID;
    }
    @Test
    void FIX0537Test() {
        FIXType fix537QuoteType = FIXType.QUOTE_TYPE;
    }
    @Test
    void FIX0538Test() {
        FIXType fix538NestedPartyRole = FIXType.NESTED_PARTY_ROLE;
    }
    @Test
    void FIX0539Test() {
        FIXType fix539NoNestedPartyIDs = FIXType.NO_NESTED_PARTY_IDS;
    }
    @Test
    void FIX0540Test() {
        FIXType fix540TotalAccruedInterestAmt = FIXType.TOTAL_ACCRUED_INTEREST_AMT;
    }
    @Test
    void FIX0541Test() {
        FIXType fix541MaturityDate = FIXType.MATURITY_DATE;
    }
    @Test
    void FIX0542Test() {
        FIXType fix542UnderlyingMaturityDate = FIXType.UNDERLYING_MATURITY_DATE;
    }
    @Test
    void FIX0543Test() {
        FIXType fix543InstrRegistry = FIXType.INSTR_REGISTRY;
    }
    @Test
    void FIX0544Test() {
        FIXType fix544CashMargin = FIXType.CASH_MARGIN;
    }
    @Test
    void FIX0545Test() {
        FIXType fix545NestedPartySubID = FIXType.NESTED_PARTY_SUB_ID;
    }
    @Test
    void FIX0546Test() {
        FIXType fix546Scope = FIXType.SCOPE;
    }
    @Test
    void FIX0547Test() {
        FIXType fix547MDImplicitDelete = FIXType.MD_IMPLICIT_DELETE;
    }
    @Test
    void FIX0548Test() {
        FIXType fix548CrossID = FIXType.CROSS_ID;
    }
    @Test
    void FIX0549Test() {
        FIXType fix549CrossType = FIXType.CROSS_TYPE;
    }
    @Test
    void FIX0550Test() {
        FIXType fix550CrossPrioritization = FIXType.CROSS_PRIORITIZATION;
    }
    @Test
    void FIX0551Test() {
        FIXType fix551OrigCrossID = FIXType.ORIG_CROSS_ID;
    }
    @Test
    void FIX0552Test() {
        FIXType fix552NoSides = FIXType.NO_SIDES;
    }
    @Test
    void FIX0555Test() {
        FIXType fix555NoLegs = FIXType.NO_LEGS;
    }
    @Test
    void FIX0556Test() {
        FIXType fix556LegCurrency = FIXType.LEG_CURRENCY;
    }
    @Test
    void FIX0557Test() {
        FIXType fix557TotNoSecurityTypes = FIXType.TOT_NO_SECURITY_TYPES;
    }
    @Test
    void FIX0558Test() {
        FIXType fix558NoSecurityTypes = FIXType.NO_SECURITY_TYPES;
    }
    @Test
    void FIX0559Test() {
        FIXType fix559SecurityListRequestType = FIXType.SECURITY_LIST_REQUEST_TYPE;
    }
    @Test
    void FIX0560Test() {
        FIXType fix560SecurityRequestResult = FIXType.SECURITY_REQUEST_RESULT;
    }
    @Test
    void FIX0561Test() {
        FIXType fix561RoundLot = FIXType.ROUND_LOT;
    }
    @Test
    void FIX0562Test() {
        FIXType fix562MinTradeVol = FIXType.MIN_TRADE_VOL;
    }
    @Test
    void FIX0563Test() {
        FIXType fix563MultiLegRptTypeReq = FIXType.MULTI_LEG_RPT_TYPE_REQ;
    }
    @Test
    void FIX0564Test() {
        FIXType fix564LegPositionEffect = FIXType.LEG_POSITION_EFFECT;
    }
    @Test
    void FIX0565Test() {
        FIXType fix565LegCoveredOrUncovered = FIXType.LEG_COVERED_OR_UNCOVERED;
    }
    @Test
    void FIX0566Test() {
        FIXType fix566LegPrice = FIXType.LEG_PRICE;
    }
    @Test
    void FIX0567Test() {
        FIXType fix567TradSesStatusRejReason = FIXType.TRAD_SES_STATUS_REJ_REASON;
    }
    @Test
    void FIX0568Test() {
        FIXType fix568TradeRequestID = FIXType.TRADE_REQUEST_ID;
    }
    @Test
    void FIX0569Test() {
        FIXType fix569TradeRequestType = FIXType.TRADE_REQUEST_TYPE;
    }
    @Test
    void FIX0570Test() {
        FIXType fix570PreviouslyReported = FIXType.PREVIOUSLY_REPORTED;
    }
    @Test
    void FIX0571Test() {
        FIXType fix571TradeReportID = FIXType.TRADE_REPORT_ID;
    }
    @Test
    void FIX0572Test() {
        FIXType fix572TradeReportRefID = FIXType.TRADE_REPORT_REF_ID;
    }
    @Test
    void FIX0573Test() {
        FIXType fix573MatchStatus = FIXType.MATCH_STATUS;
    }
    @Test
    void FIX0574Test() {
        FIXType fix574MatchType = FIXType.MATCH_TYPE;
    }
    @Test
    void FIX0575Test() {
        FIXType fix575OddLot = FIXType.ODD_LOT;
    }
    @Test
    void FIX0576Test() {
        FIXType fix576NoClearingInstructions = FIXType.NO_CLEARING_INSTRUCTIONS;
    }
    @Test
    void FIX0577Test() {
        FIXType fix577ClearingInstruction = FIXType.CLEARING_INSTRUCTION;
    }
    @Test
    void FIX0578Test() {
        FIXType fix578TradeInputSource = FIXType.TRADE_INPUT_SOURCE;
    }
    @Test
    void FIX0579Test() {
        FIXType fix579TradeInputDevice = FIXType.TRADE_INPUT_DEVICE;
    }
    @Test
    void FIX0580Test() {
        FIXType fix580NoDates = FIXType.NO_DATES;
    }
    @Test
    void FIX0581Test() {
        FIXType fix581AccountType = FIXType.ACCOUNT_TYPE;
    }
    @Test
    void FIX0582Test() {
        FIXType fix582CustOrderCapacity = FIXType.CUST_ORDER_CAPACITY;
    }
    @Test
    void FIX0583Test() {
        FIXType fix583ClOrdLinkID = FIXType.CL_ORD_LINK_ID;
    }
    @Test
    void FIX0584Test() {
        FIXType fix584MassStatusReqID = FIXType.MASS_STATUS_REQ_ID;
    }
    @Test
    void FIX0585Test() {
        FIXType fix585MassStatusReqType = FIXType.MASS_STATUS_REQ_TYPE;
    }
    @Test
    void FIX0586Test() {
        FIXType fix586OrigOrdModTime = FIXType.ORIG_ORD_MOD_TIME;
    }
    @Test
    void FIX0587Test() {
        FIXType fix587LegSettlType = FIXType.LEG_SETTL_TYPE;
    }
    @Test
    void FIX0588Test() {
        FIXType fix588LegSettlDate = FIXType.LEG_SETTL_DATE;
    }
    @Test
    void FIX0589Test() {
        FIXType fix589DayBookingInst = FIXType.DAY_BOOKING_INST;
    }
    @Test
    void FIX0590Test() {
        FIXType fix590BookingUnit = FIXType.BOOKING_UNIT;
    }
    @Test
    void FIX0591Test() {
        FIXType fix591PreallocMethod = FIXType.PREALLOC_METHOD;
    }
    @Test
    void FIX0592Test() {
        FIXType fix592UnderlyingCountryOfIssue = FIXType.UNDERLYING_COUNTRY_OF_ISSUE;
    }
    @Test
    void FIX0593Test() {
        FIXType fix593UnderlyingStateOrProvinceOfIssue = FIXType.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE;
    }
    @Test
    void FIX0594Test() {
        FIXType fix594UnderlyingLocaleOfIssue = FIXType.UNDERLYING_LOCALE_OF_ISSUE;
    }
    @Test
    void FIX0595Test() {
        FIXType fix595UnderlyingInstrRegistry = FIXType.UNDERLYING_INSTR_REGISTRY;
    }
    @Test
    void FIX0596Test() {
        FIXType fix596LegCountryOfIssue = FIXType.LEG_COUNTRY_OF_ISSUE;
    }
    @Test
    void FIX0597Test() {
        FIXType fix597LegStateOrProvinceOfIssue = FIXType.LEG_STATE_OR_PROVINCE_OF_ISSUE;
    }
    @Test
    void FIX0598Test() {
        FIXType fix598LegLocaleOfIssue = FIXType.LEG_LOCALE_OF_ISSUE;
    }
    @Test
    void FIX0599Test() {
        FIXType fix599LegInstrRegistry = FIXType.LEG_INSTR_REGISTRY;
    }
    @Test
    void FIX0600Test() {
        FIXType fix600LegSymbol = FIXType.LEG_SYMBOL;
    }
    @Test
    void FIX0601Test() {
        FIXType fix601LegSymbolSfx = FIXType.LEG_SYMBOL_SFX;
    }
    @Test
    void FIX0602Test() {
        FIXType fix602LegSecurityID = FIXType.LEG_SECURITY_ID;
    }
    @Test
    void FIX0603Test() {
        FIXType fix603LegSecurityIDSource = FIXType.LEG_SECURITY_ID_SOURCE;
    }
    @Test
    void FIX0604Test() {
        FIXType fix604NoLegSecurityAltID = FIXType.NO_LEG_SECURITY_ALT_ID;
    }
    @Test
    void FIX0605Test() {
        FIXType fix605LegSecurityAltID = FIXType.LEG_SECURITY_ALT_ID;
    }
    @Test
    void FIX0606Test() {
        FIXType fix606LegSecurityAltIDSource = FIXType.LEG_SECURITY_ALT_ID_SOURCE;
    }
    @Test
    void FIX0607Test() {
        FIXType fix607LegProduct = FIXType.LEG_PRODUCT;
    }
    @Test
    void FIX0608Test() {
        FIXType fix608LegCFICode = FIXType.LEG_CFI_CODE;
    }
    @Test
    void FIX0609Test() {
        FIXType fix609LegSecurityType = FIXType.LEG_SECURITY_TYPE;
    }
    @Test
    void FIX0610Test() {
        FIXType fix610LegMaturityMonthYear = FIXType.LEG_MATURITY_MONTH_YEAR;
    }
    @Test
    void FIX0611Test() {
        FIXType fix611LegMaturityDate = FIXType.LEG_MATURITY_DATE;
    }
    @Test
    void FIX0612Test() {
        FIXType fix612LegStrikePrice = FIXType.LEG_STRIKE_PRICE;
    }
    @Test
    void FIX0613Test() {
        FIXType fix613LegOptAttribute = FIXType.LEG_OPT_ATTRIBUTE;
    }
    @Test
    void FIX0614Test() {
        FIXType fix614LegContractMultiplier = FIXType.LEG_CONTRACT_MULTIPLIER;
    }
    @Test
    void FIX0615Test() {
        FIXType fix615LegCouponRate = FIXType.LEG_COUPON_RATE;
    }
    @Test
    void FIX0616Test() {
        FIXType fix616LegSecurityExchange = FIXType.LEG_SECURITY_EXCHANGE;
    }
    @Test
    void FIX0617Test() {
        FIXType fix617LegIssuer = FIXType.LEG_ISSUER;
    }
    @Test
    void FIX0618Test() {
        FIXType fix618EncodedLegIssuerLen = FIXType.ENCODED_LEG_ISSUER_LEN;
    }
    @Test
    void FIX0619Test() {
        FIXType fix619EncodedLegIssuer = FIXType.ENCODED_LEG_ISSUER;
    }
    @Test
    void FIX0620Test() {
        FIXType fix620LegSecurityDesc = FIXType.LEG_SECURITY_DESC;
    }
    @Test
    void FIX0621Test() {
        FIXType fix621EncodedLegSecurityDescLen = FIXType.ENCODED_LEG_SECURITY_DESC_LEN;
    }
    @Test
    void FIX0622Test() {
        FIXType fix622EncodedLegSecurityDesc = FIXType.ENCODED_LEG_SECURITY_DESC;
    }
    @Test
    void FIX0623Test() {
        FIXType fix623LegRatioQty = FIXType.LEG_RATIO_QTY;
    }
    @Test
    void FIX0624Test() {
        FIXType fix624LegSide = FIXType.LEG_SIDE;
    }
    @Test
    void FIX0625Test() {
        FIXType fix625TradingSessionSubID = FIXType.TRADING_SESSION_SUB_ID;
    }
    @Test
    void FIX0626Test() {
        FIXType fix626AllocType = FIXType.ALLOC_TYPE;
    }
    @Test
    void FIX0627Test() {
        FIXType fix627NoHops = FIXType.NO_HOPS;
    }
    @Test
    void FIX0628Test() {
        FIXType fix628HopCompID = FIXType.HOP_COMP_ID;
    }
    @Test
    void FIX0629Test() {
        FIXType fix629HopSendingTime = FIXType.HOP_SENDING_TIME;
    }
    @Test
    void FIX0630Test() {
        FIXType fix630HopRefID = FIXType.HOP_REF_ID;
    }
    @Test
    void FIX0631Test() {
        FIXType fix631MidPx = FIXType.MID_PX;
    }
    @Test
    void FIX0632Test() {
        FIXType fix632BidYield = FIXType.BID_YIELD;
    }
    @Test
    void FIX0633Test() {
        FIXType fix633MidYield = FIXType.MID_YIELD;
    }
    @Test
    void FIX0634Test() {
        FIXType fix634OfferYield = FIXType.OFFER_YIELD;
    }
    @Test
    void FIX0635Test() {
        FIXType fix635ClearingFeeIndicator = FIXType.CLEARING_FEE_INDICATOR;
    }
    @Test
    void FIX0636Test() {
        FIXType fix636WorkingIndicator = FIXType.WORKING_INDICATOR;
    }
    @Test
    void FIX0637Test() {
        FIXType fix637LegLastPx = FIXType.LEG_LAST_PX;
    }
    @Test
    void FIX0638Test() {
        FIXType fix638PriorityIndicator = FIXType.PRIORITY_INDICATOR;
    }
    @Test
    void FIX0639Test() {
        FIXType fix639PriceImprovement = FIXType.PRICE_IMPROVEMENT;
    }
    @Test
    void FIX0640Test() {
        FIXType fix640Price2 = FIXType.PRICE_2;
    }
    @Test
    void FIX0641Test() {
        FIXType fix641LastForwardPoints2 = FIXType.LAST_FORWARD_POINTS_2;
    }
    @Test
    void FIX0642Test() {
        FIXType fix642BidForwardPoints2 = FIXType.BID_FORWARD_POINTS_2;
    }
    @Test
    void FIX0643Test() {
        FIXType fix643OfferForwardPoints2 = FIXType.OFFER_FORWARD_POINTS_2;
    }
    @Test
    void FIX0644Test() {
        FIXType fix644RFQReqID = FIXType.RFQ_REQ_ID;
    }
    @Test
    void FIX0645Test() {
        FIXType fix645MktBidPx = FIXType.MKT_BID_PX;
    }
    @Test
    void FIX0646Test() {
        FIXType fix646MktOfferPx = FIXType.MKT_OFFER_PX;
    }
    @Test
    void FIX0647Test() {
        FIXType fix647MinBidSize = FIXType.MIN_BID_SIZE;
    }
    @Test
    void FIX0648Test() {
        FIXType fix648MinOfferSize = FIXType.MIN_OFFER_SIZE;
    }
    @Test
    void FIX0649Test() {
        FIXType fix649QuoteStatusReqID = FIXType.QUOTE_STATUS_REQ_ID;
    }
    @Test
    void FIX0650Test() {
        FIXType fix650LegalConfirm = FIXType.LEGAL_CONFIRM;
    }
    @Test
    void FIX0651Test() {
        FIXType fix651UnderlyingLastPx = FIXType.UNDERLYING_LAST_PX;
    }
    @Test
    void FIX0652Test() {
        FIXType fix652UnderlyingLastQty = FIXType.UNDERLYING_LAST_QTY;
    }
    @Test
    void FIX0653Test() {
        FIXType fix653SecDefStatus = FIXType.SEC_DEF_STATUS;
    }
    @Test
    void FIX0654Test() {
        FIXType fix654LegRefID = FIXType.LEG_REF_ID;
    }
    @Test
    void FIX0655Test() {
        FIXType fix655ContraLegRefID = FIXType.CONTRA_LEG_REF_ID;
    }
    @Test
    void FIX0656Test() {
        FIXType fix656SettlCurrBidFxRate = FIXType.SETTL_CURR_BID_FX_RATE;
    }
    @Test
    void FIX0657Test() {
        FIXType fix657SettlCurrOfferFxRate = FIXType.SETTL_CURR_OFFER_FX_RATE;
    }
    @Test
    void FIX0658Test() {
        FIXType fix658QuoteRequestRejectReason = FIXType.QUOTE_REQUEST_REJECT_REASON;
    }
    @Test
    void FIX0659Test() {
        FIXType fix659SideComplianceID = FIXType.SIDE_COMPLIANCE_ID;
    }
    /*
     *
     * END of complete FIX43 tags
     *
     */

}
