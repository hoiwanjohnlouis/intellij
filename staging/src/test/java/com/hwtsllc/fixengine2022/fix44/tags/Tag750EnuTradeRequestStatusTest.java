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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  750
 *  TradeRequestStatus
 *  Status of Trade Request.
 *  Valid values:
 *      0 - Accepted
 *      1 - Completed
 *      2 - Rejected
 */
class Tag750EnuTradeRequestStatusTest {
    @Test
    void FIX0750Test() {
        FIX44 fixData = FIX44.FIX750_ENU_TRADE_REQUEST_STATUS;
        assertEquals( "750", fixData.toFIXIDString());
        assertEquals( "TRADE_REQUEST_STATUS", fixData.toFIXNameString());
        assertEquals( "TradeRequestStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0750Test() {
        Tag750EnuTradeRequestStatus tagData;

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.ACCEPTED);
        assertEquals( Enum750TradeRequestStatus.ACCEPTED.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.COMPLETED);
        assertEquals( Enum750TradeRequestStatus.COMPLETED.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.REJECTED);
        assertEquals( Enum750TradeRequestStatus.REJECTED.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}