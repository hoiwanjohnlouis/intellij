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
 *  796
 *  AllocCancReplaceReason
 *  int
 *  <p></p>
 *  Reason for cancelling or replacing an Allocation Instruction
 *  or Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Original details incomplete or incorrect
 *  <p>    2 - Change in underlying order details
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum796AllocCancReplaceReasonTest {
    @Test
    void EnumTest() {
        Enum796AllocCancReplaceReason enumType;

        enumType = Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("ORIGINAL_DETAILS_INCOMPLETE", enumType.toEnumNameString());
        assertEquals("1 - Original details incomplete or incorrect", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("CHANGE_IN_UNDERLYING_ORDER", enumType.toEnumNameString());
        assertEquals("2 - Change in underlying order details", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum796AllocCancReplaceReason.OTHER;
        assertEquals("99", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}