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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyEnumMsgType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag35 (same as TAGS 35, 372)
 *  Enu
 *  RefMsgType
 *
 *      0-9, msg types
 *      A-Z, msg types, skipping "I", and "O"
 *      a-z, msg types
 *      AA-AZ, msg types
 *      BA-BP, msg types
 *
 *
 *      0-9 msg types
 *      HEARTBEAT("0", "HEARTBEAT", "0 - Heartbeat" ),
 *      TEST_REQUEST("1", "TEST_REQUEST", "1 - Test Request" ),
 *      RESEND_REQUEST("2", "RESEND_REQUEST", "2 - Resend Request" ),
 *      REJECT("3", "REJECT", "3 - Reject" ),
 *      SEQUENCE_RESET("4", "SEQUENCE_RESET", "4 - Sequence Reset" ),
 *      LOGOUT("5", "LOGOUT", "5 - Logout" ),
 *      INDICATION_OF_INTEREST("6", "INDICATION_OF_INTEREST", "6 - Indication of Interest" ),
 *      ADVERTISEMENT("7", "ADVERTISEMENT", "7 - Advertisement" ),
 *      EXECUTION_REPORT("8", "EXECUTION_REPORT", "8 - Execution Report" ),
 *      ORDER_CANCEL_REJECT("9", "ORDER_CANCEL_REJECT", "9 - Order Cancel Reject" ),
 *
 *
 *      A-Z msg types, skipping "I", and "O"
 *      LOGON("A", "LOGON", "A - Logon" ),
 *      NEWS("B", "NEWS", "B - News" ),
 *      EMAIL("C", "EMAIL", "C - Email" ),
 *      NEW_ORDER_SINGLE("D", "NEW_ORDER_SINGLE", "D - New Order - Single" ),
 *      NEW_ORDER_LIST("E", "NEW_ORDER_LIST", "E - New Order - List" ),
 *      ORDER_CANCEL_REQUEST("F", "ORDER_CANCEL_REQUEST", "F - Order Cancel Request" ),
 *      ORDER_MODIFICATION("G", "ORDER_MODIFICATION","G - Order Modification Request" ),
 *      ORDER_STATUS_REQUEST("H", "ORDER_STATUS_REQUEST", "H - Order Status Request" ),
 *      ALLOCATION_INSTRUCTION("J", "ALLOCATION_INSTRUCTION", "J - Allocation Instruction" ),
 *      LIST_CANCEL_REQUEST("K", "LIST_CANCEL_REQUEST", "K - List Cancel Request" ),
 *      LIST_EXECUTE("L", "LIST_EXECUTE", "L - List Execute" ),
 *      LIST_STATUS_REQUEST("M", "LIST_STATUS_REQUEST", "M - List Status Request" ),
 *      LIST_STATUS("N", "LIST_STATUS", "N - List Status" ),
 *      ALLOCATION_INSTRUCTION_ACK("P", "ALLOCATION_INSTRUCTION_ACK", "P - Allocation Instruction Ack" ),
 *      DONT_KNOW_TRADE("Q", "DONT_KNOW_TRADE", "Q - Don't Know Trade (DK)" ),
 *      QUOTE_REQUEST("R", "QUOTE_REQUEST", "R - Quote Request" ),
 *      QUOTE("S", "QUOTE", "S - Quote" ),
 *      SETTLEMENT_INSTRUCTIONS("T", "SETTLEMENT_INSTRUCTIONS", "T - Settlement Instructions" ),
 *      MARKET_DATA_REQUEST("V", "MARKET_DATA_REQUEST", "V - Market Data Request" ),
 *      MARKET_DATA_REFRESH("W", "MARKET_DATA_REFRESH", "W - Market Data - Snapshot/Full Refresh" ),
 *      MARKET_DATA_INCREMENTAL_REFRESH("X", "MARKET_DATA_INCREMENTAL_REFRESH",
 *                          "X - Market Data - Incremental Refresh" ),
 *      MARKET_DATA_REQUEST_REJECT("Y", "MARKET_DATA_REQUEST_REJECT", "Y - Market Data Request Reject" ),
 *      QUOTE_CANCEL("Z", "QUOTE_CANCEL", "Z - Quote Cancel" ),
 *
 *
 *      a-z msg types
 *      QUOTE_STATUS_REQUEST("a", "QUOTE_STATUS_REQUEST", "a - Quote Status Request" ),
 *      MASS_QUOTE_ACKNOWLEDGEMENT("b", "MASS_QUOTE_ACKNOWLEDGEMENT", "b - Mass Quote Acknowledgement" ),
 *      SECURITY_DEFINITION_REQUEST("c", "SECURITY_DEFINITION_REQUEST", "c - Security Definition Request" ),
 *      SECURITY_DEFINITION("d", "SECURITY_DEFINITION", "d - Security Definition" ),
 *      SECURITY_STATUS_REQUEST("e", "SECURITY_STATUS_REQUEST", "e - Security Status Request" ),
 *      SECURITY_STATUS("f", "SECURITY_STATUS", "f - Security Status" ),
 *      TRADING_SESSION_STATUS_REQUEST("g", "TRADING_SESSION_STATUS_REQUEST",
 *                          "g - Trading Session Status Request" ),
 *      TRADING_SESSION_STATUS("h", "TRADING_SESSION_STATUS", "h - Trading Session Status" ),
 *      MASS_QUOTE("i", "MASS_QUOTE", "i - Mass Quote" ),
 *      BUSINESS_MESSAGE_REJECT("j", "BUSINESS_MESSAGE_REJECT", "j - Business Message Reject" ),
 *      BID_REQUEST("k", "BID_REQUEST", "k - Bid Request" ),
 *      BID_RESPONSE("l", "BID_RESPONSE", "l - Bid Response (lowercase L)" ),
 *      LIST_STRIKE_PRICE("m", "LIST_STRIKE_PRICE", "m - List Strike Price" ),
 *      XML_MESSAGE("n", "XML_MESSAGE", "n - XML message (e.g. non FIX Msg Type)" ),
 *      REGISTRATION_INSTRUCTIONS("o", "REGISTRATION_INSTRUCTIONS", "o - Registration Instructions" ),
 *      REGISTRATION_INSTRUCTIONS_RESPONSE("p", "REGISTRATION_INSTRUCTIONS_RESPONSE",
 *                          "p - Registration Instructions Response" ),
 *      ORDER_MASS_CANCEL_REQUEST("q", "ORDER_MASS_CANCEL_REQUEST", "q - Order Mass Cancel Request" ),
 *      ORDER_MASS_CANCEL_REPORT("r", "ORDER_MASS_CANCEL_REPORT", "r - Order Mass Cancel Report" ),
 *      NEW_ORDER_CROSS("s", "NEW_ORDER_CROSS", "s - New Order - Cross" ),
 *      CROSS_ORDER_MODIFICATION_REQUEST("t", "CROSS_ORDER_MODIFICATION_REQUEST",
 *                          "t - Cross Order Modification Request" ),
 *      CROSS_ORDER_CANCEL_REQUEST("u", "CROSS_ORDER_CANCEL_REQUEST", "u - Cross Order Cancel Request" ),
 *      SECURITY_TYPE_REQUEST("v", "SECURITY_TYPE_REQUEST", "v - Security Type Request" ),
 *      SECURITY_TYPES("w", "SECURITY_TYPES", "w - Security Types" ),
 *      SECURITY_LIST_REQUEST("x", "SECURITY_LIST_REQUEST", "x - Security List Request" ),
 *      SECURITY_LIST("y", "SECURITY_LIST", "y - Security List" ),
 *      DERIVATIVE_SECURITY_LIST_REQUEST("z", "DERIVATIVE_SECURITY_LIST_REQUEST",
 *                          "z - Derivative Security List Request" ),
 *
 *
 *      AA-AZ msg types
 *      DERIVATIVE_SECURITY_LIST("AA", "DERIVATIVE_SECURITY_LIST", "AA - Derivative Security List" ),
 *      NEW_ORDER_MULTILEG("AB", "NEW_ORDER_MULTILEG", "AB - New Order - Multileg" ),
 *      MULTILEG_ORDER_MODIFICATION_REQUEST("AC", "MULTILEG_ORDER_MODIFICATION_REQUEST",
 *                          "AC - Multileg Order Modification Request" ),
 *      TRADE_CAPTURE_REPORT_REQUEST("AD", "TRADE_CAPTURE_REPORT_REQUEST",
 *                          "AD - Trade Capture Report Request" ),
 *      TRADE_CAPTURE_REPORT("AE", "TRADE_CAPTURE_REPORT", "AE - Trade Capture Report" ),
 *      ORDER_MASS_STATUS_REQUEST("AF", "ORDER_MASS_STATUS_REQUEST", "AF - Order Mass Status Request" ),
 *      QUOTE_REQUEST_REJECT("AG", "QUOTE_REQUEST_REJECT", "AG - Quote Request Reject" ),
 *      RFQ_REQUEST("AH", "RFQ_REQUEST", "AH - RFQ Request" ),
 *      QUOTE_STATUS_REPORT("AI", "QUOTE_STATUS_REPORT", "AI - Quote Status Report" ),
 *      QUOTE_RESPONSE("AJ", "QUOTE_RESPONSE", "AJ - Quote Response" ),
 *      CONFIRMATION("AK", "CONFIRMATION", "AK - Confirmation" ),
 *      POSITION_MAINTENANCE_REQUEST("AL", "POSITION_MAINTENANCE_REQUEST",
 *                          "AL - Position Maintenance Request" ),
 *      POSITION_MAINTENANCE_REPORT("AM", "POSITION_MAINTENANCE_REPORT", "AM - Position Maintenance Report" ),
 *      REQUEST_FOR_POSITIONS("AN", "REQUEST_FOR_POSITIONS", "AN - Request For Positions" ),
 *      REQUEST_FOR_POSITIONS_ACK("AO", "REQUEST_FOR_POSITIONS_ACK", "AO - Request For Positions Ack" ),
 *      POSITION_REPORT("AP", "POSITION_REPORT", "AP - Position Report" ),
 *      TRADE_CAPTURE_REPORT_REQUEST_ACK("AQ", "TRADE_CAPTURE_REPORT_REQUEST_ACK",
 *                          "AQ - Trade Capture Report Request Ack" ),
 *      TRADE_CAPTURE_REPORT_ACK("AR", "TRADE_CAPTURE_REPORT_ACK", "AR - Trade Capture Report Ack" ),
 *      ALLOCATION_CLAIM("AS", "ALLOCATION_CLAIM", "AS - Allocation Claim" ),
 *      ALLOCATION_CLAIM_ACK("AT", "ALLOCATION_CLAIM_ACK", "AT - Allocation Claim Ack" ),
 *      AFFIRMATION("AU", "AFFIRMATION", "AU - Affirmation" ),
 *      SETTLEMENT_INSTRUCTION_REQUEST("AV", "SETTLEMENT_INSTRUCTION_REQUEST",
 *                          "AV - Settlement Instruction Request" ),
 *      ASSIGNMENT_REPORT("AW", "ASSIGNMENT_REPORT", "AW - Assignment Report" ),
 *      COLLATERAL_REQUEST("AX", "COLLATERAL_REQUEST", "AX - Collateral Request" ),
 *      COLLATERAL_ASSIGNMENT("AY", "COLLATERAL_ASSIGNMENT", "AY - Collateral Assignment" ),
 *      COLLATERAL_RESPONSE("AZ", "COLLATERAL_RESPONSE", "AZ - Collateral Response" ),
 *
 *
 *      BA-BP msg types
 *      COLLATERAL_REPORT("BA", "COLLATERAL_REPORT", "BA - Collateral Report" ),
 *      COLLATERAL_INQUIRY("BB", "COLLATERAL_INQUIRY", "BB - Collateral Inquiry" ),
 *      NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST("BC", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST",
 *                          "BC - Network Counterparty System Status Request" ),
 *      NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE("BD", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE",
 *                          "BD - Network Counterparty System Status Response" ),
 *      USER_REQUEST("BE", "USER_REQUEST", "BE - User Request" ),
 *      USER_RESPONSE("BF", "USER_RESPONSE", "BF - User Response" ),
 *      COLLATERAL_INQUIRY_ACK("BG", "COLLATERAL_INQUIRY_ACK", "BG - Collateral Inquiry Ack" ),
 *      CONFIRMATION_REQUEST("BH", "CONFIRMATION_REQUEST", "BH - Confirmation Request" ),
 *      TRADING_SESSION_LIST_REQUEST("BI", "TRADING_SESSION_LIST_REQUEST",
 *                          "BI - Trading Session List Request" ),
 *      TRADING_SESSION_LIST("BJ", "TRADING_SESSION_LIST", "BJ - Trading Session List" ),
 *      SECURITY_LIST_UPDATE_REPORT("BK", "SECURITY_LIST_UPDATE_REPORT",
 *                          "BK - Security List Update Report" ),
 *      ADJUSTED_POSITION_REPORT("BL", "ADJUSTED_POSITION_REPORT", "BL - Adjusted Position Report" ),
 *      ALLOCATION_INSTRUCTION_ALERT("BM", "ALLOCATION_INSTRUCTION_ALERT",
 *                          "BM - Allocation Instruction Alert" ),
 *      EXECUTION_ACKNOWLEDGEMENT("BN", "EXECUTION_ACKNOWLEDGEMENT", "BN - Execution Acknowledgement" ),
 *      CONTRARY_INTENTION_REPORT("BO", "CONTRARY_INTENTION_REPORT", "BO - Contrary Intention Report" ),
 *      SECURITY_DEFINITION_UPDATE_REPORT("BP", "SECURITY_DEFINITION_UPDATE_REPORT",
 *                          "BP - Security Definition Update Report" ),
 */
