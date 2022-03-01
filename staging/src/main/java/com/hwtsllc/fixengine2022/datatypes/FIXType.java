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

public enum FIXType {

    // 1-100

    /*
     * Start of FIX4.0 as defined by the FIX Protocol Specification 4.0
     *  Tags: 1-140
     */
    ACCOUNT(1, "Account"),
    ADV_ID(2, "AdvId"),
    ADV_REF_ID(3, "AdvRefId"),
    ADV_SIDE(4, "AdvSide"),
    ADV_TRANS_TYPE(5, "AdvTransType"),
    AVG_PX(6, "AvgPx"),
    BEGIN_SEQ_NO(7,"BeginSeqNo"),
    BEGIN_STRING(8, "BeginString"),
    BODY_LENGTH(9, "BodyLength"),
    CHECK_SUM(10, "CheckSum"),

    CL_ORD_ID(11, "ClOrdID"),
    COMMISSION(12, "Commission"),
    COMM_TYPE(13, "CommType"),
    CUM_QTY(14, "CumQty"),
    CURRENCY(15, "Currency"),
    END_SEQ_NO(16, "EndSeqNo"),
    EXEC_ID(17, "ExecID"),
    EXEC_INST(18, "ExecInst"),
    EXEC_REF_ID(19, "ExecRefID"),
    EXEC_TRANS_TYPE(20, "ExecTransType (replaced)"),

    HANDL_INST(21, "HandlInst"),
    ID_SOURCE(22, "IDSource"),
    IOI_ID(23, "IOIid"),
    IOI_OTH_SVC(24, "IOIOthSvc (no longer used)"),
    IOI_QLTY_IND(25, "IOIQltyInd"),
    IOI_REF_ID(26, "IOIRefID"),
    IOI_SHARES(27, "IOIShares"),
    IOI_TRANS_TYPE(28, "IOITransType"),
    LAST_CAPACITY(29, "LastCapacity"),
    LAST_MKT(30, "LastMkt"),

    LAST_PX(31, "LastPx"),
    LAST_QTY(32, "LastQty"),
    LINES_OF_TEXT(33, "LinesOfText"),
    MSG_SEQ_NUM(34, "MsgSeqNum"),
    MSG_TYPE(35, "MsgType"),
    NEW_SEQ_NO(36, "NewSeqNo"),
    ORDER_ID(37, "OrderID"),
    ORDER_QTY(38, "OrderQty"),
    ORD_STATUS(39, "OrdStatus"),
    ORD_TYPE(40, "OrdType"),

    ORIG_CL_ORD_ID(41, "OrigClOrdID"),
    ORIG_TIME(42, "OrigTime"),
    POSS_DUP_FLAG(43, "PossDupFlag"),
    PRICE(44, "Price"),
    REF_SEQ_NUM(45, "RefSeqNum"),
    RELATD_SYM(46, "RelatdSym (No longer used)"),
    RULE_80_A(47, "Rule80A (no longer used)"),
    SECURITY_ID(48, "SecurityID"),
    SENDER_COMP_ID(49, "SenderCompID"),
    SENDER_SUB_ID(50, "SenderSubID"),

    SENDING_DATE(51, "SendingDate (no longer used)"),
    SENDING_TIME(52, "SendingTime"),
    QUANTITY(53, "Quantity (formerly Shares)"),
    SIDE(54, "Side"),
    SYMBOL(55, "Symbol"),
    TARGET_COMP_ID(56, "TargetCompID"),
    TARGET_SUB_ID(57, "TargetSubID"),
    TEXT(58, "Text"),
    TIME_IN_FORCE(59, "TimeInForce"),
    TRANSACT_TIME(60, "TransactTime"),

    URGENCY(61, "Urgency"),
    VALID_UNTIL_TIME(62, "ValidUntilTime"),
    SETTLMNT_TYP(63, "SettlmntTyp"),
    FUT_SETT_DATE(64, "FutSettDate"),
    SYMBOL_SFX(65, "SymbolSfx"),
    LIST_ID(66, "ListID"),
    LIST_SEQ_NO(67, "ListSeqNo"),
    TOT_NO_ORDERS(68, "TotNoOrders (formerly named: ListNoOrds)"),
    LIST_EXEC_INST(69, "ListExecInst"),
    ALLOC_ID(70, "AllocID"),
    
    ALLOC_TRANS_TYPE(71, "AllocTransType"),
    REF_ALLOC_ID(72, "RefAllocID"),
    NO_ORDERS(73, "NoOrders"),
    AVG_PRX_PRECISION(74, "AvgPrxPrecision"),
    TRADE_DATE(75, "TradeDate"),
    EXEC_BROKER(76, "ExecBroker (replaced)"),
    OPEN_CLOSE(77, "OpenClose"),
    NO_ALLOCS(78, "NoAllocs"),
    ALLOC_ACCOUNT(79, "AllocAccount"),
    ALLOC_SHARES(80, "AllocShares"),
    
    PROCESS_CODE(81, "ProcessCode"),
    NO_RPTS(82, "NoRpts"),
    RPT_SEQ(83, "RptSeq"),
    CXL_QTY(84, "CxlQty"),
    NO_DLVY_INST(85, "NoDlvyInst (no longer used)"),
    DLVY_INST(86, "DlvyInst (no longer used)"),
    ALLOC_STATUS(87, "AllocStatus"),
    ALLOC_REJ_CODE(88, "AllocRejCode"),
    SIGNATURE(89, "Signature"),
    SECURE_DATA_LEN(90, "SecureDataLen"),
    
    SECURE_DATA(91, "SecureData"),
    BROKER_OF_CREDIT(92, "BrokerOfCredit (replaced)"),
    SIGNATURE_LENGTH(93, "SignatureLength"),
    EMAIL_TYPE(94, "EmailType"),
    RAW_DATA_LENGTH(95, "RawDataLength"),
    RAW_DATA(96, "RawData"),
    POSS_RESEND(97, "PossResend"),
    ENCRYPT_METHOD(98, "EncryptMethod"),
    STOP_PX(99, "StopPx"),
    EX_DESTINATION(100, "ExDestination"),

    
    // 101-200
    
    CXL_REJ_REASON(102, "CxlRejReason"),
    ORD_REJ_REASON(103, "OrdRejReason"),
    IOI_QUALIFIER(104, "IOIQualifier"),
    WAVE_NO(105, "WaveNo"),
    ISSUER(106, "Issuer"),
    SECURITY_DESC(107, "SecurityDesc"),
    HEART_BT_INT(108, "HeartBtInt"),
    CLIENT_ID(109, "ClientID (replaced)"),
    MIN_QTY(110, "MinQty"),

    MAX_FLOOR(111, "MaxFloor"),
    TEST_REQ_ID(112, "TestReqID"),
    REPORT_TO_EXCH(113, "ReportToExch"),
    LOCATE_REQD(114, "LocateReqd"),
    ON_BEHALF_OF_COMP_ID(115, "OnBehalfOfCompID"),
    ON_BEHALF_OF_SUB_ID(116, "OnBehalfOfSubID"),
    QUOTE_ID(117, "QuoteID"),
    NET_MONEY(118, "NetMoney"),
    SETTL_CURR_AMT(119, "SettlCurrAmt"),
    SETTL_CURRENCY(120, "SettlCurrency"),

    FOREX_REQ(121, "ForexReq"),
    ORIG_SENDING_TIME(122, "OrigSendingTime"),
    GAP_FILL_FLAG(123, "GapFillFlag"),
    NO_EXECS(124, "NoExecs"),
    CXL_TYPE(125, "CxlType (no longer used)"),
    EXPIRE_TIME(126, "ExpireTime"),
    DK_REASON(127, "DKReason"),
    DELIVER_TO_COMP_ID(128, "DeliverToCompID"),
    DELIVER_TO_SUB_ID(129, "DeliverToSubID"),
    IOI_NATURAL_FLAG(130, "IOINaturalFlag"),

    QUOTE_REQ_ID(131, "QuoteReqID"),
    BID_PX(132, "BidPx"),
    OFFER_PX(133, "OfferPx"),
    BID_SIZE(134, "BidSize"),
    OFFER_SIZE(135, "OfferSize"),
    NO_MISC_FEES(136, "NoMiscFees"),
    MISC_FEE_AMT(137, "MiscFeeAmt"),
    MISC_FEE_CURR(138, "MiscFeeCurr"),
    MISC_FEE_TYPE(139, "MiscFeeType"),
    PREV_CLOSE_PX(140, "PrevClosePx"),
    /*
     *
     * End of FIX4.0
     *
     */


    /*
     * Start of FIX4.2 as defined by the FIX Protocol Specification 4.2
     *  Tags: 141-446
     */
    RESET_SEQ_NUM_FLAG(141, "ResetSeqNumFlag"),
    SENDER_LOCATION_ID(142, "SenderLocationID"),
    TARGET_LOCATION_ID(143, "TargetLocationID"),
    ON_BEHALF_OF_LOCATION_ID(144, "OnBehalfOfLocationID"),
    DELIVER_TO_LOCATION_ID(145, "DeliverToLocationID"),
    NO_RELATED_SYM(146, "NoRelatedSym"),
    SUBJECT(147, "Subject"),
    HEADLINE(148, "Headline"),
    URL_LINK(149, "URLLink"),
    EXEC_TYPE(150, "ExecType"),

    LEAVES_QTY(151, "LeavesQty"),
    CASH_ORDER_QTY(152, "CashOrderQty"),
    ALLOC_AVG_PX(153, "AllocAvgPx"),
    ALLOC_NET_MONEY(154, "AllocNetMoney"),
    SETTL_CURR_FX_RATE(155, "SettlCurrFxRate"),
    SETTL_CURR_FX_RATE_CALC(156, "SettlCurrFxRateCalc"),
    NUM_DAYS_INTEREST(157, "NumDaysInterest"),
    ACCRUED_INTEREST_RATE(158, "AccruedInterestRate"),
    ACCRUED_INTEREST_AMT(159, "AccruedInterestAmt"),
    SETTL_INST_MODE(160, "SettlInstMode"),

    ALLOC_TEXT(161, "AllocText"),
    SETTL_INST_ID(162, "SettlInstID"),
    SETTL_INST_TRANS_TYPE(163, "SettlInstTransType"),
    EMAIL_THREAD_ID(164, "EmailThreadID"),
    SETTL_INST_SOURCE(165, "SettlInstSource"),
    SETTL_LOCATION(166, "SettlLocation (replaced)"),
    SECURITY_TYPE(167, "SecurityType"),
    EFFECTIVE_TIME(168, "EffectiveTime"),
    STAND_INST_DB_TYPE(169, "StandInstDbType"),
    STAND_INST_DB_NAME(170, "StandInstDbName"),

    STAND_INST_DB_ID(171, "StandInstDbID"),
    SETTL_DELIVERY_TYPE(172, "SettlDeliveryType"),
    SETTL_DEPOSITORY_CODE(173, "SettlDepositoryCode (replaced)"),
    SETTL_BRKR_CODE(174, "SettlBrkrCode (replaced)"),
    SETTL_INST_CODE(175, "SettlInstCode (replaced)"),
    SECURITY_SETTL_AGENT_NAME(176, "SecuritySettlAgentName (replaced)"),
    SECURITY_SETTL_AGENT_CODE(177, "SecuritySettlAgentCode (replaced)"),
    SECURITY_SETTL_AGENT_ACCT_NUM(178, "SecuritySettlAgentAcctNum (replaced)"),
    SECURITY_SETTL_AGENT_ACCT_NAME(179, "SecuritySettlAgentAcctName (replaced)"),
    SECURITY_SETTL_AGENT_CONTACT_NAME(180, "SecuritySettlAgentContactName (replaced)"),

    SECURITY_SETTL_AGENT_CONTACT_PHONE(181, "SecuritySettlAgentContactPhone (replaced)"),
    CASH_SETTL_AGENT_NAME(182, "CashSettlAgentName (replaced)"),
    CASH_SETTL_AGENT_CODE(183, "CashSettlAgentCode (replaced)"),
    CASH_SETTL_AGENT_ACCT_NUM(184, "CashSettlAgentAcctNum (replaced)"),
    CASH_SETTL_AGENT_ACCT_NAME(185, "CashSettlAgentAcctName (replaced)"),
    CASH_SETTL_AGENT_CONTACT_NAME(186, "CashSettlAgentContactName (replaced)"),
    CASH_SETTL_AGENT_CONTACT_PHONE(187, "CashSettlAgentContactPhone (replaced)"),
    BID_SPOT_RATE(188, "BidSpotRate"),
    BID_FORWARD_POINTS(189, "BidForwardPoints"),
    OFFER_SPOT_RATE(190, "OfferSpotRate"),

    OFFER_FORWARD_POINTS(191, "OfferForwardPoints"),
    ORDER_QTY_2(192, "OrderQty2"),
    FUT_SETT_DATE_2(193, "FutSettDate2"),
    LAST_SPOT_RATE(194, "LastSpotRate"),
    LAST_FORWARD_POINTS(195, "LastForwardPoints"),
    ALLOC_LINK_ID(196, "AllocLinkID"),
    ALLOC_LINK_TYPE(197, "AllocLinkType"),
    SECONDARY_ORDER_ID(198, "SecondaryOrderID"),
    NO_IOI_QUALIFIERS(199, "NoIOIQualifiers"),
    MATURITY_MONTH_YEAR(200, "MaturityMonthYear"),


    // 201-300
    
    PUT_OR_CALL(201, "PutOrCall (replaced)"),
    STRIKE_PRICE(202, "StrikePrice"),
    COVERED_OR_UNCOVERED(203, "CoveredOrUncovered"),
    CUSTOMER_OR_FIRM(204, "CustomerOrFirm (replaced)"),
    MATURITY_DAY(205, "MaturityDay (replaced)"),
    OPT_ATTRIBUTE(206, "OptAttribute"),
    SECURITY_EXCHANGE(207, "SecurityExchange"),
    NOTIFY_BROKER_OF_CREDIT(208, "NotifyBrokerOfCredit"),
    ALLOC_HANDL_INST(209, "AllocHandlInst"),
    MAX_SHOW(210, "MaxShow"),

    PEG_DIFFERENCE(211, "PegDifference"),
    XML_DATA_LEN(212, "XmlDataLen"),
    XML_DATA(213, "XmlData"),
    SETTL_INST_REF_ID(214, "SettlInstRefID"),
    NO_ROUTING_IDS(215, "NoRoutingIDs"),
    ROUTING_TYPE(216, "RoutingType"),
    ROUTING_ID(217, "RoutingID"),
    SPREAD_TO_BENCHMARK(218, "SpreadToBenchmark"),
    BENCHMARK(219, "Benchmark (no longer used)"),
    BENCHMARK_CURVE_CURRENCY(220, "BenchmarkCurveCurrency"),

    BENCHMARK_CURVE_NAME(221, "BenchmarkCurveName"),
    BENCHMARK_CURVE_POINT(222, "BenchmarkCurvePoint"),
    COUPON_RATE(223, "CouponRate"),
    COUPON_PAYMENT_DATE(224, "CouponPaymentDate"),
    ISSUE_DATE(225, "IssueDate"),
    REPURCHASE_TERM(226, "RepurchaseTerm (Deprecated)"),
    REPURCHASE_RATE(227, "RepurchaseRate (Deprecated)"),
    FACTOR(228, "Factor"),
    TRADE_ORIGINATION_DATE(229, "TradeOriginationDate"),
    EX_DATE(230, "ExDate"),

    CONTRACT_MULTIPLIER(231, "ContractMultiplier"),
    NO_STIPULATIONS(232, "NoStipulations"),
    STIPULATION_TYPE(233, "StipulationType"),
    STIPULATION_VALUE(234, "StipulationValue"),
    YIELD_TYPE(235, "YieldType"),
    YIELD(236, "Yield"),
    TOTAL_TAKEDOWN(237, "TotalTakedown"),
    CONCESSION(238, "Concession"),
    REPO_COLLATERAL_SECURITY_TYPE(239, "RepoCollateralSecurityType (Deprecated)"),
    REDEMPTION_DATE(240, "RedemptionDate (Deprecated)"),

    UNDERLYING_COUPON_PAYMENT_DATE(241, "UnderlyingCouponPaymentDate"),
    UNDERLYING_ISSUE_DATE(242, "UnderlyingIssueDate"),
    UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE(243, "UnderlyingRepoCollateralSecurityType (Deprecated"),
    UNDERLYING_REPURCHASE_TERM(244, "UnderlyingRepurchaseTerm (Deprecated)"),
    UNDERLYING_REPURCHASE_RATE(245, "UnderlyingRepurchaseRate (Deprecated)"),
    UNDERLYING_FACTOR(246, "UnderlyingFactor"),
    UNDERLYING_REDEMPTION_DATE(247, "UnderlyingRedemptionDate (Deprecated)"),
    LEG_COUPON_PAYMENT_DATE(248, "LegCouponPaymentDate"),
    LEG_ISSUE_DATE(249, "LegIssueDate"),
    LEG_REPO_COLLATERAL_SECURITY_TYPE(250, "LegRepoCollateralSecurityType (Deprecated)"),

    LEG_REPURCHASE_TERM(251, "LegRepurchaseTerm (Deprecated)"),
    LEG_REPURCHASE_RATE(252, "LegRepurchaseRate (Deprecated)"),
    LEG_FACTOR(253, "LegFactor"),
    LEG_REDEMPTION_DATE(254, "LegRedemptionDate (Deprecated)"),
    CREDIT_RATING(255, "CreditRating"),
    UNDERLYING_CREDIT_RATING(256, "UnderlyingCreditRating"),
    LEG_CREDIT_RATING(257, "LegCreditRating"),
    TRADED_FLAT_SWITCH(258, "TradedFlatSwitch"),
    BASIS_FEATURE_DATE(259, "BasisFeatureDate"),
    BASIS_FEATURE_PRICE(260, "BasisFeaturePrice"),

    MD_REQ_ID(262, "MDReqID"),
    SUBSCRIPTION_REQUEST_TYPE(263, "SubscriptionRequestType"),
    MARKET_DEPTH(264, "MarketDepth"),
    MD_UPDATE_TYPE(265, "MDUpdateType"),
    AGGREGATED_BOOK(266, "AggregatedBook"),
    NO_MD_ENTRY_TYPES(267, "NoMDEntryTypes"),
    NO_MD_ENTRIES(268, "NoMDEntries"),
    MD_ENTRY_TYPE(269, "MDEntryType"),
    MD_ENTRY_PX(270, "MDEntryPx"),

