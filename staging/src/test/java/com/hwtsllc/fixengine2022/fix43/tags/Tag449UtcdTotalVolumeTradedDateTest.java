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

import com.hwtsllc.fixengine2022.datatypes.MyUTCDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  449
 *  TotalVolumeTradedDate
 *  UTCDateOnly
 *  <p></p>
 *  Deprecated in FIX.4.3 Date of TotalVolumeTraded (387).
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
// @Deprecated
class Tag449UtcdTotalVolumeTradedDateTest {
    Tag449UtcdTotalVolumeTradedDate tagData;
    String [] TestArray = {
            Tag449UtcdTotalVolumeTradedDate.TESTA_UTCD_TOTAL_VOLUME_TRADED_DATE,
            Tag449UtcdTotalVolumeTradedDate.TESTB_UTCD_TOTAL_VOLUME_TRADED_DATE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ));
            assertEquals( "FIX449_UTCD_TOTAL_VOLUME_TRADED_DATE", tagData.toFIXLabelString());
            assertEquals( "449", tagData.toEnumIDString());
            assertEquals( "TOTAL_VOLUME_TRADED_DATE", tagData.toEnumNameString());
            assertEquals( "TotalVolumeTradedDate (replaced)", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag449UtcdTotalVolumeTradedDate( new MyUTCDateType( oneElement ));
            assertEquals( "Tag449UtcdTotalVolumeTradedDate\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}