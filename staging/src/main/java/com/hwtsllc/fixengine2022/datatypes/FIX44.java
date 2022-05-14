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
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  FIX44 enum defines all the Financial Exchange Protocol's (FIX) fields.
 *  It consists of 3 fields.
 *  <p>
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Protocol document.
 *                      There may be a secondary prefix denoting the data type.
 *  <p>
 *  <p>                 BOOL = EnumType field
 *  <p>                 ENU = EnumType field
 *  <p>                 AMT = MyAmtType field, saved as double
 *  <p>                 CCY = MyCurrencyType field, saved as String
 *  <p>                 CHA = MyCharType field, saved as char
 *  <p>                 COU = MyCountryType field, saved as String
 *  <p>                 DAT = MyDataType field, saved as String
 *  <p>                 EXC = MyExchangeType field, saved as String
 *  <p>                 FLO = MyFloatType field, saved as float
 *  <p>                 INT = MyIntType field, saved as int
 *  <p>                 LEN = MyLengthType field, saved as int
 *  <p>                 LMD = MyLocalMktDateType field, saved as String
 *  <p>                 NUM = MyNumInGroupType field, saved as int
 *  <p>                 PCT = MyPercentageType field, saved as String
 *  <p>                 PRC = MyPriceType field, saved as String
 *  <p>                 PXO = MyPriceOffsetType field, saved as String
 *  <p>                 QTY = MyQtyType field, saved as int
 *  <p>                 SEQ = MySeqNumType field, saved as int
 *  <p>                 STR = MyStringType field, saved as String
 *  <p>                 UTC = MyUTCTimestampType field, saved as String
 *  <p>                 UTCD = MyUTCDateType field, saved as String
 *  <p>                 UTCT = MyUTCTimeType field, saved as String
 *  <p>                 others to follow
 *  <p>
 * String  id           The identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 *  <p>
 * String  name         The short NAME of the field as defined by the FIX protocol document, no duplicates
 *  <p>
 * String  description  A short blurb which describes what information the field contains
 */
public enum FIX44 implements EnumAccessors, LogVerboseString {


    /*
     * Start of FIX4.4 as defined by the FIX Protocol Specification 4.4
     *  Tags: 660-956
     */
    FIX660_ENU_ACCT_ID_SOURCE(660, "ACCT_ID_SOURCE", "AcctIDSource"),

    FIX661_ENU_ALLOC_ACCT_ID_SOURCE(661, "ALLOC_ACCT_ID_SOURCE", "AllocAcctIDSource"),
    FIX662_BENCHMARK_PRICE(662, "BENCHMARK_PRICE", "BenchmarkPrice"),
    FIX663_ENU_BENCHMARK_PRICE_TYPE(663, "BENCHMARK_PRICE_TYPE", "BenchmarkPriceType"),
    FIX664_CONFIRM_ID(664, "CONFIRM_ID", "ConfirmID"),
    FIX665_ENU_CONFIRM_STATUS(665, "CONFIRM_STATUS", "ConfirmStatus"),
    FIX666_ENU_CONFIRM_TRANS_TYPE(666, "CONFIRM_TRANS_TYPE", "ConfirmTransType"),
    FIX667_CONTRACT_SETTL_MONTH(667, "CONTRACT_SETTL_MONTH", "ContractSettlMonth"),
    FIX668_ENU_DELIVERY_FORM(668, "DELIVERY_FORM", "DeliveryForm"),
    FIX669_LAST_PAR_PX(669, "LAST_PAR_PX", "LastParPx"),
    FIX670_NO_LEG_ALLOCS(670, "NO_LEG_ALLOCS", "NoLegAllocs"),

    FIX671_LEG_ALLOC_ACCOUNT(671, "LEG_ALLOC_ACCOUNT", "LegAllocAccount"),
    FIX672_LEG_INDIVIDUAL_ALLOC_ID(672, "LEG_INDIVIDUAL_ALLOC_ID", "LegIndividualAllocID"),
    FIX673_LEG_ALLOC_QTY(673, "LEG_ALLOC_QTY", "LegAllocQty"),
    FIX674_LEG_ALLOC_ACCT_ID_SOURCE(674, "LEG_ALLOC_ACCT_ID_SOURCE", "LegAllocAcctIDSource"),
    FIX675_LEG_SETTL_CURRENCY(675, "LEG_SETTL_CURRENCY", "LegSettlCurrency"),
    FIX676_LEG_BENCHMARK_CURVE_CURRENCY(676, "LEG_BENCHMARK_CURVE_CURRENCY", "LegBenchmarkCurveCurrency"),
    FIX677_ENU_LEG_BENCHMARK_CURVE_NAME(677, "LEG_BENCHMARK_CURVE_NAME", "LegBenchmarkCurveName"),
    FIX678_LEG_BENCHMARK_CURVE_POINT(678, "LEG_BENCHMARK_CURVE_POINT", "LegBenchmarkCurvePoint"),
    FIX679_LEG_BENCHMARK_PRICE(679, "LEG_BENCHMARK_PRICE", "LegBenchmarkPrice"),
    FIX680_LEG_BENCHMARK_PRICE_TYPE(680, "LEG_BENCHMARK_PRICE_TYPE", "LegBenchmarkPriceType"),

