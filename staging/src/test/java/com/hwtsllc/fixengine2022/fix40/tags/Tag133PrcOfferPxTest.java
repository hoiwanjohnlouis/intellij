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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  133
 *  OfferPx
 *  Price
 *  Offer price/rate
 */
class Tag133PrcOfferPxTest {
    @Test
    void FIX0133Test() {
        FIX40 fixData = FIX40.FIX133_PRC_OFFER_PX;
        assertEquals( "OFFER_PX", fixData.toFIXNameString());
        assertEquals( "133", fixData.toFIXIDString());
        assertEquals( "OfferPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0133Test() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(133D) );
        assertEquals( 133D, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(Tag133PrcOfferPx.TESTB_PRC_OFFER_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(Tag133PrcOfferPx.TESTB_PRC_OFFER_PX));
        assertEquals( Tag133PrcOfferPx.TESTB_PRC_OFFER_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(Tag133PrcOfferPx.TESTB_PRC_OFFER_PX));
        assertEquals( tagData.toFIXIDString() + "=" + Tag133PrcOfferPx.TESTB_PRC_OFFER_PX,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(Tag133PrcOfferPx.TESTB_PRC_OFFER_PX));
        assertEquals( String.valueOf(Tag133PrcOfferPx.TESTB_PRC_OFFER_PX),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag133PrcOfferPx tagData;

        tagData = new Tag133PrcOfferPx(new MyPriceType(Tag133PrcOfferPx.TESTA_PRC_OFFER_PX));
        assertEquals( "Tag133PrcOfferPx\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag133PrcOfferPx.TESTA_PRC_OFFER_PX + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag133PrcOfferPx.TESTA_PRC_OFFER_PX + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}