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
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Replace;

import java.security.Security;

public enum Enum35MsgType {
    HEARTBEAT("0", "HEARTBEAT", "0 - Heartbeat" ),
    TEST_REQUEST("1", "TEST_REQUEST", "1 - Test Request" ),
    RESEND_REQUEST("2", "RESEND_REQUEST", "2 - Resend Request" ),
    REJECT("3", "REJECT", "3 - Reject" ),
    SEQUENCE_RESET("4", "SEQUENCE_RESET", "4 - Sequence Reset" ),
    LOGOUT("5", "LOGOUT", "5 - Logout" ),
    INDICATION_OF_INTEREST("6", "INDICATION_OF_INTEREST", "6 - Indication of Interest" ),
    ADVERTISEMENT("7", "ADVERTISEMENT", "7 - Advertisement" ),
    EXECUTION_REPORT("8", "EXECUTION_REPORT", "8 - Execution Report" ),
    ORDER_CANCEL_REJECT("9", "ORDER_CANCEL_REJECT", "9 - Order Cancel Reject" ),

    LOGON("A", "LOGON", "A - Logon" ),
    NEWS("B", "NEWS", "B - News" ),
    EMAIL("C", "EMAIL", "C - Email" ),
    NEW_ORDER_SINGLE("D", "NEW_ORDER_SINGLE", "D - New Order - Single" ),
    NEW_ORDER_LIST("E", "NEW_ORDER_LIST", "E - New Order - List" ),
    ORDER_CANCEL_REQUEST("F", "ORDER_CANCEL_REQUEST", "F - Order Cancel Request" ),
    ORDER_MODIFICATION("G", "ORDER_MODIFICATION","G - Order Modification Request" ),
    ORDER_STATUS_REQUEST("H", "ORDER_STATUS_REQUEST", "H - Order Status Request" ),
    ALLOCATION_INSTRUCTION("J", "ALLOCATION_INSTRUCTION", "J - Allocation Instruction" ),
    LIST_CANCEL_REQUEST("K", "LIST_CANCEL_REQUEST", "K - List Cancel Request" ),
    LIST_EXECUTE("L", "LIST_EXECUTE", "L - List Execute" ),
    LIST_STATUS_REQUEST("M", "LIST_STATUS_REQUEST", "M - List Status Request" ),
    LIST_STATUS("N", "LIST_STATUS", "N - List Status" ),
    ALLOCATION_INSTRUCTION_ACK("P", "ALLOCATION_INSTRUCTION_ACK", "P - Allocation Instruction Ack" ),
    DONT_KNOW_TRADE("Q", "DONT_KNOW_TRADE", "Q - Don't Know Trade (DK)" ),
    QUOTE_REQUEST("R", "QUOTE_REQUEST", "R - Quote Request" ),
    QUOTE("S", "QUOTE", "S - Quote" ),
    SETTLEMENT_INSTRUCTIONS("T", "SETTLEMENT_INSTRUCTIONS", "T - Settlement Instructions" ),
    MARKET_DATA_REQUEST("V", "MARKET_DATA_REQUEST", "V - Market Data Request" ),
    MARKET_DATA_REFRESH("W", "MARKET_DATA_REFRESH", "W - Market Data - Snapshot/Full Refresh" ),
    MARKET_DATA_INCREMENTAL_REFRESH("X", "MARKET_DATA_INCREMENTAL_REFRESH","X - Market Data - Incremental Refresh" ),
    MARKET_DATA_REQUEST_REJECT("Y", "MARKET_DATA_REQUEST_REJECT","Y - Market Data Request Reject" ),
    QUOTE_CANCEL("Z", "QUOTE_CANCEL", "Z - Quote Cancel" ),

