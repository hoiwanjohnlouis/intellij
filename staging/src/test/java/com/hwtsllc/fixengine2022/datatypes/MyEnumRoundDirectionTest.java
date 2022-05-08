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
 *  838 (same as 838, 844,)
 *  PegRoundDirection
 *  int
 *  <p>
 *  If the calculated peg price is not a valid tick price, specifies
 *  whether to round the price to be more or less aggressive
 *  <p></p>
 *  844
 *  DiscretionRoundDirection
 *  int
 *  <p>
 *  If the calculated discretionary price is not a valid tick price,
 *  specifies whether to round the price to be more or less aggressive
 *  <p></p>
 *  Valid values:
 *  <p>    1 - More aggressive - on a buy order round the price up to the nearest tick;
 *                  on a sell order round down to the nearest tick
 *  <p>    2 - More passive - on a buy order round down to the nearest tick;
 *                  on a sell order round up to the nearest tick
 */
class MyEnumRoundDirectionTest {
    @Test
    void EnumTest() {
        MyEnumRoundDirection enumType;

        enumType = MyEnumRoundDirection.AGGRESSIVE;
        assertEquals( "1", enumType.getID());
        assertEquals( "AGGRESSIVE", enumType.getName());
        assertEquals( "1 - More aggressive - on a buy order round the price up to the " +
                            "nearest tick; on a sell order round down to the nearest tick",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumRoundDirection.PASSIVE;
        assertEquals( "2", enumType.getID());
        assertEquals( "PASSIVE", enumType.getName());
        assertEquals( "2 - More passive - on a buy order round down to the nearest tick; " +
                            "on a sell order round up to the nearest tick",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}