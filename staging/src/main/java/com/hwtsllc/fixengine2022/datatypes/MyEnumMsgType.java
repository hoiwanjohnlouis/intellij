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
 *  35 (same as TAGS 35, 372)
 *  MsgType
 *  String
 *  <p>
 *  Defines message type    ALWAYS THIRD FIELD IN MESSAGE. (Always unencrypted)
 *  <p>
 *  Note: A "U" as the first character in the MsgType field (i.e. U, U2, etc)
 *        indicates that the  message format is privately defined between the sender and receiver.
 *  <p>
 *  *** Note the use of lower case letters ***
 *  <p></p>
 *  372 (same as TAGS 35, 372)
 *  RefMsgType
 *  String
 *  <p>
 *  The MsgType (35) of the FIX message being referenced.
 *  <p></p>
 *  <p>    0-9, msg types
 *  <p>    A-Z, msg types, skipping "I", and "O"
 *  <p>    a-z, msg types
 *  <p>    AA-AZ, msg types
 *  <p>    BA-BP, msg types
 *  <p></p>
 *  <p>    0-9 msg types
 *  <p>    HEARTBEAT("0", "HEARTBEAT", "0 - Heartbeat" ),
 *  <p>    TEST_REQUEST("1", "TEST_REQUEST", "1 - Test Request" ),
 *  <p>    RESEND_REQUEST("2", "RESEND_REQUEST", "2 - Resend Request" ),
 *  <p>    REJECT("3", "REJECT", "3 - Reject" ),
 *  <p>    SEQUENCE_RESET("4", "SEQUENCE_RESET", "4 - Sequence Reset" ),
 *  <p></p>
 *  <p>    LOGOUT("5", "LOGOUT", "5 - Logout" ),
 *  <p>    INDICATION_OF_INTEREST("6", "INDICATION_OF_INTEREST", "6 - Indication of Interest" ),
 *  <p>    ADVERTISEMENT("7", "ADVERTISEMENT", "7 - Advertisement" ),
 *  <p>    EXECUTION_REPORT("8", "EXECUTION_REPORT", "8 - Execution Report" ),
 *  <p>    ORDER_CANCEL_REJECT("9", "ORDER_CANCEL_REJECT", "9 - Order Cancel Reject" ),
 *  <p></p>
 *  <p>    A-Z msg types, skipping "I", and "O"
 *  <p>    LOGON("A", "LOGON", "A - Logon" ),
 *  <p>    NEWS("B", "NEWS", "B - News" ),
 *  <p>    EMAIL("C", "EMAIL", "C - Email" ),
 *  <p>    NEW_ORDER_SINGLE("D", "NEW_ORDER_SINGLE", "D - New Order - Single" ),
 *  <p>    NEW_ORDER_LIST("E", "NEW_ORDER_LIST", "E - New Order - List" ),
 *  <p></p>
 *  <p>    ORDER_CANCEL_REQUEST("F", "ORDER_CANCEL_REQUEST", "F - Order Cancel Request" ),
 *  <p>    ORDER_MODIFICATION("G", "ORDER_MODIFICATION","G - Order Modification Request" ),
 *  <p>    ORDER_STATUS_REQUEST("H", "ORDER_STATUS_REQUEST", "H - Order Status Request" ),
 *  <p>    ALLOCATION_INSTRUCTION("J", "ALLOCATION_INSTRUCTION", "J - Allocation Instruction" ),
 *  <p>    LIST_CANCEL_REQUEST("K", "LIST_CANCEL_REQUEST", "K - List Cancel Request" ),
 *  <p></p>
 *  <p>    LIST_EXECUTE("L", "LIST_EXECUTE", "L - List Execute" ),
 *  <p>    LIST_STATUS_REQUEST("M", "LIST_STATUS_REQUEST", "M - List Status Request" ),
 *  <p>    LIST_STATUS("N", "LIST_STATUS", "N - List Status" ),
 *  <p>    ALLOCATION_INSTRUCTION_ACK("P", "ALLOCATION_INSTRUCTION_ACK", "P - Allocation Instruction Ack" ),
 *  <p>    DONT_KNOW_TRADE("Q", "DONT_KNOW_TRADE", "Q - Don't Know Trade (DK)" ),
 *  <p></p>
 *  <p>    QUOTE_REQUEST("R", "QUOTE_REQUEST", "R - Quote Request" ),
 *  <p>    QUOTE("S", "QUOTE", "S - Quote" ),
 *  <p>    SETTLEMENT_INSTRUCTIONS("T", "SETTLEMENT_INSTRUCTIONS", "T - Settlement Instructions" ),
 *  <p>    MARKET_DATA_REQUEST("V", "MARKET_DATA_REQUEST", "V - Market Data Request" ),
 *  <p>    MARKET_DATA_REFRESH("W", "MARKET_DATA_REFRESH", "W - Market Data - Snapshot/Full Refresh" ),
 *  <p></p>
 *  <p>    MARKET_DATA_INCREMENTAL_REFRESH("X", "MARKET_DATA_INCREMENTAL_REFRESH",
 *                          "X - Market Data - Incremental Refresh" ),
 *  <p>    MARKET_DATA_REQUEST_REJECT("Y", "MARKET_DATA_REQUEST_REJECT", "Y - Market Data Request Reject" ),
 *  <p>    QUOTE_CANCEL("Z", "QUOTE_CANCEL", "Z - Quote Cancel" ),
 *  <p></p>
 *  <p>    a-z msg types
 *  <p>    QUOTE_STATUS_REQUEST("a", "QUOTE_STATUS_REQUEST", "a - Quote Status Request" ),
 *  <p>    MASS_QUOTE_ACKNOWLEDGEMENT("b", "MASS_QUOTE_ACKNOWLEDGEMENT", "b - Mass Quote Acknowledgement" ),
 *  <p>    SECURITY_DEFINITION_REQUEST("c", "SECURITY_DEFINITION_REQUEST", "c - Security Definition Request" ),
 *  <p>    SECURITY_DEFINITION("d", "SECURITY_DEFINITION", "d - Security Definition" ),
 *  <p>    SECURITY_STATUS_REQUEST("e", "SECURITY_STATUS_REQUEST", "e - Security Status Request" ),
 *  <p></p>
 *  <p>    SECURITY_STATUS("f", "SECURITY_STATUS", "f - Security Status" ),
 *  <p>    TRADING_SESSION_STATUS_REQUEST("g", "TRADING_SESSION_STATUS_REQUEST",
 *                          "g - Trading Session Status Request" ),
 *  <p>    TRADING_SESSION_STATUS("h", "TRADING_SESSION_STATUS", "h - Trading Session Status" ),
 *  <p>    MASS_QUOTE("i", "MASS_QUOTE", "i - Mass Quote" ),
 *  <p>    BUSINESS_MESSAGE_REJECT("j", "BUSINESS_MESSAGE_REJECT", "j - Business Message Reject" ),
 *  <p></p>
 *  <p>    BID_REQUEST("k", "BID_REQUEST", "k - Bid Request" ),
 *  <p>    BID_RESPONSE("l", "BID_RESPONSE", "l - Bid Response (lowercase L)" ),
 *  <p>    LIST_STRIKE_PRICE("m", "LIST_STRIKE_PRICE", "m - List Strike Price" ),
 *  <p>    XML_MESSAGE("n", "XML_MESSAGE", "n - XML message (e.g. non FIX Msg Type)" ),
 *  <p>    REGISTRATION_INSTRUCTIONS("o", "REGISTRATION_INSTRUCTIONS", "o - Registration Instructions" ),
 *  <p></p>
 *  <p>    REGISTRATION_INSTRUCTIONS_RESPONSE("p", "REGISTRATION_INSTRUCTIONS_RESPONSE",
 *                          "p - Registration Instructions Response" ),
 *  <p>    ORDER_MASS_CANCEL_REQUEST("q", "ORDER_MASS_CANCEL_REQUEST", "q - Order Mass Cancel Request" ),
 *  <p>    ORDER_MASS_CANCEL_REPORT("r", "ORDER_MASS_CANCEL_REPORT", "r - Order Mass Cancel Report" ),
 *  <p>    NEW_ORDER_CROSS("s", "NEW_ORDER_CROSS", "s - New Order - Cross" ),
 *  <p>    CROSS_ORDER_MODIFICATION_REQUEST("t", "CROSS_ORDER_MODIFICATION_REQUEST",
 *                          "t - Cross Order Modification Request" ),
 *  <p></p>
 *  <p>    CROSS_ORDER_CANCEL_REQUEST("u", "CROSS_ORDER_CANCEL_REQUEST", "u - Cross Order Cancel Request" ),
 *  <p>    SECURITY_TYPE_REQUEST("v", "SECURITY_TYPE_REQUEST", "v - Security Type Request" ),
 *  <p>    SECURITY_TYPES("w", "SECURITY_TYPES", "w - Security Types" ),
 *  <p>    SECURITY_LIST_REQUEST("x", "SECURITY_LIST_REQUEST", "x - Security List Request" ),
 *  <p>    SECURITY_LIST("y", "SECURITY_LIST", "y - Security List" ),
 *  <p></p>
 *  <p>    DERIVATIVE_SECURITY_LIST_REQUEST("z", "DERIVATIVE_SECURITY_LIST_REQUEST",
 *                          "z - Derivative Security List Request" ),
 *  <p></p>
 *  <p>    AA-AZ msg types
 *  <p>    DERIVATIVE_SECURITY_LIST("AA", "DERIVATIVE_SECURITY_LIST", "AA - Derivative Security List" ),
 *  <p>    NEW_ORDER_MULTILEG("AB", "NEW_ORDER_MULTILEG", "AB - New Order - Multileg" ),
 *  <p>    MULTILEG_ORDER_MODIFICATION_REQUEST("AC", "MULTILEG_ORDER_MODIFICATION_REQUEST",
 *                          "AC - Multileg Order Modification Request" ),
 *  <p>    TRADE_CAPTURE_REPORT_REQUEST("AD", "TRADE_CAPTURE_REPORT_REQUEST", "AD - Trade Capture Report Request" ),
 *  <p>    TRADE_CAPTURE_REPORT("AE", "TRADE_CAPTURE_REPORT", "AE - Trade Capture Report" ),
 *  <p></p>
 *  <p>    ORDER_MASS_STATUS_REQUEST("AF", "ORDER_MASS_STATUS_REQUEST", "AF - Order Mass Status Request" ),
 *  <p>    QUOTE_REQUEST_REJECT("AG", "QUOTE_REQUEST_REJECT", "AG - Quote Request Reject" ),
 *  <p>    RFQ_REQUEST("AH", "RFQ_REQUEST", "AH - RFQ Request" ),
 *  <p>    QUOTE_STATUS_REPORT("AI", "QUOTE_STATUS_REPORT", "AI - Quote Status Report" ),
 *  <p>    QUOTE_RESPONSE("AJ", "QUOTE_RESPONSE", "AJ - Quote Response" ),
 *  <p></p>
 *  <p>    CONFIRMATION("AK", "CONFIRMATION", "AK - Confirmation" ),
 *  <p>    POSITION_MAINTENANCE_REQUEST("AL", "POSITION_MAINTENANCE_REQUEST",
 *                          "AL - Position Maintenance Request" ),
 *  <p>    POSITION_MAINTENANCE_REPORT("AM", "POSITION_MAINTENANCE_REPORT", "AM - Position Maintenance Report" ),
 *  <p>    REQUEST_FOR_POSITIONS("AN", "REQUEST_FOR_POSITIONS", "AN - Request For Positions" ),
 *  <p>    REQUEST_FOR_POSITIONS_ACK("AO", "REQUEST_FOR_POSITIONS_ACK", "AO - Request For Positions Ack" ),
 *  <p></p>
 *  <p>    POSITION_REPORT("AP", "POSITION_REPORT", "AP - Position Report" ),
 *  <p>    TRADE_CAPTURE_REPORT_REQUEST_ACK("AQ", "TRADE_CAPTURE_REPORT_REQUEST_ACK",
 *                          "AQ - Trade Capture Report Request Ack" ),
 *  <p>    TRADE_CAPTURE_REPORT_ACK("AR", "TRADE_CAPTURE_REPORT_ACK", "AR - Trade Capture Report Ack" ),
 *  <p>    ALLOCATION_CLAIM("AS", "ALLOCATION_CLAIM", "AS - Allocation Claim" ),
 *  <p>    ALLOCATION_CLAIM_ACK("AT", "ALLOCATION_CLAIM_ACK", "AT - Allocation Claim Ack" ),
 *  <p></p>
 *  <p>    AFFIRMATION("AU", "AFFIRMATION", "AU - Affirmation" ),
 *  <p>    SETTLEMENT_INSTRUCTION_REQUEST("AV", "SETTLEMENT_INSTRUCTION_REQUEST",
 *                          "AV - Settlement Instruction Request" ),
 *  <p>    ASSIGNMENT_REPORT("AW", "ASSIGNMENT_REPORT", "AW - Assignment Report" ),
 *  <p>    COLLATERAL_REQUEST("AX", "COLLATERAL_REQUEST", "AX - Collateral Request" ),
 *  <p>    COLLATERAL_ASSIGNMENT("AY", "COLLATERAL_ASSIGNMENT", "AY - Collateral Assignment" ),
 *
 *  <p>    COLLATERAL_RESPONSE("AZ", "COLLATERAL_RESPONSE", "AZ - Collateral Response" ),
 *  <p></p>
 *  <p>    BA-BP msg types
 *  <p>    COLLATERAL_REPORT("BA", "COLLATERAL_REPORT", "BA - Collateral Report" ),
 *  <p>    COLLATERAL_INQUIRY("BB", "COLLATERAL_INQUIRY", "BB - Collateral Inquiry" ),
 *  <p>    NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST("BC", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST",
 *                          "BC - Network Counterparty System Status Request" ),
 *  <p>    NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE("BD", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE",
 *                          "BD - Network Counterparty System Status Response" ),
 *  <p>    USER_REQUEST("BE", "USER_REQUEST", "BE - User Request" ),
 *  <p></p>
 *  <p>    USER_RESPONSE("BF", "USER_RESPONSE", "BF - User Response" ),
 *  <p>    COLLATERAL_INQUIRY_ACK("BG", "COLLATERAL_INQUIRY_ACK", "BG - Collateral Inquiry Ack" ),
 *  <p>    CONFIRMATION_REQUEST("BH", "CONFIRMATION_REQUEST", "BH - Confirmation Request" ),
 *  <p>    TRADING_SESSION_LIST_REQUEST("BI", "TRADING_SESSION_LIST_REQUEST", "BI - Trading Session List Request" ),
 *  <p>    TRADING_SESSION_LIST("BJ", "TRADING_SESSION_LIST", "BJ - Trading Session List" ),
 *  <p></p>
 *  <p>    SECURITY_LIST_UPDATE_REPORT("BK", "SECURITY_LIST_UPDATE_REPORT", "BK - Security List Update Report" ),
 *  <p>    ADJUSTED_POSITION_REPORT("BL", "ADJUSTED_POSITION_REPORT", "BL - Adjusted Position Report" ),
 *  <p>    ALLOCATION_INSTRUCTION_ALERT("BM", "ALLOCATION_INSTRUCTION_ALERT", "BM - Allocation Instruction Alert" ),
 *  <p>    EXECUTION_ACKNOWLEDGEMENT("BN", "EXECUTION_ACKNOWLEDGEMENT", "BN - Execution Acknowledgement" ),
 *  <p>    CONTRARY_INTENTION_REPORT("BO", "CONTRARY_INTENTION_REPORT", "BO - Contrary Intention Report" ),
 *  <p></p>
 *  <p>    SECURITY_DEFINITION_UPDATE_REPORT("BP", "SECURITY_DEFINITION_UPDATE_REPORT",
 *                          "BP - Security Definition Update Report" ),
 */
