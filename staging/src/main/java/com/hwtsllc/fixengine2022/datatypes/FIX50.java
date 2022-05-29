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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  FIX50 enum defines all the Financial Exchange Protocol's (FIX) fields.
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
public enum FIX50 implements LogFIXString, LogVerboseString {


    /*
     * Start of FIX5.0 as defined by the FIX Protocol Specification 5.0
     *  Tags: 957-1139
     */
    FIX957_NUM_NO_STRATEGY_PARAMETERS(957, "NO_STRATEGY_PARAMETERS", "NoStrategyParameters"),
    FIX958_STR_STRATEGY_PARAMETER_NAME(958, "STRATEGY_PARAMETER_NAME", "StrategyParameterName"),
    FIX959_ENU_STRATEGY_PARAMETER_TYPE(959, "STRATEGY_PARAMETER_TYPE", "StrategyParameterType"),
    FIX960_STR_STRATEGY_PARAMETER_VALUE(960, "STRATEGY_PARAMETER_VALUE", "StrategyParameterValue"),

    FIX961_STR_HOST_CROSS_ID(961, "HOST_CROSS_ID", "HostCrossID"),
    FIX962_UTC_SIDE_TIME_IN_FORCE(962, "SIDE_TIME_IN_FORCE", "SideTimeInForce"),
    FIX963_INT_MD_REPORT_ID(963, "MD_REPORT_ID", "MDReportID"),
    FIX964_INT_SECURITY_REPORT_ID(964, "SECURITY_REPORT_ID", "SecurityReportID"),
    FIX965_ENU_SECURITY_STATUS(965, "SECURITY_STATUS", "SecurityStatus"),
    FIX966_STR_SETTLE_ON_OPEN_FLAG(966, "SETTLE_ON_OPEN_FLAG", "SettleOnOpenFlag"),
    FIX967_FLO_STRIKE_MULTIPLIER(967, "STRIKE_MULTIPLIER", "StrikeMultiplier"),
    FIX968_FLO_STRIKE_VALUE(968, "STRIKE_VALUE", "StrikeValue"),
    FIX969_FLO_MIN_PRICE_INCREMENT(969, "MIN_PRICE_INCREMENT", "MinPriceIncrement"),
    FIX970_INT_POSITION_LIMIT(970, "POSITION_LIMIT", "PositionLimit"),

    FIX971_INT_NT_POSITION_LIMIT(971, "NT_POSITION_LIMIT", "NTPositionLimit"),
    FIX972_PCT_UNDERLYING_ALLOCATION_PERCENT(972, "UNDERLYING_ALLOCATION_PERCENT", "UnderlyingAllocationPercent"),
    FIX973_AMT_UNDERLYING_CASH_AMOUNT(973, "UNDERLYING_CASH_AMOUNT", "UnderlyingCashAmount"),
    FIX974_ENU_UNDERLYING_CASH_TYPE(974, "UNDERLYING_CASH_TYPE", "UnderlyingCashType"),
    FIX975_ENU_UNDERLYING_SETTLEMENT_TYPE(975, "UNDERLYING_SETTLEMENT_TYPE", "UnderlyingSettlementType"),
    FIX976_QUANTITY_DATE(976, "QUANTITY_DATE", "QuantityDate"),
    FIX977_STR_CONT_INT_RPT_ID(977, "CONT_INT_RPT_ID", "ContIntRptID"),
    FIX978_ENU_LATE_INDICATOR(978, "LATE_INDICATOR", "LateIndicator"),
    FIX979_STR_INPUT_SOURCE(979, "INPUT_SOURCE", "InputSource"),
    FIX980_ENU_SECURITY_UPDATE_ACTION(980, "SECURITY_UPDATE_ACTION", "SecurityUpdateAction"),

