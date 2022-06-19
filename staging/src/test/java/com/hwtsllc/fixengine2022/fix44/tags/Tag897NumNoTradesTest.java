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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  897
 *  NoTrades
 *  NumInGroup
 *  <p></p>
 *  Number of trades in repeating group.
 */
class Tag897NumNoTradesTest {
    @Test
    void FIX0897Test() {
        FIX44 fixData = FIX44.FIX897_NUM_NO_TRADES;
        assertEquals( "897", fixData.toFIXIDString());
        assertEquals( "NO_TRADES", fixData.toFIXNameString());
        assertEquals( "NoTrades", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0897Test() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTA_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "897", tagData.toFIXIDString());
        assertEquals( "NO_TRADES", tagData.toFIXNameString());
        assertEquals( "NoTrades", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag897NumNoTrades.TESTB_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTA_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag897NumNoTrades.TESTB_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTB_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTB_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTB_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag897NumNoTrades tagData;
        int oneElement;

        oneElement = Tag897NumNoTrades.TESTA_NUM_NO_TRADES;
        tagData = new Tag897NumNoTrades( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag897NumNoTrades\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}