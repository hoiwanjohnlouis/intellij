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
 *  53
 *  Quantity
 *  Qty
 *  Overall/total quantity (e.g. number of shares)
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag53QtyQuantityTest {

    @Test
    void FIX0053Test() {
        FIX27 fixData = FIX27.FIX53_QTY_QUANTITY;
        assertEquals( "QUANTITY", fixData.toFIXNameString());
        assertEquals( "53", fixData.toFIXIDString());
        assertEquals( "Quantity (formerly Shares)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0053Test() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(400) );
        assertEquals( 400, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(Tag53QtyQuantity.TESTB_QTY_QUANTITY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(Tag53QtyQuantity.TESTB_QTY_QUANTITY));
        assertEquals( Tag53QtyQuantity.TESTB_QTY_QUANTITY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(Tag53QtyQuantity.TESTB_QTY_QUANTITY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag53QtyQuantity.TESTB_QTY_QUANTITY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(Tag53QtyQuantity.TESTB_QTY_QUANTITY));
        assertEquals( String.valueOf(Tag53QtyQuantity.TESTB_QTY_QUANTITY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag53QtyQuantity tagData;

        tagData = new Tag53QtyQuantity(new MyQtyType(Tag53QtyQuantity.TESTA_QTY_QUANTITY));
        assertEquals( "Tag53QtyQuantity\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag53QtyQuantity.TESTA_QTY_QUANTITY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag53QtyQuantity.TESTA_QTY_QUANTITY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}