    QUOTE_STATUS_REQUEST("a", "QUOTE_STATUS_REQUEST", "a - Quote Status Request" ),
    MASS_QUOTE_ACKNOWLEDGEMENT("b", "MASS_QUOTE_ACKNOWLEDGEMENT","b - Mass Quote Acknowledgement" ),
    SECURITY_DEFINITION_REQUEST("c", "SECURITY_DEFINITION_REQUEST","c - Security Definition Request" ),
    SECURITY_DEFINITION("d", "SECURITY_DEFINITION", "d - Security Definition" ),
    SECURITY_STATUS_REQUEST("e", "SECURITY_STATUS_REQUEST", "e - Security Status Request" ),
    SECURITY_STATUS("f", "SECURITY_STATUS", "f - Security Status" ),
    TRADING_SESSION_STATUS_REQUEST("g", "TRADING_SESSION_STATUS_REQUEST","g - Trading Session Status Request" ),
    TRADING_SESSION_STATUS("h", "TRADING_SESSION_STATUS", "h - Trading Session Status" ),
    MASS_QUOTE("i", "MASS_QUOTE", "i - Mass Quote" ),
    BUSINESS_MESSAGE_REJECT("j", "BUSINESS_MESSAGE_REJECT", "j - Business Message Reject" ),
    BID_REQUEST("k", "BID_REQUEST", "k - Bid Request" ),
    BID_RESPONSE("l", "BID_RESPONSE", "l - Bid Response (lowercase L)" ),
    LIST_STRIKE_PRICE("m", "LIST_STRIKE_PRICE", "m - List Strike Price" ),
    XML_MESSAGE("n", "XML_MESSAGE", "n - XML message (e.g. non FIX Msg Type)" ),
    REGISTRATION_INSTRUCTIONS("o", "REGISTRATION_INSTRUCTIONS", "o - Registration Instructions" ),
    REGISTRATION_INSTRUCTIONS_RESPONSE("p", "REGISTRATION_INSTRUCTIONS_RESPONSE","p - Registration Instructions Response" ),
    ORDER_MASS_CANCEL_REQUEST("q", "ORDER_MASS_CANCEL_REQUEST", "q - Order Mass Cancel Request" ),
    ORDER_MASS_CANCEL_REPORT("r", "ORDER_MASS_CANCEL_REPORT", "r - Order Mass Cancel Report" ),
    NEW_ORDER_CROSS("s", "NEW_ORDER_CROSS", "s - New Order - Cross" ),
    CROSS_ORDER_MODIFICATION_REQUEST("t", "CROSS_ORDER_MODIFICATION_REQUEST","t - Cross Order Modification Request" ),
    CROSS_ORDER_CANCEL_REQUEST("u", "CROSS_ORDER_CANCEL_REQUEST","u - Cross Order Cancel Request" ),
    SECURITY_TYPE_REQUEST("v", "SECURITY_TYPE_REQUEST", "v - Security Type Request" ),
    SECURITY_TYPES("w", "SECURITY_TYPES", "w - Security Types" ),
    SECURITY_LIST_REQUEST("x", "SECURITY_LIST_REQUEST", "x - Security List Request" ),
    SECURITY_LIST("y", "SECURITY_LIST", "y - Security List" ),
    DERIVATIVE_SECURITY_LIST_REQUEST("z", "DERIVATIVE_SECURITY_LIST_REQUEST","z - Derivative Security List Request" ),

