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
 *  126
 *  ExpireTime
 *  UTCTimestamp
 *  Time/Date of order expiration
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *      The meaning of expiration is specific to the context where the field is used.
 *      For orders,
 *          this is the expiration time of a Good Til Date TimeInForce.
 *      For Quotes,
 *          this is the expiration of the quote.
 *
 *      Expiration time is provided across the quote message dialog
 *      to control the length of time of the overall quoting process.
 *
 *      For collateral requests,
 *          this is the time by which collateral must be assigned.
 *      For collateral assignments,
 *          this is the time by which a response to the assignment is expected.
 */
class Tag126UtcExpireTimeTest {
    @Test
    void FIX0126Test() {
        FIX40 fixData = FIX40.FIX126_UTC_EXPIRE_TIME;
        assertEquals( "EXPIRE_TIME", fixData.toFIXNameString());
        assertEquals( "126", fixData.toFIXIDString());
        assertEquals( "ExpireTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0126Test() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = "HaJiWon-Tag126UtcExpireTime";
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag126UtcExpireTime.TESTA_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = Tag126UtcExpireTime.TESTA_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag126UtcExpireTime tagData;
        String oneElement;

        oneElement = Tag126UtcExpireTime.TESTA_UTC_EXPIRE_TIME;
        tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag126UtcExpireTime\n" +
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