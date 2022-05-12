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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
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
        assertEquals( "168", fixData.getID());
        assertEquals( "EFFECTIVE_TIME", fixData.getName());
        assertEquals( "EffectiveTime", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0168Test() {
        Log168UtcEffectiveTime tagData;

        tagData = new Log168UtcEffectiveTime(new MyUTCTimestampType(Log168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME));
        assertEquals( Log168UtcEffectiveTime.TESTA_UTC_EFFECTIVE_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log168UtcEffectiveTime(new MyUTCTimestampType(Log168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME));
        assertEquals( Log168UtcEffectiveTime.TESTB_UTC_EFFECTIVE_TIME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}