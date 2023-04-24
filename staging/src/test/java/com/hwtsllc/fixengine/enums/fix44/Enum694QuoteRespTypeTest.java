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

package com.hwtsllc.fixengine.enums.fix44;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  694
 *  QuoteRespType
 *  int
 *  <p></p>
 *  Identifies the type of Quote Response.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Hit/Lift
 *  <p>    2 - Counter
 *  <p>    3 - Expired
 *  <p>    4 - Cover
 *  <p>    5 - Done Away
 *  <p></p>
 *  <p>    6 - Pass
 */
class Enum694QuoteRespTypeTest {
    /*
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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("HIT_OR_LIFT", enumType.toFIXNameString());
        assertEquals("1 - Hit/Lift", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum694QuoteRespType.COUNTER;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("COUNTER", enumType.toFIXNameString());
        assertEquals("2 - Counter", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum694QuoteRespType.EXPIRED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("EXPIRED", enumType.toFIXNameString());
        assertEquals("3 - Expired", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum694QuoteRespType.COVER;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("COVER", enumType.toFIXNameString());
        assertEquals("4 - Cover", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum694QuoteRespType.DONE_AWAY;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("DONE_AWAY", enumType.toFIXNameString());
        assertEquals("5 - Done Away", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum694QuoteRespType.PASS;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("PASS", enumType.toFIXNameString());
        assertEquals("6 - Pass", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}