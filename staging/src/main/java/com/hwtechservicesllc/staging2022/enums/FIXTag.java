package com.hwtechservicesllc.staging2022.enums;

/*
    Copyright (c) 2022  HW Tech Services, Inc., LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// from FixProtocol.org website www.fixprotocol.org

public enum FIXTag {

	// 1-100

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
    EXEC_TRANS_TYPE(20, "ExecTransType"),

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
    LAST_SHARES(32, "LastShares"),
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
    RELATD_SYM(46, "RelatdSym"),
    ORDER_CAPACITY(47, "Rule80A (aka OrderCapacity)"),
    SECURITY_ID(48, "SecurityID"),
    SENDER_COMP_ID(49, "SenderCompID"),
    SENDER_SUB_ID(50, "SenderSubID"),

    SENDING_DATE(51, "SendingDate (no longer used)"),
    SENDING_TIME(52, "SendingTime"),
    SHARES(53, "Shares"),
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
	EXEC_BROKER(76, "ExecBroker"),
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
	BROKER_OF_CREDIT(92, "BrokerOfCredit"),
	SIGNATURE_LENGTH(93, "SignatureLength"),
	EMAIL_TYPE(94, "EmailType"),
	RAW_DATA_LENGTH(95, "RawDataLength"),
	RAW_DATA(96, "RawData"),
	POSS_RESEND(97, "PossResend"),
	ENCRYPT_METHOD(98, "EncryptMethod"),
	STOP_PX(99, "StopPx"),
    EX_DESTINATION(100, "ExDestination"),
	
	// 101-200
	
	NOT_DEFINED(101, "(Not Defined)"),
	CXL_REJ_REASON(102, "CxlRejReason"),
    ORD_REJ_REASON(103, "OrdRejReason"),
    IOI_QUALIFIER(104, "IOIQualifier"),
    WAVE_NO(105, "WaveNo"),
    ISSUER(106, "Issuer"),
    SECURITY_DESC(107, "SecurityDesc"),
    HEART_BT_INT(108, "HeartBtInt"),
    CLIENT_ID(109, "ClientID"),
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
    SETTL_LOCATION(166, "SettlLocation"),
    SECURITY_TYPE(167, "SecurityType"),
    EFFECTIVE_TIME(168, "EffectiveTime"),
    STAND_INST_DB_TYPE(169, "StandInstDbType"),
    STAND_INST_DB_NAME(170, "StandInstDbName"),

    STAND_INST_DB_ID(171, "StandInstDbID"),
    SETTL_DELIVERY_TYPE(172, "SettlDeliveryType"),
    SETTL_DEPOSITORY_CODE(173, "SettlDepositoryCode"),
    SETTL_BRKR_CODE(174, "SettlBrkrCode"),
    SETTL_INST_CODE(175, "SettlInstCode"),
    SECURITY_SETTL_AGENT_NAME(176, "SecuritySettlAgentName"),
    SECURITY_SETTL_AGENT_CODE(177, "SecuritySettlAgentCode"),
    SECURITY_SETTL_AGENT_ACCT_NUM(178, "SecuritySettlAgentAcctNum"),
    SECURITY_SETTL_AGENT_ACCT_NAME(179, "SecuritySettlAgentAcctName"),
    SECURITY_SETTL_AGENT_CONTACT_NAME(180, "SecuritySettlAgentContactName"),

    SECURITY_SETTL_AGENT_CONTACT_PHONE(181, "SecuritySettlAgentContactPhone"),
    CASH_SETTL_AGENT_NAME(182, "CashSettlAgentName"),
    CASH_SETTL_AGENT_CODE(183, "CashSettlAgentCode"),
    CASH_SETTL_AGENT_ACCT_NUM(184, "CashSettlAgentAcctNum"),
    CASH_SETTL_AGENT_ACCT_NAME(185, "CashSettlAgentAcctName"),
    CASH_SETTL_AGENT_CONTACT_NAME(186, "CashSettlAgentContactName"),
    CASH_SETTL_AGENT_CONTACT_PHONE(187, "CashSettlAgentContactPhone"),
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
	
	PUT_OR_CALL(201, "PutOrCall"),
	STRIKE_PRICE(202, "StrikePrice"),
	COVERED_OR_UNCOVERED(203, "CoveredOrUncovered"),
	CUSTOMER_OR_FIRM(204, "CustomerOrFirm"),
	MATURITY_DAY(205, "MaturityDay"),
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
	BENCHMARK(219, "Benchmark"),

// 220-222,    Reserved/Allocated to the Fixed Income proposal

	COUPON_RATE(223, "CouponRate"),

// 224-230,    Reserved/Allocated to the Fixed Income proposal

	CONTRACT_MULTIPLIER(231, "ContractMultiplier"),

// 232-261,    Reserved/Allocated to the Fixed Income proposal

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
	UNDERLYING_MATURITY_DAY(314, "UnderlyingMaturityDay"),
	UNDERLYING_PUT_OR_CALL(315, "UnderlyingPutOrCall"),
	UNDERLYING_STRIKE_PRICE(316, "UnderlyingStrikePrice"),
	UNDERLYING_OPT_ATTRIBUTE(317, "UnderlyingOptAttribute"),
	UNDERLYING_CURRENCY(318, "UnderlyingCurrency"),
	RATIO_QTY(319, "RatioQty"),
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
    LIST_STATUS_ENCODED_TEXT(446, "ListStatusEncodedText");
	
	// 501-600
	
	
	
    private final int fixTagNumber;
    private final String fixTagDescription;

    private FIXTag(final int fixTagNumber, final String fixTagDescription) {
        this.fixTagNumber = fixTagNumber;
        this.fixTagDescription = fixTagDescription;
    }
    public int getFIXTagNumber() {
        return fixTagNumber;
    }
    public String getFIXTagDescription() {
        return fixTagDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());
        sb.append(":[");
        sb.append(getFIXTagNumber());
        sb.append("]");
        sb.append(":[");
        sb.append(getFIXTagDescription());
        sb.append("]");

        return sb.toString();
    }

}
