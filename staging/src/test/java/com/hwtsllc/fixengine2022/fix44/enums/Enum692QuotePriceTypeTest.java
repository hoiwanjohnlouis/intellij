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

class Enum692QuotePriceTypeTest {
    /**
     *  692
     *  QuotePriceType
     *  Code to represent price type requested in Quote.
     *      If the Quote Request is for a Swap values 1-8 apply to all legs.
     *  Valid values:
     *      1 - Percent (percent of par)
     *      2 - Per Share (e.g. cents per share)
     *      3 - Fixed Amount (absolute value)
     *      4 - Discount - percentage points below par
     *      5 - Premium - percentage points over par
     *      6 - Spread - basis points relative to benchmark
     *      7 - TED Price
     *      8 - TED Yield
     *      9 - Yield Spread (swaps)
     *      10 - Yield
     */
    @Test
    void EnumTest() {
        Enum692QuotePriceType enumType;

        enumType = Enum692QuotePriceType.PERCENT;
        assertEquals("1", enumType.getID());
        assertEquals("PERCENT", enumType.getName());
        assertEquals("1 - Percent (percent of par)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.PER_SHARE;
        assertEquals("2", enumType.getID());
        assertEquals("PER_SHARE", enumType.getName());
        assertEquals("2 - Per Share (e.g. cents per share)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.FIXED_AMOUNT;
        assertEquals("3", enumType.getID());
        assertEquals("FIXED_AMOUNT", enumType.getName());
        assertEquals("3 - Fixed Amount (absolute value)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.DISCOUNT;
        assertEquals("4", enumType.getID());
        assertEquals("DISCOUNT", enumType.getName());
        assertEquals("4 - Discount - percentage points below par", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.PREMIUM;
        assertEquals("5", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5 - Premium - percentage points over par", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.SPREAD;
        assertEquals("6", enumType.getID());
        assertEquals("SPREAD", enumType.getName());
        assertEquals("6 - Spread - basis points relative to benchmark", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.TED_PRICE;
        assertEquals("7", enumType.getID());
        assertEquals("TED_PRICE", enumType.getName());
        assertEquals("7 - TED Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.TED_YIELD;
        assertEquals("8", enumType.getID());
        assertEquals("TED_YIELD", enumType.getName());
        assertEquals("8 - TED Yield", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.YIELD_SPREAD;
        assertEquals("9", enumType.getID());
        assertEquals("YIELD_SPREAD", enumType.getName());
        assertEquals("9 - Yield Spread (swaps)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum692QuotePriceType.YIELD;
        assertEquals("10", enumType.getID());
        assertEquals("YIELD", enumType.getName());
        assertEquals("10 - Yield", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}