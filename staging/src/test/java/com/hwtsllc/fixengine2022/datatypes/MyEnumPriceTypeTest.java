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
 *  423 (same as 423, 663, 686, 698)
 *  PriceType
 *  int
 *  <p>
 *  Code to represent the price type.
 *  <p>
 *  (For Financing transactions PriceType implies the "repo type"
 *  – Fixed or Floating – 9 (Yield) or 6 (Spread) respectively
 *  - and Price (44) gives the corresponding "repo rate".
 *  <p>
 *  See Volume : "Glossary" for further value definitions)
 *  <p></p>
 *  663
 *  BenchmarkPriceType
 *  int
 *  <p>
 *  Identifies type of BenchmarkPrice (662).
 *  <p>
 *  See PriceType (423) for valid values.
 *  <p></p>
 *  686
 *  LegPriceType
 *  int
 *  <p>
 *  The price type of the LegBidPx (681) and/or LegOfferPx (684).
 *  <p>
 *  See PriceType (423) for description and valid values
 *  <p></p>
 *  698
 *  YieldRedemptionPriceType
 *  int
 *  <p>
 *  The price type of the YieldRedemptionPrice (697)
 *  <p>
 *  See PriceType (423) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
 *  <p>    2 - Per unit (i.e. per share or contract)
 *  <p>    3 - Fixed amount (absolute value)
 *  <p>    4 - Discount - percentage points below par
 *  <p>    5 - Premium - percentage points over par
 *  <p></p>
 *  <p>    6 - Spread (basis points spread)
 *  <p>    7 - TED Price
 *  <p>    8 - TED Yield
 *  <p>    9 - Yield
 *  <p>    10 - Fixed cabinet trade price (primarily for listed futures and options)
 *  <p></p>
 *  <p>    11 - Variable cabinet trade price (primarily for listed futures and options)
 *  <p></p>
 *  <p>    13 - Product ticks in halfs
 *  <p>    14 - Product ticks in fourths
 *  <p>    15 - Product ticks in eights
 *  <p>    16 - Product ticks in sixteenths
 *  <p>    17 - Product ticks in thirty-seconds
 *  <p></p>
 *  <p>    18 - Product ticks in sixty-forths
 *  <p>    19 - Product ticks in one-twenty-eights
 */
class MyEnumPriceTypeTest {
    @Test
    void Enum0423Test() {
        MyEnumPriceType enumType;

        /*
         * 1-11, 13-19 msg types
         */

        /*
         * 1-11 msg types
         */
        enumType = MyEnumPriceType.PERCENTAGE;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "PERCENTAGE", enumType.toFIXNameString());
        assertEquals( "1 - Percentage (i.e. percent of par) (often called *dollar price* for fixed income)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.PER_UNIT;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "PER_UNIT", enumType.toFIXNameString());
        assertEquals( "2 - Per unit (i.e. per share or contract)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.FIXED_AMOUNT;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "FIXED_AMOUNT", enumType.toFIXNameString());
        assertEquals( "3 - Fixed amount (absolute value)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.DISCOUNT;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "DISCOUNT", enumType.toFIXNameString());
        assertEquals( "4 - Discount - percentage points below par", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.PREMIUM;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "PREMIUM", enumType.toFIXNameString());
        assertEquals( "5 - Premium - percentage points over par", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.SPREAD;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "SPREAD", enumType.toFIXNameString());
        assertEquals( "6 - Spread (basis points spread)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TED_PRICE;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "TED_PRICE", enumType.toFIXNameString());
        assertEquals( "7 - TED Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TED_YIELD;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "TED_YIELD", enumType.toFIXNameString());
        assertEquals( "8 - TED Yield", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.YIELD;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "YIELD", enumType.toFIXNameString());
        assertEquals( "9 - Yield", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.FIXED_TRADE_PRICE;
        assertEquals( "10", enumType.toFIXIDString());
        assertEquals( "FIXED_TRADE_PRICE", enumType.toFIXNameString());
        assertEquals( "10 - Fixed cabinet trade price (primarily for listed futures and options)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.VARIABLE_TRADE_PRICE;
        assertEquals( "11", enumType.toFIXIDString());
        assertEquals( "VARIABLE_TRADE_PRICE", enumType.toFIXNameString());
        assertEquals( "11 - Variable cabinet trade price (primarily for listed futures and options)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * 13-19 msg types
         */
        enumType = MyEnumPriceType.TICKS_IN_HALFS;
        assertEquals( "13", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_HALFS", enumType.toFIXNameString());
        assertEquals( "13 - Product ticks in halfs", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_FOURTHS;
        assertEquals( "14", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_FOURTHS", enumType.toFIXNameString());
        assertEquals( "14 - Product ticks in fourths", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_EIGHTHS;
        assertEquals( "15", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_EIGHTHS", enumType.toFIXNameString());
        assertEquals( "15 - Product ticks in eighths", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_SIXTEENTHS;
        assertEquals( "16", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_SIXTEENTHS", enumType.toFIXNameString());
        assertEquals( "16 - Product ticks in sixteenths", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_THIRTY_SECONDS;
        assertEquals( "17", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_THIRTY_SECONDS", enumType.toFIXNameString());
        assertEquals( "17 - Product ticks in thirty-seconds", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_SIXTY_FOURTHS;
        assertEquals( "18", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_SIXTY_FOURTHS", enumType.toFIXNameString());
        assertEquals( "18 - Product ticks in sixty-fourths", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumPriceType.TICKS_IN_ONE_TWENTY_EIGHTS;
        assertEquals( "19", enumType.toFIXIDString());
        assertEquals( "TICKS_IN_ONE_TWENTY_EIGHTS", enumType.toFIXNameString());
        assertEquals( "19 - Product ticks in one-twenty-eights", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}