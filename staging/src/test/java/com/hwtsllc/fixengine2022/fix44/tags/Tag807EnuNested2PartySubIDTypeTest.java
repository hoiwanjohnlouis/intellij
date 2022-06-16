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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
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
class Tag807EnuNested2PartySubIDTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX807_ENU_NESTED_2_PARTY_SUB_ID_TYPE;
        assertEquals( "807", fixData.toFIXIDString());
        assertEquals( "NESTED_2_PARTY_SUB_ID_TYPE", fixData.toFIXNameString());
        assertEquals( "Nested2PartySubIDType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0807Test() {
        Tag807EnuNested2PartySubIDType tagData;
        Enum665ConfirmStatus oneElement;

        /*
         *  1-32
         */
        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.FIRM);
        assertEquals( MyEnumPartySubIDType.FIRM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "807", fixData.toFIXIDString());
        assertEquals( "NESTED_2_PARTY_SUB_ID_TYPE", fixData.toFIXNameString());
        assertEquals( "Nested2PartySubIDType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.PERSON);
        assertEquals( MyEnumPartySubIDType.PERSON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.SYSTEM);
        assertEquals( MyEnumPartySubIDType.SYSTEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.APPLICATION);
        assertEquals( MyEnumPartySubIDType.APPLICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM);
        assertEquals( MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.POSTAL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.POSTAL_ADDRESS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.PHONE_NUMBER);
        assertEquals( MyEnumPartySubIDType.PHONE_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.EMAIL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.EMAIL_ADDRESS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.CONTACT_NAME);
        assertEquals( MyEnumPartySubIDType.CONTACT_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.REGISTRATION_NUMBER);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.REGULATORY_STATUS);
        assertEquals( MyEnumPartySubIDType.REGULATORY_STATUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.REGISTRATION_NAME);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.BIC);
        assertEquals( MyEnumPartySubIDType.BIC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.CSD);
        assertEquals( MyEnumPartySubIDType.CSD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.FUND_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.FUND_ACCOUNT_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.TELEX_NUMBER);
        assertEquals( MyEnumPartySubIDType.TELEX_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.FAX_NUMBER);
        assertEquals( MyEnumPartySubIDType.FAX_NUMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NAME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.DEPARTMENT);
        assertEquals( MyEnumPartySubIDType.DEPARTMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.LOCATION_DESK);
        assertEquals( MyEnumPartySubIDType.LOCATION_DESK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE);
        assertEquals( MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.SECURITY_LOCATE_ID);
        assertEquals( MyEnumPartySubIDType.SECURITY_LOCATE_ID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.MARKET_MAKER);
        assertEquals( MyEnumPartySubIDType.MARKET_MAKER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY);
        assertEquals( MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.PROFESSIONAL_CLIENT);
        assertEquals( MyEnumPartySubIDType.PROFESSIONAL_CLIENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.LOCATION);
        assertEquals( MyEnumPartySubIDType.LOCATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag807EnuNested2PartySubIDType(MyEnumPartySubIDType.EXECUTION_VENUE);
        assertEquals( MyEnumPartySubIDType.EXECUTION_VENUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag807EnuNested2PartySubIDType tagData;

        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag807EnuNested2PartySubIDType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag807EnuNested2PartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag807EnuNested2PartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag807EnuNested2PartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag807EnuNested2PartySubIDType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag807EnuNested2PartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag807EnuNested2PartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag807EnuNested2PartySubIDType tagData;

        // loop around the ENUM and process
        for (MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag807EnuNested2PartySubIDType(oneEnum);
            assertEquals( "Tag807EnuNested2PartySubIDType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}