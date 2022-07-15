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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  192
 *  OrderQty2
 *  Qty
 *  <p></p>
 *  Deprecated in FIX.5.0 OrderQty (38) of the future part of a F/X swap order.
 */
// @Deprecated
class Tag192QtyOrderQty2Test {
    @Test
    void PrintTest() {
        Tag192QtyOrderQty2 tagData;
        int oneElement;

        oneElement = Tag192QtyOrderQty2.TESTA_QTY_ORDER_QTY_2;
        tagData = new Tag192QtyOrderQty2(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag192QtyOrderQty2.TESTB_QTY_ORDER_QTY_2;
        tagData = new Tag192QtyOrderQty2(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag192QtyOrderQty2 tagData;
        int oneElement;

        oneElement = Tag192QtyOrderQty2.TESTA_QTY_ORDER_QTY_2;
        tagData = new Tag192QtyOrderQty2(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag192QtyOrderQty2.TESTB_QTY_ORDER_QTY_2;
        tagData = new Tag192QtyOrderQty2(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag192QtyOrderQty2 tagData ) {
        assertEquals( "FIX192_QTY_ORDER_QTY_2", tagData.toEnumLabelString());
        assertEquals( "192", tagData.toEnumIDString());
        assertEquals( "ORDER_QTY_2", tagData.toEnumNameString());
        assertEquals( "OrderQty2", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag192QtyOrderQty2 tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag192QtyOrderQty2 tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag192QtyOrderQty2 tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag192QtyOrderQty2 tagData ) {
        assertEquals( "Tag192QtyOrderQty2\n" +
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