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
 *  int
 *  <p></p>
 *  Identifies the reason for rejecting a Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Mismatched account
 *  <p>    2 - Missing settlement instructions
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum774ConfirmRejReasonTest {
    @Test
    void EnumTest() {
        Enum774ConfirmRejReason enumType;

        enumType = Enum774ConfirmRejReason.MISMATCHED_ACCOUNT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "MISMATCHED_ACCOUNT", enumType.toEnumNameString() );
        assertEquals( "1 - Mismatched account", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum774ConfirmRejReason.MISSING_INSTRUCTIONS;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "MISSING_INSTRUCTIONS", enumType.toEnumNameString() );
        assertEquals( "2 - Missing settlement instructions", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum774ConfirmRejReason.OTHER;
        assertEquals( "99", enumType.toEnumIDString() );
        assertEquals( "OTHER", enumType.toEnumNameString() );
        assertEquals( "99 - Other", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}