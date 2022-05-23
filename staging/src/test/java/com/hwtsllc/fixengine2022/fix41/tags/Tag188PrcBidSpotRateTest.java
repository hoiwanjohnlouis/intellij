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
import com.hwtsllc.fixengine2022.fix40.tags.Tag188PrcBidSpotRate;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  188
 *  BidSpotRate
 *  Price
 *  <p>
 *  Bid F/X spot rate.
 */
class Tag188PrcBidSpotRateTest {
    @Test
    void FIX0188Test() {
        FIX41 fixData = FIX41.FIX188_PRC_BID_SPOT_RATE;
        assertEquals( "188", fixData.toFIXIDString());
        assertEquals( "BID_SPOT_RATE", fixData.toFIXNameString());
        assertEquals( "BidSpotRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0188Test() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTA_PRC_BID_SPOT_RATE));
        assertEquals( Tag188PrcBidSpotRate.TESTA_PRC_BID_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTB_PRC_BID_SPOT_RATE));
        assertEquals( Tag188PrcBidSpotRate.TESTB_PRC_BID_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( tagData.toFIXIDString() + "=" + Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( String.valueOf(Tag188PrcBidSpotRate.TESTB_PRC_PREV_CLOSE_PX),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag188PrcBidSpotRate tagData;

        tagData = new Tag188PrcBidSpotRate(new MyPriceType(Tag188PrcBidSpotRate.TESTA_PRC_PREV_CLOSE_PX));
        assertEquals( "Tag188PrcBidSpotRate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag188PrcBidSpotRate.TESTA_PRC_PREV_CLOSE_PX + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag188PrcBidSpotRate.TESTA_PRC_PREV_CLOSE_PX + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}