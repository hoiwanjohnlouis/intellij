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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.MyEnumPartySubIDType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag805EnuNestedPartySubIDTypeTest {
    Tag805EnuNestedPartySubIDType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag805EnuNestedPartySubIDType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag805EnuNestedPartySubIDType(oneEnum);
            assertEquals( "FIX805_ENU_NESTED_PARTY_SUB_ID_TYPE", tagData.toFIXLabelString());
            assertEquals( "805", tagData.toFIXIDString());
            assertEquals( "NESTED_PARTY_SUB_ID_TYPE", tagData.toFIXNameString());
            assertEquals( "NestedPartySubIDType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag805EnuNestedPartySubIDType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  805 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
         *  NestedPartySubIDType
         *  int
         *  <p>    1 - Firm
         *  <p>    2 - Person
         *  <p>    3 - System
         *  <p>    4 - Application
         *  <p>    5 - Full legal name of firm
         */
        tagData = new Tag805EnuNestedPartySubIDType( MyEnumPartySubIDType.FIRM );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.PERSON);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.SYSTEM);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.APPLICATION);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.FULL_LEGAL_NAME_OF_FIRM);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Postal address
         *  <p>    7 - Phone number
         *  <p>    8 - Email address
         *  <p>    9 - Contact name
         *  <p>    10 - Securities account number (for settlement instructions)
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.POSTAL_ADDRESS);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.PHONE_NUMBER);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.EMAIL_ADDRESS);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.CONTACT_NAME);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NUMBER);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Registration number (for settlement instructions and confirmations)
         *  <p>    12 - Registered address (for confirmation purposes)
         *  <p>    13 - Regulatory status (for confirmation purposes)
         *  <p>    14 - Registration name (for settlement instructions)
         *  <p>    15 - Cash account number (for settlement instructions)
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NUMBER);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS_FOR_CONFIRM);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.REGULATORY_STATUS);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.REGISTRATION_NAME);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NUMBER);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    16 - BIC
         *  <p>    17 - CSD participant member code
         *  <p>    18 - Registered address
         *  <p>    19 - Fund account name
         *  <p>    20 - Telex number
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.BIC);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.CSD);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.REGISTERED_ADDRESS);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.FUND_ACCOUNT_NAME);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.TELEX_NUMBER);
        assertEquals( "20", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    21 - Fax number
         *  <p>    22 - Securities account name
         *  <p>    23 - Cash account name
         *  <p>    24 - Department
         *  <p>    25 - Location desk
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.FAX_NUMBER);
        assertEquals( "21", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.SECURITIES_ACCOUNT_NAME);
        assertEquals( "22", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.CASH_ACCOUNT_NAME);
        assertEquals( "23", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.DEPARTMENT);
        assertEquals( "24", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.LOCATION_DESK);
        assertEquals( "25", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    26 - Position account type
         *  <p>    27 - Security locate ID
         *  <p>    28 - Market maker
         *  <p>    29 - Eligible counterparty
         *  <p>    30 - Professional client
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.POSITION_ACCOUNT_TYPE);
        assertEquals( "26", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.SECURITY_LOCATE_ID);
        assertEquals( "27", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.MARKET_MAKER);
        assertEquals( "28", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY);
        assertEquals( "29", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.PROFESSIONAL_CLIENT);
        assertEquals( "30", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    31 - Location
         *  <p>    32 - Execution venue
         *  <p>    or any value conforming to the data type Reserved4000Plus
         */
        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.LOCATION);
        assertEquals( "31", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag805EnuNestedPartySubIDType(MyEnumPartySubIDType.EXECUTION_VENUE);
        assertEquals( "32", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag805EnuNestedPartySubIDType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartySubIDType oneEnum : MyEnumPartySubIDType.values()) {
            tagData = new Tag805EnuNestedPartySubIDType(oneEnum);
            assertEquals( "Tag805EnuNestedPartySubIDType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}