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
 *  32
 *  LastQty
 *  Qty
 *  Quantity (e.g. shares) bought/sold on this (last) fill.
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag32QtyLastQtyTest {
    @Test
    void FIX0032Test() {
        FIX27 fixData = FIX27.FIX32_QTY_LAST_QTY;
        assertEquals( "LAST_QTY", fixData.toFIXNameString());
        assertEquals( "32", fixData.toFIXIDString());
        assertEquals( "LastQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0032Test() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(200) );
        assertEquals( 200, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(Tag32QtyLastQty.TESTB_QTY_LAST_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(Tag32QtyLastQty.TESTB_QTY_LAST_QTY));
        assertEquals( Tag32QtyLastQty.TESTB_QTY_LAST_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(Tag32QtyLastQty.TESTB_QTY_LAST_QTY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag32QtyLastQty.TESTB_QTY_LAST_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(Tag32QtyLastQty.TESTB_QTY_LAST_QTY));
        assertEquals( String.valueOf(Tag32QtyLastQty.TESTB_QTY_LAST_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag32QtyLastQty tagData;

        tagData = new Tag32QtyLastQty(new MyQtyType(Tag32QtyLastQty.TESTA_QTY_LAST_QTY));
        assertEquals( "Tag32QtyLastQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag32QtyLastQty.TESTA_QTY_LAST_QTY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag32QtyLastQty.TESTA_QTY_LAST_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}