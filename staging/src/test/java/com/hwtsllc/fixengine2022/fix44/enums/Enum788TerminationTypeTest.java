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

class Enum788TerminationTypeTest {
    /**
     *  788
     *  TerminationType
     *  Type of financing termination.
     *  Valid values:
     *      1 - Overnight
     *      2 - Term
     *      3 - Flexible
     *      4 - Open
     */
    @Test
    void EnumTest() {
        Enum788TerminationType enumType;

        enumType = Enum788TerminationType.OVERNIGHT;
        assertEquals("1", enumType.getID());
        assertEquals("OVERNIGHT", enumType.getName());
        assertEquals("1 - Overnight", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum788TerminationType.TERM;
        assertEquals("2", enumType.getID());
        assertEquals("TERM", enumType.getName());
        assertEquals("2 - Term", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum788TerminationType.FLEXIBLE;
        assertEquals("3", enumType.getID());
        assertEquals("FLEXIBLE", enumType.getName());
        assertEquals("3 - Flexible", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum788TerminationType.OPEN;
        assertEquals("4", enumType.getID());
        assertEquals("OPEN", enumType.getName());
        assertEquals("4 - Open", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}