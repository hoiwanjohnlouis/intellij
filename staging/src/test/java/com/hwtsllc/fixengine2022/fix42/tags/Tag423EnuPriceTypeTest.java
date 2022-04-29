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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum423PriceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag423EnuPriceTypeTest {
    @Test
    void FIX0423Test() {
        FIX42 fixData = FIX42.FIX423_ENU_PRICE_TYPE;
        assertEquals( "423", fixData.getID());
        assertEquals( "PRICE_TYPE", fixData.getName());
        assertEquals( "PriceType", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  423 (same as 423, 663, 686, 698)
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
    void Tag0423Test() {
        Tag423EnuPriceType tagData;

        /**
         * 1-11, 13-19 msg types
         */

        /**
         * 1-11 msg types
         */
        tagData = new Tag423EnuPriceType(Enum423PriceType.PERCENTAGE);
        assertEquals( Enum423PriceType.PERCENTAGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.PER_UNIT);
        assertEquals( Enum423PriceType.PER_UNIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.FIXED_AMOUNT);
        assertEquals( Enum423PriceType.FIXED_AMOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.DISCOUNT);
        assertEquals( Enum423PriceType.DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.PREMIUM);
        assertEquals( Enum423PriceType.PREMIUM.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.SPREAD);
        assertEquals( Enum423PriceType.SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TED_PRICE);
        assertEquals( Enum423PriceType.TED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TED_YIELD);
        assertEquals( Enum423PriceType.TED_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.YIELD);
        assertEquals( Enum423PriceType.YIELD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.FIXED_TRADE_PRICE);
        assertEquals( Enum423PriceType.FIXED_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.VARIABLE_TRADE_PRICE);
        assertEquals( Enum423PriceType.VARIABLE_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /**
         * 13-19 msg types
         */
        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_HALFS);
        assertEquals( Enum423PriceType.TICKS_IN_HALFS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_FOURTHS);
        assertEquals( Enum423PriceType.TICKS_IN_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_EIGHTHS);
        assertEquals( Enum423PriceType.TICKS_IN_EIGHTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_SIXTEENTHS);
        assertEquals( Enum423PriceType.TICKS_IN_SIXTEENTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_THIRTY_SECONDS);
        assertEquals( Enum423PriceType.TICKS_IN_THIRTY_SECONDS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_SIXTY_FOURTHS);
        assertEquals( Enum423PriceType.TICKS_IN_SIXTY_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(Enum423PriceType.TICKS_IN_ONE_TWENTY_EIGHTS);
        assertEquals( Enum423PriceType.TICKS_IN_ONE_TWENTY_EIGHTS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}