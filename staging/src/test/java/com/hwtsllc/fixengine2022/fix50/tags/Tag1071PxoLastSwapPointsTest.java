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
 *  1071
 *  LastSwapPoints
 *  PriceOffset
 *  <p>
 *  For FX Swap, this is used to express the last market event for the differential
 *  between the far leg's bid/offer and the near leg's bid/offer in a fill or partial fill.
 *  <p>
 *  Value can be negative. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1071PxoLastSwapPointsTest {
    @Test
    void FIX1071Test() {
        FIX50 fixData = FIX50.FIX1071_PXO_LAST_SWAP_POINTS;
        assertEquals( "1071", fixData.toFIXIDString());
        assertEquals( "LAST_SWAP_POINTS", fixData.toFIXNameString());
        assertEquals( "LastSwapPoints", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1071Test() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTA_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTA_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTB_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1071PxoLastSwapPoints tagData;
        double oneElement;

        oneElement = Tag1071PxoLastSwapPoints.TESTA_PXO_LAST_SWAP_POINTS;
        tagData = new Tag1071PxoLastSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1071PxoLastSwapPoints\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}