    MD_ENTRY_SIZE(271, "MDEntrySize"),
    MD_ENTRY_DATE(272, "MDEntryDate"),
    MD_ENTRY_TIME(273, "MDEntryTime"),
    TICK_DIRECTION(274, "TickDirection"),
    MD_MKT(275, "MDMkt"),
    QUOTE_CONDITION(276, "QuoteCondition"),
    TRADE_CONDITION(277, "TradeCondition"),
    MD_ENTRY_ID(278, "MDEntryID"),
    MD_UPDATE_ACTION(279, "MDUpdateAction"),
    MD_ENTRY_REF_ID(280, "MDEntryRefID"),

    MD_REQ_REJ_REASON(281, "MDReqRejReason"),
    MD_ENTRY_ORIGINATOR(282, "MDEntryOriginator"),
    LOCATION_ID(283, "LocationID"),
    DESK_ID(284, "DeskID"),
    DELETE_REASON(285, "DeleteReason"),
    OPEN_CLOSE_SETTLE_FLAG(286, "OpenCloseSettleFlag"),
    SELLER_DAYS(287, "SellerDays"),
    MD_ENTRY_BUYER(288, "MDEntryBuyer"),
    MD_ENTRY_SELLER(289, "MDEntrySeller"),
    MD_ENTRY_POSITION_NO(290, "MDEntryPositionNo"),

    FINANCIAL_STATUS(291, "FinancialStatus"),
    CORPORATE_ACTION(292, "CorporateAction"),
    DEF_BID_SIZE(293, "DefBidSize"),
    DEF_OFFER_SIZE(294, "DefOfferSize"),
    NO_QUOTE_ENTRIES(295, "NoQuoteEntries"),
    NO_QUOTE_SETS(296, "NoQuoteSets"),
    QUOTE_ACK_STATUS(297, "QuoteAckStatus"),
    QUOTE_CANCEL_TYPE(298, "QuoteCancelType"),
    QUOTE_ENTRY_ID(299, "QuoteEntryID"),
    QUOTE_REJECT_REASON(300, "QuoteRejectReason"),


    // 301-400
    
    QUOTE_RESPONSE_LEVEL(301, "QuoteResponseLevel"),
    QUOTE_SET_ID(302, "QuoteSetID"),
    QUOTE_REQUEST_TYPE(303, "QuoteRequestType"),
    TOT_QUOTE_ENTRIES(304, "TotQuoteEntries"),
    UNDERLYING_ID_SOURCE(305, "UnderlyingIDSource"),
    UNDERLYING_ISSUER(306, "UnderlyingIssuer"),
    UNDERLYING_SECURITY_DESC(307, "UnderlyingSecurityDesc"),
    UNDERLYING_SECURITY_EXCHANGE(308, "UnderlyingSecurityExchange"),
    UNDERLYING_SECURITY_ID(309, "UnderlyingSecurityID"),
    UNDERLYING_SECURITY_TYPE(310, "UnderlyingSecurityType"),

    UNDERLYING_SYMBOL(311, "UnderlyingSymbol"),
    UNDERLYING_SYMBOL_SFX(312, "UnderlyingSymbolSfx"),
    UNDERLYING_MATURITY_MONTH_YEAR(313, "UnderlyingMaturityMonthYear"),
    UNDERLYING_MATURITY_DAY(314, "UnderlyingMaturityDay (replaced)"),
    UNDERLYING_PUT_OR_CALL(315, "UnderlyingPutOrCall (replaced)"),
    UNDERLYING_STRIKE_PRICE(316, "UnderlyingStrikePrice"),
    UNDERLYING_OPT_ATTRIBUTE(317, "UnderlyingOptAttribute"),
    UNDERLYING_CURRENCY(318, "UnderlyingCurrency"),
    RATIO_QTY(319, "RatioQty (unused)"),
    SECURITY_REQ_ID(320, "SecurityReqID"),

    SECURITY_REQUEST_TYPE(321, "SecurityRequestType"),
    SECURITY_RESPONSE_ID(322, "SecurityResponseID"),
    SECURITY_RESPONSE_TYPE(323, "SecurityResponseType"),
    SECURITY_STATUS_REQ_ID(324, "SecurityStatusReqID"),
    UNSOLICITED_INDICATOR(325, "UnsolicitedIndicator"),
    SECURITY_TRADING_STATUS(326, "SecurityTradingStatus"),
    HALT_REASON(327, "HaltReason"),
    IN_VIEW_OF_COMMON(328, "InViewOfCommon"),
    DUE_TO_RELATED(329, "DueToRelated"),
    BUY_VOLUME(330, "BuyVolume"),

    SELL_VOLUME(331, "SellVolume"),
    HIGH_PX(332, "HighPx"),
    LOW_PX(333, "LowPx"),
    ADJUSTMENT(334, "Adjustment"),
    TRAD_SES_REQ_ID(335, "TradSesReqID"),
    TRADING_SESSION_ID(336, "TradingSessionID"),
    CONTRA_TRADER(337, "ContraTrader"),
    TRAD_SES_METHOD(338, "TradSesMethod"),
    TRAD_SES_MODE(339, "TradSesMode"),
    TRAD_SES_STATUS(340, "TradSesStatus"),

    TRAD_SES_START_TIME(341, "TradSesStartTime"),
    TRAD_SES_OPEN_TIME(342, "TradSesOpenTime"),
    TRAD_SES_PRE_CLOSE_TIME(343, "TradSesPreCloseTime"),
    TRAD_SES_CLOSE_TIME(344, "TradSesCloseTime"),
    TRAD_SES_END_TIME(345, "TradSesEndTime"),
    NUMBER_OF_ORDERS(346, "NumberOfOrders"),
    MESSAGE_ENCODING(347, "MessageEncoding"),
    ENCODED_ISSUER_LEN(348, "EncodedIssuerLen"),
    ENCODED_ISSUER(349, "EncodedIssuer"),
    ENCODED_SECURITY_DESC_LEN(350, "EncodedSecurityDescLen"),

    ENCODED_SECURITY_DESC(351, "EncodedSecurityDesc"),
    ENCODED_LIST_EXEC_INST_LEN(352, "EncodedListExecInstLen"),
    ENCODED_LIST_EXEC_INST(353, "EncodedListExecInst"),
    ENCODED_TEXT_LEN(354, "EncodedTextLen"),
    ENCODED_TEXT(355, "EncodedText"),
    ENCODED_SUBJECT_LEN(356, "EncodedSubjectLen"),
    ENCODED_SUBJECT(357, "EncodedSubject"),
    ENCODED_HEADLINE_LEN(358, "EncodedHeadlineLen"),
    ENCODED_HEADLINE(359, "EncodedHeadline"),
    ENCODED_ALLOC_TEXT_LEN(360, "EncodedAllocTextLen"),

    ENCODED_ALLOC_TEXT(361, "EncodedAllocText"),
    ENCODED_UNDERLYING_ISSUER_LEN(362, "EncodedUnderlyingIssuerLen"),
    ENCODED_UNDERLYING_ISSUER(363, "EncodedUnderlyingIssuer"),
    ENCODED_UNDERLYING_SECURITY_DESC_LEN(364, "EncodedUnderlyingSecurityDescLen"),
    ENCODED_UNDERLYING_SECURITY_DESC(365, "EncodedUnderlyingSecurityDesc"),
    ALLOC_PRICE(366, "AllocPrice"),
    QUOTE_SET_VALID_UNTIL_TIME(367, "QuoteSetValidUntilTime"),
    QUOTE_ENTRY_REJECT_REASON(368, "QuoteEntryRejectReason"),
    LAST_MSG_SEQ_NUM_PROCESSED(369, "LastMsgSeqNumProcessed"),
    ON_BEHALF_OF_SENDING_TIME(370, "OnBehalfOfSendingTime"),

    REF_TAG_ID(371, "RefTagID"),
    REF_MSG_TYPE(372, "RefMsgType"),
    SESSION_REJECT_REASON(373, "SessionRejectReason"),
    BID_REQUEST_TRANS_TYPE(374, "BidRequestTransType"),
    CONTRA_BROKER(375, "ContraBroker"),
    COMPLIANCE_ID(376, "ComplianceID"),
    SOLICITED_FLAG(377, "SolicitedFlag"),
    EXEC_RESTATEMENT_REASON(378, "ExecRestatementReason"),
    BUSINESS_REJECT_REF_ID(379, "BusinessRejectRefID"),
    BUSINESS_REJECT_REASON(380, "BusinessRejectReason"),

    GROSS_TRADE_AMT(381, "GrossTradeAmt"),
    NO_CONTRA_BROKERS(382, "NoContraBrokers"),
    MAX_MESSAGE_SIZE(383, "MaxMessageSize"),
    NO_MSG_TYPES(384, "NoMsgTypes"),
    MSG_DIRECTION(385, "MsgDirection"),
    NO_TRADING_SESSIONS(386, "NoTradingSessions"),
    TOTAL_VOLUME_TRADED(387, "TotalVolumeTraded"),
    DISCRETION_INST(388, "DiscretionInst"),
    DISCRETION_OFFSET(389, "DiscretionOffset"),
    BID_ID(390, "BidID"),

    CLIENT_BID_ID(391, "ClientBidID"),
    LIST_NAME(392, "ListName"),
    TOTAL_NUM_SECURITIES(393, "TotalNumSecurities"),
    BID_TYPE(394, "BidType"),
    NUM_TICKETS(395, "NumTickets"),
    SIDE_VALUE1(396, "SideValue1"), 
    SIDE_VALUE2(397, "SideValue2"),
    NO_BID_DESCRIPTORS(398, "NoBidDescriptors"),
    BID_DESCRIPTOR_TYPE(399, "BidDescriptorType"),
    BID_DESCRIPTOR(400, "BidDescriptor"),


    // 401-500
    
    SIDE_VALUE_IND(401, "SideValueInd"),
    LIQUIDITY_PCT_LOW(402, "LiquidityPctLow"),
    LIQUIDITY_PCT_HIGH(403, "LiquidityPctHigh"),
    LIQUIDITY_VALUE(404, "LiquidityValue"),
    EFP_TRACKING_ERROR(405, "EFPTrackingError"),
    FAIR_VALUE(406, "FairValue"),
    OUTSIDE_INDEX_PCT(407, "OutsideIndexPct"),
    VALUE_OF_FUTURES(408, "ValueOfFutures"),
    LIQUIDITY_IND_TYPE(409, "LiquidityIndType"),
    WT_AVERAGE_LIQUIDITY(410, "WtAverageLiquidity"),

    EXCHANGE_FOR_PHYSICAL(411, "ExchangeForPhysical"),
    OUT_MAIN_CNTRY_U_INDEX(412, "OutMainCntryUIndex"),
    CROSS_PERCENT(413, "CrossPercent"),
    PROG_RPT_REQS(414, "ProgRptReqs"),
    PROG_PERIOD_INTERVAL(415, "ProgPeriodInterval"),
    INC_TAX_IND(416, "IncTaxInd"),
    NUM_BIDDERS(417, "NumBidders"),
    TRADE_TYPE(418, "TradeType"),
    BASIS_PX_TYPE(419, "BasisPxType"),
    NO_BID_COMPONENTS(420, "NoBidComponents"),

    COUNTRY(421, "Country"),
    TOT_NO_STRIKES(422, "TotNoStrikes"),
    PRICE_TYPE(423, "PriceType"),
    DAY_ORDER_QTY(424, "DayOrderQty"),
    DAY_CUM_QTY(425, "DayCumQty"),
    DAY_AVG_PX(426, "DayAvgPx"),
    GT_BOOKING_INST(427, "GTBookingInst"),
    NO_STRIKES(428, "NoStrikes"),
    LIST_STATUS_TYPE(429, "ListStatusType"),
    NET_GROSS_IND(430, "NetGrossInd"),

    LIST_ORDER_STATUS(431, "ListOrderStatus"),
    EXPIRE_DATE(432, "ExpireDate"),
    LIST_EXEC_INST_TYPE(433, "ListExecInstType"),
    CXL_REJ_RESPONSE_TO(434, "CxlRejResponseTo"),
    UNDERLYING_COUPON_RATE(435, "UnderlyingCouponRate"),
    UNDERLYING_CONTRACT_MULTIPLIER(436, "UnderlyingContractMultiplier"),
    CONTRA_TRADE_QTY(437, "ContraTradeQty"),
    CONTRA_TRADE_TIME(438, "ContraTradeTime"),
    CLEARING_FIRM(439, "ClearingFirm"),
    CLEARING_ACCOUNT(440, "ClearingAccount"),
    
    LIQUIDITY_NUM_SECURITIES(441, "LiquidityNumSecurities"),
    MULTI_LEG_REPORTING_TYPE(442, "MultiLegReportingType"),
    STRIKE_TIME(443, "StrikeTime"),
    LIST_STATUS_TEXT(444, "ListStatusText"),
    LIST_STATUS_ENCODED_TEXT_LEN(445, "ListStatusEncodedTextLen"),
    LIST_STATUS_ENCODED_TEXT(446, "ListStatusEncodedText"),
    /*
     *
     * End of FIX4.2
     *
     */


    /*
     * Start of FIX4.3 as defined by the FIX Protocol Specification 4.3
     *  Tags: 447-659
     */
    PARTY_ID_SOURCE(447, "PartyIDSource"),
    PARTY_ID(448, "PartyID"),
    TOTAL_VOLUME_TRADED_DATE(449, "TotalVolumeTradedDate (replaced)"),
    TOTAL_VOLUME_TRADED_TIME(450, "TotalVolumeTradedTime (replaced)"),

    NET_CHG_PREV_DAY(451, "NetChgPrevDay"),
    PARTY_ROLE(452, "PartyRole"),
    NO_PARTY_IDS(453, "NoPartyIDs"),
    NO_SECURITY_ALT_ID(454, "NoSecurityAltID"),
    SECURITY_ALT_ID(455, "SecurityAltID"),
    SECURITY_ALT_ID_SOURCE(456, "SecurityAltIDSource"),
    NO_UNDERLYING_SECURITY_ALT_ID(457, "NoUnderlyingSecurityAltID"),
    UNDERLYING_SECURITY_ALT_ID(458, "UnderlyingSecurityAltID"),
    UNDERLYING_SECURITY_ALT_ID_SOURCE(459, "UnderlyingSecurityAltIDSource"),
    PRODUCT(460, "Product"),

    CFI_CODE(461, "CFICode"),
    UNDERLYING_PRODUCT(462, "UnderlyingProduct"),
    UNDERLYING_CFI_CODE(463, "UnderlyingCFICode"),
    TEST_MESSAGE_INDICATOR(464, "TestMessageIndicator"),
    QUANTITY_TYPE(465, "QuantityType (Deprecated)"),
    BOOKING_REF_ID(466, "BookingRefID"),
    INDIVIDUAL_ALLOC_ID(467, "IndividualAllocID"),
    ROUNDING_DIRECTION(468, "RoundingDirection"),
    ROUNDING_MODULUS(469, "RoundingModulus"),
    COUNTRY_OF_ISSUE(470, "CountryOfIssue"),

    STATE_OR_PROVINCE_OF_ISSUE(471, "StateOrProvinceOfIssue"),
    LOCALE_OF_ISSUE(472, "LocaleOfIssue"),
    NO_REGIST_DTLS(473, "NoRegistDtls"),
    MAILING_DTLS(474, "MailingDtls"),
    INVESTOR_COUNTRY_OF_RESIDENCE(475, "InvestorCountryOfResidence"),
    PAYMENT_REF(476, "PaymentRef"),
    DISTRIB_PAYMENT_METHOD(477, "DistribPaymentMethod"),
    CASH_DISTRIB_CURR(478, "CashDistribCurr"),
    COMM_CURRENCY(479, "CommCurrency"),
    CANCELLATION_RIGHTS(480, "CancellationRights"),

    MONEY_LAUNDERING_STATUS(481, "MoneyLaunderingStatus"),
    MAILING_INST(482, "MailingInst"),
    TRANS_BKD_TIME(483, "TransBkdTime"),
    EXEC_PRICE_TYPE(484, "ExecPriceType"),
    EXEC_PRICE_ADJUSTMENT(485, "ExecPriceAdjustment"),
    DATE_OF_BIRTH(486, "DateOfBirth"),
    TRADE_REPORT_TRANS_TYPE(487, "TradeReportTransType"),
    CARD_HOLDER_NAME(488, "CardHolderName"),
    CARD_NUMBER(489, "CardNumber"),
    CARD_EXP_DATE(490, "CardExpDate"),

    CARD_ISS_NUM(491, "CardIssNum"),
    PAYMENT_METHOD(492, "PaymentMethod"),
    REGIST_ACCT_TYPE(493, "RegistAcctType"),
    DESIGNATION(494, "Designation"),
    TAX_ADVANTAGE_TYPE(495, "TaxAdvantageType"),
    REGIST_REJ_REASON_TEXT(496, "RegistRejReasonText"),
    FUND_RENEW_WAIV(497, "FundRenewWaiv"),
    CASH_DISTRIB_AGENT_NAME(498, "CashDistribAgentName"),
    CASH_DISTRIB_AGENT_CODE(499, "CashDistribAgentCode"),
    CASH_DISTRIB_AGENT_ACCT_NUMBER(500, "CashDistribAgentAcctNumber"),


    // 501-600
    
    CASH_DISTRIB_PAY_REF(501, "CashDistribPayRef"),
    CASH_DISTRIB_AGENT_ACCT_NAME(502, "CashDistribAgentAcctName"),
    CARD_START_DATE(503, "CardStartDate"),
    PAYMENT_DATE(504, "PaymentDate"),
    PAYMENT_REMITTER_ID(505, "PaymentRemitterID"),
    REGIST_STATUS(506, "RegistStatus"),
    REGIST_REJ_REASON_CODE(507, "RegistRejReasonCode"),
    REGIST_REF_ID(508, "RegistRefID"),
    REGIST_DTLS(509, "RegistDtls"),
    NO_DISTRIB_INSTS(510, "NoDistribInsts"),

    REGIST_EMAIL(511, "RegistEmail"),
    DISTRIB_PERCENTAGE(512, "DistribPercentage"),
    REGIST_ID(513, "RegistID"),
    REGIST_TRANS_TYPE(514, "RegistTransType"),
    EXEC_VALUATION_POINT(515, "ExecValuationPoint"),
    ORDER_PERCENT(516, "OrderPercent"),
    OWNERSHIP_TYPE(517, "OwnershipType"),
    NO_CONT_AMTS(518, "NoContAmts"),
    CONT_AMT_TYPE(519, "ContAmtType"),
    CONT_AMT_VALUE(520, "ContAmtValue"),

