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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
 *  <p>    "0 - Heartbeat"
 *  <p>    "1 - Test Request"
 *  <p>    "2 - Resend Request"
 *  <p>    "3 - Reject"
 *  <p>    "4 - Sequence Reset"
 *  <p></p>
 *  <p>    "5 - Logout"
 *  <p>    "6 - Indication of Interest"
 *  <p>    "7 - Advertisement"
 *  <p>    "8 - Execution Report"
 *  <p>    "9 - Order Cancel Reject"
 *  <p></p>
 *  <p>    A-Z msg types, skipping "I", and "O"
 *  <p>    "A - Logon"
 *  <p>    "B - News"
 *  <p>    "C - Email"
 *  <p>    "D - New Order - Single"
 *  <p>    "E - New Order - List"
 *  <p></p>
 *  <p>    "F - Order Cancel Request"
 *  <p>    "G - Order Modification Request"
 *  <p>    "H - Order Status Request"
 *  <p>    "J - Allocation Instruction"
 *  <p>    "K - List Cancel Request"
 *  <p></p>
 *  <p>    "L - List Execute"
 *  <p>    "M - List Status Request"
 *  <p>    "N - List Status"
 *  <p>    "P - Allocation Instruction Ack"
 *  <p>    "Q - Don't Know Trade (DK)"
 *  <p></p>
 *  <p>    "R - Quote Request"
 *  <p>    "S - Quote"
 *  <p>    "T - Settlement Instructions"
 *  <p>    "V - Market Data Request"
 *  <p>    "W - Market Data - Snapshot/Full Refresh"
 *  <p></p>
 *  <p>    "X - Market Data - Incremental Refresh"
 *  <p>    "Y - Market Data Request Reject"
 *  <p>    "Z - Quote Cancel"
 *  <p></p>
 *  <p>    a-z msg types
 *  <p>    "a - Quote Status Request"
 *  <p>    "b - Mass Quote Acknowledgement"
 *  <p>    "c - Security Definition Request"
 *  <p>    "d - Security Definition"
 *  <p>    "e - Security Status Request"
 *  <p></p>
 *  <p>    "f - Security Status"
 *  <p>    "g - Trading Session Status Request"
 *  <p>    "h - Trading Session Status"
 *  <p>    "i - Mass Quote"
 *  <p>    "j - Business Message Reject"
 *  <p></p>
 *  <p>    "k - Bid Request"
 *  <p>    "l - Bid Response (lowercase L)"
 *  <p>    "m - List Strike Price"
 *  <p>    "n - XML message (e.g. non FIX Msg Type)"
 *  <p>    "o - Registration Instructions"
 *  <p></p>
 *  <p>    "p - Registration Instructions Response"
 *  <p>    "q - Order Mass Cancel Request"
 *  <p>    "r - Order Mass Cancel Report"
 *  <p>    "s - New Order - Cross"
 *  <p>    "t - Cross Order Modification Request"
 *  <p></p>
 *  <p>    "u - Cross Order Cancel Request"
 *  <p>    "v - Security Type Request"
 *  <p>    "w - Security Types"
 *  <p>    "x - Security List Request"
 *  <p>    "y - Security List"
 *  <p></p>
 *  <p>    "z - Derivative Security List Request"
 *  <p></p>
 *  <p>    AA-AZ msg types
 *  <p>    "AA - Derivative Security List"
 *  <p>    "AB - New Order - Multileg"
 *  <p>    "AC - Multileg Order Modification Request"
 *  <p>    "AD - Trade Capture Report Request"
 *  <p>    "AE - Trade Capture Report"
 *  <p></p>
 *  <p>    "AF - Order Mass Status Request"
 *  <p>    "AG - Quote Request Reject"
 *  <p>    "AH - RFQ Request"
 *  <p>    "AI - Quote Status Report"
 *  <p>    "AJ - Quote Response"
 *  <p></p>
 *  <p>    "AK - Confirmation"
 *  <p>    "AL - Position Maintenance Request"
 *  <p>    "AM - Position Maintenance Report"
 *  <p>    "AN - Request For Positions"
 *  <p>    "AO - Request For Positions Ack"
 *  <p></p>
 *  <p>    "AP - Position Report"
 *  <p>    "AQ - Trade Capture Report Request Ack"
 *  <p>    "AR - Trade Capture Report Ack"
 *  <p>    "AS - Allocation Claim"
 *  <p>    "AT - Allocation Claim Ack"
 *  <p></p>
 *  <p>    "AU - Affirmation"
 *  <p>    "AV - Settlement Instruction Request"
 *  <p>    "AW - Assignment Report"
 *  <p>    "AX - Collateral Request"
 *  <p>    "AY - Collateral Assignment"
 *  <p></p>
 *  <p>    "AZ - Collateral Response"
 *  <p></p>
 *  <p>    BA-BP msg types
 *  <p>    "BA - Collateral Report"
 *  <p>    "BB - Collateral Inquiry"
 *  <p>    "BC - Network Counterparty System Status Request"
 *  <p>    "BD - Network Counterparty System Status Response"
 *  <p>    "BE - User Request"
 *  <p></p>
 *  <p>    "BF - User Response"
 *  <p>    "BG - Collateral Inquiry Ack"
 *  <p>    "BH - Confirmation Request"
 *  <p>    "BI - Trading Session List Request"
 *  <p>    "BJ - Trading Session List"
 *  <p></p>
 *  <p>    "BK - Security List Update Report"
 *  <p>    "BL - Adjusted Position Report"
 *  <p>    "BM - Allocation Instruction Alert"
 *  <p>    "BN - Execution Acknowledgement"
 *  <p>    "BO - Contrary Intention Report"
 *  <p></p>
 *  <p>    "BP - Security Definition Update Report"
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
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("HEARTBEAT", enumType.toEnumNameString());
        assertEquals("0 - Heartbeat", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TEST_REQUEST;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("TEST_REQUEST", enumType.toEnumNameString());
        assertEquals("1 - Test Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.RESEND_REQUEST;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("RESEND_REQUEST", enumType.toEnumNameString());
        assertEquals("2 - Resend Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.REJECT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("REJECT", enumType.toEnumNameString());
        assertEquals("3 - Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SEQUENCE_RESET;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("SEQUENCE_RESET", enumType.toEnumNameString());
        assertEquals("4 - Sequence Reset", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.LOGOUT;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("LOGOUT", enumType.toEnumNameString());
        assertEquals("5 - Logout", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.INDICATION_OF_INTEREST;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("INDICATION_OF_INTEREST", enumType.toEnumNameString());
        assertEquals("6 - Indication of Interest", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ADVERTISEMENT;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("ADVERTISEMENT", enumType.toEnumNameString());
        assertEquals("7 - Advertisement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.EXECUTION_REPORT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("EXECUTION_REPORT", enumType.toEnumNameString());
        assertEquals("8 - Execution Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ORDER_CANCEL_REJECT;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ORDER_CANCEL_REJECT", enumType.toEnumNameString());
        assertEquals("9 - Order Cancel Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         *  A-Z, msg types, skipping "I", and "O"
         */
        enumType = MyEnumMsgType.LOGON;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("LOGON", enumType.toEnumNameString());
        assertEquals("A - Logon", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NEWS;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("NEWS", enumType.toEnumNameString());
        assertEquals("B - News", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.EMAIL;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("EMAIL", enumType.toEnumNameString());
        assertEquals("C - Email", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_SINGLE;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_SINGLE", enumType.toEnumNameString());
        assertEquals("D - New Order - Single", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_LIST;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_LIST", enumType.toEnumNameString());
        assertEquals("E - New Order - List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.ORDER_CANCEL_REQUEST;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.toEnumNameString());
        assertEquals("F - Order Cancel Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ORDER_MODIFICATION;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("ORDER_MODIFICATION", enumType.toEnumNameString());
        assertEquals("G - Order Modification Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ORDER_STATUS_REQUEST;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("ORDER_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("H - Order Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION", enumType.toEnumNameString());
        assertEquals("J - Allocation Instruction", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.LIST_CANCEL_REQUEST;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("LIST_CANCEL_REQUEST", enumType.toEnumNameString());
        assertEquals("K - List Cancel Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.LIST_EXECUTE;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LIST_EXECUTE", enumType.toEnumNameString());
        assertEquals("L - List Execute", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.LIST_STATUS_REQUEST;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("LIST_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("M - List Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.LIST_STATUS;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("LIST_STATUS", enumType.toEnumNameString());
        assertEquals("N - List Status", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION_ACK", enumType.toEnumNameString());
        assertEquals("P - Allocation Instruction Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.DONT_KNOW_TRADE;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("DONT_KNOW_TRADE", enumType.toEnumNameString());
        assertEquals("Q - Don't Know Trade (DK)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.QUOTE_REQUEST;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("QUOTE_REQUEST", enumType.toEnumNameString());
        assertEquals("R - Quote Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.QUOTE;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("QUOTE", enumType.toEnumNameString());
        assertEquals("S - Quote", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTIONS;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("SETTLEMENT_INSTRUCTIONS", enumType.toEnumNameString());
        assertEquals("T - Settlement Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST;
        assertEquals("V", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REQUEST", enumType.toEnumNameString());
        assertEquals("V - Market Data Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REFRESH;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REFRESH", enumType.toEnumNameString());
        assertEquals("W - Market Data - Snapshot/Full Refresh", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_INCREMENTAL_REFRESH", enumType.toEnumNameString());
        assertEquals("X - Market Data - Incremental Refresh", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST_REJECT;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REQUEST_REJECT", enumType.toEnumNameString());
        assertEquals("Y - Market Data Request Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.QUOTE_CANCEL;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("QUOTE_CANCEL", enumType.toEnumNameString());
        assertEquals("Z - Quote Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         *  a-z, msg types
         */
        enumType = MyEnumMsgType.QUOTE_STATUS_REQUEST;
        assertEquals("a", enumType.toFIXIDString());
        assertEquals("QUOTE_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("a - Quote Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT;
        assertEquals("b", enumType.toFIXIDString());
        assertEquals("MASS_QUOTE_ACKNOWLEDGEMENT", enumType.toEnumNameString());
        assertEquals("b - Mass Quote Acknowledgement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_DEFINITION_REQUEST;
        assertEquals("c", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION_REQUEST", enumType.toEnumNameString());
        assertEquals("c - Security Definition Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_DEFINITION;
        assertEquals("d", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION", enumType.toEnumNameString());
        assertEquals("d - Security Definition", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_STATUS_REQUEST;
        assertEquals("e", enumType.toFIXIDString());
        assertEquals("SECURITY_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("e - Security Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.SECURITY_STATUS;
        assertEquals("f", enumType.toFIXIDString());
        assertEquals("SECURITY_STATUS", enumType.toEnumNameString());
        assertEquals("f - Security Status", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST;
        assertEquals("g", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("g - Trading Session Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS;
        assertEquals("h", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_STATUS", enumType.toEnumNameString());
        assertEquals("h - Trading Session Status", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MASS_QUOTE;
        assertEquals("i", enumType.toFIXIDString());
        assertEquals("MASS_QUOTE", enumType.toEnumNameString());
        assertEquals("i - Mass Quote", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.BUSINESS_MESSAGE_REJECT;
        assertEquals("j", enumType.toFIXIDString());
        assertEquals("BUSINESS_MESSAGE_REJECT", enumType.toEnumNameString());
        assertEquals("j - Business Message Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.BID_REQUEST;
        assertEquals("k", enumType.toFIXIDString());
        assertEquals("BID_REQUEST", enumType.toEnumNameString());
        assertEquals("k - Bid Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.BID_RESPONSE;
        assertEquals("l", enumType.toFIXIDString());
        assertEquals("BID_RESPONSE", enumType.toEnumNameString());
        assertEquals("l - Bid Response (lowercase L)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.LIST_STRIKE_PRICE;
        assertEquals("m", enumType.toFIXIDString());
        assertEquals("LIST_STRIKE_PRICE", enumType.toEnumNameString());
        assertEquals("m - List Strike Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.XML_MESSAGE;
        assertEquals("n", enumType.toFIXIDString());
        assertEquals("XML_MESSAGE", enumType.toEnumNameString());
        assertEquals("n - XML message (e.g. non FIX Msg Type)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS;
        assertEquals("o", enumType.toFIXIDString());
        assertEquals("REGISTRATION_INSTRUCTIONS", enumType.toEnumNameString());
        assertEquals("o - Registration Instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE;
        assertEquals("p", enumType.toFIXIDString());
        assertEquals("REGISTRATION_INSTRUCTIONS_RESPONSE", enumType.toEnumNameString());
        assertEquals("p - Registration Instructions Response", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST;
        assertEquals("q", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_CANCEL_REQUEST", enumType.toEnumNameString());
        assertEquals("q - Order Mass Cancel Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REPORT;
        assertEquals("r", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_CANCEL_REPORT", enumType.toEnumNameString());
        assertEquals("r - Order Mass Cancel Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_CROSS;
        assertEquals("s", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_CROSS", enumType.toEnumNameString());
        assertEquals("s - New Order - Cross", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST;
        assertEquals("t", enumType.toFIXIDString());
        assertEquals("CROSS_ORDER_MODIFICATION_REQUEST", enumType.toEnumNameString());
        assertEquals("t - Cross Order Modification Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST;
        assertEquals("u", enumType.toFIXIDString());
        assertEquals("CROSS_ORDER_CANCEL_REQUEST", enumType.toEnumNameString());
        assertEquals("u - Cross Order Cancel Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_TYPE_REQUEST;
        assertEquals("v", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPE_REQUEST", enumType.toEnumNameString());
        assertEquals("v - Security Type Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_TYPES;
        assertEquals("w", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPES", enumType.toEnumNameString());
        assertEquals("w - Security Types", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_LIST_REQUEST;
        assertEquals("x", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST_REQUEST", enumType.toEnumNameString());
        assertEquals("x - Security List Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SECURITY_LIST;
        assertEquals("y", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST", enumType.toEnumNameString());
        assertEquals("y - Security List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST;
        assertEquals("z", enumType.toFIXIDString());
        assertEquals("DERIVATIVE_SECURITY_LIST_REQUEST", enumType.toEnumNameString());
        assertEquals("z - Derivative Security List Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         *  AA-AZ, msg types
         */
        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST;
        assertEquals("AA", enumType.toFIXIDString());
        assertEquals("DERIVATIVE_SECURITY_LIST", enumType.toEnumNameString());
        assertEquals("AA - Derivative Security List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_MULTILEG;
        assertEquals("AB", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_MULTILEG", enumType.toEnumNameString());
        assertEquals("AB - New Order - Multileg", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST;
        assertEquals("AC", enumType.toFIXIDString());
        assertEquals("MULTILEG_ORDER_MODIFICATION_REQUEST", enumType.toEnumNameString());
        assertEquals("AC - Multileg Order Modification Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST;
        assertEquals("AD", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST", enumType.toEnumNameString());
        assertEquals("AD - Trade Capture Report Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT;
        assertEquals("AE", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT", enumType.toEnumNameString());
        assertEquals("AE - Trade Capture Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.ORDER_MASS_STATUS_REQUEST;
        assertEquals("AF", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("AF - Order Mass Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.QUOTE_REQUEST_REJECT;
        assertEquals("AG", enumType.toFIXIDString());
        assertEquals("QUOTE_REQUEST_REJECT", enumType.toEnumNameString());
        assertEquals("AG - Quote Request Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.RFQ_REQUEST;
        assertEquals("AH", enumType.toFIXIDString());
        assertEquals("RFQ_REQUEST", enumType.toEnumNameString());
        assertEquals("AH - RFQ Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.QUOTE_STATUS_REPORT;
        assertEquals("AI", enumType.toFIXIDString());
        assertEquals("QUOTE_STATUS_REPORT", enumType.toEnumNameString());
        assertEquals("AI - Quote Status Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.QUOTE_RESPONSE;
        assertEquals("AJ", enumType.toFIXIDString());
        assertEquals("QUOTE_RESPONSE", enumType.toEnumNameString());
        assertEquals("AJ - Quote Response", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.CONFIRMATION;
        assertEquals("AK", enumType.toFIXIDString());
        assertEquals("CONFIRMATION", enumType.toEnumNameString());
        assertEquals("AK - Confirmation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REQUEST;
        assertEquals("AL", enumType.toFIXIDString());
        assertEquals("POSITION_MAINTENANCE_REQUEST", enumType.toEnumNameString());
        assertEquals("AL - Position Maintenance Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REPORT;
        assertEquals("AM", enumType.toFIXIDString());
        assertEquals("POSITION_MAINTENANCE_REPORT", enumType.toEnumNameString());
        assertEquals("AM - Position Maintenance Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS;
        assertEquals("AN", enumType.toFIXIDString());
        assertEquals("REQUEST_FOR_POSITIONS", enumType.toEnumNameString());
        assertEquals("AN - Request For Positions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK;
        assertEquals("AO", enumType.toFIXIDString());
        assertEquals("REQUEST_FOR_POSITIONS_ACK", enumType.toEnumNameString());
        assertEquals("AO - Request For Positions Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.POSITION_REPORT;
        assertEquals("AP", enumType.toFIXIDString());
        assertEquals("POSITION_REPORT", enumType.toEnumNameString());
        assertEquals("AP - Position Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK;
        assertEquals("AQ", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST_ACK", enumType.toEnumNameString());
        assertEquals("AQ - Trade Capture Report Request Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK;
        assertEquals("AR", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_ACK", enumType.toEnumNameString());
        assertEquals("AR - Trade Capture Report Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM;
        assertEquals("AS", enumType.toFIXIDString());
        assertEquals("ALLOCATION_CLAIM", enumType.toEnumNameString());
        assertEquals("AS - Allocation Claim", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM_ACK;
        assertEquals("AT", enumType.toFIXIDString());
        assertEquals("ALLOCATION_CLAIM_ACK", enumType.toEnumNameString());
        assertEquals("AT - Allocation Claim Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.AFFIRMATION;
        assertEquals("AU", enumType.toFIXIDString());
        assertEquals("AFFIRMATION", enumType.toEnumNameString());
        assertEquals("AU - Affirmation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST;
        assertEquals("AV", enumType.toFIXIDString());
        assertEquals("SETTLEMENT_INSTRUCTION_REQUEST", enumType.toEnumNameString());
        assertEquals("AV - Settlement Instruction Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ASSIGNMENT_REPORT;
        assertEquals("AW", enumType.toFIXIDString());
        assertEquals("ASSIGNMENT_REPORT", enumType.toEnumNameString());
        assertEquals("AW - Assignment Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_REQUEST;
        assertEquals("AX", enumType.toFIXIDString());
        assertEquals("COLLATERAL_REQUEST", enumType.toEnumNameString());
        assertEquals("AX - Collateral Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_ASSIGNMENT;
        assertEquals("AY", enumType.toFIXIDString());
        assertEquals("COLLATERAL_ASSIGNMENT", enumType.toEnumNameString());
        assertEquals("AY - Collateral Assignment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.COLLATERAL_RESPONSE;
        assertEquals("AZ", enumType.toFIXIDString());
        assertEquals("COLLATERAL_RESPONSE", enumType.toEnumNameString());
        assertEquals("AZ - Collateral Response", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         *  BA-BP, msg types
         */
        enumType = MyEnumMsgType.COLLATERAL_REPORT;
        assertEquals("BA", enumType.toFIXIDString());
        assertEquals("COLLATERAL_REPORT", enumType.toEnumNameString());
        assertEquals("BA - Collateral Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY;
        assertEquals("BB", enumType.toFIXIDString());
        assertEquals("COLLATERAL_INQUIRY", enumType.toEnumNameString());
        assertEquals("BB - Collateral Inquiry", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST;
        assertEquals("BC", enumType.toFIXIDString());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", enumType.toEnumNameString());
        assertEquals("BC - Network Counterparty System Status Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE;
        assertEquals("BD", enumType.toFIXIDString());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", enumType.toEnumNameString());
        assertEquals("BD - Network Counterparty System Status Response", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.USER_REQUEST;
        assertEquals("BE", enumType.toFIXIDString());
        assertEquals("USER_REQUEST", enumType.toEnumNameString());
        assertEquals("BE - User Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.USER_RESPONSE;
        assertEquals("BF", enumType.toFIXIDString());
        assertEquals("USER_RESPONSE", enumType.toEnumNameString());
        assertEquals("BF - User Response", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY_ACK;
        assertEquals("BG", enumType.toFIXIDString());
        assertEquals("COLLATERAL_INQUIRY_ACK", enumType.toEnumNameString());
        assertEquals("BG - Collateral Inquiry Ack", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.CONFIRMATION_REQUEST;
        assertEquals("BH", enumType.toFIXIDString());
        assertEquals("CONFIRMATION_REQUEST", enumType.toEnumNameString());
        assertEquals("BH - Confirmation Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST_REQUEST;
        assertEquals("BI", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_LIST_REQUEST", enumType.toEnumNameString());
        assertEquals("BI - Trading Session List Request", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST;
        assertEquals("BJ", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_LIST", enumType.toEnumNameString());
        assertEquals("BJ - Trading Session List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT;
        assertEquals("BK", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST_UPDATE_REPORT", enumType.toEnumNameString());
        assertEquals("BK - Security List Update Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ADJUSTED_POSITION_REPORT;
        assertEquals("BL", enumType.toFIXIDString());
        assertEquals("ADJUSTED_POSITION_REPORT", enumType.toEnumNameString());
        assertEquals("BL - Adjusted Position Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT;
        assertEquals("BM", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION_ALERT", enumType.toEnumNameString());
        assertEquals("BM - Allocation Instruction Alert", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT;
        assertEquals("BN", enumType.toFIXIDString());
        assertEquals("EXECUTION_ACKNOWLEDGEMENT", enumType.toEnumNameString());
        assertEquals("BN - Execution Acknowledgement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumMsgType.CONTRARY_INTENTION_REPORT;
        assertEquals("BO", enumType.toFIXIDString());
        assertEquals("CONTRARY_INTENTION_REPORT", enumType.toEnumNameString());
        assertEquals("BO - Contrary Intention Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT;
        assertEquals("BP", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION_UPDATE_REPORT", enumType.toEnumNameString());
        assertEquals("BP - Security Definition Update Report", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}