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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyRole;
import com.hwtsllc.fixengine2022.fix50.tags.Tag1119EnuRootPartyRole;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag784EnuSettlPartyRoleTest {
    Tag784EnuSettlPartyRole tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag784EnuSettlPartyRole(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag784EnuSettlPartyRole(oneEnum);
            assertEquals( "FIX784_ENU_SETTL_PARTY_ROLE", tagData.toEnumLabelString());
            assertEquals( "784", tagData.toEnumIDString());
            assertEquals( "SETTL_PARTY_ROLE", tagData.toEnumNameString());
            assertEquals( "SettlPartyRole", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag784EnuSettlPartyRole(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  784 (same as 452, 538, 759, 784, 951, 1051, 1061, 1119)
         *  SettlPartyRole
         *  int
         *  <p>    1 - Executing Firm (formerly FIX 4.2 ExecBroker)
         *  <p>    2 - Broker of Credit (formerly FIX 4.2 BrokerOfCredit)
         *  <p>    3 - Client ID (formerly FIX 4.2 ClientID)
         *  <p>    4 - Clearing Firm (formerly FIX 4.2 ClearingFirm)
         *  <p>    5 - Investor ID
         */
        tagData = new Tag784EnuSettlPartyRole( MyEnumPartyRole.EXECUTING_FIRM );
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.BROKER_OF_CREDIT);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CLIENT_ID);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CLEARING_FIRM);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INVESTOR_ID);
        assertEquals( "5", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    6 - Introducing Firm
         *  <p>    7 - Entering Firm
         *  <p>    8 - Locate / Lending Firm (for short-sales)
         *  <p>    9 - Fund Manager Client ID (for CIV)
         *  <p>    10 - Settlement Location (formerly FIX 4.2 SettlLocation)
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INTRODUCING_FIRM);
        assertEquals( "6", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ENTERING_FIRM);
        assertEquals( "7", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.LENDING_FIRM);
        assertEquals( "8", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.FUND_MANAGER_CLIENT_ID);
        assertEquals( "9", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SETTLEMENT_LOCATION);
        assertEquals( "10", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    11 - Order Origination Trader
         *              (associated with Order Origination Firm
         *                  - i.e. trader who initiates/submits the order)
         *  <p>    12 - Executing Trader
         *              (associated with Executing Firm - actually executes)
         *  <p>    13 - Order Origination Firm (e.g. buy-side firm)
         *  <p>    14 - Giveup Clearing Firm (firm to which trade is given up)
         *  <p>    15 - Correspondent Clearing Firm
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_TRADER);
        assertEquals( "11", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.EXECUTING_TRADER);
        assertEquals( "12", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ORDER_ORIGINATION_FIRM);
        assertEquals( "13", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.GIVEUP_CLEARING_FIRM);
        assertEquals( "14", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_FIRM);
        assertEquals( "15", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    16 - Executing System
         *  <p>    17 - Contra Firm
         *  <p>    18 - Contra Clearing Firm
         *  <p>    19 - Sponsoring Firm
         *  <p>    20 - Underlying Contra Firm
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.EXECUTING_SYSTEM);
        assertEquals( "16", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_FIRM);
        assertEquals( "17", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_CLEARING_FIRM);
        assertEquals( "18", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SPONSORING_FIRM);
        assertEquals( "19", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.UNDERLYING_CONTRA_FIRM);
        assertEquals( "20", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    21 - Clearing Organization
         *  <p>    22 - Exchange
         *  <p>    23 - NOT DEFINED
         *  <p>    24 - Customer Account
         *  <p>    25 - Correspondent Clearing Organization
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CLEARING_ORGANIZATION);
        assertEquals( "21", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.EXCHANGE);
        assertEquals( "22", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        //  <p>    23 - NOT DEFINED

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CUSTOMER_ACCOUNT);
        assertEquals( "24", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION);
        assertEquals( "25", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    26 - Correspondent Broker
         *  <p>    27 - Buyer/Seller (Receiver/Deliverer)
         *  <p>    28 - Custodian
         *  <p>    29 - Intermediary
         *  <p>    30 - Agent
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CORRESPONDENT_BROKER);
        assertEquals( "26", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.BUYER_SELLER);
        assertEquals( "27", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CUSTODIAN);
        assertEquals( "28", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INTERMEDIARY);
        assertEquals( "29", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.AGENT);
        assertEquals( "30", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    31 - Sub-custodian
         *  <p>    32 - Beneficiary
         *  <p>    33 - Interested party
         *  <p>    34 - Regulatory body
         *  <p>    35 - Liquidity provider
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SUB_CUSTODIAN);
        assertEquals( "31", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.BENEFICIARY);
        assertEquals( "32", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INTERESTED_PARTY);
        assertEquals( "33", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.REGULATORY_BODY);
        assertEquals( "34", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.LIQUIDITY_PROVIDER);
        assertEquals( "35", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    36 - Entering trader
         *  <p>    37 - Contra trader
         *  <p>    38 - Position account
         *  <p>    39 - Contra Investor ID
         *  <p>    40 - Transfer to Firm
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ENTERING_TRADER);
        assertEquals( "36", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_TRADER);
        assertEquals( "37", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.POSITION_ACCOUNT);
        assertEquals( "38", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_INVESTOR_ID);
        assertEquals( "39", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.TRANSFER_TO_FIRM);
        assertEquals( "40", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    41 - Contra Position Account
         *  <p>    42 - Contra Exchange
         *  <p>    43 - Internal Carry Account
         *  <p>    44 - Order Entry Operator ID
         *  <p>    45 - Secondary Account Number
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_POSITION_ACCOUNT);
        assertEquals( "41", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CONTRA_EXCHANGE);
        assertEquals( "42", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INTERNAL_CARRY_ACCOUNT);
        assertEquals( "43", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ORDER_ENTRY_OPERATOR_ID);
        assertEquals( "44", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SECONDARY_ACCOUNT_NUMBER);
        assertEquals( "45", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    46 - Foreign Firm
         *  <p>    47 - Third Party Allocation Firm
         *  <p>    48 - Claiming Account
         *  <p>    49 - Asset Manager
         *  <p>    50 - Pledgor Account
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.FOREIGN_FIRM);
        assertEquals( "46", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM);
        assertEquals( "47", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CLAIMING_ACCOUNT);
        assertEquals( "48", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ASSET_MANAGER);
        assertEquals( "49", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.PLEDGOR_ACCOUNT);
        assertEquals( "50", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    51 - Pledgee Account
         *  <p>    52 - Large Trader Reportable Account
         *  <p>    53 - Trader mnemonic
         *  <p>    54 - Sender Location
         *  <p>    55 - Session ID
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.PLEDGEE_ACCOUNT);
        assertEquals( "51", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT);
        assertEquals( "52", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.TRADER_MNEMONIC);
        assertEquals( "53", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SENDER_LOCATION);
        assertEquals( "54", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SESSION_ID);
        assertEquals( "55", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    56 - Acceptable Counterparty
         *  <p>    57 - Unacceptable Counterparty
         *  <p>    58 - Entering Unit
         *  <p>    59 - Executing Unit
         *  <p>    60 - Introducing Broker
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY);
        assertEquals( "56", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.UNACCEPTABLE_COUNTERPARTY);
        assertEquals( "57", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ENTERING_UNIT);
        assertEquals( "58", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.EXECUTING_UNIT);
        assertEquals( "59", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INTRODUCING_BROKER);
        assertEquals( "60", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    61 - Quote originator
         *  <p>    62 - Report originator
         *  <p>    63 - Systematic internaliser (SI)
         *  <p>    64 - Multilateral Trading Facility (MTF)
         *  <p>    65 - Regulated Market (RM)
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.QUOTE_ORIGINATOR);
        assertEquals( "61", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.REPORT_ORIGINATOR);
        assertEquals( "62", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.SYSTEMATIC_INTERNALISER);
        assertEquals( "63", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.MULTILATERAL_TRADING_FACILITY);
        assertEquals( "64", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.REGULATED_MARKET);
        assertEquals( "65", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    66 - Market Maker
         *  <p>    67 - Investment Firm
         *  <p>    68 - Host Competent Authority (Host CA)
         *  <p>    69 - Home Competent Authority (Home CA)
         *  <p>    70 - Competent Authority of the most relevant market in terms of liquidity
         *              (CAL)
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.MARKET_MAKER);
        assertEquals( "66", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.INVESTMENT_FIRM);
        assertEquals( "67", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.HOST_CA);
        assertEquals( "68", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.HOME_CA);
        assertEquals( "69", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CA_LIQUIDITY);
        assertEquals( "70", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    71 - Competent Authority of the Transaction (Execution) Venue
         *              (CATV)
         *  <p>    72 - Reporting intermediary
         *              (medium/vendor via which report has been published)
         *  <p>    73 - Execution Venue
         *  <p>    74 - Market data entry originator
         *  <p>    75 - Location ID
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.CA_TRANSACTION_VENUE);
        assertEquals( "71", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.REPORTING_INTERMEDIARY);
        assertEquals( "72", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.EXECUTION_VENUE);
        assertEquals( "73", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.MARKET_DATA_ENTRY_ORIGINATOR);
        assertEquals( "74", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.LOCATION_ID);
        assertEquals( "75", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    76 - Desk ID
         *  <p>    77 - Market data market
         *  <p>    78 - Allocation Entity
         */
        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.DESK_ID);
        assertEquals( "76", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.MARKET_DATA_MARKET);
        assertEquals( "77", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag784EnuSettlPartyRole(MyEnumPartyRole.ALLOCATION_ENTITY);
        assertEquals( "78", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag784EnuSettlPartyRole(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            tagData = new Tag784EnuSettlPartyRole(oneEnum);
            assertEquals( "Tag784EnuSettlPartyRole\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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