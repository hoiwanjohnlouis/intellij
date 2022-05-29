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
 *  1082
 *  SecondaryDisplayQty
 *  Qty
 *  <p>
 *  Used for reserve orders when DisplayQty applies to the primary execution market (e.g.an ECN)
 *  and another quantity is to be shown at other markets (e.g. the exchange).
 *  <p>
 *  On orders specifies the qty to be displayed, on execution reports the currently displayed quantity.
 */
class Tag1082QtySecondaryDisplayQtyTest {
    @Test
    void FIX1082Test() {
        FIX50 fixData = FIX50.FIX1082_QTY_SECONDARY_DISPLAY_QTY;
        assertEquals( "1082", fixData.toFIXIDString());
        assertEquals( "SECONDARY_DISPLAY_QTY", fixData.toFIXNameString());
        assertEquals( "SecondaryDisplayQty", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1082Test() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTA_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1082QtySecondaryDisplayQty.TESTB_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTA_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1082QtySecondaryDisplayQty.TESTB_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTB_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTB_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTB_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1082QtySecondaryDisplayQty tagData;
        int oneElement;

        oneElement = Tag1082QtySecondaryDisplayQty.TESTA_QTY_SECONDARY_DISPLAY_QTY;
        tagData = new Tag1082QtySecondaryDisplayQty( new MyQtyType( oneElement ) );
        assertEquals( "Tag1082QtySecondaryDisplayQty\n" +
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