    FIX681_LEG_BID_PX(681, "LEG_BID_PX", "LegBidPx"),
    FIX682_ENU_LEG_IOI_QTY(682, "LEG_IOI_QTY", "LegIOIQty"),
    FIX683_NO_LEG_STIPULATIONS(683, "NO_LEG_STIPULATIONS", "NoLegStipulations"),
    FIX684_LEG_OFFER_PX(684, "LEG_OFFER_PX", "LegOfferPx"),
    FIX685_LEG_ORDER_QTY(685, "LEG_ORDER_QTY", "LegOrderQty"),
    FIX686_ENU_LEG_PRICE_TYPE(686, "LEG_PRICE_TYPE", "LegPriceType"),
    FIX687_LEG_QTY(687, "LEG_QTY", "LegQty"),
    FIX688_ENU_LEG_STIPULATION_TYPE(688, "LEG_STIPULATION_TYPE", "LegStipulationType"),
    FIX689_LEG_STIPULATION_VALUE(689, "LEG_STIPULATION_VALUE", "LegStipulationValue"),
    FIX690_ENU_LEG_SWAP_TYPE(690, "LEG_SWAP_TYPE", "LegSwapType"),

    FIX691_POOL(691, "POOL", "Pool"),
    FIX692_ENU_QUOTE_PRICE_TYPE(692, "QUOTE_PRICE_TYPE", "QuotePriceType"),
    FIX693_QUOTE_RESP_ID(693, "QUOTE_RESP_ID", "QuoteRespID"),
    FIX694_ENU_QUOTE_RESP_TYPE(694, "QUOTE_RESP_TYPE", "QuoteRespType"),
    FIX695_ENU_QUOTE_QUALIFIER(695, "QUOTE_QUALIFIER", "QuoteQualifier"),
    FIX696_YIELD_REDEMPTION_DATE(696, "YIELD_REDEMPTION_DATE", "YieldRedemptionDate"),
    FIX697_YIELD_REDEMPTION_PRICE(697, "YIELD_REDEMPTION_PRICE", "YieldRedemptionPrice"),
    FIX698_ENU_YIELD_REDEMPTION_PRICE_TYPE(698, "YIELD_REDEMPTION_PRICE_TYPE", "YieldRedemptionPriceType"),
    FIX699_BENCHMARK_SECURITY_ID(699, "BENCHMARK_SECURITY_ID", "BenchmarkSecurityID"),
    FIX700_BOOL_REVERSAL_INDICATOR(700, "REVERSAL_INDICATOR", "ReversalIndicator"),


    // 701-800

    FIX701_YIELD_CALC_DATE(701, "YIELD_CALC_DATE", "YieldCalcDate"),
    FIX702_NO_POSITIONS(702, "NO_POSITIONS", "NoPositions"),
    FIX703_ENU_POS_TYPE(703, "POS_TYPE", "PosType"),
    FIX704_LONG_QTY(704, "LONG_QTY", "LongQty"),
    FIX705_SHORT_QTY(705, "SHORT_QTY", "ShortQty"),
    FIX706_ENU_POS_QTY_STATUS(706, "POS_QTY_STATUS", "PosQtyStatus"),
    FIX707_ENU_POS_AMT_TYPE(707, "POS_AMT_TYPE", "PosAmtType"),
    FIX708_POS_AMT(708, "POS_AMT", "PosAmt"),
    FIX709_ENU_POS_TRANS_TYPE(709, "POS_TRANS_TYPE", "PosTransType"),
    FIX710_POS_REQ_ID(710, "POS_REQ_ID", "PosReqID"),

    FIX711_NO_UNDERLYINGS(711, "NO_UNDERLYINGS", "NoUnderlyings"),
    FIX712_ENU_POS_MAINT_ACTION(712, "POS_MAINT_ACTION", "PosMaintAction"),
    FIX713_ORIG_POS_REQ_REF_ID(713, "ORIG_POS_REQ_REF_ID", "OrigPosReqRefID"),
    FIX714_POS_MAINT_RPT_REF_ID(714, "POS_MAINT_RPT_REF_ID", "PosMaintRptRefID"),
    FIX715_CLEARING_BUSINESS_DATE(715, "CLEARING_BUSINESS_DATE", "ClearingBusinessDate"),
    FIX716_ENU_SETTL_SESS_ID(716, "SETTL_SESS_ID", "SettlSessID"),
    FIX717_SETTL_SESS_SUB_ID(717, "SETTL_SESS_SUB_ID", "SettlSessSubID"),
    FIX718_ENU_ADJUSTMENT_TYPE(718, "ADJUSTMENT_TYPE", "AdjustmentType"),
    FIX719_BOOL_CONTRARY_INSTRUCTION_INDICATOR(719, "CONTRARY_INSTRUCTION_INDICATOR", "ContraryInstructionIndicator"),
    FIX720_BOOL_PRIOR_SPREAD_INDICATOR(720, "PRIOR_SPREAD_INDICATOR", "PriorSpreadIndicator"),

