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

import com.hwtsllc.fixengine2022.fix42.enums.Enum409LiquidityIndType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  409
 *  LiquidityIndType
 *  int
 *  <p>
 *  Code to identify the type of liquidity indicator.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - 5-day moving average
 *  <p>    2 - 20-day moving average
 *  <p>    3 - Normal market size
 *  <p>    4 - Other
 */
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
            assertEquals( "FIX409_ENU_LIQUIDITY_IND_TYPE", tagData.toEnumLabelString());
            assertEquals( "409", tagData.toEnumIDString());
            assertEquals( "LIQUIDITY_IND_TYPE", tagData.toEnumNameString());
            assertEquals( "LiquidityIndType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-4 msg types
         */
        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE);
        assertEquals( Enum409LiquidityIndType.FIVE_DAY_MOVING_AVERAGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE);
        assertEquals( Enum409LiquidityIndType.TWENTY_DAY_MOVING_AVERAGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.NORMAL_MARKET_SIZE);
        assertEquals( Enum409LiquidityIndType.NORMAL_MARKET_SIZE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag409EnuLiquidityIndType(Enum409LiquidityIndType.OTHER);
        assertEquals( Enum409LiquidityIndType.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum409LiquidityIndType oneEnum : Enum409LiquidityIndType.values()) {
            tagData = new Tag409EnuLiquidityIndType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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