public enum MyEnumMsgType implements LogFIXString, LogVerboseString {
    /*
     *  0-9, msg types
     *  A-Z, msg types, skipping "I", and "O"
     *  a-z, msg types
     *  AA-AZ, msg types
     *  BA-BP, msg types
     */


    /*
     * 0-9 msg types
     */
    HEARTBEAT("0", "HEARTBEAT", "0 - Heartbeat" ),
    TEST_REQUEST("1", "TEST_REQUEST", "1 - Test Request" ),
    RESEND_REQUEST("2", "RESEND_REQUEST", "2 - Resend Request" ),
    REJECT("3", "REJECT", "3 - Reject" ),
    SEQUENCE_RESET("4", "SEQUENCE_RESET", "4 - Sequence Reset" ),

    LOGOUT("5", "LOGOUT", "5 - Logout" ),
    INDICATION_OF_INTEREST("6", "INDICATION_OF_INTEREST", "6 - Indication of Interest" ),
    ADVERTISEMENT("7", "ADVERTISEMENT", "7 - Advertisement" ),
    EXECUTION_REPORT("8", "EXECUTION_REPORT", "8 - Execution Report" ),
    ORDER_CANCEL_REJECT("9", "ORDER_CANCEL_REJECT", "9 - Order Cancel Reject" ),


