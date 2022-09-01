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

import com.hwtsllc.fixengine2022.fix44.enums.Enum826TradeAllocIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag826EnuTradeAllocIndicatorTest {
    Tag826EnuTradeAllocIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( "FIX826_ENU_TRADE_ALLOC_INDICATOR", tagData.toFIXLabelString());
            assertEquals( "826", tagData.toFIXIDString());
            assertEquals( "TRADE_ALLOC_INDICATOR", tagData.toEnumNameString());
            assertEquals( "TradeAllocIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  826
         *  TradeAllocIndicator
         *  int
         *  <p>    0 - Allocation not required
         *  <p>    1 - Allocation required (give-up trade) allocation information not
         *          provided (incomplete)
         *  <p>    2 - Use allocation provided with the trade
         *  <p>    3 - Allocation give-up executor
         *  <p>    4 - Allocation from executor
         */
        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.NOT_REQUIRED );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.REQUIRED );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.USE_PROVIDED_INFO );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.FROM_EXECUTOR );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Allocation to claim account
         */
        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.CLAIM_ACCOUNT );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( "Tag826EnuTradeAllocIndicator\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
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