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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  836 (same as 836, 842,)
 *  PegOffsetType
 *  int
 *  <p>
 *  Type of Peg Offset value
 *  <p></p>
 *  842
 *  DiscretionOffsetType
 *  int
 *  <p>
 *  Type of Discretion Offset value
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Price (default)
 *  <p>    1 - Basis Points
 *  <p>    2 - Ticks
 *  <p>    3 - Price Tier or Level
 */
class MyEnumOffsetTypeTest {
    @Test
    void EnumTest() {
        MyEnumOffsetType enumType;

        enumType = MyEnumOffsetType.PRICE;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("PRICE", enumType.toEnumNameString());
        assertEquals("0 - Price (default)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumOffsetType.BASIS;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("BASIS", enumType.toEnumNameString());
        assertEquals("1 - Basis Points", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumOffsetType.TICKS;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("TICKS", enumType.toEnumNameString());
        assertEquals("2 - Ticks", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumOffsetType.TIER_OR_LEVEL;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("TIER_OR_LEVEL", enumType.toEnumNameString());
        assertEquals("3 - Price Tier or Level", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}