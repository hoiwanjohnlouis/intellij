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
 *  836
 *  PegOffsetType
 *  int
 *  Type of Peg Offset value
 *  842
 *  DiscretionOffsetType
 *  int
 *  Type of Discretion Offset value
 *  Valid values:
 *      0 - Price (default)
 *      1 - Basis Points
 *      2 - Ticks
 *      3 - Price Tier or Level
 */
class MyEnumOffsetTypeTest {
    @Test
    void EnumTest() {
        MyEnumOffsetType enumType;

        enumType = MyEnumOffsetType.PRICE;
        assertEquals("0", enumType.getID());
        assertEquals("PRICE", enumType.getName());
        assertEquals("0 - Price (default)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumOffsetType.BASIS;
        assertEquals("1", enumType.getID());
        assertEquals("BASIS", enumType.getName());
        assertEquals("1 - Basis Points", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumOffsetType.TICKS;
        assertEquals("2", enumType.getID());
        assertEquals("TICKS", enumType.getName());
        assertEquals("2 - Ticks", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumOffsetType.TIER_OR_LEVEL;
        assertEquals("3", enumType.getID());
        assertEquals("TIER_OR_LEVEL", enumType.getName());
        assertEquals("3 - Price Tier or Level", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}