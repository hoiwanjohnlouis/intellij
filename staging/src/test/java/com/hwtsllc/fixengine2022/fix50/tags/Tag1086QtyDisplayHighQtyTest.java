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
 *  1086
 *  DisplayHighQty
 *  Qty
 *  <p>
 *  Defines the upper quantity limit to a randomized refresh of DisplayQty.
 */
class Tag1086QtyDisplayHighQtyTest {
    @Test
    void FIX1086Test() {
        FIX50 fixData = FIX50.FIX1086_QTY_DISPLAY_HIGH_QTY;
        assertEquals( "1086", fixData.toFIXIDString());
        assertEquals( "DISPLAY_HIGH_QTY", fixData.toFIXNameString());
        assertEquals( "DisplayHighQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1086Test() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTA_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1086QtyDisplayHighQty.TESTB_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTA_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1086QtyDisplayHighQty.TESTB_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTB_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTB_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTB_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1086QtyDisplayHighQty tagData;
        int oneElement;

        oneElement = Tag1086QtyDisplayHighQty.TESTA_QTY_DISPLAY_HIGH_QTY;
        tagData = new Tag1086QtyDisplayHighQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag1086QtyDisplayHighQty\n" +
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