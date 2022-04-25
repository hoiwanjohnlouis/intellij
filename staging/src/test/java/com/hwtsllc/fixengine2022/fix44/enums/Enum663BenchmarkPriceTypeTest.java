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

class Enum663BenchmarkPriceTypeTest {
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
    void EnumTest() {
        Enum663BenchmarkPriceType enumType;

        /*
         * 1-11, 13-19 msg types
         */

        /*
         * 1-11 msg types
         */
        enumType = Enum663BenchmarkPriceType.PERCENTAGE;
        assertEquals( "1", enumType.getID());
        assertEquals( "PERCENTAGE", enumType.getName());
        assertEquals( "1 - Percentage (i.e. percent of par) (often called *dollar price* for fixed income)",
                enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.PER_UNIT;
        assertEquals( "2", enumType.getID());
        assertEquals( "PER_UNIT", enumType.getName());
        assertEquals( "2 - Per unit (i.e. per share or contract)", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.FIXED_AMOUNT;
        assertEquals( "3", enumType.getID());
        assertEquals( "FIXED_AMOUNT", enumType.getName());
        assertEquals( "3 - Fixed amount (absolute value)", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.DISCOUNT;
        assertEquals( "4", enumType.getID());
        assertEquals( "DISCOUNT", enumType.getName());
        assertEquals( "4 - Discount - percentage points below par", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.PREMIUM;
        assertEquals( "5", enumType.getID());
        assertEquals( "PREMIUM", enumType.getName());
        assertEquals( "5 - Premium - percentage points over par", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.SPREAD;
        assertEquals( "6", enumType.getID());
        assertEquals( "SPREAD", enumType.getName());
        assertEquals( "6 - Spread (basis points spread)", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TED_PRICE;
        assertEquals( "7", enumType.getID());
        assertEquals( "TED_PRICE", enumType.getName());
        assertEquals( "7 - TED Price", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TED_YIELD;
        assertEquals( "8", enumType.getID());
        assertEquals( "TED_YIELD", enumType.getName());
        assertEquals( "8 - TED Yield", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.YIELD;
        assertEquals( "9", enumType.getID());
        assertEquals( "YIELD", enumType.getName());
        assertEquals( "9 - Yield", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.FIXED_TRADE_PRICE;
        assertEquals( "10", enumType.getID());
        assertEquals( "FIXED_TRADE_PRICE", enumType.getName());
        assertEquals( "10 - Fixed cabinet trade price (primarily for listed futures and options)",
                enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.VARIABLE_TRADE_PRICE;
        assertEquals( "11", enumType.getID());
        assertEquals( "VARIABLE_TRADE_PRICE", enumType.getName());
        assertEquals( "11 - Variable cabinet trade price (primarily for listed futures and options)",
                enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * 13-19 msg types
         */
        enumType = Enum663BenchmarkPriceType.TICKS_IN_HALFS;
        assertEquals( "13", enumType.getID());
        assertEquals( "TICKS_IN_HALFS", enumType.getName());
        assertEquals( "13 - Product ticks in halfs", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_FOURTHS;
        assertEquals( "14", enumType.getID());
        assertEquals( "TICKS_IN_FOURTHS", enumType.getName());
        assertEquals( "14 - Product ticks in fourths", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_EIGHTHS;
        assertEquals( "15", enumType.getID());
        assertEquals( "TICKS_IN_EIGHTHS", enumType.getName());
        assertEquals( "15 - Product ticks in eighths", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_SIXTEENTHS;
        assertEquals( "16", enumType.getID());
        assertEquals( "TICKS_IN_SIXTEENTHS", enumType.getName());
        assertEquals( "16 - Product ticks in sixteenths", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_THIRTY_SECONDS;
        assertEquals( "17", enumType.getID());
        assertEquals( "TICKS_IN_THIRTY_SECONDS", enumType.getName());
        assertEquals( "17 - Product ticks in thirty-seconds", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_SIXTY_FOURTHS;
        assertEquals( "18", enumType.getID());
        assertEquals( "TICKS_IN_SIXTY_FOURTHS", enumType.getName());
        assertEquals( "18 - Product ticks in sixty-fourths", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum663BenchmarkPriceType.TICKS_IN_ONE_TWENTY_EIGHTS;
        assertEquals( "19", enumType.getID());
        assertEquals( "TICKS_IN_ONE_TWENTY_EIGHTS", enumType.getName());
        assertEquals( "19 - Product ticks in one-twenty-eights", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}