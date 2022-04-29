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

class Enum291FinancialStatusTest {
    /**
     *  291
     *  FinancialStatus
     *
     *      1-3 msg types
     *      BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
     *      PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
     *      RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
     */
    @Test
    void Enum0291Test() {
        Enum291FinancialStatus enumType;

        /**
         * 1-3 msg types
         */
        enumType = Enum291FinancialStatus.BANKRUPT;
        assertEquals( "1", enumType.getID());
        assertEquals( "BANKRUPT", enumType.getName());
        assertEquals( "1 - Bankrupt", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum291FinancialStatus.PENDING_DELISTING;
        assertEquals( "2", enumType.getID());
        assertEquals( "PENDING_DELISTING", enumType.getName());
        assertEquals( "2 - Pending delisting", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum291FinancialStatus.RESTRICTED;
        assertEquals( "3", enumType.getID());
        assertEquals( "RESTRICTED", enumType.getName());
        assertEquals( "3 - Restricted", enumType.getDescription());
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