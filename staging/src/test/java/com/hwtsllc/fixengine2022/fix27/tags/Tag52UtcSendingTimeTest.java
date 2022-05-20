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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  52
 *  SendingTime
 *  UTCTimestamp
 *  Time of message transmission
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 */
class Tag52UtcSendingTimeTest {
    @Test
    void FIX0052Test() {
        FIX27 fixData = FIX27.FIX52_UTC_SENDING_TIME;
        assertEquals( "SENDING_TIME", fixData.toFIXNameString());
        assertEquals( "52", fixData.toFIXIDString());
        assertEquals( "SendingTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0052Test() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType("20220320 141400") );
        assertEquals( "20220320 141400", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType(Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType(Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME));
        assertEquals( Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType(Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME));
        assertEquals( tagData.toFIXIDString() + "=" + Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType(Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME));
        assertEquals( Tag52UtcSendingTime.TESTB_UTC_SENDING_TIME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag52UtcSendingTime tagData;

        tagData = new Tag52UtcSendingTime(new MyUTCTimestampType(Tag52UtcSendingTime.TESTA_UTC_SENDING_TIME));
        assertEquals( "Tag52UtcSendingTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag52UtcSendingTime.TESTA_UTC_SENDING_TIME + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag52UtcSendingTime.TESTA_UTC_SENDING_TIME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}