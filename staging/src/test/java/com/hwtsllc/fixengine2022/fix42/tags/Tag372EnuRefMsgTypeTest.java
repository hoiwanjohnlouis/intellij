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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
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
class Tag372EnuRefMsgTypeTest {
    @Test
    void FIX0372Test() {
        FIX42 fixData = FIX42.FIX372_ENU_REF_MSG_TYPE;
        assertEquals( "372", fixData.toEnumIDString());
        assertEquals( "REF_MSG_TYPE", fixData.toEnumNameString());
        assertEquals( "RefMsgType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0372Test() {
        Tag372EnuRefMsgType tagData;


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
        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.HEARTBEAT);
        assertEquals( MyEnumMsgType.HEARTBEAT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TEST_REQUEST);
        assertEquals( MyEnumMsgType.TEST_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.RESEND_REQUEST);
        assertEquals( MyEnumMsgType.RESEND_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.REJECT);
        assertEquals( MyEnumMsgType.REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SEQUENCE_RESET);
        assertEquals( MyEnumMsgType.SEQUENCE_RESET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LOGOUT);
        assertEquals( MyEnumMsgType.LOGOUT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.INDICATION_OF_INTEREST);
        assertEquals( MyEnumMsgType.INDICATION_OF_INTEREST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ADVERTISEMENT);
        assertEquals( MyEnumMsgType.ADVERTISEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.EXECUTION_REPORT);
        assertEquals( MyEnumMsgType.EXECUTION_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_CANCEL_REJECT);
        assertEquals( MyEnumMsgType.ORDER_CANCEL_REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * A-Z msg types, skipping "I", and "O"
         */
        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LOGON);
        assertEquals( MyEnumMsgType.LOGON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NEWS);
        assertEquals( MyEnumMsgType.NEWS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.EMAIL);
        assertEquals( MyEnumMsgType.EMAIL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NEW_ORDER_SINGLE);
        assertEquals( MyEnumMsgType.NEW_ORDER_SINGLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NEW_ORDER_LIST);
        assertEquals( MyEnumMsgType.NEW_ORDER_LIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_CANCEL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_MODIFICATION);
        assertEquals( MyEnumMsgType.ORDER_MODIFICATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LIST_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.LIST_CANCEL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LIST_EXECUTE);
        assertEquals( MyEnumMsgType.LIST_EXECUTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LIST_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.LIST_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LIST_STATUS);
        assertEquals( MyEnumMsgType.LIST_STATUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.DONT_KNOW_TRADE);
        assertEquals( MyEnumMsgType.DONT_KNOW_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_REQUEST);
        assertEquals( MyEnumMsgType.QUOTE_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE);
        assertEquals( MyEnumMsgType.QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTIONS);
        assertEquals( MyEnumMsgType.SETTLEMENT_INSTRUCTIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MARKET_DATA_REQUEST);
        assertEquals( MyEnumMsgType.MARKET_DATA_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MARKET_DATA_REFRESH);
        assertEquals( MyEnumMsgType.MARKET_DATA_REFRESH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH);
        assertEquals( MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MARKET_DATA_REQUEST_REJECT);
        assertEquals( MyEnumMsgType.MARKET_DATA_REQUEST_REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_CANCEL);
        assertEquals( MyEnumMsgType.QUOTE_CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * a-z msg types
         */
        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.QUOTE_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT);
        assertEquals( MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_DEFINITION_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_DEFINITION);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_STATUS);
        assertEquals( MyEnumMsgType.SECURITY_STATUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADING_SESSION_STATUS);
        assertEquals( MyEnumMsgType.TRADING_SESSION_STATUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MASS_QUOTE);
        assertEquals( MyEnumMsgType.MASS_QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.BUSINESS_MESSAGE_REJECT);
        assertEquals( MyEnumMsgType.BUSINESS_MESSAGE_REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.BID_REQUEST);
        assertEquals( MyEnumMsgType.BID_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.BID_RESPONSE);
        assertEquals( MyEnumMsgType.BID_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.LIST_STRIKE_PRICE);
        assertEquals( MyEnumMsgType.LIST_STRIKE_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.XML_MESSAGE);
        assertEquals( MyEnumMsgType.XML_MESSAGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS);
        assertEquals( MyEnumMsgType.REGISTRATION_INSTRUCTIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE);
        assertEquals( MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REPORT);
        assertEquals( MyEnumMsgType.ORDER_MASS_CANCEL_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NEW_ORDER_CROSS);
        assertEquals( MyEnumMsgType.NEW_ORDER_CROSS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST);
        assertEquals( MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST);
        assertEquals( MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_TYPE_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_TYPE_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_TYPES);
        assertEquals( MyEnumMsgType.SECURITY_TYPES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.SECURITY_LIST_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_LIST);
        assertEquals( MyEnumMsgType.SECURITY_LIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * AA-AZ msg types
         */
        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NEW_ORDER_MULTILEG);
        assertEquals( MyEnumMsgType.NEW_ORDER_MULTILEG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST);
        assertEquals( MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ORDER_MASS_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.ORDER_MASS_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_REQUEST_REJECT);
        assertEquals( MyEnumMsgType.QUOTE_REQUEST_REJECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.RFQ_REQUEST);
        assertEquals( MyEnumMsgType.RFQ_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_STATUS_REPORT);
        assertEquals( MyEnumMsgType.QUOTE_STATUS_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.QUOTE_RESPONSE);
        assertEquals( MyEnumMsgType.QUOTE_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.CONFIRMATION);
        assertEquals( MyEnumMsgType.CONFIRMATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REQUEST);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REPORT);
        assertEquals( MyEnumMsgType.POSITION_MAINTENANCE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK);
        assertEquals( MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.POSITION_REPORT);
        assertEquals( MyEnumMsgType.POSITION_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK);
        assertEquals( MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ALLOCATION_CLAIM);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ALLOCATION_CLAIM_ACK);
        assertEquals( MyEnumMsgType.ALLOCATION_CLAIM_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.AFFIRMATION);
        assertEquals( MyEnumMsgType.AFFIRMATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST);
        assertEquals( MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ASSIGNMENT_REPORT);
        assertEquals( MyEnumMsgType.ASSIGNMENT_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_REQUEST);
        assertEquals( MyEnumMsgType.COLLATERAL_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_ASSIGNMENT);
        assertEquals( MyEnumMsgType.COLLATERAL_ASSIGNMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_RESPONSE);
        assertEquals( MyEnumMsgType.COLLATERAL_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * BA-BP msg types
         */
        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_REPORT);
        assertEquals( MyEnumMsgType.COLLATERAL_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_INQUIRY);
        assertEquals( MyEnumMsgType.COLLATERAL_INQUIRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST);
        assertEquals( MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE);
        assertEquals( MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.USER_REQUEST);
        assertEquals( MyEnumMsgType.USER_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.USER_RESPONSE);
        assertEquals( MyEnumMsgType.USER_RESPONSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.COLLATERAL_INQUIRY_ACK);
        assertEquals( MyEnumMsgType.COLLATERAL_INQUIRY_ACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.CONFIRMATION_REQUEST);
        assertEquals( MyEnumMsgType.CONFIRMATION_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADING_SESSION_LIST_REQUEST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_LIST_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.TRADING_SESSION_LIST);
        assertEquals( MyEnumMsgType.TRADING_SESSION_LIST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT);
        assertEquals( MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ADJUSTED_POSITION_REPORT);
        assertEquals( MyEnumMsgType.ADJUSTED_POSITION_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT);
        assertEquals( MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT);
        assertEquals( MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.CONTRARY_INTENTION_REPORT);
        assertEquals( MyEnumMsgType.CONTRARY_INTENTION_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag372EnuRefMsgType(MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT);
        assertEquals( MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag372EnuRefMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag372EnuRefMsgType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag372EnuRefMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag372EnuRefMsgType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag372EnuRefMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag372EnuRefMsgType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag372EnuRefMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag372EnuRefMsgType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag372EnuRefMsgType tagData;

        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag372EnuRefMsgType(oneEnum);
            assertEquals( "Tag372EnuRefMsgType\n" +
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