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

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  190
 *  OfferSpotRate
 *  Price
 *  <p></p>
 *  Offer F/X spot rate.
 */
class Tag190PrcOfferSpotRateTest {
    @Test
    void PrintTest() {
        Tag190PrcOfferSpotRate tagData;
        double oneElement;

        oneElement = Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE;
        tagData = new Tag190PrcOfferSpotRate( new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE;
        tagData = new Tag190PrcOfferSpotRate( new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag190PrcOfferSpotRate tagData;
        double oneElement;

        oneElement = Tag190PrcOfferSpotRate.TESTA_PRC_OFFER_SPOT_RATE;
        tagData = new Tag190PrcOfferSpotRate( new MyPriceType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag190PrcOfferSpotRate.TESTB_PRC_OFFER_SPOT_RATE;
        tagData = new Tag190PrcOfferSpotRate( new MyPriceType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag190PrcOfferSpotRate tagData ) {
        assertEquals( "FIX190_PRC_OFFER_SPOT_RATE", tagData.toEnumLabelString());
        assertEquals( "190", tagData.toEnumIDString());
        assertEquals( "OFFER_SPOT_RATE", tagData.toEnumNameString());
        assertEquals( "OfferSpotRate", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag190PrcOfferSpotRate tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag190PrcOfferSpotRate tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag190PrcOfferSpotRate tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag190PrcOfferSpotRate tagData ) {
        assertEquals( "Tag190PrcOfferSpotRate\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}