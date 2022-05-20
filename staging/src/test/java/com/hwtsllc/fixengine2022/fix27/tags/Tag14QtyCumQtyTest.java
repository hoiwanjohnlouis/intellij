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
 *  14
 *  CumQty
 *  Qty
 *  Total quantity (e.g. number of shares) filled.
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag14QtyCumQtyTest {
    @Test
    void FIX0014Test() {
        FIX27 fixData = FIX27.FIX14_QTY_CUM_QTY;
        assertEquals( "CUM_QTY", fixData.toFIXNameString());
        assertEquals( "14", fixData.toFIXIDString());
        assertEquals( "CumQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0014Test() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(12345) );
        assertEquals( 12345, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(Tag14QtyCumQty.TESTB_QTY_CUM_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(Tag14QtyCumQty.TESTB_QTY_CUM_QTY));
        assertEquals( Tag14QtyCumQty.TESTB_QTY_CUM_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(Tag14QtyCumQty.TESTB_QTY_CUM_QTY));
        assertEquals( tagData.toFIXIDString() + "=" + Tag14QtyCumQty.TESTB_QTY_CUM_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(Tag14QtyCumQty.TESTB_QTY_CUM_QTY));
        assertEquals( String.valueOf(Tag14QtyCumQty.TESTB_QTY_CUM_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag14QtyCumQty tagData;

        tagData = new Tag14QtyCumQty(new MyQtyType(Tag14QtyCumQty.TESTA_QTY_CUM_QTY));
        assertEquals( "Tag14QtyCumQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag14QtyCumQty.TESTA_QTY_CUM_QTY + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag14QtyCumQty.TESTA_QTY_CUM_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}