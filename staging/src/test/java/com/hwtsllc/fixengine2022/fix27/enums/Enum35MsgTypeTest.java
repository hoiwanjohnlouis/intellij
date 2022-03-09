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

package com.hwtsllc.fixengine2022.fix27.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum35MsgTypeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting Enum35MsgTypeTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Enum35MsgTypeTest()");
    }

    @Test
    void Enum0035Test() {
        Enum35MsgType enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum35MsgType.HEARTBEAT;
        assertEquals("0", enumType.getAction());
        assertEquals("HEARTBEAT", enumType.getName());
        assertEquals("0 - Heartbeat", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TEST_REQUEST;
        assertEquals("1", enumType.getAction());
        assertEquals("TEST_REQUEST", enumType.getName());
        assertEquals("1 - Test Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.RESEND_REQUEST;
        assertEquals("2", enumType.getAction());
        assertEquals("RESEND_REQUEST", enumType.getName());
        assertEquals("2 - Resend Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.REJECT;
        assertEquals("3", enumType.getAction());
        assertEquals("REJECT", enumType.getName());
        assertEquals("3 - Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SEQUENCE_RESET;
        assertEquals("4", enumType.getAction());
        assertEquals("SEQUENCE_RESET", enumType.getName());
        assertEquals("4 - Sequence Reset", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LOGOUT;
        assertEquals("5", enumType.getAction());
        assertEquals("LOGOUT", enumType.getName());
        assertEquals("5 - Logout", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.INDICATION_OF_INTEREST;
        assertEquals("6", enumType.getAction());
        assertEquals("INDICATION_OF_INTEREST", enumType.getName());
        assertEquals("6 - Indication of Interest", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ADVERTISEMENT;
        assertEquals("7", enumType.getAction());
        assertEquals("ADVERTISEMENT", enumType.getName());
        assertEquals("7 - Advertisement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.EXECUTION_REPORT;
        assertEquals("8", enumType.getAction());
        assertEquals("EXECUTION_REPORT", enumType.getName());
        assertEquals("8 - Execution Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_CANCEL_REJECT;
        assertEquals("9", enumType.getAction());
        assertEquals("ORDER_CANCEL_REJECT", enumType.getName());
        assertEquals("9 - Order Cancel Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-Z msg types
         */
        enumType = Enum35MsgType.LOGON;
        assertEquals("A", enumType.getAction());
        assertEquals("LOGON", enumType.getName());
        assertEquals("A - Logon", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NEWS;
        assertEquals("B", enumType.getAction());
        assertEquals("NEWS", enumType.getName());
        assertEquals("B - News", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.EMAIL;
        assertEquals("C", enumType.getAction());
        assertEquals("EMAIL", enumType.getName());
        assertEquals("C - Email", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NEW_ORDER_SINGLE;
        assertEquals("D", enumType.getAction());
        assertEquals("NEW_ORDER_SINGLE", enumType.getName());
        assertEquals("D - New Order - Single", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NEW_ORDER_LIST;
        assertEquals("E", enumType.getAction());
        assertEquals("NEW_ORDER_LIST", enumType.getName());
        assertEquals("E - New Order - List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_CANCEL_REQUEST;
        assertEquals("F", enumType.getAction());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("F - Order Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_MODIFICATION;
        assertEquals("G", enumType.getAction());
        assertEquals("ORDER_MODIFICATION", enumType.getName());
        assertEquals("G - Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_STATUS_REQUEST;
        assertEquals("H", enumType.getAction());
        assertEquals("ORDER_STATUS_REQUEST", enumType.getName());
        assertEquals("H - Order Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ALLOCATION_INSTRUCTION;
        assertEquals("J", enumType.getAction());
        assertEquals("ALLOCATION_INSTRUCTION", enumType.getName());
        assertEquals("J - Allocation Instruction", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LIST_CANCEL_REQUEST;
        assertEquals("K", enumType.getAction());
        assertEquals("LIST_CANCEL_REQUEST", enumType.getName());
        assertEquals("K - List Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LIST_EXECUTE;
        assertEquals("L", enumType.getAction());
        assertEquals("LIST_EXECUTE", enumType.getName());
        assertEquals("L - List Execute", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LIST_STATUS_REQUEST;
        assertEquals("M", enumType.getAction());
        assertEquals("LIST_STATUS_REQUEST", enumType.getName());
        assertEquals("M - List Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LIST_STATUS;
        assertEquals("N", enumType.getAction());
        assertEquals("LIST_STATUS", enumType.getName());
        assertEquals("N - List Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ALLOCATION_INSTRUCTION_ACK;
        assertEquals("P", enumType.getAction());
        assertEquals("ALLOCATION_INSTRUCTION_ACK", enumType.getName());
        assertEquals("P - Allocation Instruction Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.DONT_KNOW_TRADE;
        assertEquals("Q", enumType.getAction());
        assertEquals("DONT_KNOW_TRADE", enumType.getName());
        assertEquals("Q - Don't Know Trade (DK)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE_REQUEST;
        assertEquals("R", enumType.getAction());
        assertEquals("QUOTE_REQUEST", enumType.getName());
        assertEquals("R - Quote Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE;
        assertEquals("S", enumType.getAction());
        assertEquals("QUOTE", enumType.getName());
        assertEquals("S - Quote", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SETTLEMENT_INSTRUCTIONS;
        assertEquals("T", enumType.getAction());
        assertEquals("SETTLEMENT_INSTRUCTIONS", enumType.getName());
        assertEquals("T - Settlement Instructions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MARKET_DATA_REQUEST;
        assertEquals("V", enumType.getAction());
        assertEquals("MARKET_DATA_REQUEST", enumType.getName());
        assertEquals("V - Market Data Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MARKET_DATA_REFRESH;
        assertEquals("W", enumType.getAction());
        assertEquals("MARKET_DATA_REFRESH", enumType.getName());
        assertEquals("W - Market Data - Snapshot/Full Refresh", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MARKET_DATA_INCREMENTAL_REFRESH;
        assertEquals("X", enumType.getAction());
        assertEquals("MARKET_DATA_INCREMENTAL_REFRESH", enumType.getName());
        assertEquals("X - Market Data - Incremental Refresh", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MARKET_DATA_REQUEST_REJECT;
        assertEquals("Y", enumType.getAction());
        assertEquals("MARKET_DATA_REQUEST_REJECT", enumType.getName());
        assertEquals("Y - Market Data Request Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE_CANCEL;
        assertEquals("Z", enumType.getAction());
        assertEquals("QUOTE_CANCEL", enumType.getName());
        assertEquals("Z - Quote Cancel", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * a-z msg types
         */
        enumType = Enum35MsgType.QUOTE_STATUS_REQUEST;
        assertEquals("a", enumType.getAction());
        assertEquals("QUOTE_STATUS_REQUEST", enumType.getName());
        assertEquals("a - Quote Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MASS_QUOTE_ACKNOWLEDGEMENT;
        assertEquals("b", enumType.getAction());
        assertEquals("MASS_QUOTE_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("b - Mass Quote Acknowledgement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_DEFINITION_REQUEST;
        assertEquals("c", enumType.getAction());
        assertEquals("SECURITY_DEFINITION_REQUEST", enumType.getName());
        assertEquals("c - Security Definition Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_DEFINITION;
        assertEquals("d", enumType.getAction());
        assertEquals("SECURITY_DEFINITION", enumType.getName());
        assertEquals("d - Security Definition", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_STATUS_REQUEST;
        assertEquals("e", enumType.getAction());
        assertEquals("SECURITY_STATUS_REQUEST", enumType.getName());
        assertEquals("e - Security Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_STATUS;
        assertEquals("f", enumType.getAction());
        assertEquals("SECURITY_STATUS", enumType.getName());
        assertEquals("f - Security Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADING_SESSION_STATUS_REQUEST;
        assertEquals("g", enumType.getAction());
        assertEquals("TRADING_SESSION_STATUS_REQUEST", enumType.getName());
        assertEquals("g - Trading Session Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADING_SESSION_STATUS;
        assertEquals("h", enumType.getAction());
        assertEquals("TRADING_SESSION_STATUS", enumType.getName());
        assertEquals("h - Trading Session Status", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MASS_QUOTE;
        assertEquals("i", enumType.getAction());
        assertEquals("MASS_QUOTE", enumType.getName());
        assertEquals("i - Mass Quote", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.BUSINESS_MESSAGE_REJECT;
        assertEquals("j", enumType.getAction());
        assertEquals("BUSINESS_MESSAGE_REJECT", enumType.getName());
        assertEquals("j - Business Message Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.BID_REQUEST;
        assertEquals("k", enumType.getAction());
        assertEquals("BID_REQUEST", enumType.getName());
        assertEquals("k - Bid Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.BID_RESPONSE;
        assertEquals("l", enumType.getAction());
        assertEquals("BID_RESPONSE", enumType.getName());
        assertEquals("l - Bid Response (lowercase L)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.LIST_STRIKE_PRICE;
        assertEquals("m", enumType.getAction());
        assertEquals("LIST_STRIKE_PRICE", enumType.getName());
        assertEquals("m - List Strike Price", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.XML_MESSAGE;
        assertEquals("n", enumType.getAction());
        assertEquals("XML_MESSAGE", enumType.getName());
        assertEquals("n - XML message (e.g. non FIX Msg Type)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.REGISTRATION_INSTRUCTIONS;
        assertEquals("o", enumType.getAction());
        assertEquals("REGISTRATION_INSTRUCTIONS", enumType.getName());
        assertEquals("o - Registration Instructions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.REGISTRATION_INSTRUCTIONS_RESPONSE;
        assertEquals("p", enumType.getAction());
        assertEquals("REGISTRATION_INSTRUCTIONS_RESPONSE", enumType.getName());
        assertEquals("p - Registration Instructions Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_MASS_CANCEL_REQUEST;
        assertEquals("q", enumType.getAction());
        assertEquals("ORDER_MASS_CANCEL_REQUEST", enumType.getName());
        assertEquals("q - Order Mass Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_MASS_CANCEL_REPORT;
        assertEquals("r", enumType.getAction());
        assertEquals("ORDER_MASS_CANCEL_REPORT", enumType.getName());
        assertEquals("r - Order Mass Cancel Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NEW_ORDER_CROSS;
        assertEquals("s", enumType.getAction());
        assertEquals("NEW_ORDER_CROSS", enumType.getName());
        assertEquals("s - New Order - Cross", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.CROSS_ORDER_MODIFICATION_REQUEST;
        assertEquals("t", enumType.getAction());
        assertEquals("CROSS_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("t - Cross Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.CROSS_ORDER_CANCEL_REQUEST;
        assertEquals("u", enumType.getAction());
        assertEquals("CROSS_ORDER_CANCEL_REQUEST", enumType.getName());
        assertEquals("u - Cross Order Cancel Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_TYPE_REQUEST;
        assertEquals("v", enumType.getAction());
        assertEquals("SECURITY_TYPE_REQUEST", enumType.getName());
        assertEquals("v - Security Type Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_TYPES;
        assertEquals("w", enumType.getAction());
        assertEquals("SECURITY_TYPES", enumType.getName());
        assertEquals("w - Security Types", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_LIST_REQUEST;
        assertEquals("x", enumType.getAction());
        assertEquals("SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("x - Security List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_LIST;
        assertEquals("y", enumType.getAction());
        assertEquals("SECURITY_LIST", enumType.getName());
        assertEquals("y - Security List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.DERIVATIVE_SECURITY_LIST_REQUEST;
        assertEquals("z", enumType.getAction());
        assertEquals("DERIVATIVE_SECURITY_LIST_REQUEST", enumType.getName());
        assertEquals("z - Derivative Security List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * AA-AZ msg types
         */
        enumType = Enum35MsgType.DERIVATIVE_SECURITY_LIST;
        assertEquals("AA", enumType.getAction());
        assertEquals("DERIVATIVE_SECURITY_LIST", enumType.getName());
        assertEquals("AA - Derivative Security List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NEW_ORDER_MULTILEG;
        assertEquals("AB", enumType.getAction());
        assertEquals("NEW_ORDER_MULTILEG", enumType.getName());
        assertEquals("AB - New Order - Multileg", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.MULTILEG_ORDER_MODIFICATION_REQUEST;
        assertEquals("AC", enumType.getAction());
        assertEquals("MULTILEG_ORDER_MODIFICATION_REQUEST", enumType.getName());
        assertEquals("AC - Multileg Order Modification Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADE_CAPTURE_REPORT_REQUEST;
        assertEquals("AD", enumType.getAction());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST", enumType.getName());
        assertEquals("AD - Trade Capture Report Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADE_CAPTURE_REPORT;
        assertEquals("AE", enumType.getAction());
        assertEquals("TRADE_CAPTURE_REPORT", enumType.getName());
        assertEquals("AE - Trade Capture Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ORDER_MASS_STATUS_REQUEST;
        assertEquals("AF", enumType.getAction());
        assertEquals("ORDER_MASS_STATUS_REQUEST", enumType.getName());
        assertEquals("AF - Order Mass Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE_REQUEST_REJECT;
        assertEquals("AG", enumType.getAction());
        assertEquals("QUOTE_REQUEST_REJECT", enumType.getName());
        assertEquals("AG - Quote Request Reject", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.RFQ_REQUEST;
        assertEquals("AH", enumType.getAction());
        assertEquals("RFQ_REQUEST", enumType.getName());
        assertEquals("AH - RFQ Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE_STATUS_REPORT;
        assertEquals("AI", enumType.getAction());
        assertEquals("QUOTE_STATUS_REPORT", enumType.getName());
        assertEquals("AI - Quote Status Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.QUOTE_RESPONSE;
        assertEquals("AJ", enumType.getAction());
        assertEquals("QUOTE_RESPONSE", enumType.getName());
        assertEquals("AJ - Quote Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.CONFIRMATION;
        assertEquals("AK", enumType.getAction());
        assertEquals("CONFIRMATION", enumType.getName());
        assertEquals("AK - Confirmation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.POSITION_MAINTENANCE_REQUEST;
        assertEquals("AL", enumType.getAction());
        assertEquals("POSITION_MAINTENANCE_REQUEST", enumType.getName());
        assertEquals("AL - Position Maintenance Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.POSITION_MAINTENANCE_REPORT;
        assertEquals("AM", enumType.getAction());
        assertEquals("POSITION_MAINTENANCE_REPORT", enumType.getName());
        assertEquals("AM - Position Maintenance Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.REQUEST_FOR_POSITIONS;
        assertEquals("AN", enumType.getAction());
        assertEquals("REQUEST_FOR_POSITIONS", enumType.getName());
        assertEquals("AN - Request For Positions", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.REQUEST_FOR_POSITIONS_ACK;
        assertEquals("AO", enumType.getAction());
        assertEquals("REQUEST_FOR_POSITIONS_ACK", enumType.getName());
        assertEquals("AO - Request For Positions Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.POSITION_REPORT;
        assertEquals("AP", enumType.getAction());
        assertEquals("POSITION_REPORT", enumType.getName());
        assertEquals("AP - Position Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK;
        assertEquals("AQ", enumType.getAction());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST_ACK", enumType.getName());
        assertEquals("AQ - Trade Capture Report Request Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADE_CAPTURE_REPORT_ACK;
        assertEquals("AR", enumType.getAction());
        assertEquals("TRADE_CAPTURE_REPORT_ACK", enumType.getName());
        assertEquals("AR - Trade Capture Report Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ALLOCATION_CLAIM;
        assertEquals("AS", enumType.getAction());
        assertEquals("ALLOCATION_CLAIM", enumType.getName());
        assertEquals("AS - Allocation Claim", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ALLOCATION_CLAIM_ACK;
        assertEquals("AT", enumType.getAction());
        assertEquals("ALLOCATION_CLAIM_ACK", enumType.getName());
        assertEquals("AT - Allocation Claim Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.AFFIRMATION;
        assertEquals("AU", enumType.getAction());
        assertEquals("AFFIRMATION", enumType.getName());
        assertEquals("AU - Affirmation", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SETTLEMENT_INSTRUCTION_REQUEST;
        assertEquals("AV", enumType.getAction());
        assertEquals("SETTLEMENT_INSTRUCTION_REQUEST", enumType.getName());
        assertEquals("AV - Settlement Instruction Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ASSIGNMENT_REPORT;
        assertEquals("AW", enumType.getAction());
        assertEquals("ASSIGNMENT_REPORT", enumType.getName());
        assertEquals("AW - Assignment Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.COLLATERAL_REQUEST;
        assertEquals("AX", enumType.getAction());
        assertEquals("COLLATERAL_REQUEST", enumType.getName());
        assertEquals("AX - Collateral Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.COLLATERAL_ASSIGNMENT;
        assertEquals("AY", enumType.getAction());
        assertEquals("COLLATERAL_ASSIGNMENT", enumType.getName());
        assertEquals("AY - Collateral Assignment", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.COLLATERAL_RESPONSE;
        assertEquals("AZ", enumType.getAction());
        assertEquals("COLLATERAL_RESPONSE", enumType.getName());
        assertEquals("AZ - Collateral Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * BA-BP msg types
         */
        enumType = Enum35MsgType.COLLATERAL_REPORT;
        assertEquals("BA", enumType.getAction());
        assertEquals("COLLATERAL_REPORT", enumType.getName());
        assertEquals("BA - Collateral Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.COLLATERAL_INQUIRY;
        assertEquals("BB", enumType.getAction());
        assertEquals("COLLATERAL_INQUIRY", enumType.getName());
        assertEquals("BB - Collateral Inquiry", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST;
        assertEquals("BC", enumType.getAction());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", enumType.getName());
        assertEquals("BC - Network Counterparty System Status Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE;
        assertEquals("BD", enumType.getAction());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", enumType.getName());
        assertEquals("BD - Network Counterparty System Status Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.USER_REQUEST;
        assertEquals("BE", enumType.getAction());
        assertEquals("USER_REQUEST", enumType.getName());
        assertEquals("BE - User Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.USER_RESPONSE;
        assertEquals("BF", enumType.getAction());
        assertEquals("USER_RESPONSE", enumType.getName());
        assertEquals("BF - User Response", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.COLLATERAL_INQUIRY_ACK;
        assertEquals("BG", enumType.getAction());
        assertEquals("COLLATERAL_INQUIRY_ACK", enumType.getName());
        assertEquals("BG - Collateral Inquiry Ack", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.CONFIRMATION_REQUEST;
        assertEquals("BH", enumType.getAction());
        assertEquals("CONFIRMATION_REQUEST", enumType.getName());
        assertEquals("BH - Confirmation Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADING_SESSION_LIST_REQUEST;
        assertEquals("BI", enumType.getAction());
        assertEquals("TRADING_SESSION_LIST_REQUEST", enumType.getName());
        assertEquals("BI - Trading Session List Request", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.TRADING_SESSION_LIST;
        assertEquals("BJ", enumType.getAction());
        assertEquals("TRADING_SESSION_LIST", enumType.getName());
        assertEquals("BJ - Trading Session List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_LIST_UPDATE_REPORT;
        assertEquals("BK", enumType.getAction());
        assertEquals("SECURITY_LIST_UPDATE_REPORT", enumType.getName());
        assertEquals("BK - Security List Update Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ADJUSTED_POSITION_REPORT;
        assertEquals("BL", enumType.getAction());
        assertEquals("ADJUSTED_POSITION_REPORT", enumType.getName());
        assertEquals("BL - Adjusted Position Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.ALLOCATION_INSTRUCTION_ALERT;
        assertEquals("BM", enumType.getAction());
        assertEquals("ALLOCATION_INSTRUCTION_ALERT", enumType.getName());
        assertEquals("BM - Allocation Instruction Alert", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.EXECUTION_ACKNOWLEDGEMENT;
        assertEquals("BN", enumType.getAction());
        assertEquals("EXECUTION_ACKNOWLEDGEMENT", enumType.getName());
        assertEquals("BN - Execution Acknowledgement", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.CONTRARY_INTENTION_REPORT;
        assertEquals("BO", enumType.getAction());
        assertEquals("CONTRARY_INTENTION_REPORT", enumType.getName());
        assertEquals("BO - Contrary Intention Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum35MsgType.SECURITY_DEFINITION_UPDATE_REPORT;
        assertEquals("BP", enumType.getAction());
        assertEquals("SECURITY_DEFINITION_UPDATE_REPORT", enumType.getName());
        assertEquals("BP - Security Definition Update Report", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}