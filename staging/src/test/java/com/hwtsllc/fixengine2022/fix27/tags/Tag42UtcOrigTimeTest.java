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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  42
 *  OrigTime
 *  UTCTimestamp
 *  Time of message origination
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 */
class Tag42UtcOrigTimeTest {
    @Test
    void FIX0042Test() {
        FIX27 fixData = FIX27.FIX42_UTC_ORIG_TIME;
        assertEquals( "ORIG_TIME", fixData.toFIXNameString());
        assertEquals( "42", fixData.toFIXIDString());
        assertEquals( "OrigTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0042Test() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType("20220131") );
        assertEquals( "20220131", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME));
        assertEquals( Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME));
        assertEquals( tagData.toFIXIDString() + "=" + Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME));
        assertEquals( Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag42UtcOrigTime tagData;

        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME));
        assertEquals( "Tag42UtcOrigTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}