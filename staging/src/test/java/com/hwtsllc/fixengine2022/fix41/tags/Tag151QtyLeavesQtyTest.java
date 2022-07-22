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
 *  151
 *  LeavesQty
 *  Qty
 *  <p></p>
 *  Quantity open for further execution.
 *  <p></p>
 *  If the OrdStatus (39) is Canceled, DoneForTheDay, Expired, Calculated, or Rejected
 *  (in which case the order is no longer active)  then LeavesQty could be 0,
 *  otherwise LeavesQty = OrderQty (38) – CumQty (14).
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag151QtyLeavesQtyTest {
    @Test
    void PrintTest() {
        Tag151QtyLeavesQty tagData;
        int oneElement;

        oneElement = Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY;
        tagData = new Tag151QtyLeavesQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY;
        tagData = new Tag151QtyLeavesQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag151QtyLeavesQty tagData;
        int oneElement;

        oneElement = Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY;
        tagData = new Tag151QtyLeavesQty(new MyQtyType( oneElement ));
        verifyAll( tagData, oneElement );

        oneElement = Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY;
        tagData = new Tag151QtyLeavesQty(new MyQtyType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag151QtyLeavesQty tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag151QtyLeavesQty tagData ) {
        assertEquals( "FIX151_QTY_LEAVES_QTY", tagData.toEnumLabelString());
        assertEquals( "151", tagData.toEnumIDString());
        assertEquals( "LEAVES_QTY", tagData.toEnumNameString());
        assertEquals( "LeavesQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag151QtyLeavesQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag151QtyLeavesQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag151QtyLeavesQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag151QtyLeavesQty tagData ) {
        assertEquals( "Tag151QtyLeavesQty\n" +
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