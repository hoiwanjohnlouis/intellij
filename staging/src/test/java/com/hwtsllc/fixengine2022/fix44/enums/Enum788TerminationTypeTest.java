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
 *  788
 *  TerminationType
 *  int
 *  <p></p>
 *  Type of financing termination.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Overnight
 *  <p>    2 - Term
 *  <p>    3 - Flexible
 *  <p>    4 - Open
 */
class Enum788TerminationTypeTest {
    @Test
    void EnumTest() {
        Enum788TerminationType enumType;

        enumType = Enum788TerminationType.OVERNIGHT;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("OVERNIGHT", enumType.toEnumNameString());
        assertEquals("1 - Overnight", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum788TerminationType.TERM;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("TERM", enumType.toEnumNameString());
        assertEquals("2 - Term", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum788TerminationType.FLEXIBLE;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("FLEXIBLE", enumType.toEnumNameString());
        assertEquals("3 - Flexible", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum788TerminationType.OPEN;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("OPEN", enumType.toEnumNameString());
        assertEquals("4 - Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}