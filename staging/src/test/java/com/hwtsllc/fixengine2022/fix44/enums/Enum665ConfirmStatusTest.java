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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum665ConfirmStatusTest {
    /**
     *  665
     *  Identifies the status of the Confirmation.
     *  ConfirmStatus
     *  Valid values:
     *      1 - Received
     *      2 - Mismatched Account
     *      3 - Missing Settlement Instructions
     *      4 - Confirmed
     *      5 - Request Rejected
     */
    @Test
    void EnumTest() {
        Enum665ConfirmStatus enumType;

        enumType = Enum665ConfirmStatus.RECEIVED;
        assertEquals("1", enumType.getID());
        assertEquals("RECEIVED", enumType.getName());
        assertEquals("1 - Received", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum665ConfirmStatus.MISMATCHED_ACCOUNT;
        assertEquals("2", enumType.getID());
        assertEquals("MISMATCHED_ACCOUNT", enumType.getName());
        assertEquals("2 - Mismatched Account", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum665ConfirmStatus.MISSING_INSTRUCTIONS;
        assertEquals("3", enumType.getID());
        assertEquals("MISSING_INSTRUCTIONS", enumType.getName());
        assertEquals("3 - Missing Settlement Instructions", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum665ConfirmStatus.CONFIRMED;
        assertEquals("4", enumType.getID());
        assertEquals("CONFIRMED", enumType.getName());
        assertEquals("4 - Confirmed", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum665ConfirmStatus.REJECTED;
        assertEquals("5", enumType.getID());
        assertEquals("REJECTED", enumType.getName());
        assertEquals("5 - Request Rejected", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}