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
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1089
 *  MatchIncrement
 *  Qty
 *  <p>
 *  Allows orders to specify a minimum quantity that applies to every execution
 *  (one execution could be for multiple counter-orders).
 *  <p>
 *  The order may still fill against smaller orders, but the cumulative quantity
 *  of the execution must be in multiples of the MatchIncrement.
 */
class Tag1089QtyMatchIncrementTest {
    @Test
    void FIX1089Test() {
        FIX50 fixData = FIX50.FIX1089_QTY_MATCH_INCREMENT;
        assertEquals( "1089", fixData.toEnumIDString());
        assertEquals( "MATCH_INCREMENT", fixData.toEnumNameString());
        assertEquals( "MatchIncrement", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1089Test() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTA_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTA_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTB_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1089QtyMatchIncrement tagData;
        int oneElement;

        oneElement = Tag1089QtyMatchIncrement.TESTA_QTY_MATCH_INCREMENT;
        tagData = new Tag1089QtyMatchIncrement( new MyQtyType( oneElement ) );
        assertEquals( "Tag1089QtyMatchIncrement\n" +
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