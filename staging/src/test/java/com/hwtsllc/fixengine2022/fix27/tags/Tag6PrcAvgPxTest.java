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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  6
 *  AvgPx
 *  Price
 *  Calculated average price of all fills on this order.
 *
 *  For Fixed Income trades AvgPx is always expressed as percent-of-par,
 *  regardless of the PriceType (423) of LastPx (31).
 *  i.e., AvgPx will contain an average of percent-of-par values
 *  (see LastParPx (669)) for issues traded in Yield, Spread or Discount.
 */
class Tag6PrcAvgPxTest {
    @Test
    void FIX0006Test() {
        FIX27 fixData = FIX27.FIX6_PRC_AVG_PX;
        assertEquals( "AVG_PX", fixData.toFIXNameString());
        assertEquals( "6", fixData.toFIXIDString());
        assertEquals( "AvgPx", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(Tag6PrcAvgPx.TESTA_PRC_AVG_PX));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(Tag6PrcAvgPx.TESTA_PRC_AVG_PX));
        assertEquals( Tag6PrcAvgPx.TESTA_PRC_AVG_PX, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(Tag6PrcAvgPx.TESTA_PRC_AVG_PX));
        assertEquals( "6=" + Tag6PrcAvgPx.TESTA_PRC_AVG_PX, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(Tag6PrcAvgPx.TESTA_PRC_AVG_PX));
        assertEquals( "Tag6PrcAvgPx\n" +
                "\tEnumName[FIX6_PRC_AVG_PX]\n" +
                "\tFIXID[6]\n" +
                "\tFIXName[AVG_PX]\n" +
                "\tFIXDescription[AvgPx]\n" +
                "\tDataValue[" + Tag6PrcAvgPx.TESTA_PRC_AVG_PX + "]\n" +
                "\tValuePair[6=" + Tag6PrcAvgPx.TESTA_PRC_AVG_PX + "]", tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
    @Test
    void TagToStringTest() {
        Tag6PrcAvgPx tagData;

        tagData = new Tag6PrcAvgPx(new MyPriceType(Tag6PrcAvgPx.TESTA_PRC_AVG_PX));
        assertEquals( String.valueOf(Tag6PrcAvgPx.TESTA_PRC_AVG_PX), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
}