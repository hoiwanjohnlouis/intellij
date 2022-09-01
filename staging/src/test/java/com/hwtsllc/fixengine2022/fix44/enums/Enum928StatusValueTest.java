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
 *  928
 *  StatusValue
 *  int
 *  <p></p>
 *  Indicates the status of a network connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Connected
 *  <p>    2 - Not Connected - down, expected up
 *  <p>    3 - Not Connected - down, expected down
 *  <p>    4 - In Process
 */
class Enum928StatusValueTest {
    @Test
    void EnumTest() {
        Enum928StatusValue enumType;

        enumType = Enum928StatusValue.CONNECTED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "CONNECTED", enumType.toFIXNameString() );
        assertEquals( "1 - Connected", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum928StatusValue.DOWN_EXPECTED_UP;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "DOWN_EXPECTED_UP", enumType.toFIXNameString() );
        assertEquals( "2 - Not Connected - down expected up", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum928StatusValue.DOWN_EXPECTED_DOWN;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "DOWN_EXPECTED_DOWN", enumType.toFIXNameString() );
        assertEquals( "3 - Not Connected - down expected down", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum928StatusValue.IN_PROCESS;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "IN_PROCESS", enumType.toFIXNameString() );
        assertEquals( "4 - In Process", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}