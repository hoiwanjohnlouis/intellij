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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyRole;
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
class Tag538EnuNestedPartyRoleTest {
    @Test
    void FIX0538Test() {
        FIX43 fixData = FIX43.FIX538_ENU_NESTED_PARTY_ROLE;
        assertEquals( "538", fixData.toFIXIDString());
        assertEquals( "NESTED_PARTY_ROLE", fixData.toFIXNameString());
        assertEquals( "NestedPartyRole", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0538Test() {
        Tag538EnuNestedPartyRole tagData;


        /*
         * 1-22, 24-78 msg types
         */


        /*
         *  1-22, msg types
         */
        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXECUTING_FIRM);
        assertEquals( MyEnumPartyRole.EXECUTING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.BROKER_OF_CREDIT);
        assertEquals( MyEnumPartyRole.BROKER_OF_CREDIT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CLIENT_ID);
        assertEquals( MyEnumPartyRole.CLIENT_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CLEARING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INVESTOR_ID);
        assertEquals( MyEnumPartyRole.INVESTOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INTRODUCING_FIRM);
        assertEquals( MyEnumPartyRole.INTRODUCING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ENTERING_FIRM);
        assertEquals( MyEnumPartyRole.ENTERING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.LENDING_FIRM);
        assertEquals( MyEnumPartyRole.LENDING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.FUND_MANAGER_CLIENT_ID);
        assertEquals( MyEnumPartyRole.FUND_MANAGER_CLIENT_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SETTLEMENT_LOCATION);
        assertEquals( MyEnumPartyRole.SETTLEMENT_LOCATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_TRADER);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_TRADER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXECUTING_TRADER);
        assertEquals( MyEnumPartyRole.EXECUTING_TRADER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_FIRM);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.GIVEUP_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.GIVEUP_CLEARING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXECUTING_SYSTEM);
        assertEquals( MyEnumPartyRole.EXECUTING_SYSTEM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_CLEARING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SPONSORING_FIRM);
        assertEquals( MyEnumPartyRole.SPONSORING_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.UNDERLYING_CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.UNDERLYING_CONTRA_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CLEARING_ORGANIZATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXCHANGE);
        assertEquals( MyEnumPartyRole.EXCHANGE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );



        /*
         *  24-78 msg types
         */
        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CUSTOMER_ACCOUNT);
        assertEquals( MyEnumPartyRole.CUSTOMER_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CORRESPONDENT_BROKER);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_BROKER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.BUYER_SELLER);
        assertEquals( MyEnumPartyRole.BUYER_SELLER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CUSTODIAN);
        assertEquals( MyEnumPartyRole.CUSTODIAN.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INTERMEDIARY);
        assertEquals( MyEnumPartyRole.INTERMEDIARY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.AGENT);
        assertEquals( MyEnumPartyRole.AGENT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SUB_CUSTODIAN);
        assertEquals( MyEnumPartyRole.SUB_CUSTODIAN.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.BENEFICIARY);
        assertEquals( MyEnumPartyRole.BENEFICIARY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INTERESTED_PARTY);
        assertEquals( MyEnumPartyRole.INTERESTED_PARTY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.REGULATORY_BODY);
        assertEquals( MyEnumPartyRole.REGULATORY_BODY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.LIQUIDITY_PROVIDER);
        assertEquals( MyEnumPartyRole.LIQUIDITY_PROVIDER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ENTERING_TRADER);
        assertEquals( MyEnumPartyRole.ENTERING_TRADER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_TRADER);
        assertEquals( MyEnumPartyRole.CONTRA_TRADER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.POSITION_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_INVESTOR_ID);
        assertEquals( MyEnumPartyRole.CONTRA_INVESTOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.TRANSFER_TO_FIRM);
        assertEquals( MyEnumPartyRole.TRANSFER_TO_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.CONTRA_POSITION_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CONTRA_EXCHANGE);
        assertEquals( MyEnumPartyRole.CONTRA_EXCHANGE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT);
        assertEquals( MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID);
        assertEquals( MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.FOREIGN_FIRM);
        assertEquals( MyEnumPartyRole.FOREIGN_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM);
        assertEquals( MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CLAIMING_ACCOUNT);
        assertEquals( MyEnumPartyRole.CLAIMING_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ASSET_MANAGER);
        assertEquals( MyEnumPartyRole.ASSET_MANAGER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.PLEDGOR_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGOR_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.PLEDGEE_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGEE_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT);
        assertEquals( MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.TRADER_MNEMONIC);
        assertEquals( MyEnumPartyRole.TRADER_MNEMONIC.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SENDER_LOCATION);
        assertEquals( MyEnumPartyRole.SENDER_LOCATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SESSION_ID);
        assertEquals( MyEnumPartyRole.SESSION_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ENTERING_UNIT);
        assertEquals( MyEnumPartyRole.ENTERING_UNIT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXECUTING_UNIT);
        assertEquals( MyEnumPartyRole.EXECUTING_UNIT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INTRODUCING_BROKER);
        assertEquals( MyEnumPartyRole.INTRODUCING_BROKER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.QUOTE_ORIGINATOR);
        assertEquals( MyEnumPartyRole.QUOTE_ORIGINATOR.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.REPORT_ORIGINATOR);
        assertEquals( MyEnumPartyRole.REPORT_ORIGINATOR.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.SYSTEMATIC_INTERNALISER);
        assertEquals( MyEnumPartyRole.SYSTEMATIC_INTERNALISER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY);
        assertEquals( MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.REGULATED_MARKET);
        assertEquals( MyEnumPartyRole.REGULATED_MARKET.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.MARKET_MAKER);
        assertEquals( MyEnumPartyRole.MARKET_MAKER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.INVESTMENT_FIRM);
        assertEquals( MyEnumPartyRole.INVESTMENT_FIRM.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.HOST_CA);
        assertEquals( MyEnumPartyRole.HOST_CA.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.HOME_CA);
        assertEquals( MyEnumPartyRole.HOME_CA.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CA_LIQUIDITY);
        assertEquals( MyEnumPartyRole.CA_LIQUIDITY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.CA_TRANSACTION_VENUE);
        assertEquals( MyEnumPartyRole.CA_TRANSACTION_VENUE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.REPORTING_INTERMEDIARY);
        assertEquals( MyEnumPartyRole.REPORTING_INTERMEDIARY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.EXECUTION_VENUE);
        assertEquals( MyEnumPartyRole.EXECUTION_VENUE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR);
        assertEquals( MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.LOCATION_ID);
        assertEquals( MyEnumPartyRole.LOCATION_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.DESK_ID);
        assertEquals( MyEnumPartyRole.DESK_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.MARKET_DATA_MARKET);
        assertEquals( MyEnumPartyRole.MARKET_DATA_MARKET.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag538EnuNestedPartyRole(MyEnumPartyRole.ALLOCATION_ENTITY);
        assertEquals( MyEnumPartyRole.ALLOCATION_ENTITY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag538EnuNestedPartyRole tagData;

        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag538EnuNestedPartyRole(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag538EnuNestedPartyRole tagData;

        // loop around the ENUM and process
        for (MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag538EnuNestedPartyRole(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag538EnuNestedPartyRole tagData;

        // loop around the ENUM and process
        for (MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag538EnuNestedPartyRole(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag538EnuNestedPartyRole tagData;

        // loop around the ENUM and process
        for (MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag538EnuNestedPartyRole(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag538EnuNestedPartyRole tagData;

        // loop around the ENUM and process
        for (MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag538EnuNestedPartyRole(oneEnum);
            assertEquals( "Tag538EnuNestedPartyRole\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}