    FIX721_POS_MAINT_RPT_ID(721, "POS_MAINT_RPT_ID", "PosMaintRptID"),
    FIX722_ENU_POS_MAINT_STATUS(722, "POS_MAINT_STATUS", "PosMaintStatus"),
    FIX723_ENU_POS_MAINT_RESULT(723, "POS_MAINT_RESULT", "PosMaintResult"),
    FIX724_ENU_POS_REQ_TYPE(724, "POS_REQ_TYPE", "PosReqType"),
    FIX725_ENU_RESPONSE_TRANSPORT_TYPE(725, "RESPONSE_TRANSPORT_TYPE", "ResponseTransportType"),
    FIX726_RESPONSE_DESTINATION(726, "RESPONSE_DESTINATION", "ResponseDestination"),
    FIX727_TOTAL_NUM_POS_REPORTS(727, "TOTAL_NUM_POS_REPORTS", "TotalNumPosReports"),
    FIX728_ENU_POS_REQ_RESULT(728, "POS_REQ_RESULT", "PosReqResult"),
    FIX729_ENU_POS_REQ_STATUS(729, "POS_REQ_STATUS", "PosReqStatus"),
    FIX730_SETTL_PRICE(730, "SETTL_PRICE", "SettlPrice"),

    FIX731_ENU_SETTL_PRICE_TYPE(731, "SETTL_PRICE_TYPE", "SettlPriceType"),
    FIX732_UNDERLYING_SETTL_PRICE(732, "UNDERLYING_SETTL_PRICE", "UnderlyingSettlPrice"),
    FIX733_ENU_UNDERLYING_SETTL_PRICE_TYPE(733, "UNDERLYING_SETTL_PRICE_TYPE", "UnderlyingSettlPriceType"),
    FIX734_PRIOR_SETTL_PRICE(734, "PRIOR_SETTL_PRICE", "PriorSettlPrice"),
    FIX735_NO_QUOTE_QUALIFIERS(735, "NO_QUOTE_QUALIFIERS", "NoQuoteQualifiers"),
    FIX736_ALLOC_SETTL_CURRENCY(736, "ALLOC_SETTL_CURRENCY", "AllocSettlCurrency"),
    FIX737_ALLOC_SETTL_CURR_AMT(737, "ALLOC_SETTL_CURR_AMT", "AllocSettlCurrAmt"),
    FIX738_INTEREST_AT_MATURITY(738, "INTEREST_AT_MATURITY", "InterestAtMaturity"),
    FIX739_LEG_DATED_DATE(739, "LEG_DATED_DATE", "LegDatedDate"),
    FIX740_LEG_POOL(740, "LEG_POOL", "LegPool"),

    FIX741_ALLOC_INTEREST_AT_MATURITY(741, "ALLOC_INTEREST_AT_MATURITY", "AllocInterestAtMaturity"),
    FIX742_ALLOC_ACCRUED_INTEREST_AMT(742, "ALLOC_ACCRUED_INTEREST_AMT", "AllocAccruedInterestAmt"),
    FIX743_DELIVERY_DATE(743, "DELIVERY_DATE", "DeliveryDate"),
    FIX744_ENU_ASSIGNMENT_METHOD(744, "ASSIGNMENT_METHOD", "AssignmentMethod"),
    FIX745_ASSIGNMENT_UNIT(745, "ASSIGNMENT_UNIT", "AssignmentUnit"),
    FIX746_OPEN_INTEREST(746, "OPEN_INTEREST", "OpenInterest"),
    FIX747_ENU_EXERCISE_METHOD(747, "EXERCISE_METHOD", "ExerciseMethod"),
    FIX748_TOT_NUM_TRADE_REPORTS(748, "TOT_NUM_TRADE_REPORTS", "TotNumTradeReports"),
    FIX749_ENU_TRADE_REQUEST_RESULT(749, "TRADE_REQUEST_RESULT", "TradeRequestResult"),
    FIX750_ENU_TRADE_REQUEST_STATUS(750, "TRADE_REQUEST_STATUS", "TradeRequestStatus"),

    FIX751_ENU_TRADE_REPORT_REJECT_REASON(751, "TRADE_REPORT_REJECT_REASON", "TradeReportRejectReason"),
    FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE(752, "SIDE_MULTI_LEG_REPORTING_TYPE", "SideMultiLegReportingType"),
    FIX753_NO_POS_AMT(753, "NO_POS_AMT", "NoPosAmt"),
    FIX754_BOOL_AUTO_ACCEPT_INDICATOR(754, "AUTO_ACCEPT_INDICATOR", "AutoAcceptIndicator"),
    FIX755_ALLOC_REPORT_ID(755, "ALLOC_REPORT_ID", "AllocReportID"),
    FIX756_NO_NESTED_2_PARTY_IDS(756, "NO_NESTED_2_PARTY_IDS", "NoNested2PartyIDs"),
    FIX757_STR_NESTED_2_PARTY_ID(757, "NESTED_2_PARTY_ID", "Nested2PartyID"),
    FIX758_ENU_NESTED_2_PARTY_ID_SOURCE(758, "NESTED_2_PARTY_ID_SOURCE", "Nested2PartyIDSource"),
    FIX759_ENU_NESTED_2_PARTY_ROLE(759, "NESTED_2_PARTY_ROLE", "Nested2PartyRole"),
    FIX760_STR_NESTED_2_PARTY_SUB_ID(760, "NESTED_2_PARTY_SUB_ID", "Nested2PartySubID"),

