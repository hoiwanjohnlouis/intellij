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
    void FIXTest() {
        FIX30 fixData = FIX30.FIX110_QTY_MIN_QTY;
        assertEquals( "MIN_QTY", fixData.toEnumNameString());
        assertEquals( "110", fixData.toEnumIDString());
        assertEquals( "MinQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0110Test() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = 11;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
        assertEquals( "MIN_QTY", tagData.toEnumNameString());
        assertEquals( "110", tagData.toEnumIDString());
        assertEquals( "MinQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

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
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
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
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]", tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}