    /*
     * A-Z msg types, skipping "I", and "O"
     */
    LOGON("A", "LOGON", "A - Logon" ),
    NEWS("B", "NEWS", "B - News" ),
    EMAIL("C", "EMAIL", "C - Email" ),
    NEW_ORDER_SINGLE("D", "NEW_ORDER_SINGLE", "D - New Order - Single" ),
    NEW_ORDER_LIST("E", "NEW_ORDER_LIST", "E - New Order - List" ),

    ORDER_CANCEL_REQUEST("F", "ORDER_CANCEL_REQUEST", "F - Order Cancel Request" ),
    ORDER_MODIFICATION("G", "ORDER_MODIFICATION","G - Order Modification Request" ),
    ORDER_STATUS_REQUEST("H", "ORDER_STATUS_REQUEST", "H - Order Status Request" ),
    ALLOCATION_INSTRUCTION("J", "ALLOCATION_INSTRUCTION", "J - Allocation Instruction" ),
    LIST_CANCEL_REQUEST("K", "LIST_CANCEL_REQUEST", "K - List Cancel Request" ),

    LIST_EXECUTE("L", "LIST_EXECUTE", "L - List Execute" ),
    LIST_STATUS_REQUEST("M", "LIST_STATUS_REQUEST", "M - List Status Request" ),
    LIST_STATUS("N", "LIST_STATUS", "N - List Status" ),
    ALLOCATION_INSTRUCTION_ACK("P", "ALLOCATION_INSTRUCTION_ACK", "P - Allocation Instruction Ack" ),
    DONT_KNOW_TRADE("Q", "DONT_KNOW_TRADE", "Q - Don't Know Trade (DK)" ),

