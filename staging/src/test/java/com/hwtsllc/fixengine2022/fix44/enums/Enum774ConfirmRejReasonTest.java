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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  774
 *  ConfirmRejReason
 *  Identifies the reason for rejecting a Confirmation.
 *  Valid values:
 *      1 - Mismatched account
 *      2 - Missing settlement instructions
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum774ConfirmRejReasonTest {
    @Test
    void EnumTest() {
        Enum774ConfirmRejReason enumType;

        enumType = Enum774ConfirmRejReason.MISMATCHED_ACCOUNT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "MISMATCHED_ACCOUNT", enumType.getName() );
        assertEquals( "1 - Mismatched account", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum774ConfirmRejReason.MISSING_INSTRUCTIONS;
        assertEquals( "2", enumType.getID() );
        assertEquals( "MISSING_INSTRUCTIONS", enumType.getName() );
        assertEquals( "2 - Missing settlement instructions", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum774ConfirmRejReason.OTHER;
        assertEquals( "99", enumType.getID() );
        assertEquals( "OTHER", enumType.getName() );
        assertEquals( "99 - Other", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}