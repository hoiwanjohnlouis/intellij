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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  786 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
 *  Valid values:
 *      1 - Firm
 *      2 - Person
 *      3 - System
 *      4 - Application
 *      5 - Full legal name of firm
 *      6 - Postal address
 *      7 - Phone number
 *      8 - Email address
 *      9 - Contact name
 *      10 - Securities account number (for settlement instructions)
 *      11 - Registration number (for settlement instructions and confirmations)
 *      12 - Registered address (for confirmation purposes)
 *      13 - Regulatory status (for confirmation purposes)
 *      14 - Registration name (for settlement instructions)
 *      15 - Cash account number (for settlement instructions)
 *      16 - BIC
 *      17 - CSD participant member code
 *      18 - Registered address
 *      19 - Fund account name
 *      20 - Telex number
 *      21 - Fax number
 *      22 - Securities account name
 *      23 - Cash account name
 *      24 - Department
 *      25 - Location desk
 *      26 - Position account type
 *      27 - Security locate ID
 *      28 - Market maker
 *      29 - Eligible counterparty
 *      30 - Professional client
 *      31 - Location
 *      32 - Execution venue
 *
 *  or any value conforming to the data type Reserved4000Plus
 */
public enum MyEnumPartySubIDType implements EnumAccessors, LogStringVerbose {
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
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
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
