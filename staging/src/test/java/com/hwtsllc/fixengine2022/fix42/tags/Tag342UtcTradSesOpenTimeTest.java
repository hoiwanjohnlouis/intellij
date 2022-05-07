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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag342UtcTradSesOpenTimeTest {
    @Test
    void FIX0342Test() {
        FIX42 fixData = FIX42.FIX342_UTC_TRAD_SES_OPEN_TIME;
        assertEquals( "342", fixData.getID());
        assertEquals( "TRAD_SES_OPEN_TIME", fixData.getName());
        assertEquals( "TradSesOpenTime", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0342Test() {
        Tag342UtcTradSesOpenTime tagData;

        tagData = new Tag342UtcTradSesOpenTime(new MyUTCTimestampType(
                Tag342UtcTradSesOpenTime.TESTA_UTC_TRAD_SES_OPEN_TIME));
        assertEquals( Tag342UtcTradSesOpenTime.TESTA_UTC_TRAD_SES_OPEN_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag342UtcTradSesOpenTime(new MyUTCTimestampType(
                Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME));
        assertEquals( Tag342UtcTradSesOpenTime.TESTB_UTC_TRAD_SES_OPEN_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}