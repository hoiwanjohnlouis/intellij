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
 *  330
 *  BuyVolume
 *  Qty
 *  <p>
 *  Quantity bought.
 */
class Tag330QtyBuyVolumeTest {
    @Test
    void FIX0330Test() {
        FIX42 fixData = FIX42.FIX330_QTY_BUY_VOLUME;
        assertEquals( "330", fixData.toEnumIDString());
        assertEquals( "BUY_VOLUME", fixData.toEnumNameString());
        assertEquals( "BuyVolume", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0330Test() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTA_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag330QtyBuyVolume.TESTB_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTA_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag330QtyBuyVolume.TESTB_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTB_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTB_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTB_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag330QtyBuyVolume tagData;
        int oneElement;

        oneElement = Tag330QtyBuyVolume.TESTA_QTY_BUY_VOLUME;
        tagData = new Tag330QtyBuyVolume( new MyQtyType( oneElement ) );
        assertEquals( "Tag330QtyBuyVolume\n" +
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