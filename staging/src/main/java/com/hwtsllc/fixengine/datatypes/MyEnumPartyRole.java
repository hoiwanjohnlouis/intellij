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

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  452 (same as 452, 538, 759, 784, 951, 1051, 1061, 1119)
 *  PartyRole
 *  int
 *  <p>
 *  Identifies the type or role of the PartyID (448) specified.
 *  <p>
 *  See "Appendix 6-G – Use of <Parties> Component Block"
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  538
 *  NestedPartyRole
 *  int
 *  <p>
 *  PartyRole value within a nested repeating group.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  759
 *  Nested2PartyRole
 *  int
 *  <p>
 *  PartyRole value within a "second instance" Nested repeating group.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  784
 *  SettlPartyRole
 *  int
 *  <p>
 *  PartyRole value within a settlement parties component.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  951
 *  Nested3PartyRole
 *  int
 *  <p>
 *  PartyRole value within a "third instance" Nested repeating group.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  1051
 *  InstrumentPartyRole
 *  int
 *  <p>
 *  PartyRole value within an instrument party repeating group.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  1061
 *  UndlyInstrumentPartyRole
 *  int
 *  <p>
 *  PartyRole value within an underlying instrument party repeating group.
 *  <p>
 *  Same values as  PartyRole (452)
 *  <p></p>
 *  1119
 *  RootPartyRole
 *  int
 *  <p>
 *  PartyRole value within a root parties component.
 *  <p>
 *  Same values as PartyRole (452)
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  <p>    1 - Executing Firm (formerly FIX 4.2 ExecBroker)
 *  <p>    2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)
 *  <p>    3 - Client ID (formerly FIX 4.2 ClientID)
 *  <p>    4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)
 *  <p>    5 - Investor ID
 *  <p></p>
 *  <p>    6 - Introducing Firm
 *  <p>    7 - Entering Firm
 *  <p>    8 - Locate / Lending Firm (for short-sales)
 *  <p>    9 - Fund Manager Client ID (for CIV)
 *  <p>    10 - Settlement Location (formerly FIX 4.2 SettlLocation)
 *  <p></p>
 *  <p>    11 - Order Origination Trader
 *              (associated with Order Origination Firm
 *                  - i.e. trader who initiates/submits the order)
 *  <p>    12 - Executing Trader
 *              (associated with Executing Firm - actually executes)
 *  <p>    13 - Order Origination Firm (e.g. buy-side firm)
 *  <p>    14 - Giveup Clearing Firm (firm to which trade is given up)
 *  <p>    15 - Correspondant Clearing Firm
 *  <p></p>
 *  <p>    16 - Executing System
 *  <p>    17 - Contra Firm
 *  <p>    18 - Contra Clearing Firm
 *  <p>    19 - Sponsoring Firm
 *  <p>    20 - Underlying Contra Firm
 *  <p></p>
 *  <p>    21 - Clearing Organization
 *  <p>    22 - Exchange
 *  <p>    24 - Customer Account
 *  <p>    25 - Correspondent Clearing Organization
 *  <p>    26 - Correspondent Broker
 *  <p></p>
 *  <p>    27 - Buyer/Seller (Receiver/Deliverer)
 *  <p>    28 - Custodian
 *  <p>    29 - Intermediary
 *  <p>    30 - Agent
 *  <p>    31 - Sub-custodian
 *  <p></p>
 *  <p>    32 - Beneficiary
 *  <p>    33 - Interested party
 *  <p>    34 - Regulatory body
 *  <p>    35 - Liquidity provider
 *  <p>    36 - Entering trader
 *  <p></p>
 *  <p>    37 - Contra trader
 *  <p>    38 - Position account
 *  <p>    39 - Contra Investor ID
 *  <p>    40 - Transfer to Firm
 *  <p>    41 - Contra Position Account
 *  <p></p>
 *  <p>    42 - Contra Exchange
 *  <p>    43 - Internal Carry Account
 *  <p>    44 - Order Entry Operator ID
 *  <p>    45 - Secondary Account Number
 *  <p>    46 - Foreign Firm
 *  <p></p>
 *  <p>    47 - Third Party Allocation Firm
 *  <p>    48 - Claiming Account
 *  <p>    49 - Asset Manager
 *  <p>    50 - Pledgor Account
 *  <p>    51 - Pledgee Account
 *  <p></p>
 *  <p>    52 - Large Trader Reportable Account
 *  <p>    53 - Trader mnemonic
 *  <p>    54 - Sender Location
 *  <p>    55 - Session ID
 *  <p>    56 - Acceptable Counterparty
 *  <p></p>
 *  <p>    57 - Unacceptable Counterparty
 *  <p>    58 - Entering Unit
 *  <p>    59 - Executing Unit
 *  <p>    60 - Introducing Broker
 *  <p>    61 - Quote originator
 *  <p></p>
 *  <p>    62 - Report originator
 *  <p>    63 - Systematic internaliser (SI)
 *  <p>    64 - Multilateral Trading Facility (MTF)
 *  <p>    65 - Regulated Market (RM)
 *  <p>    66 - Market Maker
 *  <p></p>
 *  <p>    67 - Investment Firm
 *  <p>    68 - Host Competent Authority (Host CA)
 *  <p>    69 - Home Competent Authority (Home CA)
 *  <p>    70 - Competent Authority of the most relevant market in terms of liquidity
 *              (CAL)
 *  <p>    71 - Competent Authority of the Transaction (Execution) Venue
 *              (CATV)
 *  <p></p>
 *  <p>    72 - Reporting intermediary
 *              (medium/vendor via which report has been published)
 *  <p>    73 - Execution Venue
 *  <p>    74 - Market data entry originator
 *  <p>    75 - Location ID
 *  <p>    76 - Desk ID
 *  <p></p>
 *  <p>    77 - Market data market
 *  <p>    78 - Allocation Entity
 */
