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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  410
 *  WtAverageLiquidity
 *  Percentage
 *  <p>
 *  Overall weighted average liquidity expressed as a % of average daily volume.
 *  <p>
 *  Represented as a percentage.
 */
class Tag410PctWtAverageLiquidityTest {
    @Test
    void FIX0410Test() {
        FIX42 fixData = FIX42.FIX410_PCT_WT_AVERAGE_LIQUIDITY;
        assertEquals( "410", fixData.toEnumIDString());
        assertEquals( "WT_AVERAGE_LIQUIDITY", fixData.toEnumNameString());
        assertEquals( "WtAverageLiquidity", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0410Test() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        assertEquals( "Tag410PctWtAverageLiquidity\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}