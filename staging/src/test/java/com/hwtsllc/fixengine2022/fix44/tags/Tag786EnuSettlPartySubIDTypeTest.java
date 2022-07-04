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
class Tag786EnuSettlPartySubIDTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX786_ENU_SETTL_PARTY_SUB_ID_TYPE;
        assertEquals( "786", fixData.toEnumIDString());
        assertEquals( "SETTL_PARTY_SUB_ID_TYPE", fixData.toEnumNameString());
        assertEquals( "SettlPartySubIDType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0786Test() {
        Tag786EnuSettlPartySubIDType tagData;
        MyEnumPartySubIDType oneElement;

        /*
         *  1-32
         */
        oneElement = MyEnumPartySubIDType.FIRM;
        tagData = new Tag786EnuSettlPartySubIDType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "786", tagData.toEnumIDString());
        assertEquals( "SETTL_PARTY_SUB_ID_TYPE", tagData.toEnumNameString());
        assertEquals( "SettlPartySubIDType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.PERSON);
        assertEquals( MyEnumPartySubIDType.PERSON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.SYSTEM);
        assertEquals( MyEnumPartySubIDType.SYSTEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.APPLICATION);
        assertEquals( MyEnumPartySubIDType.APPLICATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM);
        assertEquals( MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.POSTAL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.POSTAL_ADDRESS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.PHONE_NUMBER);
        assertEquals( MyEnumPartySubIDType.PHONE_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.EMAIL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.EMAIL_ADDRESS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.CONTACT_NAME);
        assertEquals( MyEnumPartySubIDType.CONTACT_NAME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NUMBER);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.REGULATORY_STATUS);
        assertEquals( MyEnumPartySubIDType.REGULATORY_STATUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NAME);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NAME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.BIC);
        assertEquals( MyEnumPartySubIDType.BIC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.CSD);
        assertEquals( MyEnumPartySubIDType.CSD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.FUND_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.FUND_ACCOUNT_NAME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.TELEX_NUMBER);
        assertEquals( MyEnumPartySubIDType.TELEX_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.FAX_NUMBER);
        assertEquals( MyEnumPartySubIDType.FAX_NUMBER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NAME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.DEPARTMENT);
        assertEquals( MyEnumPartySubIDType.DEPARTMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.LOCATION_DESK);
        assertEquals( MyEnumPartySubIDType.LOCATION_DESK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE);
        assertEquals( MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.SECURITY_LOCATE_ID);
        assertEquals( MyEnumPartySubIDType.SECURITY_LOCATE_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.MARKET_MAKER);
        assertEquals( MyEnumPartySubIDType.MARKET_MAKER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY);
        assertEquals( MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.PROFESSIONAL_CLIENT);
        assertEquals( MyEnumPartySubIDType.PROFESSIONAL_CLIENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.LOCATION);
        assertEquals( MyEnumPartySubIDType.LOCATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag786EnuSettlPartySubIDType(MyEnumPartySubIDType.EXECUTION_VENUE);
        assertEquals( MyEnumPartySubIDType.EXECUTION_VENUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag786EnuSettlPartySubIDType tagData;

        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag786EnuSettlPartySubIDType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag786EnuSettlPartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag786EnuSettlPartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag786EnuSettlPartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag786EnuSettlPartySubIDType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag786EnuSettlPartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag786EnuSettlPartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag786EnuSettlPartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag786EnuSettlPartySubIDType(oneEnum);
            assertEquals( "Tag786EnuSettlPartySubIDType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}