    FIX761_ENU_BENCHMARK_SECURITY_ID_SOURCE(761, "BENCHMARK_SECURITY_ID_SOURCE", "BenchmarkSecurityIDSource"),
    FIX762_SECURITY_SUB_TYPE(762, "SECURITY_SUB_TYPE", "SecuritySubType"),
    FIX763_UNDERLYING_SECURITY_SUB_TYPE(763, "UNDERLYING_SECURITY_SUB_TYPE", "UnderlyingSecuritySubType"),
    FIX764_LEG_SECURITY_SUB_TYPE(764, "LEG_SECURITY_SUB_TYPE", "LegSecuritySubType"),
    FIX765_ALLOWABLE_ONE_SIDEDNESS_PCT(765, "ALLOWABLE_ONE_SIDEDNESS_PCT", "AllowableOneSidednessPct"),
    FIX766_ALLOWABLE_ONE_SIDEDNESS_VALUE(766, "ALLOWABLE_ONE_SIDEDNESS_VALUE", "AllowableOneSidednessValue"),
    FIX767_ALLOWABLE_ONE_SIDEDNESS_CURR(767, "ALLOWABLE_ONE_SIDEDNESS_CURR", "AllowableOneSidednessCurr"),
    FIX768_NO_TRD_REG_TIMESTAMPS(768, "NO_TRD_REG_TIMESTAMPS", "NoTrdRegTimestamps"),
    FIX769_TRD_REG_TIMESTAMP(769, "TRD_REG_TIMESTAMP", "TrdRegTimestamp"),
    FIX770_ENU_TRD_REG_TIMESTAMP_TYPE(770, "TRD_REG_TIMESTAMP_TYPE", "TrdRegTimestampType"),

    FIX771_TRD_REG_TIMESTAMP_ORIGIN(771, "TRD_REG_TIMESTAMP_ORIGIN", "TrdRegTimestampOrigin"),
    FIX772_CONFIRM_REF_ID(772, "CONFIRM_REF_ID", "ConfirmRefID"),
    FIX773_ENU_CONFIRM_TYPE(773, "CONFIRM_TYPE", "ConfirmType"),
    FIX774_ENU_CONFIRM_REJ_REASON(774, "CONFIRM_REJ_REASON", "ConfirmRejReason"),
    FIX775_ENU_BOOKING_TYPE(775, "BOOKING_TYPE", "BookingType"),
    FIX776_ENU_INDIVIDUAL_ALLOC_REJ_CODE(776, "INDIVIDUAL_ALLOC_REJ_CODE", "IndividualAllocRejCode"),
    FIX777_SETTL_INST_MSG_ID(777, "SETTL_INST_MSG_ID", "SettlInstMsgID"),
    FIX778_NO_SETTL_INST(778, "NO_SETTL_INST", "NoSettlInst"),
    FIX779_LAST_UPDATE_TIME(779, "LAST_UPDATE_TIME", "LastUpdateTime"),
    FIX780_ENU_ALLOC_SETTL_INST_TYPE(780, "ALLOC_SETTL_INST_TYPE", "AllocSettlInstType"),

    FIX781_NO_SETTL_PARTY_IDS(781, "NO_SETTL_PARTY_IDS", "NoSettlPartyIDs"),
    FIX782_STR_SETTL_PARTY_ID(782, "SETTL_PARTY_ID", "SettlPartyID"),
    FIX783_ENU_SETTL_PARTY_ID_SOURCE(783, "SETTL_PARTY_ID_SOURCE", "SettlPartyIDSource"),
    FIX784_ENU_SETTL_PARTY_ROLE(784, "SETTL_PARTY_ROLE", "SettlPartyRole"),
    FIX785_STR_SETTL_PARTY_SUB_ID(785, "SETTL_PARTY_SUB_ID", "SettlPartySubID"),
    FIX786_ENU_SETTL_PARTY_SUB_ID_TYPE(786, "SETTL_PARTY_SUB_ID_TYPE", "SettlPartySubIDType"),
    FIX787_ENU_DLVY_INST_TYPE(787, "DLVY_INST_TYPE", "DlvyInstType"),
    FIX788_ENU_TERMINATION_TYPE(788, "TERMINATION_TYPE", "TerminationType"),
    FIX789_NEXT_EXPECTED_MSG_SEQ_NUM(789, "NEXT_EXPECTED_MSG_SEQ_NUM", "NextExpectedMsgSeqNum"),
    FIX790_ORD_STATUS_REQ_ID(790, "ORD_STATUS_REQ_ID", "OrdStatusReqID"),

    FIX791_SETTL_INST_REQ_ID(791, "SETTL_INST_REQ_ID", "SettlInstReqID"),
    FIX792_ENU_SETTL_INST_REQ_REJ_CODE(792, "SETTL_INST_REQ_REJ_CODE", "SettlInstReqRejCode"),
    FIX793_SECONDARY_ALLOC_ID(793, "SECONDARY_ALLOC_ID", "SecondaryAllocID"),
    FIX794_ENU_ALLOC_REPORT_TYPE(794, "ALLOC_REPORT_TYPE", "AllocReportType"),
    FIX795_ALLOC_REPORT_REF_ID(795, "ALLOC_REPORT_REF_ID", "AllocReportRefID"),
    FIX796_ENU_ALLOC_CANC_REPLACE_REASON(796, "ALLOC_CANC_REPLACE_REASON", "AllocCancReplaceReason"),
    FIX797_BOOL_COPY_MSG_INDICATOR(797, "COPY_MSG_INDICATOR", "CopyMsgIndicator"),
    FIX798_ENU_ALLOC_ACCOUNT_TYPE(798, "ALLOC_ACCOUNT_TYPE", "AllocAccountType"),
    FIX799_ORDER_AVG_PX(799, "ORDER_AVG_PX", "OrderAvgPx"),
    FIX800_ORDER_BOOKING_QTY(800, "ORDER_BOOKING_QTY", "OrderBookingQty"),


