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
 *  Identifies the type of Confirmation message being sent.
 *  Valid values:
 *      1 - Status
 *      2 - Confirmation
 *      3 - Confirmation Request Rejected (reason can be stated in Text (58) field)
 */
class Enum773ConfirmTypeTest {
    @Test
    void EnumTest() {
        Enum773ConfirmType enumType;

        enumType = Enum773ConfirmType.STATUS;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "STATUS", enumType.toFIXNameString() );
        assertEquals( "1 - Status", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum773ConfirmType.CONFIRMATION;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "CONFIRMATION", enumType.toFIXNameString() );
        assertEquals( "2 - Confirmation", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum773ConfirmType.CONFIRMATION_REJECTED;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "CONFIRMATION_REJECTED", enumType.toFIXNameString() );
        assertEquals( "3 - Confirmation Request Rejected (reason can be stated in Text (58) field)",
                enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}