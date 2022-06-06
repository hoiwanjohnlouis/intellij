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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  652
 *  UnderlyingLastQty
 *  Qty
 *  <p>
 *  The calculated or traded quantity for the underlying instrument that corresponds to a derivative.
 *  <p>
 *  Used for transactions that include the cash instrument and the derivative.
 */
class Tag652QtyUnderlyingLastQtyTest {
    @Test
    void FIX0652Test() {
        FIX43 fixData = FIX43.FIX652_QTY_UNDERLYING_LAST_QTY;
        assertEquals( "652", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_LAST_QTY", fixData.toFIXNameString());
        assertEquals( "UnderlyingLastQty", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0652Test() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTA_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag652QtyUnderlyingLastQty.TESTB_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTA_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag652QtyUnderlyingLastQty.TESTB_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTB_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTB_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTB_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag652QtyUnderlyingLastQty tagData;
        int oneElement;

        oneElement = Tag652QtyUnderlyingLastQty.TESTA_QTY_UNDERLYING_LAST_QTY;
        tagData = new Tag652QtyUnderlyingLastQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag652QtyUnderlyingLastQty\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}