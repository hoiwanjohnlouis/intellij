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
import com.hwtsllc.fixengine2022.fix44.enums.Enum826TradeAllocIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  826
 *  TradeAllocIndicator
 *  int
 *  <p></p>
 *  Identifies how the trade is to be allocated
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Allocation not required
 *  <p>    1 - Allocation required (give-up trade) allocation information not
 *          provided (incomplete)
 *  <p>    2 - Use allocation provided with the trade
 *  <p>    3 - Allocation give-up executor
 *  <p>    4 - Allocation from executor
 *  <p></p>
 *  <p>    5 - Allocation to claim account
 */
class Tag826EnuTradeAllocIndicatorTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX826_ENU_TRADE_ALLOC_INDICATOR;
        assertEquals( "826", fixData.toFIXIDString());
        assertEquals( "TRADE_ALLOC_INDICATOR", fixData.toFIXNameString());
        assertEquals( "TradeAllocIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0826Test() {
        Tag826EnuTradeAllocIndicator tagData;
        Enum826TradeAllocIndicator oneElement;

        oneElement = Enum826TradeAllocIndicator.NOT_REQUIRED;
        tagData = new Tag826EnuTradeAllocIndicator( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "826", tagData.toFIXIDString());
        assertEquals( "TRADE_ALLOC_INDICATOR", tagData.toFIXNameString());
        assertEquals( "TradeAllocIndicator", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.REQUIRED );
        assertEquals( Enum826TradeAllocIndicator.REQUIRED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.USE_PROVIDED_INFO );
        assertEquals( Enum826TradeAllocIndicator.USE_PROVIDED_INFO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR );
        assertEquals( Enum826TradeAllocIndicator.GIVE_UP_EXECUTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.FROM_EXECUTOR );
        assertEquals( Enum826TradeAllocIndicator.FROM_EXECUTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag826EnuTradeAllocIndicator( Enum826TradeAllocIndicator.CLAIM_ACCOUNT );
        assertEquals( Enum826TradeAllocIndicator.CLAIM_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag826EnuTradeAllocIndicator tagData;

        // loop around the ENUM and process
        for ( Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag826EnuTradeAllocIndicator tagData;

        // loop around the ENUM and process
        for (Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag826EnuTradeAllocIndicator tagData;

        // loop around the ENUM and process
        for (Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag826EnuTradeAllocIndicator tagData;

        // loop around the ENUM and process
        for (Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag826EnuTradeAllocIndicator tagData;

        // loop around the ENUM and process
        for (Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            tagData = new Tag826EnuTradeAllocIndicator(oneEnum);
            assertEquals( "Tag826EnuTradeAllocIndicator\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}