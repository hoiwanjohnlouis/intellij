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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  274
 *  TickDirection
 *  char
 *  <p>
 *  Direction of the "tick".
 *  <p></p>
 *  Valid values:
 *  <p>    "0 - Plus Tick"
 *  <p>    "1 - Zero-Plus Tick"
 *  <p>    "2 - Minus Tick"
 *  <p>    "3 - Zero-Minus Tick"
 */
class Enum274TickDirectionTest {
    @Test
    void Enum0274Test() {
        Enum274TickDirection enumType;

        /*
         * 0-3
         */
        enumType = Enum274TickDirection.PLUS_TICK;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "PLUS_TICK", enumType.toFIXNameString());
        assertEquals( "0 - Plus Tick", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum274TickDirection.ZERO_PLUS_TICK;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "ZERO_PLUS_TICK", enumType.toFIXNameString());
        assertEquals( "1 - Zero-Plus Tick", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum274TickDirection.MINUS_TICK;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "MINUS_TICK", enumType.toFIXNameString());
        assertEquals( "2 - Minus Tick", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum274TickDirection.ZERO_MINUS_TICK;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "ZERO_MINUS_TICK", enumType.toFIXNameString());
        assertEquals( "3 - Zero-Minus Tick", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}