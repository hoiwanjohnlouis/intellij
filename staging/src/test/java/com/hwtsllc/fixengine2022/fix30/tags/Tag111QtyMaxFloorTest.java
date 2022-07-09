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
 *  111
 *  MaxFloor
 *  Qty
 *  <p>
 *  Deprecated in FIX.5.0
 *  <p>
 *  The quantity to be displayed. Required for reserve orders.
 *  <p>
 *  On orders specifies the qty to be displayed, on execution
 *  reports the currently displayed quantity.
 */
class Tag111QtyMaxFloorTest {
    @Test
    void PrintFIXTagTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void FIXTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyFIXData( tagData );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag111QtyMaxFloor tagData ) {
        assertEquals( "FIX111_QTY_MAX_FLOOR", tagData.toEnumLabelString());
        assertEquals( "MAX_FLOOR", tagData.toEnumNameString());
        assertEquals( "111", tagData.toEnumIDString());
        assertEquals( "MaxFloor", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag111QtyMaxFloor tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag111QtyMaxFloor tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyToString( tagData, oneElement );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag111QtyMaxFloor tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyVerboseString( tagData );

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag111QtyMaxFloor tagData ) {
        assertEquals( "Tag111QtyMaxFloor\n" +
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