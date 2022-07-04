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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  638
 *  PriorityIndicator
 *  int
 *  <p></p>
 *  Indicates if a Cancel/Replace has caused an order to lose book priority.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Priority unchanged
 *  <p>    1 - Lost Priority as result of order change
 */
class Enum638PriorityIndicatorTest {
    /*
     *  Information is the same for TAGS 638
     */
    @Test
    void Enum0638Test() {
        Enum638PriorityIndicator enumType;

        /*
         *  0-1 types
         */
        enumType = Enum638PriorityIndicator.PRIORITY_UNCHANGED;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("PRIORITY_UNCHANGED", enumType.toEnumNameString());
        assertEquals("0 - Priority unchanged", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum638PriorityIndicator.LOST_PRIORITY;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("LOST_PRIORITY", enumType.toEnumNameString());
        assertEquals("1 - Lost Priority as result of order change", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}