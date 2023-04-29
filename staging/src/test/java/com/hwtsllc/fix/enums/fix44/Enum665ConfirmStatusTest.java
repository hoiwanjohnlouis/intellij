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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  665
 *  ConfirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Mismatched Account
 *  <p>    3 - Missing Settlement Instructions
 *  <p>    4 - Confirmed
 *  <p>    5 - Request Rejected
 */
class Enum665ConfirmStatusTest {
    @Test
    void EnumTest() {
        Enum665ConfirmStatus enumType;

        enumType = Enum665ConfirmStatus.RECEIVED;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("RECEIVED", enumType.toFIXNameString());
        assertEquals("1 - Received", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum665ConfirmStatus.MISMATCHED_ACCOUNT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("MISMATCHED_ACCOUNT", enumType.toFIXNameString());
        assertEquals("2 - Mismatched Account", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum665ConfirmStatus.MISSING_INSTRUCTIONS;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("MISSING_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("3 - Missing Settlement Instructions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum665ConfirmStatus.CONFIRMED;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CONFIRMED", enumType.toFIXNameString());
        assertEquals("4 - Confirmed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum665ConfirmStatus.REJECTED;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("REJECTED", enumType.toFIXNameString());
        assertEquals("5 - Request Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}