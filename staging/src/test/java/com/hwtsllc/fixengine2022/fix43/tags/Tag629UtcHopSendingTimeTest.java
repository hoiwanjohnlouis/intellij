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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  629
 *  HopSendingTime
 *  UTCTimestamp
 *  <p>
 *  Time that HopCompID (628) sent the message.
 *  <p>
 *  It is recommended that this value be the SendingTime (52) of the message sent by the third party.
 *  <p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
class Tag629UtcHopSendingTimeTest {
    @Test
    void FIX0629Test() {
        FIX43 fixData = FIX43.FIX629_UTC_HOP_SENDING_TIME;
        assertEquals( "629", fixData.toFIXIDString());
        assertEquals( "HOP_SENDING_TIME", fixData.toFIXNameString());
        assertEquals( "HopSendingTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0629Test() {
        Tag629UtcHopSendingTime tagData;

    }
}