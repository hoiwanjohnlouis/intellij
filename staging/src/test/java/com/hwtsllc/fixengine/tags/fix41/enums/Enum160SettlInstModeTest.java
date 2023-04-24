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

package com.hwtsllc.fixengine.tags.fix41.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  160
 *  SettlInstMode
 *  char
 *  <p>
 *  Indicates mode used for Settlement Instructions message.
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Default (Replaced)
 *  <p>    1 - Standing Instructions Provided
 *  <p>    2 - Specific Allocation Account Overriding (Replaced)
 *  <p>    3 - Specific Allocation Account Standing (Replaced)
 *  <p>    4 - Specific Order for a single account (for CIV)
 *  <p></p>
 *  <p>    5 - Request reject
 */
class Enum160SettlInstModeTest {
    @Test
    void Enum0160Test() {
        Enum160SettlInstMode enumType;

        /*
         * 0-5 msg types
         */
        enumType = Enum160SettlInstMode.DEFAULT;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("DEFAULT", enumType.toFIXNameString());
        assertEquals("0 - Default (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum160SettlInstMode.STANDING_INSTRUCTIONS_PROVIDED;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("STANDING_INSTRUCTIONS_PROVIDED", enumType.toFIXNameString());
        assertEquals("1 - Standing Instructions Provided", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING", enumType.toFIXNameString());
        assertEquals("2 - Specific Allocation Account Overriding (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum160SettlInstMode.SPECIFIC_ALLOCATION_ACCOUNT_STANDING;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("SPECIFIC_ALLOCATION_ACCOUNT_STANDING", enumType.toFIXNameString());
        assertEquals("3 - Specific Allocation Account Standing (Replaced)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum160SettlInstMode.SPECIFIC_ORDER_SINGLE_ACCOUNT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("SPECIFIC_ORDER_SINGLE_ACCOUNT", enumType.toFIXNameString());
        assertEquals("4 - Specific Order for a single account (for CIV)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum160SettlInstMode.REQUEST_REJECT;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("REQUEST_REJECT", enumType.toFIXNameString());
        assertEquals("5 - Request reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}