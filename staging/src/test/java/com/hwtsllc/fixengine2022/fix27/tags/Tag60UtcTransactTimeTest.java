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
 *  60
 *  TransactTime
 *  UTCTimestamp
 *  Time of execution/order creation
 *  (expressed in UTC (Universal Time Coordinated), also known as "GMT")
 */
class Tag60UtcTransactTimeTest {
    @Test
    void FIX0060Test() {
        FIX27 fixData = FIX27.FIX60_UTC_TRANSACT_TIME;
        assertEquals( "TRANSACT_TIME", fixData.toFIXNameString());
        assertEquals( "60", fixData.toFIXIDString());
        assertEquals( "TransactTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0060Test() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType("20220401 000000") );
        assertEquals( "20220401 000000", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME));
        assertEquals( Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME));
        assertEquals( tagData.toFIXIDString() + "=" + Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME));
        assertEquals( Tag60UtcTransactTime.TESTB_UTC_TRANSACT_TIME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag60UtcTransactTime tagData;

        tagData = new Tag60UtcTransactTime(new MyUTCTimestampType(Tag60UtcTransactTime.TESTA_UTC_TRANSACT_TIME));
        assertEquals( "Tag60UtcTransactTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag60UtcTransactTime.TESTA_UTC_TRANSACT_TIME + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag60UtcTransactTime.TESTA_UTC_TRANSACT_TIME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}