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
 *  438
 *  ContraTradeTime
 *  UTCTimestamp
 *  <p>
 *  Identifies the time of the trade with the ContraBroker (375).
 *  <p>
 *  (always expressed in UTC (Universal Time Coordinated, also known as "GMT")
 */
class Tag438UtcContraTradeTimeTest {
    @Test
    void FIX0438Test() {
        FIX42 fixData = FIX42.FIX438_UTC_CONTRA_TRADE_TIME;
        assertEquals( "438", fixData.toFIXIDString());
        assertEquals( "CONTRA_TRADE_TIME", fixData.toFIXNameString());
        assertEquals( "ContraTradeTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0438Test() {
        Tag438UtcContraTradeTime tagData;

        tagData = new Tag438UtcContraTradeTime(new MyUTCTimestampType(
                Tag438UtcContraTradeTime.TESTA_UTC_CONTRA_TRADE_TIME));
        assertEquals( Tag438UtcContraTradeTime.TESTA_UTC_CONTRA_TRADE_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag438UtcContraTradeTime(new MyUTCTimestampType(
                Tag438UtcContraTradeTime.TESTB_UTC_CONTRA_TRADE_TIME));
        assertEquals( Tag438UtcContraTradeTime.TESTB_UTC_CONTRA_TRADE_TIME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
}