    CONT_AMT_CURR(521, "ContAmtCurr"),
    OWNER_TYPE(522, "OwnerType"),
    PARTY_SUB_ID(523, "PartySubID"),
    NESTED_PARTY_ID(524, "NestedPartyID"),
    NESTED_PARTY_ID_SOURCE(525, "NestedPartyIDSource"),
    SECONDARY_CL_ORD_ID(526, "SecondaryClOrdID"),
    SECONDARY_EXEC_ID(527, "SecondaryExecID"),
    ORDER_CAPACITY(528, "OrderCapacity"),
    ORDER_RESTRICTIONS(529, "OrderRestrictions"),
    MASS_CANCEL_REQUEST_TYPE(530, "MassCancelRequestType"),

    MASS_CANCEL_RESPONSE(531, "MassCancelResponse"),
    MASS_CANCEL_REJECT_REASON(532, "MassCancelRejectReason"),
    TOTAL_AFFECTED_ORDERS(533, "TotalAffectedOrders"),
    NO_AFFECTED_ORDERS(534, "NoAffectedOrders"),
    AFFECTED_ORDER_ID(535, "AffectedOrderID"),
    AFFECTED_SECONDARY_ORDER_ID(536, "AffectedSecondaryOrderID"),
    QUOTE_TYPE(537, "QuoteType"),
    NESTED_PARTY_ROLE(538, "NestedPartyRole"),
    NO_NESTED_PARTY_IDS(539, "NoNestedPartyIDs"),
    TOTAL_ACCRUED_INTEREST_AMT(540, "TotalAccruedInterestAmt (Deprecated)"),

    MATURITY_DATE(541, "MaturityDate"),
    UNDERLYING_MATURITY_DATE(542, "UnderlyingMaturityDate"),
    INSTR_REGISTRY(543, "InstrRegistry"),
    CASH_MARGIN(544, "CashMargin"),
    NESTED_PARTY_SUB_ID(545, "NestedPartySubID"),
    SCOPE(546, "Scope"),
    MD_IMPLICIT_DELETE(547, "MDImplicitDelete"),
    CROSS_ID(548, "CrossID"),
    CROSS_TYPE(549, "CrossType"),
    CROSS_PRIORITIZATION(550, "CrossPrioritization"),

    ORIG_CROSS_ID(551, "OrigCrossID"),
    NO_SIDES(552, "NoSides"),
    USERNAME(553, "Username"),
    PASSWORD(554, "Password"),
    NO_LEGS(555, "NoLegs"),
    LEG_CURRENCY(556, "LegCurrency"),
    TOT_NO_SECURITY_TYPES(557, "TotNoSecurityTypes"),
    NO_SECURITY_TYPES(558, "NoSecurityTypes"),
    SECURITY_LIST_REQUEST_TYPE(559, "SecurityListRequestType"),
    SECURITY_REQUEST_RESULT(560, "SecurityRequestResult"),

    ROUND_LOT(561, "RoundLot"),
    MIN_TRADE_VOL(562, "MinTradeVol"),
    MULTI_LEG_RPT_TYPE_REQ(563, "MultiLegRptTypeReq"),
    LEG_POSITION_EFFECT(564, "LegPositionEffect"),
    LEG_COVERED_OR_UNCOVERED(565, "LegCoveredOrUncovered"),
    LEG_PRICE(566, "LegPrice"),
    TRAD_SES_STATUS_REJ_REASON(567, "TradSesStatusRejReason"),
    TRADE_REQUEST_ID(568, "TradeRequestID"),
    TRADE_REQUEST_TYPE(569, "TradeRequestType"),
    PREVIOUSLY_REPORTED(570, "PreviouslyReported"),

    TRADE_REPORT_ID(571, "TradeReportID"),
    TRADE_REPORT_REF_ID(572, "TradeReportRefID"),
    MATCH_STATUS(573, "MatchStatus"),
    MATCH_TYPE(574, "MatchType"),
    ODD_LOT(575, "OddLot"),
    NO_CLEARING_INSTRUCTIONS(576, "NoClearingInstructions"),
    CLEARING_INSTRUCTION(577, "ClearingInstruction"),
    TRADE_INPUT_SOURCE(578, "TradeInputSource"),
    TRADE_INPUT_DEVICE(579, "TradeInputDevice"),
    NO_DATES(580, "NoDates"),

    ACCOUNT_TYPE(581, "AccountType"),
    CUST_ORDER_CAPACITY(582, "CustOrderCapacity"),
    CL_ORD_LINK_ID(583, "ClOrdLinkID"),
    MASS_STATUS_REQ_ID(584, "MassStatusReqID"),
    MASS_STATUS_REQ_TYPE(585, "MassStatusReqType"),
    ORIG_ORD_MOD_TIME(586, "OrigOrdModTime"),
    LEG_SETTL_TYPE(587, "LegSettlType formerly named LegSettlmntTyp prior to FIX 4.4)"),
    LEG_SETTL_DATE(588, "LegSettlDate (formerly named LegFutSettlDate prior to FIX 4.4)"),
    DAY_BOOKING_INST(589, "DayBookingInst"),
    BOOKING_UNIT(590, "BookingUnit"),

    PREALLOC_METHOD(591, "PreallocMethod"),
    UNDERLYING_COUNTRY_OF_ISSUE(592, "UnderlyingCountryOfIssue"),
    UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE(593, "UnderlyingStateOrProvinceOfIssue"),
    UNDERLYING_LOCALE_OF_ISSUE(594, "UnderlyingLocaleOfIssue"),
    UNDERLYING_INSTR_REGISTRY(595, "UnderlyingInstrRegistry"),
    LEG_COUNTRY_OF_ISSUE(596, "LegCountryOfIssue"),
    LEG_STATE_OR_PROVINCE_OF_ISSUE(597, "LegStateOrProvinceOfIssue"),
    LEG_LOCALE_OF_ISSUE(598, "LegLocaleOfIssue"),
    LEG_INSTR_REGISTRY(599, "LegInstrRegistry"),
    LEG_SYMBOL(600, "LegSymbol"),


    // 601-700
    
    LEG_SYMBOL_SFX(601, "LegSymbolSfx"),
    LEG_SECURITY_ID(602, "LegSecurityID"),
    LEG_SECURITY_ID_SOURCE(603, "LegSecurityIDSource"),
    NO_LEG_SECURITY_ALT_ID(604, "NoLegSecurityAltID"),
    LEG_SECURITY_ALT_ID(605, "LegSecurityAltID"),
    LEG_SECURITY_ALT_ID_SOURCE(606, "LegSecurityAltIDSource"),
    LEG_PRODUCT(607, "LegProduct"),
    LEG_CFI_CODE(608, "LegCFICode"),
    LEG_SECURITY_TYPE(609, "LegSecurityType"),
    LEG_MATURITY_MONTH_YEAR(610, "LegMaturityMonthYear"),

    LEG_MATURITY_DATE(611, "LegMaturityDate"),
    LEG_STRIKE_PRICE(612, "LegStrikePrice"),
    LEG_OPT_ATTRIBUTE(613, "LegOptAttribute"),
    LEG_CONTRACT_MULTIPLIER(614, "LegContractMultiplier"),
    LEG_COUPON_RATE(615, "LegCouponRate"),
    LEG_SECURITY_EXCHANGE(616, "LegSecurityExchange"),
    LEG_ISSUER(617, "LegIssuer"),
    ENCODED_LEG_ISSUER_LEN(618, "EncodedLegIssuerLen"),
    ENCODED_LEG_ISSUER(619, "EncodedLegIssuer"),
    LEG_SECURITY_DESC(620, "LegSecurityDesc"),

    ENCODED_LEG_SECURITY_DESC_LEN(621, "EncodedLegSecurityDescLen"),
    ENCODED_LEG_SECURITY_DESC(622, "EncodedLegSecurityDesc"),
    LEG_RATIO_QTY(623, "LegRatioQty"),
    LEG_SIDE(624, "LegSide"),
    TRADING_SESSION_SUB_ID(625, "TradingSessionSubID"),
    ALLOC_TYPE(626, "AllocType"),
    NO_HOPS(627, "NoHops"),
    HOP_COMP_ID(628, "HopCompID"),
    HOP_SENDING_TIME(629, "HopSendingTime"),
    HOP_REF_ID(630, "HopRefID"),

    MID_PX(631, "MidPx"),
    BID_YIELD(632, "BidYield"),
    MID_YIELD(633, "MidYield"),
    OFFER_YIELD(634, "OfferYield"),
    CLEARING_FEE_INDICATOR(635, "ClearingFeeIndicator"),
    WORKING_INDICATOR(636, "WorkingIndicator"),
    LEG_LAST_PX(637, "LegLastPx"),
    PRIORITY_INDICATOR(638, "PriorityIndicator"),
    PRICE_IMPROVEMENT(639, "PriceImprovement"),
    PRICE_2(640, "Price2"),

    LAST_FORWARD_POINTS_2(641, "LastForwardPoints2"),
    BID_FORWARD_POINTS_2(642, "BidForwardPoints2"),
    OFFER_FORWARD_POINTS_2(643, "OfferForwardPoints2"),
    RFQ_REQ_ID(644, "RFQReqID"),
    MKT_BID_PX(645, "MktBidPx"),
    MKT_OFFER_PX(646, "MktOfferPx"),
    MIN_BID_SIZE(647, "MinBidSize"),
    MIN_OFFER_SIZE(648, "MinOfferSize"),
    QUOTE_STATUS_REQ_ID(649, "QuoteStatusReqID"),
    LEGAL_CONFIRM(650, "LegalConfirm"),

    UNDERLYING_LAST_PX(651, "UnderlyingLastPx"),
    UNDERLYING_LAST_QTY(652, "UnderlyingLastQty"),
    SEC_DEF_STATUS(653, "SecDefStatus (replaced)"),
    LEG_REF_ID(654, "LegRefID"),
    CONTRA_LEG_REF_ID(655, "ContraLegRefID"),
    SETTL_CURR_BID_FX_RATE(656, "SettlCurrBidFxRate"),
    SETTL_CURR_OFFER_FX_RATE(657, "SettlCurrOfferFxRate"),
    QUOTE_REQUEST_REJECT_REASON(658, "QuoteRequestRejectReason"),
    SIDE_COMPLIANCE_ID(659, "SideComplianceID"),
    /*
     *
     * End of FIX4.3
     *
     */


    /*
     * Start of FIX4.4 as defined by the FIX Protocol Specification 4.4
     *  Tags: 660-956
     */
    ACCT_ID_SOURCE(660, "AcctIDSource"),

    ALLOC_ACCT_ID_SOURCE(661, "AllocAcctIDSource"),
    BENCHMARK_PRICE(662, "BenchmarkPrice"),
    BENCHMARK_PRICE_TYPE(663, "BenchmarkPriceType"),
    CONFIRM_ID(664, "ConfirmID"),
    CONFIRM_STATUS(665, "ConfirmStatus"),
    CONFIRM_TRANS_TYPE(666, "ConfirmTransType"),
    CONTRACT_SETTL_MONTH(667, "ContractSettlMonth"),
    DELIVERY_FORM(668, "DeliveryForm"),
    LAST_PAR_PX(669, "LastParPx"),
    NO_LEG_ALLOCS(670, "NoLegAllocs"),

    LEG_ALLOC_ACCOUNT(671, "LegAllocAccount"),
    LEG_INDIVIDUAL_ALLOC_ID(672, "LegIndividualAllocID"),
    LEG_ALLOC_QTY(673, "LegAllocQty"),
    LEG_ALLOC_ACCT_ID_SOURCE(674, "LegAllocAcctIDSource"),
    LEG_SETTL_CURRENCY(675, "LegSettlCurrency"),
    LEG_BENCHMARK_CURVE_CURRENCY(676, "LegBenchmarkCurveCurrency"),
    LEG_BENCHMARK_CURVE_NAME(677, "LegBenchmarkCurveName"),
    LEG_BENCHMARK_CURVE_POINT(678, "LegBenchmarkCurvePoint"),
    LEG_BENCHMARK_PRICE(679, "LegBenchmarkPrice"),
    LEG_BENCHMARK_PRICE_TYPE(680, "LegBenchmarkPriceType"),

    LEG_BID_PX(681, "LegBidPx"),
    LEG_IOI_QTY(682, "LegIOIQty"),
    NO_LEG_STIPULATIONS(683, "NoLegStipulations"),
    LEG_OFFER_PX(684, "LegOfferPx"),
    LEG_ORDER_QTY(685, "LegOrderQty"),
    LEG_PRICE_TYPE(686, "LegPriceType"),
    LEG_QTY(687, "LegQty"),
    LEG_STIPULATION_TYPE(688, "LegStipulationType"),
    LEG_STIPULATION_VALUE(689, "LegStipulationValue"),
    LEG_SWAP_TYPE(690, "LegSwapType"),

    POOL(691, "Pool"),
    QUOTE_PRICE_TYPE(692, "QuotePriceType"),
    QUOTE_RESP_ID(693, "QuoteRespID"),
    QUOTE_RESP_TYPE(694, "QuoteRespType"),
    QUOTE_QUALIFIER(695, "QuoteQualifier"),
    YIELD_REDEMPTION_DATE(696, "YieldRedemptionDate"),
    YIELD_REDEMPTION_PRICE(697, "YieldRedemptionPrice"),
    YIELD_REDEMPTION_PRICE_TYPE(698, "YieldRedemptionPriceType"),
    BENCHMARK_SECURITY_ID(699, "BenchmarkSecurityID"),
    REVERSAL_INDICATOR(700, "ReversalIndicator"),


    // 701-800

    YIELD_CALC_DATE(701, "YieldCalcDate"),
    NO_POSITIONS(702, "NoPositions"),
    POS_TYPE(703, "PosType"),
    LONG_QTY(704, "LongQty"),
    SHORT_QTY(705, "ShortQty"),
    POS_QTY_STATUS(706, "PosQtyStatus"),
    POS_AMT_TYPE(707, "PosAmtType"),
    POS_AMT(708, "PosAmt"),
    POS_TRANS_TYPE(709, "PosTransType"),
    POS_REQ_ID(710, "PosReqID"),

    NO_UNDERLYINGS(711, "NoUnderlyings"),
    POS_MAINT_ACTION(712, "PosMaintAction"),
    ORIG_POS_REQ_REF_ID(713, "OrigPosReqRefID"),
    POS_MAINT_RPT_REF_ID(714, "PosMaintRptRefID"),
    CLEARING_BUSINESS_DATE(715, "ClearingBusinessDate"),
    SETTL_SESS_ID(716, "SettlSessID"),
    SETTL_SESS_SUB_ID(717, "SettlSessSubID"),
    ADJUSTMENT_TYPE(718, "AdjustmentType"),
    CONTRARY_INSTRUCTION_INDICATOR(719, "ContraryInstructionIndicator"),
    PRIOR_SPREAD_INDICATOR(720, "PriorSpreadIndicator"),

    POS_MAINT_RPT_ID(721, "PosMaintRptID"),
    POS_MAINT_STATUS(722, "PosMaintStatus"),
    POS_MAINT_RESULT(723, "PosMaintResult"),
    POS_REQ_TYPE(724, "PosReqType"),
    RESPONSE_TRANSPORT_TYPE(725, "ResponseTransportType"),
    RESPONSE_DESTINATION(726, "ResponseDestination"),
    TOTAL_NUM_POS_REPORTS(727, "TotalNumPosReports"),
    POS_REQ_RESULT(728, "PosReqResult"),
    POS_REQ_STATUS(729, "PosReqStatus"),
    SETTL_PRICE(730, "SettlPrice"),

    SETTL_PRICE_TYPE(731, "SettlPriceType"),
    UNDERLYING_SETTL_PRICE(732, "UnderlyingSettlPrice"),
    UNDERLYING_SETTL_PRICE_TYPE(733, "UnderlyingSettlPriceType"),
    PRIOR_SETTL_PRICE(734, "PriorSettlPrice"),
    NO_QUOTE_QUALIFIERS(735, "NoQuoteQualifiers"),
    ALLOC_SETTL_CURRENCY(736, "AllocSettlCurrency"),
    ALLOC_SETTL_CURR_AMT(737, "AllocSettlCurrAmt"),
    INTEREST_AT_MATURITY(738, "InterestAtMaturity"),
    LEG_DATED_DATE(739, "LegDatedDate"),
    LEG_POOL(740, "LegPool"),

    ALLOC_INTEREST_AT_MATURITY(741, "AllocInterestAtMaturity"),
    ALLOC_ACCRUED_INTEREST_AMT(742, "AllocAccruedInterestAmt"),
    DELIVERY_DATE(743, "DeliveryDate"),
    ASSIGNMENT_METHOD(744, "AssignmentMethod"),
    ASSIGNMENT_UNIT(745, "AssignmentUnit"),
    OPEN_INTEREST(746, "OpenInterest"),
    EXERCISE_METHOD(747, "ExerciseMethod"),
    TOT_NUM_TRADE_REPORTS(748, "TotNumTradeReports"),
    TRADE_REQUEST_RESULT(749, "TradeRequestResult"),
    TRADE_REQUEST_STATUS(750, "TradeRequestStatus"),

    TRADE_REPORT_REJECT_REASON(751, "TradeReportRejectReason"),
    SIDE_MULTI_LEG_REPORTING_TYPE(752, "SideMultiLegReportingType"),
    NO_POS_AMT(753, "NoPosAmt"),
    AUTO_ACCEPT_INDICATOR(754, "AutoAcceptIndicator"),
    ALLOC_REPORT_ID(755, "AllocReportID"),
    NO_NESTED_2_PARTY_IDS(756, "NoNested2PartyIDs"),
    NESTED_2_PARTY_ID(757, "Nested2PartyID"),
    NESTED_2_PARTY_ID_SOURCE(758, "Nested2PartyIDSource"),
    NESTED_2_PARTY_ROLE(759, "Nested2PartyRole"),
    NESTED_2_PARTY_SUB_ID(760, "Nested2PartySubID"),

    BENCHMARK_SECURITY_ID_SOURCE(761, "BenchmarkSecurityIDSource"),
    SECURITY_SUB_TYPE(762, "SecuritySubType"),
    UNDERLYING_SECURITY_SUB_TYPE(763, "UnderlyingSecuritySubType"),
    LEG_SECURITY_SUB_TYPE(764, "LegSecuritySubType"),
    ALLOWABLE_ONE_SIDEDNESS_PCT(765, "AllowableOneSidednessPct"),
    ALLOWABLE_ONE_SIDEDNESS_VALUE(766, "AllowableOneSidednessValue"),
    ALLOWABLE_ONE_SIDEDNESS_CURR(767, "AllowableOneSidednessCurr"),
    NO_TRD_REG_TIMESTAMPS(768, "NoTrdRegTimestamps"),
    TRD_REG_TIMESTAMP(769, "TrdRegTimestamp"),
    TRD_REG_TIMESTAMP_TYPE(770, "TrdRegTimestampType"),

