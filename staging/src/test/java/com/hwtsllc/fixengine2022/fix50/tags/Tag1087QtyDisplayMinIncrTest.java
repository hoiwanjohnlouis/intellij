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
 *  1087
 *  DisplayMinIncr
 *  Qty
 *  <p>
 *  Defines the minimum increment to be used when calculating a random refresh of DisplayQty.
 *  <p>
 *  A user specifies this when he wants a larger increment than
 *  the standard provided by the market (e.g. the round lot size).
 */
class Tag1087QtyDisplayMinIncrTest {
    @Test
    void FIX1087Test() {
        FIX50 fixData = FIX50.FIX1087_QTY_DISPLAY_MIN_INCR;
        assertEquals( "1087", fixData.toEnumIDString());
        assertEquals( "DISPLAY_MIN_INCR", fixData.toEnumNameString());
        assertEquals( "DisplayMinIncr", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1087Test() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTA_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1087QtyDisplayMinIncr.TESTB_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTA_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1087QtyDisplayMinIncr.TESTB_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTB_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTB_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTB_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1087QtyDisplayMinIncr tagData;
        int oneElement;

        oneElement = Tag1087QtyDisplayMinIncr.TESTA_QTY_DISPLAY_MIN_INCR;
        tagData = new Tag1087QtyDisplayMinIncr( new MyQtyType( oneElement ) );
        assertEquals( "Tag1087QtyDisplayMinIncr\n" +
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