    FIX981_NUM_NO_EXPIRATION(981, "NO_EXPIRATION", "NoExpiration"),
    FIX982_ENU_EXP_TYPE(982, "EXP_TYPE", "ExpType"),
    FIX983_QTY_EXP_QTY(983, "EXP_QTY", "ExpQty"),
    FIX984_NUM_NO_UNDERLYING_AMOUNTS(984, "NO_UNDERLYING_AMOUNTS", "NoUnderlyingAmounts"),
    FIX985_AMT_UNDERLYING_PAY_AMOUNT(985, "UNDERLYING_PAY_AMOUNT", "UnderlyingPayAmount"),
    FIX986_AMT_UNDERLYING_COLLECT_AMOUNT(986, "UNDERLYING_COLLECT_AMOUNT", "UnderlyingCollectAmount"),
    FIX987_LMD_UNDERLYING_SETTLEMENT_DATE(987, "UNDERLYING_SETTLEMENT_DATE", "UnderlyingSettlementDate"),
    FIX988_STR_UNDERLYING_SETTLEMENT_STATUS(988, "UNDERLYING_SETTLEMENT_STATUS", "UnderlyingSettlementStatus"),
    FIX989_STR_SECONDARY_INDIVIDUAL_ALLOC_ID(989, "SECONDARY_INDIVIDUAL_ALLOC_ID", "SecondaryIndividualAllocID"),
    FIX990_STR_LEG_REPORT_ID(990, "LEG_REPORT_ID", "LegReportID"),

    FIX991_PRC_RND_PX(991, "RND_PX", "RndPx"),
    FIX992_ENU_INDIVIDUAL_ALLOC_TYPE(992, "INDIVIDUAL_ALLOC_TYPE", "IndividualAllocType"),
    FIX993_STR_ALLOC_CUSTOMER_CAPACITY(993, "ALLOC_CUSTOMER_CAPACITY", "AllocCustomerCapacity"),
    FIX994_STR_TIER_CODE(994, "TIER_CODE", "TierCode"),
    FIX996_ENU_UNIT_OF_MEASURE(996, "UNIT_OF_MEASURE", "UnitOfMeasure"),
    FIX997_ENU_TIME_UNIT(997, "TIME_UNIT", "TimeUnit"),
    FIX998_ENU_UNDERLYING_UNIT_OF_MEASURE(998, "UNDERLYING_UNIT_OF_MEASURE", "UnderlyingUnitOfMeasure"),
    FIX999_ENU_LEG_UNIT_OF_MEASURE(999, "LEG_UNIT_OF_MEASURE", "LegUnitOfMeasure"),
    FIX1000_ENU_UNDERLYING_TIME_UNIT(1000, "UNDERLYING_TIME_UNIT", "UnderlyingTimeUnit"),


    // 1001-1100

    FIX1001_ENU_LEG_TIME_UNIT(1001, "LEG_TIME_UNIT", "LegTimeUnit"),
    FIX1002_ENU_ALLOC_METHOD(1002, "ALLOC_METHOD", "AllocMethod"),
    FIX1003_STR_TRADE_ID(1003, "TRADE_ID", "TradeID"),
    FIX1005_STR_SIDE_TRADE_REPORT_ID(1005, "SIDE_TRADE_REPORT_ID", "SideTradeReportID"),
    FIX1006_STR_SIDE_FILL_STATION_CD(1006, "SIDE_FILL_STATION_CD", "SideFillStationCD"),
    FIX1007_STR_SIDE_REASON_CD(1007, "SIDE_REASON_CD", "SideReasonCD"),
    FIX1008_ENU_SIDE_TRD_SUB_TYP(1008, "SIDE_TRD_SUB_TYP", "SideTrdSubTyp"),
    FIX1009_INT_SIDE_QTY(1009, "SIDE_QTY", "SideQty"),

