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
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  673
 *  LegAllocQty
 *  Qty
 *  <p></p>
 *  Leg allocation quantity.
 *  <p></p>
 *  See AllocQty (80) for description and valid values.
 */
class Tag673QtyLegAllocQtyTest {
    @Test
    void FIX0673Test() {
        FIX44 fixData = FIX44.FIX673_QTY_LEG_ALLOC_QTY;
        assertEquals( "673", fixData.toEnumIDString());
        assertEquals( "LEG_ALLOC_QTY", fixData.toEnumNameString());
        assertEquals( "LegAllocQty", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0673Test() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTA_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
        assertEquals( "673", tagData.toEnumIDString());
        assertEquals( "LEG_ALLOC_QTY", tagData.toEnumNameString());
        assertEquals( "LegAllocQty", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag673QtyLegAllocQty.TESTB_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTA_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag673QtyLegAllocQty.TESTB_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTB_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTB_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTB_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag673QtyLegAllocQty tagData;
        int oneElement;

        oneElement = Tag673QtyLegAllocQty.TESTA_QTY_LEG_ALLOC_QTY;
        tagData = new Tag673QtyLegAllocQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag673QtyLegAllocQty\n" +
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