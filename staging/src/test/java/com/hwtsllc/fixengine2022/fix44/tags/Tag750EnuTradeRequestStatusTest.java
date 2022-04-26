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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum750TradeRequestStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag750EnuTradeRequestStatusTest {
    @Test
    void FIX0750Test() {
        FIX44 fixData = FIX44.FIX750_ENU_TRADE_REQUEST_STATUS;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  750
     *  TradeRequestStatus
     *  Status of Trade Request.
     *  Valid values:
     *      0 - Accepted
     *      1 - Completed
     *      2 - Rejected
     */
    @Test
    void Tag0750Test() {
        Tag750EnuTradeRequestStatus tagData;

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.ACCEPTED);
        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.COMPLETED);
        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.REJECTED);
    }
}