    FIX1011_STR_MESSAGE_EVENT_SOURCE(1011, "MESSAGE_EVENT_SOURCE", "MessageEventSource"),
    FIX1012_UTC_SIDE_TRD_REG_TIMESTAMP(1012, "SIDE_TRD_REG_TIMESTAMP", "SideTrdRegTimestamp"),
    FIX1013_INT_SIDE_TRD_REG_TIMESTAMP_TYPE(1013, "SIDE_TRD_REG_TIMESTAMP_TYPE", "SideTrdRegTimestampType"),
    FIX1014_STR_SIDE_TRD_REG_TIMESTAMP_SRC(1014, "SIDE_TRD_REG_TIMESTAMP_SRC", "SideTrdRegTimestampSrc"),
    FIX1015_ENU_AS_OF_INDICATOR(1015, "AS_OF_INDICATOR", "AsOfIndicator"),
    FIX1016_NUM_NO_SIDE_TRD_REG_TS(1016, "NO_SIDE_TRD_REG_TS", "NoSideTrdRegTS"),
    FIX1017_FLO_LEG_OPTION_RATIO(1017, "LEG_OPTION_RATIO", "LegOptionRatio"),
    FIX1018_NUM_NO_INSTRUMENT_PARTIES(1018, "NO_INSTRUMENT_PARTIES", "NoInstrumentParties"),
    FIX1019_STR_INSTRUMENT_PARTY_ID(1019, "INSTRUMENT_PARTY_ID", "InstrumentPartyID"),
    FIX1020_QTY_TRADE_VOLUME(1020, "TRADE_VOLUME", "TradeVolume"),

    FIX1021_ENU_MD_BOOK_TYPE(1021, "MD_BOOK_TYPE", "MDBookType"),
    FIX1022_STR_MD_FEED_TYPE(1022, "MD_FEED_TYPE", "MDFeedType"),
    FIX1023_INT_MD_PRICE_LEVEL(1023, "MD_PRICE_LEVEL", "MDPriceLevel"),
    FIX1024_ENU_MD_ORIGIN_TYPE(1024, "MD_ORIGIN_TYPE", "MDOriginType"),
    FIX1025_PRC_FIRST_PX(1025, "FIRST_PX", "FirstPx"),
    FIX1026_FLO_MD_ENTRY_SPOT_RATE(1026, "MD_ENTRY_SPOT_RATE", "MDEntrySpotRate"),
    FIX1027_PXO_MD_ENTRY_FORWARD_POINTS(1027, "MD_ENTRY_FORWARD_POINTS", "MDEntryForwardPoints"),
    FIX1028_ENU_MANUAL_ORDER_INDICATOR(1028, "MANUAL_ORDER_INDICATOR", "ManualOrderIndicator"),
    FIX1029_ENU_CUST_DIRECTED_ORDER(1029, "CUST_DIRECTED_ORDER", "CustDirectedOrder"),
    FIX1030_STR_RECEIVED_DEPT_ID(1030, "RECEIVED_DEPT_ID", "ReceivedDeptID"),

    FIX1031_ENU_CUST_ORDER_HANDLING_INST(1031, "CUST_ORDER_HANDLING_INST", "CustOrderHandlingInst"),
    FIX1032_ENU_ORDER_HANDLING_INST_SOURCE(1032, "ORDER_HANDLING_INST_SOURCE", "OrderHandlingInstSource"),
    FIX1033_ENU_DESK_TYPE(1033, "DESK_TYPE", "DeskType"),
    FIX1034_ENU_DESK_TYPE_SOURCE(1034, "DESK_TYPE_SOURCE", "DeskTypeSource"),
    FIX1035_ENU_DESK_ORDER_HANDLING_INST(1035, "DESK_ORDER_HANDLING_INST", "DeskOrderHandlingInst"),
    FIX1036_ENU_EXEC_ACK_STATUS(1036, "EXEC_ACK_STATUS", "ExecAckStatus"),
    FIX1037_AMT_UNDERLYING_DELIVERY_AMOUNT(1037, "UNDERLYING_DELIVERY_AMOUNT", "UnderlyingDeliveryAmount"),
    FIX1038_AMT_UNDERLYING_CAP_VALUE(1038, "UNDERLYING_CAP_VALUE", "UnderlyingCapValue"),
    FIX1039_STR_UNDERLYING_SETTL_METHOD(1039, "UNDERLYING_SETTL_METHOD", "UnderlyingSettlMethod"),
    FIX1040_STR_SECONDARY_TRADE_ID(1040, "SECONDARY_TRADE_ID", "SecondaryTradeID"),