    DERIVATIVE_SECURITY_LIST("AA", "DERIVATIVE_SECURITY_LIST", "AA - Derivative Security List" ),
    NEW_ORDER_MULTILEG("AB", "NEW_ORDER_MULTILEG", "AB - New Order - Multileg" ),
    MULTILEG_ORDER_MODIFICATION_REQUEST("AC", "MULTILEG_ORDER_MODIFICATION_REQUEST","AC - Multileg Order Modification Request" ),
    TRADE_CAPTURE_REPORT_REQUEST("AD", "TRADE_CAPTURE_REPORT_REQUEST","AD - Trade Capture Report Request" ),
    TRADE_CAPTURE_REPORT("AE", "TRADE_CAPTURE_REPORT", "AE - Trade Capture Report" ),
    ORDER_MASS_STATUS_REQUEST("AF", "ORDER_MASS_STATUS_REQUEST", "AF - Order Mass Status Request" ),
    QUOTE_REQUEST_REJECT("AG", "QUOTE_REQUEST_REJECT", "AG - Quote Request Reject" ),
    RFQ_REQUEST("AH", "RFQ_REQUEST", "AH - RFQ Request" ),
    QUOTE_STATUS_REPORT("AI", "QUOTE_STATUS_REPORT", "AI - Quote Status Report" ),
    QUOTE_RESPONSE("AJ", "QUOTE_RESPONSE", "AJ - Quote Response" ),
    CONFIRMATION("AK", "CONFIRMATION", "AK - Confirmation" ),
    POSITION_MAINTENANCE_REQUEST("AL", "POSITION_MAINTENANCE_REQUEST","AL - Position Maintenance Request" ),
    POSITION_MAINTENANCE_REPORT("AM", "POSITION_MAINTENANCE_REPORT","AM - Position Maintenance Report" ),
    REQUEST_FOR_POSITIONS("AN", "REQUEST_FOR_POSITIONS", "AN - Request For Positions" ),
    REQUEST_FOR_POSITIONS_ACK("AO", "REQUEST_FOR_POSITIONS_ACK", "AO - Request For Positions Ack" ),
    POSITION_REPORT("AP", "POSITION_REPORT", "AP - Position Report" ),
    TRADE_CAPTURE_REPORT_REQUEST_ACK("AQ", "TRADE_CAPTURE_REPORT_REQUEST_ACK","AQ - Trade Capture Report Request Ack" ),
    TRADE_CAPTURE_REPORT_ACK("AR", "TRADE_CAPTURE_REPORT_ACK", "AR - Trade Capture Report Ack" ),
    ALLOCATION_CLAIM("AS", "ALLOCATION_CLAIM", "AS - Allocation Allocation Claim" ),
    ALLOCATION_CLAIM_ACK("AT", "ALLOCATION_CLAIM_ACK","AT - Allocation Claim Ack" ),
    AFFIRMATION("AU", "AFFIRMATION", "AU - Affirmation" ),
    SETTLEMENT_INSTRUCTION_REQUEST("AV", "SETTLEMENT_INSTRUCTION_REQUEST","AV - Settlement Instruction Request" ),
    ASSIGNMENT_REPORT("AW", "ASSIGNMENT_REPORT", "AW - Assignment Report" ),
    COLLATERAL_REQUEST("AX", "COLLATERAL_REQUEST", "AX - Collateral Request" ),
    COLLATERAL_ASSIGNMENT("AY", "COLLATERAL_ASSIGNMENT", "AY - Collateral Assignment" ),
    COLLATERAL_RESPONSE("AZ", "COLLATERAL_RESPONSE", "AZ - Collateral Response" ),

