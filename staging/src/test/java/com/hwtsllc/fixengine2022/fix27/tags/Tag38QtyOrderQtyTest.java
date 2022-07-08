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
 *  38
 *  OrderQty
 *  Qty
 *  <p></p>
 *  Quantity ordered.
 *  <p></p>
 *  This represents the number of shares for equities or par, face or nominal value for FI instruments.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag38QtyOrderQtyTest {
    @Test
    void PrintFIXTagTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag38QtyOrderQty tagData ) {
        assertEquals( "FIX38_QTY_ORDER_QTY", tagData.toEnumLabelString());
        assertEquals( "ORDER_QTY", tagData.toEnumNameString());
        assertEquals( "38", tagData.toEnumIDString());
        assertEquals( "OrderQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 100;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag38QtyOrderQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag38QtyOrderQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag38QtyOrderQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag38QtyOrderQty tagData;
        int oneElement;

        oneElement = Tag38QtyOrderQty.TESTA_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY;
        tagData = new Tag38QtyOrderQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag38QtyOrderQty tagData, final int oneElement ) {
        assertEquals( "Tag38QtyOrderQty\n" +
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