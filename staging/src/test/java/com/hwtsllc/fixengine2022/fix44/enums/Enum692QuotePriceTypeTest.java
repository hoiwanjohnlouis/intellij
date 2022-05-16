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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PERCENT", enumType.toFIXNameString());
        assertEquals("1 - Percent (percent of par)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.PER_SHARE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("PER_SHARE", enumType.toFIXNameString());
        assertEquals("2 - Per Share (e.g. cents per share)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.FIXED_AMOUNT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("FIXED_AMOUNT", enumType.toFIXNameString());
        assertEquals("3 - Fixed Amount (absolute value)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.DISCOUNT;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("DISCOUNT", enumType.toFIXNameString());
        assertEquals("4 - Discount - percentage points below par", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.PREMIUM;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("PREMIUM", enumType.toFIXNameString());
        assertEquals("5 - Premium - percentage points over par", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.SPREAD;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("SPREAD", enumType.toFIXNameString());
        assertEquals("6 - Spread - basis points relative to benchmark", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.TED_PRICE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("TED_PRICE", enumType.toFIXNameString());
        assertEquals("7 - TED Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.TED_YIELD;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("TED_YIELD", enumType.toFIXNameString());
        assertEquals("8 - TED Yield", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.YIELD_SPREAD;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("YIELD_SPREAD", enumType.toFIXNameString());
        assertEquals("9 - Yield Spread (swaps)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum692QuotePriceType.YIELD;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("YIELD", enumType.toFIXNameString());
        assertEquals("10 - Yield", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}