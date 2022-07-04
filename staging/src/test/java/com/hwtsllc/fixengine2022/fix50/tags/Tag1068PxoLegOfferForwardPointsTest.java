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
 *  1068
 *  LegOfferForwardPoints
 *  PriceOffset
 *  <p>
 *  The offer FX forward points for the leg of an FX Swap.
 *  <p>
 *  Value can be negative. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag1068PxoLegOfferForwardPointsTest {
    @Test
    void FIX1068Test() {
        FIX50 fixData = FIX50.FIX1068_PXO_LEG_OFFER_FORWARD_POINTS;
        assertEquals( "1068", fixData.toEnumIDString());
        assertEquals( "LEG_OFFER_FORWARD_POINTS", fixData.toEnumNameString());
        assertEquals( "LegOfferForwardPoints", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1068Test() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTA_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTB_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTA_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTB_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTB_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTB_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTB_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1068PxoLegOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag1068PxoLegOfferForwardPoints.TESTA_PXO_LEG_OFFER_FORWARD_POINTS;
        tagData = new Tag1068PxoLegOfferForwardPoints( new MyPriceOffsetType( oneElement ) );
        assertEquals( "Tag1068PxoLegOfferForwardPoints\n" +
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