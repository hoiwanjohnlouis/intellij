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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag336StrTradingSessionIDTest {
    @Test
    void FIX0336Test() {
        FIX42 fixData = FIX42.FIX336_STR_TRADING_SESSION_ID;
        assertEquals( "336", fixData.getID());
        assertEquals( "TRADING_SESSION_ID", fixData.getName());
        assertEquals( "TradingSessionId", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0336Test() {
        Tag336StrTradingSessionID tagData;

        tagData = new Tag336StrTradingSessionID(new MyStringType(
                Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID));
        assertEquals( Tag336StrTradingSessionID.TESTA_STR_TRADING_SESSION_ID,
                tagData.getDataValue() );
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag336StrTradingSessionID(new MyStringType(
                Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID));
        assertEquals( Tag336StrTradingSessionID.TESTB_STR_TRADING_SESSION_ID,
                tagData.getDataValue() );
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}