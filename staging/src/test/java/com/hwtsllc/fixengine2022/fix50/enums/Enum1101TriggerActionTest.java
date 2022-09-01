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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1101
 *  TriggerAction
 *  char
 *  <p>
 *  Defines the type of action to take when the trigger hits.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Activate
 *  <p>    2 - Modify
 *  <p>    3 - Cancel
 */
class Enum1101TriggerActionTest {
    @Test
    void EnumTest() {
        Enum1101TriggerAction enumType;

        enumType = Enum1101TriggerAction.ACTIVATE;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ACTIVATE", enumType.toFIXNameString() );
        assertEquals( "1 - Activate", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1101TriggerAction.MODIFY;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "MODIFY", enumType.toFIXNameString() );
        assertEquals( "2 - Modify", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1101TriggerAction.CANCEL;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "CANCEL", enumType.toFIXNameString() );
        assertEquals( "3 - Cancel", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}