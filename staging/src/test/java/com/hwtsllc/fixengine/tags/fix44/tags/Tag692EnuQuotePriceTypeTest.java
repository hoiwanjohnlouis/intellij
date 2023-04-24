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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.tags.fix44.enums.Enum692QuotePriceType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag692EnuQuotePriceTypeTest {
    Tag692EnuQuotePriceType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            tagData = new Tag692EnuQuotePriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            tagData = new Tag692EnuQuotePriceType(oneEnum);
            assertEquals( "FIX692_ENU_QUOTE_PRICE_TYPE", tagData.toFIXLabelString());
            assertEquals( "692", tagData.toFIXIDString());
            assertEquals( "QUOTE_PRICE_TYPE", tagData.toFIXNameString());
            assertEquals( "QuotePriceType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            tagData = new Tag692EnuQuotePriceType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  692
         *  QuotePriceType
         *  int
         *  <p>    1 - Percent (percent of par)
         *  <p>    2 - Per Share (e.g. cents per share)
         *  <p>    3 - Fixed Amount (absolute value)
         *  <p>    4 - Discount - percentage points below par
         *  <p>    5 - Premium - percentage points over par
         */
        tagData = new Tag692EnuQuotePriceType( Enum692QuotePriceType.PERCENT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PER_SHARE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.FIXED_AMOUNT);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.DISCOUNT);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.PREMIUM);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Spread - basis points relative to benchmark
         *  <p>    7 - TED Price
         *  <p>    8 - TED Yield
         *  <p>    9 - Yield Spread (swaps)
         *  <p>    10 - Yield
         */
        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.SPREAD);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_PRICE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.TED_YIELD);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD_SPREAD);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag692EnuQuotePriceType(Enum692QuotePriceType.YIELD);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            tagData = new Tag692EnuQuotePriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            tagData = new Tag692EnuQuotePriceType(oneEnum);
            assertEquals( "Tag692EnuQuotePriceType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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