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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  450
 *  TotalVolumeTraded Time
 *  UTCTimeOnly
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  Time of TotalVolumeTraded (387).
 */
// @Deprecated
class Tag450UtctTotalVolumeTradedTimeTest {
    @Test
    void FIX0450Test() {
        FIX43 fixData = FIX43.FIX450_UTCT_TOTAL_VOLUME_TRADED_TIME;
        assertEquals( "450", fixData.toFIXIDString());
        assertEquals( "TOTAL_VOLUME_TRADED_TIME", fixData.toFIXNameString());
        assertEquals( "TotalVolumeTradedTime (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0450Test() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTA_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTB_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTA_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTB_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTB_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTB_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTB_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag450UtctTotalVolumeTradedTime tagData;
        String oneElement;

        oneElement = Tag450UtctTotalVolumeTradedTime.TESTA_UTCT_TOTAL_VOLUME_TRADED_TIME;
        tagData = new Tag450UtctTotalVolumeTradedTime(new MyUTCTimeType( oneElement ) );
        assertEquals( "Tag450UtctTotalVolumeTradedTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toVerboseString() );
    }
}