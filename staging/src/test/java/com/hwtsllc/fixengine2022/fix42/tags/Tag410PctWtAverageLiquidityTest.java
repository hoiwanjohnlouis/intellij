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

import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  410
 *  WtAverageLiquidity
 *  Percentage
 *  <p></p>
 *  Overall weighted average liquidity expressed as a % of average daily volume.
 *  <p></p>
 *  Represented as a percentage.
 */
class Tag410PctWtAverageLiquidityTest {
    @Test
    void PrintTest() {
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
    void FIXTagTest() {
        Tag410PctWtAverageLiquidity tagData;
        double oneElement;

        oneElement = Tag410PctWtAverageLiquidity.TESTA_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag410PctWtAverageLiquidity.TESTB_PCT_WT_AVERAGE_LIQUIDITY;
        tagData = new Tag410PctWtAverageLiquidity( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag410PctWtAverageLiquidity tagData, final double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag410PctWtAverageLiquidity tagData ) {
        assertEquals( "FIX410_PCT_WT_AVERAGE_LIQUIDITY", tagData.toEnumLabelString());
        assertEquals( "410", tagData.toEnumIDString());
        assertEquals( "WT_AVERAGE_LIQUIDITY", tagData.toEnumNameString());
        assertEquals( "WtAverageLiquidity", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag410PctWtAverageLiquidity tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag410PctWtAverageLiquidity tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag410PctWtAverageLiquidity tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag410PctWtAverageLiquidity tagData ) {
        assertEquals( "Tag410PctWtAverageLiquidity\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}