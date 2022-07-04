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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  122
 *  OrigSendingTime
 *  UTCTimestamp
 *  Original time of message transmission
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *  when transmitting orders as the result of a resend request.
 */
class Tag122UtcOrigSendingTimeTest {
    @Test
    void FIX0122Test() {
        FIX40 fixData = FIX40.FIX122_UTC_ORIG_SENDING_TIME;
        assertEquals( "ORIG_SENDING_TIME", fixData.toEnumNameString());
        assertEquals( "122", fixData.toEnumIDString());
        assertEquals( "OrigSendingTime", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0122Test() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = "KimSoYeon-Tag122UtcOrigSendingTime";
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag122UtcOrigSendingTime.TESTA_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag122UtcOrigSendingTime.TESTB_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = Tag122UtcOrigSendingTime.TESTA_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag122UtcOrigSendingTime.TESTB_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = Tag122UtcOrigSendingTime.TESTB_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = Tag122UtcOrigSendingTime.TESTB_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = Tag122UtcOrigSendingTime.TESTB_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag122UtcOrigSendingTime tagData;
        String oneElement;

        oneElement = Tag122UtcOrigSendingTime.TESTA_UTC_ORIG_SENDING_TIME;
        tagData = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag122UtcOrigSendingTime\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}