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
    void FIX0111Test() {
        FIX30 fixData = FIX30.FIX111_QTY_MAX_FLOOR;
        assertEquals( "MAX_FLOOR", fixData.toFIXNameString());
        assertEquals( "111", fixData.toFIXIDString());
        assertEquals( "MaxFloor", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0111Test() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = 200;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
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
    void TagGetDataValueTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTB_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag111QtyMaxFloor tagData;
        int oneElement;

        oneElement = Tag111QtyMaxFloor.TESTA_QTY_MAX_FLOOR;
        tagData = new Tag111QtyMaxFloor( new MyQtyType(oneElement) );
        assertEquals( "Tag111QtyMaxFloor\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]", tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}