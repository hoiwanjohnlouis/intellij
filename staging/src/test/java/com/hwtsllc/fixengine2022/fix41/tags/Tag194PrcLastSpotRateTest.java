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
import com.hwtsllc.fixengine2022.fix40.tags.Tag140PrcPrevClosePx;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  194
 *  LastSpotRate
 *  Price
 *  <p>
 *  F/X spot rate.
 */
class Tag194PrcLastSpotRateTest {
    @Test
    void FIX0194Test() {
        FIX41 fixData = FIX41.FIX194_PRC_LAST_SPOT_RATE;
        assertEquals( "194", fixData.toFIXIDString());
        assertEquals( "LAST_SPOT_RATE", fixData.toFIXNameString());
        assertEquals( "LastSpotRate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0194Test() {
        Tag194PrcLastSpotRate tagData;

        tagData = new Tag194PrcLastSpotRate(new MyPriceType(Tag194PrcLastSpotRate.TESTA_PRC_LAST_SPOT_RATE));
        assertEquals( Tag194PrcLastSpotRate.TESTA_PRC_LAST_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag194PrcLastSpotRate(new MyPriceType(Tag194PrcLastSpotRate.TESTB_PRC_LAST_SPOT_RATE));
        assertEquals( Tag194PrcLastSpotRate.TESTB_PRC_LAST_SPOT_RATE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag140PrcPrevClosePx tagData;

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag140PrcPrevClosePx tagData;

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag140PrcPrevClosePx tagData;

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( tagData.toFIXIDString() + "=" + Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag140PrcPrevClosePx tagData;

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX));
        assertEquals( String.valueOf(Tag140PrcPrevClosePx.TESTB_PRC_PREV_CLOSE_PX),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag140PrcPrevClosePx tagData;

        tagData = new Tag140PrcPrevClosePx(new MyPriceType(Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX));
        assertEquals( "Tag140PrcPrevClosePx\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag140PrcPrevClosePx.TESTA_PRC_PREV_CLOSE_PX + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}