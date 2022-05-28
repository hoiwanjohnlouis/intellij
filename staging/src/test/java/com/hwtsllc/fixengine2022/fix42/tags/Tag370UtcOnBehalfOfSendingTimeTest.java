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
 *  370
 *  OnBehalfOfSendingTime
 *  UTCTimestamp
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  Used when a message is sent via a 'hub' or 'service bureau'.
 *  <p>
 *  If A sends to Q (the hub), who then sends to B via a separate FIX session, then when Q sends to B,
 *  the value of this field should represent the SendingTime on the message A sent to Q.
 *  <p></p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as 'GMT')
 */
class Tag370UtcOnBehalfOfSendingTimeTest {
    @Test
    void FIX0370Test() {
        FIX42 fixData = FIX42.FIX370_UTC_ON_BEHALF_OF_SENDING_TIME;
        assertEquals( "370", fixData.toFIXIDString());
        assertEquals( "ON_BEHALF_OF_SENDING_TIME", fixData.toFIXNameString());
        assertEquals( "OnBehalfOfSendingTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0370Test() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag370UtcOnBehalfOfSendingTime\n" +
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