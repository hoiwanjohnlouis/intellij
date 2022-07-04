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
 *  84
 *  CxlQty
 *  Qty
 *  <p>
 *  Total quantity canceled for this order.
 *  <p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag84QtyCxlQtyTest {
    @Test
    void FIX0084Test() {
        FIX27 fixData = FIX27.FIX84_QTY_CXL_QTY;
        assertEquals( "CXL_QTY", fixData.toEnumNameString());
        assertEquals( "84", fixData.toEnumIDString());
        assertEquals( "CxlQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0084Test() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(8484));
        assertEquals( 8484, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(Tag84QtyCxlQty.TESTB_QTY_CXL_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(Tag84QtyCxlQty.TESTB_QTY_CXL_QTY));
        assertEquals( Tag84QtyCxlQty.TESTB_QTY_CXL_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(Tag84QtyCxlQty.TESTB_QTY_CXL_QTY));
        assertEquals( tagData.toEnumIDString() + "=" + Tag84QtyCxlQty.TESTB_QTY_CXL_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(Tag84QtyCxlQty.TESTB_QTY_CXL_QTY));
        assertEquals( String.valueOf(Tag84QtyCxlQty.TESTB_QTY_CXL_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag84QtyCxlQty tagData;

        tagData = new Tag84QtyCxlQty(new MyQtyType(Tag84QtyCxlQty.TESTA_QTY_CXL_QTY));
        assertEquals( "Tag84QtyCxlQty\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag84QtyCxlQty.TESTA_QTY_CXL_QTY + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag84QtyCxlQty.TESTA_QTY_CXL_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}