    QUOTE_REQUEST("R", "QUOTE_REQUEST", "R - Quote Request" ),
    QUOTE("S", "QUOTE", "S - Quote" ),
    SETTLEMENT_INSTRUCTIONS("T", "SETTLEMENT_INSTRUCTIONS", "T - Settlement Instructions" ),
    MARKET_DATA_REQUEST("V", "MARKET_DATA_REQUEST", "V - Market Data Request" ),
    MARKET_DATA_REFRESH("W", "MARKET_DATA_REFRESH", "W - Market Data - Snapshot/Full Refresh" ),

    MARKET_DATA_INCREMENTAL_REFRESH("X", "MARKET_DATA_INCREMENTAL_REFRESH",
            "X - Market Data - Incremental Refresh" ),
    MARKET_DATA_REQUEST_REJECT("Y", "MARKET_DATA_REQUEST_REJECT",
            "Y - Market Data Request Reject" ),
    QUOTE_CANCEL("Z", "QUOTE_CANCEL", "Z - Quote Cancel" ),


    /*
     * a-z msg types
     */
    QUOTE_STATUS_REQUEST("a", "QUOTE_STATUS_REQUEST",
            "a - Quote Status Request" ),
    MASS_QUOTE_ACKNOWLEDGEMENT("b", "MASS_QUOTE_ACKNOWLEDGEMENT",
            "b - Mass Quote Acknowledgement" ),
    SECURITY_DEFINITION_REQUEST("c", "SECURITY_DEFINITION_REQUEST",
            "c - Security Definition Request" ),
    SECURITY_DEFINITION("d", "SECURITY_DEFINITION",
            "d - Security Definition" ),
    SECURITY_STATUS_REQUEST("e", "SECURITY_STATUS_REQUEST",
            "e - Security Status Request" ),

