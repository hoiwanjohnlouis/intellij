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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyRole;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
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
class Tag1061EnuUndlyInstrumentPartyRoleTest {
    @Test
    void FIX1061Test() {
        FIX50 fixData = FIX50.FIX1061_ENU_UNDLY_INSTRUMENT_PARTY_ROLE;
        assertEquals( "1061", fixData.getID());
        assertEquals( "UNDLY_INSTRUMENT_PARTY_ROLE", fixData.getName());
        assertEquals( "UndlyInstrumentPartyRole", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1061Test() {
        Tag1061EnuUndlyInstrumentPartyRole tagData;


        /**
         * 1-22, 24-78 msg types
         */


        /**
         *  1-22, msg types
         */
        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXECUTING_FIRM);
        assertEquals( MyEnumPartyRole.EXECUTING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.BROKER_OF_CREDIT);
        assertEquals( MyEnumPartyRole.BROKER_OF_CREDIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CLIENT_ID);
        assertEquals( MyEnumPartyRole.CLIENT_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INVESTOR_ID);
        assertEquals( MyEnumPartyRole.INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INTRODUCING_FIRM);
        assertEquals( MyEnumPartyRole.INTRODUCING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ENTERING_FIRM);
        assertEquals( MyEnumPartyRole.ENTERING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.LENDING_FIRM);
        assertEquals( MyEnumPartyRole.LENDING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.FUND_MANAGER_CLIENT_ID);
        assertEquals( MyEnumPartyRole.FUND_MANAGER_CLIENT_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SETTLEMENT_LOCATION);
        assertEquals( MyEnumPartyRole.SETTLEMENT_LOCATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_TRADER);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXECUTING_TRADER);
        assertEquals( MyEnumPartyRole.EXECUTING_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_FIRM);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.GIVEUP_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.GIVEUP_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXECUTING_SYSTEM);
        assertEquals( MyEnumPartyRole.EXECUTING_SYSTEM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SPONSORING_FIRM);
        assertEquals( MyEnumPartyRole.SPONSORING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.UNDERLYING_CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.UNDERLYING_CONTRA_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CLEARING_ORGANIZATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXCHANGE);
        assertEquals( MyEnumPartyRole.EXCHANGE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );



        /**
         *  24-78 msg types
         */
        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CUSTOMER_ACCOUNT);
        assertEquals( MyEnumPartyRole.CUSTOMER_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CORRESPONDENT_BROKER);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_BROKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.BUYER_SELLER);
        assertEquals( MyEnumPartyRole.BUYER_SELLER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CUSTODIAN);
        assertEquals( MyEnumPartyRole.CUSTODIAN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INTERMEDIARY);
        assertEquals( MyEnumPartyRole.INTERMEDIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.AGENT);
        assertEquals( MyEnumPartyRole.AGENT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SUB_CUSTODIAN);
        assertEquals( MyEnumPartyRole.SUB_CUSTODIAN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.BENEFICIARY);
        assertEquals( MyEnumPartyRole.BENEFICIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INTERESTED_PARTY);
        assertEquals( MyEnumPartyRole.INTERESTED_PARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.REGULATORY_BODY);
        assertEquals( MyEnumPartyRole.REGULATORY_BODY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.LIQUIDITY_PROVIDER);
        assertEquals( MyEnumPartyRole.LIQUIDITY_PROVIDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ENTERING_TRADER);
        assertEquals( MyEnumPartyRole.ENTERING_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_TRADER);
        assertEquals( MyEnumPartyRole.CONTRA_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.POSITION_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_INVESTOR_ID);
        assertEquals( MyEnumPartyRole.CONTRA_INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.TRANSFER_TO_FIRM);
        assertEquals( MyEnumPartyRole.TRANSFER_TO_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.CONTRA_POSITION_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CONTRA_EXCHANGE);
        assertEquals( MyEnumPartyRole.CONTRA_EXCHANGE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT);
        assertEquals( MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID);
        assertEquals( MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.FOREIGN_FIRM);
        assertEquals( MyEnumPartyRole.FOREIGN_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM);
        assertEquals( MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CLAIMING_ACCOUNT);
        assertEquals( MyEnumPartyRole.CLAIMING_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ASSET_MANAGER);
        assertEquals( MyEnumPartyRole.ASSET_MANAGER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.PLEDGOR_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGOR_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.PLEDGEE_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGEE_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT);
        assertEquals( MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.TRADER_MNEMONIC);
        assertEquals( MyEnumPartyRole.TRADER_MNEMONIC.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SENDER_LOCATION);
        assertEquals( MyEnumPartyRole.SENDER_LOCATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SESSION_ID);
        assertEquals( MyEnumPartyRole.SESSION_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ENTERING_UNIT);
        assertEquals( MyEnumPartyRole.ENTERING_UNIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXECUTING_UNIT);
        assertEquals( MyEnumPartyRole.EXECUTING_UNIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INTRODUCING_BROKER);
        assertEquals( MyEnumPartyRole.INTRODUCING_BROKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.QUOTE_ORIGINATOR);
        assertEquals( MyEnumPartyRole.QUOTE_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.REPORT_ORIGINATOR);
        assertEquals( MyEnumPartyRole.REPORT_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.SYSTEMATIC_INTERNALISER);
        assertEquals( MyEnumPartyRole.SYSTEMATIC_INTERNALISER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY);
        assertEquals( MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.REGULATED_MARKET);
        assertEquals( MyEnumPartyRole.REGULATED_MARKET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.MARKET_MAKER);
        assertEquals( MyEnumPartyRole.MARKET_MAKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.INVESTMENT_FIRM);
        assertEquals( MyEnumPartyRole.INVESTMENT_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.HOST_CA);
        assertEquals( MyEnumPartyRole.HOST_CA.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.HOME_CA);
        assertEquals( MyEnumPartyRole.HOME_CA.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CA_LIQUIDITY);
        assertEquals( MyEnumPartyRole.CA_LIQUIDITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.CA_TRANSACTION_VENUE);
        assertEquals( MyEnumPartyRole.CA_TRANSACTION_VENUE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.REPORTING_INTERMEDIARY);
        assertEquals( MyEnumPartyRole.REPORTING_INTERMEDIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.EXECUTION_VENUE);
        assertEquals( MyEnumPartyRole.EXECUTION_VENUE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR);
        assertEquals( MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.LOCATION_ID);
        assertEquals( MyEnumPartyRole.LOCATION_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.DESK_ID);
        assertEquals( MyEnumPartyRole.DESK_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.MARKET_DATA_MARKET);
        assertEquals( MyEnumPartyRole.MARKET_DATA_MARKET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1061EnuUndlyInstrumentPartyRole(MyEnumPartyRole.ALLOCATION_ENTITY);
        assertEquals( MyEnumPartyRole.ALLOCATION_ENTITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}