public enum MyEnumPartyRole implements LogFIXString, LogVerboseString {
    /*
     * 1-22, 24-78 msg types
     */


    /*
     *  1-22, msg types
     */
    EXECUTING_FIRM("1", "EXECUTING_FIRM", "1 - Executing Firm (formerly FIX 4.2 ExecBroker)" ),
    BROKER_OF_CREDIT("2", "BROKER_OF_CREDIT", "2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)" ),
    CLIENT_ID("3", "CLIENT_ID", "3 - Client ID (formerly FIX 4.2 ClientID)" ),
    CLEARING_FIRM("4", "CLEARING_FIRM", "4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)" ),
    INVESTOR_ID("5", "INVESTOR_ID", "5 - Investor ID" ),

    INTRODUCING_FIRM("6", "INTRODUCING_FIRM", "6 - Introducing Firm" ),
    ENTERING_FIRM("7", "ENTERING_FIRM", "7 - Entering Firm" ),
    LENDING_FIRM("8", "LENDING_FIRM", "8 - Locate / Lending Firm (for short-sales)" ),
    FUND_MANAGER_CLIENT_ID("9", "FUND_MANAGER_CLIENT_ID", "9 - Fund Manager Client ID (for CIV)" ),
    SETTLEMENT_LOCATION("10", "SETTLEMENT_LOCATION", "10 - Settlement Location (formerly FIX 4.2 SettlLocation)" ),

    ORDER_ORIGINATION_TRADER("11", "ORDER_ORIGINATION_TRADER", "11 - Order Origination Trader (associated with Order Origination Firm - i.e. trader who initiates/submits the order)" ),
    EXECUTING_TRADER("12", "EXECUTING_TRADER", "12 - Executing Trader (associated with Executing Firm - actually executes)" ),
    ORDER_ORIGINATION_FIRM("13", "ORDER_ORIGINATION_FIRM", "13 - Order Origination Firm (e.g. buy-side firm)" ),
    GIVEUP_CLEARING_FIRM("14", "GIVEUP_CLEARING_FIRM", "14 - Giveup Clearing Firm (firm to which trade is given up)" ),
    CORRESPONDENT_CLEARING_FIRM("15", "CORRESPONDENT_CLEARING_FIRM", "15 - Correspondent Clearing Firm" ),

