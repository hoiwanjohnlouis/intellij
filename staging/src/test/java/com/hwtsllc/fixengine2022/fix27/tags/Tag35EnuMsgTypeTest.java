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

import com.hwtsllc.fixengine2022.datatypes.MyEnumMsgType;
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
class Tag35EnuMsgTypeTest {
    @Test
    void Tag0035Test() {
        Tag35EnuMsgType tagData;

        /*
         *  Information is the same for TAGS 35, 372
         */

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
        tagData = new Tag35EnuMsgType(MyEnumMsgType.HEARTBEAT);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TEST_REQUEST);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RESEND_REQUEST);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REJECT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SEQUENCE_RESET);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGOUT);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.INDICATION_OF_INTEREST);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADVERTISEMENT);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_REPORT);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REJECT);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * A-Z msg types, skipping "I", "O", AND "U"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGON);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEWS);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EMAIL);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_SINGLE);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_LIST);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REQUEST);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MODIFICATION);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_STATUS_REQUEST);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_CANCEL_REQUEST);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_EXECUTE);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS_REQUEST);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK);
        assertEquals( "P", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.DONT_KNOW_TRADE);
        assertEquals( "Q", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE);
        assertEquals( "S", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTIONS);
        assertEquals( "T", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST);
        assertEquals( "V", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REFRESH);
        assertEquals( "W", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH);
        assertEquals( "X", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST_REJECT);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_CANCEL);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * a-z msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REQUEST);
        assertEquals( "a", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT);
        assertEquals( "b", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_REQUEST);
        assertEquals( "c", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION);
        assertEquals( "d", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS_REQUEST);
        assertEquals( "e", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS);
        assertEquals( "f", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST);
        assertEquals( "g", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS);
        assertEquals( "h", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE);
        assertEquals( "i", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BUSINESS_MESSAGE_REJECT);
        assertEquals( "j", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_REQUEST);
        assertEquals( "k", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_RESPONSE);
        assertEquals( "l", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STRIKE_PRICE);
        assertEquals( "m", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.XML_MESSAGE);
        assertEquals( "n", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS);
        assertEquals( "o", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE);
        assertEquals( "p", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST);
        assertEquals( "q", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REPORT);
        assertEquals( "r", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_CROSS);
        assertEquals( "s", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST);
        assertEquals( "t", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST);
        assertEquals( "u", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPE_REQUEST);
        assertEquals( "v", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPES);
        assertEquals( "w", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_REQUEST);
        assertEquals( "x", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST);
        assertEquals( "y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "z", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * AA-AZ msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_MULTILEG);
        assertEquals( MyEnumMsgType.NEW_ORDER_MULTILEG.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AB", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST);
        assertEquals( MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_MASS_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AF", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST_REJECT);
        assertEquals( MyEnumMsgType.QUOTE_REQUEST_REJECT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AG", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RFQ_REQUEST);
        assertEquals( MyEnumMsgType.RFQ_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REPORT);
        assertEquals( MyEnumMsgType.QUOTE_STATUS_REPORT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AI", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_RESPONSE);
        assertEquals( MyEnumMsgType.QUOTE_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AJ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION);
        assertEquals( MyEnumMsgType.CONFIRMATION.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AK", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REQUEST);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AL", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REPORT);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AN", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AO", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_REPORT);
        assertEquals( MyEnumMsgType.POSITION_REPORT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AQ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AS", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM_ACK);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM_ACK.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.AFFIRMATION);
        assertEquals( MyEnumMsgType.AFFIRMATION.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AU", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST);
        assertEquals( MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AV", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ASSIGNMENT_REPORT);
        assertEquals( MyEnumMsgType.ASSIGNMENT_REPORT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AW", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REQUEST);
        assertEquals( MyEnumMsgType.COLLATERAL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AX", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_ASSIGNMENT);
        assertEquals( MyEnumMsgType.COLLATERAL_ASSIGNMENT.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AY", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_RESPONSE);
        assertEquals( MyEnumMsgType.COLLATERAL_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertEquals( "AZ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * BA-BP msg types
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REPORT);
        assertEquals( "BA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY);
        assertEquals( "BB", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST);
        assertEquals( "BC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE);
        assertEquals( "BD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_REQUEST);
        assertEquals( "BE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_RESPONSE);
        assertEquals( "BF", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY_ACK);
        assertEquals( "BG", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION_REQUEST);
        assertEquals( "BH", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST_REQUEST);
        assertEquals( "BI", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST);
        assertEquals( "BJ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT);
        assertEquals( "BK", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADJUSTED_POSITION_REPORT);
        assertEquals( "BL", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT);
        assertEquals( "BM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT);
        assertEquals( "BN", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONTRARY_INTENTION_REPORT);
        assertEquals( "BO", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT);
        assertEquals( "BP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( "FIX35_ENU_MSG_TYPE", tagData.toEnumLabelString());
            assertEquals( "MSG_TYPE", tagData.toEnumNameString());
            assertEquals( "35", tagData.toEnumIDString());
            assertEquals( "MsgType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void PrintFIXTagTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag35EnuMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( "Tag35EnuMsgType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}