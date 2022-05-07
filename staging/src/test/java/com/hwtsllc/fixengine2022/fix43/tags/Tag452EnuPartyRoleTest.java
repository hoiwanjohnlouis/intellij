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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag452EnuPartyRoleTest {
    @Test
    void FIX0452Test() {
        FIX43 fixData = FIX43.FIX452_ENU_PARTY_ROLE;
        assertEquals( "452", fixData.getID());
        assertEquals( "PARTY_ROLE", fixData.getName());
        assertEquals( "PartyRole", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0452Test() {
        Tag452EnuPartyRole tagData;


        /**
         * 1-22, 24-78 msg types
         */


        /**
         *  1-22, msg types
         */
        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXECUTING_FIRM);
        assertEquals( MyEnumPartyRole.EXECUTING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.BROKER_OF_CREDIT);
        assertEquals( MyEnumPartyRole.BROKER_OF_CREDIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CLIENT_ID);
        assertEquals( MyEnumPartyRole.CLIENT_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INVESTOR_ID);
        assertEquals( MyEnumPartyRole.INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INTRODUCING_FIRM);
        assertEquals( MyEnumPartyRole.INTRODUCING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ENTERING_FIRM);
        assertEquals( MyEnumPartyRole.ENTERING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.LENDING_FIRM);
        assertEquals( MyEnumPartyRole.LENDING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.FUND_MANAGER_CLIENT_ID);
        assertEquals( MyEnumPartyRole.FUND_MANAGER_CLIENT_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SETTLEMENT_LOCATION);
        assertEquals( MyEnumPartyRole.SETTLEMENT_LOCATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_TRADER);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXECUTING_TRADER);
        assertEquals( MyEnumPartyRole.EXECUTING_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_FIRM);
        assertEquals( MyEnumPartyRole.ORDER_ORIGINATION_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.GIVEUP_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.GIVEUP_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXECUTING_SYSTEM);
        assertEquals( MyEnumPartyRole.EXECUTING_SYSTEM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_CLEARING_FIRM);
        assertEquals( MyEnumPartyRole.CONTRA_CLEARING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SPONSORING_FIRM);
        assertEquals( MyEnumPartyRole.SPONSORING_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.UNDERLYING_CONTRA_FIRM);
        assertEquals( MyEnumPartyRole.UNDERLYING_CONTRA_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CLEARING_ORGANIZATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXCHANGE);
        assertEquals( MyEnumPartyRole.EXCHANGE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );



        /**
         *  24-78 msg types
         */
        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CUSTOMER_ACCOUNT);
        assertEquals( MyEnumPartyRole.CUSTOMER_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CORRESPONDENT_BROKER);
        assertEquals( MyEnumPartyRole.CORRESPONDENT_BROKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.BUYER_SELLER);
        assertEquals( MyEnumPartyRole.BUYER_SELLER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CUSTODIAN);
        assertEquals( MyEnumPartyRole.CUSTODIAN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INTERMEDIARY);
        assertEquals( MyEnumPartyRole.INTERMEDIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.AGENT);
        assertEquals( MyEnumPartyRole.AGENT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SUB_CUSTODIAN);
        assertEquals( MyEnumPartyRole.SUB_CUSTODIAN.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.BENEFICIARY);
        assertEquals( MyEnumPartyRole.BENEFICIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INTERESTED_PARTY);
        assertEquals( MyEnumPartyRole.INTERESTED_PARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.REGULATORY_BODY);
        assertEquals( MyEnumPartyRole.REGULATORY_BODY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.LIQUIDITY_PROVIDER);
        assertEquals( MyEnumPartyRole.LIQUIDITY_PROVIDER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ENTERING_TRADER);
        assertEquals( MyEnumPartyRole.ENTERING_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_TRADER);
        assertEquals( MyEnumPartyRole.CONTRA_TRADER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.POSITION_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_INVESTOR_ID);
        assertEquals( MyEnumPartyRole.CONTRA_INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.TRANSFER_TO_FIRM);
        assertEquals( MyEnumPartyRole.TRANSFER_TO_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_POSITION_ACCOUNT);
        assertEquals( MyEnumPartyRole.CONTRA_POSITION_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CONTRA_EXCHANGE);
        assertEquals( MyEnumPartyRole.CONTRA_EXCHANGE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT);
        assertEquals( MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID);
        assertEquals( MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.FOREIGN_FIRM);
        assertEquals( MyEnumPartyRole.FOREIGN_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM);
        assertEquals( MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CLAIMING_ACCOUNT);
        assertEquals( MyEnumPartyRole.CLAIMING_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ASSET_MANAGER);
        assertEquals( MyEnumPartyRole.ASSET_MANAGER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.PLEDGOR_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGOR_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.PLEDGEE_ACCOUNT);
        assertEquals( MyEnumPartyRole.PLEDGEE_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT);
        assertEquals( MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.TRADER_MNEMONIC);
        assertEquals( MyEnumPartyRole.TRADER_MNEMONIC.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SENDER_LOCATION);
        assertEquals( MyEnumPartyRole.SENDER_LOCATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SESSION_ID);
        assertEquals( MyEnumPartyRole.SESSION_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY);
        assertEquals( MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ENTERING_UNIT);
        assertEquals( MyEnumPartyRole.ENTERING_UNIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXECUTING_UNIT);
        assertEquals( MyEnumPartyRole.EXECUTING_UNIT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INTRODUCING_BROKER);
        assertEquals( MyEnumPartyRole.INTRODUCING_BROKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.QUOTE_ORIGINATOR);
        assertEquals( MyEnumPartyRole.QUOTE_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.REPORT_ORIGINATOR);
        assertEquals( MyEnumPartyRole.REPORT_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.SYSTEMATIC_INTERNALISER);
        assertEquals( MyEnumPartyRole.SYSTEMATIC_INTERNALISER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY);
        assertEquals( MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.REGULATED_MARKET);
        assertEquals( MyEnumPartyRole.REGULATED_MARKET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.MARKET_MAKER);
        assertEquals( MyEnumPartyRole.MARKET_MAKER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.INVESTMENT_FIRM);
        assertEquals( MyEnumPartyRole.INVESTMENT_FIRM.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.HOST_CA);
        assertEquals( MyEnumPartyRole.HOST_CA.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.HOME_CA);
        assertEquals( MyEnumPartyRole.HOME_CA.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CA_LIQUIDITY);
        assertEquals( MyEnumPartyRole.CA_LIQUIDITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.CA_TRANSACTION_VENUE);
        assertEquals( MyEnumPartyRole.CA_TRANSACTION_VENUE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.REPORTING_INTERMEDIARY);
        assertEquals( MyEnumPartyRole.REPORTING_INTERMEDIARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.EXECUTION_VENUE);
        assertEquals( MyEnumPartyRole.EXECUTION_VENUE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR);
        assertEquals( MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.LOCATION_ID);
        assertEquals( MyEnumPartyRole.LOCATION_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.DESK_ID);
        assertEquals( MyEnumPartyRole.DESK_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.MARKET_DATA_MARKET);
        assertEquals( MyEnumPartyRole.MARKET_DATA_MARKET.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag452EnuPartyRole(MyEnumPartyRole.ALLOCATION_ENTITY);
        assertEquals( MyEnumPartyRole.ALLOCATION_ENTITY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}