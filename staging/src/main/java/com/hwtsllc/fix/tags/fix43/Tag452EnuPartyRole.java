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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyEnumPartyRole;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

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
public class Tag452EnuPartyRole extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumPartyRole dataValue;

    public final static MyEnumPartyRole TESTA_ENU_PARTY_ROLE
            = MyEnumPartyRole.ACCEPTABLE_COUNTERPARTY;
    public final static MyEnumPartyRole TESTB_ENU_PARTY_ROLE
            = MyEnumPartyRole.CONTRA_CLEARING_FIRM;

    public Tag452EnuPartyRole(MyEnumPartyRole dataValue) {
        setFixType(FIX43.FIX452_ENU_PARTY_ROLE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag452EnuPartyRole tagData;

        tagData = new Tag452EnuPartyRole(TESTA_ENU_PARTY_ROLE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag452EnuPartyRole(TESTB_ENU_PARTY_ROLE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumPartyRole oneEnum : MyEnumPartyRole.values()) {
            System.out.println( new Tag452EnuPartyRole(oneEnum).toVerboseString() );
        }
    }
}