    SECURITY_STATUS("f", "SECURITY_STATUS",
            "f - Security Status" ),
    TRADING_SESSION_STATUS_REQUEST("g", "TRADING_SESSION_STATUS_REQUEST",
            "g - Trading Session Status Request" ),
    TRADING_SESSION_STATUS("h", "TRADING_SESSION_STATUS",
            "h - Trading Session Status" ),
    MASS_QUOTE("i", "MASS_QUOTE",
            "i - Mass Quote" ),
    BUSINESS_MESSAGE_REJECT("j", "BUSINESS_MESSAGE_REJECT",
            "j - Business Message Reject" ),

    BID_REQUEST("k", "BID_REQUEST",
            "k - Bid Request" ),
    BID_RESPONSE("l", "BID_RESPONSE",
            "l - Bid Response (lowercase L)" ),
    LIST_STRIKE_PRICE("m", "LIST_STRIKE_PRICE",
            "m - List Strike Price" ),
    XML_MESSAGE("n", "XML_MESSAGE",
            "n - XML message (e.g. non FIX Msg Type)" ),
    REGISTRATION_INSTRUCTIONS("o", "REGISTRATION_INSTRUCTIONS",
            "o - Registration Instructions" ),

    REGISTRATION_INSTRUCTIONS_RESPONSE("p", "REGISTRATION_INSTRUCTIONS_RESPONSE",
            "p - Registration Instructions Response" ),
    ORDER_MASS_CANCEL_REQUEST("q", "ORDER_MASS_CANCEL_REQUEST",
            "q - Order Mass Cancel Request" ),
    ORDER_MASS_CANCEL_REPORT("r", "ORDER_MASS_CANCEL_REPORT",
            "r - Order Mass Cancel Report" ),
    NEW_ORDER_CROSS("s", "NEW_ORDER_CROSS",
            "s - New Order - Cross" ),
    CROSS_ORDER_MODIFICATION_REQUEST("t", "CROSS_ORDER_MODIFICATION_REQUEST",
            "t - Cross Order Modification Request" ),