    COLLATERAL_REPORT("BA", "COLLATERAL_REPORT", "BA - Collateral Report" ),
    COLLATERAL_INQUIRY("BB", "COLLATERAL_INQUIRY", "BB - Collateral Inquiry" ),
    NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST("BC", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST", "BC - Network Counterparty System Status Request" ),
    NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE("BD", "NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE", "BD - Network Counterparty System Status Response" ),
    USER_REQUEST("BE", "USER_REQUEST", "BE - User Request" ),
    USER_RESPONSE("BF", "USER_RESPONSE", "BF - User Response" ),
    COLLATERAL_INQUIRY_ACK("BG", "COLLATERAL_INQUIRY_ACK", "BG - Collateral Inquiry Ack" ),
    CONFIRMATION_REQUEST("BH", "CONFIRMATION_REQUEST", "BH - Confirmation Request" ),
    TRADING_SESSION_LIST_REQUEST("BI", "TRADING_SESSION_LIST_REQUEST", "BI - Trading Session List Request" ),
    TRADING_SESSION_LIST("BJ", "TRADING_SESSION_LIST", "BJ - Trading Session List" ),
    SECURITY_LIST_UPDATE_REPORT("BK", "SECURITY_LIST_UPDATE_REPORT", "BK - Security List Update Report" ),
    ADJUSTED_POSITION_REPORT("BL", "ADJUSTED_POSITION_REPORT", "BL - Adjusted Position Report" ),
    ALLOCATION_INSTRUCTION_ALERT("BM", "ALLOCATION_INSTRUCTION_ALERT", "BM - Allocation Instruction Alert" ),
    EXECUTION_ACKNOWLEDGEMENT("BN", "EXECUTION_ACKNOWLEDGEMENT", "BN - Execution Acknowledgement" ),
    CONTRARY_INTENTION_REPORT("BO", "CONTRARY_INTENTION_REPORT", "BO - Contrary Intention Report" ),
    SECURITY_DEFINITION_UPDATE_REPORT("BP", "SECURITY_DEFINITION_UPDATE_REPORT", "BP - Security Definition Update Report" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum35MsgType(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum35MsgType.HEARTBEAT);
        System.out.println(Enum35MsgType.TEST_REQUEST);
        System.out.println(Enum35MsgType.RESEND_REQUEST);
        System.out.println(Enum35MsgType.REJECT);
        System.out.println(Enum35MsgType.SEQUENCE_RESET);
        System.out.println(Enum35MsgType.LOGOUT);
        System.out.println(Enum35MsgType.INDICATION_OF_INTEREST);
        System.out.println(Enum35MsgType.ADVERTISEMENT);
        System.out.println(Enum35MsgType.EXECUTION_REPORT);
        System.out.println(Enum35MsgType.ORDER_CANCEL_REJECT);

        System.out.println(Enum35MsgType.LOGON);
        System.out.println(Enum35MsgType.NEWS);
        System.out.println(Enum35MsgType.EMAIL);
        System.out.println(Enum35MsgType.NEW_ORDER_SINGLE);
        System.out.println(Enum35MsgType.NEW_ORDER_LIST);
        System.out.println(Enum35MsgType.ORDER_CANCEL_REQUEST);
        System.out.println(Enum35MsgType.ORDER_MODIFICATION);
        System.out.println(Enum35MsgType.ORDER_STATUS_REQUEST);
        System.out.println(Enum35MsgType.ALLOCATION_INSTRUCTION);
        System.out.println(Enum35MsgType.LIST_CANCEL_REQUEST);
        System.out.println(Enum35MsgType.LIST_EXECUTE);
        System.out.println(Enum35MsgType.LIST_STATUS_REQUEST);
        System.out.println(Enum35MsgType.LIST_STATUS);
        System.out.println(Enum35MsgType.ALLOCATION_INSTRUCTION_ACK);
        System.out.println(Enum35MsgType.DONT_KNOW_TRADE);
        System.out.println(Enum35MsgType.QUOTE_REQUEST);
        System.out.println(Enum35MsgType.QUOTE);
        System.out.println(Enum35MsgType.SETTLEMENT_INSTRUCTIONS);
        System.out.println(Enum35MsgType.MARKET_DATA_REQUEST);
        System.out.println(Enum35MsgType.MARKET_DATA_REFRESH);
        System.out.println(Enum35MsgType.MARKET_DATA_INCREMENTAL_REFRESH);
        System.out.println(Enum35MsgType.MARKET_DATA_REQUEST_REJECT);
        System.out.println(Enum35MsgType.QUOTE_CANCEL);

        System.out.println(Enum35MsgType.QUOTE_STATUS_REQUEST);
        System.out.println(Enum35MsgType.MASS_QUOTE_ACKNOWLEDGEMENT);
        System.out.println(Enum35MsgType.SECURITY_DEFINITION_REQUEST);
        System.out.println(Enum35MsgType.SECURITY_DEFINITION);
        System.out.println(Enum35MsgType.SECURITY_STATUS_REQUEST);
        System.out.println(Enum35MsgType.SECURITY_STATUS);
        System.out.println(Enum35MsgType.TRADING_SESSION_STATUS_REQUEST);
        System.out.println(Enum35MsgType.TRADING_SESSION_STATUS);
        System.out.println(Enum35MsgType.MASS_QUOTE);
        System.out.println(Enum35MsgType.BUSINESS_MESSAGE_REJECT);
        System.out.println(Enum35MsgType.BID_REQUEST);
        System.out.println(Enum35MsgType.BID_RESPONSE);
        System.out.println(Enum35MsgType.LIST_STRIKE_PRICE);
        System.out.println(Enum35MsgType.XML_MESSAGE);
        System.out.println(Enum35MsgType.REGISTRATION_INSTRUCTIONS);
        System.out.println(Enum35MsgType.REGISTRATION_INSTRUCTIONS_RESPONSE);
        System.out.println(Enum35MsgType.ORDER_MASS_CANCEL_REQUEST);
        System.out.println(Enum35MsgType.ORDER_MASS_CANCEL_REPORT);
        System.out.println(Enum35MsgType.NEW_ORDER_CROSS);
        System.out.println(Enum35MsgType.CROSS_ORDER_MODIFICATION_REQUEST);
        System.out.println(Enum35MsgType.CROSS_ORDER_CANCEL_REQUEST);
        System.out.println(Enum35MsgType.SECURITY_TYPE_REQUEST);
        System.out.println(Enum35MsgType.SECURITY_TYPES);
        System.out.println(Enum35MsgType.SECURITY_LIST_REQUEST);
        System.out.println(Enum35MsgType.SECURITY_LIST);
        System.out.println(Enum35MsgType.DERIVATIVE_SECURITY_LIST_REQUEST);

        System.out.println(Enum35MsgType.DERIVATIVE_SECURITY_LIST);
        System.out.println(Enum35MsgType.NEW_ORDER_MULTILEG);
        System.out.println(Enum35MsgType.MULTILEG_ORDER_MODIFICATION_REQUEST);
        System.out.println(Enum35MsgType.TRADE_CAPTURE_REPORT_REQUEST);
        System.out.println(Enum35MsgType.TRADE_CAPTURE_REPORT);
        System.out.println(Enum35MsgType.ORDER_MASS_STATUS_REQUEST);
        System.out.println(Enum35MsgType.QUOTE_REQUEST_REJECT);
        System.out.println(Enum35MsgType.RFQ_REQUEST);
        System.out.println(Enum35MsgType.QUOTE_STATUS_REPORT);
        System.out.println(Enum35MsgType.QUOTE_RESPONSE);
        System.out.println(Enum35MsgType.CONFIRMATION);
        System.out.println(Enum35MsgType.POSITION_MAINTENANCE_REQUEST);
        System.out.println(Enum35MsgType.POSITION_MAINTENANCE_REPORT);
        System.out.println(Enum35MsgType.REQUEST_FOR_POSITIONS);
        System.out.println(Enum35MsgType.REQUEST_FOR_POSITIONS_ACK);
        System.out.println(Enum35MsgType.POSITION_REPORT);
        System.out.println(Enum35MsgType.TRADE_CAPTURE_REPORT_REQUEST_ACK);
        System.out.println(Enum35MsgType.TRADE_CAPTURE_REPORT_ACK);
        System.out.println(Enum35MsgType.ALLOCATION_CLAIM);
        System.out.println(Enum35MsgType.ALLOCATION_CLAIM_ACK);
        System.out.println(Enum35MsgType.AFFIRMATION);
        System.out.println(Enum35MsgType.SETTLEMENT_INSTRUCTION_REQUEST);
        System.out.println(Enum35MsgType.ASSIGNMENT_REPORT);
        System.out.println(Enum35MsgType.COLLATERAL_REQUEST);
        System.out.println(Enum35MsgType.COLLATERAL_ASSIGNMENT);
        System.out.println(Enum35MsgType.COLLATERAL_RESPONSE);

        System.out.println(Enum35MsgType.COLLATERAL_REPORT);
        System.out.println(Enum35MsgType.COLLATERAL_INQUIRY);
        System.out.println(Enum35MsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST);
        System.out.println(Enum35MsgType.NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE);
        System.out.println(Enum35MsgType.USER_REQUEST);
        System.out.println(Enum35MsgType.USER_RESPONSE);
        System.out.println(Enum35MsgType.COLLATERAL_INQUIRY_ACK);
        System.out.println(Enum35MsgType.CONFIRMATION_REQUEST);
        System.out.println(Enum35MsgType.TRADING_SESSION_LIST_REQUEST);
        System.out.println(Enum35MsgType.TRADING_SESSION_LIST);
        System.out.println(Enum35MsgType.SECURITY_LIST_UPDATE_REPORT);
        System.out.println(Enum35MsgType.ADJUSTED_POSITION_REPORT);
        System.out.println(Enum35MsgType.ALLOCATION_INSTRUCTION_ALERT);
        System.out.println(Enum35MsgType.EXECUTION_ACKNOWLEDGEMENT);
        System.out.println(Enum35MsgType.CONTRARY_INTENTION_REPORT);
        System.out.println(Enum35MsgType.SECURITY_DEFINITION_UPDATE_REPORT);
    }
}
