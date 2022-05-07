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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  928
 *  StatusValue
 *  int
 *  Indicates the status of a network connection
 *  Valid values:
 *      1 - Connected
 *      2 - Not Connected - down expected up
 *      3 - Not Connected - down expected down
 *      4 - In Process
 */
class Enum928StatusValueTest {
    @Test
    void EnumTest() {
        Enum928StatusValue enumType;

        enumType = Enum928StatusValue.CONNECTED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "CONNECTED", enumType.getName() );
        assertEquals( "1 - Connected", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum928StatusValue.DOWN_EXPECTED_UP;
        assertEquals( "2", enumType.getID() );
        assertEquals( "DOWN_EXPECTED_UP", enumType.getName() );
        assertEquals( "2 - Not Connected - down expected up", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum928StatusValue.DOWN_EXPECTED_DOWN;
        assertEquals( "3", enumType.getID() );
        assertEquals( "DOWN_EXPECTED_DOWN", enumType.getName() );
        assertEquals( "3 - Not Connected - down expected down", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum928StatusValue.IN_PROCESS;
        assertEquals( "4", enumType.getID() );
        assertEquals( "IN_PROCESS", enumType.getName() );
        assertEquals( "4 - In Process", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}