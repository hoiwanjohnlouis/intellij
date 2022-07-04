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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  367
 *  QuoteSetValidUntilTime
 *  UTCTimestamp
 *  <p>
 *  Indicates expiration time of this particular QuoteSet
 *  <p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as "GMT")
 */
class Tag367UtcQuoteSetValidUntilTimeTest {
    @Test
    void FIX0367Test() {
        FIX42 fixData = FIX42.FIX367_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        assertEquals( "367", fixData.toEnumIDString());
        assertEquals( "QUOTE_SET_VALID_UNTIL_TIME", fixData.toEnumNameString());
        assertEquals( "QuoteSetValidUntilTime", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0367Test() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTB_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag367UtcQuoteSetValidUntilTime tagData;
        String oneElement;

        oneElement = Tag367UtcQuoteSetValidUntilTime.TESTA_UTC_QUOTE_SET_VALID_UNTIL_TIME;
        tagData = new Tag367UtcQuoteSetValidUntilTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag367UtcQuoteSetValidUntilTime\n" +
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