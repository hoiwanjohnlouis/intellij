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
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1069
 *  SwapPoints
 *  PriceOffset
 *  <p>
 *  For FX Swap, this is used to express the differential
 *  between the far leg's bid/offer and the near leg's bid/offer.
 *  <p>
 *  Value can be negative. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1069PxoSwapPointsTest {
    @Test
    void FIX1069Test() {
        FIX50 fixData = FIX50.FIX1069_PXO_SWAP_POINTS;
        assertEquals( "1069", fixData.toEnumIDString());
        assertEquals( "SWAP_POINTS", fixData.toEnumNameString());
        assertEquals( "SwapPoints", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1069Test() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTA_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1069PxoSwapPoints.TESTB_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTA_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1069PxoSwapPoints.TESTB_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTB_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTB_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTB_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1069PxoSwapPoints tagData;
        double oneElement;

        oneElement = Tag1069PxoSwapPoints.TESTA_PXO_SWAP_POINTS;
        tagData = new Tag1069PxoSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1069PxoSwapPoints\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}