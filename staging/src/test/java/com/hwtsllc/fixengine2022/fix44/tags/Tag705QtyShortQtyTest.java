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
 *  705
 *  ShortQty
 *  Qty
 *  <p></p>
 *  Short Quantity
 */
class Tag705QtyShortQtyTest {
    @Test
    void FIX0705Test() {
        FIX44 fixData = FIX44.FIX705_QTY_SHORT_QTY;
        assertEquals( "705", fixData.toFIXIDString());
        assertEquals( "SHORT_QTY", fixData.toFIXNameString());
        assertEquals( "ShortQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0705Test() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTA_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
        assertEquals( "705", tagData.toFIXIDString());
        assertEquals( "SHORT_QTY", tagData.toFIXNameString());
        assertEquals( "ShortQty", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag705QtyShortQty.TESTB_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTA_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag705QtyShortQty.TESTB_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTB_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTB_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTB_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag705QtyShortQty tagData;
        int oneElement;

        oneElement = Tag705QtyShortQty.TESTA_QTY_SHORT_QTY;
        tagData = new Tag705QtyShortQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag705QtyShortQty\n" +
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