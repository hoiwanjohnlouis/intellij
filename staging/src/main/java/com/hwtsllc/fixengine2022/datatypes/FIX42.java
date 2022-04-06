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
 * FIX42 enum defines all the Financial Exchange Protocol's (FIX) fields.
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
public enum FIX42 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX4.2 as defined by the FIX Protocol Specification 4.2
     *  Tags: 212-446
     */
    FIX212_XML_DATA_LEN(212, "XML_DATA_LEN", "XmlDataLen"),
    FIX213_XML_DATA(213, "XML_DATA", "XmlData"),
    FIX214_SETTL_INST_REF_ID(214, "SETTL_INST_REF_ID", "SettlInstRefID"),
    FIX215_NO_ROUTING_IDS(215, "NO_ROUTING_IDS", "NoRoutingIDs"),
    FIX216_ROUTING_TYPE(216, "ROUTING_TYPE", "RoutingType"),
    FIX217_ROUTING_ID(217, "ROUTING_ID", "RoutingID"),
    FIX218_SPREAD_TO_BENCHMARK(218, "SPREAD_TO_BENCHMARK", "SpreadToBenchmark"),
    FIX219_BENCHMARK(219, "BENCHMARK", "Benchmark (no longer used)"),
    FIX220_BENCHMARK_CURVE_CURRENCY(220, "BENCHMARK_CURVE_CURRENCY", "BenchmarkCurveCurrency"),

    FIX221_BENCHMARK_CURVE_NAME(221, "BENCHMARK_CURVE_NAME", "BenchmarkCurveName"),
    FIX222_BENCHMARK_CURVE_POINT(222, "BENCHMARK_CURVE_POINT", "BenchmarkCurvePoint"),
    FIX223_COUPON_RATE(223, "COUPON_RATE", "CouponRate"),
    FIX224_COUPON_PAYMENT_DATE(224, "COUPON_PAYMENT_DATE", "CouponPaymentDate"),
    FIX225_ISSUE_DATE(225, "ISSUE_DATE", "IssueDate"),
    FIX226_REPURCHASE_TERM(226, "REPURCHASE_TERM", "RepurchaseTerm (Deprecated)"),
    FIX227_REPURCHASE_RATE(227, "REPURCHASE_RATE", "RepurchaseRate (Deprecated)"),
    FIX228_FACTOR(228, "FACTOR", "Factor"),
    FIX229_TRADE_ORIGINATION_DATE(229, "TRADE_ORIGINATION_DATE", "TradeOriginationDate"),
    FIX230_EX_DATE(230, "EX_DATE", "ExDate"),

    FIX231_CONTRACT_MULTIPLIER(231, "CONTRACT_MULTIPLIER", "ContractMultiplier"),
    FIX232_NO_STIPULATIONS(232, "NO_STIPULATIONS", "NoStipulations"),
    FIX233_STIPULATION_TYPE(233, "STIPULATION_TYPE", "StipulationType"),
    FIX234_STIPULATION_VALUE(234, "STIPULATION_VALUE", "StipulationValue"),
    FIX235_YIELD_TYPE(235, "YIELD_TYPE", "YieldType"),
    FIX236_YIELD(236, "YIELD", "Yield"),
    FIX237_TOTAL_TAKEDOWN(237, "TOTAL_TAKEDOWN", "TotalTakedown"),
    FIX238_CONCESSION(238, "CONCESSION", "Concession"),
    FIX239_REPO_COLLATERAL_SECURITY_TYPE(239, "REPO_COLLATERAL_SECURITY_TYPE", "RepoCollateralSecurityType (Deprecated)"),
    FIX240_REDEMPTION_DATE(240, "REDEMPTION_DATE", "RedemptionDate (Deprecated)"),

    FIX241_UNDERLYING_COUPON_PAYMENT_DATE(241, "UNDERLYING_COUPON_PAYMENT_DATE", "UnderlyingCouponPaymentDate"),
    FIX242_UNDERLYING_ISSUE_DATE(242, "UNDERLYING_ISSUE_DATE", "UnderlyingIssueDate"),
    FIX243_UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE(243, "UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE", "UnderlyingRepoCollateralSecurityType (Deprecated"),
    FIX244_UNDERLYING_REPURCHASE_TERM(244, "UNDERLYING_REPURCHASE_TERM", "UnderlyingRepurchaseTerm (Deprecated)"),
    FIX245_UNDERLYING_REPURCHASE_RATE(245, "UNDERLYING_REPURCHASE_RATE", "UnderlyingRepurchaseRate (Deprecated)"),
    FIX246_UNDERLYING_FACTOR(246, "UNDERLYING_FACTOR", "UnderlyingFactor"),
    FIX247_UNDERLYING_REDEMPTION_DATE(247, "UNDERLYING_REDEMPTION_DATE", "UnderlyingRedemptionDate (Deprecated)"),
    FIX248_LEG_COUPON_PAYMENT_DATE(248, "LEG_COUPON_PAYMENT_DATE", "LegCouponPaymentDate"),
    FIX249_LEG_ISSUE_DATE(249, "LEG_ISSUE_DATE", "LegIssueDate"),
    FIX250_LEG_REPO_COLLATERAL_SECURITY_TYPE(250, "LEG_REPO_COLLATERAL_SECURITY_TYPE", "LegRepoCollateralSecurityType (Deprecated)"),

    FIX251_LEG_REPURCHASE_TERM(251, "LEG_REPURCHASE_TERM", "LegRepurchaseTerm (Deprecated)"),
    FIX252_LEG_REPURCHASE_RATE(252, "LEG_REPURCHASE_RATE", "LegRepurchaseRate (Deprecated)"),
    FIX253_LEG_FACTOR(253, "LEG_FACTOR", "LegFactor"),
    FIX254_LEG_REDEMPTION_DATE(254, "LEG_REDEMPTION_DATE", "LegRedemptionDate (Deprecated)"),
    FIX255_CREDIT_RATING(255, "CREDIT_RATING", "CreditRating"),
    FIX256_UNDERLYING_CREDIT_RATING(256, "UNDERLYING_CREDIT_RATING", "UnderlyingCreditRating"),
    FIX257_LEG_CREDIT_RATING(257, "LEG_CREDIT_RATING", "LegCreditRating"),
    FIX258_TRADED_FLAT_SWITCH(258, "TRADED_FLAT_SWITCH", "TradedFlatSwitch"),
    FIX259_BASIS_FEATURE_DATE(259, "BASIS_FEATURE_DATE", "BasisFeatureDate"),
    FIX260_BASIS_FEATURE_PRICE(260, "BASIS_FEATURE_PRICE", "BasisFeaturePrice"),

    FIX262_MD_REQ_ID(262, "MD_REQ_ID", "MDReqID"),
    FIX263_SUBSCRIPTION_REQUEST_TYPE(263, "SUBSCRIPTION_REQUEST_TYPE", "SubscriptionRequestType"),
    FIX264_MARKET_DEPTH(264, "MARKET_DEPTH", "MarketDepth"),
    FIX265_MD_UPDATE_TYPE(265, "MD_UPDATE_TYPE", "MDUpdateType"),
    FIX266_AGGREGATED_BOOK(266, "AGGREGATED_BOOK", "AggregatedBook"),
    FIX267_NO_MD_ENTRY_TYPES(267, "NO_MD_ENTRY_TYPES", "NoMDEntryTypes"),
    FIX268_NO_MD_ENTRIES(268, "NO_MD_ENTRIES", "NoMDEntries"),
    FIX269_MD_ENTRY_TYPE(269, "MD_ENTRY_TYPE", "MDEntryType"),
    FIX270_MD_ENTRY_PX(270, "MD_ENTRY_PX", "MDEntryPx"),

    FIX271_MD_ENTRY_SIZE(271, "MD_ENTRY_SIZE", "MDEntrySize"),
    FIX272_MD_ENTRY_DATE(272, "MD_ENTRY_DATE", "MDEntryDate"),
    FIX273_MD_ENTRY_TIME(273, "MD_ENTRY_TIME", "MDEntryTime"),
    FIX274_TICK_DIRECTION(274, "TICK_DIRECTION", "TickDirection"),
    FIX275_MD_MKT(275, "MD_MKT", "MDMkt"),
    FIX276_QUOTE_CONDITION(276, "QUOTE_CONDITION", "QuoteCondition"),
    FIX277_TRADE_CONDITION(277, "TRADE_CONDITION", "TradeCondition"),
    FIX278_MD_ENTRY_ID(278, "MD_ENTRY_ID", "MDEntryID"),
    FIX279_MD_UPDATE_ACTION(279, "MD_UPDATE_ACTION", "MDUpdateAction"),
    FIX280_MD_ENTRY_REF_ID(280, "MD_ENTRY_REF_ID", "MDEntryRefID"),

    FIX281_MD_REQ_REJ_REASON(281, "MD_REQ_REJ_REASON", "MDReqRejReason"),
    FIX282_MD_ENTRY_ORIGINATOR(282, "MD_ENTRY_ORIGINATOR", "MDEntryOriginator"),
    FIX283_LOCATION_ID(283, "LOCATION_ID", "LocationID"),
    FIX284_DESK_ID(284, "DESK_ID", "DeskID"),
    FIX285_DELETE_REASON(285, "DELETE_REASON", "DeleteReason"),
    FIX286_OPEN_CLOSE_SETTLE_FLAG(286, "OPEN_CLOSE_SETTLE_FLAG", "OpenCloseSettleFlag"),
    FIX287_SELLER_DAYS(287, "SELLER_DAYS", "SellerDays"),
    FIX288_MD_ENTRY_BUYER(288, "MD_ENTRY_BUYER", "MDEntryBuyer"),
    FIX289_MD_ENTRY_SELLER(289, "MD_ENTRY_SELLER", "MDEntrySeller"),
    FIX290_MD_ENTRY_POSITION_NO(290, "MD_ENTRY_POSITION_NO", "MDEntryPositionNo"),

    FIX291_FINANCIAL_STATUS(291, "FINANCIAL_STATUS", "FinancialStatus"),
    FIX292_CORPORATE_ACTION(292, "CORPORATE_ACTION", "CorporateAction"),
    FIX293_DEF_BID_SIZE(293, "DEF_BID_SIZE", "DefBidSize"),
    FIX294_DEF_OFFER_SIZE(294, "DEF_OFFER_SIZE", "DefOfferSize"),
    FIX295_NO_QUOTE_ENTRIES(295, "NO_QUOTE_ENTRIES", "NoQuoteEntries"),
    FIX296_NO_QUOTE_SETS(296, "NO_QUOTE_SETS", "NoQuoteSets"),
    FIX297_QUOTE_ACK_STATUS(297, "QUOTE_ACK_STATUS", "QuoteAckStatus"),
    FIX298_QUOTE_CANCEL_TYPE(298, "QUOTE_CANCEL_TYPE", "QuoteCancelType"),
    FIX299_QUOTE_ENTRY_ID(299, "QUOTE_ENTRY_ID", "QuoteEntryID"),
    FIX300_QUOTE_REJECT_REASON(300, "QUOTE_REJECT_REASON", "QuoteRejectReason"),


    // 301-400

    FIX301_QUOTE_RESPONSE_LEVEL(301, "QUOTE_RESPONSE_LEVEL", "QuoteResponseLevel"),
    FIX302_QUOTE_SET_ID(302, "QUOTE_SET_ID", "QuoteSetID"),
    FIX303_QUOTE_REQUEST_TYPE(303, "QUOTE_REQUEST_TYPE", "QuoteRequestType"),
    FIX304_TOT_QUOTE_ENTRIES(304, "TOT_QUOTE_ENTRIES", "TotQuoteEntries"),
    FIX305_UNDERLYING_ID_SOURCE(305, "UNDERLYING_ID_SOURCE", "UnderlyingIDSource"),
    FIX306_UNDERLYING_ISSUER(306, "UNDERLYING_ISSUER", "UnderlyingIssuer"),
    FIX307_UNDERLYING_SECURITY_DESC(307, "UNDERLYING_SECURITY_DESC", "UnderlyingSecurityDesc"),
    FIX308_UNDERLYING_SECURITY_EXCHANGE(308, "UNDERLYING_SECURITY_EXCHANGE", "UnderlyingSecurityExchange"),
    FIX309_UNDERLYING_SECURITY_ID(309, "UNDERLYING_SECURITY_ID", "UnderlyingSecurityID"),
    FIX310_UNDERLYING_SECURITY_TYPE(310, "UNDERLYING_SECURITY_TYPE", "UnderlyingSecurityType"),

    FIX311_UNDERLYING_SYMBOL(311, "UNDERLYING_SYMBOL", "UnderlyingSymbol"),
    FIX312_UNDERLYING_SYMBOL_SFX(312, "UNDERLYING_SYMBOL_SFX", "UnderlyingSymbolSfx"),
    FIX313_UNDERLYING_MATURITY_MONTH_YEAR(313, "UNDERLYING_MATURITY_MONTH_YEAR", "UnderlyingMaturityMonthYear"),
    FIX314_UNDERLYING_MATURITY_DAY(314, "UNDERLYING_MATURITY_DAY", "UnderlyingMaturityDay (replaced)"),
    FIX315_UNDERLYING_PUT_OR_CALL(315, "UNDERLYING_PUT_OR_CALL", "UnderlyingPutOrCall (replaced)"),
    FIX316_UNDERLYING_STRIKE_PRICE(316, "UNDERLYING_STRIKE_PRICE", "UnderlyingStrikePrice"),
    FIX317_UNDERLYING_OPT_ATTRIBUTE(317, "UNDERLYING_OPT_ATTRIBUTE", "UnderlyingOptAttribute"),
    FIX318_UNDERLYING_CURRENCY(318, "UNDERLYING_CURRENCY", "UnderlyingCurrency"),
    FIX319_RATIO_QTY(319, "RATIO_QTY", "RatioQty (unused)"),
    FIX320_SECURITY_REQ_ID(320, "SECURITY_REQ_ID", "SecurityReqID"),

    FIX321_SECURITY_REQUEST_TYPE(321, "SECURITY_REQUEST_TYPE", "SecurityRequestType"),
    FIX322_SECURITY_RESPONSE_ID(322, "SECURITY_RESPONSE_ID", "SecurityResponseID"),
    FIX323_SECURITY_RESPONSE_TYPE(323, "SECURITY_RESPONSE_TYPE", "SecurityResponseType"),
    FIX324_SECURITY_STATUS_REQ_ID(324, "SECURITY_STATUS_REQ_ID", "SecurityStatusReqID"),
    FIX325_UNSOLICITED_INDICATOR(325, "UNSOLICITED_INDICATOR", "UnsolicitedIndicator"),
    FIX326_SECURITY_TRADING_STATUS(326, "SECURITY_TRADING_STATUS", "SecurityTradingStatus"),
    FIX327_HALT_REASON(327, "HALT_REASON", "HaltReason"),
    FIX328_IN_VIEW_OF_COMMON(328, "IN_VIEW_OF_COMMON", "InViewOfCommon"),
    FIX329_DUE_TO_RELATED(329, "DUE_TO_RELATED", "DueToRelated"),
    FIX330_BUY_VOLUME(330, "BUY_VOLUME", "BuyVolume"),

    FIX331_SELL_VOLUME(331, "SELL_VOLUME", "SellVolume"),
    FIX332_HIGH_PX(332, "HIGH_PX", "HighPx"),
    FIX333_LOW_PX(333, "LOW_PX", "LowPx"),
    FIX334_ADJUSTMENT(334, "ADJUSTMENT", "Adjustment"),
    FIX335_TRAD_SES_REQ_ID(335, "TRAD_SES_REQ_ID", "TradSesReqID"),
    FIX336_TRADING_SESSION_ID(336, "TRADING_SESSION_ID", "TradingSessionID"),
    FIX337_CONTRA_TRADER(337, "CONTRA_TRADER", "ContraTrader"),
    FIX338_TRAD_SES_METHOD(338, "TRAD_SES_METHOD", "TradSesMethod"),
    FIX339_TRAD_SES_MODE(339, "TRAD_SES_MODE", "TradSesMode"),
    FIX340_TRAD_SES_STATUS(340, "TRAD_SES_STATUS", "TradSesStatus"),

    FIX341_TRAD_SES_START_TIME(341, "TRAD_SES_START_TIME", "TradSesStartTime"),
    FIX342_TRAD_SES_OPEN_TIME(342, "TRAD_SES_OPEN_TIME", "TradSesOpenTime"),
    FIX343_TRAD_SES_PRE_CLOSE_TIME(343, "TRAD_SES_PRE_CLOSE_TIME", "TradSesPreCloseTime"),
    FIX344_TRAD_SES_CLOSE_TIME(344, "TRAD_SES_CLOSE_TIME", "TradSesCloseTime"),
    FIX345_TRAD_SES_END_TIME(345, "TRAD_SES_END_TIME", "TradSesEndTime"),
    FIX346_NUMBER_OF_ORDERS(346, "NUMBER_OF_ORDERS", "NumberOfOrders"),
    FIX347_MESSAGE_ENCODING(347, "MESSAGE_ENCODING", "MessageEncoding"),
    FIX348_ENCODED_ISSUER_LEN(348, "ENCODED_ISSUER_LEN", "EncodedIssuerLen"),
    FIX349_ENCODED_ISSUER(349, "ENCODED_ISSUER", "EncodedIssuer"),
    FIX350_ENCODED_SECURITY_DESC_LEN(350, "ENCODED_SECURITY_DESC_LEN", "EncodedSecurityDescLen"),

    FIX351_ENCODED_SECURITY_DESC(351, "ENCODED_SECURITY_DESC", "EncodedSecurityDesc"),
    FIX352_ENCODED_LIST_EXEC_INST_LEN(352, "ENCODED_LIST_EXEC_INST_LEN", "EncodedListExecInstLen"),
    FIX353_ENCODED_LIST_EXEC_INST(353, "ENCODED_LIST_EXEC_INST", "EncodedListExecInst"),
    FIX354_ENCODED_TEXT_LEN(354, "ENCODED_TEXT_LEN", "EncodedTextLen"),
    FIX355_ENCODED_TEXT(355, "ENCODED_TEXT", "EncodedText"),
    FIX356_ENCODED_SUBJECT_LEN(356, "ENCODED_SUBJECT_LEN", "EncodedSubjectLen"),
    FIX357_ENCODED_SUBJECT(357, "ENCODED_SUBJECT", "EncodedSubject"),
    FIX358_ENCODED_HEADLINE_LEN(358, "ENCODED_HEADLINE_LEN", "EncodedHeadlineLen"),
    FIX359_ENCODED_HEADLINE(359, "ENCODED_HEADLINE", "EncodedHeadline"),
    FIX360_ENCODED_ALLOC_TEXT_LEN(360, "ENCODED_ALLOC_TEXT_LEN", "EncodedAllocTextLen"),

    FIX361_ENCODED_ALLOC_TEXT(361, "ENCODED_ALLOC_TEXT", "EncodedAllocText"),
    FIX362_ENCODED_UNDERLYING_ISSUER_LEN(362, "ENCODED_UNDERLYING_ISSUER_LEN", "EncodedUnderlyingIssuerLen"),
    FIX363_ENCODED_UNDERLYING_ISSUER(363, "ENCODED_UNDERLYING_ISSUER", "EncodedUnderlyingIssuer"),
    FIX364_ENCODED_UNDERLYING_SECURITY_DESC_LEN(364, "ENCODED_UNDERLYING_SECURITY_DESC_LEN", "EncodedUnderlyingSecurityDescLen"),
    FIX365_ENCODED_UNDERLYING_SECURITY_DESC(365, "ENCODED_UNDERLYING_SECURITY_DESC", "EncodedUnderlyingSecurityDesc"),
    FIX366_ALLOC_PRICE(366, "ALLOC_PRICE", "AllocPrice"),
    FIX367_QUOTE_SET_VALID_UNTIL_TIME(367, "QUOTE_SET_VALID_UNTIL_TIME", "QuoteSetValidUntilTime"),
    FIX368_QUOTE_ENTRY_REJECT_REASON(368, "QUOTE_ENTRY_REJECT_REASON", "QuoteEntryRejectReason"),
    FIX369_LAST_MSG_SEQ_NUM_PROCESSED(369, "LAST_MSG_SEQ_NUM_PROCESSED", "LastMsgSeqNumProcessed"),
    FIX370_ON_BEHALF_OF_SENDING_TIME(370, "ON_BEHALF_OF_SENDING_TIME", "OnBehalfOfSendingTime"),

    FIX371_REF_TAG_ID(371, "REF_TAG_ID", "RefTagID"),
    FIX372_REF_MSG_TYPE(372, "REF_MSG_TYPE", "RefMsgType"),
    FIX373_SESSION_REJECT_REASON(373, "SESSION_REJECT_REASON", "SessionRejectReason"),
    FIX374_BID_REQUEST_TRANS_TYPE(374, "BID_REQUEST_TRANS_TYPE", "BidRequestTransType"),
    FIX375_CONTRA_BROKER(375, "CONTRA_BROKER", "ContraBroker"),
    FIX376_COMPLIANCE_ID(376, "COMPLIANCE_ID", "ComplianceID"),
    FIX377_SOLICITED_FLAG(377, "SOLICITED_FLAG", "SolicitedFlag"),
    FIX378_EXEC_RESTATEMENT_REASON(378, "EXEC_RESTATEMENT_REASON", "ExecRestatementReason"),
    FIX379_BUSINESS_REJECT_REF_ID(379, "BUSINESS_REJECT_REF_ID", "BusinessRejectRefID"),
    FIX380_BUSINESS_REJECT_REASON(380, "BUSINESS_REJECT_REASON", "BusinessRejectReason"),

    FIX381_GROSS_TRADE_AMT(381, "GROSS_TRADE_AMT", "GrossTradeAmt"),
    FIX382_NO_CONTRA_BROKERS(382, "NO_CONTRA_BROKERS", "NoContraBrokers"),
    FIX383_MAX_MESSAGE_SIZE(383, "MAX_MESSAGE_SIZE", "MaxMessageSize"),
    FIX384_NO_MSG_TYPES(384, "NO_MSG_TYPES", "NoMsgTypes"),
    FIX385_MSG_DIRECTION(385, "MSG_DIRECTION", "MsgDirection"),
    FIX386_NO_TRADING_SESSIONS(386, "NO_TRADING_SESSIONS", "NoTradingSessions"),
    FIX387_TOTAL_VOLUME_TRADED(387, "TOTAL_VOLUME_TRADED", "TotalVolumeTraded"),
    FIX388_DISCRETION_INST(388, "DISCRETION_INST", "DiscretionInst"),
    FIX389_DISCRETION_OFFSET(389, "DISCRETION_OFFSET", "DiscretionOffset"),
    FIX390_BID_ID(390, "BID_ID", "BidID"),

    FIX391_CLIENT_BID_ID(391, "CLIENT_BID_ID", "ClientBidID"),
    FIX392_LIST_NAME(392, "LIST_NAME", "ListName"),
    FIX393_TOTAL_NUM_SECURITIES(393, "TOTAL_NUM_SECURITIES", "TotalNumSecurities"),
    FIX394_BID_TYPE(394, "BID_TYPE", "BidType"),
    FIX395_NUM_TICKETS(395, "NUM_TICKETS", "NumTickets"),
    FIX396_SIDE_VALUE1(396, "SIDE_VALUE1", "SideValue1"),
    FIX397_SIDE_VALUE2(397, "SIDE_VALUE2", "SideValue2"),
    FIX398_NO_BID_DESCRIPTORS(398, "NO_BID_DESCRIPTORS", "NoBidDescriptors"),
    FIX399_BID_DESCRIPTOR_TYPE(399, "BID_DESCRIPTOR_TYPE", "BidDescriptorType"),
    FIX400_BID_DESCRIPTOR(400, "BID_DESCRIPTOR", "BidDescriptor"),


    // 401-500

    FIX401_SIDE_VALUE_IND(401, "SIDE_VALUE_IND", "SideValueInd"),
    FIX402_LIQUIDITY_PCT_LOW(402, "LIQUIDITY_PCT_LOW", "LiquidityPctLow"),
    FIX403_LIQUIDITY_PCT_HIGH(403, "LIQUIDITY_PCT_HIGH", "LiquidityPctHigh"),
    FIX404_LIQUIDITY_VALUE(404, "LIQUIDITY_VALUE", "LiquidityValue"),
    FIX405_EFP_TRACKING_ERROR(405, "EFP_TRACKING_ERROR", "EFPTrackingError"),
    FIX406_FAIR_VALUE(406, "FAIR_VALUE", "FairValue"),
    FIX407_OUTSIDE_INDEX_PCT(407, "OUTSIDE_INDEX_PCT", "OutsideIndexPct"),
    FIX408_VALUE_OF_FUTURES(408, "VALUE_OF_FUTURES", "ValueOfFutures"),
    FIX409_LIQUIDITY_IND_TYPE(409, "LIQUIDITY_IND_TYPE", "LiquidityIndType"),
    FIX410_WT_AVERAGE_LIQUIDITY(410, "WT_AVERAGE_LIQUIDITY", "WtAverageLiquidity"),

    FIX411_EXCHANGE_FOR_PHYSICAL(411, "EXCHANGE_FOR_PHYSICAL", "ExchangeForPhysical"),
    FIX412_OUT_MAIN_CNTRY_U_INDEX(412, "OUT_MAIN_CNTRY_U_INDEX", "OutMainCntryUIndex"),
    FIX413_CROSS_PERCENT(413, "CROSS_PERCENT", "CrossPercent"),
    FIX414_PROG_RPT_REQS(414, "PROG_RPT_REQS", "ProgRptReqs"),
    FIX415_PROG_PERIOD_INTERVAL(415, "PROG_PERIOD_INTERVAL", "ProgPeriodInterval"),
    FIX416_INC_TAX_IND(416, "INC_TAX_IND", "IncTaxInd"),
    FIX417_NUM_BIDDERS(417, "NUM_BIDDERS", "NumBidders"),
    FIX418_TRADE_TYPE(418, "TRADE_TYPE", "TradeType"),
    FIX419_BASIS_PX_TYPE(419, "BASIS_PX_TYPE", "BasisPxType"),
    FIX420_NO_BID_COMPONENTS(420, "NO_BID_COMPONENTS", "NoBidComponents"),

    FIX421_COUNTRY(421, "COUNTRY", "Country"),
    FIX422_TOT_NO_STRIKES(422, "TOT_NO_STRIKES", "TotNoStrikes"),
    FIX423_PRICE_TYPE(423, "PRICE_TYPE", "PriceType"),
    FIX424_DAY_ORDER_QTY(424, "DAY_ORDER_QTY", "DayOrderQty"),
    FIX425_DAY_CUM_QTY(425, "DAY_CUM_QTY", "DayCumQty"),
    FIX426_DAY_AVG_PX(426, "DAY_AVG_PX", "DayAvgPx"),
    FIX427_GT_BOOKING_INST(427, "GT_BOOKING_INST", "GTBookingInst"),
    FIX428_NO_STRIKES(428, "NO_STRIKES", "NoStrikes"),
    FIX429_LIST_STATUS_TYPE(429, "LIST_STATUS_TYPE", "ListStatusType"),
    FIX430_NET_GROSS_IND(430, "NET_GROSS_IND", "NetGrossInd"),

    FIX431_LIST_ORDER_STATUS(431, "LIST_ORDER_STATUS", "ListOrderStatus"),
    FIX432_EXPIRE_DATE(432, "EXPIRE_DATE", "ExpireDate"),
    FIX433_LIST_EXEC_INST_TYPE(433, "LIST_EXEC_INST_TYPE", "ListExecInstType"),
    FIX434_CXL_REJ_RESPONSE_TO(434, "CXL_REJ_RESPONSE_TO", "CxlRejResponseTo"),
    FIX435_UNDERLYING_COUPON_RATE(435, "UNDERLYING_COUPON_RATE", "UnderlyingCouponRate"),
    FIX436_UNDERLYING_CONTRACT_MULTIPLIER(436, "UNDERLYING_CONTRACT_MULTIPLIER", "UnderlyingContractMultiplier"),
    FIX437_CONTRA_TRADE_QTY(437, "CONTRA_TRADE_QTY", "ContraTradeQty"),
    FIX438_CONTRA_TRADE_TIME(438, "CONTRA_TRADE_TIME", "ContraTradeTime"),
    FIX439_CLEARING_FIRM(439, "CLEARING_FIRM", "ClearingFirm"),
    FIX440_CLEARING_ACCOUNT(440, "CLEARING_ACCOUNT", "ClearingAccount"),

    FIX441_LIQUIDITY_NUM_SECURITIES(441, "LIQUIDITY_NUM_SECURITIES", "LiquidityNumSecurities"),
    FIX442_MULTI_LEG_REPORTING_TYPE(442, "MULTI_LEG_REPORTING_TYPE", "MultiLegReportingType"),
    FIX443_STRIKE_TIME(443, "STRIKE_TIME", "StrikeTime"),
    FIX444_LIST_STATUS_TEXT(444, "LIST_STATUS_TEXT", "ListStatusText"),
    FIX445_LIST_STATUS_ENCODED_TEXT_LEN(445, "LIST_STATUS_ENCODED_TEXT_LEN", "ListStatusEncodedTextLen"),
    FIX446_LIST_STATUS_ENCODED_TEXT(446, "LIST_STATUS_ENCODED_TEXT", "ListStatusEncodedText"),
    /*
     *
     * End of FIX4.2
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

    FIX42(final int id, final String name, final String description) {
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
        for (FIX42 oneFIX : FIX42.values()) {
            System.out.println(oneFIX);
        }
    }
}