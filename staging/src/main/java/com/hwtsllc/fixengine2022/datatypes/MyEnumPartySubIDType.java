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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  786 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
 *  SettlPartySubIDType
 *  int
 *  <p>
 *  Type of SettlPartySubID (785) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  803
 *  PartySubIDType
 *  int
 *  <p>
 *  Type of PartySubID (523) value
 *  <p>
 *  4000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  <p></p>
 *  805
 *  NestedPartySubIDType
 *  int
 *  <p>
 *  Type of NestedPartySubID (545) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  807
 *  Nested2PartySubIDType
 *  int
 *  <p>
 *  Type of Nested2PartySubID (760) value. Second instance of <NestedParties>.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  954
 *  Nested3PartySubIDType
 *  int
 *  <p>
 *  PartySubIDType value within a "third instance" Nested repeating group.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1054
 *  InstrumentPartySubIDType
 *  int
 *  <p>
 *  Type of InstrumentPartySubID (1053) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1064
 *  UndlyInstrumentPartySubIDType
 *  int
 *  <p>
 *  Type of underlying InstrumentPartySubID (1053) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1122
 *  RootPartySubIDType
 *  int
 *  <p>
 *  Type of RootPartySubID (1121) value.
 *  <p>
 *  Same values as PartySubIDType (803)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Firm
 *  <p>    2 - Person
 *  <p>    3 - System
 *  <p>    4 - Application
 *  <p>    5 - Full legal name of firm
 *  <p></p>
 *  <p>    6 - Postal address
 *  <p>    7 - Phone number
 *  <p>    8 - Email address
 *  <p>    9 - Contact name
 *  <p>    10 - Securities account number (for settlement instructions)
 *  <p></p>
 *  <p>    11 - Registration number (for settlement instructions and confirmations)
 *  <p>    12 - Registered address (for confirmation purposes)
 *  <p>    13 - Regulatory status (for confirmation purposes)
 *  <p>    14 - Registration name (for settlement instructions)
 *  <p>    15 - Cash account number (for settlement instructions)
 *  <p></p>
 *  <p>    16 - BIC
 *  <p>    17 - CSD participant member code
 *  <p>    18 - Registered address
 *  <p>    19 - Fund account name
 *  <p>    20 - Telex number
 *  <p></p>
 *  <p>    21 - Fax number
 *  <p>    22 - Securities account name
 *  <p>    23 - Cash account name
 *  <p>    24 - Department
 *  <p>    25 - Location desk
 *  <p></p>
 *  <p>    26 - Position account type
 *  <p>    27 - Security locate ID
 *  <p>    28 - Market maker
 *  <p>    29 - Eligible counterparty
 *  <p>    30 - Professional client
 *  <p></p>
 *  <p>    31 - Location
 *  <p>    32 - Execution venue
 *  <p>
 *  <p>    or any value conforming to the data type Reserved4000Plus
 */
public enum MyEnumPartySubIDType implements LogFIXString, LogVerboseString {
    FIRM( "1", "FIRM", "1 - Firm" ),
    PERSON( "2", "PERSON", "2 - Person" ),
    SYSTEM( "3", "SYSTEM", "3 - System" ),
    APPLICATION( "4", "APPLICATION", "4 - Application" ),
    FULL_LEGAL_NAME_OF_FIRM( "5", "FULL_LEGAL_NAME_OF_FIRM", "5 - Full legal name of firm" ),

    POSTAL_ADDRESS( "6", "POSTAL_ADDRESS", "6 - Postal address" ),
    PHONE_NUMBER( "7", "PHONE_NUMBER", "7 - Phone number" ),
    EMAIL_ADDRESS( "8", "EMAIL_ADDRESS", "8 - Email address" ),
    CONTACT_NAME( "9", "CONTACT_NAME", "9 - Contact name" ),
    SECURITIES_ACCOUNT_NUMBER( "10", "SECURITIES_ACCOUNT_NUMBER", "10 - Securities account number (for settlement instructions)" ),

    REGISTRATION_NUMBER( "11", "REGISTRATION_NUMBER", "11 - Registration number (for settlement instructions and confirmations)" ),
    REGISTERED_ADDRESS_FOR_CONFIRM( "12", "REGISTERED_ADDRESS_FOR_CONFIRM", "12 - Registered address (for confirmation purposes)" ),
    REGULATORY_STATUS( "13", "REGULATORY_STATUS", "13 - Regulatory status (for confirmation purposes)" ),
    REGISTRATION_NAME( "14", "REGISTRATION_NAME", "14 - Registration name (for settlement instructions)" ),
    CASH_ACCOUNT_NUMBER( "15", "CASH_ACCOUNT_NUMBER", "15 - Cash account number (for settlement instructions)" ),

    BIC( "16", "BIC", "16 - BIC" ),
    CSD( "17", "CSD", "17 - CSD participant member code" ),
    REGISTERED_ADDRESS( "18", "REGISTERED_ADDRESS", "18 - Registered address" ),
    FUND_ACCOUNT_NAME( "19", "FUND_ACCOUNT_NAME", "19 - Fund account name" ),
    TELEX_NUMBER( "20", "TELEX_NUMBER", "20 - Telex number" ),

    FAX_NUMBER( "21", "FAX_NUMBER", "21 - Fax number" ),
    SECURITIES_ACCOUNT_NAME( "22", "SECURITIES_ACCOUNT_NAME", "22 - Securities account name" ),
    CASH_ACCOUNT_NAME( "23", "CASH_ACCOUNT_NAME", "23 - Cash account name" ),
    DEPARTMENT( "24", "DEPARTMENT", "24 - Department" ),
    LOCATION_DESK( "25", "LOCATION_DESK", "25 - Location desk" ),

    POSITION_ACCOUNT_TYPE( "26", "POSITION_ACCOUNT_TYPE", "26 - Position account type" ),
    SECURITY_LOCATE_ID( "27", "SECURITY_LOCATE_ID", "27 - Security locate ID" ),
    MARKET_MAKER( "28", "MARKET_MAKER", "28 - Market maker" ),
    ELIGIBLE_COUNTERPARTY( "29", "ELIGIBLE_COUNTERPARTY", "29 - Eligible counterparty" ),
    PROFESSIONAL_CLIENT( "30", "PROFESSIONAL_CLIENT", "30 - Professional client" ),

    LOCATION( "31", "LOCATION", "31 - Location" ),
    EXECUTION_VENUE( "32", "EXECUTION_VENUE", "32 - Execution venue" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumPartySubIDType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            System.out.println(oneEnum);
        }
    }
}
