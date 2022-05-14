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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum582CustOrderCapacityTest {
    /**
     *  Information is the same for TAGS 582
     */
    @Test
    void Enum0582Test() {
        Enum582CustOrderCapacity enumType;

        /*
         *  1-4 types
         */
        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT;
        assertEquals("1", enumType.getID());
        assertEquals("MEMBER_TRADING_ACCOUNT", enumType.getName());
        assertEquals("1 - Member trading for their own account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY;
        assertEquals("2", enumType.getID());
        assertEquals("CLEARING_FIRM_PROPRIETARY", enumType.getName());
        assertEquals("2 - Clearing Firm trading for its proprietary account", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER;
        assertEquals("3", enumType.getID());
        assertEquals("MEMBER_TRADING_FOR_ANOTHER", enumType.getName());
        assertEquals("3 - Member trading for another member", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.ALL_OTHER;
        assertEquals("4", enumType.getID());
        assertEquals("ALL_OTHER", enumType.getName());
        assertEquals("4 - All other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}