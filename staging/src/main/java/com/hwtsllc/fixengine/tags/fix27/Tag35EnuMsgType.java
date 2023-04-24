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

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.datatypes.MyEnumMsgType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

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
public class Tag35EnuMsgType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumMsgType dataValue;

    public final static MyEnumMsgType TESTA_ENU_MSG_TYPE
            = MyEnumMsgType.HEARTBEAT;
    public final static MyEnumMsgType TESTB_ENU_MSG_TYPE
            = MyEnumMsgType.LOGOUT;

    public Tag35EnuMsgType(MyEnumMsgType dataValue) {
        setFixType(FIX27.FIX35_ENU_MSG_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag35EnuMsgType(TESTA_ENU_MSG_TYPE).toVerboseString() );
        System.out.println( new Tag35EnuMsgType(TESTB_ENU_MSG_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (MyEnumMsgType oneEnum : MyEnumMsgType.values()) {
            System.out.println( new Tag35EnuMsgType(oneEnum).toVerboseString() );
        }
    }
}