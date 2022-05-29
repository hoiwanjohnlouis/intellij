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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1023
 *  MDPriceLevel
 *  int
 *  <p>
 *  Integer to convey the level of a bid or offer at a given price level.
 *  <p>
 *  This is in contrast to MDEntryPositionNo which is used to
 *  convey the position of an order within a Price level
 */
class Tag1023IntMDPriceLevelTest {
    @Test
    void FIX1023Test() {
        FIX50 fixData = FIX50.FIX1023_INT_MD_PRICE_LEVEL;
        assertEquals( "1023", fixData.toFIXIDString());
        assertEquals( "MD_PRICE_LEVEL", fixData.toFIXNameString());
        assertEquals( "MDPriceLevel", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1023Test() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTA_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1023IntMDPriceLevel.TESTB_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTA_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1023IntMDPriceLevel.TESTB_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTB_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTB_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTB_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1023IntMDPriceLevel tagData;
        int oneElement;

        oneElement = Tag1023IntMDPriceLevel.TESTA_INT_MD_PRICE_LEVEL;
        tagData = new Tag1023IntMDPriceLevel( new MyIntType( oneElement ) );
        assertEquals( "Tag1023IntMDPriceLevel\n" +
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