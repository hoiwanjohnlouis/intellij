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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  168
 *  EffectiveTime
 *  UTCTimestamp
 *  <p>
 *  Time the details within the message should take effect (always expressed in UTC (Universal Time Coordinated),
 *  also known as "GMT")
 */
class Tag168UtcEffectiveTimeTest {
    @Test
    void FIX0168Test() {
        FIX41 fixData = FIX41.FIX168_UTC_EFFECTIVE_TIME;
        assertEquals( "168", fixData.toFIXIDString());
        assertEquals( "EFFECTIVE_TIME", fixData.toFIXNameString());
        assertEquals( "EffectiveTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0168Test() {
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME));
        assertEquals( Tag168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        assertEquals( Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        assertEquals( Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        assertEquals( tagData.toFIXIDString() + "=" + Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag168UtcEffectiveTime tagData;

        tagData = new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        assertEquals( Tag168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag168UtcEffectiveTime tagData;

        tagData =
                new Tag168UtcEffectiveTime(new MyUTCTimestampType(Tag168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME));
        assertEquals( "Tag168UtcEffectiveTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}