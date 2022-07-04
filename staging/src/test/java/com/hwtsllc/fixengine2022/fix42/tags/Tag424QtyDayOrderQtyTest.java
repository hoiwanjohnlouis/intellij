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
 *  424
 *  DayOrderQty
 *  Qty
 *  <p>
 *  For GT orders, the OrderQty (38) less all quantity (adjusted for stock splits)
 *  that traded on previous days.
 *  <p>
 *  DayOrderQty (424) = OrderQty – (CumQty (14) – DayCumQty (425))
 */
class Tag424QtyDayOrderQtyTest {
    @Test
    void FIX0424Test() {
        FIX42 fixData = FIX42.FIX424_QTY_DAY_ORDER_QTY;
        assertEquals( "424", fixData.toEnumIDString());
        assertEquals( "DAY_ORDER_QTY", fixData.toEnumNameString());
        assertEquals( "DayOrderQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0424Test() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTA_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTA_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTB_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag424QtyDayOrderQty tagData;
        int oneElement;

        oneElement = Tag424QtyDayOrderQty.TESTA_QTY_DAY_ORDER_QTY;
        tagData = new Tag424QtyDayOrderQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag424QtyDayOrderQty\n" +
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