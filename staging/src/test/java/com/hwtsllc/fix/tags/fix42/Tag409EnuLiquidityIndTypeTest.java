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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum409LiquidityIndType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag409EnuLiquidityIndTypeTest {
    Tag409EnuLiquidityIndType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( "FIX409_ENU_LIQUIDITY_IND_TYPE", tagData.toFIXLabelString());
            assertEquals( "409", tagData.toFIXIDString());
            assertEquals( "LIQUIDITY_IND_TYPE", tagData.toFIXNameString());
            assertEquals( "LiquidityIndType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  409
         *  LiquidityIndType
         *  int
         *  <p>    1 - 5-day moving average
         *  <p>    2 - 20-day moving average
         *  <p>    3 - Normal market size
         *  <p>    4 - Other
         */
        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.NORMAL_MARKET_SIZE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.OTHER);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( "Tag409EnuLiquidityIndType\n" +
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