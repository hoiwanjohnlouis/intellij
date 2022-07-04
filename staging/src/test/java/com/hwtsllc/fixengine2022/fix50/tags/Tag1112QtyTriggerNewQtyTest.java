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
 *  1112
 *  TriggerNewQty
 *  Qty
 *  <p>
 *  The Quantity the order should have after the trigger has hit.
 */
class Tag1112QtyTriggerNewQtyTest {
    @Test
    void FIX1112Test() {
        FIX50 fixData = FIX50.FIX1112_QTY_TRIGGER_NEW_QTY;
        assertEquals( "1112", fixData.toEnumIDString());
        assertEquals( "TRIGGER_NEW_QTY", fixData.toEnumNameString());
        assertEquals( "TriggerNewQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1112Test() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTA_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTA_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTB_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1112QtyTriggerNewQty tagData;
        int oneElement;

        oneElement = Tag1112QtyTriggerNewQty.TESTA_QTY_TRIGGER_NEW_QTY;
        tagData = new Tag1112QtyTriggerNewQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag1112QtyTriggerNewQty\n" +
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