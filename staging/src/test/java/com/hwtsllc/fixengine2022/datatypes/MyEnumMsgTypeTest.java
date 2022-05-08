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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class MyEnumMsgTypeTest {
    @Test
    void Enum0035Test() {
        MyEnumMsgType enumType;



        /*
         *  0-9, msg types
         *  A-Z, msg types, skipping "I", and "O"
         *  a-z, msg types
         *  AA-AZ, msg types
         *  BA-BP, msg types
         */



        /*
         *  0-9, msg types
         */
        enumType = MyEnumMsgType.HEARTBEAT;
        assertEquals("0", enumType.getID());
        assertEquals("HEARTBEAT", enumType.getName());
        assertEquals("0 - Heartbeat", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TEST_REQUEST;
        assertEquals("1", enumType.getID());
        assertEquals("TEST_REQUEST", enumType.getName());
        assertEquals("1 - Test Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.RESEND_REQUEST;
        assertEquals("2", enumType.getID());
        assertEquals("RESEND_REQUEST", enumType.getName());
        assertEquals("2 - Resend Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.REJECT;
        assertEquals("3", enumType.getID());
        assertEquals("REJECT", enumType.getName());
        assertEquals("3 - Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SEQUENCE_RESET;
        assertEquals("4", enumType.getID());
        assertEquals("SEQUENCE_RESET", enumType.getName());
        assertEquals("4 - Sequence Reset", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.LOGOUT;
        assertEquals("5", enumType.getID());
        assertEquals("LOGOUT", enumType.getName());
        assertEquals("5 - Logout", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.INDICATION_OF_INTEREST;
        assertEquals("6", enumType.getID());
        assertEquals("INDICATION_OF_INTEREST", enumType.getName());
        assertEquals("6 - Indication of Interest", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ADVERTISEMENT;
        assertEquals("7", enumType.getID());
        assertEquals("ADVERTISEMENT", enumType.getName());
        assertEquals("7 - Advertisement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.EXECUTION_REPORT;
        assertEquals("8", enumType.getID());
        assertEquals("EXECUTION_REPORT", enumType.getName());
        assertEquals("8 - Execution Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ORDER_CANCEL_REJECT;
        assertEquals("9", enumType.getID());
        assertEquals("ORDER_CANCEL_REJECT", enumType.getName());
        assertEquals("9 - Order Cancel Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  A-Z, msg types, skipping "I", and "O"
         */
        enumType = MyEnumMsgType.LOGON;
        assertEquals("A", enumType.getID());
        assertEquals("LOGON", enumType.getName());
        assertEquals("A - Logon", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NEWS;
        assertEquals("B", enumType.getID());
        assertEquals("NEWS", enumType.getName());
        assertEquals("B - News", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.EMAIL;
        assertEquals("C", enumType.getID());
        assertEquals("EMAIL", enumType.getName());
        assertEquals("C - Email", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NEW_ORDER_SINGLE;
        assertEquals("D", enumType.getID());
        assertEquals("NEW_ORDER_SINGLE", enumType.getName());
        assertEquals("D - New Order - Single", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NEW_ORDER_LIST;
        assertEquals("E", enumType.getID());
        assertEquals("NEW_ORDER_LIST", enumType.getName());
        assertEquals("E - New Order - List", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.ORDER_CANCEL_REQUEST;
        assertEquals("F", enumType.getID());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("F - Order Cancel Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ORDER_MODIFICATION;
        assertEquals("G", enumType.getID());
        assertEquals("ORDER_MODIFICATION", enumType.getName());
        assertEquals("G - Order Modification Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ORDER_STATUS_REQUEST;
        assertEquals("H", enumType.getID());
        assertEquals("ORDER_STATUS_REQUEST", enumType.getName());
        assertEquals("H - Order Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION;
        assertEquals("J", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION", enumType.getName());
        assertEquals("J - Allocation Instruction", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.LIST_CANCEL_REQUEST;
        assertEquals("K", enumType.getID());
        assertEquals("LIST_CANCEL_REQUEST", enumType.getName());
        assertEquals("K - List Cancel Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.LIST_EXECUTE;
        assertEquals("L", enumType.getID());
        assertEquals("LIST_EXECUTE", enumType.getName());
        assertEquals("L - List Execute", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.LIST_STATUS_REQUEST;
        assertEquals("M", enumType.getID());
        assertEquals("LIST_STATUS_REQUEST", enumType.getName());
        assertEquals("M - List Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.LIST_STATUS;
        assertEquals("N", enumType.getID());
        assertEquals("LIST_STATUS", enumType.getName());
        assertEquals("N - List Status", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK;
        assertEquals("P", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION_ACK", enumType.getName());
        assertEquals("P - Allocation Instruction Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.DONT_KNOW_TRADE;
        assertEquals("Q", enumType.getID());
        assertEquals("DONT_KNOW_TRADE", enumType.getName());
        assertEquals("Q - Don't Know Trade (DK)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.QUOTE_REQUEST;
        assertEquals("R", enumType.getID());
        assertEquals("QUOTE_REQUEST", enumType.getName());
        assertEquals("R - Quote Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.QUOTE;
        assertEquals("S", enumType.getID());
        assertEquals("QUOTE", enumType.getName());
        assertEquals("S - Quote", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTIONS;
        assertEquals("T", enumType.getID());
        assertEquals("SETTLEMENT_INSTRUCTIONS", enumType.getName());
        assertEquals("T - Settlement Instructions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST;
        assertEquals("V", enumType.getID());
        assertEquals("MARKET_DATA_REQUEST", enumType.getName());
        assertEquals("V - Market Data Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MARKET_DATA_REFRESH;
        assertEquals("W", enumType.getID());
        assertEquals("MARKET_DATA_REFRESH", enumType.getName());
        assertEquals("W - Market Data - Snapshot/Full Refresh", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH;
        assertEquals("X", enumType.getID());
        assertEquals("MARKET_DATA_INCREMENTAL_REFRESH", enumType.getName());
        assertEquals("X - Market Data - Incremental Refresh", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST_REJECT;
        assertEquals("Y", enumType.getID());
        assertEquals("MARKET_DATA_REQUEST_REJECT", enumType.getName());
        assertEquals("Y - Market Data Request Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.QUOTE_CANCEL;
        assertEquals("Z", enumType.getID());
        assertEquals("QUOTE_CANCEL", enumType.getName());
        assertEquals("Z - Quote Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  a-z, msg types
         */
        enumType = MyEnumMsgType.QUOTE_STATUS_REQUEST;
        assertEquals("a", enumType.getID());
        assertEquals("QUOTE_STATUS_REQUEST", enumType.getName());
        assertEquals("a - Quote Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT;
        assertEquals("b", enumType.getID());
        assertEquals("MASS_QUOTE_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("b - Mass Quote Acknowledgement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_DEFINITION_REQUEST;
        assertEquals("c", enumType.getID());
        assertEquals("SECURITY_DEFINITION_REQUEST", enumType.getName());
        assertEquals("c - Security Definition Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_DEFINITION;
        assertEquals("d", enumType.getID());
        assertEquals("SECURITY_DEFINITION", enumType.getName());
        assertEquals("d - Security Definition", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_STATUS_REQUEST;
        assertEquals("e", enumType.getID());
        assertEquals("SECURITY_STATUS_REQUEST", enumType.getName());
        assertEquals("e - Security Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.SECURITY_STATUS;
        assertEquals("f", enumType.getID());
        assertEquals("SECURITY_STATUS", enumType.getName());
        assertEquals("f - Security Status", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST;
        assertEquals("g", enumType.getID());
        assertEquals("TRADING_SESSION_STATUS_REQUEST", enumType.getName());
        assertEquals("g - Trading Session Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS;
        assertEquals("h", enumType.getID());
        assertEquals("TRADING_SESSION_STATUS", enumType.getName());
        assertEquals("h - Trading Session Status", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MASS_QUOTE;
        assertEquals("i", enumType.getID());
        assertEquals("MASS_QUOTE", enumType.getName());
        assertEquals("i - Mass Quote", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.BUSINESS_MESSAGE_REJECT;
        assertEquals("j", enumType.getID());
        assertEquals("BUSINESS_MESSAGE_REJECT", enumType.getName());
        assertEquals("j - Business Message Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.BID_REQUEST;
        assertEquals("k", enumType.getID());
        assertEquals("BID_REQUEST", enumType.getName());
        assertEquals("k - Bid Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.BID_RESPONSE;
        assertEquals("l", enumType.getID());
        assertEquals("BID_RESPONSE", enumType.getName());
        assertEquals("l - Bid Response (lowercase L)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.LIST_STRIKE_PRICE;
        assertEquals("m", enumType.getID());
        assertEquals("LIST_STRIKE_PRICE", enumType.getName());
        assertEquals("m - List Strike Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.XML_MESSAGE;
        assertEquals("n", enumType.getID());
        assertEquals("XML_MESSAGE", enumType.getName());
        assertEquals("n - XML message (e.g. non FIX Msg Type)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS;
        assertEquals("o", enumType.getID());
        assertEquals("REGISTRATION_INSTRUCTIONS", enumType.getName());
        assertEquals("o - Registration Instructions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE;
        assertEquals("p", enumType.getID());
        assertEquals("REGISTRATION_INSTRUCTIONS_RESPONSE", enumType.getName());
        assertEquals("p - Registration Instructions Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST;
        assertEquals("q", enumType.getID());
        assertEquals("ORDER_MASS_CANCEL_REQUEST", enumType.getName());
        assertEquals("q - Order Mass Cancel Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REPORT;
        assertEquals("r", enumType.getID());
        assertEquals("ORDER_MASS_CANCEL_REPORT", enumType.getName());
        assertEquals("r - Order Mass Cancel Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NEW_ORDER_CROSS;
        assertEquals("s", enumType.getID());
        assertEquals("NEW_ORDER_CROSS", enumType.getName());
        assertEquals("s - New Order - Cross", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST;
        assertEquals("t", enumType.getID());
        assertEquals("CROSS_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("t - Cross Order Modification Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST;
        assertEquals("u", enumType.getID());
        assertEquals("CROSS_ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("u - Cross Order Cancel Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_TYPE_REQUEST;
        assertEquals("v", enumType.getID());
        assertEquals("SECURITY_TYPE_REQUEST", enumType.getName());
        assertEquals("v - Security Type Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_TYPES;
        assertEquals("w", enumType.getID());
        assertEquals("SECURITY_TYPES", enumType.getName());
        assertEquals("w - Security Types", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_LIST_REQUEST;
        assertEquals("x", enumType.getID());
        assertEquals("SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("x - Security List Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SECURITY_LIST;
        assertEquals("y", enumType.getID());
        assertEquals("SECURITY_LIST", enumType.getName());
        assertEquals("y - Security List", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST;
        assertEquals("z", enumType.getID());
        assertEquals("DERIVATIVE_SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("z - Derivative Security List Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  AA-AZ, msg types
         */
        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST;
        assertEquals("AA", enumType.getID());
        assertEquals("DERIVATIVE_SECURITY_LIST", enumType.getName());
        assertEquals("AA - Derivative Security List", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NEW_ORDER_MULTILEG;
        assertEquals("AB", enumType.getID());
        assertEquals("NEW_ORDER_MULTILEG", enumType.getName());
        assertEquals("AB - New Order - Multileg", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST;
        assertEquals("AC", enumType.getID());
        assertEquals("MULTILEG_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("AC - Multileg Order Modification Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST;
        assertEquals("AD", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST", enumType.getName());
        assertEquals("AD - Trade Capture Report Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT;
        assertEquals("AE", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT", enumType.getName());
        assertEquals("AE - Trade Capture Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.ORDER_MASS_STATUS_REQUEST;
        assertEquals("AF", enumType.getID());
        assertEquals("ORDER_MASS_STATUS_REQUEST", enumType.getName());
        assertEquals("AF - Order Mass Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.QUOTE_REQUEST_REJECT;
        assertEquals("AG", enumType.getID());
        assertEquals("QUOTE_REQUEST_REJECT", enumType.getName());
        assertEquals("AG - Quote Request Reject", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.RFQ_REQUEST;
        assertEquals("AH", enumType.getID());
        assertEquals("RFQ_REQUEST", enumType.getName());
        assertEquals("AH - RFQ Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.QUOTE_STATUS_REPORT;
        assertEquals("AI", enumType.getID());
        assertEquals("QUOTE_STATUS_REPORT", enumType.getName());
        assertEquals("AI - Quote Status Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.QUOTE_RESPONSE;
        assertEquals("AJ", enumType.getID());
        assertEquals("QUOTE_RESPONSE", enumType.getName());
        assertEquals("AJ - Quote Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.CONFIRMATION;
        assertEquals("AK", enumType.getID());
        assertEquals("CONFIRMATION", enumType.getName());
        assertEquals("AK - Confirmation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REQUEST;
        assertEquals("AL", enumType.getID());
        assertEquals("POSITION_MAINTENANCE_REQUEST", enumType.getName());
        assertEquals("AL - Position Maintenance Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REPORT;
        assertEquals("AM", enumType.getID());
        assertEquals("POSITION_MAINTENANCE_REPORT", enumType.getName());
        assertEquals("AM - Position Maintenance Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS;
        assertEquals("AN", enumType.getID());
        assertEquals("REQUEST_FOR_POSITIONS", enumType.getName());
        assertEquals("AN - Request For Positions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK;
        assertEquals("AO", enumType.getID());
        assertEquals("REQUEST_FOR_POSITIONS_ACK", enumType.getName());
        assertEquals("AO - Request For Positions Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.POSITION_REPORT;
        assertEquals("AP", enumType.getID());
        assertEquals("POSITION_REPORT", enumType.getName());
        assertEquals("AP - Position Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK;
        assertEquals("AQ", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST_ACK", enumType.getName());
        assertEquals("AQ - Trade Capture Report Request Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK;
        assertEquals("AR", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_ACK", enumType.getName());
        assertEquals("AR - Trade Capture Report Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM;
        assertEquals("AS", enumType.getID());
        assertEquals("ALLOCATION_CLAIM", enumType.getName());
        assertEquals("AS - Allocation Claim", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM_ACK;
        assertEquals("AT", enumType.getID());
        assertEquals("ALLOCATION_CLAIM_ACK", enumType.getName());
        assertEquals("AT - Allocation Claim Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.AFFIRMATION;
        assertEquals("AU", enumType.getID());
        assertEquals("AFFIRMATION", enumType.getName());
        assertEquals("AU - Affirmation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST;
        assertEquals("AV", enumType.getID());
        assertEquals("SETTLEMENT_INSTRUCTION_REQUEST", enumType.getName());
        assertEquals("AV - Settlement Instruction Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ASSIGNMENT_REPORT;
        assertEquals("AW", enumType.getID());
        assertEquals("ASSIGNMENT_REPORT", enumType.getName());
        assertEquals("AW - Assignment Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.COLLATERAL_REQUEST;
        assertEquals("AX", enumType.getID());
        assertEquals("COLLATERAL_REQUEST", enumType.getName());
        assertEquals("AX - Collateral Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.COLLATERAL_ASSIGNMENT;
        assertEquals("AY", enumType.getID());
        assertEquals("COLLATERAL_ASSIGNMENT", enumType.getName());
        assertEquals("AY - Collateral Assignment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.COLLATERAL_RESPONSE;
        assertEquals("AZ", enumType.getID());
        assertEquals("COLLATERAL_RESPONSE", enumType.getName());
        assertEquals("AZ - Collateral Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  BA-BP, msg types
         */
        enumType = MyEnumMsgType.COLLATERAL_REPORT;
        assertEquals("BA", enumType.getID());
        assertEquals("COLLATERAL_REPORT", enumType.getName());
        assertEquals("BA - Collateral Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY;
        assertEquals("BB", enumType.getID());
        assertEquals("COLLATERAL_INQUIRY", enumType.getName());
        assertEquals("BB - Collateral Inquiry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST;
        assertEquals("BC", enumType.getID());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", enumType.getName());
        assertEquals("BC - Network Counterparty System Status Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE;
        assertEquals("BD", enumType.getID());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", enumType.getName());
        assertEquals("BD - Network Counterparty System Status Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.USER_REQUEST;
        assertEquals("BE", enumType.getID());
        assertEquals("USER_REQUEST", enumType.getName());
        assertEquals("BE - User Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.USER_RESPONSE;
        assertEquals("BF", enumType.getID());
        assertEquals("USER_RESPONSE", enumType.getName());
        assertEquals("BF - User Response", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY_ACK;
        assertEquals("BG", enumType.getID());
        assertEquals("COLLATERAL_INQUIRY_ACK", enumType.getName());
        assertEquals("BG - Collateral Inquiry Ack", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.CONFIRMATION_REQUEST;
        assertEquals("BH", enumType.getID());
        assertEquals("CONFIRMATION_REQUEST", enumType.getName());
        assertEquals("BH - Confirmation Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST_REQUEST;
        assertEquals("BI", enumType.getID());
        assertEquals("TRADING_SESSION_LIST_REQUEST", enumType.getName());
        assertEquals("BI - Trading Session List Request", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST;
        assertEquals("BJ", enumType.getID());
        assertEquals("TRADING_SESSION_LIST", enumType.getName());
        assertEquals("BJ - Trading Session List", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT;
        assertEquals("BK", enumType.getID());
        assertEquals("SECURITY_LIST_UPDATE_REPORT", enumType.getName());
        assertEquals("BK - Security List Update Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ADJUSTED_POSITION_REPORT;
        assertEquals("BL", enumType.getID());
        assertEquals("ADJUSTED_POSITION_REPORT", enumType.getName());
        assertEquals("BL - Adjusted Position Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT;
        assertEquals("BM", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION_ALERT", enumType.getName());
        assertEquals("BM - Allocation Instruction Alert", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT;
        assertEquals("BN", enumType.getID());
        assertEquals("EXECUTION_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("BN - Execution Acknowledgement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumMsgType.CONTRARY_INTENTION_REPORT;
        assertEquals("BO", enumType.getID());
        assertEquals("CONTRARY_INTENTION_REPORT", enumType.getName());
        assertEquals("BO - Contrary Intention Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT;
        assertEquals("BP", enumType.getID());
        assertEquals("SECURITY_DEFINITION_UPDATE_REPORT", enumType.getName());
        assertEquals("BP - Security Definition Update Report", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}