    FIX1041_STR_FIRM_TRADE_ID(1041, "FIRM_TRADE_ID", "FirmTradeID"),
    FIX1042_STR_SECONDARY_FIRM_TRADE_ID(1042, "SECONDARY_FIRM_TRADE_ID", "SecondaryFirmTradeID"),
    FIX1043_ENU_COLL_APPL_TYPE(1043, "COLL_APPL_TYPE", "CollApplType"),
    FIX1044_QTY_UNDERLYING_ADJUSTED_QUANTITY(1044, "UNDERLYING_ADJUSTED_QUANTITY", "UnderlyingAdjustedQuantity"),
    FIX1045_FLO_UNDERLYING_FX_RATE(1045, "UNDERLYING_FX_RATE", "UnderlyingFXRate"),
    FIX1046_ENU_UNDERLYING_FX_RATE_CALC(1046, "UNDERLYING_FX_RATE_CALC", "UnderlyingFXRateCalc"),
    FIX1047_ENU_ALLOC_POSITION_EFFECT(1047, "ALLOC_POSITION_EFFECT", "AllocPositionEffect"),
    FIX1048_PXO_DEALING_CAPACITY(1048, "DEALING_CAPACITY", "DealingCapacity"),
    FIX1049_ENU_INSTRMT_ASSIGNMENT_METHOD(1049, "INSTRMT_ASSIGNMENT_METHOD", "InstrmtAssignmentMethod"),
    FIX1050_ENU_INSTRUMENT_PARTY_ID_SOURCE(1050, "INSTRUMENT_PARTY_ID_SOURCE", "InstrumentPartyIDSource"),

    FIX1051_ENU_INSTRUMENT_PARTY_ROLE(1051, "INSTRUMENT_PARTY_ROLE", "InstrumentPartyRole"),
    FIX1052_NUM_NO_INSTRUMENT_PARTY_SUB_IDS(1052, "NO_INSTRUMENT_PARTY_SUB_IDS", "NoInstrumentPartySubIDs"),
    FIX1053_STR_INSTRUMENT_PARTY_SUB_ID(1053, "INSTRUMENT_PARTY_SUB_ID", "InstrumentPartySubID"),
    FIX1054_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE(1054, "INSTRUMENT_PARTY_SUB_ID_TYPE", "InstrumentPartySubIDType"),
    FIX1055_STR_POSITION_CURRENCY(1055, "POSITION_CURRENCY", "PositionCurrency"),
    FIX1056_QTY_CALCULATED_CCY_LAST_QTY(1056, "CALCULATED_CCY_LAST_QTY", "CalculatedCcyLastQty"),
    FIX1057_ENU_AGGRESSOR_INDICATOR(1057, "AGGRESSOR_INDICATOR", "AggressorIndicator"),
    FIX1058_NUM_NO_UNDLY_INSTRUMENT_PARTIES(1058, "NO_UNDLY_INSTRUMENT_PARTIES", "NoUndlyInstrumentParties"),
    FIX1059_STR_UNDLY_INSTRUMENT_PARTY_ID(1059, "UNDLY_INSTRUMENT_PARTY_ID", "UndlyInstrumentPartyID"),
    FIX1060_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE(1060, "UNDLY_INSTRUMENT_PARTY_ID_SOURCE", "UndlyInstrumentPartyIDSource"),