    EXECUTING_SYSTEM("16", "EXECUTING_SYSTEM", "16 - Executing System" ),
    CONTRA_FIRM("17", "CONTRA_FIRM", "17 - Contra Firm" ),
    CONTRA_CLEARING_FIRM("18", "CONTRA_CLEARING_FIRM", "18 - Contra Clearing Firm" ),
    SPONSORING_FIRM("19", "SPONSORING_FIRM", "19 - Sponsoring Firm" ),
    UNDERLYING_CONTRA_FIRM("20", "UNDERLYING_CONTRA_FIRM", "20 - Underlying Contra Firm" ),

    CLEARING_ORGANIZATION("21", "CLEARING_ORGANIZATION", "21 - Clearing Organization" ),
    EXCHANGE("22", "EXCHANGE", "22 - Exchange" ),


    /*
     *  24-78 msg types
     */
    CUSTOMER_ACCOUNT("24", "CUSTOMER_ACCOUNT", "24 - Customer Account" ),
    CORRESPONDENT_CLEARING_ORGANIZATION("25", "CORRESPONDENT_CLEARING_ORGANIZATION", "25 - Correspondent Clearing Organization" ),

    CORRESPONDENT_BROKER("26", "CORRESPONDENT_BROKER", "26 - Correspondent Broker" ),
    BUYER_SELLER("27", "BUYER_SELLER", "27 - Buyer/Seller (Receiver/Deliverer)" ),
    CUSTODIAN("28", "CUSTODIAN", "28 - Custodian" ),
    INTERMEDIARY("29", "INTERMEDIARY", "29 - Intermediary" ),
    AGENT("30", "AGENT", "30 - Agent" ),

    SUB_CUSTODIAN("31", "SUB_CUSTODIAN", "31 - Sub-custodian" ),
    BENEFICIARY("32", "BENEFICIARY", "32 - Beneficiary" ),
    INTERESTED_PARTY("33", "INTERESTED_PARTY", "33 - Interested party" ),
    REGULATORY_BODY("34", "REGULATORY_BODY", "34 - Regulatory body" ),
    LIQUIDITY_PROVIDER("35", "LIQUIDITY_PROVIDER", "35 - Liquidity provider" ),

    ENTERING_TRADER("36", "ENTERING_TRADER", "36 - Entering trader" ),
    CONTRA_TRADER("37", "CONTRA_TRADER", "37 - Contra trader" ),
    POSITION_ACCOUNT("38", "POSITION_ACCOUNT", "38 - Position account" ),
    CONTRA_INVESTOR_ID("39", "CONTRA_INVESTOR_ID", "39 - Contra Investor ID" ),
    TRANSFER_TO_FIRM("40", "TRANSFER_TO_FIRM", "40 - Transfer to Firm" ),

    CONTRA_POSITION_ACCOUNT("41", "CONTRA_POSITION_ACCOUNT", "41 - Contra Position Account" ),
    CONTRA_EXCHANGE("42", "CONTRA_EXCHANGE", "42 - Contra Exchange" ),
    INTERNAL_CARRY_ACCOUNT("43", "INTERNAL_CARRY_ACCOUNT", "43 - Internal Carry Account" ),
    ORDER_ENTRY_OPERATOR_ID("44", "ORDER_ENTRY_OPERATOR_ID", "44 - Order Entry Operator ID" ),
    SECONDARY_ACCOUNT_NUMBER("45", "SECONDARY_ACCOUNT_NUMBER", "45 - Secondary Account Number" ),

