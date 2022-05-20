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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  38
 *  OrderQty
 *  Qty
 *  Quantity ordered.
 *  This represents the number of shares for equities or par, face or nominal value for FI instruments.
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag38QtyOrderQtyTest {
    @Test
    void FIX0038Test() {
        FIX27 fixData = FIX27.FIX38_QTY_ORDER_QTY;
        assertEquals( "ORDER_QTY", fixData.toFIXNameString());
        assertEquals( "38", fixData.toFIXIDString());
        assertEquals( "OrderQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0038Test() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(100) );
        assertEquals( 100, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY));
        assertEquals( Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY));
        assertEquals( String.valueOf(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag38QtyOrderQty tagData;

        tagData = new Tag38QtyOrderQty(new MyQtyType(Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY));
        assertEquals( "Tag38QtyOrderQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag38QtyOrderQty.TESTB_QTY_ORDER_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}