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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum452PartyRoleTest {
    /**
     *  Information is the same for TAGS 452, 538
     */
    @Test
    void Enum0452Test() {
        Enum452PartyRole enumType;

        /*
         * 1-22, msg types
         */
        enumType = Enum452PartyRole.EXECUTING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,EXECUTING_FIRM,1 - Executing Firm (formerly FIX 4.2 ExecBroker)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BROKER_OF_CREDIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,BROKER_OF_CREDIT,2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLIENT_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,CLIENT_ID,3 - Client ID (formerly FIX 4.2 ClientID)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLEARING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,CLEARING_FIRM,4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INVESTOR_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,INVESTOR_ID,5 - Investor ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTRODUCING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,INTRODUCING_FIRM,6 - Introducing Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,ENTERING_FIRM,7 - Entering Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LENDING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,LENDING_FIRM,8 - Locate / Lending Firm (for short-sales)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.FUND_MANAGER_CLIENT_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,FUND_MANAGER_CLIENT_ID,9 - Fund Manager Client ID (for CIV)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SETTLEMENT_LOCATION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,SETTLEMENT_LOCATION,10 - Settlement Location (formerly FIX 4.2 SettlLocation)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.ORDER_ORIGINATION_TRADER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,ORDER_ORIGINATION_TRADER,11 - Order Origination Trader (associated with Order Origination Firm - i.e. trader who initiates/submits the order)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_TRADER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,ORDER_ORIGINATION_FIRM,13 - Order Origination Firm (e.g. buy-side firm)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ORDER_ORIGINATION_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,ORDER_ORIGINATION_FIRM,13 - Order Origination Firm (e.g. buy-side firm)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.GIVEUP_CLEARING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,GIVEUP_CLEARING_FIRM,14 - Giveup Clearing Firm (firm to which trade is given up)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_CLEARING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("15,CORRESPONDENT_CLEARING_FIRM,15 - Correspondent Clearing Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_SYSTEM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("16,EXECUTING_SYSTEM,16 - Executing System", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("17,CONTRA_FIRM,17 - Contra Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_CLEARING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("18,CONTRA_CLEARING_FIRM,18 - Contra Clearing Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SPONSORING_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("19,SPONSORING_FIRM,19 - Sponsoring Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.UNDERLYING_CONTRA_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("20,UNDERLYING_CONTRA_FIRM,20 - Underlying Contra Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLEARING_ORGANIZATION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("21,CLEARING_ORGANIZATION,21 - Clearing Organization", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXCHANGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("22,EXCHANGE,22 - Exchange", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         *  24-78 msg types
         */
        enumType = Enum452PartyRole.CUSTOMER_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("24,CUSTOMER_ACCOUNT,24 - Customer Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_CLEARING_ORGANIZATION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("25,CORRESPONDENT_CLEARING_ORGANIZATION,25 - Correspondent Clearing Organization", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CORRESPONDENT_BROKER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("26,CORRESPONDENT_BROKER,26 - Correspondent Broker", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BUYER_SELLER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("27,BUYER_SELLER,27 - Buyer/Seller (Receiver/Deliverer)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CUSTODIAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("28,CUSTODIAN,28 - Custodian", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERMEDIARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("29,INTERMEDIARY,29 - Intermediary", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.AGENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("30,AGENT,30 - Agent", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.SUB_CUSTODIAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("31,SUB_CUSTODIAN,31 - Sub-custodian", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.BENEFICIARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("32,BENEFICIARY,32 - Beneficiary", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERESTED_PARTY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("33,INTERESTED_PARTY,33 - Interested party", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REGULATORY_BODY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("34,REGULATORY_BODY,34 - Regulatory body", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LIQUIDITY_PROVIDER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("35,LIQUIDITY_PROVIDER,35 - Liquidity provider", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_TRADER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("36,ENTERING_TRADER,36 - Entering trader", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_TRADER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("37,CONTRA_TRADER,37 - Contra trader", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.POSITION_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("38,POSITION_ACCOUNT,38 - Position account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_INVESTOR_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("39,CONTRA_INVESTOR_ID,39 - Contra Investor ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.TRANSFER_TO_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("40,TRANSFER_TO_FIRM,40 - Transfer to Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.CONTRA_POSITION_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("41,CONTRA_POSITION_ACCOUNT,41 - Contra Position Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CONTRA_EXCHANGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("42,CONTRA_EXCHANGE,42 - Contra Exchange", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTERNAL_CARRY_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("43,INTERNAL_CARRY_ACCOUNT,43 - Internal Carry Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ORDER_ENTRY_OPERATOR_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("44,ORDER_ENTRY_OPERATOR_ID,44 - Order Entry Operator ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SECONDARY_ACCOUNT_NUMBER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("45,SECONDARY_ACCOUNT_NUMBER,45 - Secondary Account Number", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.FOREIGN_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("46,FOREIGN_FIRM,46 - Foreign Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.THIRD_PARTY_ALLOCATION_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("47,THIRD_PARTY_ALLOCATION_FIRM,47 - Third Party Allocation Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CLAIMING_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("48,CLAIMING_ACCOUNT,48 - Claiming Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ASSET_MANAGER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("49,ASSET_MANAGER,49 - Asset Manager", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.PLEDGOR_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("50,PLEDGOR_ACCOUNT,50 - Pledgor Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.PLEDGEE_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("51,PLEDGEE_ACCOUNT,51 - Pledgee Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("52,LARGE_TRADER_REPORTABLE_ACCOUNT,52 - Large Trader Reportable Account", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.TRADER_MNEMONIC;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("53,TRADER_MNEMONIC,53 - Trader mnemonic", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SENDER_LOCATION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("54,SENDER_LOCATION,54 - Sender Location", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SESSION_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("55,SESSION_ID,55 - Session ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ACCEPTABLE_COUNTERPARTY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("56,ACCEPTABLE_COUNTERPARTY,56 - Acceptable Counterparty", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.UNACCEPTABLE_COUNTERPARTY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("57,UNACCEPTABLE_COUNTERPARTY,57 - Unacceptable Counterparty", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ENTERING_UNIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("58,ENTERING_UNIT,58 - Entering Unit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTING_UNIT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("59,EXECUTING_UNIT,59 - Executing Unit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INTRODUCING_BROKER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("60,INTRODUCING_BROKER,60 - Introducing Broker", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.QUOTE_ORIGINATOR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("61,QUOTE_ORIGINATOR,61 - Quote originator", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REPORT_ORIGINATOR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("62,REPORT_ORIGINATOR,62 - Report originator", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.SYSTEMATIC_INTERNALISER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("63,SYSTEMATIC_INTERNALISER,63 - Systematic internaliser (SI)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MULTILATERAL_TRADING_FACILITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("64,MULTILATERAL_TRADING_FACILITY,64 - Multilateral Trading Facility (MTF)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REGULATED_MARKET;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("65,REGULATED_MARKET,65 - Regulated Market (RM)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_MAKER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("66,MARKET_MAKER,66 - Market Maker", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.INVESTMENT_FIRM;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("67,INVESTMENT_FIRM,67 - Investment Firm", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.HOST_CA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("68,HOST_CA,68 - Host Competent Authority (Host CA)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.HOME_CA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("69,HOME_CA,69 - Home Competent Authority (Home CA)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.CA_LIQUIDITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("70,CA_LIQUIDITY,70 - Competent Authority of the most relevant market in terms of liquidity (CAL)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum452PartyRole.CA_TRANSACTION_VENUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("71,CA_TRANSACTION_VENUE,71 - Competent Authority of the Transaction (Execution) Venue (CATV)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.REPORTING_INTERMEDIARY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("72,REPORTING_INTERMEDIARY,72 - Reporting intermediary (medium/vendor via which report has been published)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.EXECUTION_VENUE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("73,EXECUTION_VENUE,73 - Execution Venue", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_DATA_ENTRY_ORIGINATOR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("74,MARKET_DATA_ENTRY_ORIGINATOR,74 - Market data entry originator", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.LOCATION_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("75,LOCATION_ID,75 - Location ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.DESK_ID;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("76,DESK_ID,76 - Desk ID", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.MARKET_DATA_MARKET;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("77,MARKET_DATA_MARKET,77 - Market data market", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum452PartyRole.ALLOCATION_ENTITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("78,ALLOCATION_ENTITY,78 - Allocation Entity", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}