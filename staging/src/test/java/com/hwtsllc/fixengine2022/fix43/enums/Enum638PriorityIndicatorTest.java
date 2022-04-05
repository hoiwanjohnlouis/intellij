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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum638PriorityIndicatorTest {
    /**
     *  Information is the same for TAGS 638
     */
    @Test
    void Enum0638Test() {
        Enum638PriorityIndicator enumType;

        /*
         *  0-1 types
         */
        enumType = Enum638PriorityIndicator.PRIORITY_UNCHANGED;
        assertEquals("0", enumType.getID());
        assertEquals("PRIORITY_UNCHANGED", enumType.getName());
        assertEquals("0 - Priority unchanged", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum638PriorityIndicator.LOST_PRIORITY;
        assertEquals("1", enumType.getID());
        assertEquals("LOST_PRIORITY", enumType.getName());
        assertEquals("1 - Lost Priority as result of order change", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}