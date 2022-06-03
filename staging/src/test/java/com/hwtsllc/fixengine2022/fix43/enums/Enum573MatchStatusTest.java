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
 *  573
 *  MatchStatus
 *  char
 *  <p></p>
 *  The status of this trade with respect to matching or comparison.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Compared, matched or affirmed
 *  <p>    1 - Uncompared, unmatched, or unaffired
 *  <p>    2 - Advisory or alert
 */
class Enum573MatchStatusTest {
    /*
     *  Information is the same for TAGS 573
     */
    @Test
    void Enum0573Test() {
        Enum573MatchStatus enumType;

        /*
         *  0-2 types
         */
        enumType = Enum573MatchStatus.COMPARED_MATCHED_AFFIRMED;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("COMPARED_MATCHED_AFFIRMED", enumType.toFIXNameString());
        assertEquals("0 - Compared, matched, or affirmed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum573MatchStatus.UNCOMPARED_UNMATCHED_UNAFFIRMED;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNCOMPARED_UNMATCHED_UNAFFIRMED", enumType.toFIXNameString());
        assertEquals("1 - Uncompared, unmatched, or unaffirmed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum573MatchStatus.ADVISORY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ADVISORY", enumType.toFIXNameString());
        assertEquals("2 - Advisory or alert", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}