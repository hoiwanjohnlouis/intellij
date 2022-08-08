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

import com.hwtsllc.fixengine2022.datatypes.MyEnumPriceType;
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
class Tag698EnuYieldRedemptionPriceTypeTest {
    Tag698EnuYieldRedemptionPriceType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( "FIX698_ENU_YIELD_REDEMPTION_PRICE_TYPE", tagData.toEnumLabelString());
            assertEquals( "698", tagData.toEnumIDString());
            assertEquals( "YIELD_REDEMPTION_PRICE_TYPE", tagData.toEnumNameString());
            assertEquals( "YieldRedemptionPriceType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
         *  <p>    2 - Per unit (i.e. per share or contract)
         *  <p>    3 - Fixed amount (absolute value)
         *  <p>    4 - Discount - percentage points below par
         *  <p>    5 - Premium - percentage points over par
         */
        tagData = new Tag698EnuYieldRedemptionPriceType( MyEnumPriceType.PERCENTAGE );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.PER_UNIT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.FIXED_AMOUNT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.DISCOUNT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.PREMIUM);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    6 - Spread (basis points spread)
         *  <p>    7 - TED Price
         *  <p>    8 - TED Yield
         *  <p>    9 - Yield
         *  <p>    10 - Fixed cabinet trade price (primarily for listed futures and options)
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.SPREAD);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TED_PRICE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TED_YIELD);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.YIELD);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.FIXED_TRADE_PRICE);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    11 - Variable cabinet trade price (primarily for listed futures and options)
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.VARIABLE_TRADE_PRICE);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    13 - Product ticks in halfs
         *  <p>    14 - Product ticks in fourths
         *  <p>    15 - Product ticks in eights
         *  <p>    16 - Product ticks in sixteenths
         *  <p>    17 - Product ticks in thirty-seconds
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_HALFS);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_FOURTHS);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_EIGHTHS);
        assertEquals( "15", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_SIXTEENTHS);
        assertEquals( "16", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_THIRTY_SECONDS);
        assertEquals( "17", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    18 - Product ticks in sixty-fourths
         *  <p>    19 - Product ticks in one-twenty-eights
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_SIXTY_FOURTHS);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_ONE_TWENTY_EIGHTS);
        assertEquals( "19", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( "Tag698EnuYieldRedemptionPriceType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}