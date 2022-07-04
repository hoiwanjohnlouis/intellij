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
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  135
 *  OfferSize
 *  Qty
 *  Quantity of offer
 *      (Prior to FIX 4.2 this field was of type int)
 */
class Tag135QtyOfferSizeTest {
    @Test
    void FIX0135Test() {
        FIX40 fixData = FIX40.FIX135_QTY_OFFER_SIZE;
        assertEquals( "OFFER_SIZE", fixData.toEnumNameString());
        assertEquals( "135", fixData.toEnumIDString());
        assertEquals( "OfferSize", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0135Test() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(200) );
        assertEquals( 200, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE));
        assertEquals( Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE));
        assertEquals( String.valueOf(Tag135QtyOfferSize.TESTB_QTY_OFFER_SIZE),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag135QtyOfferSize tagData;

        tagData = new Tag135QtyOfferSize(new MyQtyType(Tag135QtyOfferSize.TESTA_QTY_OFFER_SIZE));
        assertEquals( "Tag135QtyOfferSize\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag135QtyOfferSize.TESTA_QTY_OFFER_SIZE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag135QtyOfferSize.TESTA_QTY_OFFER_SIZE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}