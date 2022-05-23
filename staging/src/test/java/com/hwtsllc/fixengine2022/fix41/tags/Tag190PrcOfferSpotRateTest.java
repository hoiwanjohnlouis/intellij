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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  190
 *  OfferSpotRate
 *  Price
 *  <p>
 *  Offer F/X spot rate.
 */
class Tag190PrcOfferSpotRateTest {
    @Test
    void FIX0190Test() {
        FIX41 fixData = FIX41.FIX190_PRC_OFFER_SPOT_RATE;
        assertEquals( "190", fixData.toFIXIDString());
        assertEquals( "OFFER_SPOT_RATE", fixData.toFIXNameString());
        assertEquals( "OfferSpotRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0190Test() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(new MyPriceType(Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE));
        assertEquals( Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag190PrcOfferSpotRate(new MyPriceType(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE));
        assertEquals( Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(
                new MyPriceType(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(
                new MyPriceType(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE));
        assertEquals( Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(
                new MyPriceType(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE));
        assertEquals( tagData.toFIXIDString() + "=" + Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(
                new MyPriceType(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE));
        assertEquals( String.valueOf(Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag190PrcOfferSpotRate tagData;

        tagData = new Tag190PrcOfferSpotRate(
                new MyPriceType(Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE));
        assertEquals( "Tag190PrcOfferSpotRate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" +
                                            Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}