    FIX1061_ENU_UNDLY_INSTRUMENT_PARTY_ROLE(1061, "UNDLY_INSTRUMENT_PARTY_ROLE", "UndlyInstrumentPartyRole"),
    FIX1062_NUM_NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS(1062, "NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS", "NoUndlyInstrumentPartySubIDs"),
    FIX1063_STR_UNDLY_INSTRUMENT_PARTY_SUB_ID(1063, "UNDLY_INSTRUMENT_PARTY_SUB_ID", "UndlyInstrumentPartySubID"),
    FIX1064_ENU_UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE(1064, "UNDLY_INSTRUMENT_PARTY_SUB_ID_TYPE", "UndlyInstrumentPartySubIDType"),
    FIX1065_PXO_BID_SWAP_POINTS(1065, "BID_SWAP_POINTS", "BidSwapPoints"),
    FIX1066_PXO_OFFER_SWAP_POINTS(1066, "OFFER_SWAP_POINTS", "OfferSwapPoints"),
    FIX1067_PXO_LEG_BID_FORWARD_POINTS(1067, "LEG_BID_FORWARD_POINTS", "LegBidForwardPoints"),
    FIX1068_PXO_LEG_OFFER_FORWARD_POINTS(1068, "LEG_OFFER_FORWARD_POINTS", "LegOfferForwardPoints"),
    FIX1069_PXO_SWAP_POINTS(1069, "SWAP_POINTS", "SwapPoints"),
    FIX1070_ENU_MD_QUOTE_TYPE(1070, "MD_QUOTE_TYPE", "MDQuoteType"),

    FIX1071_PXO_LAST_SWAP_POINTS(1071, "LAST_SWAP_POINTS", "LastSwapPoints"),
    FIX1072_AMT_SIDE_GROSS_TRADE_AMT(1072, "SIDE_GROSS_TRADE_AMT", "SideGrossTradeAmt"),
    FIX1073_PXO_LEG_LAST_FORWARD_POINTS(1073, "LEG_LAST_FORWARD_POINTS", "LegLastForwardPoints"),
    FIX1074_QTY_LEG_CALCULATED_CCY_LAST_QTY(1074, "LEG_CALCULATED_CCY_LAST_QTY", "LegCalculatedCcyLastQty"),
    FIX1075_AMT_LEG_GROSS_TRADE_AMT(1075, "LEG_GROSS_TRADE_AMT", "LegGrossTradeAmt"),
    FIX1079_MATURITY_TIME(1079, "MATURITY_TIME", "MaturityTime"),
    FIX1080_STR_REF_ORDER_ID(1080, "REF_ORDER_ID", "RefOrderID"),

    FIX1081_ENU_REF_ORDER_ID_SOURCE(1081, "REF_ORDER_ID_SOURCE", "RefOrderIDSource"),
    FIX1082_QTY_SECONDARY_DISPLAY_QTY(1082, "SECONDARY_DISPLAY_QTY", "SecondaryDisplayQty"),
    FIX1083_ENU_DISPLAY_WHEN(1083, "DISPLAY_WHEN", "DisplayWhen"),
    FIX1084_ENU_DISPLAY_METHOD(1084, "DISPLAY_METHOD", "DisplayMethod"),
    FIX1085_QTY_DISPLAY_LOW_QTY(1085, "DISPLAY_LOW_QTY", "DisplayLowQty"),
    FIX1086_QTY_DISPLAY_HIGH_QTY(1086, "DISPLAY_HIGH_QTY", "DisplayHighQty"),
    FIX1087_QTY_DISPLAY_MIN_INCR(1087, "DISPLAY_MIN_INCR", "DisplayMinIncr"),
    FIX1088_QTY_REFRESH_QTY(1088, "REFRESH_QTY", "RefreshQty"),
    FIX1089_QTY_MATCH_INCREMENT(1089, "MATCH_INCREMENT", "MatchIncrement"),
    FIX1090_MAX_PRICE_LEVELS(1090, "MAX_PRICE_LEVELS", "MaxPriceLevels"),

