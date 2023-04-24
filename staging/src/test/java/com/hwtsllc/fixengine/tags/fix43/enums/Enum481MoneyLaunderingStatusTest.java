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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  481
 *  MoneyLaunderingStatus
 *  char
 *  <p></p>
 *  A one character code identifying Money laundering status.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Passed
 *  <p>    N - Not Checked
 *  <p>    1 - Exempt - Below the Limit
 *  <p>    2 - Exempt - Client Money Type exemption
 *  <p>    3 - Exempt - Authorised Credit or financial institution
 */
class Enum481MoneyLaunderingStatusTest {
    @Test
    void Enum0481Test() {
        Enum481MoneyLaunderingStatus enumType;

        /*
         * Y, types
         */
        enumType = Enum481MoneyLaunderingStatus.PASSED;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("PASSED", enumType.toFIXNameString());
        assertEquals("Y - Passed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  N, types
         */
        enumType = Enum481MoneyLaunderingStatus.NOT_CHECKED;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NOT_CHECKED", enumType.toFIXNameString());
        assertEquals("N - Not Checked", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         * 1-3, types
         */
        enumType = Enum481MoneyLaunderingStatus.EXEMPT_BELOW_LIMIT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("EXEMPT_BELOW_LIMIT", enumType.toFIXNameString());
        assertEquals("1 - Exempt - Below the Limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("EXEMPT_CLIENT_MONEY", enumType.toFIXNameString());
        assertEquals("2 - Exempt - Client Money Type exemption", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum481MoneyLaunderingStatus.EXEMPT_AUTHORISED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("EXEMPT_AUTHORISED", enumType.toFIXNameString());
        assertEquals("3 - Exempt - Authorised Credit or financial institution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}