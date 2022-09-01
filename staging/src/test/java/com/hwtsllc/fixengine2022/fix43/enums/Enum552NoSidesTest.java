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
 *  552
 *  NoSides
 *  NumInGroup
 *  <p></p>
 *  Number of Side repeating group instances.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - One Side
 *  <p>    2 - Both Sides
 */
class Enum552NoSidesTest {
    /*
     *  Information is the same for TAGS 552
     */
    @Test
    void Enum0552Test() {
        Enum552NoSides enumType;

        /*
         *  1-2 types
         */
        enumType = Enum552NoSides.ONE_SIDE;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("ONE_SIDE", enumType.toEnumNameString());
        assertEquals("1 - One Side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum552NoSides.BOTH_SIDES;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("BOTH_SIDES", enumType.toEnumNameString());
        assertEquals("2 - Both Sides", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}