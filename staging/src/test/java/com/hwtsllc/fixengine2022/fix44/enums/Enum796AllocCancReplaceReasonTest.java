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

class Enum796AllocCancReplaceReasonTest {
    /**
     *  796
     *  AllocCancReplaceReason
     *  Reason for cancelling or replacing an Allocation Instruction or Allocation Report message
     *  Valid values:
     *      1 - Original details incomplete or incorrect
     *      2 - Change in underlying order details
     *      99 - Other
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void EnumTest() {
        Enum796AllocCancReplaceReason enumType;

        enumType = Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE;
        assertEquals("1", enumType.getID());
        assertEquals("ORIGINAL_DETAILS_INCOMPLETE", enumType.getName());
        assertEquals("1 - Original details incomplete or incorrect", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER;
        assertEquals("2", enumType.getID());
        assertEquals("CHANGE_IN_UNDERLYING_ORDER", enumType.getName());
        assertEquals("2 - Change in underlying order details", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum796AllocCancReplaceReason.OTHER;
        assertEquals("99", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("99 - Other", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}