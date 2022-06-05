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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag646PrcMktOfferPx;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  646
 *  MktOfferPx
 *  Price
 *  <p>
 *  Used to indicate the best offer in a market
 */
class Tag646PrcMktOfferPxTest {
    @Test
    void FIX0646Test() {
        FIX43 fixData = FIX43.FIX646_PRC_MKT_OFFER_PX;
        assertEquals( "646", fixData.toFIXIDString());
        assertEquals( "MKT_OFFER_PX", fixData.toFIXNameString());
        assertEquals( "MktOfferPx", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0646Test() {
        Tag646PrcMktOfferPx tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag646PrcMktOfferPx tagData;
        double oneElement;

        oneElement = Tag646PrcMktOfferPx.TESTA_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag646PrcMktOfferPx.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag646PrcMktOfferPx tagData;
        double oneElement;

        oneElement = Tag646PrcMktOfferPx.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag646PrcMktOfferPx tagData;
        double oneElement;

        oneElement = Tag646PrcMktOfferPx.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag646PrcMktOfferPx tagData;
        double oneElement;

        oneElement = Tag646PrcMktOfferPx.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag646PrcMktOfferPx tagData;
        double oneElement;

        oneElement = Tag646PrcMktOfferPx.TESTA_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag646PrcMktOfferPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag646PrcMktOfferPx\n" +
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