    // 801-900

    FIX801_NO_SETTL_PARTY_SUB_IDS(801, "NO_SETTL_PARTY_SUB_IDS", "NoSettlPartySubIDs"),
    FIX802_NO_PARTY_SUB_IDS(802, "NO_PARTY_SUB_IDS", "NoPartySubIDs"),
    FIX803_ENU_PARTY_SUB_ID_TYPE(803, "PARTY_SUB_ID_TYPE", "PartySubIDType"),
    FIX804_NO_NESTED_PARTY_SUB_IDS(804, "NO_NESTED_PARTY_SUB_IDS", "NoNestedPartySubIDs"),
    FIX805_ENU_NESTED_PARTY_SUB_ID_TYPE(805, "NESTED_PARTY_SUB_ID_TYPE", "NestedPartySubIDType"),
    FIX806_NO_NESTED_2_PARTY_SUB_IDS(806, "NO_NESTED_2_PARTY_SUB_IDS", "NoNested2PartySubIDs"),
    FIX807_ENU_NESTED_2_PARTY_SUB_ID_TYPE(807, "NESTED_2_PARTY_SUB_ID_TYPE", "Nested2PartySubIDType"),
    FIX808_ENU_ALLOC_INTERMED_REQ_TYPE(808, "ALLOC_INTERMED_REQ_TYPE", "AllocIntermedReqType"),
    FIX810_UNDERLYING_PX(810, "UNDERLYING_PX", "UnderlyingPx"),

    FIX811_PRICE_DELTA(811, "PRICE_DELTA", "PriceDelta"),
    FIX812_APPL_QUEUE_MAX(812, "APPL_QUEUE_MAX", "ApplQueueMax"),
    FIX813_APPL_QUEUE_DEPTH(813, "APPL_QUEUE_DEPTH", "ApplQueueDepth"),
    FIX814_ENU_APPL_QUEUE_RESOLUTION(814, "APPL_QUEUE_RESOLUTION", "ApplQueueResolution"),
    FIX815_ENU_APPL_QUEUE_ACTION(815, "APPL_QUEUE_ACTION", "ApplQueueAction"),
    FIX816_NO_ALT_MD_SOURCE(816, "NO_ALT_MD_SOURCE", "NoAltMDSource"),
    FIX817_ALT_MD_SOURCE_ID(817, "ALT_MD_SOURCE_ID", "AltMDSourceID"),
    FIX818_SECONDARY_TRADE_REPORT_ID(818, "SECONDARY_TRADE_REPORT_ID", "SecondaryTradeReportID"),
    FIX819_ENU_AVG_PX_INDICATOR(819, "AVG_PX_INDICATOR", "AvgPxIndicator"),
    FIX820_TRADE_LINK_ID(820, "TRADE_LINK_ID", "TradeLinkID"),

    FIX821_ORDER_INPUT_DEVICE(821, "ORDER_INPUT_DEVICE", "OrderInputDevice"),
    FIX822_UNDERLYING_TRADING_SESSION_ID(822, "UNDERLYING_TRADING_SESSION_ID", "UnderlyingTradingSessionID"),
    FIX823_UNDERLYING_TRADING_SESSION_SUB_ID(823, "UNDERLYING_TRADING_SESSION_SUB_ID", "UnderlyingTradingSessionSubID"),
    FIX824_TRADE_LEG_REF_ID(824, "TRADE_LEG_REF_ID", "TradeLegRefID"),
    FIX825_EXCHANGE_RULE(825, "EXCHANGE_RULE", "ExchangeRule"),
    FIX826_ENU_TRADE_ALLOC_INDICATOR(826, "TRADE_ALLOC_INDICATOR", "TradeAllocIndicator"),
    FIX827_ENU_EXPIRATION_CYCLE(827, "EXPIRATION_CYCLE", "ExpirationCycle"),
    FIX828_ENU_TRD_TYPE(828, "TRD_TYPE", "TrdType"),
    FIX829_ENU_TRD_SUB_TYPE(829, "TRD_SUB_TYPE", "TrdSubType"),
    FIX830_TRANSFER_REASON(830, "TRANSFER_REASON", "TransferReason"),

