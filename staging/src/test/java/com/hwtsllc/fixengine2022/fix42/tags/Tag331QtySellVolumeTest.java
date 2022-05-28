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
 *  331
 *  SellVolume
 *  Qty
 *  <p>
 *  Quantity sold.
 */
class Tag331QtySellVolumeTest {
    @Test
    void FIX0331Test() {
        FIX42 fixData = FIX42.FIX331_QTY_SELL_VOLUME;
        assertEquals( "331", fixData.toFIXIDString());
        assertEquals( "SELL_VOLUME", fixData.toFIXNameString());
        assertEquals( "SellVolume", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0331Test() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTA_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag331QtySellVolume.TESTB_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTA_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag331QtySellVolume.TESTB_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTB_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTB_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTB_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag331QtySellVolume tagData;
        int oneElement;

        oneElement = Tag331QtySellVolume.TESTA_QTY_SELL_VOLUME;
        tagData = new Tag331QtySellVolume( new MyQtyType( oneElement ) );
        assertEquals( "Tag331QtySellVolume\n" +
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