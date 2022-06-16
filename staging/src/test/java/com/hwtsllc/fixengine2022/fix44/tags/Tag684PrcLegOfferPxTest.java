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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  684
 *  LegOfferPx
 *  Price
 *  <p></p>
 *  Offer price of this leg.
 *  <p></p>
 *  See OfferPx (133) for description and valid values
 */
class Tag684PrcLegOfferPxTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX684_PRC_LEG_OFFER_PX;
        assertEquals( "684", fixData.toFIXIDString());
        assertEquals( "LEG_OFFER_PX", fixData.toFIXNameString());
        assertEquals( "LegOfferPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0684Test() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTA_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "684", tagData.toFIXIDString());
        assertEquals( "LEG_OFFER_PX", tagData.toFIXNameString());
        assertEquals( "LegOfferPx", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag684PrcLegOfferPx.TESTB_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTA_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag684PrcLegOfferPx.TESTB_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTB_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTB_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTB_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag684PrcLegOfferPx tagData;
        double oneElement;

        oneElement = Tag684PrcLegOfferPx.TESTA_PRC_LEG_OFFER_PX;
        tagData = new Tag684PrcLegOfferPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag684PrcLegOfferPx\n" +
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