    FIX831_ASGN_REQ_ID(831, "ASGN_REQ_ID", "AsgnReqID"),
    FIX832_TOT_NUM_ASSIGNMENT_REPORTS(832, "TOT_NUM_ASSIGNMENT_REPORTS", "TotNumAssignmentReports"),
    FIX833_ASGN_RPT_ID(833, "ASGN_RPT_ID", "AsgnRptID"),
    FIX834_THRESHOLD_AMOUNT(834, "THRESHOLD_AMOUNT", "ThresholdAmount"),
    FIX835_ENU_PEG_MOVE_TYPE(835, "PEG_MOVE_TYPE", "PegMoveType"),
    FIX836_ENU_PEG_OFFSET_TYPE(836, "PEG_OFFSET_TYPE", "PegOffsetType"),
    FIX837_ENU_PEG_LIMIT_TYPE(837, "PEG_LIMIT_TYPE", "PegLimitType"),
    FIX838_ENU_PEG_ROUND_DIRECTION(838, "PEG_ROUND_DIRECTION", "PegRoundDirection"),
    FIX839_PEGGED_PRICE(839, "PEGGED_PRICE", "PeggedPrice"),
    FIX840_ENU_PEG_SCOPE(840, "PEG_SCOPE", "PegScope"),

    FIX841_ENU_DISCRETION_MOVE_TYPE(841, "DISCRETION_MOVE_TYPE", "DiscretionMoveType"),
    FIX842_ENU_DISCRETION_OFFSET_TYPE(842, "DISCRETION_OFFSET_TYPE", "DiscretionOffsetType"),
    FIX843_ENU_DISCRETION_LIMIT_TYPE(843, "DISCRETION_LIMIT_TYPE", "DiscretionLimitType"),
    FIX844_ENU_DISCRETION_ROUND_DIRECTION(844, "DISCRETION_ROUND_DIRECTION", "DiscretionRoundDirection"),
    FIX845_DISCRETION_PRICE(845, "DISCRETION_PRICE", "DiscretionPrice"),
    FIX846_ENU_DISCRETION_SCOPE(846, "DISCRETION_SCOPE", "DiscretionScope"),
    FIX847_ENU_TARGET_STRATEGY(847, "TARGET_STRATEGY", "TargetStrategy"),
    FIX848_TARGET_STRATEGY_PARAMETERS(848, "TARGET_STRATEGY_PARAMETERS", "TargetStrategyParameters"),
    FIX849_PARTICIPATION_RATE(849, "PARTICIPATION_RATE", "ParticipationRate"),
    FIX850_TARGET_STRATEGY_PERFORMANCE(850, "TARGET_STRATEGY_PERFORMANCE", "TargetStrategyPerformance"),

    FIX851_ENU_LAST_LIQUIDITY_IND(851, "LAST_LIQUIDITY_IND", "LastLiquidityInd"),
    FIX852_BOOL_PUBLISH_TRD_INDICATOR(852, "PUBLISH_TRD_INDICATOR", "PublishTrdIndicator"),
    FIX853_ENU_SHORT_SALE_REASON(853, "SHORT_SALE_REASON", "ShortSaleReason"),
    FIX854_ENU_QTY_TYPE(854, "QTY_TYPE", "QtyType"),
    FIX855_SECONDARY_TRD_TYPE(855, "SECONDARY_TRD_TYPE", "SecondaryTrdType"),
    FIX856_ENU_TRADE_REPORT_TYPE(856, "TRADE_REPORT_TYPE", "TradeReportType"),
    FIX857_ENU_ALLOC_NO_ORDERS_TYPE(857, "ALLOC_NO_ORDERS_TYPE", "AllocNoOrdersType"),
    FIX858_SHARED_COMMISSION(858, "SHARED_COMMISSION", "SharedCommission"),
    FIX859_CONFIRM_REQ_ID(859, "CONFIRM_REQ_ID", "ConfirmReqID"),
    FIX860_AVG_PAR_PX(860, "AVG_PAR_PX", "AvgParPx"),

    FIX861_REPORTED_PX(861, "REPORTED_PX", "ReportedPx"),
    FIX862_NO_CAPACITIES(862, "NO_CAPACITIES", "NoCapacities"),
    FIX863_ORDER_CAPACITY_QTY(863, "ORDER_CAPACITY_QTY", "OrderCapacityQty"),
    FIX864_NO_EVENTS(864, "NO_EVENTS", "NoEvents"),
    FIX865_ENU_EVENT_TYPE(865, "EVENT_TYPE", "EventType"),
    FIX866_EVENT_DATE(866, "EVENT_DATE", "EventDate"),
    FIX867_EVENT_PX(867, "EVENT_PX", "EventPx"),
    FIX868_EVENT_TEXT(868, "EVENT_TEXT", "EventText"),
    FIX869_PCT_AT_RISK(869, "PCT_AT_RISK", "PctAtRisk"),
    FIX870_NO_INSTR_ATTRIB(870, "NO_INSTR_ATTRIB", "NoInstrAttrib"),

    FIX871_ENU_INSTR_ATTRIB_TYPE(871, "INSTR_ATTRIB_TYPE", "InstrAttribType"),
    FIX872_INSTR_ATTRIB_VALUE(872, "INSTR_ATTRIB_VALUE", "InstrAttribValue"),
    FIX873_DATED_DATE(873, "DATED_DATE", "DatedDate"),
    FIX874_INTEREST_ACCRUAL_DATE(874, "INTEREST_ACCRUAL_DATE", "InterestAccrualDate"),
    FIX875_ENU_CP_PROGRAM(875, "CP_PROGRAM", "CPProgram"),
    FIX876_CP_REG_TYPE(876, "CP_REG_TYPE", "CPRegType"),
    FIX877_UNDERLYING_CP_PROGRAM(877, "UNDERLYING_CP_PROGRAM", "UnderlyingCPProgram"),
    FIX878_UNDERLYING_CP_REGTYPE(878, "UNDERLYING_CP_REGTYPE", "UnderlyingCPRegType"),
    FIX879_UNDERLYING_QTY(879, "UNDERLYING_QTY", "UnderlyingQty"),
    FIX880_TRD_MATCH_ID(880, "TRD_MATCH_ID", "TrdMatchID"),

