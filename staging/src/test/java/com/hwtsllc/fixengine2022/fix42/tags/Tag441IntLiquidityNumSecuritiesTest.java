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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  441
 *  LiquidityNumSecurities
 *  int
 *  <p>
 *  Number of Securites between LiquidityPctLow (402) and LiquidityPctHigh (403) in Currency.
 */
class Tag441IntLiquidityNumSecuritiesTest {
    @Test
    void FIX0441Test() {
        FIX42 fixData = FIX42.FIX441_INT_LIQUIDITY_NUM_SECURITIES;
        assertEquals( "441", fixData.toEnumIDString());
        assertEquals( "LIQUIDITY_NUM_SECURITIES", fixData.toEnumNameString());
        assertEquals( "LiquidityNumSecurities", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0441Test() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTA_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag441IntLiquidityNumSecurities.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTA_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag441IntLiquidityNumSecurities.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag441IntLiquidityNumSecurities tagData;
        int oneElement;

        oneElement = Tag441IntLiquidityNumSecurities.TESTA_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag441IntLiquidityNumSecurities( new MyIntType( oneElement ) );
        assertEquals( "Tag441IntLiquidityNumSecurities\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}