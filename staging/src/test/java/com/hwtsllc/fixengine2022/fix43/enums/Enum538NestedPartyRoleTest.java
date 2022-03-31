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

import org.junit.jupiter.api.Test;

class Enum538NestedPartyRoleTest {
    /**
     *  Information is the same for TAGS 452, 538
     */
    @Test
    void Enum0538Test() {
        Enum538NestedPartyRole enumType;

        /*
         * 1-22, 24-78 msg types
         */
        enumType = Enum538NestedPartyRole.EXECUTING_FIRM;
        enumType = Enum538NestedPartyRole.BROKER_OF_CREDIT;
        enumType = Enum538NestedPartyRole.CLIENT_ID;
        enumType = Enum538NestedPartyRole.CLEARING_FIRM;
        enumType = Enum538NestedPartyRole.INVESTOR_ID;
        enumType = Enum538NestedPartyRole.INTRODUCING_FIRM;
        enumType = Enum538NestedPartyRole.ENTERING_FIRM;
        enumType = Enum538NestedPartyRole.LENDING_FIRM;
        enumType = Enum538NestedPartyRole.FUND_MANAGER_CLIENT_ID;
        enumType = Enum538NestedPartyRole.SETTLEMENT_LOCATION;

        enumType = Enum538NestedPartyRole.ORDER_ORIGINATION_TRADER;
        enumType = Enum538NestedPartyRole.EXECUTING_TRADER;
        enumType = Enum538NestedPartyRole.ORDER_ORIGINATION_FIRM;
        enumType = Enum538NestedPartyRole.GIVEUP_CLEARING_FIRM;
        enumType = Enum538NestedPartyRole.CORRESPONDENT_CLEARING_FIRM;
        enumType = Enum538NestedPartyRole.EXECUTING_SYSTEM;
        enumType = Enum538NestedPartyRole.CONTRA_FIRM;
        enumType = Enum538NestedPartyRole.CONTRA_CLEARING_FIRM;
        enumType = Enum538NestedPartyRole.SPONSORING_FIRM;
        enumType = Enum538NestedPartyRole.UNDERLYING_CONTRA_FIRM;

        enumType = Enum538NestedPartyRole.CLEARING_ORGANIZATION;
        enumType = Enum538NestedPartyRole.EXCHANGE;
        enumType = Enum538NestedPartyRole.CUSTOMER_ACCOUNT;
        enumType = Enum538NestedPartyRole.CORRESPONDENT_CLEARING_ORGANIZATION;
        enumType = Enum538NestedPartyRole.CORRESPONDENT_BROKER;
        enumType = Enum538NestedPartyRole.BUYER_SELLER;
        enumType = Enum538NestedPartyRole.CUSTODIAN;
        enumType = Enum538NestedPartyRole.INTERMEDIARY;
        enumType = Enum538NestedPartyRole.AGENT;

        enumType = Enum538NestedPartyRole.SUB_CUSTODIAN;
        enumType = Enum538NestedPartyRole.BENEFICIARY;
        enumType = Enum538NestedPartyRole.INTERESTED_PARTY;
        enumType = Enum538NestedPartyRole.REGULATORY_BODY;
        enumType = Enum538NestedPartyRole.LIQUIDITY_PROVIDER;
        enumType = Enum538NestedPartyRole.ENTERING_TRADER;
        enumType = Enum538NestedPartyRole.CONTRA_TRADER;
        enumType = Enum538NestedPartyRole.POSITION_ACCOUNT;
        enumType = Enum538NestedPartyRole.CONTRA_INVESTOR_ID;
        enumType = Enum538NestedPartyRole.TRANSFER_TO_FIRM;

        enumType = Enum538NestedPartyRole.CONTRA_POSITION_ACCOUNT;
        enumType = Enum538NestedPartyRole.CONTRA_EXCHANGE;
        enumType = Enum538NestedPartyRole.INTERNAL_CARRY_ACCOUNT;
        enumType = Enum538NestedPartyRole.ORDER_ENTRY_OPERATOR_ID;
        enumType = Enum538NestedPartyRole.SECONDARY_ACCOUNT_NUMBER;
        enumType = Enum538NestedPartyRole.FOREIGN_FIRM;
        enumType = Enum538NestedPartyRole.THIRD_PARTY_ALLOCATION_FIRM;
        enumType = Enum538NestedPartyRole.CLAIMING_ACCOUNT;
        enumType = Enum538NestedPartyRole.ASSET_MANAGER;
        enumType = Enum538NestedPartyRole.PLEDGOR_ACCOUNT;

        enumType = Enum538NestedPartyRole.PLEDGEE_ACCOUNT;
        enumType = Enum538NestedPartyRole.LARGE_TRADER_REPORTABLE_ACCOUNT;
        enumType = Enum538NestedPartyRole.TRADER_MNEMONIC;
        enumType = Enum538NestedPartyRole.SENDER_LOCATION;
        enumType = Enum538NestedPartyRole.SESSION_ID;
        enumType = Enum538NestedPartyRole.ACCEPTABLE_COUNTERPARTY;
        enumType = Enum538NestedPartyRole.UNACCEPTABLE_COUNTERPARTY;
        enumType = Enum538NestedPartyRole.ENTERING_UNIT;
        enumType = Enum538NestedPartyRole.EXECUTING_UNIT;
        enumType = Enum538NestedPartyRole.INTRODUCING_BROKER;

        enumType = Enum538NestedPartyRole.QUOTE_ORIGINATOR;
        enumType = Enum538NestedPartyRole.REPORT_ORIGINATOR;
        enumType = Enum538NestedPartyRole.SYSTEMATIC_INTERNALISER;
        enumType = Enum538NestedPartyRole.MULTILATERAL_TRADING_FACILITY;
        enumType = Enum538NestedPartyRole.REGULATED_MARKET;
        enumType = Enum538NestedPartyRole.MARKET_MAKER;
        enumType = Enum538NestedPartyRole.INVESTMENT_FIRM;
        enumType = Enum538NestedPartyRole.HOST_CA;
        enumType = Enum538NestedPartyRole.HOME_CA;
        enumType = Enum538NestedPartyRole.CA_LIQUIDITY;

        enumType = Enum538NestedPartyRole.CA_TRANSACTION_VENUE;
        enumType = Enum538NestedPartyRole.REPORTING_INTERMEDIARY;
        enumType = Enum538NestedPartyRole.EXECUTION_VENUE;
        enumType = Enum538NestedPartyRole.MARKET_DATA_ENTRY_ORIGINATOR;
        enumType = Enum538NestedPartyRole.LOCATION_ID;
        enumType = Enum538NestedPartyRole.DESK_ID;
        enumType = Enum538NestedPartyRole.MARKET_DATA_MARKET;
        enumType = Enum538NestedPartyRole.ALLOCATION_ENTITY;
    }
}