    TRD_REG_TIMESTAMP_ORIGIN(771, "TrdRegTimestampOrigin"),
    CONFIRM_REF_ID(772, "ConfirmRefID"),
    CONFIRM_TYPE(773, "ConfirmType"),
    CONFIRM_REJ_REASON(774, "ConfirmRejReason"),
    BOOKING_TYPE(775, "BookingType"),
    INDIVIDUAL_ALLOC_REJ_CODE(776, "IndividualAllocRejCode"),
    SETTL_INST_MSG_ID(777, "SettlInstMsgID"),
    NO_SETTL_INST(778, "NoSettlInst"),
    LAST_UPDATE_TIME(779, "LastUpdateTime"),
    ALLOC_SETTL_INST_TYPE(780, "AllocSettlInstType"),

    NO_SETTL_PARTY_IDS(781, "NoSettlPartyIDs"),
    SETTL_PARTY_ID(782, "SettlPartyID"),
    SETTL_PARTY_ID_SOURCE(783, "SettlPartyIDSource"),
    SETTL_PARTY_ROLE(784, "SettlPartyRole"),
    SETTL_PARTY_SUB_ID(785, "SettlPartySubID"),
    SETTL_PARTY_SUB_ID_TYPE(786, "SettlPartySubIDType"),
    DLVY_INST_TYPE(787, "DlvyInstType"),
    TERMINATION_TYPE(788, "TerminationType"),
    NEXT_EXPECTED_MSG_SEQ_NUM(789, "NextExpectedMsgSeqNum"),
    ORD_STATUS_REQ_ID(790, "OrdStatusReqID"),

    SETTL_INST_REQ_ID(791, "SettlInstReqID"),
    SETTL_INST_REQ_REJ_CODE(792, "SettlInstReqRejCode"),
    SECONDARY_ALLOC_ID(793, "SecondaryAllocID"),
    ALLOC_REPORT_TYPE(794, "AllocReportType"),
    ALLOC_REPORT_REF_ID(795, "AllocReportRefID"),
    ALLOC_CANC_REPLACE_REASON(796, "AllocCancReplaceReason"),
    COPY_MSG_INDICATOR(797, "CopyMsgIndicator"),
    ALLOC_ACCOUNT_TYPE(798, "AllocAccountType"),
    ORDER_AVG_PX(799, "OrderAvgPx"),
    ORDER_BOOKING_QTY(800, "OrderBookingQty"),


    // 801-900

    NO_SETTL_PARTY_SUB_IDS(801, "NoSettlPartySubIDs"),
    NO_PARTY_SUB_IDS(802, "NoPartySubIDs"),
    PARTY_SUB_ID_TYPE(803, "PartySubIDType"),
    NO_NESTED_PARTY_SUB_IDS(804, "NoNestedPartySubIDs"),
    NESTED_PARTY_SUB_ID_TYPE(805, "NestedPartySubIDType"),
    NO_NESTED_2_PARTY_SUB_IDS(806, "NoNested2PartySubIDs"),
    NESTED_2_PARTY_SUB_ID_TYPE(807, "Nested2PartySubIDType"),
    ALLOC_INTERMED_REQ_TYPE(808, "AllocIntermedReqType"),
    UNDERLYING_PX(810, "UnderlyingPx"),

    PRICE_DELTA(811, "PriceDelta"),
    APPL_QUEUE_MAX(812, "ApplQueueMax"),
    APPL_QUEUE_DEPTH(813, "ApplQueueDepth"),
    APPL_QUEUE_RESOLUTION(814, "ApplQueueResolution"),
    APPL_QUEUE_ACTION(815, "ApplQueueAction"),
    NO_ALT_MD_SOURCE(816, "NoAltMDSource"),
    ALT_MD_SOURCE_ID(817, "AltMDSourceID"),
    SECONDARY_TRADE_REPORT_ID(818, "SecondaryTradeReportID"),
    AVG_PX_INDICATOR(819, "AvgPxIndicator"),
    TRADE_LINK_ID(820, "TradeLinkID"),

    ORDER_INPUT_DEVICE(821, "OrderInputDevice"),
    UNDERLYING_TRADING_SESSION_ID(822, "UnderlyingTradingSessionID"),
    UNDERLYING_TRADING_SESSION_SUB_ID(823, "UnderlyingTradingSessionSubID"),
    TRADE_LEG_REF_ID(824, "TradeLegRefID"),
    EXCHANGE_RULE(825, "ExchangeRule"),
    TRADE_ALLOC_INDICATOR(826, "TradeAllocIndicator"),
    EXPIRATION_CYCLE(827, "ExpirationCycle"),
    TRD_TYPE(828, "TrdType"),
    TRD_SUB_TYPE(829, "TrdSubType"),
    TRANSFER_REASON(830, "TransferReason"),

    ASGN_REQ_ID(831, "AsgnReqID"),
    TOT_NUM_ASSIGNMENT_REPORTS(832, "TotNumAssignmentReports"),
    ASGN_RPT_ID(833, "AsgnRptID"),
    THRESHOLD_AMOUNT(834, "ThresholdAmount"),
    PEG_MOVE_TYPE(835, "PegMoveType"),
    PEG_OFFSET_TYPE(836, "PegOffsetType"),
    PEG_LIMIT_TYPE(837, "PegLimitType"),
    PEG_ROUND_DIRECTION(838, "PegRoundDirection"),
    PEGGED_PRICE(839, "PeggedPrice"),
    PEG_SCOPE(840, "PegScope"),

    DISCRETION_MOVE_TYPE(841, "DiscretionMoveType"),
    DISCRETION_OFFSET_TYPE(842, "DiscretionOffsetType"),
    DISCRETION_LIMIT_TYPE(843, "DiscretionLimitType"),
    DISCRETION_ROUND_DIRECTION(844, "DiscretionRoundDirection"),
    DISCRETION_PRICE(845, "DiscretionPrice"),
    DISCRETION_SCOPE(846, "DiscretionScope"),
    TARGET_STRATEGY(847, "TargetStrategy"),
    TARGET_STRATEGY_PARAMETERS(848, "TargetStrategyParameters"),
    PARTICIPATION_RATE(849, "ParticipationRate"),
    TARGET_STRATEGY_PERFORMANCE(850, "TargetStrategyPerformance"),

    LAST_LIQUIDITY_IND(851, "LastLiquidityInd"),
    PUBLISH_TRD_INDICATOR(852, "PublishTrdIndicator"),
    SHORT_SALE_REASON(853, "ShortSaleReason"),
    QTY_TYPE(854, "QtyType"),
    SECONDARY_TRD_TYPE(855, "SecondaryTrdType"),
    TRADE_REPORT_TYPE(856, "TradeReportType"),
    ALLOC_NO_ORDERS_TYPE(857, "AllocNoOrdersType"),
    SHARED_COMMISSION(858, "SharedCommission"),
    CONFIRM_REQ_ID(859, "ConfirmReqID"),
    AVG_PAR_PX(860, "AvgParPx"),

    REPORTED_PX(861, "ReportedPx"),
    NO_CAPACITIES(862, "NoCapacities"),
    ORDER_CAPACITY_QTY(863, "OrderCapacityQty"),
    NO_EVENTS(864, "NoEvents"),
    EVENT_TYPE(865, "EventType"),
    EVENT_DATE(866, "EventDate"),
    EVENT_PX(867, "EventPx"),
    EVENT_TEXT(868, "EventText"),
    PCT_AT_RISK(869, "PctAtRisk"),
    NO_INSTR_ATTRIB(870, "NoInstrAttrib"),

    INSTR_ATTRIB_TYPE(871, "InstrAttribType"),
    INSTR_ATTRIB_VALUE(872, "InstrAttribValue"),
    DATED_DATE(873, "DatedDate"),
    INTEREST_ACCRUAL_DATE(874, "InterestAccrualDate"),
    CP_PROGRAM(875, "CPProgram"),
    CP_REG_TYPE(876, "CPRegType"),
    UNDERLYING_CP_PROGRAM(877, "UnderlyingCPProgram"),
    UNDERLYING_CP_REGTYPE(878, "UnderlyingCPRegType"),
    UNDERLYING_QTY(879, "UnderlyingQty"),
    TRD_MATCH_ID(880, "TrdMatchID"),

    SECONDARY_TRADE_REPORT_REF_ID(881, "SecondaryTradeReportRefID"),
    UNDERLYING_DIRTY_PRICE(882, "UnderlyingDirtyPrice"),
    UNDERLYING_END_PRICE(883, "UnderlyingEndPrice"),
    UNDERLYING_START_VALUE(884, "UnderlyingStartValue"),
    UNDERLYING_CURRENT_VALUE(885, "UnderlyingCurrentValue"),
    UNDERLYING_END_VALUE(886, "UnderlyingEndValue"),
    NO_UNDERLYING_STIPS(887, "NoUnderlyingStips"),
    UNDERLYING_STIP_TYPE(888, "UnderlyingStipType"),
    UNDERLYING_STIP_VALUE(889, "UnderlyingStipValue"),
    MATURITY_NET_MONEY(890, "MaturityNetMoney"),

    MISC_FEE_BASIS(891, "MiscFeeBasis"),
    TOT_NO_ALLOCS(892, "TotNoAllocs"),
    LAST_FRAGMENT(893, "LastFragment"),
    COLL_REQ_ID(894, "CollReqID"),
    COLL_ASGN_REASON(895, "CollAsgnReason"),
    COLL_INQUIRY_QUALIFIER(896, "CollInquiryQualifier"),
    NO_TRADES(897, "NoTrades"),
    MARGIN_RATIO(898, "MarginRatio"),
    MARGIN_EXCESS(899, "MarginExcess"),
    TOTAL_NET_VALUE(900, "TotalNetValue"),


    // 901-1000

    CASH_OUTSTANDING(901, "CashOutstanding"),
    COLL_ASGN_ID(902, "CollAsgnID"),
    COLL_ASGN_TRANS_TYPE(903, "CollAsgnTransType"),
    COLL_RESP_ID(904, "CollRespID"),
    COLL_ASGN_RESP_TYPE(905, "CollAsgnRespType"),
    COLL_ASGN_REJECT_REASON(906, "CollAsgnRejectReason"),
    COLL_ASGN_REF_ID(907, "CollAsgnRefID"),
    COLL_RPT_ID(908, "CollRptID"),
    COLL_INQUIRY_ID(909, "CollInquiryID"),
    COLL_STATUS(910, "CollStatus"),

    TOT_NUM_REPORTS(911, "TotNumReports"),
    LAST_RPT_REQUESTED(912, "LastRptRequested"),
    AGREEMENT_DESC(913, "AgreementDesc"),
    AGREEMENT_ID(914, "AgreementID"),
    AGREEMENT_DATE(915, "AgreementDate"),
    START_DATE(916, "StartDate"),
    END_DATE(917, "EndDate"),
    AGREEMENT_CURRENCY(918, "AgreementCurrency"),
    DELIVERY_TYPE(919, "DeliveryType"),
    END_ACCRUED_INTEREST_AMT(920, "EndAccruedInterestAmt"),

    START_CASH(921, "StartCash"),
    END_CASH(922, "EndCash"),
    USER_REQUEST_ID(923, "UserRequestID"),
    USER_REQUEST_TYPE(924, "UserRequestType"),
    NEW_PASSWORD(925, "NewPassword"),
    USER_STATUS(926, "UserStatus"),
    USER_STATUS_TEXT(927, "UserStatusText"),
    STATUS_VALUE(928, "StatusValue"),
    STATUS_TEXT(929, "StatusText"),
    REF_COMP_ID(930, "RefCompID"),

    REF_SUB_ID(931, "RefSubID"),
    NETWORK_RESPONSE_ID(932, "NetworkResponseID"),
    NETWORK_REQUEST_ID(933, "NetworkRequestID"),
    LAST_NETWORK_RESPONSE_ID(934, "LastNetworkResponseID"),
    NETWORK_REQUEST_TYPE(935, "NetworkRequestType"),
    NO_COMP_IDS(936, "NoCompIDs"),
    NETWORK_STATUS_RESPONSE_TYPE(937, "NetworkStatusResponseType"),
    NO_COLL_INQUIRY_QUALIFIER(938, "NoCollInquiryQualifier"),
    TRD_RPT_STATUS(939, "TrdRptStatus"),
    AFFIRM_STATUS(940, "AffirmStatus"),

    UNDERLYING_STRIKE_CURRENCY(941, "UnderlyingStrikeCurrency"),
    LEG_STRIKE_CURRENCY(942, "LegStrikeCurrency"),
    TIME_BRACKET(943, "TimeBracket"),
    COLL_ACTION(944, "CollAction"),
    COLL_INQUIRY_STATUS(945, "CollInquiryStatus"),
    COLL_INQUIRY_RESULT(946, "CollInquiryResult"),
    STRIKE_CURRENCY(947, "StrikeCurrency"),
    NO_NESTED_3_PARTY_IDS(948, "NoNested3PartyIDs"),
    NESTED_3_PARTY_ID(949, "Nested3PartyID"),
    NESTED_3_PARTY_ID_SOURCE(950, "Nested3PartyIDSource"),

    NESTED_3_PARTY_ROLE(951, "Nested3PartyRole"),
    NO_NESTED_3_PARTY_SUB_IDS(952, "NoNested3PartySubIDs"),
    NESTED_3_PARTY_SUB_ID(953, "Nested3PartySubID"),
    NESTED_3_PARTY_SUB_ID_TYPE(954, "Nested3PartySubIDType"),
    LEG_CONTRACT_SETTL_MONTH(955, "LegContractSettlMonth"),
    LEG_INTEREST_ACCRUAL_DATE(956, "LegInterestAccrualDate"),
    /*
     *
     * End of FIX4.4
     *
     */


    /*
     * Start of FIX5.0 as defined by the FIX Protocol Specification 5.0
     *  Tags: 957-1139
     */
    NO_STRATEGY_PARAMETERS(957, "NoStrategyParameters"),
    STRATEGY_PARAMETER_NAME(958, "StrategyParameterName"),
    STRATEGY_PARAMETER_TYPE(959, "StrategyParameterType"),
    STRATEGY_PARAMETER_VALUE(960, "StrategyParameterValue"),

    HOST_CROSS_ID(961, "HostCrossID"),
    SIDE_TIME_IN_FORCE(962, "SideTimeInForce"),
    MD_REPORT_ID(963, "MDReportID"),
    SECURITY_REPORT_ID(964, "SecurityReportID"),
    SECURITY_STATUS(965, "SecurityStatus"),
    SETTLE_ON_OPEN_FLAG(966, "SettleOnOpenFlag"),
    STRIKE_MULTIPLIER(967, "StrikeMultiplier"),
    STRIKE_VALUE(968, "StrikeValue"),
    MIN_PRICE_INCREMENT(969, "MinPriceIncrement"),
    POSITION_LIMIT(970, "PositionLimit"),

    NT_POSITION_LIMIT(971, "NTPositionLimit"),
    UNDERLYING_ALLOCATION_PERCENT(972, "UnderlyingAllocationPercent"),
    UNDERLYING_CASH_AMOUNT(973, "UnderlyingCashAmount"),
    UNDERLYING_CASH_TYPE(974, "UnderlyingCashType"),
    UNDERLYING_SETTLEMENT_TYPE(975, "UnderlyingSettlementType"),
    QUANTITY_DATE(976, "QuantityDate"),
    CONT_INT_RPT_ID(977, "ContIntRptID"),
    LATE_INDICATOR(978, "LateIndicator"),
    INPUT_SOURCE(979, "InputSource"),
    SECURITY_UPDATE_ACTION(980, "SecurityUpdateAction"),

    NO_EXPIRATION(981, "NoExpiration"),
    EXP_TYPE(982, "ExpType"),
    EXP_QTY(983, "ExpQty"),
    NO_UNDERLYING_AMOUNTS(984, "NoUnderlyingAmounts"),
    UNDERLYING_PAY_AMOUNT(985, "UnderlyingPayAmount"),
    UNDERLYING_COLLECT_AMOUNT(986, "UnderlyingCollectAmount"),
    UNDERLYING_SETTLEMENT_DATE(987, "UnderlyingSettlementDate"),
    UNDERLYING_SETTLEMENT_STATUS(988, "UnderlyingSettlementStatus"),
    SECONDARY_INDIVIDUAL_ALLOC_ID(989, "SecondaryIndividualAllocID"),
    LEG_REPORT_ID(990, "LegReportID"),

    RND_PX(991, "RndPx"),
    INDIVIDUAL_ALLOC_TYPE(992, "IndividualAllocType"),
    ALLOC_CUSTOMER_CAPACITY(993, "AllocCustomerCapacity"),
    TIER_CODE(994, "TierCode"),
    UNIT_OF_MEASURE(996, "UnitofMeasure"),
    TIME_UNIT(997, "TimeUnit"),
    UNDERLYING_UNIT_OF_MEASURE(998, "UnderlyingUnitofMeasure"),
    LEG_UNIT_OF_MEASURE(999, "LegUnitofMeasure"),
    UNDERLYING_TIME_UNIT(1000, "UnderlyingTimeUnit"),


    // 1001-1100

    LEG_TIME_UNIT(1001, "LegTimeUnit"),
    ALLOC_METHOD(1002, "AllocMethod"),
    TRADE_ID(1003, "TradeID"),
    SIDE_TRADE_REPORT_ID(1005, "SideTradeReportID"),
    SIDE_FILL_STATION_CD(1006, "SideFillStationCd"),
    SIDE_REASON_CD(1007, "SideReasonCd"),
    SIDE_TRD_SUB_TYP(1008, "SideTrdSubTyp"),
    SIDE_QTY(1009, "SideQty"),

    MESSAGE_EVENT_SOURCE(1011, "MessageEventSource"),
    SIDE_TRD_REG_TIMESTAMP(1012, "SideTrdRegTimestamp"),
    SIDE_TRD_REG_TIMESTAMP_TYPE(1013, "SideTrdRegTimestampType"),
    SIDE_TRD_REG_TIMESTAMP_SRC(1014, "SideTrdRegTimestampSrc"),
    AS_OF_INDICATOR(1015, "AsOfIndicator"),
    NO_SIDE_TRD_REG_TS(1016, "NoSideTrdRegTS"),
    LEG_OPTION_RATIO(1017, "LegOptionRatio"),
    NO_INSTRUMENT_PARTIES(1018, "NoInstrumentParties"),
    INSTRUMENT_PARTY_ID(1019, "InstrumentPartyID"),
    TRADE_VOLUME(1020, "TradeVolume"),

