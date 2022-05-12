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

class Enum573MatchStatusTest {
    /**
     *  Information is the same for TAGS 573
     */
    @Test
    void Enum0573Test() {
        Enum573MatchStatus enumType;

        /*
         *  0-2 types
         */
        enumType = Enum573MatchStatus.COMPARED_MATCHED_AFFIRMED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,COMPARED_MATCHED_AFFIRMED,0 - Compared, matched, or affirmed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum573MatchStatus.UNCOMPARED_UNMATCHED_UNAFFIRMED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,UNCOMPARED_UNMATCHED_UNAFFIRMED,1 - Uncompared, unmatched, or unaffirmed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum573MatchStatus.ADVISORY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,ADVISORY,2 - Advisory or alert", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}