    FIX1091_ENU_PRE_TRADE_ANONYMITY(1091, "PRE_TRADE_ANONYMITY", "PreTradeAnonymity"),
    FIX1092_ENU_PRICE_PROTECTION_SCOPE(1092, "PRICE_PROTECTION_SCOPE", "PriceProtectionScope"),
    FIX1093_ENU_LOT_TYPE(1093, "LOT_TYPE", "LotType"),
    FIX1094_ENU_PEG_PRICE_TYPE(1094, "PEG_PRICE_TYPE", "PegPriceType"),
    FIX1095_PRC_PEGGED_REF_PRICE(1095, "PEGGED_REF_PRICE", "PeggedRefPrice"),
    FIX1096_ENU_PEG_SECURITY_ID_SOURCE(1096, "PEG_SECURITY_ID_SOURCE", "PegSecurityIDSource"),
    FIX1097_STR_PEG_SECURITY_ID(1097, "PEG_SECURITY_ID", "PegSecurityID"),
    FIX1098_STR_PEG_SYMBOL(1098, "PEG_SYMBOL", "PegSymbol"),
    FIX1099_STR_PEG_SECURITY_DESC(1099, "PEG_SECURITY_DESC", "PegSecurityDesc"),
    FIX1100_ENU_TRIGGER_TYPE(1100, "TRIGGER_TYPE", "TriggerType"),


    // 1101-1200

    FIX1101_ENU_TRIGGER_ACTION(1101, "TRIGGER_ACTION", "TriggerAction"),
    FIX1102_PRC_TRIGGER_PRICE(1102, "TRIGGER_PRICE", "TriggerPrice"),
    FIX1103_STR_TRIGGER_SYMBOL(1103, "TRIGGER_SYMBOL", "TriggerSymbol"),
    FIX1104_STR_TRIGGER_SECURITY_ID(1104, "TRIGGER_SECURITY_ID", "TriggerSecurityID"),
    FIX1105_ENU_TRIGGER_SECURITY_ID_SOURCE(1105, "TRIGGER_SECURITY_ID_SOURCE", "TriggerSecurityIDSource"),
    FIX1106_STR_TRIGGER_SECURITY_DESC(1106, "TRIGGER_SECURITY_DESC", "TriggerSecurityDesc"),
    FIX1107_ENU_TRIGGER_PRICE_TYPE(1107, "TRIGGER_PRICE_TYPE", "TriggerPriceType"),
    FIX1108_ENU_TRIGGER_PRICE_TYPE_SCOPE(1108, "TRIGGER_PRICE_TYPE_SCOPE", "TriggerPriceTypeScope"),
    FIX1109_ENU_TRIGGER_PRICE_DIRECTION(1109, "TRIGGER_PRICE_DIRECTION", "TriggerPriceDirection"),
    FIX1110_PRC_TRIGGER_NEW_PRICE(1110, "TRIGGER_NEW_PRICE", "TriggerNewPrice"),

    FIX1111_ENU_TRIGGER_ORDER_TYPE(1111, "TRIGGER_ORDER_TYPE", "TriggerOrderType"),
    FIX1112_QTY_TRIGGER_NEW_QTY(1112, "TRIGGER_NEW_QTY", "TriggerNewQty"),
    FIX1113_STR_TRIGGER_TRADING_SESSION_ID(1113, "TRIGGER_TRADING_SESSION_ID", "TriggerTradingSessionID"),
    FIX1114_STR_TRIGGER_TRADING_SESSION_SUB_ID(1114, "TRIGGER_TRADING_SESSION_SUB_ID", "TriggerTradingSessionSubID"),
    FIX1115_ENU_ORDER_CATEGORY(1115, "ORDER_CATEGORY", "OrderCategory"),
    FIX1116_NUM_NO_ROOT_PARTY_IDS(1116, "NO_ROOT_PARTY_IDS", "NoRootPartyIDs"),
    FIX1117_STR_ROOT_PARTY_ID(1117, "ROOT_PARTY_ID", "RootPartyID"),
    FIX1118_ENU_ROOT_PARTY_ID_SOURCE(1118, "ROOT_PARTY_ID_SOURCE", "RootPartyIDSource"),
    FIX1119_ENU_ROOT_PARTY_ROLE(1119, "ROOT_PARTY_ROLE", "RootPartyRole"),
    FIX1120_NUM_NO_ROOT_PARTY_SUB_IDS(1120, "NO_ROOT_PARTY_SUB_IDS", "NoRootPartySubIDs"),

