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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPriceType;
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
class Tag423EnuPriceTypeTest {
    @Test
    void FIX0423Test() {
        FIX42 fixData = FIX42.FIX423_ENU_PRICE_TYPE;
        assertEquals( "423", fixData.getID());
        assertEquals( "PRICE_TYPE", fixData.getName());
        assertEquals( "PriceType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0423Test() {
        Tag423EnuPriceType tagData;

        /*
         * 1-11, 13-19 msg types
         */

        /*
         * 1-11 msg types
         */
        tagData = new Tag423EnuPriceType(MyEnumPriceType.PERCENTAGE);
        assertEquals( MyEnumPriceType.PERCENTAGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.PER_UNIT);
        assertEquals( MyEnumPriceType.PER_UNIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.FIXED_AMOUNT);
        assertEquals( MyEnumPriceType.FIXED_AMOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.DISCOUNT);
        assertEquals( MyEnumPriceType.DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.PREMIUM);
        assertEquals( MyEnumPriceType.PREMIUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.SPREAD);
        assertEquals( MyEnumPriceType.SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TED_PRICE);
        assertEquals( MyEnumPriceType.TED_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TED_YIELD);
        assertEquals( MyEnumPriceType.TED_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.YIELD);
        assertEquals( MyEnumPriceType.YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.FIXED_TRADE_PRICE);
        assertEquals( MyEnumPriceType.FIXED_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.VARIABLE_TRADE_PRICE);
        assertEquals( MyEnumPriceType.VARIABLE_TRADE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * 13-19 msg types
         */
        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_HALFS);
        assertEquals( MyEnumPriceType.TICKS_IN_HALFS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_FOURTHS);
        assertEquals( MyEnumPriceType.TICKS_IN_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_EIGHTHS);
        assertEquals( MyEnumPriceType.TICKS_IN_EIGHTHS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_SIXTEENTHS);
        assertEquals( MyEnumPriceType.TICKS_IN_SIXTEENTHS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_THIRTY_SECONDS);
        assertEquals( MyEnumPriceType.TICKS_IN_THIRTY_SECONDS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_SIXTY_FOURTHS);
        assertEquals( MyEnumPriceType.TICKS_IN_SIXTY_FOURTHS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag423EnuPriceType(MyEnumPriceType.TICKS_IN_ONE_TWENTY_EIGHTS);
        assertEquals( MyEnumPriceType.TICKS_IN_ONE_TWENTY_EIGHTS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}