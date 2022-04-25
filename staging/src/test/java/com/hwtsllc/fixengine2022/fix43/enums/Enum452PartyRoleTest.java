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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum452PartyRoleTest {
    /**
     *  452 (same as 452, 538, 759, 784, 951, 1051, 1061, 1119)
     *  Identifies the type or role of the PartyID (448) specified.
     *  See "Appendix 6-G – Use of <Parties> Component Block"
     *          (see Volume : "Glossary" for value definitions)
     *              Same values as  PartyRole (452)
     *  Valid values:
     *      1 - Executing Firm (formerly FIX 4.2 ExecBroker)
     *      2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)
     *      3 - Client ID (formerly FIX 4.2 ClientID)
     *      4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)
     *      5 - Investor ID
     *      6 - Introducing Firm
     *      7 - Entering Firm
     *      8 - Locate / Lending Firm (for short-sales)
     *      9 - Fund Manager Client ID (for CIV)
     *      10 - Settlement Location (formerly FIX 4.2 SettlLocation)
     *      11 - Order Origination Trader
     *              (associated with Order Origination Firm
     *                  - i.e. trader who initiates/submits the order)
     *      12 - Executing Trader
     *              (associated with Executing Firm - actually executes)
     *      13 - Order Origination Firm (e.g. buy-side firm)
     *      14 - Giveup Clearing Firm (firm to which trade is given up)
     *      15 - Correspondant Clearing Firm
     *      16 - Executing System
     *      17 - Contra Firm
     *      18 - Contra Clearing Firm
     *      19 - Sponsoring Firm
     *      20 - Underlying Contra Firm
     *      21 - Clearing Organization
     *      22 - Exchange
     *      24 - Customer Account
     *      25 - Correspondent Clearing Organization
     *      26 - Correspondent Broker
     *      27 - Buyer/Seller (Receiver/Deliverer)
     *      28 - Custodian
     *      29 - Intermediary
     *      30 - Agent
     *      31 - Sub-custodian
     *      32 - Beneficiary
     *      33 - Interested party
     *      34 - Regulatory body
     *      35 - Liquidity provider
     *      36 - Entering trader
     *      37 - Contra trader
     *      38 - Position account
     *      39 - Contra Investor ID
     *      40 - Transfer to Firm
     *      41 - Contra Position Account
     *      42 - Contra Exchange
     *      43 - Internal Carry Account
     *      44 - Order Entry Operator ID
     *      45 - Secondary Account Number
     *      46 - Foreign Firm
     *      47 - Third Party Allocation Firm
     *      48 - Claiming Account
     *      49 - Asset Manager
     *      50 - Pledgor Account
     *      51 - Pledgee Account
     *      52 - Large Trader Reportable Account
     *      53 - Trader mnemonic
     *      54 - Sender Location
     *      55 - Session ID
     *      56 - Acceptable Counterparty
     *      57 - Unacceptable Counterparty
     *      58 - Entering Unit
     *      59 - Executing Unit
     *      60 - Introducing Broker
     *      61 - Quote originator
     *      62 - Report originator
     *      63 - Systematic internaliser (SI)
     *      64 - Multilateral Trading Facility (MTF)
     *      65 - Regulated Market (RM)
     *      66 - Market Maker
     *      67 - Investment Firm
     *      68 - Host Competent Authority (Host CA)
     *      69 - Home Competent Authority (Home CA)
     *      70 - Competent Authority of the most relevant market in terms of liquidity
     *              (CAL)
     *      71 - Competent Authority of the Transaction (Execution) Venue
     *              (CATV)
     *      72 - Reporting intermediary
     *              (medium/vendor via which report has been published)
     *      73 - Execution Venue
     *      74 - Market data entry originator
     *      75 - Location ID
     *      76 - Desk ID
     *      77 - Market data market
     *      78 - Allocation Entity
     */
    @Test
    void Enum0452Test() {
        Enum452PartyRole enumType;

        /*
         * 1-22, 24-78 msg types
         */


        /*
         * 1-22, msg types
         */
        enumType = Enum452PartyRole.EXECUTING_FIRM;
        assertEquals("1", enumType.getID());
        assertEquals("EXECUTING_FIRM", enumType.getName());
        assertEquals("1 - Executing Firm (formerly FIX 4.2 ExecBroker)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BROKER_OF_CREDIT;
        assertEquals("2", enumType.getID());
        assertEquals("BROKER_OF_CREDIT", enumType.getName());
        assertEquals("2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLIENT_ID;
        assertEquals("3", enumType.getID());
        assertEquals("CLIENT_ID", enumType.getName());
        assertEquals("3 - Client ID (formerly FIX 4.2 ClientID)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLEARING_FIRM;
        assertEquals("4", enumType.getID());
        assertEquals("CLEARING_FIRM", enumType.getName());
        assertEquals("4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INVESTOR_ID;
        assertEquals("5", enumType.getID());
        assertEquals("INVESTOR_ID", enumType.getName());
        assertEquals("5 - Investor ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTRODUCING_FIRM;
        assertEquals("6", enumType.getID());
        assertEquals("INTRODUCING_FIRM", enumType.getName());
        assertEquals("6 - Introducing Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_FIRM;
        assertEquals("7", enumType.getID());
        assertEquals("ENTERING_FIRM", enumType.getName());
        assertEquals("7 - Entering Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LENDING_FIRM;
        assertEquals("8", enumType.getID());
        assertEquals("LENDING_FIRM", enumType.getName());
        assertEquals("8 - Locate / Lending Firm (for short-sales)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.FUND_MANAGER_CLIENT_ID;
        assertEquals("9", enumType.getID());
        assertEquals("FUND_MANAGER_CLIENT_ID", enumType.getName());
        assertEquals("9 - Fund Manager Client ID (for CIV)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SETTLEMENT_LOCATION;
        assertEquals("10", enumType.getID());
        assertEquals("SETTLEMENT_LOCATION", enumType.getName());
        assertEquals("10 - Settlement Location (formerly FIX 4.2 SettlLocation)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.ORDER_ORIGINATION_TRADER;
        assertEquals("11", enumType.getID());
        assertEquals("ORDER_ORIGINATION_TRADER", enumType.getName());
        assertEquals("11 - Order Origination Trader " +
                        "(associated with Order Origination Firm - i.e. trader who initiates/submits the order)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_TRADER;
        assertEquals("12", enumType.getID());
        assertEquals("EXECUTING_TRADER", enumType.getName());
        assertEquals("12 - Executing Trader (associated with Executing Firm - actually executes)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ORDER_ORIGINATION_FIRM;
        assertEquals("13", enumType.getID());
        assertEquals("ORDER_ORIGINATION_FIRM", enumType.getName());
        assertEquals("13 - Order Origination Firm (e.g. buy-side firm)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.GIVEUP_CLEARING_FIRM;
        assertEquals("14", enumType.getID());
        assertEquals("GIVEUP_CLEARING_FIRM", enumType.getName());
        assertEquals("14 - Giveup Clearing Firm (firm to which trade is given up)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_CLEARING_FIRM;
        assertEquals("15", enumType.getID());
        assertEquals("CORRESPONDENT_CLEARING_FIRM", enumType.getName());
        assertEquals("15 - Correspondent Clearing Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_SYSTEM;
        assertEquals("16", enumType.getID());
        assertEquals("EXECUTING_SYSTEM", enumType.getName());
        assertEquals("16 - Executing System", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_FIRM;
        assertEquals("17", enumType.getID());
        assertEquals("CONTRA_FIRM", enumType.getName());
        assertEquals("17 - Contra Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_CLEARING_FIRM;
        assertEquals("18", enumType.getID());
        assertEquals("CONTRA_CLEARING_FIRM", enumType.getName());
        assertEquals("18 - Contra Clearing Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SPONSORING_FIRM;
        assertEquals("19", enumType.getID());
        assertEquals("SPONSORING_FIRM", enumType.getName());
        assertEquals("19 - Sponsoring Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.UNDERLYING_CONTRA_FIRM;
        assertEquals("20", enumType.getID());
        assertEquals("UNDERLYING_CONTRA_FIRM", enumType.getName());
        assertEquals("20 - Underlying Contra Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.CLEARING_ORGANIZATION;
        assertEquals("21", enumType.getID());
        assertEquals("CLEARING_ORGANIZATION", enumType.getName());
        assertEquals("21 - Clearing Organization", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXCHANGE;
        assertEquals("22", enumType.getID());
        assertEquals("EXCHANGE", enumType.getName());
        assertEquals("22 - Exchange", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  24-78 msg types
         */
        enumType = Enum452PartyRole.CUSTOMER_ACCOUNT;
        assertEquals("24", enumType.getID());
        assertEquals("CUSTOMER_ACCOUNT", enumType.getName());
        assertEquals("24 - Customer Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_CLEARING_ORGANIZATION;
        assertEquals("25", enumType.getID());
        assertEquals("CORRESPONDENT_CLEARING_ORGANIZATION", enumType.getName());
        assertEquals("25 - Correspondent Clearing Organization", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_BROKER;
        assertEquals("26", enumType.getID());
        assertEquals("CORRESPONDENT_BROKER", enumType.getName());
        assertEquals("26 - Correspondent Broker", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BUYER_SELLER;
        assertEquals("27", enumType.getID());
        assertEquals("BUYER_SELLER", enumType.getName());
        assertEquals("27 - Buyer/Seller (Receiver/Deliverer)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CUSTODIAN;
        assertEquals("28", enumType.getID());
        assertEquals("CUSTODIAN", enumType.getName());
        assertEquals("28 - Custodian", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERMEDIARY;
        assertEquals("29", enumType.getID());
        assertEquals("INTERMEDIARY", enumType.getName());
        assertEquals("29 - Intermediary", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.AGENT;
        assertEquals("30", enumType.getID());
        assertEquals("AGENT", enumType.getName());
        assertEquals("30 - Agent", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.SUB_CUSTODIAN;
        assertEquals("31", enumType.getID());
        assertEquals("SUB_CUSTODIAN", enumType.getName());
        assertEquals("31 - Sub-custodian", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BENEFICIARY;
        assertEquals("32", enumType.getID());
        assertEquals("BENEFICIARY", enumType.getName());
        assertEquals("32 - Beneficiary", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERESTED_PARTY;
        assertEquals("33", enumType.getID());
        assertEquals("INTERESTED_PARTY", enumType.getName());
        assertEquals("33 - Interested party", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REGULATORY_BODY;
        assertEquals("34", enumType.getID());
        assertEquals("REGULATORY_BODY", enumType.getName());
        assertEquals("34 - Regulatory body", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LIQUIDITY_PROVIDER;
        assertEquals("35", enumType.getID());
        assertEquals("LIQUIDITY_PROVIDER", enumType.getName());
        assertEquals("35 - Liquidity provider", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_TRADER;
        assertEquals("36", enumType.getID());
        assertEquals("ENTERING_TRADER", enumType.getName());
        assertEquals("36 - Entering trader", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_TRADER;
        assertEquals("37", enumType.getID());
        assertEquals("CONTRA_TRADER", enumType.getName());
        assertEquals("37 - Contra trader", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.POSITION_ACCOUNT;
        assertEquals("38", enumType.getID());
        assertEquals("POSITION_ACCOUNT", enumType.getName());
        assertEquals("38 - Position account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_INVESTOR_ID;
        assertEquals("39", enumType.getID());
        assertEquals("CONTRA_INVESTOR_ID", enumType.getName());
        assertEquals("39 - Contra Investor ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.TRANSFER_TO_FIRM;
        assertEquals("40", enumType.getID());
        assertEquals("TRANSFER_TO_FIRM", enumType.getName());
        assertEquals("40 - Transfer to Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.CONTRA_POSITION_ACCOUNT;
        assertEquals("41", enumType.getID());
        assertEquals("CONTRA_POSITION_ACCOUNT", enumType.getName());
        assertEquals("41 - Contra Position Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_EXCHANGE;
        assertEquals("42", enumType.getID());
        assertEquals("CONTRA_EXCHANGE", enumType.getName());
        assertEquals("42 - Contra Exchange", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERNAL_CARRY_ACCOUNT;
        assertEquals("43", enumType.getID());
        assertEquals("INTERNAL_CARRY_ACCOUNT", enumType.getName());
        assertEquals("43 - Internal Carry Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ORDER_ENTRY_OPERATOR_ID;
        assertEquals("44", enumType.getID());
        assertEquals("ORDER_ENTRY_OPERATOR_ID", enumType.getName());
        assertEquals("44 - Order Entry Operator ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SECONDARY_ACCOUNT_NUMBER;
        assertEquals("45", enumType.getID());
        assertEquals("SECONDARY_ACCOUNT_NUMBER", enumType.getName());
        assertEquals("45 - Secondary Account Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.FOREIGN_FIRM;
        assertEquals("46", enumType.getID());
        assertEquals("FOREIGN_FIRM", enumType.getName());
        assertEquals("46 - Foreign Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.THIRD_PARTY_ALLOCATION_FIRM;
        assertEquals("47", enumType.getID());
        assertEquals("THIRD_PARTY_ALLOCATION_FIRM", enumType.getName());
        assertEquals("47 - Third Party Allocation Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLAIMING_ACCOUNT;
        assertEquals("48", enumType.getID());
        assertEquals("CLAIMING_ACCOUNT", enumType.getName());
        assertEquals("48 - Claiming Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ASSET_MANAGER;
        assertEquals("49", enumType.getID());
        assertEquals("ASSET_MANAGER", enumType.getName());
        assertEquals("49 - Asset Manager", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.PLEDGOR_ACCOUNT;
        assertEquals("50", enumType.getID());
        assertEquals("PLEDGOR_ACCOUNT", enumType.getName());
        assertEquals("50 - Pledgor Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.PLEDGEE_ACCOUNT;
        assertEquals("51", enumType.getID());
        assertEquals("PLEDGEE_ACCOUNT", enumType.getName());
        assertEquals("51 - Pledgee Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT;
        assertEquals("52", enumType.getID());
        assertEquals("LARGE_TRADER_REPORTABLE_ACCOUNT", enumType.getName());
        assertEquals("52 - Large Trader Reportable Account", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.TRADER_MNEMONIC;
        assertEquals("53", enumType.getID());
        assertEquals("TRADER_MNEMONIC", enumType.getName());
        assertEquals("53 - Trader mnemonic", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SENDER_LOCATION;
        assertEquals("54", enumType.getID());
        assertEquals("SENDER_LOCATION", enumType.getName());
        assertEquals("54 - Sender Location", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SESSION_ID;
        assertEquals("55", enumType.getID());
        assertEquals("SESSION_ID", enumType.getName());
        assertEquals("55 - Session ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ACCEPTABLE_COUNTERPARTY;
        assertEquals("56", enumType.getID());
        assertEquals("ACCEPTABLE_COUNTERPARTY", enumType.getName());
        assertEquals("56 - Acceptable Counterparty", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.UNACCEPTABLE_COUNTERPARTY;
        assertEquals("57", enumType.getID());
        assertEquals("UNACCEPTABLE_COUNTERPARTY", enumType.getName());
        assertEquals("57 - Unacceptable Counterparty", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_UNIT;
        assertEquals("58", enumType.getID());
        assertEquals("ENTERING_UNIT", enumType.getName());
        assertEquals("58 - Entering Unit", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_UNIT;
        assertEquals("59", enumType.getID());
        assertEquals("EXECUTING_UNIT", enumType.getName());
        assertEquals("59 - Executing Unit", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTRODUCING_BROKER;
        assertEquals("60", enumType.getID());
        assertEquals("INTRODUCING_BROKER", enumType.getName());
        assertEquals("60 - Introducing Broker", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.QUOTE_ORIGINATOR;
        assertEquals("61", enumType.getID());
        assertEquals("QUOTE_ORIGINATOR", enumType.getName());
        assertEquals("61 - Quote originator", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REPORT_ORIGINATOR;
        assertEquals("62", enumType.getID());
        assertEquals("REPORT_ORIGINATOR", enumType.getName());
        assertEquals("62 - Report originator", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SYSTEMATIC_INTERNALISER;
        assertEquals("63", enumType.getID());
        assertEquals("SYSTEMATIC_INTERNALISER", enumType.getName());
        assertEquals("63 - Systematic internaliser (SI)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MULTILATERAL_TRADING_FACILITY;
        assertEquals("64", enumType.getID());
        assertEquals("MULTILATERAL_TRADING_FACILITY", enumType.getName());
        assertEquals("64 - Multilateral Trading Facility (MTF)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REGULATED_MARKET;
        assertEquals("65", enumType.getID());
        assertEquals("REGULATED_MARKET", enumType.getName());
        assertEquals("65 - Regulated Market (RM)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_MAKER;
        assertEquals("66", enumType.getID());
        assertEquals("MARKET_MAKER", enumType.getName());
        assertEquals("66 - Market Maker", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INVESTMENT_FIRM;
        assertEquals("67", enumType.getID());
        assertEquals("INVESTMENT_FIRM", enumType.getName());
        assertEquals("67 - Investment Firm", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.HOST_CA;
        assertEquals("68", enumType.getID());
        assertEquals("HOST_CA", enumType.getName());
        assertEquals("68 - Host Competent Authority (Host CA)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.HOME_CA;
        assertEquals("69", enumType.getID());
        assertEquals("HOME_CA", enumType.getName());
        assertEquals("69 - Home Competent Authority (Home CA)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CA_LIQUIDITY;
        assertEquals("70", enumType.getID());
        assertEquals("CA_LIQUIDITY", enumType.getName());
        assertEquals("70 - Competent Authority of the most relevant market in terms of liquidity (CAL)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.CA_TRANSACTION_VENUE;
        assertEquals("71", enumType.getID());
        assertEquals("CA_TRANSACTION_VENUE", enumType.getName());
        assertEquals("71 - Competent Authority of the Transaction (Execution) Venue (CATV)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REPORTING_INTERMEDIARY;
        assertEquals("72", enumType.getID());
        assertEquals("REPORTING_INTERMEDIARY", enumType.getName());
        assertEquals("72 - Reporting intermediary (medium/vendor via which report has been published)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTION_VENUE;
        assertEquals("73", enumType.getID());
        assertEquals("EXECUTION_VENUE", enumType.getName());
        assertEquals("73 - Execution Venue", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_DATA_ENTRY_ORIGINATOR;
        assertEquals("74", enumType.getID());
        assertEquals("MARKET_DATA_ENTRY_ORIGINATOR", enumType.getName());
        assertEquals("74 - Market data entry originator", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LOCATION_ID;
        assertEquals("75", enumType.getID());
        assertEquals("LOCATION_ID", enumType.getName());
        assertEquals("75 - Location ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.DESK_ID;
        assertEquals("76", enumType.getID());
        assertEquals("DESK_ID", enumType.getName());
        assertEquals("76 - Desk ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_DATA_MARKET;
        assertEquals("77", enumType.getID());
        assertEquals("MARKET_DATA_MARKET", enumType.getName());
        assertEquals("77 - Market data market", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ALLOCATION_ENTITY;
        assertEquals("78", enumType.getID());
        assertEquals("ALLOCATION_ENTITY", enumType.getName());
        assertEquals("78 - Allocation Entity", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}