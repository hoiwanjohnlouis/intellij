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
import com.hwtsllc.fixengine2022.datatypes.MyUTCDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  449
 *  TotalVolumeTradedDate
 *  UTCDateOnly
 *  <p>
 *  Deprecated in FIX.4.3 Date of TotalVolumeTraded (387).
 *  <p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
// @Deprecated
class Tag449UtcdTotalVolumeTradedDateTest {
    @Test
    void FIX0449Test() {
        FIX43 fixData = FIX43.FIX449_UTCD_TOTAL_VOLUME_TRADED_DATE;
        assertEquals( "449", fixData.toFIXIDString());
        assertEquals( "TOTAL_VOLUME_TRADED_DATE", fixData.toFIXNameString());
        assertEquals( "TotalVolumeTradedDate (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0449Test() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTA_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTA_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag449UtcdTotalVolumeTradedDate tagData;
        String oneElement;

        oneElement = Tag449UtcdTotalVolumeTradedDate.TESTA_UTCD_TOTAL_VOLUME_TRADED_DATE;
        tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ) );
        assertEquals( "Tag449UtcdTotalVolumeTradedDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toVerboseString() );
    }
}