    MD_BOOK_TYPE(1021, "MDBookType"),
    MD_FEED_TYPE(1022, "MDFeedType"),
    MD_PRICE_LEVEL(1023, "MDPriceLevel"),
    MD_ORIGIN_TYPE(1024, "MDOriginType"),
    FIRST_PX(1025, "FirstPx"),
    MD_ENTRY_SPOT_RATE(1026, "MDEntrySpotRate"),
    MD_ENTRY_FORWARD_POINTS(1027, "MDEntryForwardPoints"),
    MANUAL_ORDER_INDICATOR(1028, "ManualOrderIndicator"),
    CUST_DIRECTED_ORDER(1029, "CustDirectedOrder"),
    RECEIVED_DEPT_ID(1030, "ReceivedDeptID"),

    CUST_ORDER_HANDLING_INST(1031, "CustOrderHandlingInst"),
    ORDER_HANDLING_INST_SOURCE(1032, "OrderHandlingInstSource"),
    DESK_TYPE(1033, "DeskType"),
    DESK_TYPE_SOURCE(1034, "DeskTypeSource"),
    DESK_ORDER_HANDLING_INST(1035, "DeskOrderHandlingInst"),
    EXEC_ACK_STATUS(1036, "ExecAckStatus"),
    UNDERLYING_DELIVERY_AMOUNT(1037, "UnderlyingDeliveryAmount"),
    UNDERLYING_CAP_VALUE(1038, "UnderlyingCapValue"),
    UNDERLYING_SETTL_METHOD(1039, "UnderlyingSettlMethod"),
    SECONDARY_TRADE_ID(1040, "SecondaryTradeID"),

    FIRM_TRADE_ID(1041, "FirmTradeID"),
    SECONDARY_FIRM_TRADE_ID(1042, "SecondaryFirmTradeID"),
    COLL_APPL_TYPE(1043, "CollApplType"),
    UNDERLYING_ADJUSTED_QUANTITY(1044, "UnderlyingAdjustedQuantity"),
    UNDERLYING_FX_RATE(1045, "UnderlyingFXRate"),
    UNDERLYING_FX_RATE_CALC(1046, "UnderlyingFXRateCalc"),
    ALLOC_POSITION_EFFECT(1047, "AllocPositionEffect"),
    DEALING_CAPACITY(1048, "DealingCapacity"),
    INSTRMT_ASSIGNMENT_METHOD(1049, "InstrmtAssignmentMethod"),
    INSTRUMENT_PARTY_ID_SOURCE(1050, "InstrumentPartyIDSource"),

    INSTRUMENT_PARTY_ROLE(1051, "InstrumentPartyRole"),
    NO_INSTRUMENT_PARTY_SUB_IDS(1052, "NoInstrumentPartySubIDs"),
    INSTRUMENT_PARTY_SUB_ID(1053, "InstrumentPartySubID"),
    INSTRUMENT_PARTY_SUB_ID_TYPE(1054, "InstrumentPartySubIDType"),
    POSITION_CURRENCY(1055, "PositionCurrency"),
    CALCULATED_CCY_LAST_QTY(1056, "CalculatedCcyLastQty"),
    AGGRESSOR_INDICATOR(1057, "AggressorIndicator"),
    NO_UNDLY_INSTRUMENT_PARTIES(1058, "NoUndlyInstrumentParties"),
    UNDLY_INSTRUMENT_PARTY_ID(1059, "UndlyInstrumentPartyID"),
    UNDLY_INSTRUMENT_PARTY_ID_SOURCE(1060, "UndlyInstrumentPartyIDSource"),

    UNDLY_INSTRUMENT_PARTY_ROLE(1061, "UndlyInstrumentPartyRole"),
    NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS(1062, "NoUndlyInstrumentPartySubIDs"),
    UNDLY_INSTRUMENT_PARTY_SUB_ID(1063, "UndlyInstrumentPartySubID"),
    UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE(1064, "UndlyInstrumentPartySubIDType"),
    BID_SWAP_POINTS(1065, "BidSwapPoints"),
    OFFER_SWAP_POINTS(1066, "OfferSwapPoints"),
    LEG_BID_FORWARD_POINTS(1067, "LegBidForwardPoints"),
    LEG_OFFER_FORWARD_POINTS(1068, "LegOfferForwardPoints"),
    SWAP_POINTS(1069, "SwapPoints"),
    MD_QUOTE_TYPE(1070, "MDQuoteType"),

    LAST_SWAP_POINTS(1071, "LastSwapPoints"),
    SIDE_GROSS_TRADE_AMT(1072, "SideGrossTradeAmt"),
    LEG_LAST_FORWARD_POINTS(1073, "LegLastForwardPoints"),
    LEG_CALCULATED_CCY_LAST_QTY(1074, "LegCalculatedCcyLastQty"),
    LEG_GROSS_TRADE_AMT(1075, "LegGrossTradeAmt"),
    MATURITY_TIME(1079, "MaturityTime"),
    REF_ORDER_ID(1080, "RefOrderID"),

    REF_ORDER_ID_SOURCE(1081, "RefOrderIDSource"),
    SECONDARY_DISPLAY_QTY(1082, "SecondaryDisplayQty"),
    DISPLAY_WHEN(1083, "DisplayWhen"),
    DISPLAY_METHOD(1084, "DisplayMethod"),
    DISPLAY_LOW_QTY(1085, "DisplayLowQty"),
    DISPLAY_HIGH_QTY(1086, "DisplayHighQty"),
    DISPLAY_MIN_INCR(1087, "DisplayMinIncr"),
    REFRESH_QTY(1088, "RefreshQty"),
    MATCH_INCREMENT(1089, "MatchIncrement"),
    MAX_PRICE_LEVELS(1090, "MaxPriceLevels"),

    PRE_TRADE_ANONYMITY(1091, "PreTradeAnonymity"),
    PRICE_PROTECTION_SCOPE(1092, "PriceProtectionScope"),
    LOT_TYPE(1093, "LotType"),
    PEG_PRICE_TYPE(1094, "PegPriceType"),
    PEGGED_REF_PRICE(1095, "PeggedRefPrice"),
    PEG_SECURITY_ID_SOURCE(1096, "PegSecurityIDSource"),
    PEG_SECURITY_ID(1097, "PegSecurityID"),
    PEG_SYMBOL(1098, "PegSymbol"),
    PEG_SECURITY_DESC(1099, "PegSecurityDesc"),
    TRIGGER_TYPE(1100, "TriggerType"),


    // 1101-1200

    TRIGGER_ACTION(1101, "TriggerAction"),
    TRIGGER_PRICE(1102, "TriggerPrice"),
    TRIGGER_SYMBOL(1103, "TriggerSymbol"),
    TRIGGER_SECURITY_ID(1104, "TriggerSecurityID"),
    TRIGGER_SECURITY_ID_SOURCE(1105, "TriggerSecurityIDSource"),
    TRIGGER_SECURITY_DESC(1106, "TriggerSecurityDesc"),
    TRIGGER_PRICE_TYPE(1107, "TriggerPriceType"),
    TRIGGER_PRICE_TYPE_SCOPE(1108, "TriggerPriceTypeScope"),
    TRIGGER_PRICE_DIRECTION(1109, "TriggerPriceDirection"),
    TRIGGER_NEW_PRICE(1110, "TriggerNewPrice"),

    TRIGGER_ORDER_TYPE(1111, "TriggerOrderType"),
    TRIGGER_NEW_QTY(1112, "TriggerNewQty"),
    TRIGGER_TRADING_SESSION_ID(1113, "TriggerTradingSessionID"),
    TRIGGER_TRADING_SESSION_SUB_ID(1114, "TriggerTradingSessionSubID"),
    ORDER_CATEGORY(1115, "OrderCategory"),
    NO_ROOT_PARTY_IDS(1116, "NoRootPartyIDs"),
    ROOT_PARTY_ID(1117, "RootPartyID"),
    ROOT_PARTY_ID_SOURCE(1118, "RootPartyIDSource"),
    ROOT_PARTY_ROLE(1119, "RootPartyRole"),
    NO_ROOT_PARTY_SUB_IDS(1120, "NoRootPartySubIDs"),

    ROOT_PARTY_SUB_ID(1121, "RootPartySubID"),
    ROOT_PARTY_SUB_ID_TYPE(1122, "RootPartySubIDType"),
    TRADE_HANDLING_INSTR(1123, "TradeHandlingInstr"),
    ORIG_TRADE_HANDLING_INSTR(1124, "OrigTradeHandlingInstr"),
    ORIG_TRADE_DATE(1125, "OrigTradeDate"),
    ORIG_TRADE_ID(1126, "OrigTradeID"),
    ORIG_SECONDARY_TRADE_ID(1127, "OrigSecondaryTradeID"),
    APPL_VER_ID(1128, "ApplVerID"),
    CSTM_APPL_VER_ID(1129, "CstmApplVerID"),
    REF_APPL_VER_ID(1130, "RefApplVerID"),

    REF_CSTM_APPL_VER_ID(1131, "RefCstmApplVerID"),
    TZ_TRANSACT_TIME(1132, "TZTransactTime"),
    EX_DESTINATION_ID_SOURCE(1133, "ExDestinationIDSource"),
    REPORTED_PX_DIFF(1134, "ReportedPxDiff"),
    RPT_SYS(1135, "RptSys"),
    ALLOC_CLEARING_FEE_INDICATOR(1136, "AllocClearingFeeIndicator"),
    DEFAULT_APPL_VER_ID(1137, "DefaultApplVerID"),
    DISPLAY_QTY(1138, "DisplayQty"),
    EXCHANGE_SPECIAL_INSTRUCTIONS(1139, "ExchangeSpecialInstructions");
    /*
     *
     * End of FIX5.0
     *
     */


    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////


    private final int fixNumber;
    private final String fixDescription;

