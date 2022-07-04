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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  319
 *  RatioQty
 *  Qty
 *  <p>
 *  Deprecated in FIX.4.2 Quantity of a particular leg in the security.
 */
// @Deprecated
class Tag319QtyRatioQtyTest {
    @Test
    void FIX0319Test() {
        FIX42 fixData = FIX42.FIX319_QTY_RATIO_QTY;
        assertEquals( "319", fixData.toEnumIDString());
        assertEquals( "RATIO_QTY", fixData.toEnumNameString());
        assertEquals( "RatioQty (unused)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0319Test() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTA_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag319QtyRatioQty.TESTB_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTA_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag319QtyRatioQty.TESTB_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTB_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTB_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTB_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag319QtyRatioQty tagData;
        int oneElement;

        oneElement = Tag319QtyRatioQty.TESTA_QTY_RATIO_QTY;
        tagData = new Tag319QtyRatioQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag319QtyRatioQty\n" +
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