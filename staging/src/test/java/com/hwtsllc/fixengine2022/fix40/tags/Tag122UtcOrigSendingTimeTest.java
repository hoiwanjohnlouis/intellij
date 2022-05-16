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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  122
 *  OrigSendingTime
 *  UTCTimestamp
 *  Original time of message transmission
 *  (always expressed in UTC (Universal Time Coordinated), also known as "GMT")
 *  when transmitting orders as the result of a resend request.
 */
class Tag122UtcOrigSendingTimeTest {
    @Test
    void FIX0122Test() {
        FIX40 fixData = FIX40.FIX122_UTC_ORIG_SENDING_TIME;
        assertEquals( "ORIG_SENDING_TIME", fixData.toFIXNameString());
        assertEquals( "122", fixData.toFIXIDString());
        assertEquals( "OrigSendingTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0122Test() {
        Tag122UtcOrigSendingTime tagData;

        tagData = new Tag122UtcOrigSendingTime(new MyUTCTimestampType("KimSoYeon-122OrigSendingTime") );
        assertEquals( "KimSoYeon-122OrigSendingTime", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}