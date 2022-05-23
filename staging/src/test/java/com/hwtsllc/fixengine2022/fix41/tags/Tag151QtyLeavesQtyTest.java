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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  151
 *  LeavesQty
 *  Qty
 *  <p>
 *  Quantity open for further execution.
 *  <p>
 *  If the OrdStatus (39) is Canceled, DoneForTheDay, Expired, Calculated, or Rejected
 *  (in which case the order is no longer active)  then LeavesQty could be 0,
 *  otherwise LeavesQty = OrderQty (38) – CumQty (14).
 *  <p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag151QtyLeavesQtyTest {
    @Test
    void FIX0151Test() {
        FIX41 fixData = FIX41.FIX151_QTY_LEAVES_QTY;
        assertEquals( "151", fixData.toFIXIDString());
        assertEquals( "LEAVES_QTY", fixData.toFIXNameString());
        assertEquals( "LeavesQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0151Test() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY));
        assertEquals( Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY));
        assertEquals( Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY));
        assertEquals( Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY));
        assertEquals( String.valueOf(Tag151QtyLeavesQty.TESTB_QTY_LEAVES_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag151QtyLeavesQty tagData;

        tagData = new Tag151QtyLeavesQty(new MyQtyType(Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY));
        assertEquals( "Tag151QtyLeavesQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag151QtyLeavesQty.TESTA_QTY_LEAVES_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}