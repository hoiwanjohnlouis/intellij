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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.MyEnumMsgType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag35EnuMsgTypeTest {
    Tag35EnuMsgType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( "FIX35_ENU_MSG_TYPE", tagData.toFIXLabelString());
            assertEquals( "MSG_TYPE", tagData.toFIXNameString());
            assertEquals( "35", tagData.toFIXIDString());
            assertEquals( "MsgType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  35 (same as TAGS 35, 372)
         *  0-9, msg types
         *  A-Z, msg types, skipping "I", and "O"
         *  a-z, msg types
         *  AA-AZ, msg types
         *  BA-BP, msg types
         */

        /*
         *  <p>    "0 - Heartbeat"
         *  <p>    "1 - Test Request"
         *  <p>    "2 - Resend Request"
         *  <p>    "3 - Reject"
         *  <p>    "4 - Sequence Reset"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.HEARTBEAT);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TEST_REQUEST);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RESEND_REQUEST);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REJECT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SEQUENCE_RESET);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Logout"
         *  <p>    "6 - Indication of Interest"
         *  <p>    "7 - Advertisement"
         *  <p>    "8 - Execution Report"
         *  <p>    "9 - Order Cancel Reject"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGOUT);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.INDICATION_OF_INTEREST);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADVERTISEMENT);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_REPORT);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REJECT);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "A - Logon"
         *  <p>    "B - News"
         *  <p>    "C - Email"
         *  <p>    "D - New Order - Single"
         *  <p>    "E - New Order - List"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.LOGON);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEWS);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EMAIL);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_SINGLE);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_LIST);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "F - Order Cancel Request"
         *  <p>    "G - Order Modification Request"
         *  <p>    "H - Order Status Request"
         *  <p>    "J - Allocation Instruction"
         *  <p>    "K - List Cancel Request"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_CANCEL_REQUEST);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MODIFICATION);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_STATUS_REQUEST);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_CANCEL_REQUEST);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "L - List Execute"
         *  <p>    "M - List Status Request"
         *  <p>    "N - List Status"
         *  <p>    "P - Allocation Instruction Ack"
         *  <p>    "Q - Don't Know Trade (DK)"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_EXECUTE);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS_REQUEST);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STATUS);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ACK);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.DONT_KNOW_TRADE);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "R - Quote Request"
         *  <p>    "S - Quote"
         *  <p>    "T - Settlement Instructions"
         *  <p>    "V - Market Data Request"
         *  <p>    "W - Market Data - Snapshot/Full Refresh"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTIONS);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REFRESH);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "X - Market Data - Incremental Refresh"
         *  <p>    "Y - Market Data Request Reject"
         *  <p>    "Z - Quote Cancel"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_INCREMENTAL_REFRESH);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MARKET_DATA_REQUEST_REJECT);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_CANCEL);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "a - Quote Status Request"
         *  <p>    "b - Mass Quote Acknowledgement"
         *  <p>    "c - Security Definition Request"
         *  <p>    "d - Security Definition"
         *  <p>    "e - Security Status Request"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REQUEST);
        assertEquals( "a", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE_ACKNOWLEDGEMENT);
        assertEquals( "b", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_REQUEST);
        assertEquals( "c", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION);
        assertEquals( "d", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS_REQUEST);
        assertEquals( "e", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "f - Security Status"
         *  <p>    "g - Trading Session Status Request"
         *  <p>    "h - Trading Session Status"
         *  <p>    "i - Mass Quote"
         *  <p>    "j - Business Message Reject"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_STATUS);
        assertEquals( "f", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS_REQUEST);
        assertEquals( "g", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_STATUS);
        assertEquals( "h", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MASS_QUOTE);
        assertEquals( "i", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BUSINESS_MESSAGE_REJECT);
        assertEquals( "j", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "k - Bid Request"
         *  <p>    "l - Bid Response (lowercase L)"
         *  <p>    "m - List Strike Price"
         *  <p>    "n - XML message (e.g. non FIX Msg Type)"
         *  <p>    "o - Registration Instructions"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_REQUEST);
        assertEquals( "k", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.BID_RESPONSE);
        assertEquals( "l", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.LIST_STRIKE_PRICE);
        assertEquals( "m", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.XML_MESSAGE);
        assertEquals( "n", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS);
        assertEquals( "o", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "p - Registration Instructions Response"
         *  <p>    "q - Order Mass Cancel Request"
         *  <p>    "r - Order Mass Cancel Report"
         *  <p>    "s - New Order - Cross"
         *  <p>    "t - Cross Order Modification Request"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.REGISTRATION_INSTRUCTIONS_RESPONSE);
        assertEquals( "p", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REQUEST);
        assertEquals( "q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_CANCEL_REPORT);
        assertEquals( "r", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_CROSS);
        assertEquals( "s", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_MODIFICATION_REQUEST);
        assertEquals( "t", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "u - Cross Order Cancel Request"
         *  <p>    "v - Security Type Request"
         *  <p>    "w - Security Types"
         *  <p>    "x - Security List Request"
         *  <p>    "y - Security List"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.CROSS_ORDER_CANCEL_REQUEST);
        assertEquals( "u", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPE_REQUEST);
        assertEquals( "v", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_TYPES);
        assertEquals( "w", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_REQUEST);
        assertEquals( "x", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST);
        assertEquals( "y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "z - Derivative Security List Request"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST);
        assertEquals( MyEnumMsgType.DERIVATIVE_SECURITY_LIST_REQUEST.toFIXIDString(), tagData.toString());
        assertEquals( "z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AA - Derivative Security List"
         *  <p>    "AB - New Order - Multileg"
         *  <p>    "AC - Multileg Order Modification Request"
         *  <p>    "AD - Trade Capture Report Request"
         *  <p>    "AE - Trade Capture Report"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.DERIVATIVE_SECURITY_LIST);
        assertEquals( "AA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NEW_ORDER_MULTILEG);
        assertEquals( "AB", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.MULTILEG_ORDER_MODIFICATION_REQUEST);
        assertEquals( "AC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST);
        assertEquals( "AD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT);
        assertEquals( "AE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AF - Order Mass Status Request"
         *  <p>    "AG - Quote Request Reject"
         *  <p>    "AH - RFQ Request"
         *  <p>    "AI - Quote Status Report"
         *  <p>    "AJ - Quote Response"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.ORDER_MASS_STATUS_REQUEST);
        assertEquals( "AF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_REQUEST_REJECT);
        assertEquals( "AG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.RFQ_REQUEST);
        assertEquals( "AH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_STATUS_REPORT);
        assertEquals( "AI", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.QUOTE_RESPONSE);
        assertEquals( "AJ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AK - Confirmation"
         *  <p>    "AL - Position Maintenance Request"
         *  <p>    "AM - Position Maintenance Report"
         *  <p>    "AN - Request For Positions"
         *  <p>    "AO - Request For Positions Ack"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION);
        assertEquals( "AK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REQUEST);
        assertEquals( "AL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_MAINTENANCE_REPORT);
        assertEquals( "AM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS);
        assertEquals( "AN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.REQUEST_FOR_POSITIONS_ACK);
        assertEquals( "AO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AP - Position Report"
         *  <p>    "AQ - Trade Capture Report Request Ack"
         *  <p>    "AR - Trade Capture Report Ack"
         *  <p>    "AS - Allocation Claim"
         *  <p>    "AT - Allocation Claim Ack"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.POSITION_REPORT);
        assertEquals( "AP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK);
        assertEquals( "AQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADE_CAPTURE_REPORT_ACK);
        assertEquals( "AR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM);
        assertEquals( "AS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_CLAIM_ACK);
        assertEquals( "AT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AU - Affirmation"
         *  <p>    "AV - Settlement Instruction Request"
         *  <p>    "AW - Assignment Report"
         *  <p>    "AX - Collateral Request"
         *  <p>    "AY - Collateral Assignment"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.AFFIRMATION);
        assertEquals( "AU", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.SETTLEMENT_INSTRUCTION_REQUEST);
        assertEquals( "AV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ASSIGNMENT_REPORT);
        assertEquals( "AW", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REQUEST);
        assertEquals( "AX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_ASSIGNMENT);
        assertEquals( "AY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AZ - Collateral Response"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_RESPONSE);
        assertEquals( "AZ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "BA - Collateral Report"
         *  <p>    "BB - Collateral Inquiry"
         *  <p>    "BC - Network Counterparty System Status Request"
         *  <p>    "BD - Network Counterparty System Status Response"
         *  <p>    "BE - User Request"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_REPORT);
        assertEquals( "BA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY);
        assertEquals( "BB", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST);
        assertEquals( "BC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE);
        assertEquals( "BD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_REQUEST);
        assertEquals( "BE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "BF - User Response"
         *  <p>    "BG - Collateral Inquiry Ack"
         *  <p>    "BH - Confirmation Request"
         *  <p>    "BI - Trading Session List Request"
         *  <p>    "BJ - Trading Session List"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.USER_RESPONSE);
        assertEquals( "BF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.COLLATERAL_INQUIRY_ACK);
        assertEquals( "BG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONFIRMATION_REQUEST);
        assertEquals( "BH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST_REQUEST);
        assertEquals( "BI", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.TRADING_SESSION_LIST);
        assertEquals( "BJ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "BK - Security List Update Report"
         *  <p>    "BL - Adjusted Position Report"
         *  <p>    "BM - Allocation Instruction Alert"
         *  <p>    "BN - Execution Acknowledgement"
         *  <p>    "BO - Contrary Intention Report"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_LIST_UPDATE_REPORT);
        assertEquals( "BK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ADJUSTED_POSITION_REPORT);
        assertEquals( "BL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.ALLOCATION_INSTRUCTION_ALERT);
        assertEquals( "BM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.EXECUTION_ACKNOWLEDGEMENT);
        assertEquals( "BN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag35EnuMsgType(MyEnumMsgType.CONTRARY_INTENTION_REPORT);
        assertEquals( "BO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "BP - Security Definition Update Report"
         */
        tagData = new Tag35EnuMsgType(MyEnumMsgType.SECURITY_DEFINITION_UPDATE_REPORT);
        assertEquals( "BP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            tagData = new Tag35EnuMsgType(oneEnum);
            assertEquals( "Tag35EnuMsgType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}