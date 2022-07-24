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

import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  126
 *  ExpireTime
 *  UTCTimestamp
 *  <p></p>
 *  Time/Date of order expiration
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *  <p></p>
 *      The meaning of expiration is specific to the context where the field is used.
 *  <p></p>
 *      For Orders,
 *          this is the expiration time of a Good Til Date TimeInForce.
 *  <p></p>
 *      For Quotes,
 *          this is the expiration of the quote.
 *  <p></p>
 *      Expiration time is provided across the quote message dialog
 *      to control the length of time of the overall quoting process.
 *  <p></p>
 *      For collateral requests,
 *          this is the time by which collateral must be assigned.
 *  <p></p>
 *      For collateral assignments,
 *          this is the time by which a response to the assignment is expected.
 */
class Tag126UtcExpireTimeTest {
    Tag126UtcExpireTime tagData;
    String [] TestArray = {
            Tag126UtcExpireTime.TESTA_UTC_EXPIRE_TIME,
            Tag126UtcExpireTime.TESTB_UTC_EXPIRE_TIME
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            assertEquals( "FIX126_UTC_EXPIRE_TIME", tagData.toEnumLabelString());
            assertEquals( "EXPIRE_TIME", tagData.toEnumNameString());
            assertEquals( "126", tagData.toEnumIDString());
            assertEquals( "ExpireTime", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag126UtcExpireTime( new MyUTCTimestampType( oneElement ));
            assertEquals( "Tag126UtcExpireTime\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
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