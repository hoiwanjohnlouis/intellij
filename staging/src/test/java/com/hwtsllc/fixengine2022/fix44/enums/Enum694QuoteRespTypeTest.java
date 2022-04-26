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

class Enum694QuoteRespTypeTest {
    /**
     *  694
     *  QuoteRespType
     *  Identifies the type of Quote Response.
     *  Valid values:
     *      1 - Hit/Lift
     *      2 - Counter
     *      3 - Expired
     *      4 - Cover
     *      5 - Done Away
     *      6 - Pass
     */
    @Test
    void EnumTest() {
        Enum694QuoteRespType enumType;

        enumType = Enum694QuoteRespType.HIT_OR_LIFT;
        assertEquals("1", enumType.getID());
        assertEquals("HIT_OR_LIFT", enumType.getName());
        assertEquals("1 - Hit/Lift", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum694QuoteRespType.COUNTER;
        assertEquals("2", enumType.getID());
        assertEquals("COUNTER", enumType.getName());
        assertEquals("2 - Counter", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum694QuoteRespType.EXPIRED;
        assertEquals("3", enumType.getID());
        assertEquals("EXPIRED", enumType.getName());
        assertEquals("3 - Expired", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum694QuoteRespType.COVER;
        assertEquals("4", enumType.getID());
        assertEquals("COVER", enumType.getName());
        assertEquals("4 - Cover", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum694QuoteRespType.DONE_AWAY;
        assertEquals("5", enumType.getID());
        assertEquals("DONE_AWAY", enumType.getName());
        assertEquals("5 - Done Away", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum694QuoteRespType.PASS;
        assertEquals("6", enumType.getID());
        assertEquals("PASS", enumType.getName());
        assertEquals("6 - Pass", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}