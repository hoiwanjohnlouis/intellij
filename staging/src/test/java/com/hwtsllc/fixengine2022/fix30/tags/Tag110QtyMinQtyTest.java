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
    void FIXTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag110QtyMinQty tagData ) {
        assertEquals( "FIX110_QTY_MIN_QTY", tagData.toEnumLabelString());
        assertEquals( "MIN_QTY", tagData.toEnumNameString());
        assertEquals( "110", tagData.toEnumIDString());
        assertEquals( "MinQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag110QtyMinQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag110QtyMinQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag110QtyMinQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag110QtyMinQty tagData;
        int oneElement;

        oneElement = Tag110QtyMinQty.TESTA_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyVerboseString( tagData );

        oneElement = Tag110QtyMinQty.TESTB_QTY_MIN_QTY;
        tagData = new Tag110QtyMinQty( new MyQtyType( oneElement ) );
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag110QtyMinQty tagData ) {
        assertEquals( "Tag110QtyMinQty\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}