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
import com.hwtsllc.fixengine2022.fix44.enums.Enum663BenchmarkPriceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag663EnuBenchmarkPriceTypeTest {
    @Test
    void FIX0663Test() {
        FIX44 fixData = FIX44.FIX663_ENU_BENCHMARK_PRICE_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  663 (same as 423, 663, 686, 698)
     *  Identifies type of BenchmarkPrice (662).
     *        See PriceType (423) for valid values.
     *  BenchmarkPriceType
     *  Valid values:
     *      1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
     *      2 - Per unit (i.e. per share or contract)
     *      3 - Fixed amount (absolute value)
     *      4 - Discount - percentage points below par
     *      5 - Premium - percentage points over par
     *      6 - Spread (basis points spread)
     *      7 - TED Price
     *      8 - TED Yield
     *      9 - Yield
     *      10 - Fixed cabinet trade price (primarily for listed futures and options)
     *      11 - Variable cabinet trade price (primarily for listed futures and options)
     *      13 - Product ticks in halfs
     *      14 - Product ticks in fourths
     *      15 - Product ticks in eights
     *      16 - Product ticks in sixteenths
     *      17 - Product ticks in thirty-seconds
     *      18 - Product ticks in sixty-forths
     *      19 - Product ticks in one-twenty-eights
     */
    @Test
    void Tag0663Test() {
        Tag663EnuBenchmarkPriceType tagData;

        /*
         * 1-11, 13-19 msg types
         */

        /*
         * 1-11 msg types
         */
        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.PERCENTAGE);
        assertEquals( Enum663BenchmarkPriceType.PERCENTAGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.PER_UNIT);
        assertEquals( Enum663BenchmarkPriceType.PER_UNIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.FIXED_AMOUNT);
        assertEquals( Enum663BenchmarkPriceType.FIXED_AMOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.DISCOUNT);
        assertEquals( Enum663BenchmarkPriceType.DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.PREMIUM);
        assertEquals( Enum663BenchmarkPriceType.PREMIUM.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.SPREAD);
        assertEquals( Enum663BenchmarkPriceType.SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TED_PRICE);
        assertEquals( Enum663BenchmarkPriceType.TED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TED_YIELD);
        assertEquals( Enum663BenchmarkPriceType.TED_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.YIELD);
        assertEquals( Enum663BenchmarkPriceType.YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.FIXED_TRADE_PRICE);
        assertEquals( Enum663BenchmarkPriceType.FIXED_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.VARIABLE_TRADE_PRICE);
        assertEquals( Enum663BenchmarkPriceType.VARIABLE_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * 13-19 msg types
         */
        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_HALFS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_HALFS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_FOURTHS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_EIGHTHS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_EIGHTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_SIXTEENTHS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_SIXTEENTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_THIRTY_SECONDS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_THIRTY_SECONDS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_SIXTY_FOURTHS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_SIXTY_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag663EnuBenchmarkPriceType(Enum663BenchmarkPriceType.TICKS_IN_ONE_TWENTY_EIGHTS);
        assertEquals( Enum663BenchmarkPriceType.TICKS_IN_ONE_TWENTY_EIGHTS.getID(), tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}