    FIX1121_STR_ROOT_PARTY_SUB_ID(1121, "ROOT_PARTY_SUB_ID", "RootPartySubID"),
    FIX1122_ENU_ROOT_PARTY_SUB_ID_TYPE(1122, "ROOT_PARTY_SUB_ID_TYPE", "RootPartySubIDType"),
    FIX1123_ENU_TRADE_HANDLING_INSTR(1123, "TRADE_HANDLING_INSTR", "TradeHandlingInstr"),
    FIX1124_ENU_ORIG_TRADE_HANDLING_INSTR(1124, "ORIG_TRADE_HANDLING_INSTR", "OrigTradeHandlingInstr"),
    FIX1125_LMD_ORIG_TRADE_DATE(1125, "ORIG_TRADE_DATE", "OrigTradeDate"),
    FIX1126_STR_ORIG_TRADE_ID(1126, "ORIG_TRADE_ID", "OrigTradeID"),
    FIX1127_STR_ORIG_SECONDARY_TRADE_ID(1127, "ORIG_SECONDARY_TRADE_ID", "OrigSecondaryTradeID"),
    FIX1128_ENU_APPL_VER_ID(1128, "APPL_VER_ID", "ApplVerID"),
    FIX1129_STR_CSTM_APPL_VER_ID(1129, "CSTM_APPL_VER_ID", "CstmApplVerID"),
    FIX1130_ENU_REF_APPL_VER_ID(1130, "REF_APPL_VER_ID", "RefApplVerID"),

    FIX1131_STR_REF_CSTM_APPL_VER_ID(1131, "REF_CSTM_APPL_VER_ID", "RefCstmApplVerID"),
    FIX1132_TZ_TRANSACT_TIME(1132, "TZ_TRANSACT_TIME", "TZTransactTime"),
    FIX1133_ENU_EX_DESTINATION_ID_SOURCE(1133, "EX_DESTINATION_ID_SOURCE", "ExDestinationIDSource"),
    FIX1134_ENU_REPORTED_PX_DIFF(1134, "REPORTED_PX_DIFF", "ReportedPxDiff"),
    FIX1135_STR_RPT_SYS(1135, "RPT_SYS", "RptSys"),
    FIX1136_STR_ALLOC_CLEARING_FEE_INDICATOR(1136, "ALLOC_CLEARING_FEE_INDICATOR", "AllocClearingFeeIndicator"),
    FIX1137_ENU_DEFAULT_APPL_VER_ID(1137, "DEFAULT_APPL_VER_ID", "DefaultApplVerID"),
    FIX1138_QTY_DISPLAY_QTY(1138, "DISPLAY_QTY", "DisplayQty"),
    FIX1139_STR_EXCHANGE_SPECIAL_INSTRUCTIONS(1139, "EXCHANGE_SPECIAL_INSTRUCTIONS", "ExchangeSpecialInstructions"),
    /*
     *
     * End of FIX5.0
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

    FIX50(final int id, final String name, final String description) {
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
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific ID code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
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
        for (FIX50 oneFIX : FIX50.values()) {
            System.out.println(oneFIX);
        }
    }
}
