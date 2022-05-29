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
 *  983
 *  ExpQty
 *  Qty
 *  <p>
 *  Expiration Quantity associated with the Expiration Type
 */
class Tag983QtyExpQtyTest {
    @Test
    void FIX0983Test() {
        FIX50 fixData = FIX50.FIX983_QTY_EXP_QTY;
        assertEquals( "983", fixData.toFIXIDString());
        assertEquals( "EXP_QTY", fixData.toFIXNameString());
        assertEquals( "ExpQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0983Test() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTA_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag983QtyExpQty.TESTB_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTA_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag983QtyExpQty.TESTB_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTB_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTB_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTB_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag983QtyExpQty tagData;
        int oneElement;

        oneElement = Tag983QtyExpQty.TESTA_QTY_EXP_QTY;
        tagData = new Tag983QtyExpQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag983QtyExpQty\n" +
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