    CROSS_ORDER_CANCEL_REQUEST("u", "CROSS_ORDER_CANCEL_REQUEST",
            "u - Cross Order Cancel Request" ),
    SECURITY_TYPE_REQUEST("v", "SECURITY_TYPE_REQUEST",
            "v - Security Type Request" ),
    SECURITY_TYPES("w", "SECURITY_TYPES",
            "w - Security Types" ),
    SECURITY_LIST_REQUEST("x", "SECURITY_LIST_REQUEST",
            "x - Security List Request" ),
    SECURITY_LIST("y", "SECURITY_LIST",
            "y - Security List" ),

    DERIVATIVE_SECURITY_LIST_REQUEST("z", "DERIVATIVE_SECURITY_LIST_REQUEST",
            "z - Derivative Security List Request" ),


    /*
     * AA-AZ msg types
     */
    DERIVATIVE_SECURITY_LIST("AA", "DERIVATIVE_SECURITY_LIST",
            "AA - Derivative Security List" ),
    NEW_ORDER_MULTILEG("AB", "NEW_ORDER_MULTILEG",
            "AB - New Order - Multileg" ),
    MULTILEG_ORDER_MODIFICATION_REQUEST("AC", "MULTILEG_ORDER_MODIFICATION_REQUEST",
            "AC - Multileg Order Modification Request" ),
    TRADE_CAPTURE_REPORT_REQUEST("AD", "TRADE_CAPTURE_REPORT_REQUEST",
            "AD - Trade Capture Report Request" ),
    TRADE_CAPTURE_REPORT("AE", "TRADE_CAPTURE_REPORT",
            "AE - Trade Capture Report" ),

    ORDER_MASS_STATUS_REQUEST("AF", "ORDER_MASS_STATUS_REQUEST",
            "AF - Order Mass Status Request" ),
    QUOTE_REQUEST_REJECT("AG", "QUOTE_REQUEST_REJECT",
            "AG - Quote Request Reject" ),
    RFQ_REQUEST("AH", "RFQ_REQUEST",
            "AH - RFQ Request" ),
    QUOTE_STATUS_REPORT("AI", "QUOTE_STATUS_REPORT",
            "AI - Quote Status Report" ),
    QUOTE_RESPONSE("AJ", "QUOTE_RESPONSE",
            "AJ - Quote Response" ),

    CONFIRMATION("AK", "CONFIRMATION",
            "AK - Confirmation" ),
    POSITION_MAINTENANCE_REQUEST("AL", "POSITION_MAINTENANCE_REQUEST",
            "AL - Position Maintenance Request" ),
    POSITION_MAINTENANCE_REPORT("AM", "POSITION_MAINTENANCE_REPORT",
            "AM - Position Maintenance Report" ),
    REQUEST_FOR_POSITIONS("AN", "REQUEST_FOR_POSITIONS",
            "AN - Request For Positions" ),
    REQUEST_FOR_POSITIONS_ACK("AO", "REQUEST_FOR_POSITIONS_ACK",
            "AO - Request For Positions Ack" ),

