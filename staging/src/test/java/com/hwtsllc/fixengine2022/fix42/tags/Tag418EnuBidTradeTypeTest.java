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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag418EnuBidTradeTypeTest {
    @Test
    void FIX0418Test() {
        FIX42 fixData = FIX42.FIX418_ENU_BID_TRADE_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * A, G, J, and R msg types
     */
    AGENCY( "A", "AGENCY", "A - Agency" ),
    VWAP_GUARANTEE( "G", "VWAP_GUARANTEE", "G - VWAP Guarantee" ),
    GUARANTEED_CLOSE( "J", "GUARANTEED_CLOSE", "J - Guaranteed Close" ),
    RISK_TRADE( "R", "RISK_TRADE", "R - Risk Trade" ),
    @Test
    void Tag0418Test() {
        Tag418EnuBidTradeType tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}