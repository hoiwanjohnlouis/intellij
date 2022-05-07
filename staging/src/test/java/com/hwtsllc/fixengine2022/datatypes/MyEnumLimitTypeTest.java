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

package com.hwtsllc.fixengine2022.datatypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  837
 *  PegLimitType
 *  int
 *  Type of Peg Limit
 *  843
 *  DiscretionLimitType
 *  int
 *  Type of Discretion Limit
 *  Valid values:
 *      0 - Or better (default) - price improvement allowed
 *      1 - Strict - limit is a strict limit
 *      2 - Or worse - for a buy the peg limit is a minimum
 *                  and for a sell the peg limit is a maximum
 *                  (for use for orders which have a price range)
 */
class MyEnumLimitTypeTest {
    @Test
    void EnumTest() {
        MyEnumLimitType enumType;

        enumType = MyEnumLimitType.OR_BETTER;
        assertEquals("0", enumType.getID());
        assertEquals("OR_BETTER", enumType.getName());
        assertEquals("0 - Or better (default) - price improvement allowed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumLimitType.STRICT;
        assertEquals("1", enumType.getID());
        assertEquals("STRICT", enumType.getName());
        assertEquals("1 - Strict - limit is a strict limit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumLimitType.OR_WORSE;
        assertEquals("2", enumType.getID());
        assertEquals("OR_WORSE", enumType.getName());
        assertEquals("2 - Or worse - for a buy the peg limit is a minimum " +
                            "and for a sell the peg limit is a maximum " +
                            "(for use for orders which have a price range)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}