    FIX881_SECONDARY_TRADE_REPORT_REF_ID(881, "SECONDARY_TRADE_REPORT_REF_ID", "SecondaryTradeReportRefID"),
    FIX882_UNDERLYING_DIRTY_PRICE(882, "UNDERLYING_DIRTY_PRICE", "UnderlyingDirtyPrice"),
    FIX883_UNDERLYING_END_PRICE(883, "UNDERLYING_END_PRICE", "UnderlyingEndPrice"),
    FIX884_UNDERLYING_START_VALUE(884, "UNDERLYING_START_VALUE", "UnderlyingStartValue"),
    FIX885_UNDERLYING_CURRENT_VALUE(885, "UNDERLYING_CURRENT_VALUE", "UnderlyingCurrentValue"),
    FIX886_UNDERLYING_END_VALUE(886, "UNDERLYING_END_VALUE", "UnderlyingEndValue"),
    FIX887_NO_UNDERLYING_STIPS(887, "NO_UNDERLYING_STIPS", "NoUnderlyingStips"),
    FIX888_ENU_UNDERLYING_STIP_TYPE(888, "UNDERLYING_STIP_TYPE", "UnderlyingStipType"),
    FIX889_UNDERLYING_STIP_VALUE(889, "UNDERLYING_STIP_VALUE", "UnderlyingStipValue"),
    FIX890_MATURITY_NET_MONEY(890, "MATURITY_NET_MONEY", "MaturityNetMoney"),

    FIX891_ENU_MISC_FEE_BASIS(891, "MISC_FEE_BASIS", "MiscFeeBasis"),
    FIX892_TOT_NO_ALLOCS(892, "TOT_NO_ALLOCS", "TotNoAllocs"),
    FIX893_BOOL_LAST_FRAGMENT(893, "LAST_FRAGMENT", "LastFragment"),
    FIX894_COLL_REQ_ID(894, "COLL_REQ_ID", "CollReqID"),
    FIX895_ENU_COLL_ASGN_REASON(895, "COLL_ASGN_REASON", "CollAsgnReason"),
    FIX896_ENU_COLL_INQUIRY_QUALIFIER(896, "COLL_INQUIRY_QUALIFIER", "CollInquiryQualifier"),
    FIX897_NO_TRADES(897, "NO_TRADES", "NoTrades"),
    FIX898_MARGIN_RATIO(898, "MARGIN_RATIO", "MarginRatio"),
    FIX899_MARGIN_EXCESS(899, "MARGIN_EXCESS", "MarginExcess"),
    FIX900_TOTAL_NET_VALUE(900, "TOTAL_NET_VALUE", "TotalNetValue"),


    // 901-1000

    FIX901_CASH_OUTSTANDING(901, "CASH_OUTSTANDING", "CashOutstanding"),
    FIX902_COLL_ASGN_ID(902, "COLL_ASGN_ID", "CollAsgnID"),
    FIX903_ENU_COLL_ASGN_TRANS_TYPE(903, "COLL_ASGN_TRANS_TYPE", "CollAsgnTransType"),
    FIX904_COLL_RESP_ID(904, "COLL_RESP_ID", "CollRespID"),
    FIX905_ENU_COLL_ASGN_RESP_TYPE(905, "COLL_ASGN_RESP_TYPE", "CollAsgnRespType"),
    FIX906_ENU_COLL_ASGN_REJECT_REASON(906, "COLL_ASGN_REJECT_REASON", "CollAsgnRejectReason"),
    FIX907_COLL_ASGN_REF_ID(907, "COLL_ASGN_REF_ID", "CollAsgnRefID"),
    FIX908_COLL_RPT_ID(908, "COLL_RPT_ID", "CollRptID"),
    FIX909_COLL_INQUIRY_ID(909, "COLL_INQUIRY_ID", "CollInquiryID"),
    FIX910_ENU_COLL_STATUS(910, "COLL_STATUS", "CollStatus"),

    FIX911_TOT_NUM_REPORTS(911, "TOT_NUM_REPORTS", "TotNumReports"),
    FIX912_BOOL_LAST_RPT_REQUESTED(912, "LAST_RPT_REQUESTED", "LastRptRequested"),
    FIX913_AGREEMENT_DESC(913, "AGREEMENT_DESC", "AgreementDesc"),
    FIX914_AGREEMENT_ID(914, "AGREEMENT_ID", "AgreementID"),
    FIX915_AGREEMENT_DATE(915, "AGREEMENT_DATE", "AgreementDate"),
    FIX916_START_DATE(916, "START_DATE", "StartDate"),
    FIX917_END_DATE(917, "END_DATE", "EndDate"),
    FIX918_AGREEMENT_CURRENCY(918, "AGREEMENT_CURRENCY", "AgreementCurrency"),
    FIX919_ENU_DELIVERY_TYPE(919, "DELIVERY_TYPE", "DeliveryType"),
    FIX920_END_ACCRUED_INTEREST_AMT(920, "END_ACCRUED_INTEREST_AMT", "EndAccruedInterestAmt"),

