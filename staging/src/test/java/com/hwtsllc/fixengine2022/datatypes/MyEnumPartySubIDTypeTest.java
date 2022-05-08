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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class MyEnumPartySubIDTypeTest {
    @Test
    void EnumTest() {
        MyEnumPartySubIDType enumType;

        /*
         *  1-32
         */
        enumType = MyEnumPartySubIDType.FIRM;
        assertEquals("1", enumType.getID());
        assertEquals("FIRM", enumType.getName());
        assertEquals("1 - Firm", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.PERSON;
        assertEquals("2", enumType.getID());
        assertEquals("PERSON", enumType.getName());
        assertEquals("2 - Person", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.SYSTEM;
        assertEquals("3", enumType.getID());
        assertEquals("SYSTEM", enumType.getName());
        assertEquals("3 - System", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.APPLICATION;
        assertEquals("4", enumType.getID());
        assertEquals("APPLICATION", enumType.getName());
        assertEquals("4 - Application", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM;
        assertEquals("5", enumType.getID());
        assertEquals("FULL_LEGAL_NAME_OF_FIRM", enumType.getName());
        assertEquals("5 - Full legal name of firm", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.POSTAL_ADDRESS;
        assertEquals("6", enumType.getID());
        assertEquals("POSTAL_ADDRESS", enumType.getName());
        assertEquals("6 - Postal address", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.PHONE_NUMBER;
        assertEquals("7", enumType.getID());
        assertEquals("PHONE_NUMBER", enumType.getName());
        assertEquals("7 - Phone number", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.EMAIL_ADDRESS;
        assertEquals("8", enumType.getID());
        assertEquals("EMAIL_ADDRESS", enumType.getName());
        assertEquals("8 - Email address", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.CONTACT_NAME;
        assertEquals("9", enumType.getID());
        assertEquals("CONTACT_NAME", enumType.getName());
        assertEquals("9 - Contact name", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER;
        assertEquals("10", enumType.getID());
        assertEquals("SECURITIES_ACCOUNT_NUMBER", enumType.getName());
        assertEquals("10 - Securities account number (for settlement instructions)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.REGISTRATION_NUMBER;
        assertEquals("11", enumType.getID());
        assertEquals("REGISTRATION_NUMBER", enumType.getName());
        assertEquals("11 - Registration number (for settlement instructions and confirmations)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM;
        assertEquals("12", enumType.getID());
        assertEquals("REGISTERED_ADDRESS_FOR_CONFIRM", enumType.getName());
        assertEquals("12 - Registered address (for confirmation purposes)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.REGULATORY_STATUS;
        assertEquals("13", enumType.getID());
        assertEquals("REGULATORY_STATUS", enumType.getName());
        assertEquals("13 - Regulatory status (for confirmation purposes)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.REGISTRATION_NAME;
        assertEquals("14", enumType.getID());
        assertEquals("REGISTRATION_NAME", enumType.getName());
        assertEquals("14 - Registration name (for settlement instructions)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER;
        assertEquals("15", enumType.getID());
        assertEquals("CASH_ACCOUNT_NUMBER", enumType.getName());
        assertEquals("15 - Cash account number (for settlement instructions)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.BIC;
        assertEquals("16", enumType.getID());
        assertEquals("BIC", enumType.getName());
        assertEquals("16 - BIC", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.CSD;
        assertEquals("17", enumType.getID());
        assertEquals("CSD", enumType.getName());
        assertEquals("17 - CSD participant member code", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.REGISTERED_ADDRESS;
        assertEquals("18", enumType.getID());
        assertEquals("REGISTERED_ADDRESS", enumType.getName());
        assertEquals("18 - Registered address", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.FUND_ACCOUNT_NAME;
        assertEquals("19", enumType.getID());
        assertEquals("FUND_ACCOUNT_NAME", enumType.getName());
        assertEquals("19 - Fund account name", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.TELEX_NUMBER;
        assertEquals("20", enumType.getID());
        assertEquals("TELEX_NUMBER", enumType.getName());
        assertEquals("20 - Telex number", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.FAX_NUMBER;
        assertEquals("21", enumType.getID());
        assertEquals("FAX_NUMBER", enumType.getName());
        assertEquals("21 - Fax number", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME;
        assertEquals("22", enumType.getID());
        assertEquals("SECURITIES_ACCOUNT_NAME", enumType.getName());
        assertEquals("22 - Securities account name", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.CASH_ACCOUNT_NAME;
        assertEquals("23", enumType.getID());
        assertEquals("CASH_ACCOUNT_NAME", enumType.getName());
        assertEquals("23 - Cash account name", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.DEPARTMENT;
        assertEquals("24", enumType.getID());
        assertEquals("DEPARTMENT", enumType.getName());
        assertEquals("24 - Department", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.LOCATION_DESK;
        assertEquals("25", enumType.getID());
        assertEquals("LOCATION_DESK", enumType.getName());
        assertEquals("25 - Location desk", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE;
        assertEquals("26", enumType.getID());
        assertEquals("POSITION_ACCOUNT_TYPE", enumType.getName());
        assertEquals("26 - Position account type", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.SECURITY_LOCATE_ID;
        assertEquals("27", enumType.getID());
        assertEquals("SECURITY_LOCATE_ID", enumType.getName());
        assertEquals("27 - Security locate ID", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.MARKET_MAKER;
        assertEquals("28", enumType.getID());
        assertEquals("MARKET_MAKER", enumType.getName());
        assertEquals("28 - Market maker", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY;
        assertEquals("29", enumType.getID());
        assertEquals("ELIGIBLE_COUNTERPARTY", enumType.getName());
        assertEquals("29 - Eligible counterparty", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.PROFESSIONAL_CLIENT;
        assertEquals("30", enumType.getID());
        assertEquals("PROFESSIONAL_CLIENT", enumType.getName());
        assertEquals("30 - Professional client", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumPartySubIDType.LOCATION;
        assertEquals("31", enumType.getID());
        assertEquals("LOCATION", enumType.getName());
        assertEquals("31 - Location", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumPartySubIDType.EXECUTION_VENUE;
        assertEquals("32", enumType.getID());
        assertEquals("EXECUTION_VENUE", enumType.getName());
        assertEquals("32 - Execution venue", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}