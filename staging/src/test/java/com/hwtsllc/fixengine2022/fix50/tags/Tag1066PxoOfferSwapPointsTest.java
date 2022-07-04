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
 *  1066
 *  OfferSwapPoints
 *  PriceOffset
 *  <p>
 *  The offer FX Swap points for an FX Swap.
 *  <p>
 *  It is the "far offer forward points - near bid forward points".
 *  <p>
 *  Value can be negative. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1066PxoOfferSwapPointsTest {
    @Test
    void FIX1066Test() {
        FIX50 fixData = FIX50.FIX1066_PXO_OFFER_SWAP_POINTS;
        assertEquals( "1066", fixData.toEnumIDString());
        assertEquals( "OFFER_SWAP_POINTS", fixData.toEnumNameString());
        assertEquals( "OfferSwapPoints", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1066Test() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTA_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1065PxoBidSwapPoints.TESTB_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTA_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1065PxoBidSwapPoints.TESTB_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTB_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTB_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTB_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1065PxoBidSwapPoints tagData;
        double oneElement;

        oneElement = Tag1065PxoBidSwapPoints.TESTA_PXO_BID_SWAP_POINTS;
        tagData = new Tag1065PxoBidSwapPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1065PxoBidSwapPoints\n" +
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