    FIXType(final int fixNumber, final String fixDescription) {
        this.fixNumber = fixNumber;
        this.fixDescription = fixDescription;
    }
    public String getFIXName() {
        return this.name();
    }
    public int getFIXNumber() {
        return fixNumber;
    }
    public String getFIXDescription() {
        return fixDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFIXName())
            .append("=[")
            .append(getFIXNumber())
            .append(",")
            .append(getFIXDescription())
            .append("]");
        return sb.toString();
    }

    /*
     *
     */
    public static void main(String[] args) {

        // 1-100

        /*
         * Start of FIX4.0 as defined by the FIX Protocol Specification 4.0
         *  Tags: 1-140
         */
        System.out.println(FIXType.ACCOUNT);
        System.out.println(FIXType.ADV_ID);
        System.out.println(FIXType.ADV_REF_ID);
        System.out.println(FIXType.ADV_SIDE);
        System.out.println(FIXType.ADV_TRANS_TYPE);
        System.out.println(FIXType.AVG_PX);
        System.out.println(FIXType.BEGIN_SEQ_NO);
        System.out.println(FIXType.BEGIN_STRING);
        System.out.println(FIXType.BODY_LENGTH);
        System.out.println(FIXType.CHECK_SUM);

        System.out.println(FIXType.CL_ORD_ID);
        System.out.println(FIXType.COMMISSION);
        System.out.println(FIXType.COMM_TYPE);
        System.out.println(FIXType.CUM_QTY);
        System.out.println(FIXType.CURRENCY);
        System.out.println(FIXType.END_SEQ_NO);
        System.out.println(FIXType.EXEC_ID);
        System.out.println(FIXType.EXEC_INST);
        System.out.println(FIXType.EXEC_REF_ID);
        System.out.println(FIXType.EXEC_TRANS_TYPE);

        System.out.println(FIXType.HANDL_INST);
        System.out.println(FIXType.ID_SOURCE);
        System.out.println(FIXType.IOI_ID);
        System.out.println(FIXType.IOI_OTH_SVC);
        System.out.println(FIXType.IOI_QLTY_IND);
        System.out.println(FIXType.IOI_REF_ID);
        System.out.println(FIXType.IOI_SHARES);
        System.out.println(FIXType.IOI_TRANS_TYPE);
        System.out.println(FIXType.LAST_CAPACITY);
        System.out.println(FIXType.LAST_MKT);

        System.out.println(FIXType.LAST_PX);
        System.out.println(FIXType.LAST_QTY);
        System.out.println(FIXType.LINES_OF_TEXT);
        System.out.println(FIXType.MSG_SEQ_NUM);
        System.out.println(FIXType.MSG_TYPE);
        System.out.println(FIXType.NEW_SEQ_NO);
        System.out.println(FIXType.ORDER_ID);
        System.out.println(FIXType.ORDER_QTY);
        System.out.println(FIXType.ORD_STATUS);
        System.out.println(FIXType.ORD_TYPE);

        System.out.println(FIXType.ORIG_CL_ORD_ID);
        System.out.println(FIXType.ORIG_TIME);
        System.out.println(FIXType.POSS_DUP_FLAG);
        System.out.println(FIXType.PRICE);
        System.out.println(FIXType.REF_SEQ_NUM);
        System.out.println(FIXType.RELATD_SYM);
        System.out.println(FIXType.RULE_80_A);
        System.out.println(FIXType.SECURITY_ID);
        System.out.println(FIXType.SENDER_COMP_ID);
        System.out.println(FIXType.SENDER_SUB_ID);

        System.out.println(FIXType.SENDING_DATE);
        System.out.println(FIXType.SENDING_TIME);
        System.out.println(FIXType.QUANTITY);
        System.out.println(FIXType.SIDE);
        System.out.println(FIXType.SYMBOL);
        System.out.println(FIXType.TARGET_COMP_ID);
        System.out.println(FIXType.TARGET_SUB_ID);
        System.out.println(FIXType.TEXT);
        System.out.println(FIXType.TIME_IN_FORCE);
        System.out.println(FIXType.TRANSACT_TIME);

        System.out.println(FIXType.URGENCY);
        System.out.println(FIXType.VALID_UNTIL_TIME);
        System.out.println(FIXType.SETTLMNT_TYP);
        System.out.println(FIXType.FUT_SETT_DATE);
        System.out.println(FIXType.SYMBOL_SFX);
        System.out.println(FIXType.LIST_ID);
        System.out.println(FIXType.LIST_SEQ_NO);
        System.out.println(FIXType.TOT_NO_ORDERS);
        System.out.println(FIXType.LIST_EXEC_INST);
        System.out.println(FIXType.ALLOC_ID);

        System.out.println(FIXType.ALLOC_TRANS_TYPE);
        System.out.println(FIXType.REF_ALLOC_ID);
        System.out.println(FIXType.NO_ORDERS);
        System.out.println(FIXType.AVG_PRX_PRECISION);
        System.out.println(FIXType.TRADE_DATE);
        System.out.println(FIXType.EXEC_BROKER);
        System.out.println(FIXType.OPEN_CLOSE);
        System.out.println(FIXType.NO_ALLOCS);
        System.out.println(FIXType.ALLOC_ACCOUNT);
        System.out.println(FIXType.ALLOC_SHARES);

        System.out.println(FIXType.PROCESS_CODE);
        System.out.println(FIXType.NO_RPTS);
        System.out.println(FIXType.RPT_SEQ);
        System.out.println(FIXType.CXL_QTY);
        System.out.println(FIXType.NO_DLVY_INST);
        System.out.println(FIXType.DLVY_INST);
        System.out.println(FIXType.ALLOC_STATUS);
        System.out.println(FIXType.ALLOC_REJ_CODE);
        System.out.println(FIXType.SIGNATURE);
        System.out.println(FIXType.SECURE_DATA_LEN);

        System.out.println(FIXType.SECURE_DATA);
        System.out.println(FIXType.BROKER_OF_CREDIT);
        System.out.println(FIXType.SIGNATURE_LENGTH);
        System.out.println(FIXType.EMAIL_TYPE);
        System.out.println(FIXType.RAW_DATA_LENGTH);
        System.out.println(FIXType.RAW_DATA);
        System.out.println(FIXType.POSS_RESEND);
        System.out.println(FIXType.ENCRYPT_METHOD);
        System.out.println(FIXType.STOP_PX);
        System.out.println(FIXType.EX_DESTINATION);


        // 101-200

        System.out.println(CXL_REJ_REASON);
        System.out.println(ORD_REJ_REASON);
        System.out.println(IOI_QUALIFIER);
        System.out.println(WAVE_NO);
        System.out.println(ISSUER);
        System.out.println(SECURITY_DESC);
        System.out.println(HEART_BT_INT);
        System.out.println(CLIENT_ID);
        System.out.println(MIN_QTY);

        System.out.println(MAX_FLOOR);
        System.out.println(TEST_REQ_ID);
        System.out.println(REPORT_TO_EXCH);
        System.out.println(LOCATE_REQD);
        System.out.println(ON_BEHALF_OF_COMP_ID);
        System.out.println(ON_BEHALF_OF_SUB_ID);
        System.out.println(QUOTE_ID);
        System.out.println(NET_MONEY);
        System.out.println(SETTL_CURR_AMT);
        System.out.println(SETTL_CURRENCY);

        System.out.println(FOREX_REQ);
        System.out.println(ORIG_SENDING_TIME);
        System.out.println(GAP_FILL_FLAG);
        System.out.println(NO_EXECS);
        System.out.println(CXL_TYPE);
        System.out.println(EXPIRE_TIME);
        System.out.println(DK_REASON);
        System.out.println(DELIVER_TO_COMP_ID);
        System.out.println(DELIVER_TO_SUB_ID);
        System.out.println(IOI_NATURAL_FLAG);

        System.out.println(QUOTE_REQ_ID);
        System.out.println(BID_PX);
        System.out.println(OFFER_PX);
        System.out.println(BID_SIZE);
        System.out.println(OFFER_SIZE);
        System.out.println(NO_MISC_FEES);
        System.out.println(MISC_FEE_AMT);
        System.out.println(MISC_FEE_CURR);
        System.out.println(MISC_FEE_TYPE);
        System.out.println(PREV_CLOSE_PX);
        /*
         *
         * End of FIX4.0
         *
         */


        /*
         * Start of FIX4.2 as defined by the FIX Protocol Specification 4.2
         *  Tags: 141-446
         */
        System.out.println(RESET_SEQ_NUM_FLAG);
        System.out.println(SENDER_LOCATION_ID);
        System.out.println(TARGET_LOCATION_ID);
        System.out.println(ON_BEHALF_OF_LOCATION_ID);
        System.out.println(DELIVER_TO_LOCATION_ID);
        System.out.println(NO_RELATED_SYM);
        System.out.println(SUBJECT);
        System.out.println(HEADLINE);
        System.out.println(URL_LINK);
        System.out.println(EXEC_TYPE);

        System.out.println(LEAVES_QTY);
        System.out.println(CASH_ORDER_QTY);
        System.out.println(ALLOC_AVG_PX);
        System.out.println(ALLOC_NET_MONEY);
        System.out.println(SETTL_CURR_FX_RATE);
        System.out.println(SETTL_CURR_FX_RATE_CALC);
        System.out.println(NUM_DAYS_INTEREST);
        System.out.println(ACCRUED_INTEREST_RATE);
        System.out.println(ACCRUED_INTEREST_AMT);
        System.out.println(SETTL_INST_MODE);

        System.out.println(ALLOC_TEXT);
        System.out.println(SETTL_INST_ID);
        System.out.println(SETTL_INST_TRANS_TYPE);
        System.out.println(EMAIL_THREAD_ID);
        System.out.println(SETTL_INST_SOURCE);
        System.out.println(SETTL_LOCATION);
        System.out.println(SECURITY_TYPE);
        System.out.println(EFFECTIVE_TIME);
        System.out.println(STAND_INST_DB_TYPE);
        System.out.println(STAND_INST_DB_NAME);

        System.out.println(STAND_INST_DB_ID);
        System.out.println(SETTL_DELIVERY_TYPE);
        System.out.println(SETTL_DEPOSITORY_CODE);
        System.out.println(SETTL_BRKR_CODE);
        System.out.println(SETTL_INST_CODE);
        System.out.println(SECURITY_SETTL_AGENT_NAME);
        System.out.println(SECURITY_SETTL_AGENT_CODE);
        System.out.println(SECURITY_SETTL_AGENT_ACCT_NUM);
        System.out.println(SECURITY_SETTL_AGENT_ACCT_NAME);
        System.out.println(SECURITY_SETTL_AGENT_CONTACT_NAME);

        System.out.println(SECURITY_SETTL_AGENT_CONTACT_PHONE);
        System.out.println(CASH_SETTL_AGENT_NAME);
        System.out.println(CASH_SETTL_AGENT_CODE);
        System.out.println(CASH_SETTL_AGENT_ACCT_NUM);
        System.out.println(CASH_SETTL_AGENT_ACCT_NAME);
        System.out.println(CASH_SETTL_AGENT_CONTACT_NAME);
        System.out.println(CASH_SETTL_AGENT_CONTACT_PHONE);
        System.out.println(BID_SPOT_RATE);
        System.out.println(BID_FORWARD_POINTS);
        System.out.println(OFFER_SPOT_RATE);

        System.out.println(OFFER_FORWARD_POINTS);
        System.out.println(ORDER_QTY_2);
        System.out.println(FUT_SETT_DATE_2);
        System.out.println(LAST_SPOT_RATE);
        System.out.println(LAST_FORWARD_POINTS);
        System.out.println(ALLOC_LINK_ID);
        System.out.println(ALLOC_LINK_TYPE);
        System.out.println(SECONDARY_ORDER_ID);
        System.out.println(NO_IOI_QUALIFIERS);
        System.out.println(MATURITY_MONTH_YEAR);


        // 201-300

        System.out.println(PUT_OR_CALL);
        System.out.println(STRIKE_PRICE);
        System.out.println(COVERED_OR_UNCOVERED);
        System.out.println(CUSTOMER_OR_FIRM);
        System.out.println(MATURITY_DAY);
        System.out.println(OPT_ATTRIBUTE);
        System.out.println(SECURITY_EXCHANGE);
        System.out.println(NOTIFY_BROKER_OF_CREDIT);
        System.out.println(ALLOC_HANDL_INST);
        System.out.println(MAX_SHOW);

        System.out.println(PEG_DIFFERENCE);
        System.out.println(XML_DATA_LEN);
        System.out.println(XML_DATA);
        System.out.println(SETTL_INST_REF_ID);
        System.out.println(NO_ROUTING_IDS);
        System.out.println(ROUTING_TYPE);
        System.out.println(ROUTING_ID);
        System.out.println(SPREAD_TO_BENCHMARK);
        System.out.println(BENCHMARK);
        System.out.println(BENCHMARK_CURVE_CURRENCY);

        System.out.println(BENCHMARK_CURVE_NAME);
        System.out.println(BENCHMARK_CURVE_POINT);
        System.out.println(COUPON_RATE);
        System.out.println(COUPON_PAYMENT_DATE);
        System.out.println(ISSUE_DATE);
        System.out.println(REPURCHASE_TERM);
        System.out.println(REPURCHASE_RATE);
        System.out.println(FACTOR);
        System.out.println(TRADE_ORIGINATION_DATE);
        System.out.println(EX_DATE);

        System.out.println(CONTRACT_MULTIPLIER);
        System.out.println(NO_STIPULATIONS);
        System.out.println(STIPULATION_TYPE);
        System.out.println(STIPULATION_VALUE);
        System.out.println(YIELD_TYPE);
        System.out.println(YIELD);
        System.out.println(TOTAL_TAKEDOWN);
        System.out.println(CONCESSION);
        System.out.println(REPO_COLLATERAL_SECURITY_TYPE);
        System.out.println(REDEMPTION_DATE);

        System.out.println(UNDERLYING_COUPON_PAYMENT_DATE);
        System.out.println(UNDERLYING_ISSUE_DATE);
        System.out.println(UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
        System.out.println(UNDERLYING_REPURCHASE_TERM);
        System.out.println(UNDERLYING_REPURCHASE_RATE);
        System.out.println(UNDERLYING_FACTOR);
        System.out.println(UNDERLYING_REDEMPTION_DATE);
        System.out.println(LEG_COUPON_PAYMENT_DATE);
        System.out.println(LEG_ISSUE_DATE);
        System.out.println(LEG_REPO_COLLATERAL_SECURITY_TYPE);

        System.out.println(LEG_REPURCHASE_TERM);
        System.out.println(LEG_REPURCHASE_RATE);
        System.out.println(LEG_FACTOR);
        System.out.println(LEG_REDEMPTION_DATE);
        System.out.println(CREDIT_RATING);
        System.out.println(UNDERLYING_CREDIT_RATING);
        System.out.println(LEG_CREDIT_RATING);
        System.out.println(TRADED_FLAT_SWITCH);
        System.out.println(BASIS_FEATURE_DATE);
        System.out.println(BASIS_FEATURE_PRICE);

        System.out.println(MD_REQ_ID);
        System.out.println(SUBSCRIPTION_REQUEST_TYPE);
        System.out.println(MARKET_DEPTH);
        System.out.println(MD_UPDATE_TYPE);
        System.out.println(AGGREGATED_BOOK);
        System.out.println(NO_MD_ENTRY_TYPES);
        System.out.println(NO_MD_ENTRIES);
        System.out.println(MD_ENTRY_TYPE);
        System.out.println(MD_ENTRY_PX);

        System.out.println(MD_ENTRY_SIZE);
        System.out.println(MD_ENTRY_DATE);
        System.out.println(MD_ENTRY_TIME);
        System.out.println(TICK_DIRECTION);
        System.out.println(MD_MKT);
        System.out.println(QUOTE_CONDITION);
        System.out.println(TRADE_CONDITION);
        System.out.println(MD_ENTRY_ID);
        System.out.println(MD_UPDATE_ACTION);
        System.out.println(MD_ENTRY_REF_ID);

        System.out.println(MD_REQ_REJ_REASON);
        System.out.println(MD_ENTRY_ORIGINATOR);
        System.out.println(LOCATION_ID);
        System.out.println(DESK_ID);
        System.out.println(DELETE_REASON);
        System.out.println(OPEN_CLOSE_SETTLE_FLAG);
        System.out.println(SELLER_DAYS);
        System.out.println(MD_ENTRY_BUYER);
        System.out.println(MD_ENTRY_SELLER);
        System.out.println(MD_ENTRY_POSITION_NO);

        System.out.println(FINANCIAL_STATUS);
        System.out.println(CORPORATE_ACTION);
        System.out.println(DEF_BID_SIZE);
        System.out.println(DEF_OFFER_SIZE);
        System.out.println(NO_QUOTE_ENTRIES);
        System.out.println(NO_QUOTE_SETS);
        System.out.println(QUOTE_ACK_STATUS);
        System.out.println(QUOTE_CANCEL_TYPE);
        System.out.println(QUOTE_ENTRY_ID);
        System.out.println(QUOTE_REJECT_REASON);


        // 301-400

        System.out.println(QUOTE_RESPONSE_LEVEL);
        System.out.println(QUOTE_SET_ID);
        System.out.println(QUOTE_REQUEST_TYPE);
        System.out.println(TOT_QUOTE_ENTRIES);
        System.out.println(UNDERLYING_ID_SOURCE);
        System.out.println(UNDERLYING_ISSUER);
        System.out.println(UNDERLYING_SECURITY_DESC);
        System.out.println(UNDERLYING_SECURITY_EXCHANGE);
        System.out.println(UNDERLYING_SECURITY_ID);
        System.out.println(UNDERLYING_SECURITY_TYPE);

        System.out.println(UNDERLYING_SYMBOL);
        System.out.println(UNDERLYING_SYMBOL_SFX);
        System.out.println(UNDERLYING_MATURITY_MONTH_YEAR);
        System.out.println(UNDERLYING_MATURITY_DAY);
        System.out.println(UNDERLYING_PUT_OR_CALL);
        System.out.println(UNDERLYING_STRIKE_PRICE);
        System.out.println(UNDERLYING_OPT_ATTRIBUTE);
        System.out.println(UNDERLYING_CURRENCY);
        System.out.println(RATIO_QTY);
        System.out.println(SECURITY_REQ_ID);

        System.out.println(SECURITY_REQUEST_TYPE);
        System.out.println(SECURITY_RESPONSE_ID);
        System.out.println(SECURITY_RESPONSE_TYPE);
        System.out.println(SECURITY_STATUS_REQ_ID);
        System.out.println(UNSOLICITED_INDICATOR);
        System.out.println(SECURITY_TRADING_STATUS);
        System.out.println(HALT_REASON);
        System.out.println(IN_VIEW_OF_COMMON);
        System.out.println(DUE_TO_RELATED);
        System.out.println(BUY_VOLUME);

        System.out.println(SELL_VOLUME);
        System.out.println(HIGH_PX);
        System.out.println(LOW_PX);
        System.out.println(ADJUSTMENT);
        System.out.println(TRAD_SES_REQ_ID);
        System.out.println(TRADING_SESSION_ID);
        System.out.println(CONTRA_TRADER);
        System.out.println(TRAD_SES_METHOD);
        System.out.println(TRAD_SES_MODE);
        System.out.println(TRAD_SES_STATUS);

        System.out.println(TRAD_SES_START_TIME);
        System.out.println(TRAD_SES_OPEN_TIME);
        System.out.println(TRAD_SES_PRE_CLOSE_TIME);
        System.out.println(TRAD_SES_CLOSE_TIME);
        System.out.println(TRAD_SES_END_TIME);
        System.out.println(NUMBER_OF_ORDERS);
        System.out.println(MESSAGE_ENCODING);
        System.out.println(ENCODED_ISSUER_LEN);
        System.out.println(ENCODED_ISSUER);
        System.out.println(ENCODED_SECURITY_DESC_LEN);

        System.out.println(ENCODED_SECURITY_DESC);
        System.out.println(ENCODED_LIST_EXEC_INST_LEN);
        System.out.println(ENCODED_LIST_EXEC_INST);
        System.out.println(ENCODED_TEXT_LEN);
        System.out.println(ENCODED_TEXT);
        System.out.println(ENCODED_SUBJECT_LEN);
        System.out.println(ENCODED_SUBJECT);
        System.out.println(ENCODED_HEADLINE_LEN);
        System.out.println(ENCODED_HEADLINE);
        System.out.println(ENCODED_ALLOC_TEXT_LEN);

        System.out.println(ENCODED_ALLOC_TEXT);
        System.out.println(ENCODED_UNDERLYING_ISSUER_LEN);
        System.out.println(ENCODED_UNDERLYING_ISSUER);
        System.out.println(ENCODED_UNDERLYING_SECURITY_DESC_LEN);
        System.out.println(ENCODED_UNDERLYING_SECURITY_DESC);
        System.out.println(ALLOC_PRICE);
        System.out.println(QUOTE_SET_VALID_UNTIL_TIME);
        System.out.println(QUOTE_ENTRY_REJECT_REASON);
        System.out.println(LAST_MSG_SEQ_NUM_PROCESSED);
        System.out.println(ON_BEHALF_OF_SENDING_TIME);

        System.out.println(REF_TAG_ID);
        System.out.println(REF_MSG_TYPE);
        System.out.println(SESSION_REJECT_REASON);
        System.out.println(BID_REQUEST_TRANS_TYPE);
        System.out.println(CONTRA_BROKER);
        System.out.println(COMPLIANCE_ID);
        System.out.println(SOLICITED_FLAG);
        System.out.println(EXEC_RESTATEMENT_REASON);
        System.out.println(BUSINESS_REJECT_REF_ID);
        System.out.println(BUSINESS_REJECT_REASON);

        System.out.println(GROSS_TRADE_AMT);
        System.out.println(NO_CONTRA_BROKERS);
        System.out.println(MAX_MESSAGE_SIZE);
        System.out.println(NO_MSG_TYPES);
        System.out.println(MSG_DIRECTION);
        System.out.println(NO_TRADING_SESSIONS);
        System.out.println(TOTAL_VOLUME_TRADED);
        System.out.println(DISCRETION_INST);
        System.out.println(DISCRETION_OFFSET);
        System.out.println(BID_ID);

        System.out.println(CLIENT_BID_ID);
        System.out.println(LIST_NAME);
        System.out.println(TOTAL_NUM_SECURITIES);
        System.out.println(BID_TYPE);
        System.out.println(NUM_TICKETS);
        System.out.println(SIDE_VALUE1);
        System.out.println(SIDE_VALUE2);
        System.out.println(NO_BID_DESCRIPTORS);
        System.out.println(BID_DESCRIPTOR_TYPE);
        System.out.println(BID_DESCRIPTOR);


        // 401-500

        System.out.println(SIDE_VALUE_IND);
        System.out.println(LIQUIDITY_PCT_LOW);
        System.out.println(LIQUIDITY_PCT_HIGH);
        System.out.println(LIQUIDITY_VALUE);
        System.out.println(EFP_TRACKING_ERROR);
        System.out.println(FAIR_VALUE);
        System.out.println(OUTSIDE_INDEX_PCT);
        System.out.println(VALUE_OF_FUTURES);
        System.out.println(LIQUIDITY_IND_TYPE);
        System.out.println(WT_AVERAGE_LIQUIDITY);

        System.out.println(EXCHANGE_FOR_PHYSICAL);
        System.out.println(OUT_MAIN_CNTRY_U_INDEX);
        System.out.println(CROSS_PERCENT);
        System.out.println(PROG_RPT_REQS);
        System.out.println(PROG_PERIOD_INTERVAL);
        System.out.println(INC_TAX_IND);
        System.out.println(NUM_BIDDERS);
        System.out.println(TRADE_TYPE);
        System.out.println(BASIS_PX_TYPE);
        System.out.println(NO_BID_COMPONENTS);

        System.out.println(COUNTRY);
        System.out.println(TOT_NO_STRIKES);
        System.out.println(PRICE_TYPE);
        System.out.println(DAY_ORDER_QTY);
        System.out.println(DAY_CUM_QTY);
        System.out.println(DAY_AVG_PX);
        System.out.println(GT_BOOKING_INST);
        System.out.println(NO_STRIKES);
        System.out.println(LIST_STATUS_TYPE);
        System.out.println(NET_GROSS_IND);

        System.out.println(LIST_ORDER_STATUS);
        System.out.println(EXPIRE_DATE);
        System.out.println(LIST_EXEC_INST_TYPE);
        System.out.println(CXL_REJ_RESPONSE_TO);
        System.out.println(UNDERLYING_COUPON_RATE);
        System.out.println(UNDERLYING_CONTRACT_MULTIPLIER);
        System.out.println(CONTRA_TRADE_QTY);
        System.out.println(CONTRA_TRADE_TIME);
        System.out.println(CLEARING_FIRM);
        System.out.println(CLEARING_ACCOUNT);

        System.out.println(LIQUIDITY_NUM_SECURITIES);
        System.out.println(MULTI_LEG_REPORTING_TYPE);
        System.out.println(STRIKE_TIME);
        System.out.println(LIST_STATUS_TEXT);
        System.out.println(LIST_STATUS_ENCODED_TEXT_LEN);
        System.out.println(LIST_STATUS_ENCODED_TEXT);
        /*
         *
         * End of FIX4.2
         *
         */


        /*
         * Start of FIX4.3 as defined by the FIX Protocol Specification 4.3
         *  Tags: 447-659
         */
        System.out.println(PARTY_ID_SOURCE);
        System.out.println(PARTY_ID);
        System.out.println(TOTAL_VOLUME_TRADED_DATE);
        System.out.println(TOTAL_VOLUME_TRADED_TIME);

        System.out.println(NET_CHG_PREV_DAY);
        System.out.println(PARTY_ROLE);
        System.out.println(NO_PARTY_IDS);
        System.out.println(NO_SECURITY_ALT_ID);
        System.out.println(SECURITY_ALT_ID);
        System.out.println(SECURITY_ALT_ID_SOURCE);
        System.out.println(NO_UNDERLYING_SECURITY_ALT_ID);
        System.out.println(UNDERLYING_SECURITY_ALT_ID);
        System.out.println(UNDERLYING_SECURITY_ALT_ID_SOURCE);
        System.out.println(PRODUCT);

        System.out.println(CFI_CODE);
        System.out.println(UNDERLYING_PRODUCT);
        System.out.println(UNDERLYING_CFI_CODE);
        System.out.println(TEST_MESSAGE_INDICATOR);
        System.out.println(QUANTITY_TYPE);
        System.out.println(BOOKING_REF_ID);
        System.out.println(INDIVIDUAL_ALLOC_ID);
        System.out.println(ROUNDING_DIRECTION);
        System.out.println(ROUNDING_MODULUS);
        System.out.println(COUNTRY_OF_ISSUE);

        System.out.println(STATE_OR_PROVINCE_OF_ISSUE);
        System.out.println(LOCALE_OF_ISSUE);
        System.out.println(NO_REGIST_DTLS);
        System.out.println(MAILING_DTLS);
        System.out.println(INVESTOR_COUNTRY_OF_RESIDENCE);
        System.out.println(PAYMENT_REF);
        System.out.println(DISTRIB_PAYMENT_METHOD);
        System.out.println(CASH_DISTRIB_CURR);
        System.out.println(COMM_CURRENCY);
        System.out.println(CANCELLATION_RIGHTS);

        System.out.println(MONEY_LAUNDERING_STATUS);
        System.out.println(MAILING_INST);
        System.out.println(TRANS_BKD_TIME);
        System.out.println(EXEC_PRICE_TYPE);
        System.out.println(EXEC_PRICE_ADJUSTMENT);
        System.out.println(DATE_OF_BIRTH);
        System.out.println(TRADE_REPORT_TRANS_TYPE);
        System.out.println(CARD_HOLDER_NAME);
        System.out.println(CARD_NUMBER);
        System.out.println(CARD_EXP_DATE);

        System.out.println(CARD_ISS_NUM);
        System.out.println(PAYMENT_METHOD);
        System.out.println(REGIST_ACCT_TYPE);
        System.out.println(DESIGNATION);
        System.out.println(TAX_ADVANTAGE_TYPE);
        System.out.println(REGIST_REJ_REASON_TEXT);
        System.out.println(FUND_RENEW_WAIV);
        System.out.println(CASH_DISTRIB_AGENT_NAME);
        System.out.println(CASH_DISTRIB_AGENT_CODE);
        System.out.println(CASH_DISTRIB_AGENT_ACCT_NUMBER);


        // 501-600

        System.out.println(CASH_DISTRIB_PAY_REF);
        System.out.println(CASH_DISTRIB_AGENT_ACCT_NAME);
        System.out.println(CARD_START_DATE);
        System.out.println(PAYMENT_DATE);
        System.out.println(PAYMENT_REMITTER_ID);
        System.out.println(REGIST_STATUS);
        System.out.println(REGIST_REJ_REASON_CODE);
        System.out.println(REGIST_REF_ID);
        System.out.println(REGIST_DTLS);
        System.out.println(NO_DISTRIB_INSTS);

        System.out.println(REGIST_EMAIL);
        System.out.println(DISTRIB_PERCENTAGE);
        System.out.println(REGIST_ID);
        System.out.println(REGIST_TRANS_TYPE);
        System.out.println(EXEC_VALUATION_POINT);
        System.out.println(ORDER_PERCENT);
        System.out.println(OWNERSHIP_TYPE);
        System.out.println(NO_CONT_AMTS);
        System.out.println(CONT_AMT_TYPE);
        System.out.println(CONT_AMT_VALUE);

        System.out.println(CONT_AMT_CURR);
        System.out.println(OWNER_TYPE);
        System.out.println(PARTY_SUB_ID);
        System.out.println(NESTED_PARTY_ID);
        System.out.println(NESTED_PARTY_ID_SOURCE);
        System.out.println(SECONDARY_CL_ORD_ID);
        System.out.println(SECONDARY_EXEC_ID);
        System.out.println(ORDER_CAPACITY);
        System.out.println(ORDER_RESTRICTIONS);
        System.out.println(MASS_CANCEL_REQUEST_TYPE);

        System.out.println(MASS_CANCEL_RESPONSE);
        System.out.println(MASS_CANCEL_REJECT_REASON);
        System.out.println(TOTAL_AFFECTED_ORDERS);
        System.out.println(NO_AFFECTED_ORDERS);
        System.out.println(AFFECTED_ORDER_ID);
        System.out.println(AFFECTED_SECONDARY_ORDER_ID);
        System.out.println(QUOTE_TYPE);
        System.out.println(NESTED_PARTY_ROLE);
        System.out.println(NO_NESTED_PARTY_IDS);
        System.out.println(TOTAL_ACCRUED_INTEREST_AMT);

        System.out.println(MATURITY_DATE);
        System.out.println(UNDERLYING_MATURITY_DATE);
        System.out.println(INSTR_REGISTRY);
        System.out.println(CASH_MARGIN);
        System.out.println(NESTED_PARTY_SUB_ID);
        System.out.println(SCOPE);
        System.out.println(MD_IMPLICIT_DELETE);
        System.out.println(CROSS_ID);
        System.out.println(CROSS_TYPE);
        System.out.println(CROSS_PRIORITIZATION);

        System.out.println(ORIG_CROSS_ID);
        System.out.println(NO_SIDES);
        System.out.println(USERNAME);
        System.out.println(PASSWORD);
        System.out.println(NO_LEGS);
        System.out.println(LEG_CURRENCY);
        System.out.println(TOT_NO_SECURITY_TYPES);
        System.out.println(NO_SECURITY_TYPES);
        System.out.println(SECURITY_LIST_REQUEST_TYPE);
        System.out.println(SECURITY_REQUEST_RESULT);

        System.out.println(ROUND_LOT);
        System.out.println(MIN_TRADE_VOL);
        System.out.println(MULTI_LEG_RPT_TYPE_REQ);
        System.out.println(LEG_POSITION_EFFECT);
        System.out.println(LEG_COVERED_OR_UNCOVERED);
        System.out.println(LEG_PRICE);
        System.out.println(TRAD_SES_STATUS_REJ_REASON);
        System.out.println(TRADE_REQUEST_ID);
        System.out.println(TRADE_REQUEST_TYPE);
        System.out.println(PREVIOUSLY_REPORTED);

        System.out.println(TRADE_REPORT_ID);
        System.out.println(TRADE_REPORT_REF_ID);
        System.out.println(MATCH_STATUS);
        System.out.println(MATCH_TYPE);
        System.out.println(ODD_LOT);
        System.out.println(NO_CLEARING_INSTRUCTIONS);
        System.out.println(CLEARING_INSTRUCTION);
        System.out.println(TRADE_INPUT_SOURCE);
        System.out.println(TRADE_INPUT_DEVICE);
        System.out.println(NO_DATES);

        System.out.println(ACCOUNT_TYPE);
        System.out.println(CUST_ORDER_CAPACITY);
        System.out.println(CL_ORD_LINK_ID);
        System.out.println(MASS_STATUS_REQ_ID);
        System.out.println(MASS_STATUS_REQ_TYPE);
        System.out.println(ORIG_ORD_MOD_TIME);
        System.out.println(LEG_SETTL_TYPE);
        System.out.println(LEG_SETTL_DATE);
        System.out.println(DAY_BOOKING_INST);
        System.out.println(BOOKING_UNIT);

        System.out.println(PREALLOC_METHOD);
        System.out.println(UNDERLYING_COUNTRY_OF_ISSUE);
        System.out.println(UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
        System.out.println(UNDERLYING_LOCALE_OF_ISSUE);
        System.out.println(UNDERLYING_INSTR_REGISTRY);
        System.out.println(LEG_COUNTRY_OF_ISSUE);
        System.out.println(LEG_STATE_OR_PROVINCE_OF_ISSUE);
        System.out.println(LEG_LOCALE_OF_ISSUE);
        System.out.println(LEG_INSTR_REGISTRY);
        System.out.println(LEG_SYMBOL);


        // 601-700

        System.out.println(LEG_SYMBOL_SFX);
        System.out.println(LEG_SECURITY_ID);
        System.out.println(LEG_SECURITY_ID_SOURCE);
        System.out.println(NO_LEG_SECURITY_ALT_ID);
        System.out.println(LEG_SECURITY_ALT_ID);
        System.out.println(LEG_SECURITY_ALT_ID_SOURCE);
        System.out.println(LEG_PRODUCT);
        System.out.println(LEG_CFI_CODE);
        System.out.println(LEG_SECURITY_TYPE);
        System.out.println(LEG_MATURITY_MONTH_YEAR);

        System.out.println(LEG_MATURITY_DATE);
        System.out.println(LEG_STRIKE_PRICE);
        System.out.println(LEG_OPT_ATTRIBUTE);
        System.out.println(LEG_CONTRACT_MULTIPLIER);
        System.out.println(LEG_COUPON_RATE);
        System.out.println(LEG_SECURITY_EXCHANGE);
        System.out.println(LEG_ISSUER);
        System.out.println(ENCODED_LEG_ISSUER_LEN);
        System.out.println(ENCODED_LEG_ISSUER);
        System.out.println(LEG_SECURITY_DESC);

        System.out.println(ENCODED_LEG_SECURITY_DESC_LEN);
        System.out.println(ENCODED_LEG_SECURITY_DESC);
        System.out.println(LEG_RATIO_QTY);
        System.out.println(LEG_SIDE);
        System.out.println(TRADING_SESSION_SUB_ID);
        System.out.println(ALLOC_TYPE);
        System.out.println(NO_HOPS);
        System.out.println(HOP_COMP_ID);
        System.out.println(HOP_SENDING_TIME);
        System.out.println(HOP_REF_ID);

        System.out.println(MID_PX);
        System.out.println(BID_YIELD);
        System.out.println(MID_YIELD);
        System.out.println(OFFER_YIELD);
        System.out.println(CLEARING_FEE_INDICATOR);
        System.out.println(WORKING_INDICATOR);
        System.out.println(LEG_LAST_PX);
        System.out.println(PRIORITY_INDICATOR);
        System.out.println(PRICE_IMPROVEMENT);
        System.out.println(PRICE_2);

        System.out.println(LAST_FORWARD_POINTS_2);
        System.out.println(BID_FORWARD_POINTS_2);
        System.out.println(OFFER_FORWARD_POINTS_2);
        System.out.println(RFQ_REQ_ID);
        System.out.println(MKT_BID_PX);
        System.out.println(MKT_OFFER_PX);
        System.out.println(MIN_BID_SIZE);
        System.out.println(MIN_OFFER_SIZE);
        System.out.println(QUOTE_STATUS_REQ_ID);
        System.out.println(LEGAL_CONFIRM);

        System.out.println(UNDERLYING_LAST_PX);
        System.out.println(UNDERLYING_LAST_QTY);
        System.out.println(SEC_DEF_STATUS);
        System.out.println(LEG_REF_ID);
        System.out.println(CONTRA_LEG_REF_ID);
        System.out.println(SETTL_CURR_BID_FX_RATE);
        System.out.println(SETTL_CURR_OFFER_FX_RATE);
        System.out.println(QUOTE_REQUEST_REJECT_REASON);
        System.out.println(SIDE_COMPLIANCE_ID);
        /*
         *
         * End of FIX4.3
         *
         */


        /*
         * Start of FIX4.4 as defined by the FIX Protocol Specification 4.4
         *  Tags: 660-956
         */
        System.out.println(ACCT_ID_SOURCE);

        System.out.println(ALLOC_ACCT_ID_SOURCE);
        System.out.println(BENCHMARK_PRICE);
        System.out.println(BENCHMARK_PRICE_TYPE);
        System.out.println(CONFIRM_ID);
        System.out.println(CONFIRM_STATUS);
        System.out.println(CONFIRM_TRANS_TYPE);
        System.out.println(CONTRACT_SETTL_MONTH);
        System.out.println(DELIVERY_FORM);
        System.out.println(LAST_PAR_PX);
        System.out.println(NO_LEG_ALLOCS);

        System.out.println(LEG_ALLOC_ACCOUNT);
        System.out.println(LEG_INDIVIDUAL_ALLOC_ID);
        System.out.println(LEG_ALLOC_QTY);
        System.out.println(LEG_ALLOC_ACCT_ID_SOURCE);
        System.out.println(LEG_SETTL_CURRENCY);
        System.out.println(LEG_BENCHMARK_CURVE_CURRENCY);
        System.out.println(LEG_BENCHMARK_CURVE_NAME);
        System.out.println(LEG_BENCHMARK_CURVE_POINT);
        System.out.println(LEG_BENCHMARK_PRICE);
        System.out.println(LEG_BENCHMARK_PRICE_TYPE);

        System.out.println(LEG_BID_PX);
        System.out.println(LEG_IOI_QTY);
        System.out.println(NO_LEG_STIPULATIONS);
        System.out.println(LEG_OFFER_PX);
        System.out.println(LEG_ORDER_QTY);
        System.out.println(LEG_PRICE_TYPE);
        System.out.println(LEG_QTY);
        System.out.println(LEG_STIPULATION_TYPE);
        System.out.println(LEG_STIPULATION_VALUE);
        System.out.println(LEG_SWAP_TYPE);

        System.out.println(POOL);
        System.out.println(QUOTE_PRICE_TYPE);
        System.out.println(QUOTE_RESP_ID);
        System.out.println(QUOTE_RESP_TYPE);
        System.out.println(QUOTE_QUALIFIER);
        System.out.println(YIELD_REDEMPTION_DATE);
        System.out.println(YIELD_REDEMPTION_PRICE);
        System.out.println(YIELD_REDEMPTION_PRICE_TYPE);
        System.out.println(BENCHMARK_SECURITY_ID);
        System.out.println(REVERSAL_INDICATOR);


        // 701-800

        System.out.println(YIELD_CALC_DATE);
        System.out.println(NO_POSITIONS);
        System.out.println(POS_TYPE);
        System.out.println(LONG_QTY);
        System.out.println(SHORT_QTY);
        System.out.println(POS_QTY_STATUS);
        System.out.println(POS_AMT_TYPE);
        System.out.println(POS_AMT);
        System.out.println(POS_TRANS_TYPE);
        System.out.println(POS_REQ_ID);

        System.out.println(NO_UNDERLYINGS);
        System.out.println(POS_MAINT_ACTION);
        System.out.println(ORIG_POS_REQ_REF_ID);
        System.out.println(POS_MAINT_RPT_REF_ID);
        System.out.println(CLEARING_BUSINESS_DATE);
        System.out.println(SETTL_SESS_ID);
        System.out.println(SETTL_SESS_SUB_ID);
        System.out.println(ADJUSTMENT_TYPE);
        System.out.println(CONTRARY_INSTRUCTION_INDICATOR);
        System.out.println(PRIOR_SPREAD_INDICATOR);

        System.out.println(POS_MAINT_RPT_ID);
        System.out.println(POS_MAINT_STATUS);
        System.out.println(POS_MAINT_RESULT);
        System.out.println(POS_REQ_TYPE);
        System.out.println(RESPONSE_TRANSPORT_TYPE);
        System.out.println(RESPONSE_DESTINATION);
        System.out.println(TOTAL_NUM_POS_REPORTS);
        System.out.println(POS_REQ_RESULT);
        System.out.println(POS_REQ_STATUS);
        System.out.println(SETTL_PRICE);

        System.out.println(SETTL_PRICE_TYPE);
        System.out.println(UNDERLYING_SETTL_PRICE);
        System.out.println(UNDERLYING_SETTL_PRICE_TYPE);
        System.out.println(PRIOR_SETTL_PRICE);
        System.out.println(NO_QUOTE_QUALIFIERS);
        System.out.println(ALLOC_SETTL_CURRENCY);
        System.out.println(ALLOC_SETTL_CURR_AMT);
        System.out.println(INTEREST_AT_MATURITY);
        System.out.println(LEG_DATED_DATE);
        System.out.println(LEG_POOL);

        System.out.println(ALLOC_INTEREST_AT_MATURITY);
        System.out.println(ALLOC_ACCRUED_INTEREST_AMT);
        System.out.println(DELIVERY_DATE);
        System.out.println(ASSIGNMENT_METHOD);
        System.out.println(ASSIGNMENT_UNIT);
        System.out.println(OPEN_INTEREST);
        System.out.println(EXERCISE_METHOD);
        System.out.println(TOT_NUM_TRADE_REPORTS);
        System.out.println(TRADE_REQUEST_RESULT);
        System.out.println(TRADE_REQUEST_STATUS);

        System.out.println(TRADE_REPORT_REJECT_REASON);
        System.out.println(SIDE_MULTI_LEG_REPORTING_TYPE);
        System.out.println(NO_POS_AMT);
        System.out.println(AUTO_ACCEPT_INDICATOR);
        System.out.println(ALLOC_REPORT_ID);
        System.out.println(NO_NESTED_2_PARTY_IDS);
        System.out.println(NESTED_2_PARTY_ID);
        System.out.println(NESTED_2_PARTY_ID_SOURCE);
        System.out.println(NESTED_2_PARTY_ROLE);
        System.out.println(NESTED_2_PARTY_SUB_ID);

        System.out.println(BENCHMARK_SECURITY_ID_SOURCE);
        System.out.println(SECURITY_SUB_TYPE);
        System.out.println(UNDERLYING_SECURITY_SUB_TYPE);
        System.out.println(LEG_SECURITY_SUB_TYPE);
        System.out.println(ALLOWABLE_ONE_SIDEDNESS_PCT);
        System.out.println(ALLOWABLE_ONE_SIDEDNESS_VALUE);
        System.out.println(ALLOWABLE_ONE_SIDEDNESS_CURR);
        System.out.println(NO_TRD_REG_TIMESTAMPS);
        System.out.println(TRD_REG_TIMESTAMP);
        System.out.println(TRD_REG_TIMESTAMP_TYPE);

        System.out.println(TRD_REG_TIMESTAMP_ORIGIN);
        System.out.println(CONFIRM_REF_ID);
        System.out.println(CONFIRM_TYPE);
        System.out.println(CONFIRM_REJ_REASON);
        System.out.println(BOOKING_TYPE);
        System.out.println(INDIVIDUAL_ALLOC_REJ_CODE);
        System.out.println(SETTL_INST_MSG_ID);
        System.out.println(NO_SETTL_INST);
        System.out.println(LAST_UPDATE_TIME);
        System.out.println(ALLOC_SETTL_INST_TYPE);

        System.out.println(NO_SETTL_PARTY_IDS);
        System.out.println(SETTL_PARTY_ID);
        System.out.println(SETTL_PARTY_ID_SOURCE);
        System.out.println(SETTL_PARTY_ROLE);
        System.out.println(SETTL_PARTY_SUB_ID);
        System.out.println(SETTL_PARTY_SUB_ID_TYPE);
        System.out.println(DLVY_INST_TYPE);
        System.out.println(TERMINATION_TYPE);
        System.out.println(NEXT_EXPECTED_MSG_SEQ_NUM);
        System.out.println(ORD_STATUS_REQ_ID);

        System.out.println(SETTL_INST_REQ_ID);
        System.out.println(SETTL_INST_REQ_REJ_CODE);
        System.out.println(SECONDARY_ALLOC_ID);
        System.out.println(ALLOC_REPORT_TYPE);
        System.out.println(ALLOC_REPORT_REF_ID);
        System.out.println(ALLOC_CANC_REPLACE_REASON);
        System.out.println(COPY_MSG_INDICATOR);
        System.out.println(ALLOC_ACCOUNT_TYPE);
        System.out.println(ORDER_AVG_PX);
        System.out.println(ORDER_BOOKING_QTY);


        // 801-900

        System.out.println(NO_SETTL_PARTY_SUB_IDS);
        System.out.println(NO_PARTY_SUB_IDS);
        System.out.println(PARTY_SUB_ID_TYPE);
        System.out.println(NO_NESTED_PARTY_SUB_IDS);
        System.out.println(NESTED_PARTY_SUB_ID_TYPE);
        System.out.println(NO_NESTED_2_PARTY_SUB_IDS);
        System.out.println(NESTED_2_PARTY_SUB_ID_TYPE);
        System.out.println(ALLOC_INTERMED_REQ_TYPE);
        System.out.println(UNDERLYING_PX);

        System.out.println(PRICE_DELTA);
        System.out.println(APPL_QUEUE_MAX);
        System.out.println(APPL_QUEUE_DEPTH);
        System.out.println(APPL_QUEUE_RESOLUTION);
        System.out.println(APPL_QUEUE_ACTION);
        System.out.println(NO_ALT_MD_SOURCE);
        System.out.println(ALT_MD_SOURCE_ID);
        System.out.println(SECONDARY_TRADE_REPORT_ID);
        System.out.println(AVG_PX_INDICATOR);
        System.out.println(TRADE_LINK_ID);

        System.out.println(ORDER_INPUT_DEVICE);
        System.out.println(UNDERLYING_TRADING_SESSION_ID);
        System.out.println(UNDERLYING_TRADING_SESSION_SUB_ID);
        System.out.println(TRADE_LEG_REF_ID);
        System.out.println(EXCHANGE_RULE);
        System.out.println(TRADE_ALLOC_INDICATOR);
        System.out.println(EXPIRATION_CYCLE);
        System.out.println(TRD_TYPE);
        System.out.println(TRD_SUB_TYPE);
        System.out.println(TRANSFER_REASON);

        System.out.println(ASGN_REQ_ID);
        System.out.println(TOT_NUM_ASSIGNMENT_REPORTS);
        System.out.println(ASGN_RPT_ID);
        System.out.println(THRESHOLD_AMOUNT);
        System.out.println(PEG_MOVE_TYPE);
        System.out.println(PEG_OFFSET_TYPE);
        System.out.println(PEG_LIMIT_TYPE);
        System.out.println(PEG_ROUND_DIRECTION);
        System.out.println(PEGGED_PRICE);
        System.out.println(PEG_SCOPE);

        System.out.println(DISCRETION_MOVE_TYPE);
        System.out.println(DISCRETION_OFFSET_TYPE);
        System.out.println(DISCRETION_LIMIT_TYPE);
        System.out.println(DISCRETION_ROUND_DIRECTION);
        System.out.println(DISCRETION_PRICE);
        System.out.println(DISCRETION_SCOPE);
        System.out.println(TARGET_STRATEGY);
        System.out.println(TARGET_STRATEGY_PARAMETERS);
        System.out.println(PARTICIPATION_RATE);
        System.out.println(TARGET_STRATEGY_PERFORMANCE);

        System.out.println(LAST_LIQUIDITY_IND);
        System.out.println(PUBLISH_TRD_INDICATOR);
        System.out.println(SHORT_SALE_REASON);
        System.out.println(QTY_TYPE);
        System.out.println(SECONDARY_TRD_TYPE);
        System.out.println(TRADE_REPORT_TYPE);
        System.out.println(ALLOC_NO_ORDERS_TYPE);
        System.out.println(SHARED_COMMISSION);
        System.out.println(CONFIRM_REQ_ID);
        System.out.println(AVG_PAR_PX);

        System.out.println(REPORTED_PX);
        System.out.println(NO_CAPACITIES);
        System.out.println(ORDER_CAPACITY_QTY);
        System.out.println(NO_EVENTS);
        System.out.println(EVENT_TYPE);
        System.out.println(EVENT_DATE);
        System.out.println(EVENT_PX);
        System.out.println(EVENT_TEXT);
        System.out.println(PCT_AT_RISK);
        System.out.println(NO_INSTR_ATTRIB);

        System.out.println(INSTR_ATTRIB_TYPE);
        System.out.println(INSTR_ATTRIB_VALUE);
        System.out.println(DATED_DATE);
        System.out.println(INTEREST_ACCRUAL_DATE);
        System.out.println(CP_PROGRAM);
        System.out.println(CP_REG_TYPE);
        System.out.println(UNDERLYING_CP_PROGRAM);
        System.out.println(UNDERLYING_CP_REGTYPE);
        System.out.println(UNDERLYING_QTY);
        System.out.println(TRD_MATCH_ID);

        System.out.println(SECONDARY_TRADE_REPORT_REF_ID);
        System.out.println(UNDERLYING_DIRTY_PRICE);
        System.out.println(UNDERLYING_END_PRICE);
        System.out.println(UNDERLYING_START_VALUE);
        System.out.println(UNDERLYING_CURRENT_VALUE);
        System.out.println(UNDERLYING_END_VALUE);
        System.out.println(NO_UNDERLYING_STIPS);
        System.out.println(UNDERLYING_STIP_TYPE);
        System.out.println(UNDERLYING_STIP_VALUE);
        System.out.println(MATURITY_NET_MONEY);

        System.out.println(MISC_FEE_BASIS);
        System.out.println(TOT_NO_ALLOCS);
        System.out.println(LAST_FRAGMENT);
        System.out.println(COLL_REQ_ID);
        System.out.println(COLL_ASGN_REASON);
        System.out.println(COLL_INQUIRY_QUALIFIER);
        System.out.println(NO_TRADES);
        System.out.println(MARGIN_RATIO);
        System.out.println(MARGIN_EXCESS);
        System.out.println(TOTAL_NET_VALUE);


        // 901-1000

        System.out.println(CASH_OUTSTANDING);
        System.out.println(COLL_ASGN_ID);
        System.out.println(COLL_ASGN_TRANS_TYPE);
        System.out.println(COLL_RESP_ID);
        System.out.println(COLL_ASGN_RESP_TYPE);
        System.out.println(COLL_ASGN_REJECT_REASON);
        System.out.println(COLL_ASGN_REF_ID);
        System.out.println(COLL_RPT_ID);
        System.out.println(COLL_INQUIRY_ID);
        System.out.println(COLL_STATUS);

        System.out.println(TOT_NUM_REPORTS);
        System.out.println(LAST_RPT_REQUESTED);
        System.out.println(AGREEMENT_DESC);
        System.out.println(AGREEMENT_ID);
        System.out.println(AGREEMENT_DATE);
        System.out.println(START_DATE);
        System.out.println(END_DATE);
        System.out.println(AGREEMENT_CURRENCY);
        System.out.println(DELIVERY_TYPE);
        System.out.println(END_ACCRUED_INTEREST_AMT);

        System.out.println(START_CASH);
        System.out.println(END_CASH);
        System.out.println(USER_REQUEST_ID);
        System.out.println(USER_REQUEST_TYPE);
        System.out.println(NEW_PASSWORD);
        System.out.println(USER_STATUS);
        System.out.println(USER_STATUS_TEXT);
        System.out.println(STATUS_VALUE);
        System.out.println(STATUS_TEXT);
        System.out.println(REF_COMP_ID);

        System.out.println(REF_SUB_ID);
        System.out.println(NETWORK_RESPONSE_ID);
        System.out.println(NETWORK_REQUEST_ID);
        System.out.println(LAST_NETWORK_RESPONSE_ID);
        System.out.println(NETWORK_REQUEST_TYPE);
        System.out.println(NO_COMP_IDS);
        System.out.println(NETWORK_STATUS_RESPONSE_TYPE);
        System.out.println(NO_COLL_INQUIRY_QUALIFIER);
        System.out.println(TRD_RPT_STATUS);
        System.out.println(AFFIRM_STATUS);

        System.out.println(UNDERLYING_STRIKE_CURRENCY);
        System.out.println(LEG_STRIKE_CURRENCY);
        System.out.println(TIME_BRACKET);
        System.out.println(COLL_ACTION);
        System.out.println(COLL_INQUIRY_STATUS);
        System.out.println(COLL_INQUIRY_RESULT);
        System.out.println(STRIKE_CURRENCY);
        System.out.println(NO_NESTED_3_PARTY_IDS);
        System.out.println(NESTED_3_PARTY_ID);
        System.out.println(NESTED_3_PARTY_ID_SOURCE);

        System.out.println(NESTED_3_PARTY_ROLE);
        System.out.println(NO_NESTED_3_PARTY_SUB_IDS);
        System.out.println(NESTED_3_PARTY_SUB_ID);
        System.out.println(NESTED_3_PARTY_SUB_ID_TYPE);
        System.out.println(LEG_CONTRACT_SETTL_MONTH);
        System.out.println(LEG_INTEREST_ACCRUAL_DATE);
        /*
         *
         * End of FIX4.4
         *
         */


        /*
         * Start of FIX5.0 as defined by the FIX Protocol Specification 5.0
         *  Tags: 957-1139
         */
        System.out.println(NO_STRATEGY_PARAMETERS);
        System.out.println(STRATEGY_PARAMETER_NAME);
        System.out.println(STRATEGY_PARAMETER_TYPE);
        System.out.println(STRATEGY_PARAMETER_VALUE);

        System.out.println(HOST_CROSS_ID);
        System.out.println(SIDE_TIME_IN_FORCE);
        System.out.println(MD_REPORT_ID);
        System.out.println(SECURITY_REPORT_ID);
        System.out.println(SECURITY_STATUS);
        System.out.println(SETTLE_ON_OPEN_FLAG);
        System.out.println(STRIKE_MULTIPLIER);
        System.out.println(STRIKE_VALUE);
        System.out.println(MIN_PRICE_INCREMENT);
        System.out.println(POSITION_LIMIT);

        System.out.println(NT_POSITION_LIMIT);
        System.out.println(UNDERLYING_ALLOCATION_PERCENT);
        System.out.println(UNDERLYING_CASH_AMOUNT);
        System.out.println(UNDERLYING_CASH_TYPE);
        System.out.println(UNDERLYING_SETTLEMENT_TYPE);
        System.out.println(QUANTITY_DATE);
        System.out.println(CONT_INT_RPT_ID);
        System.out.println(LATE_INDICATOR);
        System.out.println(INPUT_SOURCE);
        System.out.println(SECURITY_UPDATE_ACTION);

        System.out.println(NO_EXPIRATION);
        System.out.println(EXP_TYPE);
        System.out.println(EXP_QTY);
        System.out.println(NO_UNDERLYING_AMOUNTS);
        System.out.println(UNDERLYING_PAY_AMOUNT);
        System.out.println(UNDERLYING_COLLECT_AMOUNT);
        System.out.println(UNDERLYING_SETTLEMENT_DATE);
        System.out.println(UNDERLYING_SETTLEMENT_STATUS);
        System.out.println(SECONDARY_INDIVIDUAL_ALLOC_ID);
        System.out.println(LEG_REPORT_ID);

        System.out.println(RND_PX);
        System.out.println(INDIVIDUAL_ALLOC_TYPE);
        System.out.println(ALLOC_CUSTOMER_CAPACITY);
        System.out.println(TIER_CODE);
        System.out.println(UNIT_OF_MEASURE);
        System.out.println(TIME_UNIT);
        System.out.println(UNDERLYING_UNIT_OF_MEASURE);
        System.out.println(LEG_UNIT_OF_MEASURE);
        System.out.println(UNDERLYING_TIME_UNIT);


        // 1001-1100

        System.out.println(LEG_TIME_UNIT);
        System.out.println(ALLOC_METHOD);
        System.out.println(TRADE_ID);
        System.out.println(SIDE_TRADE_REPORT_ID);
        System.out.println(SIDE_FILL_STATION_CD);
        System.out.println(SIDE_REASON_CD);
        System.out.println(SIDE_TRD_SUB_TYP);
        System.out.println(SIDE_QTY);

        System.out.println(MESSAGE_EVENT_SOURCE);
        System.out.println(SIDE_TRD_REG_TIMESTAMP);
        System.out.println(SIDE_TRD_REG_TIMESTAMP_TYPE);
        System.out.println(SIDE_TRD_REG_TIMESTAMP_SRC);
        System.out.println(AS_OF_INDICATOR);
        System.out.println(NO_SIDE_TRD_REG_TS);
        System.out.println(LEG_OPTION_RATIO);
        System.out.println(NO_INSTRUMENT_PARTIES);
        System.out.println(INSTRUMENT_PARTY_ID);
        System.out.println(TRADE_VOLUME);

        System.out.println(MD_BOOK_TYPE);
        System.out.println(MD_FEED_TYPE);
        System.out.println(MD_PRICE_LEVEL);
        System.out.println(MD_ORIGIN_TYPE);
        System.out.println(FIRST_PX);
        System.out.println(MD_ENTRY_SPOT_RATE);
        System.out.println(MD_ENTRY_FORWARD_POINTS);
        System.out.println(MANUAL_ORDER_INDICATOR);
        System.out.println(CUST_DIRECTED_ORDER);
        System.out.println(RECEIVED_DEPT_ID);

        System.out.println(CUST_ORDER_HANDLING_INST);
        System.out.println(ORDER_HANDLING_INST_SOURCE);
        System.out.println(DESK_TYPE);
        System.out.println(DESK_TYPE_SOURCE);
        System.out.println(DESK_ORDER_HANDLING_INST);
        System.out.println(EXEC_ACK_STATUS);
        System.out.println(UNDERLYING_DELIVERY_AMOUNT);
        System.out.println(UNDERLYING_CAP_VALUE);
        System.out.println(UNDERLYING_SETTL_METHOD);
        System.out.println(SECONDARY_TRADE_ID);

        System.out.println(FIRM_TRADE_ID);
        System.out.println(SECONDARY_FIRM_TRADE_ID);
        System.out.println(COLL_APPL_TYPE);
        System.out.println(UNDERLYING_ADJUSTED_QUANTITY);
        System.out.println(UNDERLYING_FX_RATE);
        System.out.println(UNDERLYING_FX_RATE_CALC);
        System.out.println(ALLOC_POSITION_EFFECT);
        System.out.println(DEALING_CAPACITY);
        System.out.println(INSTRMT_ASSIGNMENT_METHOD);
        System.out.println(INSTRUMENT_PARTY_ID_SOURCE);

        System.out.println(INSTRUMENT_PARTY_ROLE);
        System.out.println(NO_INSTRUMENT_PARTY_SUB_IDS);
        System.out.println(INSTRUMENT_PARTY_SUB_ID);
        System.out.println(INSTRUMENT_PARTY_SUB_ID_TYPE);
        System.out.println(POSITION_CURRENCY);
        System.out.println(CALCULATED_CCY_LAST_QTY);
        System.out.println(AGGRESSOR_INDICATOR);
        System.out.println(NO_UNDLY_INSTRUMENT_PARTIES);
        System.out.println(UNDLY_INSTRUMENT_PARTY_ID);
        System.out.println(UNDLY_INSTRUMENT_PARTY_ID_SOURCE);

        System.out.println(UNDLY_INSTRUMENT_PARTY_ROLE);
        System.out.println(NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS);
        System.out.println(UNDLY_INSTRUMENT_PARTY_SUB_ID);
        System.out.println(UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE);
        System.out.println(BID_SWAP_POINTS);
        System.out.println(OFFER_SWAP_POINTS);
        System.out.println(LEG_BID_FORWARD_POINTS);
        System.out.println(LEG_OFFER_FORWARD_POINTS);
        System.out.println(SWAP_POINTS);
        System.out.println(MD_QUOTE_TYPE);

        System.out.println(LAST_SWAP_POINTS);
        System.out.println(SIDE_GROSS_TRADE_AMT);
        System.out.println(LEG_LAST_FORWARD_POINTS);
        System.out.println(LEG_CALCULATED_CCY_LAST_QTY);
        System.out.println(LEG_GROSS_TRADE_AMT);
        System.out.println(MATURITY_TIME);
        System.out.println(REF_ORDER_ID);

        System.out.println(REF_ORDER_ID_SOURCE);
        System.out.println(SECONDARY_DISPLAY_QTY);
        System.out.println(DISPLAY_WHEN);
        System.out.println(DISPLAY_METHOD);
        System.out.println(DISPLAY_LOW_QTY);
        System.out.println(DISPLAY_HIGH_QTY);
        System.out.println(DISPLAY_MIN_INCR);
        System.out.println(REFRESH_QTY);
        System.out.println(MATCH_INCREMENT);
        System.out.println(MAX_PRICE_LEVELS);

        System.out.println(PRE_TRADE_ANONYMITY);
        System.out.println(PRICE_PROTECTION_SCOPE);
        System.out.println(LOT_TYPE);
        System.out.println(PEG_PRICE_TYPE);
        System.out.println(PEGGED_REF_PRICE);
        System.out.println(PEG_SECURITY_ID_SOURCE);
        System.out.println(PEG_SECURITY_ID);
        System.out.println(PEG_SYMBOL);
        System.out.println(PEG_SECURITY_DESC);
        System.out.println(TRIGGER_TYPE);


        // 1101-1200

        System.out.println(TRIGGER_ACTION);
        System.out.println(TRIGGER_PRICE);
        System.out.println(TRIGGER_SYMBOL);
        System.out.println(TRIGGER_SECURITY_ID);
        System.out.println(TRIGGER_SECURITY_ID_SOURCE);
        System.out.println(TRIGGER_SECURITY_DESC);
        System.out.println(TRIGGER_PRICE_TYPE);
        System.out.println(TRIGGER_PRICE_TYPE_SCOPE);
        System.out.println(TRIGGER_PRICE_DIRECTION);
        System.out.println(TRIGGER_NEW_PRICE);

        System.out.println(TRIGGER_ORDER_TYPE);
        System.out.println(TRIGGER_NEW_QTY);
        System.out.println(TRIGGER_TRADING_SESSION_ID);
        System.out.println(TRIGGER_TRADING_SESSION_SUB_ID);
        System.out.println(ORDER_CATEGORY);
        System.out.println(NO_ROOT_PARTY_IDS);
        System.out.println(ROOT_PARTY_ID);
        System.out.println(ROOT_PARTY_ID_SOURCE);
        System.out.println(ROOT_PARTY_ROLE);
        System.out.println(NO_ROOT_PARTY_SUB_IDS);

        System.out.println(ROOT_PARTY_SUB_ID);
        System.out.println(ROOT_PARTY_SUB_ID_TYPE);
        System.out.println(TRADE_HANDLING_INSTR);
        System.out.println(ORIG_TRADE_HANDLING_INSTR);
        System.out.println(ORIG_TRADE_DATE);
        System.out.println(ORIG_TRADE_ID);
        System.out.println(ORIG_SECONDARY_TRADE_ID);
        System.out.println(APPL_VER_ID);
        System.out.println(CSTM_APPL_VER_ID);
        System.out.println(REF_APPL_VER_ID);

        System.out.println(REF_CSTM_APPL_VER_ID);
        System.out.println(TZ_TRANSACT_TIME);
        System.out.println(EX_DESTINATION_ID_SOURCE);
        System.out.println(REPORTED_PX_DIFF);
        System.out.println(RPT_SYS);
        System.out.println(ALLOC_CLEARING_FEE_INDICATOR);
        System.out.println(DEFAULT_APPL_VER_ID);
        System.out.println(DISPLAY_QTY);
        System.out.println(EXCHANGE_SPECIAL_INSTRUCTIONS);

    }

}
