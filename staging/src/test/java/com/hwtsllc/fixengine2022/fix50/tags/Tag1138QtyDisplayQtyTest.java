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
 *  1138
 *  DisplayQty
 *  Qty
 *  <p>
 *  The quantity to be displayed.
 *  <p>
 *  Required for reserve orders.
 *  <p>
 *  On orders specifies the qty to be displayed, on execution reports the currently displayed quantity.
 */
class Tag1138QtyDisplayQtyTest {
    @Test
    void FIX1138Test() {
        FIX50 fixData = FIX50.FIX1138_QTY_DISPLAY_QTY;
        assertEquals( "1138", fixData.toEnumIDString());
        assertEquals( "DISPLAY_QTY", fixData.toEnumNameString());
        assertEquals( "DisplayQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1138Test() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTA_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1138QtyDisplayQty.TESTB_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTA_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1138QtyDisplayQty.TESTB_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTB_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTB_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTB_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1138QtyDisplayQty tagData;
        int oneElement;

        oneElement = Tag1138QtyDisplayQty.TESTA_QTY_DISPLAY_QTY;
        tagData = new Tag1138QtyDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag1138QtyDisplayQty\n" +
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