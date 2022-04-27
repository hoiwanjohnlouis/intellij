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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum323SecurityResponseTypeTest {
    @Test
    void Enum0323Test() {
        Enum323SecurityResponseType enumType;

        /**
         * 1-6 msg types
         */
        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS;
        assertEquals( "1", enumType.getID());
        assertEquals( "ACCEPT_SECURITY_AS_IS", enumType.getName());
        assertEquals( "1 - Accept security proposal as-is", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS;
        assertEquals( "2", enumType.getID());
        assertEquals( "ACCEPT_SECURITY_REVISIONS", enumType.getName());
        assertEquals( "2 - Accept security proposal with revisions as indicated in the message",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED;
        assertEquals( "3", enumType.getID());
        assertEquals( "LIST_OF_SECURITY_TYPES_RETURNED", enumType.getName());
        assertEquals( "3 - List of security types returned per request", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST;
        assertEquals( "4", enumType.getID());
        assertEquals( "LIST_OF_SECURITIES_RETURNED_PER_REQUEST", enumType.getName());
        assertEquals( "4 - List of securities returned per request", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL;
        assertEquals( "5", enumType.getID());
        assertEquals( "REJECT_SECURITY_PROPOSAL", enumType.getName());
        assertEquals( "5 - Reject security proposal", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum323SecurityResponseType.CANNOT_MATCH_SELECTION;
        assertEquals( "6", enumType.getID());
        assertEquals( "CANNOT_MATCH_SELECTION", enumType.getName());
        assertEquals( "6 - Cannot match selection criteria", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}