    FIX921_START_CASH(921, "START_CASH", "StartCash"),
    FIX922_END_CASH(922, "END_CASH", "EndCash"),
    FIX923_USER_REQUEST_ID(923, "USER_REQUEST_ID", "UserRequestID"),
    FIX924_ENU_USER_REQUEST_TYPE(924, "USER_REQUEST_TYPE", "UserRequestType"),
    FIX925_STR_NEW_PASSWORD(925, "NEW_PASSWORD", "NewPassword"),
    FIX926_ENU_USER_STATUS(926, "USER_STATUS", "UserStatus"),
    FIX927_USER_STATUS_TEXT(927, "USER_STATUS_TEXT", "UserStatusText"),
    FIX928_ENU_STATUS_VALUE(928, "STATUS_VALUE", "StatusValue"),
    FIX929_STATUS_TEXT(929, "STATUS_TEXT", "StatusText"),
    FIX930_REF_COMP_ID(930, "REF_COMP_ID", "RefCompID"),

    FIX931_REF_SUB_ID(931, "REF_SUB_ID", "RefSubID"),
    FIX932_NETWORK_RESPONSE_ID(932, "NETWORK_RESPONSE_ID", "NetworkResponseID"),
    FIX933_NETWORK_REQUEST_ID(933, "NETWORK_REQUEST_ID", "NetworkRequestID"),
    FIX934_LAST_NETWORK_RESPONSE_ID(934, "LAST_NETWORK_RESPONSE_ID", "LastNetworkResponseID"),
    FIX935_ENU_NETWORK_REQUEST_TYPE(935, "NETWORK_REQUEST_TYPE", "NetworkRequestType"),
    FIX936_NO_COMP_IDS(936, "NO_COMP_IDS", "NoCompIDs"),
    FIX937_ENU_NETWORK_STATUS_RESPONSE_TYPE(937, "NETWORK_STATUS_RESPONSE_TYPE", "NetworkStatusResponseType"),
    FIX938_NO_COLL_INQUIRY_QUALIFIER(938, "NO_COLL_INQUIRY_QUALIFIER", "NoCollInquiryQualifier"),
    FIX939_ENU_TRD_RPT_STATUS(939, "TRD_RPT_STATUS", "TrdRptStatus"),
    FIX940_ENU_AFFIRM_STATUS(940, "AFFIRM_STATUS", "AffirmStatus"),

    FIX941_UNDERLYING_STRIKE_CURRENCY(941, "UNDERLYING_STRIKE_CURRENCY", "UnderlyingStrikeCurrency"),
    FIX942_LEG_STRIKE_CURRENCY(942, "LEG_STRIKE_CURRENCY", "LegStrikeCurrency"),
    FIX943_TIME_BRACKET(943, "TIME_BRACKET", "TimeBracket"),
    FIX944_ENU_COLL_ACTION(944, "COLL_ACTION", "CollAction"),
    FIX945_ENU_COLL_INQUIRY_STATUS(945, "COLL_INQUIRY_STATUS", "CollInquiryStatus"),
    FIX946_ENU_COLL_INQUIRY_RESULT(946, "COLL_INQUIRY_RESULT", "CollInquiryResult"),
    FIX947_STRIKE_CURRENCY(947, "STRIKE_CURRENCY", "StrikeCurrency"),
    FIX948_NO_NESTED_3_PARTY_IDS(948, "NO_NESTED_3_PARTY_IDS", "NoNested3PartyIDs"),
    FIX949_STR_NESTED_3_PARTY_ID(949, "NESTED_3_PARTY_ID", "Nested3PartyID"),
    FIX950_ENU_NESTED_3_PARTY_ID_SOURCE(950, "NESTED_3_PARTY_ID_SOURCE", "Nested3PartyIDSource"),

    FIX951_ENU_NESTED_3_PARTY_ROLE(951, "NESTED_3_PARTY_ROLE", "Nested3PartyRole"),
    FIX952_NO_NESTED_3_PARTY_SUB_IDS(952, "NO_NESTED_3_PARTY_SUB_IDS", "NoNested3PartySubIDs"),
    FIX953_NESTED_3_PARTY_SUB_ID(953, "NESTED_3_PARTY_SUB_ID", "Nested3PartySubID"),
    FIX954_ENU_NESTED_3_PARTY_SUB_ID_TYPE(954, "NESTED_3_PARTY_SUB_ID_TYPE", "Nested3PartySubIDType"),
    FIX955_LEG_CONTRACT_SETTL_MONTH(955, "LEG_CONTRACT_SETTL_MONTH", "LegContractSettlMonth"),
    FIX956_LEG_INTEREST_ACCRUAL_DATE(956, "LEG_INTEREST_ACCRUAL_DATE", "LegInterestAccrualDate"),
    /*
     *
     * End of FIX4.4
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

    FIX44(final int id, final String name, final String description) {
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
    public String toVerboseString() {
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
        for (FIX44 oneFIX : FIX44.values()) {
            System.out.println(oneFIX);
        }
    }
}
