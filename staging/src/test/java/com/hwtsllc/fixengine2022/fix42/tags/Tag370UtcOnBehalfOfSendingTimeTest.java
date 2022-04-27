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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag370UtcOnBehalfOfSendingTimeTest {
    @Test
    void FIX0370Test() {
        FIX42 fixData = FIX42.FIX370_UTC_ON_BEHALF_OF_SENDING_TIME;
        assertEquals( "370", fixData.getID());
        assertEquals( "ON_BEHALF_OF_SENDING_TIME", fixData.getName());
        assertEquals( "OnBehalfOfSendingTime", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0370Test() {
        Tag370UtcOnBehalfOfSendingTime tagData;

        tagData = new Tag370UtcOnBehalfOfSendingTime(new MyUTCTimestampType(
                Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME));
        assertEquals( Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag370UtcOnBehalfOfSendingTime(new MyUTCTimestampType(
                Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME));
        assertEquals( Tag370UtcOnBehalfOfSendingTime.TESTB_UTC_ON_BEHALF_OF_SENDING_TIME,
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}