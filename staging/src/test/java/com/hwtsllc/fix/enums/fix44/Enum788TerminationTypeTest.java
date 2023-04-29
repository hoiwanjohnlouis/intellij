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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("OVERNIGHT", enumType.toFIXNameString());
        assertEquals("1 - Overnight", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum788TerminationType.TERM;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("TERM", enumType.toFIXNameString());
        assertEquals("2 - Term", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum788TerminationType.FLEXIBLE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("FLEXIBLE", enumType.toFIXNameString());
        assertEquals("3 - Flexible", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum788TerminationType.OPEN;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("OPEN", enumType.toFIXNameString());
        assertEquals("4 - Open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}