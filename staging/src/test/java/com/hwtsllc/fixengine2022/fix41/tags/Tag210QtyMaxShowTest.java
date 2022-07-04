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
 *  210
 *  MaxShow
 *  Qty
 *  <p>
 *  Deprecated in FIX.5.0
 *  <p>
 *  Maximum quantity (e.g. number of shares) within an order to be shown to other customers (i.e. sent via an IOI).
 *  <p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag210QtyMaxShowTest {
    @Test
    void FIX0210Test() {
        FIX41 fixData = FIX41.FIX210_QTY_MAX_SHOW;
        assertEquals( "210", fixData.toEnumIDString());
        assertEquals( "MAX_SHOW", fixData.toEnumNameString());
        assertEquals( "MaxShow", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0210Test() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        assertEquals( Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        assertEquals( Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        assertEquals( tagData.toEnumIDString() + "=" + Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        assertEquals( String.valueOf(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag210QtyMaxShow tagData;

        tagData = new Tag210QtyMaxShow(new MyQtyType(Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW));
        assertEquals( "Tag210QtyMaxShow\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag210QtyMaxShow.TESTA_QTY_MAX_SHOW + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}