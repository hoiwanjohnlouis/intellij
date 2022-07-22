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

import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  370
 *  OnBehalfOfSendingTime
 *  UTCTimestamp
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Used when a message is sent via a 'hub' or 'service bureau'.
 *  <p></p>
 *  If A sends to Q (the hub), who then sends to B via a separate FIX session, then when Q sends to B,
 *  the value of this field should represent the SendingTime on the message A sent to Q.
 *  <p></p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as 'GMT')
 */
class Tag370UtcOnBehalfOfSendingTimeTest {
    @Test
    void PrintTest() {
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
    void FIXTagTest() {
        Tag370UtcOnBehalfOfSendingTime tagData;
        String oneElement;

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME;
        tagData = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag370UtcOnBehalfOfSendingTime tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag370UtcOnBehalfOfSendingTime tagData ) {
        assertEquals( "FIX370_UTC_ON_BEHALF_OF_SENDING_TIME", tagData.toEnumLabelString());
        assertEquals( "370", tagData.toEnumIDString());
        assertEquals( "ON_BEHALF_OF_SENDING_TIME", tagData.toEnumNameString());
        assertEquals( "OnBehalfOfSendingTime", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag370UtcOnBehalfOfSendingTime tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag370UtcOnBehalfOfSendingTime tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag370UtcOnBehalfOfSendingTime tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag370UtcOnBehalfOfSendingTime tagData ) {
        assertEquals( "Tag370UtcOnBehalfOfSendingTime\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}