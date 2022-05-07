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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyRole;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  759 (same as 452, 538, 759, 784, 951, 1051, 1061, 1119)
 *  Nested2PartyRole
 *  PartyRole value within a "second instance" Nested repeating group.
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
public class Tag759EnuNested2PartyRole extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumPartyRole dataValue;

    public final static MyEnumPartyRole TESTA_ENU_NESTED_2_PARTY_ROLE
            = MyEnumPartyRole.THIRD_PARTY_ALLOCATION_FIRM;
    public final static MyEnumPartyRole TESTB_ENU_NESTED_2_PARTY_ROLE
            = MyEnumPartyRole.ALLOCATION_ENTITY;

    public Tag759EnuNested2PartyRole(MyEnumPartyRole dataValue) {
        setFixType(FIX44.FIX759_ENU_NESTED_2_PARTY_ROLE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag759EnuNested2PartyRole tagData;

        tagData = new Tag759EnuNested2PartyRole(TESTA_ENU_NESTED_2_PARTY_ROLE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag759EnuNested2PartyRole(TESTB_ENU_NESTED_2_PARTY_ROLE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
