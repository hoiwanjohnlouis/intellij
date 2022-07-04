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
 *  687
 *  LegQty
 *  Qty
 *  <p></p>
 *  Quantity of this leg, e.g. in Quote dialog.
 *  <p></p>
 *  See Quantity (53) for description and valid values
 */
class Tag687QtyLegQtyTest {
    @Test
    void FIX0687Test() {
        FIX44 fixData = FIX44.FIX687_QTY_LEG_QTY;
        assertEquals( "687", fixData.toEnumIDString());
        assertEquals( "LEG_QTY", fixData.toEnumNameString());
        assertEquals( "LegQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0687Test() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTA_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
        assertEquals( "687", tagData.toEnumIDString());
        assertEquals( "LEG_QTY", tagData.toEnumNameString());
        assertEquals( "LegQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag687QtyLegQty.TESTB_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTA_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag687QtyLegQty.TESTB_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTB_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTB_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTB_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag687QtyLegQty tagData;
        int oneElement;

        oneElement = Tag687QtyLegQty.TESTA_QTY_LEG_QTY;
        tagData = new Tag687QtyLegQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag687QtyLegQty\n" +
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