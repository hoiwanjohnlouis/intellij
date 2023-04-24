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

package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  837 (same as 837, 843,)
 *  PegLimitType
 *  int
 *  <p>
 *  Type of Peg Limit
 *  <p></p>
 *  843 (same as 837, 843,)
 *  DiscretionLimitType
 *  int
 *  <p>
 *  Type of Discretion Limit
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Or better (default) - price improvement allowed
 *  <p>    1 - Strict - limit is a strict limit
 *  <p>    2 - Or worse - for a buy the peg limit is a minimum
 *                  and for a sell the peg limit is a maximum
 *                  (for use for orders which have a price range)
 */
class MyEnumLimitTypeTest {
    @Test
    void EnumTest() {
        MyEnumLimitType enumType;

        enumType = MyEnumLimitType.OR_BETTER;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("OR_BETTER", enumType.toFIXNameString());
        assertEquals("0 - Or better (default) - price improvement allowed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumLimitType.STRICT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("STRICT", enumType.toFIXNameString());
        assertEquals("1 - Strict - limit is a strict limit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumLimitType.OR_WORSE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("OR_WORSE", enumType.toFIXNameString());
        assertEquals("2 - Or worse - for a buy the peg limit is a minimum " +
                            "and for a sell the peg limit is a maximum " +
                            "(for use for orders which have a price range)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}