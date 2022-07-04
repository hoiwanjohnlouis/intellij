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
 *  561
 *  RoundLot
 *  Qty
 *  <p>
 *  The trading lot size of a security
 */
class Tag561QtyRoundLotTest {
    @Test
    void FIX0561Test() {
        FIX43 fixData = FIX43.FIX561_QTY_ROUND_LOT;
        assertEquals( "561", fixData.toEnumIDString());
        assertEquals( "ROUND_LOT", fixData.toEnumNameString());
        assertEquals( "RoundLot", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0561Test() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTA_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag561QtyRoundLot.TESTB_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTA_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag561QtyRoundLot.TESTB_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTB_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTB_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTB_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag561QtyRoundLot tagData;
        int oneElement;

        oneElement = Tag561QtyRoundLot.TESTA_QTY_ROUND_LOT;
        tagData = new Tag561QtyRoundLot( new MyQtyType( oneElement ) );
        assertEquals( "Tag561QtyRoundLot\n" +
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