    FOREIGN_FIRM("46", "FOREIGN_FIRM", "46 - Foreign Firm" ),
    THIRD_PARTY_ALLOCATION_FIRM("47", "THIRD_PARTY_ALLOCATION_FIRM", "47 - Third Party Allocation Firm" ),
    CLAIMING_ACCOUNT("48", "CLAIMING_ACCOUNT", "48 - Claiming Account" ),
    ASSET_MANAGER("49", "ASSET_MANAGER", "49 - Asset Manager" ),
    PLEDGOR_ACCOUNT("50", "PLEDGOR_ACCOUNT", "50 - Pledgor Account" ),

    PLEDGEE_ACCOUNT("51", "PLEDGEE_ACCOUNT", "51 - Pledgee Account" ),
    LARGE_TRADER_REPORTABLE_ACCOUNT("52", "LARGE_TRADER_REPORTABLE_ACCOUNT", "52 - Large Trader Reportable Account" ),
    TRADER_MNEMONIC("53", "TRADER_MNEMONIC", "53 - Trader mnemonic" ),
    SENDER_LOCATION("54", "SENDER_LOCATION", "54 - Sender Location" ),
    SESSION_ID("55", "SESSION_ID", "55 - Session ID" ),

    ACCEPTABLE_COUNTERPARTY("56", "ACCEPTABLE_COUNTERPARTY", "56 - Acceptable Counterparty" ),
    UNACCEPTABLE_COUNTERPARTY("57", "UNACCEPTABLE_COUNTERPARTY", "57 - Unacceptable Counterparty" ),
    ENTERING_UNIT("58", "ENTERING_UNIT", "58 - Entering Unit" ),
    EXECUTING_UNIT("59", "EXECUTING_UNIT", "59 - Executing Unit" ),
    INTRODUCING_BROKER("60", "INTRODUCING_BROKER", "60 - Introducing Broker" ),

    QUOTE_ORIGINATOR("61", "QUOTE_ORIGINATOR", "61 - Quote originator" ),
    REPORT_ORIGINATOR("62", "REPORT_ORIGINATOR", "62 - Report originator" ),
    SYSTEMATIC_INTERNALISER("63", "SYSTEMATIC_INTERNALISER", "63 - Systematic internaliser (SI)" ),
    MULTILATERAL_TRADING_FACILITY("64", "MULTILATERAL_TRADING_FACILITY", "64 - Multilateral Trading Facility (MTF)" ),
    REGULATED_MARKET("65", "REGULATED_MARKET", "65 - Regulated Market (RM)" ),

    MARKET_MAKER("66", "MARKET_MAKER", "66 - Market Maker" ),
    INVESTMENT_FIRM("67", "INVESTMENT_FIRM", "67 - Investment Firm" ),
    HOST_CA("68", "HOST_CA", "68 - Host Competent Authority (Host CA)" ),
    HOME_CA("69", "HOME_CA", "69 - Home Competent Authority (Home CA)" ),
    CA_LIQUIDITY("70", "CA_LIQUIDITY", "70 - Competent Authority of the most relevant market in terms of liquidity (CAL)" ),

    CA_TRANSACTION_VENUE("71", "CA_TRANSACTION_VENUE", "71 - Competent Authority of the Transaction (Execution) Venue (CATV)" ),
    REPORTING_INTERMEDIARY("72", "REPORTING_INTERMEDIARY", "72 - Reporting intermediary (medium/vendor via which report has been published)" ),
    EXECUTION_VENUE("73", "EXECUTION_VENUE", "73 - Execution Venue" ),
    MARKET_DATA_ENTRY_ORIGINATOR("74", "MARKET_DATA_ENTRY_ORIGINATOR", "74 - Market data entry originator" ),
    LOCATION_ID("75", "LOCATION_ID", "75 - Location ID" ),

    DESK_ID("76", "DESK_ID", "76 - Desk ID" ),
    MARKET_DATA_MARKET("77", "MARKET_DATA_MARKET", "77 - Market data market" ),
    ALLOCATION_ENTITY("78", "ALLOCATION_ENTITY", "78 - Allocation Entity" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumPartyRole(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            System.out.println(oneEnum);
        }
    }
}