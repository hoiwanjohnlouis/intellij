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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  32
 *  LastQty
 *  Qty
 *  <p></p>
 *  Quantity (e.g. shares) bought/sold on this (last) fill.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag32QtyLastQtyTest {
    @Test
    void PrintFIXTagTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag32QtyLastQty tagData ) {
        assertEquals( "FIX32_QTY_LAST_QTY", tagData.toEnumLabelString());
        assertEquals( "LAST_QTY", tagData.toEnumNameString());
        assertEquals( "32", tagData.toEnumIDString());
        assertEquals( "LastQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 200;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag32QtyLastQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag32QtyLastQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag32QtyLastQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag32QtyLastQty tagData;
        int oneElement;

        oneElement = Tag32QtyLastQty.TESTA_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag32QtyLastQty.TESTB_QTY_LAST_QTY;
        tagData = new Tag32QtyLastQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag32QtyLastQty tagData, final int oneElement ) {
        assertEquals( "Tag32QtyLastQty\n" +
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