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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1056
 *  CalculatedCcyLastQty
 *  Qty
 *  <p>
 *  Used for the calculated quantity of the other side of the currency trade.
 *  <p>
 *  Can be derived from LastQty and LastPx.
 */
class Tag1056QtyCalculatedCcyLastQtyTest {
    @Test
    void FIX1056Test() {
        FIX50 fixData = FIX50.FIX1056_QTY_CALCULATED_CCY_LAST_QTY;
        assertEquals( "1056", fixData.toEnumIDString());
        assertEquals( "CALCULATED_CCY_LAST_QTY", fixData.toEnumNameString());
        assertEquals( "CalculatedCcyLastQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1056Test() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTA_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTB_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTA_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTB_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTB_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTB_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTB_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1056QtyCalculatedCcyLastQty tagData;
        int oneElement;

        oneElement = Tag1056QtyCalculatedCcyLastQty.TESTA_QTY_CALCULATED_CCY_LAST_QTY;
        tagData = new Tag1056QtyCalculatedCcyLastQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag1056QtyCalculatedCcyLastQty\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}