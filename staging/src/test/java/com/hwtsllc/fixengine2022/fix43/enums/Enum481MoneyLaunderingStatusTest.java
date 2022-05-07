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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum481MoneyLaunderingStatusTest {
    /**
     *  Information is the same for TAGS 481
     */
    @Test
    void Enum0481Test() {
        Enum481MoneyLaunderingStatus enumType;

        /*
         * Y, types
         */
        enumType = Enum481MoneyLaunderingStatus.PASSED;
        assertEquals("Y", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("Y,PASSED,Y - Passed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  N, types
         */
        enumType = Enum481MoneyLaunderingStatus.NOT_CHECKED;
        assertEquals("N", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("N,NOT_CHECKED,N - Not Checked", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         * 1-3, types
         */
        enumType = Enum481MoneyLaunderingStatus.EXEMPT_BELOW_LIMIT;
        assertEquals("1", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,EXEMPT_BELOW_LIMIT,1 - Exempt - Below the Limit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY;
        assertEquals("2", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,EXEMPT_CLIENT_MONEY,2 - Exempt - Client Money Type exemption", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum481MoneyLaunderingStatus.EXEMPT_AUTHORISED;
        assertEquals("3", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,EXEMPT_AUTHORISED,3 - Exempt - Authorised Credit or financial institution", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}