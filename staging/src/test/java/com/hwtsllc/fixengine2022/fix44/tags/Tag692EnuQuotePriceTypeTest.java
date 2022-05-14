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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum692QuotePriceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag692EnuQuotePriceTypeTest {
    @Test
    void FIX0692Test() {
        FIX44 fixData = FIX44.FIX692_ENU_QUOTE_PRICE_TYPE;
        assertEquals( "692", fixData.getID());
        assertEquals( "QUOTE_PRICE_TYPE", fixData.getName());
        assertEquals( "QuotePriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0692Test() {
        Tag692EnuQuotePriceType tagData;

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PERCENT);
        assertEquals( Enum692QuotePriceType.PERCENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PER_SHARE);
        assertEquals( Enum692QuotePriceType.PER_SHARE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.FIXED_AMOUNT);
        assertEquals( Enum692QuotePriceType.FIXED_AMOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.DISCOUNT);
        assertEquals( Enum692QuotePriceType.DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PREMIUM);
        assertEquals( Enum692QuotePriceType.PREMIUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.SPREAD);
        assertEquals( Enum692QuotePriceType.SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_PRICE);
        assertEquals( Enum692QuotePriceType.TED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_YIELD);
        assertEquals( Enum692QuotePriceType.TED_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD_SPREAD);
        assertEquals( Enum692QuotePriceType.YIELD_SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD);
        assertEquals( Enum692QuotePriceType.YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}