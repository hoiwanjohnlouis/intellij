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

import com.hwtsllc.fixengine2022.datatypes.MyEnumPartySubIDType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag1054EnuInstrumentPartySubIDTypeTest {
    Tag1054EnuInstrumentPartySubIDType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            assertEquals( "FIX1054_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE", tagData.toEnumLabelString());
            assertEquals( "1054", tagData.toEnumIDString());
            assertEquals( "INSTRUMENT_PARTY_SUB_ID_TYPE", tagData.toEnumNameString());
            assertEquals( "InstrumentPartySubIDType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Firm
         *  <p>    2 - Person
         *  <p>    3 - System
         *  <p>    4 - Application
         *  <p>    5 - Full legal name of firm
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType( MyEnumPartySubIDType.FIRM );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.PERSON);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.SYSTEM);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.APPLICATION);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    6 - Postal address
         *  <p>    7 - Phone number
         *  <p>    8 - Email address
         *  <p>    9 - Contact name
         *  <p>    10 - Securities account number (for settlement instructions)
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.POSTAL_ADDRESS);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.PHONE_NUMBER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.EMAIL_ADDRESS);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.CONTACT_NAME);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    11 - Registration number (for settlement instructions and confirmations)
         *  <p>    12 - Registered address (for confirmation purposes)
         *  <p>    13 - Regulatory status (for confirmation purposes)
         *  <p>    14 - Registration name (for settlement instructions)
         *  <p>    15 - Cash account number (for settlement instructions)
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NUMBER);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.REGULATORY_STATUS);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NAME);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER);
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    16 - BIC
         *  <p>    17 - CSD participant member code
         *  <p>    18 - Registered address
         *  <p>    19 - Fund account name
         *  <p>    20 - Telex number
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.BIC);
        assertEquals( "16", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.CSD);
        assertEquals( "17", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.FUND_ACCOUNT_NAME);
        assertEquals( "19", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.TELEX_NUMBER);
        assertEquals( "20", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    21 - Fax number
         *  <p>    22 - Securities account name
         *  <p>    23 - Cash account name
         *  <p>    24 - Department
         *  <p>    25 - Location desk
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.FAX_NUMBER);
        assertEquals( "21", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME);
        assertEquals( "22", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NAME);
        assertEquals( "23", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.DEPARTMENT);
        assertEquals( "24", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.LOCATION_DESK);
        assertEquals( "25", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    26 - Position account type
         *  <p>    27 - Security locate ID
         *  <p>    28 - Market maker
         *  <p>    29 - Eligible counterparty
         *  <p>    30 - Professional client
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE);
        assertEquals( "26", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.SECURITY_LOCATE_ID);
        assertEquals( "27", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.MARKET_MAKER);
        assertEquals( "28", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY);
        assertEquals( "29", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.PROFESSIONAL_CLIENT);
        assertEquals( "30", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    31 - Location
         *  <p>    32 - Execution venue
         *  <p>    or any value conforming to the data type Reserved4000Plus
         */
        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.LOCATION);
        assertEquals( "31", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054EnuInstrumentPartySubIDType(MyEnumPartySubIDType.EXECUTION_VENUE);
        assertEquals( "32", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag1054EnuInstrumentPartySubIDType(oneEnum);
            assertEquals( "Tag1054EnuInstrumentPartySubIDType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}