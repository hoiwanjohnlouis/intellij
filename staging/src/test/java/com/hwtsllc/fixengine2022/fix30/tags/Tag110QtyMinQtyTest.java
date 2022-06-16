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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  110
 *  MinQty
 *  Qty
 *  <p>
 *  Minimum quantity of an order to be executed.
 *  <p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag110QtyMinQtyTest {

    @Test
    void FIX0110Test() {
        FIX30 fixData = FIX30.FIX110_QTY_MIN_QTY;
        assertEquals( "MIN_QTY", fixData.toFIXNameString());
        assertEquals( "110", fixData.toFIXIDString());
        assertEquals( "MinQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0110Test() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = 11;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag110QtyMinQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]", tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}