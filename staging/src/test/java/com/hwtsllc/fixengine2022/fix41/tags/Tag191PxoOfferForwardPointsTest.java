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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  191
 *  OfferForwardPoints
 *  PriceOffset
 *  <p>
 *  Offer F/X forward points added to spot rate. May be a negative value.
 */
class Tag191PxoOfferForwardPointsTest {
    @Test
    void FIX0191Test() {
        FIX41 fixData = FIX41.FIX191_PXO_OFFER_FORWARD_POINTS;
        assertEquals( "191", fixData.toEnumIDString());
        assertEquals( "OFFER_FORWARD_POINTS", fixData.toEnumNameString());
        assertEquals( "OfferForwardPoints", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0191Test() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS));
        assertEquals( Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        assertEquals( Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                        new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        assertEquals( Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        assertEquals( tagData.toEnumIDString() + "=" +
                        Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS));
        assertEquals( String.valueOf(Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag191PxoOfferForwardPoints tagData;

        tagData = new Tag191PxoOfferForwardPoints(
                new MyPriceOffsetType(Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS));
        assertEquals( "Tag191PxoOfferForwardPoints\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}