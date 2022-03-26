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

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum372RefMsgTypeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0372Test() {
        Enum372RefMsgType enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum372RefMsgType.HEARTBEAT;
        assertEquals("0", enumType.getID());
        assertEquals("HEARTBEAT", enumType.getName());
        assertEquals("0 - Heartbeat", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TEST_REQUEST;
        assertEquals("1", enumType.getID());
        assertEquals("TEST_REQUEST", enumType.getName());
        assertEquals("1 - Test Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.RESEND_REQUEST;
        assertEquals("2", enumType.getID());
        assertEquals("RESEND_REQUEST", enumType.getName());
        assertEquals("2 - Resend Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.REJECT;
        assertEquals("3", enumType.getID());
        assertEquals("REJECT", enumType.getName());
        assertEquals("3 - Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SEQUENCE_RESET;
        assertEquals("4", enumType.getID());
        assertEquals("SEQUENCE_RESET", enumType.getName());
        assertEquals("4 - Sequence Reset", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LOGOUT;
        assertEquals("5", enumType.getID());
        assertEquals("LOGOUT", enumType.getName());
        assertEquals("5 - Logout", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.INDICATION_OF_INTEREST;
        assertEquals("6", enumType.getID());
        assertEquals("INDICATION_OF_INTEREST", enumType.getName());
        assertEquals("6 - Indication of Interest", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ADVERTISEMENT;
        assertEquals("7", enumType.getID());
        assertEquals("ADVERTISEMENT", enumType.getName());
        assertEquals("7 - Advertisement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.EXECUTION_REPORT;
        assertEquals("8", enumType.getID());
        assertEquals("EXECUTION_REPORT", enumType.getName());
        assertEquals("8 - Execution Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_CANCEL_REJECT;
        assertEquals("9", enumType.getID());
        assertEquals("ORDER_CANCEL_REJECT", enumType.getName());
        assertEquals("9 - Order Cancel Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-Z msg types
         */
        enumType = Enum372RefMsgType.LOGON;
        assertEquals("A", enumType.getID());
        assertEquals("LOGON", enumType.getName());
        assertEquals("A - Logon", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NEWS;
        assertEquals("B", enumType.getID());
        assertEquals("NEWS", enumType.getName());
        assertEquals("B - News", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.EMAIL;
        assertEquals("C", enumType.getID());
        assertEquals("EMAIL", enumType.getName());
        assertEquals("C - Email", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NEW_ORDER_SINGLE;
        assertEquals("D", enumType.getID());
        assertEquals("NEW_ORDER_SINGLE", enumType.getName());
        assertEquals("D - New Order - Single", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NEW_ORDER_LIST;
        assertEquals("E", enumType.getID());
        assertEquals("NEW_ORDER_LIST", enumType.getName());
        assertEquals("E - New Order - List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_CANCEL_REQUEST;
        assertEquals("F", enumType.getID());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("F - Order Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_MODIFICATION;
        assertEquals("G", enumType.getID());
        assertEquals("ORDER_MODIFICATION", enumType.getName());
        assertEquals("G - Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_STATUS_REQUEST;
        assertEquals("H", enumType.getID());
        assertEquals("ORDER_STATUS_REQUEST", enumType.getName());
        assertEquals("H - Order Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ALLOCATION_INSTRUCTION;
        assertEquals("J", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION", enumType.getName());
        assertEquals("J - Allocation Instruction", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LIST_CANCEL_REQUEST;
        assertEquals("K", enumType.getID());
        assertEquals("LIST_CANCEL_REQUEST", enumType.getName());
        assertEquals("K - List Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LIST_EXECUTE;
        assertEquals("L", enumType.getID());
        assertEquals("LIST_EXECUTE", enumType.getName());
        assertEquals("L - List Execute", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LIST_STATUS_REQUEST;
        assertEquals("M", enumType.getID());
        assertEquals("LIST_STATUS_REQUEST", enumType.getName());
        assertEquals("M - List Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LIST_STATUS;
        assertEquals("N", enumType.getID());
        assertEquals("LIST_STATUS", enumType.getName());
        assertEquals("N - List Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ALLOCATION_INSTRUCTION_ACK;
        assertEquals("P", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION_ACK", enumType.getName());
        assertEquals("P - Allocation Instruction Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.DONT_KNOW_TRADE;
        assertEquals("Q", enumType.getID());
        assertEquals("DONT_KNOW_TRADE", enumType.getName());
        assertEquals("Q - Don't Know Trade (DK)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE_REQUEST;
        assertEquals("R", enumType.getID());
        assertEquals("QUOTE_REQUEST", enumType.getName());
        assertEquals("R - Quote Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE;
        assertEquals("S", enumType.getID());
        assertEquals("QUOTE", enumType.getName());
        assertEquals("S - Quote", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SETTLEMENT_INSTRUCTIONS;
        assertEquals("T", enumType.getID());
        assertEquals("SETTLEMENT_INSTRUCTIONS", enumType.getName());
        assertEquals("T - Settlement Instructions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MARKET_DATA_REQUEST;
        assertEquals("V", enumType.getID());
        assertEquals("MARKET_DATA_REQUEST", enumType.getName());
        assertEquals("V - Market Data Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MARKET_DATA_REFRESH;
        assertEquals("W", enumType.getID());
        assertEquals("MARKET_DATA_REFRESH", enumType.getName());
        assertEquals("W - Market Data - Snapshot/Full Refresh", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MARKET_DATA_INCREMENTAL_REFRESH;
        assertEquals("X", enumType.getID());
        assertEquals("MARKET_DATA_INCREMENTAL_REFRESH", enumType.getName());
        assertEquals("X - Market Data - Incremental Refresh", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MARKET_DATA_REQUEST_REJECT;
        assertEquals("Y", enumType.getID());
        assertEquals("MARKET_DATA_REQUEST_REJECT", enumType.getName());
        assertEquals("Y - Market Data Request Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE_CANCEL;
        assertEquals("Z", enumType.getID());
        assertEquals("QUOTE_CANCEL", enumType.getName());
        assertEquals("Z - Quote Cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * a-z msg types
         */
        enumType = Enum372RefMsgType.QUOTE_STATUS_REQUEST;
        assertEquals("a", enumType.getID());
        assertEquals("QUOTE_STATUS_REQUEST", enumType.getName());
        assertEquals("a - Quote Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MASS_QUOTE_ACKNOWLEDGEMENT;
        assertEquals("b", enumType.getID());
        assertEquals("MASS_QUOTE_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("b - Mass Quote Acknowledgement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_DEFINITION_REQUEST;
        assertEquals("c", enumType.getID());
        assertEquals("SECURITY_DEFINITION_REQUEST", enumType.getName());
        assertEquals("c - Security Definition Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_DEFINITION;
        assertEquals("d", enumType.getID());
        assertEquals("SECURITY_DEFINITION", enumType.getName());
        assertEquals("d - Security Definition", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_STATUS_REQUEST;
        assertEquals("e", enumType.getID());
        assertEquals("SECURITY_STATUS_REQUEST", enumType.getName());
        assertEquals("e - Security Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_STATUS;
        assertEquals("f", enumType.getID());
        assertEquals("SECURITY_STATUS", enumType.getName());
        assertEquals("f - Security Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADING_SESSION_STATUS_REQUEST;
        assertEquals("g", enumType.getID());
        assertEquals("TRADING_SESSION_STATUS_REQUEST", enumType.getName());
        assertEquals("g - Trading Session Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADING_SESSION_STATUS;
        assertEquals("h", enumType.getID());
        assertEquals("TRADING_SESSION_STATUS", enumType.getName());
        assertEquals("h - Trading Session Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MASS_QUOTE;
        assertEquals("i", enumType.getID());
        assertEquals("MASS_QUOTE", enumType.getName());
        assertEquals("i - Mass Quote", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.BUSINESS_MESSAGE_REJECT;
        assertEquals("j", enumType.getID());
        assertEquals("BUSINESS_MESSAGE_REJECT", enumType.getName());
        assertEquals("j - Business Message Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.BID_REQUEST;
        assertEquals("k", enumType.getID());
        assertEquals("BID_REQUEST", enumType.getName());
        assertEquals("k - Bid Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.BID_RESPONSE;
        assertEquals("l", enumType.getID());
        assertEquals("BID_RESPONSE", enumType.getName());
        assertEquals("l - Bid Response (lowercase L)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.LIST_STRIKE_PRICE;
        assertEquals("m", enumType.getID());
        assertEquals("LIST_STRIKE_PRICE", enumType.getName());
        assertEquals("m - List Strike Price", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.XML_MESSAGE;
        assertEquals("n", enumType.getID());
        assertEquals("XML_MESSAGE", enumType.getName());
        assertEquals("n - XML message (e.g. non FIX Msg Type)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.REGISTRATION_INSTRUCTIONS;
        assertEquals("o", enumType.getID());
        assertEquals("REGISTRATION_INSTRUCTIONS", enumType.getName());
        assertEquals("o - Registration Instructions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE;
        assertEquals("p", enumType.getID());
        assertEquals("REGISTRATION_INSTRUCTIONS_RESPONSE", enumType.getName());
        assertEquals("p - Registration Instructions Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_MASS_CANCEL_REQUEST;
        assertEquals("q", enumType.getID());
        assertEquals("ORDER_MASS_CANCEL_REQUEST", enumType.getName());
        assertEquals("q - Order Mass Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_MASS_CANCEL_REPORT;
        assertEquals("r", enumType.getID());
        assertEquals("ORDER_MASS_CANCEL_REPORT", enumType.getName());
        assertEquals("r - Order Mass Cancel Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NEW_ORDER_CROSS;
        assertEquals("s", enumType.getID());
        assertEquals("NEW_ORDER_CROSS", enumType.getName());
        assertEquals("s - New Order - Cross", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.CROSS_ORDER_MODIFICATION_REQUEST;
        assertEquals("t", enumType.getID());
        assertEquals("CROSS_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("t - Cross Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.CROSS_ORDER_CANCEL_REQUEST;
        assertEquals("u", enumType.getID());
        assertEquals("CROSS_ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("u - Cross Order Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_TYPE_REQUEST;
        assertEquals("v", enumType.getID());
        assertEquals("SECURITY_TYPE_REQUEST", enumType.getName());
        assertEquals("v - Security Type Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_TYPES;
        assertEquals("w", enumType.getID());
        assertEquals("SECURITY_TYPES", enumType.getName());
        assertEquals("w - Security Types", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_LIST_REQUEST;
        assertEquals("x", enumType.getID());
        assertEquals("SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("x - Security List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_LIST;
        assertEquals("y", enumType.getID());
        assertEquals("SECURITY_LIST", enumType.getName());
        assertEquals("y - Security List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.DERIVATIVE_SECURITY_LIST_REQUEST;
        assertEquals("z", enumType.getID());
        assertEquals("DERIVATIVE_SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("z - Derivative Security List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * AA-AZ msg types
         */
        enumType = Enum372RefMsgType.DERIVATIVE_SECURITY_LIST;
        assertEquals("AA", enumType.getID());
        assertEquals("DERIVATIVE_SECURITY_LIST", enumType.getName());
        assertEquals("AA - Derivative Security List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NEW_ORDER_MULTILEG;
        assertEquals("AB", enumType.getID());
        assertEquals("NEW_ORDER_MULTILEG", enumType.getName());
        assertEquals("AB - New Order - Multileg", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST;
        assertEquals("AC", enumType.getID());
        assertEquals("MULTILEG_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("AC - Multileg Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADE_CAPTURE_REPORT_REQUEST;
        assertEquals("AD", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST", enumType.getName());
        assertEquals("AD - Trade Capture Report Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADE_CAPTURE_REPORT;
        assertEquals("AE", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT", enumType.getName());
        assertEquals("AE - Trade Capture Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ORDER_MASS_STATUS_REQUEST;
        assertEquals("AF", enumType.getID());
        assertEquals("ORDER_MASS_STATUS_REQUEST", enumType.getName());
        assertEquals("AF - Order Mass Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE_REQUEST_REJECT;
        assertEquals("AG", enumType.getID());
        assertEquals("QUOTE_REQUEST_REJECT", enumType.getName());
        assertEquals("AG - Quote Request Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.RFQ_REQUEST;
        assertEquals("AH", enumType.getID());
        assertEquals("RFQ_REQUEST", enumType.getName());
        assertEquals("AH - RFQ Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE_STATUS_REPORT;
        assertEquals("AI", enumType.getID());
        assertEquals("QUOTE_STATUS_REPORT", enumType.getName());
        assertEquals("AI - Quote Status Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.QUOTE_RESPONSE;
        assertEquals("AJ", enumType.getID());
        assertEquals("QUOTE_RESPONSE", enumType.getName());
        assertEquals("AJ - Quote Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.CONFIRMATION;
        assertEquals("AK", enumType.getID());
        assertEquals("CONFIRMATION", enumType.getName());
        assertEquals("AK - Confirmation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.POSITION_MAINTENANCE_REQUEST;
        assertEquals("AL", enumType.getID());
        assertEquals("POSITION_MAINTENANCE_REQUEST", enumType.getName());
        assertEquals("AL - Position Maintenance Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.POSITION_MAINTENANCE_REPORT;
        assertEquals("AM", enumType.getID());
        assertEquals("POSITION_MAINTENANCE_REPORT", enumType.getName());
        assertEquals("AM - Position Maintenance Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.REQUEST_FOR_POSITIONS;
        assertEquals("AN", enumType.getID());
        assertEquals("REQUEST_FOR_POSITIONS", enumType.getName());
        assertEquals("AN - Request For Positions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.REQUEST_FOR_POSITIONS_ACK;
        assertEquals("AO", enumType.getID());
        assertEquals("REQUEST_FOR_POSITIONS_ACK", enumType.getName());
        assertEquals("AO - Request For Positions Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.POSITION_REPORT;
        assertEquals("AP", enumType.getID());
        assertEquals("POSITION_REPORT", enumType.getName());
        assertEquals("AP - Position Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK;
        assertEquals("AQ", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST_ACK", enumType.getName());
        assertEquals("AQ - Trade Capture Report Request Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADE_CAPTURE_REPORT_ACK;
        assertEquals("AR", enumType.getID());
        assertEquals("TRADE_CAPTURE_REPORT_ACK", enumType.getName());
        assertEquals("AR - Trade Capture Report Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ALLOCATION_CLAIM;
        assertEquals("AS", enumType.getID());
        assertEquals("ALLOCATION_CLAIM", enumType.getName());
        assertEquals("AS - Allocation Claim", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ALLOCATION_CLAIM_ACK;
        assertEquals("AT", enumType.getID());
        assertEquals("ALLOCATION_CLAIM_ACK", enumType.getName());
        assertEquals("AT - Allocation Claim Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.AFFIRMATION;
        assertEquals("AU", enumType.getID());
        assertEquals("AFFIRMATION", enumType.getName());
        assertEquals("AU - Affirmation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SETTLEMENT_INSTRUCTION_REQUEST;
        assertEquals("AV", enumType.getID());
        assertEquals("SETTLEMENT_INSTRUCTION_REQUEST", enumType.getName());
        assertEquals("AV - Settlement Instruction Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ASSIGNMENT_REPORT;
        assertEquals("AW", enumType.getID());
        assertEquals("ASSIGNMENT_REPORT", enumType.getName());
        assertEquals("AW - Assignment Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.COLLATERAL_REQUEST;
        assertEquals("AX", enumType.getID());
        assertEquals("COLLATERAL_REQUEST", enumType.getName());
        assertEquals("AX - Collateral Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.COLLATERAL_ASSIGNMENT;
        assertEquals("AY", enumType.getID());
        assertEquals("COLLATERAL_ASSIGNMENT", enumType.getName());
        assertEquals("AY - Collateral Assignment", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.COLLATERAL_RESPONSE;
        assertEquals("AZ", enumType.getID());
        assertEquals("COLLATERAL_RESPONSE", enumType.getName());
        assertEquals("AZ - Collateral Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * BA-BP msg types
         */
        enumType = Enum372RefMsgType.COLLATERAL_REPORT;
        assertEquals("BA", enumType.getID());
        assertEquals("COLLATERAL_REPORT", enumType.getName());
        assertEquals("BA - Collateral Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.COLLATERAL_INQUIRY;
        assertEquals("BB", enumType.getID());
        assertEquals("COLLATERAL_INQUIRY", enumType.getName());
        assertEquals("BB - Collateral Inquiry", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST;
        assertEquals("BC", enumType.getID());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", enumType.getName());
        assertEquals("BC - Network Counterparty System Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE;
        assertEquals("BD", enumType.getID());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", enumType.getName());
        assertEquals("BD - Network Counterparty System Status Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.USER_REQUEST;
        assertEquals("BE", enumType.getID());
        assertEquals("USER_REQUEST", enumType.getName());
        assertEquals("BE - User Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.USER_RESPONSE;
        assertEquals("BF", enumType.getID());
        assertEquals("USER_RESPONSE", enumType.getName());
        assertEquals("BF - User Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.COLLATERAL_INQUIRY_ACK;
        assertEquals("BG", enumType.getID());
        assertEquals("COLLATERAL_INQUIRY_ACK", enumType.getName());
        assertEquals("BG - Collateral Inquiry Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.CONFIRMATION_REQUEST;
        assertEquals("BH", enumType.getID());
        assertEquals("CONFIRMATION_REQUEST", enumType.getName());
        assertEquals("BH - Confirmation Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADING_SESSION_LIST_REQUEST;
        assertEquals("BI", enumType.getID());
        assertEquals("TRADING_SESSION_LIST_REQUEST", enumType.getName());
        assertEquals("BI - Trading Session List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.TRADING_SESSION_LIST;
        assertEquals("BJ", enumType.getID());
        assertEquals("TRADING_SESSION_LIST", enumType.getName());
        assertEquals("BJ - Trading Session List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_LIST_UPDATE_REPORT;
        assertEquals("BK", enumType.getID());
        assertEquals("SECURITY_LIST_UPDATE_REPORT", enumType.getName());
        assertEquals("BK - Security List Update Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ADJUSTED_POSITION_REPORT;
        assertEquals("BL", enumType.getID());
        assertEquals("ADJUSTED_POSITION_REPORT", enumType.getName());
        assertEquals("BL - Adjusted Position Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.ALLOCATION_INSTRUCTION_ALERT;
        assertEquals("BM", enumType.getID());
        assertEquals("ALLOCATION_INSTRUCTION_ALERT", enumType.getName());
        assertEquals("BM - Allocation Instruction Alert", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.EXECUTION_ACKNOWLEDGEMENT;
        assertEquals("BN", enumType.getID());
        assertEquals("EXECUTION_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("BN - Execution Acknowledgement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.CONTRARY_INTENTION_REPORT;
        assertEquals("BO", enumType.getID());
        assertEquals("CONTRARY_INTENTION_REPORT", enumType.getName());
        assertEquals("BO - Contrary Intention Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum372RefMsgType.SECURITY_DEFINITION_UPDATE_REPORT;
        assertEquals("BP", enumType.getID());
        assertEquals("SECURITY_DEFINITION_UPDATE_REPORT", enumType.getName());
        assertEquals("BP - Security Definition Update Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getID());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}