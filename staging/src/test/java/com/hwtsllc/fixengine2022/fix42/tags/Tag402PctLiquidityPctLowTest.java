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
 *  402
 *  LiquidityPctLow
 *  Percentage
 *  <p></p>
 *  Liquidity indicator or lower limit if TotalNumSecurities (393) > 1.  Represented as a percentage.
 */
class Tag402PctLiquidityPctLowTest {
    @Test
    void PrintTest() {
        Tag402PctLiquidityPctLow tagData;
        double oneElement;

        oneElement = Tag402PctLiquidityPctLow.TESTA_PCT_LIQUIDITY_PCT_LOW;
        tagData = new Tag402PctLiquidityPctLow( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag402PctLiquidityPctLow.TESTB_PCT_LIQUIDITY_PCT_LOW;
        tagData = new Tag402PctLiquidityPctLow( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag402PctLiquidityPctLow tagData;
        double oneElement;

        oneElement = Tag402PctLiquidityPctLow.TESTA_PCT_LIQUIDITY_PCT_LOW;
        tagData = new Tag402PctLiquidityPctLow( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag402PctLiquidityPctLow.TESTB_PCT_LIQUIDITY_PCT_LOW;
        tagData = new Tag402PctLiquidityPctLow( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag402PctLiquidityPctLow tagData, final double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag402PctLiquidityPctLow tagData ) {
        assertEquals( "FIX402_PCT_LIQUIDITY_PCT_LOW", tagData.toEnumLabelString());
        assertEquals( "402", tagData.toEnumIDString());
        assertEquals( "LIQUIDITY_PCT_LOW", tagData.toEnumNameString());
        assertEquals( "LiquidityPctLow", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag402PctLiquidityPctLow tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag402PctLiquidityPctLow tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag402PctLiquidityPctLow tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag402PctLiquidityPctLow tagData ) {
        assertEquals( "Tag402PctLiquidityPctLow\n" +
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