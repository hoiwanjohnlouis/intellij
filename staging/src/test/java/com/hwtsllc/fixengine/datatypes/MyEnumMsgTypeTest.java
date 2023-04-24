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

package com.hwtsllc.fixengine.datatypes;

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
        assertEquals("HEARTBEAT", enumType.toFIXNameString());
        assertEquals("0 - Heartbeat", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TEST_REQUEST;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("TEST_REQUEST", enumType.toFIXNameString());
        assertEquals("1 - Test Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.RESEND_REQUEST;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("RESEND_REQUEST", enumType.toFIXNameString());
        assertEquals("2 - Resend Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.REJECT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("REJECT", enumType.toFIXNameString());
        assertEquals("3 - Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SEQUENCE_RESET;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("SEQUENCE_RESET", enumType.toFIXNameString());
        assertEquals("4 - Sequence Reset", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.LOGOUT;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("LOGOUT", enumType.toFIXNameString());
        assertEquals("5 - Logout", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.INDICATION_OF_INTEREST;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("INDICATION_OF_INTEREST", enumType.toFIXNameString());
        assertEquals("6 - Indication of Interest", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ADVERTISEMENT;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("ADVERTISEMENT", enumType.toFIXNameString());
        assertEquals("7 - Advertisement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.EXECUTION_REPORT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("EXECUTION_REPORT", enumType.toFIXNameString());
        assertEquals("8 - Execution Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ORDER_CANCEL_REJECT;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("ORDER_CANCEL_REJECT", enumType.toFIXNameString());
        assertEquals("9 - Order Cancel Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         *  A-Z, msg types, skipping "I", and "O"
         */
        enumType = MyEnumMsgType.LOGON;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("LOGON", enumType.toFIXNameString());
        assertEquals("A - Logon", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NEWS;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("NEWS", enumType.toFIXNameString());
        assertEquals("B - News", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.EMAIL;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("EMAIL", enumType.toFIXNameString());
        assertEquals("C - Email", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_SINGLE;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_SINGLE", enumType.toFIXNameString());
        assertEquals("D - New Order - Single", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_LIST;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_LIST", enumType.toFIXNameString());
        assertEquals("E - New Order - List", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.ORDER_CANCEL_REQUEST;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("ORDER_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("F - Order Cancel Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ORDER_MODIFICATION;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("ORDER_MODIFICATION", enumType.toFIXNameString());
        assertEquals("G - Order Modification Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ORDER_STATUS_REQUEST;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("ORDER_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("H - Order Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION", enumType.toFIXNameString());
        assertEquals("J - Allocation Instruction", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.LIST_CANCEL_REQUEST;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("LIST_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("K - List Cancel Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.LIST_EXECUTE;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LIST_EXECUTE", enumType.toFIXNameString());
        assertEquals("L - List Execute", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.LIST_STATUS_REQUEST;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("LIST_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("M - List Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.LIST_STATUS;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("LIST_STATUS", enumType.toFIXNameString());
        assertEquals("N - List Status", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION_ACK", enumType.toFIXNameString());
        assertEquals("P - Allocation Instruction Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.DONT_KNOW_TRADE;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("DONT_KNOW_TRADE", enumType.toFIXNameString());
        assertEquals("Q - Don't Know Trade (DK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.QUOTE_REQUEST;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("QUOTE_REQUEST", enumType.toFIXNameString());
        assertEquals("R - Quote Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.QUOTE;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("QUOTE", enumType.toFIXNameString());
        assertEquals("S - Quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTIONS;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("SETTLEMENT_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("T - Settlement Instructions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST;
        assertEquals("V", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REQUEST", enumType.toFIXNameString());
        assertEquals("V - Market Data Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REFRESH;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REFRESH", enumType.toFIXNameString());
        assertEquals("W - Market Data - Snapshot/Full Refresh", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_INCREMENTAL_REFRESH", enumType.toFIXNameString());
        assertEquals("X - Market Data - Incremental Refresh", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MARKET_DATA_REQUEST_REJECT;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_REQUEST_REJECT", enumType.toFIXNameString());
        assertEquals("Y - Market Data Request Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.QUOTE_CANCEL;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("QUOTE_CANCEL", enumType.toFIXNameString());
        assertEquals("Z - Quote Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         *  a-z, msg types
         */
        enumType = MyEnumMsgType.QUOTE_STATUS_REQUEST;
        assertEquals("a", enumType.toFIXIDString());
        assertEquals("QUOTE_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("a - Quote Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT;
        assertEquals("b", enumType.toFIXIDString());
        assertEquals("MASS_QUOTE_ACKNOWLEDGEMENT", enumType.toFIXNameString());
        assertEquals("b - Mass Quote Acknowledgement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_DEFINITION_REQUEST;
        assertEquals("c", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION_REQUEST", enumType.toFIXNameString());
        assertEquals("c - Security Definition Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_DEFINITION;
        assertEquals("d", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION", enumType.toFIXNameString());
        assertEquals("d - Security Definition", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_STATUS_REQUEST;
        assertEquals("e", enumType.toFIXIDString());
        assertEquals("SECURITY_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("e - Security Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.SECURITY_STATUS;
        assertEquals("f", enumType.toFIXIDString());
        assertEquals("SECURITY_STATUS", enumType.toFIXNameString());
        assertEquals("f - Security Status", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST;
        assertEquals("g", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("g - Trading Session Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_STATUS;
        assertEquals("h", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_STATUS", enumType.toFIXNameString());
        assertEquals("h - Trading Session Status", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MASS_QUOTE;
        assertEquals("i", enumType.toFIXIDString());
        assertEquals("MASS_QUOTE", enumType.toFIXNameString());
        assertEquals("i - Mass Quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.BUSINESS_MESSAGE_REJECT;
        assertEquals("j", enumType.toFIXIDString());
        assertEquals("BUSINESS_MESSAGE_REJECT", enumType.toFIXNameString());
        assertEquals("j - Business Message Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.BID_REQUEST;
        assertEquals("k", enumType.toFIXIDString());
        assertEquals("BID_REQUEST", enumType.toFIXNameString());
        assertEquals("k - Bid Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.BID_RESPONSE;
        assertEquals("l", enumType.toFIXIDString());
        assertEquals("BID_RESPONSE", enumType.toFIXNameString());
        assertEquals("l - Bid Response (lowercase L)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.LIST_STRIKE_PRICE;
        assertEquals("m", enumType.toFIXIDString());
        assertEquals("LIST_STRIKE_PRICE", enumType.toFIXNameString());
        assertEquals("m - List Strike Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.XML_MESSAGE;
        assertEquals("n", enumType.toFIXIDString());
        assertEquals("XML_MESSAGE", enumType.toFIXNameString());
        assertEquals("n - XML message (e.g. non FIX Msg Type)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS;
        assertEquals("o", enumType.toFIXIDString());
        assertEquals("REGISTRATION_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("o - Registration Instructions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE;
        assertEquals("p", enumType.toFIXIDString());
        assertEquals("REGISTRATION_INSTRUCTIONS_RESPONSE", enumType.toFIXNameString());
        assertEquals("p - Registration Instructions Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST;
        assertEquals("q", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("q - Order Mass Cancel Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ORDER_MASS_CANCEL_REPORT;
        assertEquals("r", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_CANCEL_REPORT", enumType.toFIXNameString());
        assertEquals("r - Order Mass Cancel Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_CROSS;
        assertEquals("s", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_CROSS", enumType.toFIXNameString());
        assertEquals("s - New Order - Cross", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST;
        assertEquals("t", enumType.toFIXIDString());
        assertEquals("CROSS_ORDER_MODIFICATION_REQUEST", enumType.toFIXNameString());
        assertEquals("t - Cross Order Modification Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST;
        assertEquals("u", enumType.toFIXIDString());
        assertEquals("CROSS_ORDER_CANCEL_REQUEST", enumType.toFIXNameString());
        assertEquals("u - Cross Order Cancel Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_TYPE_REQUEST;
        assertEquals("v", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPE_REQUEST", enumType.toFIXNameString());
        assertEquals("v - Security Type Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_TYPES;
        assertEquals("w", enumType.toFIXIDString());
        assertEquals("SECURITY_TYPES", enumType.toFIXNameString());
        assertEquals("w - Security Types", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_LIST_REQUEST;
        assertEquals("x", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST_REQUEST", enumType.toFIXNameString());
        assertEquals("x - Security List Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SECURITY_LIST;
        assertEquals("y", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST", enumType.toFIXNameString());
        assertEquals("y - Security List", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST;
        assertEquals("z", enumType.toFIXIDString());
        assertEquals("DERIVATIVE_SECURITY_LIST_REQUEST", enumType.toFIXNameString());
        assertEquals("z - Derivative Security List Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         *  AA-AZ, msg types
         */
        enumType = MyEnumMsgType.DERIVATIVE_SECURITY_LIST;
        assertEquals("AA", enumType.toFIXIDString());
        assertEquals("DERIVATIVE_SECURITY_LIST", enumType.toFIXNameString());
        assertEquals("AA - Derivative Security List", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NEW_ORDER_MULTILEG;
        assertEquals("AB", enumType.toFIXIDString());
        assertEquals("NEW_ORDER_MULTILEG", enumType.toFIXNameString());
        assertEquals("AB - New Order - Multileg", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST;
        assertEquals("AC", enumType.toFIXIDString());
        assertEquals("MULTILEG_ORDER_MODIFICATION_REQUEST", enumType.toFIXNameString());
        assertEquals("AC - Multileg Order Modification Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST;
        assertEquals("AD", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST", enumType.toFIXNameString());
        assertEquals("AD - Trade Capture Report Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT;
        assertEquals("AE", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT", enumType.toFIXNameString());
        assertEquals("AE - Trade Capture Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.ORDER_MASS_STATUS_REQUEST;
        assertEquals("AF", enumType.toFIXIDString());
        assertEquals("ORDER_MASS_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("AF - Order Mass Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.QUOTE_REQUEST_REJECT;
        assertEquals("AG", enumType.toFIXIDString());
        assertEquals("QUOTE_REQUEST_REJECT", enumType.toFIXNameString());
        assertEquals("AG - Quote Request Reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.RFQ_REQUEST;
        assertEquals("AH", enumType.toFIXIDString());
        assertEquals("RFQ_REQUEST", enumType.toFIXNameString());
        assertEquals("AH - RFQ Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.QUOTE_STATUS_REPORT;
        assertEquals("AI", enumType.toFIXIDString());
        assertEquals("QUOTE_STATUS_REPORT", enumType.toFIXNameString());
        assertEquals("AI - Quote Status Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.QUOTE_RESPONSE;
        assertEquals("AJ", enumType.toFIXIDString());
        assertEquals("QUOTE_RESPONSE", enumType.toFIXNameString());
        assertEquals("AJ - Quote Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.CONFIRMATION;
        assertEquals("AK", enumType.toFIXIDString());
        assertEquals("CONFIRMATION", enumType.toFIXNameString());
        assertEquals("AK - Confirmation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REQUEST;
        assertEquals("AL", enumType.toFIXIDString());
        assertEquals("POSITION_MAINTENANCE_REQUEST", enumType.toFIXNameString());
        assertEquals("AL - Position Maintenance Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.POSITION_MAINTENANCE_REPORT;
        assertEquals("AM", enumType.toFIXIDString());
        assertEquals("POSITION_MAINTENANCE_REPORT", enumType.toFIXNameString());
        assertEquals("AM - Position Maintenance Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS;
        assertEquals("AN", enumType.toFIXIDString());
        assertEquals("REQUEST_FOR_POSITIONS", enumType.toFIXNameString());
        assertEquals("AN - Request For Positions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK;
        assertEquals("AO", enumType.toFIXIDString());
        assertEquals("REQUEST_FOR_POSITIONS_ACK", enumType.toFIXNameString());
        assertEquals("AO - Request For Positions Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.POSITION_REPORT;
        assertEquals("AP", enumType.toFIXIDString());
        assertEquals("POSITION_REPORT", enumType.toFIXNameString());
        assertEquals("AP - Position Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK;
        assertEquals("AQ", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_REQUEST_ACK", enumType.toFIXNameString());
        assertEquals("AQ - Trade Capture Report Request Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK;
        assertEquals("AR", enumType.toFIXIDString());
        assertEquals("TRADE_CAPTURE_REPORT_ACK", enumType.toFIXNameString());
        assertEquals("AR - Trade Capture Report Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM;
        assertEquals("AS", enumType.toFIXIDString());
        assertEquals("ALLOCATION_CLAIM", enumType.toFIXNameString());
        assertEquals("AS - Allocation Claim", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_CLAIM_ACK;
        assertEquals("AT", enumType.toFIXIDString());
        assertEquals("ALLOCATION_CLAIM_ACK", enumType.toFIXNameString());
        assertEquals("AT - Allocation Claim Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.AFFIRMATION;
        assertEquals("AU", enumType.toFIXIDString());
        assertEquals("AFFIRMATION", enumType.toFIXNameString());
        assertEquals("AU - Affirmation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST;
        assertEquals("AV", enumType.toFIXIDString());
        assertEquals("SETTLEMENT_INSTRUCTION_REQUEST", enumType.toFIXNameString());
        assertEquals("AV - Settlement Instruction Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ASSIGNMENT_REPORT;
        assertEquals("AW", enumType.toFIXIDString());
        assertEquals("ASSIGNMENT_REPORT", enumType.toFIXNameString());
        assertEquals("AW - Assignment Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_REQUEST;
        assertEquals("AX", enumType.toFIXIDString());
        assertEquals("COLLATERAL_REQUEST", enumType.toFIXNameString());
        assertEquals("AX - Collateral Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_ASSIGNMENT;
        assertEquals("AY", enumType.toFIXIDString());
        assertEquals("COLLATERAL_ASSIGNMENT", enumType.toFIXNameString());
        assertEquals("AY - Collateral Assignment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.COLLATERAL_RESPONSE;
        assertEquals("AZ", enumType.toFIXIDString());
        assertEquals("COLLATERAL_RESPONSE", enumType.toFIXNameString());
        assertEquals("AZ - Collateral Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         *  BA-BP, msg types
         */
        enumType = MyEnumMsgType.COLLATERAL_REPORT;
        assertEquals("BA", enumType.toFIXIDString());
        assertEquals("COLLATERAL_REPORT", enumType.toFIXNameString());
        assertEquals("BA - Collateral Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY;
        assertEquals("BB", enumType.toFIXIDString());
        assertEquals("COLLATERAL_INQUIRY", enumType.toFIXNameString());
        assertEquals("BB - Collateral Inquiry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST;
        assertEquals("BC", enumType.toFIXIDString());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", enumType.toFIXNameString());
        assertEquals("BC - Network Counterparty System Status Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE;
        assertEquals("BD", enumType.toFIXIDString());
        assertEquals("NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", enumType.toFIXNameString());
        assertEquals("BD - Network Counterparty System Status Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.USER_REQUEST;
        assertEquals("BE", enumType.toFIXIDString());
        assertEquals("USER_REQUEST", enumType.toFIXNameString());
        assertEquals("BE - User Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.USER_RESPONSE;
        assertEquals("BF", enumType.toFIXIDString());
        assertEquals("USER_RESPONSE", enumType.toFIXNameString());
        assertEquals("BF - User Response", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.COLLATERAL_INQUIRY_ACK;
        assertEquals("BG", enumType.toFIXIDString());
        assertEquals("COLLATERAL_INQUIRY_ACK", enumType.toFIXNameString());
        assertEquals("BG - Collateral Inquiry Ack", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.CONFIRMATION_REQUEST;
        assertEquals("BH", enumType.toFIXIDString());
        assertEquals("CONFIRMATION_REQUEST", enumType.toFIXNameString());
        assertEquals("BH - Confirmation Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST_REQUEST;
        assertEquals("BI", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_LIST_REQUEST", enumType.toFIXNameString());
        assertEquals("BI - Trading Session List Request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.TRADING_SESSION_LIST;
        assertEquals("BJ", enumType.toFIXIDString());
        assertEquals("TRADING_SESSION_LIST", enumType.toFIXNameString());
        assertEquals("BJ - Trading Session List", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT;
        assertEquals("BK", enumType.toFIXIDString());
        assertEquals("SECURITY_LIST_UPDATE_REPORT", enumType.toFIXNameString());
        assertEquals("BK - Security List Update Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ADJUSTED_POSITION_REPORT;
        assertEquals("BL", enumType.toFIXIDString());
        assertEquals("ADJUSTED_POSITION_REPORT", enumType.toFIXNameString());
        assertEquals("BL - Adjusted Position Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT;
        assertEquals("BM", enumType.toFIXIDString());
        assertEquals("ALLOCATION_INSTRUCTION_ALERT", enumType.toFIXNameString());
        assertEquals("BM - Allocation Instruction Alert", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT;
        assertEquals("BN", enumType.toFIXIDString());
        assertEquals("EXECUTION_ACKNOWLEDGEMENT", enumType.toFIXNameString());
        assertEquals("BN - Execution Acknowledgement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumMsgType.CONTRARY_INTENTION_REPORT;
        assertEquals("BO", enumType.toFIXIDString());
        assertEquals("CONTRARY_INTENTION_REPORT", enumType.toFIXNameString());
        assertEquals("BO - Contrary Intention Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT;
        assertEquals("BP", enumType.toFIXIDString());
        assertEquals("SECURITY_DEFINITION_UPDATE_REPORT", enumType.toFIXNameString());
        assertEquals("BP - Security Definition Update Report", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}