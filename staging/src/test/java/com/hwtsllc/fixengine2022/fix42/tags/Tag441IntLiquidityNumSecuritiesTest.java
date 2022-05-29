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
        assertEquals( "441", fixData.toFIXIDString());
        assertEquals( "LIQUIDITY_NUM_SECURITIES", fixData.toFIXNameString());
        assertEquals( "LiquidityNumSecurities", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
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
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
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
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}