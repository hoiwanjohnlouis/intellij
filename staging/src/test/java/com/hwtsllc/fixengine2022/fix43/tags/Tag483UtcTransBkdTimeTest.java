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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  483
 *  TransBkdTime
 *  UTCTimestamp
 *  <p>
 *  For CIV A date and time stamp to indicate the time a CIV order was booked by the fund manager.
 *  <p>
 *  For derivatives a date and time stamp to indicate when this order was booked with the agent prior to submission to the VMU.
 *  <p>
 *  Indicates the time at which the order was finalized between the buyer and seller prior to submission.
 */
class Tag483UtcTransBkdTimeTest {
    @Test
    void FIX0483Test() {
        FIX43 fixData = FIX43.FIX483_UTC_TRANS_BKD_TIME;
        assertEquals( "483", fixData.toFIXIDString());
        assertEquals( "TRANS_BKD_TIME", fixData.toFIXNameString());
        assertEquals( "TransBkdTime", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0483Test() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTA_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag483UtcTransBkdTime.TESTB_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTA_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag483UtcTransBkdTime.TESTB_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTB_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTB_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTB_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag483UtcTransBkdTime tagData;
        String oneElement;

        oneElement = Tag483UtcTransBkdTime.TESTA_UTC_TRANS_BKD_TIME;
        tagData = new Tag483UtcTransBkdTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag483UtcTransBkdTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}