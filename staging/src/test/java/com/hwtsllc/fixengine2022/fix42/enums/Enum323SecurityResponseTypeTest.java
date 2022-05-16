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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  323
 *  Enu
 *  SecurityResponseType
 *
 *      1-6 msg types
 *      ACCEPT_SECURITY_AS_IS( "1", "ACCEPT_SECURITY_AS_IS",
 *                          "1 - Accept security proposal as-is" ),
 *      ACCEPT_SECURITY_REVISIONS( "2", "ACCEPT_SECURITY_REVISIONS",
 *                          "2 - Accept security proposal with revisions as indicated in the message" ),
 *      LIST_OF_SECURITY_TYPES_RETURNED( "3", "LIST_OF_SECURITY_TYPES_RETURNED",
 *                          "3 - List of security types returned per request" ),
 *      LIST_OF_SECURITIES_RETURNED_PER_REQUEST( "4", "LIST_OF_SECURITIES_RETURNED_PER_REQUEST",
 *                          "4 - List of securities returned per request" ),
 *      REJECT_SECURITY_PROPOSAL( "5", "REJECT_SECURITY_PROPOSAL",
 *                          "5 - Reject security proposal" ),
 *      CANNOT_MATCH_SELECTION( "6", "CANNOT_MATCH_SELECTION",
 *                          "6 - Cannot match selection criteria" ),
 */
class Enum323SecurityResponseTypeTest {
    @Test
    void Enum0323Test() {
        Enum323SecurityResponseType enumType;

        /*
         * 1-6 msg types
         */
        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "ACCEPT_SECURITY_AS_IS", enumType.toFIXNameString());
        assertEquals( "1 - Accept security proposal as-is", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "ACCEPT_SECURITY_REVISIONS", enumType.toFIXNameString());
        assertEquals( "2 - Accept security proposal with revisions as indicated in the message",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "LIST_OF_SECURITY_TYPES_RETURNED", enumType.toFIXNameString());
        assertEquals( "3 - List of security types returned per request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "LIST_OF_SECURITIES_RETURNED_PER_REQUEST", enumType.toFIXNameString());
        assertEquals( "4 - List of securities returned per request", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "REJECT_SECURITY_PROPOSAL", enumType.toFIXNameString());
        assertEquals( "5 - Reject security proposal", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum323SecurityResponseType.CANNOT_MATCH_SELECTION;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "CANNOT_MATCH_SELECTION", enumType.toFIXNameString());
        assertEquals( "6 - Cannot match selection criteria", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}