class Tag35EnuMsgTypeTest {
    @Test
    void FIX0035Test() {
        FIX27 fixData = FIX27.FIX35_ENU_MSG_TYPE;
        assertEquals( "MSG_TYPE", fixData.getName());
        assertEquals( "35", fixData.getID());
        assertEquals( "MsgType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0035Test() {
        Tag35EnuMsgType tagData;


        /**
         *  Information is the same for TAGS 35, 372
         */

        /**
         *  0-9, msg types
         *  A-Z, msg types, skipping "I", and "O"
         *  a-z, msg types
         *  AA-AZ, msg types
         *  BA-BP, msg types
         */


        /**
         * 0-9 msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.HEARTBEAT);
        assertEquals( MyEnumMsgType.HEARTBEAT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TEST_REQUEST);
        assertEquals( MyEnumMsgType.TEST_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RESEND_REQUEST);
        assertEquals( MyEnumMsgType.RESEND_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REJECT);
        assertEquals( MyEnumMsgType.REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SEQUENCE_RESET);
        assertEquals( MyEnumMsgType.SEQUENCE_RESET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGOUT);
        assertEquals( MyEnumMsgType.LOGOUT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.INDICATION_OF_INTEREST);
        assertEquals( MyEnumMsgType.INDICATION_OF_INTEREST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADVERTISEMENT);
        assertEquals( MyEnumMsgType.ADVERTISEMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_REPORT);
        assertEquals( MyEnumMsgType.EXECUTION_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REJECT);
        assertEquals( MyEnumMsgType.ORDER_CANCEL_REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * A-Z msg types, skipping "I", and "O"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGON);
        assertEquals( MyEnumMsgType.LOGON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEWS);
        assertEquals( MyEnumMsgType.NEWS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EMAIL);
        assertEquals( MyEnumMsgType.EMAIL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_SINGLE);
        assertEquals( MyEnumMsgType.NEW_ORDER_SINGLE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_LIST);
        assertEquals( MyEnumMsgType.NEW_ORDER_LIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_CANCEL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MODIFICATION);
        assertEquals( MyEnumMsgType.ORDER_MODIFICATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.LIST_CANCEL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_EXECUTE);
        assertEquals( MyEnumMsgType.LIST_EXECUTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.LIST_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS);
        assertEquals( MyEnumMsgType.LIST_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.DONT_KNOW_TRADE);
        assertEquals( MyEnumMsgType.DONT_KNOW_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST);
        assertEquals( MyEnumMsgType.QUOTE_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE);
        assertEquals( MyEnumMsgType.QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTIONS);
        assertEquals( MyEnumMsgType.SETTLEMENT_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST);
        assertEquals( MyEnumMsgType.MARKET_DATA_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REFRESH);
        assertEquals( MyEnumMsgType.MARKET_DATA_REFRESH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH);
        assertEquals( MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST_REJECT);
        assertEquals( MyEnumMsgType.MARKET_DATA_REQUEST_REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_CANCEL);
        assertEquals( MyEnumMsgType.QUOTE_CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * a-z msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.QUOTE_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT);
        assertEquals( MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS);
        assertEquals( MyEnumMsgType.SECURITY_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS);
        assertEquals( MyEnumMsgType.TRADING_SESSION_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE);
        assertEquals( MyEnumMsgType.MASS_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BUSINESS_MESSAGE_REJECT);
        assertEquals( MyEnumMsgType.BUSINESS_MESSAGE_REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_REQUEST);
        assertEquals( MyEnumMsgType.BID_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_RESPONSE);
        assertEquals( MyEnumMsgType.BID_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STRIKE_PRICE);
        assertEquals( MyEnumMsgType.LIST_STRIKE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.XML_MESSAGE);
        assertEquals( MyEnumMsgType.XML_MESSAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS);
        assertEquals( MyEnumMsgType.REGISTRATION_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE);
        assertEquals( MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REPORT);
        assertEquals( MyEnumMsgType.ORDER_MASS_CANCEL_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_CROSS);
        assertEquals( MyEnumMsgType.NEW_ORDER_CROSS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST);
        assertEquals( MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPE_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_TYPE_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPES);
        assertEquals( MyEnumMsgType.SECURITY_TYPES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_LIST_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST);
        assertEquals( MyEnumMsgType.SECURITY_LIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * AA-AZ msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_MULTILEG);
        assertEquals( MyEnumMsgType.NEW_ORDER_MULTILEG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST);
        assertEquals( MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_MASS_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST_REJECT);
        assertEquals( MyEnumMsgType.QUOTE_REQUEST_REJECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RFQ_REQUEST);
        assertEquals( MyEnumMsgType.RFQ_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REPORT);
        assertEquals( MyEnumMsgType.QUOTE_STATUS_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_RESPONSE);
        assertEquals( MyEnumMsgType.QUOTE_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION);
        assertEquals( MyEnumMsgType.CONFIRMATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REQUEST);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REPORT);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_REPORT);
        assertEquals( MyEnumMsgType.POSITION_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM_ACK);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.AFFIRMATION);
        assertEquals( MyEnumMsgType.AFFIRMATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST);
        assertEquals( MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ASSIGNMENT_REPORT);
        assertEquals( MyEnumMsgType.ASSIGNMENT_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REQUEST);
        assertEquals( MyEnumMsgType.COLLATERAL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_ASSIGNMENT);
        assertEquals( MyEnumMsgType.COLLATERAL_ASSIGNMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_RESPONSE);
        assertEquals( MyEnumMsgType.COLLATERAL_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * BA-BP msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REPORT);
        assertEquals( MyEnumMsgType.COLLATERAL_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY);
        assertEquals( MyEnumMsgType.COLLATERAL_INQUIRY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE);
        assertEquals( MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_REQUEST);
        assertEquals( MyEnumMsgType.USER_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_RESPONSE);
        assertEquals( MyEnumMsgType.USER_RESPONSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY_ACK);
        assertEquals( MyEnumMsgType.COLLATERAL_INQUIRY_ACK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION_REQUEST);
        assertEquals( MyEnumMsgType.CONFIRMATION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST_REQUEST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_LIST_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_LIST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT);
        assertEquals( MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADJUSTED_POSITION_REPORT);
        assertEquals( MyEnumMsgType.ADJUSTED_POSITION_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT);
        assertEquals( MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONTRARY_INTENTION_REPORT);
        assertEquals( MyEnumMsgType.CONTRARY_INTENTION_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}