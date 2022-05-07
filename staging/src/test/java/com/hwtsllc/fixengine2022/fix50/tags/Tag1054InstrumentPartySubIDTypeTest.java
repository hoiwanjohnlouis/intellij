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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartySubIDType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1054 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
 *  InstrumentPartySubIDType
 *  Type of InstrumentPartySubID (1053) value.
 *          Same values as  PartySubIDType (803)
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
class Tag1054InstrumentPartySubIDTypeTest {
    @Test
    void FIX1054Test() {
        FIX50 fixData = FIX50.FIX1054_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE;
        assertEquals( "1054", fixData.getID());
        assertEquals( "INSTRUMENT_PARTY_SUB_ID_TYPE", fixData.getName());
        assertEquals( "InstrumentPartySubIdType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1054Test() {
        Tag1054InstrumentPartySubIDType tagData;

        /**
         *  1-32
         */
        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.FIRM);
        assertEquals( MyEnumPartySubIDType.FIRM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.PERSON);
        assertEquals( MyEnumPartySubIDType.PERSON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.SYSTEM);
        assertEquals( MyEnumPartySubIDType.SYSTEM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.APPLICATION);
        assertEquals( MyEnumPartySubIDType.APPLICATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM);
        assertEquals( MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.POSTAL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.POSTAL_ADDRESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.PHONE_NUMBER);
        assertEquals( MyEnumPartySubIDType.PHONE_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.EMAIL_ADDRESS);
        assertEquals( MyEnumPartySubIDType.EMAIL_ADDRESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.CONTACT_NAME);
        assertEquals( MyEnumPartySubIDType.CONTACT_NAME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NUMBER);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.REGULATORY_STATUS);
        assertEquals( MyEnumPartySubIDType.REGULATORY_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NAME);
        assertEquals( MyEnumPartySubIDType.REGISTRATION_NAME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.BIC);
        assertEquals( MyEnumPartySubIDType.BIC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.CSD);
        assertEquals( MyEnumPartySubIDType.CSD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS);
        assertEquals( MyEnumPartySubIDType.REGISTERED_ADDRESS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.FUND_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.FUND_ACCOUNT_NAME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.TELEX_NUMBER);
        assertEquals( MyEnumPartySubIDType.TELEX_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.FAX_NUMBER);
        assertEquals( MyEnumPartySubIDType.FAX_NUMBER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NAME);
        assertEquals( MyEnumPartySubIDType.CASH_ACCOUNT_NAME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.DEPARTMENT);
        assertEquals( MyEnumPartySubIDType.DEPARTMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.LOCATION_DESK);
        assertEquals( MyEnumPartySubIDType.LOCATION_DESK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE);
        assertEquals( MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.SECURITY_LOCATE_ID);
        assertEquals( MyEnumPartySubIDType.SECURITY_LOCATE_ID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.MARKET_MAKER);
        assertEquals( MyEnumPartySubIDType.MARKET_MAKER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY);
        assertEquals( MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.PROFESSIONAL_CLIENT);
        assertEquals( MyEnumPartySubIDType.PROFESSIONAL_CLIENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.LOCATION);
        assertEquals( MyEnumPartySubIDType.LOCATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType.EXECUTION_VENUE);
        assertEquals( MyEnumPartySubIDType.EXECUTION_VENUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}