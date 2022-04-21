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
 * FIX43 enum defines all the Financial Exchange Protocol's (FIX) fields.
 * It consists of 3 fields.
 *
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Prootocol document.
 *                      There may be a secondary prefix denoting the data type.
 *                      ENU = EnumType field
 *                      AMT = MyAmtType field
 *                      COU = MyCountryType field
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
public enum FIX43 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX4.3 as defined by the FIX Protocol Specification 4.3
     *  Tags: 447-659
     */
    FIX447_ENU_PARTY_ID_SOURCE(447, "PARTY_ID_SOURCE", "PartyIDSource"),
    FIX448_STR_PARTY_ID(448, "PARTY_ID", "PartyID"),
    FIX449_UTCD_TOTAL_VOLUME_TRADED_DATE(449, "TOTAL_VOLUME_TRADED_DATE", "TotalVolumeTradedDate (replaced)"),
    FIX450_UTCT_TOTAL_VOLUME_TRADED_TIME(450, "TOTAL_VOLUME_TRADED_TIME", "TotalVolumeTradedTime (replaced)"),
    FIX451_PXO_NET_CHG_PREV_DAY(451, "NET_CHG_PREV_DAY", "NetChgPrevDay"),
    FIX452_ENU_PARTY_ROLE(452, "PARTY_ROLE", "PartyRole"),
    FIX453_NUM_NO_PARTY_IDS(453, "NO_PARTY_IDS", "NoPartyIDs"),
    FIX454_NUM_NO_SECURITY_ALT_ID(454, "NO_SECURITY_ALT_ID", "NoSecurityAltID"),
    FIX455_STR_SECURITY_ALT_ID(455, "SECURITY_ALT_ID", "SecurityAltID"),
    FIX456_ENU_SECURITY_ALT_ID_SOURCE(456, "SECURITY_ALT_ID_SOURCE", "SecurityAltIDSource"),
    FIX457_NUM_NO_UNDERLYING_SECURITY_ALT_ID(457, "NO_UNDERLYING_SECURITY_ALT_ID", "NoUnderlyingSecurityAltID"),
    FIX458_STR_UNDERLYING_SECURITY_ALT_ID(458, "UNDERLYING_SECURITY_ALT_ID", "UnderlyingSecurityAltID"),
    FIX459_ENU_UNDERLYING_SECURITY_ALT_ID_SOURCE(459, "UNDERLYING_SECURITY_ALT_ID_SOURCE", "UnderlyingSecurityAltIDSource"),
    FIX460_ENU_PRODUCT(460, "PRODUCT", "Product"),

    FIX461_STR_CFI_CODE(461, "CFI_CODE", "CFICode"),
    FIX462_ENU_UNDERLYING_PRODUCT(462, "UNDERLYING_PRODUCT", "UnderlyingProduct"),
    FIX463_STR_UNDERLYING_CFI_CODE(463, "UNDERLYING_CFI_CODE", "UnderlyingCFICode"),
    FIX464_ENU_TEST_MESSAGE_INDICATOR(464, "TEST_MESSAGE_INDICATOR", "TestMessageIndicator"),
    FIX465_ENU_QUANTITY_TYPE(465, "QUANTITY_TYPE", "QuantityType (Deprecated)"),
    FIX466_STR_BOOKING_REF_ID(466, "BOOKING_REF_ID", "BookingRefID"),
    FIX467_STR_INDIVIDUAL_ALLOC_ID(467, "INDIVIDUAL_ALLOC_ID", "IndividualAllocID"),
    FIX468_ENU_ROUNDING_DIRECTION(468, "ROUNDING_DIRECTION", "RoundingDirection"),
    FIX469_FLO_ROUNDING_MODULUS(469, "ROUNDING_MODULUS", "RoundingModulus"),
    FIX470_COU_COUNTRY_OF_ISSUE(470, "COUNTRY_OF_ISSUE", "CountryOfIssue"),

    FIX471_STR_STATE_OR_PROVINCE_OF_ISSUE(471, "STATE_OR_PROVINCE_OF_ISSUE", "StateOrProvinceOfIssue"),
    FIX472_STR_LOCALE_OF_ISSUE(472, "LOCALE_OF_ISSUE", "LocaleOfIssue"),
    FIX473_NUM_NO_REGIST_DTLS(473, "NO_REGIST_DTLS", "NoRegistDtls"),
    FIX474_STR_MAILING_DTLS(474, "MAILING_DTLS", "MailingDtls"),
    FIX475_COU_INVESTOR_COUNTRY_OF_RESIDENCE(475, "INVESTOR_COUNTRY_OF_RESIDENCE", "InvestorCountryOfResidence"),
    FIX476_STR_PAYMENT_REF(476, "PAYMENT_REF", "PaymentRef"),
    FIX477_ENU_DISTRIB_PAYMENT_METHOD(477, "", "DistribPaymentMethod"),
    FIX478_CCY_CASH_DISTRIB_CURR(478, "DISTRIB_PAYMENT_METHOD", "CashDistribCurr"),
    FIX479_CCY_COMM_CURRENCY(479, "COMM_CURRENCY", "CommCurrency"),
    FIX480_ENU_CANCELLATION_RIGHTS(480, "CANCELLATION_RIGHTS", "CancellationRights"),

    FIX481_ENU_MONEY_LAUNDERING_STATUS(481, "MONEY_LAUNDERING_STATUS", "MoneyLaunderingStatus"),
    FIX482_STR_MAILING_INST(482, "MAILING_INST", "MailingInst"),
    FIX483_UTC_TRANS_BKD_TIME(483, "TRANS_BKD_TIME", "TransBkdTime"),
    FIX484_ENU_EXEC_PRICE_TYPE(484, "EXEC_PRICE_TYPE", "ExecPriceType"),
    FIX485_FLO_EXEC_PRICE_ADJUSTMENT(485, "EXEC_PRICE_ADJUSTMENT", "ExecPriceAdjustment"),
    FIX486_LMD_DATE_OF_BIRTH(486, "DATE_OF_BIRTH", "DateOfBirth"),
    FIX487_ENU_TRADE_REPORT_TRANS_TYPE(487, "TRADE_REPORT_TRANS_TYPE", "TradeReportTransType"),
    FIX488_STR_CARD_HOLDER_NAME(488, "CARD_HOLDER_NAME", "CardHolderName"),
    FIX489_STR_CARD_NUMBER(489, "CARD_NUMBER", "CardNumber"),
    FIX490_LMD_CARD_EXP_DATE(490, "CARD_EXP_DATE", "CardExpDate"),

    FIX491_STR_CARD_ISS_NUM(491, "CARD_ISS_NUM", "CardIssNum"),
    FIX492_ENU_PAYMENT_METHOD(492, "PAYMENT_METHOD", "PaymentMethod"),
    FIX493_STR_REGIST_ACCT_TYPE(493, "REGIST_ACCT_TYPE", "RegistAcctType"),
    FIX494_STR_DESIGNATION(494, "DESIGNATION", "Designation"),
    FIX495_ENU_TAX_ADVANTAGE_TYPE(495, "TAX_ADVANTAGE_TYPE", "TaxAdvantageType"),
    FIX496_STR_REGIST_REJ_REASON_TEXT(496, "REGIST_REJ_REASON_TEXT", "RegistRejReasonText"),
    FIX497_ENU_FUND_RENEW_WAIV(497, "FUND_RENEW_WAIV", "FundRenewWaiv"),
    FIX498_STR_CASH_DISTRIB_AGENT_NAME(498, "CASH_DISTRIB_AGENT_NAME", "CashDistribAgentName"),
    FIX499_STR_CASH_DISTRIB_AGENT_CODE(499, "CASH_DISTRIB_AGENT_CODE", "CashDistribAgentCode"),
    FIX500_STR_CASH_DISTRIB_AGENT_ACCT_NUMBER(500, "CASH_DISTRIB_AGENT_ACCT_NUMBER", "CashDistribAgentAcctNumber"),


    // 501-600

    FIX501_STR_CASH_DISTRIB_PAY_REF(501, "CASH_DISTRIB_PAY_REF", "CashDistribPayRef"),
    FIX502_STR_CASH_DISTRIB_AGENT_ACCT_NAME(502, "CASH_DISTRIB_AGENT_ACCT_NAME", "CashDistribAgentAcctName"),
    FIX503_LMD_CARD_START_DATE(503, "CARD_START_DATE", "CardStartDate"),
    FIX504_LMD_PAYMENT_DATE(504, "PAYMENT_DATE", "PaymentDate"),
    FIX505_STR_PAYMENT_REMITTER_ID(505, "PAYMENT_REMITTER_ID", "PaymentRemitterID"),
    FIX506_ENU_REGIST_STATUS(506, "REGIST_STATUS", "RegistStatus"),
    FIX507_ENU_REGIST_REJ_REASON_CODE(507, "REGIST_REJ_REASON_CODE", "RegistRejReasonCode"),
    FIX508_STR_REGIST_REF_ID(508, "REGIST_REF_ID", "RegistRefID"),
    FIX509_STR_REGIST_DTLS(509, "REGIST_DTLS", "RegistDtls"),
    FIX510_NUM_NO_DISTRIB_INSTS(510, "NO_DISTRIB_INSTS", "NoDistribInsts"),

    FIX511_STR_REGIST_EMAIL(511, "REGIST_EMAIL", "RegistEmail"),
    FIX512_PCT_DISTRIB_PERCENTAGE(512, "DISTRIB_PERCENTAGE", "DistribPercentage"),
    FIX513_STR_REGIST_ID(513, "REGIST_ID", "RegistID"),
    FIX514_ENU_REGIST_TRANS_TYPE(514, "REGIST_TRANS_TYPE", "RegistTransType"),
    FIX515_UTC_EXEC_VALUATION_POINT(515, "EXEC_VALUATION_POINT", "ExecValuationPoint"),
    FIX516_PCT_ORDER_PERCENT(516, "ORDER_PERCENT", "OrderPercent"),
    FIX517_ENU_OWNERSHIP_TYPE(517, "OWNERSHIP_TYPE", "OwnershipType"),
    FIX518_NUM_NO_CONT_AMTS(518, "NO_CONT_AMTS", "NoContAmts"),
    FIX519_ENU_CONT_AMT_TYPE(519, "CONT_AMT_TYPE", "ContAmtType"),
    FIX520_FLO_CONT_AMT_VALUE(520, "CONT_AMT_VALUE", "ContAmtValue"),

    FIX521_CCY_CONT_AMT_CURR(521, "CONT_AMT_CURR", "ContAmtCurr"),
    FIX522_ENU_OWNER_TYPE(522, "OWNER_TYPE", "OwnerType"),
    FIX523_STR_PARTY_SUB_ID(523, "PARTY_SUB_ID", "PartySubID"),
    FIX524_STR_NESTED_PARTY_ID(524, "NESTED_PARTY_ID", "NestedPartyID"),
    FIX525_ENU_NESTED_PARTY_ID_SOURCE(525, "NESTED_PARTY_ID_SOURCE", "NestedPartyIDSource"),
    FIX526_STR_SECONDARY_CL_ORD_ID(526, "SECONDARY_CL_ORD_ID", "SecondaryClOrdID"),
    FIX527_STR_SECONDARY_EXEC_ID(527, "SECONDARY_EXEC_ID", "SecondaryExecID"),
    FIX528_ENU_ORDER_CAPACITY(528, "ORDER_CAPACITY", "OrderCapacity"),
    FIX529_ENU_ORDER_RESTRICTIONS(529, "ORDER_RESTRICTIONS", "OrderRestrictions"),
    FIX530_ENU_MASS_CANCEL_REQUEST_TYPE(530, "MASS_CANCEL_REQUEST_TYPE", "MassCancelRequestType"),

    FIX531_ENU_MASS_CANCEL_RESPONSE(531, "MASS_CANCEL_RESPONSE", "MassCancelResponse"),
    FIX532_ENU_MASS_CANCEL_REJECT_REASON(532, "MASS_CANCEL_REJECT_REASON", "MassCancelRejectReason"),
    FIX533_INT_TOTAL_AFFECTED_ORDERS(533, "TOTAL_AFFECTED_ORDERS", "TotalAffectedOrders"),
    FIX534_INT_NO_AFFECTED_ORDERS(534, "NO_AFFECTED_ORDERS", "NoAffectedOrders"),
    FIX535_STR_AFFECTED_ORDER_ID(535, "AFFECTED_ORDER_ID", "AffectedOrderID"),
    FIX536_STR_AFFECTED_SECONDARY_ORDER_ID(536, "AFFECTED_SECONDARY_ORDER_ID", "AffectedSecondaryOrderID"),
    FIX537_ENU_QUOTE_TYPE(537, "QUOTE_TYPE", "QuoteType"),
    FIX538_ENU_NESTED_PARTY_ROLE(538, "NESTED_PARTY_ROLE", "NestedPartyRole"),
    FIX539_NUM_NO_NESTED_PARTY_IDS(539, "NO_NESTED_PARTY_IDS", "NoNestedPartyIDs"),
    FIX540_AMT_TOTAL_ACCRUED_INTEREST_AMT(540, "TOTAL_ACCRUED_INTEREST_AMT", "TotalAccruedInterestAmt (Deprecated)"),

    FIX541_LMD_MATURITY_DATE(541, "MATURITY_DATE", "MaturityDate"),
    FIX542_LMD_UNDERLYING_MATURITY_DATE(542, "UNDERLYING_MATURITY_DATE", "UnderlyingMaturityDate"),
    FIX543_STR_INSTR_REGISTRY(543, "INSTR_REGISTRY", "InstrRegistry"),
    FIX544_ENU_CASH_MARGIN(544, "CASH_MARGIN", "CashMargin"),
    FIX545_STR_NESTED_PARTY_SUB_ID(545, "NESTED_PARTY_SUB_ID", "NestedPartySubID"),
    FIX546_SCOPE(546, "SCOPE", "Scope"),
    FIX547_ENU_MD_IMPLICIT_DELETE(547, "MD_IMPLICIT_DELETE", "MDImplicitDelete"),
    FIX548_STR_CROSS_ID(548, "CROSS_ID", "CrossID"),
    FIX549_ENU_CROSS_TYPE(549, "CROSS_TYPE", "CrossType"),
    FIX550_ENU_CROSS_PRIORITIZATION(550, "CROSS_PRIORITIZATION", "CrossPrioritization"),

    FIX551_STR_ORIG_CROSS_ID(551, "ORIG_CROSS_ID", "OrigCrossID"),
    FIX552_NUM_NO_SIDES(552, "NO_SIDES", "NoSides"),
    FIX553_STR_PASSWORD(553, "USERNAME", "Username"),
    FIX554_STR_PASSWORD(554, "PASSWORD", "Password"),
    FIX555_NUM_NO_LEGS(555, "NO_LEGS", "NoLegs"),
    FIX556_CCY_LEG_CURRENCY(556, "LEG_CURRENCY", "LegCurrency"),
    FIX557_TOT_NO_SECURITY_TYPES(557, "TOT_NO_SECURITY_TYPES", "TotNoSecurityTypes"),
    FIX558_NUM_NO_SECURITY_TYPES(558, "NO_SECURITY_TYPES", "NoSecurityTypes"),
    FIX559_ENU_SECURITY_LIST_REQUEST_TYPE(559, "SECURITY_LIST_REQUEST_TYPE", "SecurityListRequestType"),
    FIX560_ENU_SECURITY_REQUEST_RESULT(560, "SECURITY_REQUEST_RESULT", "SecurityRequestResult"),

    FIX561_ROUND_LOT(561, "ROUND_LOT", "RoundLot"),
    FIX562_MIN_TRADE_VOL(562, "MIN_TRADE_VOL", "MinTradeVol"),
    FIX563_ENU_MULTI_LEG_RPT_TYPE_REQ(563, "MULTI_LEG_RPT_TYPE_REQ", "MultiLegRptTypeReq"),
    FIX564_ENU_LEG_POSITION_EFFECT(564, "LEG_POSITION_EFFECT", "LegPositionEffect"),
    FIX565_ENU_LEG_COVERED_OR_UNCOVERED(565, "LEG_COVERED_OR_UNCOVERED", "LegCoveredOrUncovered"),
    FIX566_LEG_PRICE(566, "LEG_PRICE", "LegPrice"),
    FIX567_ENU_TRAD_SES_STATUS_REJ_REASON(567, "TRAD_SES_STATUS_REJ_REASON", "TradSesStatusRejReason"),
    FIX568_STR_TRADE_REQUEST_ID(568, "TRADE_REQUEST_ID", "TradeRequestID"),
    FIX569_ENU_TRADE_REQUEST_TYPE(569, "TRADE_REQUEST_TYPE", "TradeRequestType"),
    FIX570_PREVIOUSLY_REPORTED(570, "PREVIOUSLY_REPORTED", "PreviouslyReported"),

    FIX571_STR_TRADE_REPORT_ID(571, "TRADE_REPORT_ID", "TradeReportID"),
    FIX572_STR_TRADE_REPORT_REF_ID(572, "TRADE_REPORT_REF_ID", "TradeReportRefID"),
    FIX573_ENU_MATCH_STATUS(573, "MATCH_STATUS", "MatchStatus"),
    FIX574_ENU_MATCH_TYPE(574, "MATCH_TYPE", "MatchType"),
    FIX575_ENU_ODD_LOT(575, "ODD_LOT", "OddLot"),
    FIX576_NUM_NO_CLEARING_INSTRUCTIONS(576, "NO_CLEARING_INSTRUCTIONS", "NoClearingInstructions"),
    FIX577_ENU_CLEARING_INSTRUCTION(577, "CLEARING_INSTRUCTION", "ClearingInstruction"),
    FIX578_STR_TRADE_INPUT_SOURCE(578, "TRADE_INPUT_SOURCE", "TradeInputSource"),
    FIX579_STR_TRADE_INPUT_DEVICE(579, "TRADE_INPUT_DEVICE", "TradeInputDevice"),
    FIX580_INT_NO_DATES(580, "NO_DATES", "NoDates"),

    FIX581_ENU_ACCOUNT_TYPE(581, "ACCOUNT_TYPE", "AccountType"),
    FIX582_ENU_CUST_ORDER_CAPACITY(582, "CUST_ORDER_CAPACITY", "CustOrderCapacity"),
    FIX583_STR_CL_ORD_LINK_ID(583, "CL_ORD_LINK_ID", "ClOrdLinkID"),
    FIX584_STR_MASS_STATUS_REQ_ID(584, "MASS_STATUS_REQ_ID", "MassStatusReqID"),
    FIX585_ENU_MASS_STATUS_REQ_TYPE(585, "MASS_STATUS_REQ_TYPE", "MassStatusReqType"),
    FIX586_UTC_ORIG_ORD_MOD_TIME(586, "ORIG_ORD_MOD_TIME", "OrigOrdModTime"),
    FIX587_ENU_LEG_SETTL_TYPE(587, "LEG_SETTL_TYPE", "LegSettlType (formerly named LegSettlmntTyp prior to FIX 4.4)"),
    FIX588_LEG_SETTL_DATE(588, "LEG_SETTL_DATE", "LegSettlDate (formerly named LegFutSettlDate prior to FIX 4.4)"),
    FIX589_ENU_DAY_BOOKING_INST(589, "DAY_BOOKING_INST", "DayBookingInst"),
    FIX590_ENU_BOOKING_UNIT(590, "BOOKING_UNIT", "BookingUnit"),

    FIX591_ENU_PREALLOC_METHOD(591, "PREALLOC_METHOD", "PreallocMethod"),
    FIX592_COU_UNDERLYING_COUNTRY_OF_ISSUE(592, "UNDERLYING_COUNTRY_OF_ISSUE", "UnderlyingCountryOfIssue"),
    FIX593_STR_UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE(593, "UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE", "UnderlyingStateOrProvinceOfIssue"),
    FIX594_STR_UNDERLYING_LOCALE_OF_ISSUE(594, "UNDERLYING_LOCALE_OF_ISSUE", "UnderlyingLocaleOfIssue"),
    FIX595_STR_UNDERLYING_INSTR_REGISTRY(595, "UNDERLYING_INSTR_REGISTRY", "UnderlyingInstrRegistry"),
    FIX596_COU_LEG_COUNTRY_OF_ISSUE(596, "LEG_COUNTRY_OF_ISSUE", "LegCountryOfIssue"),
    FIX597_STR_LEG_STATE_OR_PROVINCE_OF_ISSUE(597, "LEG_STATE_OR_PROVINCE_OF_ISSUE", "LegStateOrProvinceOfIssue"),
    FIX598_STR_LEG_LOCALE_OF_ISSUE(598, "LEG_LOCALE_OF_ISSUE", "LegLocaleOfIssue"),
    FIX599_STR_LEG_INSTR_REGISTRY(599, "LEG_INSTR_REGISTRY", "LegInstrRegistry"),
    FIX600_STR_LEG_SYMBOL(600, "LEG_SYMBOL", "LegSymbol"),


    // 601-700

    FIX601_ENU_LEG_SYMBOL_SFX(601, "LEG_SYMBOL_SFX", "LegSymbolSfx"),
    FIX602_STR_LEG_SECURITY_ID(602, "LEG_SECURITY_ID", "LegSecurityID"),
    FIX603_ENU_LEG_SECURITY_ID_SOURCE(603, "LEG_SECURITY_ID_SOURCE", "LegSecurityIDSource"),
    FIX604_NO_LEG_SECURITY_ALT_ID(604, "NO_LEG_SECURITY_ALT_ID", "NoLegSecurityAltID"),
    FIX605_STR_LEG_SECURITY_ALT_ID(605, "LEG_SECURITY_ALT_ID", "LegSecurityAltID"),
    FIX606_ENU_LEG_SECURITY_ALT_ID_SOURCE(606, "LEG_SECURITY_ALT_ID_SOURCE", "LegSecurityAltIDSource"),
    FIX607_ENU_LEG_PRODUCT(607, "LEG_PRODUCT", "LegProduct"),
    FIX608_STR_LEG_CFI_CODE(608, "LEG_CFI_CODE", "LegCFICode"),
    FIX609_ENU_LEG_SECURITY_TYPE(609, "LEG_SECURITY_TYPE", "LegSecurityType"),
    FIX610_LEG_MATURITY_MONTH_YEAR(610, "LEG_MATURITY_MONTH_YEAR", "LegMaturityMonthYear"),

    FIX611_LMD_LEG_MATURITY_DATE(611, "LEG_MATURITY_DATE", "LegMaturityDate"),
    FIX612_LEG_STRIKE_PRICE(612, "LEG_STRIKE_PRICE", "LegStrikePrice"),
    FIX613_LEG_OPT_ATTRIBUTE(613, "LEG_OPT_ATTRIBUTE", "LegOptAttribute"),
    FIX614_FLO_LEG_CONTRACT_MULTIPLIER(614, "LEG_CONTRACT_MULTIPLIER", "LegContractMultiplier"),
    FIX615_PCT_LEG_COUPON_RATE(615, "LEG_COUPON_RATE", "LegCouponRate"),
    FIX616_LEG_SECURITY_EXCHANGE(616, "LEG_SECURITY_EXCHANGE", "LegSecurityExchange"),
    FIX617_STR_LEG_ISSUER(617, "LEG_ISSUER", "LegIssuer"),
    FIX618_ENCODED_LEG_ISSUER_LEN(618, "ENCODED_LEG_ISSUER_LEN", "EncodedLegIssuerLen"),
    FIX619_ENCODED_LEG_ISSUER(619, "ENCODED_LEG_ISSUER", "EncodedLegIssuer"),
    FIX620_STR_LEG_SECURITY_DESC(620, "LEG_SECURITY_DESC", "LegSecurityDesc"),

    FIX621_ENCODED_LEG_SECURITY_DESC_LEN(621, "ENCODED_LEG_SECURITY_DESC_LEN", "EncodedLegSecurityDescLen"),
    FIX622_ENCODED_LEG_SECURITY_DESC(622, "ENCODED_LEG_SECURITY_DESC", "EncodedLegSecurityDesc"),
    FIX623_FLO_LEG_RATIO_QTY(623, "LEG_RATIO_QTY", "LegRatioQty"),
    FIX624_ENU_LEG_SIDE(624, "LEG_SIDE", "LegSide"),
    FIX625_STR_TRADING_SESSION_SUB_ID(625, "TRADING_SESSION_SUB_ID", "TradingSessionSubID"),
    FIX626_ENU_ALLOC_TYPE(626, "ALLOC_TYPE", "AllocType"),
    FIX627_NUM_NO_HOPS(627, "NO_HOPS", "NoHops"),
    FIX628_STR_HOP_COMP_ID(628, "HOP_COMP_ID", "HopCompID"),
    FIX629_UTC_HOP_SENDING_TIME(629, "HOP_SENDING_TIME", "HopSendingTime"),
    FIX630_HOP_REF_ID(630, "HOP_REF_ID", "HopRefID"),

    FIX631_MID_PX(631, "MID_PX", "MidPx"),
    FIX632_PCT_BID_YIELD(632, "BID_YIELD", "BidYield"),
    FIX633_PCT_MID_YIELD(633, "MID_YIELD", "MidYield"),
    FIX634_PCT_OFFER_YIELD(634, "OFFER_YIELD", "OfferYield"),
    FIX635_ENU_CLEARING_FEE_INDICATOR(635, "CLEARING_FEE_INDICATOR", "ClearingFeeIndicator"),
    FIX636_ENU_WORKING_INDICATOR(636, "WORKING_INDICATOR", "WorkingIndicator"),
    FIX637_LEG_LAST_PX(637, "LEG_LAST_PX", "LegLastPx"),
    FIX638_ENU_PRIORITY_INDICATOR(638, "PRIORITY_INDICATOR", "PriorityIndicator"),
    FIX639_PXO_PRICE_IMPROVEMENT(639, "PRICE_IMPROVEMENT", "PriceImprovement"),
    FIX640_PRICE_2(640, "PRICE_2", "Price2"),

    FIX641_PXO_LAST_FORWARD_POINTS_2(641, "LAST_FORWARD_POINTS_2", "LastForwardPoints2"),
    FIX642_PXO_BID_FORWARD_POINTS_2(642, "BID_FORWARD_POINTS_2", "BidForwardPoints2"),
    FIX643_PXO_OFFER_FORWARD_POINTS_2(643, "OFFER_FORWARD_POINTS_2", "OfferForwardPoints2"),
    FIX644_STR_RFQ_REQ_ID(644, "RFQ_REQ_ID", "RFQReqID"),
    FIX645_MKT_BID_PX(645, "MKT_BID_PX", "MktBidPx"),
    FIX646_MKT_OFFER_PX(646, "MKT_OFFER_PX", "MktOfferPx"),
    FIX647_MIN_BID_SIZE(647, "MIN_BID_SIZE", "MinBidSize"),
    FIX648_MIN_OFFER_SIZE(648, "MIN_OFFER_SIZE", "MinOfferSize"),
    FIX649_STR_QUOTE_STATUS_REQ_ID(649, "QUOTE_STATUS_REQ_ID", "QuoteStatusReqID"),
    FIX650_ENU_LEGAL_CONFIRM(650, "LEGAL_CONFIRM", "LegalConfirm"),

    FIX651_UNDERLYING_LAST_PX(651, "UNDERLYING_LAST_PX", "UnderlyingLastPx"),
    FIX652_UNDERLYING_LAST_QTY(652, "UNDERLYING_LAST_QTY", "UnderlyingLastQty"),
    FIX653_ENU_SEC_DEF_STATUS(653, "SEC_DEF_STATUS", "SecDefStatus (replaced)"),
    FIX654_STR_LEG_REF_ID(654, "LEG_REF_ID", "LegRefID"),
    FIX655_STR_CONTRA_LEG_REF_ID(655, "CONTRA_LEG_REF_ID", "ContraLegRefID"),
    FIX656_FLO_SETTL_CURR_BID_FX_RATE(656, "SETTL_CURR_BID_FX_RATE", "SettlCurrBidFxRate"),
    FIX657_FLO_SETTL_CURR_OFFER_FX_RATE(657, "SETTL_CURR_OFFER_FX_RATE", "SettlCurrOfferFxRate"),
    FIX658_ENU_QUOTE_REQUEST_REJECT_REASON(658, "QUOTE_REQUEST_REJECT_REASON", "QuoteRequestRejectReason"),
    FIX659_STR_SIDE_COMPLIANCE_ID(659, "SIDE_COMPLIANCE_ID", "SideComplianceID"),
    /*
     *
     * End of FIX4.3
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

    FIX43(final int id, final String name, final String description) {
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
        for (FIX43 oneFIX : FIX43.values()) {
            System.out.println(oneFIX);
        }
    }
}
