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
 *  int
 *  <p></p>
 *  Code to represent price type requested in Quote.
 *  <p></p>
 *  If the Quote Request is for a Swap values 1-8 apply to all legs.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Percent (percent of par)
 *  <p>    2 - Per Share (e.g. cents per share)
 *  <p>    3 - Fixed Amount (absolute value)
 *  <p>    4 - Discount - percentage points below par
 *  <p>    5 - Premium - percentage points over par
 *  <p></p>
 *  <p>    6 - Spread - basis points relative to benchmark
 *  <p>    7 - TED Price
 *  <p>    8 - TED Yield
 *  <p>    9 - Yield Spread (swaps)
 *  <p>    10 - Yield
 */
class Tag692EnuQuotePriceTypeTest {
    @Test
    void FIX0692Test() {
        FIX44 fixData = FIX44.FIX692_ENU_QUOTE_PRICE_TYPE;
        assertEquals( "692", fixData.toFIXIDString());
        assertEquals( "QUOTE_PRICE_TYPE", fixData.toFIXNameString());
        assertEquals( "QuotePriceType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0692Test() {
        Tag692EnuQuotePriceType tagData;

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PERCENT);
        assertEquals( Enum692QuotePriceType.PERCENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PER_SHARE);
        assertEquals( Enum692QuotePriceType.PER_SHARE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.FIXED_AMOUNT);
        assertEquals( Enum692QuotePriceType.FIXED_AMOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.DISCOUNT);
        assertEquals( Enum692QuotePriceType.DISCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PREMIUM);
        assertEquals( Enum692QuotePriceType.PREMIUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.SPREAD);
        assertEquals( Enum692QuotePriceType.SPREAD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_PRICE);
        assertEquals( Enum692QuotePriceType.TED_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_YIELD);
        assertEquals( Enum692QuotePriceType.TED_YIELD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD_SPREAD);
        assertEquals( Enum692QuotePriceType.YIELD_SPREAD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD);
        assertEquals( Enum692QuotePriceType.YIELD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}