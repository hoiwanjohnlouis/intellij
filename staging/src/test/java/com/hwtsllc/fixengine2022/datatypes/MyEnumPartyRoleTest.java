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
class MyEnumPartyRoleTest {
    @Test
    void Enum0452Test() {
        MyEnumPartyRole enumType;

        /*
         * 1-22, 24-78 msg types
         */


        /*
         * 1-22, msg types
         */
        enumType = MyEnumPartyRole.EXECUTING_FIRM;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("EXECUTING_FIRM", enumType.toFIXNameString());
        assertEquals("1 - Executing Firm (formerly FIX 4.2 ExecBroker)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.BROKER_OF_CREDIT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("BROKER_OF_CREDIT", enumType.toFIXNameString());
        assertEquals("2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CLIENT_ID;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("CLIENT_ID", enumType.toFIXNameString());
        assertEquals("3 - Client ID (formerly FIX 4.2 ClientID)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CLEARING_FIRM;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CLEARING_FIRM", enumType.toFIXNameString());
        assertEquals("4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INVESTOR_ID;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("INVESTOR_ID", enumType.toFIXNameString());
        assertEquals("5 - Investor ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.INTRODUCING_FIRM;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("INTRODUCING_FIRM", enumType.toFIXNameString());
        assertEquals("6 - Introducing Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ENTERING_FIRM;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("ENTERING_FIRM", enumType.toFIXNameString());
        assertEquals("7 - Entering Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.LENDING_FIRM;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("LENDING_FIRM", enumType.toFIXNameString());
        assertEquals("8 - Locate / Lending Firm (for short-sales)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.FUND_MANAGER_CLIENT_ID;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("FUND_MANAGER_CLIENT_ID", enumType.toFIXNameString());
        assertEquals("9 - Fund Manager Client ID (for CIV)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SETTLEMENT_LOCATION;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("SETTLEMENT_LOCATION", enumType.toFIXNameString());
        assertEquals("10 - Settlement Location (formerly FIX 4.2 SettlLocation)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.ORDER_ORIGINATION_TRADER;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("ORDER_ORIGINATION_TRADER", enumType.toFIXNameString());
        assertEquals("11 - Order Origination Trader " +
                        "(associated with Order Origination Firm - i.e. trader who initiates/submits the order)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.EXECUTING_TRADER;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("EXECUTING_TRADER", enumType.toFIXNameString());
        assertEquals("12 - Executing Trader (associated with Executing Firm - actually executes)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ORDER_ORIGINATION_FIRM;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("ORDER_ORIGINATION_FIRM", enumType.toFIXNameString());
        assertEquals("13 - Order Origination Firm (e.g. buy-side firm)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.GIVEUP_CLEARING_FIRM;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("GIVEUP_CLEARING_FIRM", enumType.toFIXNameString());
        assertEquals("14 - Giveup Clearing Firm (firm to which trade is given up)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("CORRESPONDENT_CLEARING_FIRM", enumType.toFIXNameString());
        assertEquals("15 - Correspondent Clearing Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.EXECUTING_SYSTEM;
        assertEquals("16", enumType.toFIXIDString());
        assertEquals("EXECUTING_SYSTEM", enumType.toFIXNameString());
        assertEquals("16 - Executing System", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CONTRA_FIRM;
        assertEquals("17", enumType.toFIXIDString());
        assertEquals("CONTRA_FIRM", enumType.toFIXNameString());
        assertEquals("17 - Contra Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CONTRA_CLEARING_FIRM;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("CONTRA_CLEARING_FIRM", enumType.toFIXNameString());
        assertEquals("18 - Contra Clearing Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SPONSORING_FIRM;
        assertEquals("19", enumType.toFIXIDString());
        assertEquals("SPONSORING_FIRM", enumType.toFIXNameString());
        assertEquals("19 - Sponsoring Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.UNDERLYING_CONTRA_FIRM;
        assertEquals("20", enumType.toFIXIDString());
        assertEquals("UNDERLYING_CONTRA_FIRM", enumType.toFIXNameString());
        assertEquals("20 - Underlying Contra Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.CLEARING_ORGANIZATION;
        assertEquals("21", enumType.toFIXIDString());
        assertEquals("CLEARING_ORGANIZATION", enumType.toFIXNameString());
        assertEquals("21 - Clearing Organization", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.EXCHANGE;
        assertEquals("22", enumType.toFIXIDString());
        assertEquals("EXCHANGE", enumType.toFIXNameString());
        assertEquals("22 - Exchange", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  24-78 msg types
         */
        enumType = MyEnumPartyRole.CUSTOMER_ACCOUNT;
        assertEquals("24", enumType.toFIXIDString());
        assertEquals("CUSTOMER_ACCOUNT", enumType.toFIXNameString());
        assertEquals("24 - Customer Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION;
        assertEquals("25", enumType.toFIXIDString());
        assertEquals("CORRESPONDENT_CLEARING_ORGANIZATION", enumType.toFIXNameString());
        assertEquals("25 - Correspondent Clearing Organization", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.CORRESPONDENT_BROKER;
        assertEquals("26", enumType.toFIXIDString());
        assertEquals("CORRESPONDENT_BROKER", enumType.toFIXNameString());
        assertEquals("26 - Correspondent Broker", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.BUYER_SELLER;
        assertEquals("27", enumType.toFIXIDString());
        assertEquals("BUYER_SELLER", enumType.toFIXNameString());
        assertEquals("27 - Buyer/Seller (Receiver/Deliverer)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CUSTODIAN;
        assertEquals("28", enumType.toFIXIDString());
        assertEquals("CUSTODIAN", enumType.toFIXNameString());
        assertEquals("28 - Custodian", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INTERMEDIARY;
        assertEquals("29", enumType.toFIXIDString());
        assertEquals("INTERMEDIARY", enumType.toFIXNameString());
        assertEquals("29 - Intermediary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.AGENT;
        assertEquals("30", enumType.toFIXIDString());
        assertEquals("AGENT", enumType.toFIXNameString());
        assertEquals("30 - Agent", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.SUB_CUSTODIAN;
        assertEquals("31", enumType.toFIXIDString());
        assertEquals("SUB_CUSTODIAN", enumType.toFIXNameString());
        assertEquals("31 - Sub-custodian", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.BENEFICIARY;
        assertEquals("32", enumType.toFIXIDString());
        assertEquals("BENEFICIARY", enumType.toFIXNameString());
        assertEquals("32 - Beneficiary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INTERESTED_PARTY;
        assertEquals("33", enumType.toFIXIDString());
        assertEquals("INTERESTED_PARTY", enumType.toFIXNameString());
        assertEquals("33 - Interested party", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.REGULATORY_BODY;
        assertEquals("34", enumType.toFIXIDString());
        assertEquals("REGULATORY_BODY", enumType.toFIXNameString());
        assertEquals("34 - Regulatory body", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.LIQUIDITY_PROVIDER;
        assertEquals("35", enumType.toFIXIDString());
        assertEquals("LIQUIDITY_PROVIDER", enumType.toFIXNameString());
        assertEquals("35 - Liquidity provider", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.ENTERING_TRADER;
        assertEquals("36", enumType.toFIXIDString());
        assertEquals("ENTERING_TRADER", enumType.toFIXNameString());
        assertEquals("36 - Entering trader", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CONTRA_TRADER;
        assertEquals("37", enumType.toFIXIDString());
        assertEquals("CONTRA_TRADER", enumType.toFIXNameString());
        assertEquals("37 - Contra trader", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.POSITION_ACCOUNT;
        assertEquals("38", enumType.toFIXIDString());
        assertEquals("POSITION_ACCOUNT", enumType.toFIXNameString());
        assertEquals("38 - Position account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CONTRA_INVESTOR_ID;
        assertEquals("39", enumType.toFIXIDString());
        assertEquals("CONTRA_INVESTOR_ID", enumType.toFIXNameString());
        assertEquals("39 - Contra Investor ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.TRANSFER_TO_FIRM;
        assertEquals("40", enumType.toFIXIDString());
        assertEquals("TRANSFER_TO_FIRM", enumType.toFIXNameString());
        assertEquals("40 - Transfer to Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.CONTRA_POSITION_ACCOUNT;
        assertEquals("41", enumType.toFIXIDString());
        assertEquals("CONTRA_POSITION_ACCOUNT", enumType.toFIXNameString());
        assertEquals("41 - Contra Position Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CONTRA_EXCHANGE;
        assertEquals("42", enumType.toFIXIDString());
        assertEquals("CONTRA_EXCHANGE", enumType.toFIXNameString());
        assertEquals("42 - Contra Exchange", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT;
        assertEquals("43", enumType.toFIXIDString());
        assertEquals("INTERNAL_CARRY_ACCOUNT", enumType.toFIXNameString());
        assertEquals("43 - Internal Carry Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID;
        assertEquals("44", enumType.toFIXIDString());
        assertEquals("ORDER_ENTRY_OPERATOR_ID", enumType.toFIXNameString());
        assertEquals("44 - Order Entry Operator ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER;
        assertEquals("45", enumType.toFIXIDString());
        assertEquals("SECONDARY_ACCOUNT_NUMBER", enumType.toFIXNameString());
        assertEquals("45 - Secondary Account Number", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.FOREIGN_FIRM;
        assertEquals("46", enumType.toFIXIDString());
        assertEquals("FOREIGN_FIRM", enumType.toFIXNameString());
        assertEquals("46 - Foreign Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM;
        assertEquals("47", enumType.toFIXIDString());
        assertEquals("THIRD_PARTY_ALLOCATION_FIRM", enumType.toFIXNameString());
        assertEquals("47 - Third Party Allocation Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CLAIMING_ACCOUNT;
        assertEquals("48", enumType.toFIXIDString());
        assertEquals("CLAIMING_ACCOUNT", enumType.toFIXNameString());
        assertEquals("48 - Claiming Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ASSET_MANAGER;
        assertEquals("49", enumType.toFIXIDString());
        assertEquals("ASSET_MANAGER", enumType.toFIXNameString());
        assertEquals("49 - Asset Manager", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.PLEDGOR_ACCOUNT;
        assertEquals("50", enumType.toFIXIDString());
        assertEquals("PLEDGOR_ACCOUNT", enumType.toFIXNameString());
        assertEquals("50 - Pledgor Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.PLEDGEE_ACCOUNT;
        assertEquals("51", enumType.toFIXIDString());
        assertEquals("PLEDGEE_ACCOUNT", enumType.toFIXNameString());
        assertEquals("51 - Pledgee Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT;
        assertEquals("52", enumType.toFIXIDString());
        assertEquals("LARGE_TRADER_REPORTABLE_ACCOUNT", enumType.toFIXNameString());
        assertEquals("52 - Large Trader Reportable Account", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.TRADER_MNEMONIC;
        assertEquals("53", enumType.toFIXIDString());
        assertEquals("TRADER_MNEMONIC", enumType.toFIXNameString());
        assertEquals("53 - Trader mnemonic", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SENDER_LOCATION;
        assertEquals("54", enumType.toFIXIDString());
        assertEquals("SENDER_LOCATION", enumType.toFIXNameString());
        assertEquals("54 - Sender Location", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SESSION_ID;
        assertEquals("55", enumType.toFIXIDString());
        assertEquals("SESSION_ID", enumType.toFIXNameString());
        assertEquals("55 - Session ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY;
        assertEquals("56", enumType.toFIXIDString());
        assertEquals("ACCEPTABLE_COUNTERPARTY", enumType.toFIXNameString());
        assertEquals("56 - Acceptable Counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY;
        assertEquals("57", enumType.toFIXIDString());
        assertEquals("UNACCEPTABLE_COUNTERPARTY", enumType.toFIXNameString());
        assertEquals("57 - Unacceptable Counterparty", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ENTERING_UNIT;
        assertEquals("58", enumType.toFIXIDString());
        assertEquals("ENTERING_UNIT", enumType.toFIXNameString());
        assertEquals("58 - Entering Unit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.EXECUTING_UNIT;
        assertEquals("59", enumType.toFIXIDString());
        assertEquals("EXECUTING_UNIT", enumType.toFIXNameString());
        assertEquals("59 - Executing Unit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INTRODUCING_BROKER;
        assertEquals("60", enumType.toFIXIDString());
        assertEquals("INTRODUCING_BROKER", enumType.toFIXNameString());
        assertEquals("60 - Introducing Broker", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.QUOTE_ORIGINATOR;
        assertEquals("61", enumType.toFIXIDString());
        assertEquals("QUOTE_ORIGINATOR", enumType.toFIXNameString());
        assertEquals("61 - Quote originator", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.REPORT_ORIGINATOR;
        assertEquals("62", enumType.toFIXIDString());
        assertEquals("REPORT_ORIGINATOR", enumType.toFIXNameString());
        assertEquals("62 - Report originator", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.SYSTEMATIC_INTERNALISER;
        assertEquals("63", enumType.toFIXIDString());
        assertEquals("SYSTEMATIC_INTERNALISER", enumType.toFIXNameString());
        assertEquals("63 - Systematic internaliser (SI)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY;
        assertEquals("64", enumType.toFIXIDString());
        assertEquals("MULTILATERAL_TRADING_FACILITY", enumType.toFIXNameString());
        assertEquals("64 - Multilateral Trading Facility (MTF)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.REGULATED_MARKET;
        assertEquals("65", enumType.toFIXIDString());
        assertEquals("REGULATED_MARKET", enumType.toFIXNameString());
        assertEquals("65 - Regulated Market (RM)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.MARKET_MAKER;
        assertEquals("66", enumType.toFIXIDString());
        assertEquals("MARKET_MAKER", enumType.toFIXNameString());
        assertEquals("66 - Market Maker", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.INVESTMENT_FIRM;
        assertEquals("67", enumType.toFIXIDString());
        assertEquals("INVESTMENT_FIRM", enumType.toFIXNameString());
        assertEquals("67 - Investment Firm", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.HOST_CA;
        assertEquals("68", enumType.toFIXIDString());
        assertEquals("HOST_CA", enumType.toFIXNameString());
        assertEquals("68 - Host Competent Authority (Host CA)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.HOME_CA;
        assertEquals("69", enumType.toFIXIDString());
        assertEquals("HOME_CA", enumType.toFIXNameString());
        assertEquals("69 - Home Competent Authority (Home CA)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.CA_LIQUIDITY;
        assertEquals("70", enumType.toFIXIDString());
        assertEquals("CA_LIQUIDITY", enumType.toFIXNameString());
        assertEquals("70 - Competent Authority of the most relevant market in terms of liquidity (CAL)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.CA_TRANSACTION_VENUE;
        assertEquals("71", enumType.toFIXIDString());
        assertEquals("CA_TRANSACTION_VENUE", enumType.toFIXNameString());
        assertEquals("71 - Competent Authority of the Transaction (Execution) Venue (CATV)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.REPORTING_INTERMEDIARY;
        assertEquals("72", enumType.toFIXIDString());
        assertEquals("REPORTING_INTERMEDIARY", enumType.toFIXNameString());
        assertEquals("72 - Reporting intermediary (medium/vendor via which report has been published)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.EXECUTION_VENUE;
        assertEquals("73", enumType.toFIXIDString());
        assertEquals("EXECUTION_VENUE", enumType.toFIXNameString());
        assertEquals("73 - Execution Venue", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR;
        assertEquals("74", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_ENTRY_ORIGINATOR", enumType.toFIXNameString());
        assertEquals("74 - Market data entry originator", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.LOCATION_ID;
        assertEquals("75", enumType.toFIXIDString());
        assertEquals("LOCATION_ID", enumType.toFIXNameString());
        assertEquals("75 - Location ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumPartyRole.DESK_ID;
        assertEquals("76", enumType.toFIXIDString());
        assertEquals("DESK_ID", enumType.toFIXNameString());
        assertEquals("76 - Desk ID", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.MARKET_DATA_MARKET;
        assertEquals("77", enumType.toFIXIDString());
        assertEquals("MARKET_DATA_MARKET", enumType.toFIXNameString());
        assertEquals("77 - Market data market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumPartyRole.ALLOCATION_ENTITY;
        assertEquals("78", enumType.toFIXIDString());
        assertEquals("ALLOCATION_ENTITY", enumType.toFIXNameString());
        assertEquals("78 - Allocation Entity", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}