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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  134
 *  BidSize
 *  Qty
 *  Quantity of bid
 *      (Prior to FIX 4.2 this field was of type int)
 */
class Tag134QtyBidSizeTest {
    @Test
    void FIX0134Test() {
        FIX40 fixData = FIX40.FIX134_QTY_BID_SIZE;
        assertEquals( "BID_SIZE", fixData.toEnumNameString());
        assertEquals( "134", fixData.toEnumIDString());
        assertEquals( "BidSize", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0134Test() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(100) );
        assertEquals( 100, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(Tag134QtyBidSize.TESTB_QTY_BID_SIZE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(Tag134QtyBidSize.TESTB_QTY_BID_SIZE));
        assertEquals( Tag134QtyBidSize.TESTB_QTY_BID_SIZE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(Tag134QtyBidSize.TESTB_QTY_BID_SIZE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag134QtyBidSize.TESTB_QTY_BID_SIZE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(Tag134QtyBidSize.TESTB_QTY_BID_SIZE));
        assertEquals( String.valueOf(Tag134QtyBidSize.TESTB_QTY_BID_SIZE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag134QtyBidSize tagData;

        tagData = new Tag134QtyBidSize(new MyQtyType(Tag134QtyBidSize.TESTA_QTY_BID_SIZE));
        assertEquals( "Tag134QtyBidSize\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag134QtyBidSize.TESTA_QTY_BID_SIZE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag134QtyBidSize.TESTA_QTY_BID_SIZE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}