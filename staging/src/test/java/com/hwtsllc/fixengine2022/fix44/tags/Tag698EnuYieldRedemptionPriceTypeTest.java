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
            assertEquals( "FIX698_ENU_YIELD_REDEMPTION_PRICE_TYPE", tagData.toFIXLabelString());
            assertEquals( "698", tagData.toFIXIDString());
            assertEquals( "YIELD_REDEMPTION_PRICE_TYPE", tagData.toFIXNameString());
            assertEquals( "YieldRedemptionPriceType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            tagData = new Tag698EnuYieldRedemptionPriceType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  698 (same as 423, 663, 686, 698)
         *  YieldRedemptionPriceType
         *  int
         *  <p>    1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
         *  <p>    2 - Per unit (i.e. per share or contract)
         *  <p>    3 - Fixed amount (absolute value)
         *  <p>    4 - Discount - percentage points below par
         *  <p>    5 - Premium - percentage points over par
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.PERCENTAGE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.PER_UNIT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.FIXED_AMOUNT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.DISCOUNT);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.PREMIUM);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Spread (basis points spread)
         *  <p>    7 - TED Price
         *  <p>    8 - TED Yield
         *  <p>    9 - Yield
         *  <p>    10 - Fixed cabinet trade price (primarily for listed futures and options)
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.SPREAD);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TED_PRICE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TED_YIELD);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.YIELD);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.FIXED_TRADE_PRICE);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Variable cabinet trade price (primarily for listed futures and options)
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.VARIABLE_TRADE_PRICE);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         * 13-19 msg types
         *  <p>    13 - Product ticks in halfs
         *  <p>    14 - Product ticks in fourths
         *  <p>    15 - Product ticks in eights
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_HALFS);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_FOURTHS);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_EIGHTHS);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    16 - Product ticks in sixteenths
         *  <p>    17 - Product ticks in thirty-seconds
         *  <p>    18 - Product ticks in sixty-fourths
         *  <p>    19 - Product ticks in one-twenty-eights
         */
        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_SIXTEENTHS);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_THIRTY_SECONDS);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_SIXTY_FOURTHS);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag698EnuYieldRedemptionPriceType(MyEnumPriceType.TICKS_IN_ONE_TWENTY_EIGHTS);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}