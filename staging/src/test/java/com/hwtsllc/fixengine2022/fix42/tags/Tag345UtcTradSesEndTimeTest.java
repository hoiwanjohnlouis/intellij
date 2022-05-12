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

class Tag345UtcTradSesEndTimeTest {
    @Test
    void FIX0345Test() {
        FIX42 fixData = FIX42.FIX345_UTC_TRAD_SES_END_TIME;
        assertEquals( "345", fixData.getID());
        assertEquals( "TRAD_SES_END_TIME", fixData.getName());
        assertEquals( "TradSesEndTime", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0345Test() {
        Log345UtcTradSesEndTime tagData;

        tagData = new Log345UtcTradSesEndTime(new MyUTCTimestampType(
                Log345UtcTradSesEndTime.TESTA_UTC_TRAD_SES_END_TIME));
        assertEquals( Log345UtcTradSesEndTime.TESTA_UTC_TRAD_SES_END_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Log345UtcTradSesEndTime(new MyUTCTimestampType(
                Log345UtcTradSesEndTime.TESTB_UTC_TRAD_SES_END_TIME));
        assertEquals( Log345UtcTradSesEndTime.TESTB_UTC_TRAD_SES_END_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}