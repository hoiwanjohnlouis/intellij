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
 *  773
 *  ConfirmType
 *  int
 *  <p></p>
 *  Identifies the type of Confirmation message being sent.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Status
 *  <p>    2 - Confirmation
 *  <p>    3 - Confirmation Request Rejected (reason can be stated in Text (58) field)
 */
class Enum773ConfirmTypeTest {
    @Test
    void EnumTest() {
        Enum773ConfirmType enumType;

        enumType = Enum773ConfirmType.STATUS;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "STATUS", enumType.toEnumNameString() );
        assertEquals( "1 - Status", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum773ConfirmType.CONFIRMATION;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "CONFIRMATION", enumType.toEnumNameString() );
        assertEquals( "2 - Confirmation", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum773ConfirmType.CONFIRMATION_REJECTED;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "CONFIRMATION_REJECTED", enumType.toEnumNameString() );
        assertEquals( "3 - Confirmation Request Rejected (reason can be stated in Text (58) field)",
                enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}