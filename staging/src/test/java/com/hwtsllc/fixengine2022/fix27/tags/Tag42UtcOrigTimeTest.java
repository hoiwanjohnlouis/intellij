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
        assertEquals( "ORIG_TIME", fixData.toEnumNameString());
        assertEquals( "42", fixData.toEnumIDString());
        assertEquals( "OrigTime", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0042Test() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = "20220131";
        tagData = new Tag42UtcOrigTime(new MyUTCTimestampType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = Tag42UtcOrigTime.TESTB_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag42UtcOrigTime tagData;
        String oneElement;

        oneElement = Tag42UtcOrigTime.TESTA_UTC_ORIG_TIME;
        tagData = new Tag42UtcOrigTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag42UtcOrigTime\n" +
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