    POSITION_REPORT("AP", "POSITION_REPORT",
            "AP - Position Report" ),
    TRADE_CAPTURE_REPORT_REQUEST_ACK("AQ", "TRADE_CAPTURE_REPORT_REQUEST_ACK",
            "AQ - Trade Capture Report Request Ack" ),
    TRADE_CAPTURE_REPORT_ACK("AR", "TRADE_CAPTURE_REPORT_ACK",
            "AR - Trade Capture Report Ack" ),
    ALLOCATION_CLAIM("AS", "ALLOCATION_CLAIM",
            "AS - Allocation Claim" ),
    ALLOCATION_CLAIM_ACK("AT", "ALLOCATION_CLAIM_ACK",
            "AT - Allocation Claim Ack" ),

    AFFIRMATION("AU", "AFFIRMATION",
            "AU - Affirmation" ),
    SETTLEMENT_INSTRUCTION_REQUEST("AV", "SETTLEMENT_INSTRUCTION_REQUEST",
            "AV - Settlement Instruction Request" ),
    ASSIGNMENT_REPORT("AW", "ASSIGNMENT_REPORT",
            "AW - Assignment Report" ),
    COLLATERAL_REQUEST("AX", "COLLATERAL_REQUEST",
            "AX - Collateral Request" ),
    COLLATERAL_ASSIGNMENT("AY", "COLLATERAL_ASSIGNMENT",
            "AY - Collateral Assignment" ),

    COLLATERAL_RESPONSE("AZ", "COLLATERAL_RESPONSE",
            "AZ - Collateral Response" ),


    /*
     * BA-BP msg types
     */
    COLLATERAL_REPORT("BA", "COLLATERAL_REPORT",
            "BA - Collateral Report" ),
    COLLATERAL_INQUIRY("BB", "COLLATERAL_INQUIRY",
            "BB - Collateral Inquiry" ),
    NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST("BC", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST",
            "BC - Network Counterparty System Status Request" ),
    NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE("BD", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE",
            "BD - Network Counterparty System Status Response" ),
    USER_REQUEST("BE", "USER_REQUEST",
            "BE - User Request" ),

    USER_RESPONSE("BF", "USER_RESPONSE",
            "BF - User Response" ),
    COLLATERAL_INQUIRY_ACK("BG", "COLLATERAL_INQUIRY_ACK",
            "BG - Collateral Inquiry Ack" ),
    CONFIRMATION_REQUEST("BH", "CONFIRMATION_REQUEST",
            "BH - Confirmation Request" ),
    TRADING_SESSION_LIST_REQUEST("BI", "TRADING_SESSION_LIST_REQUEST",
            "BI - Trading Session List Request" ),
    TRADING_SESSION_LIST("BJ", "TRADING_SESSION_LIST",
            "BJ - Trading Session List" ),

    SECURITY_LIST_UPDATE_REPORT("BK", "SECURITY_LIST_UPDATE_REPORT",
            "BK - Security List Update Report" ),
    ADJUSTED_POSITION_REPORT("BL", "ADJUSTED_POSITION_REPORT",
            "BL - Adjusted Position Report" ),
    ALLOCATION_INSTRUCTION_ALERT("BM", "ALLOCATION_INSTRUCTION_ALERT",
            "BM - Allocation Instruction Alert" ),
    EXECUTION_ACKNOWLEDGEMENT("BN", "EXECUTION_ACKNOWLEDGEMENT",
            "BN - Execution Acknowledgement" ),
    CONTRARY_INTENTION_REPORT("BO", "CONTRARY_INTENTION_REPORT",
            "BO - Contrary Intention Report" ),

    SECURITY_DEFINITION_UPDATE_REPORT("BP", "SECURITY_DEFINITION_UPDATE_REPORT",
            "BP - Security Definition Update Report" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumMsgType(final String id, final String name, final String description) {
        this.id = id;
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
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
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
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
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
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            System.out.println(oneEnum);
        }
    }
}
