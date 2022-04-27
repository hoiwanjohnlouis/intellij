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

class Tag378EnuExecRestatementReasonTest {
    @Test
    void FIX0378Test() {
        FIX42 fixData = FIX42.FIX378_ENU_EXEC_RESTATEMENT_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-11, 99 msg types
     */
    GT_CORPORATE_ACTION( "0", "GT_CORPORATE_ACTION",
                                 "0 - GT corporate action" ),
    GT_RENEWAL_RESTATEMENT( "1", "GT_RENEWAL_RESTATEMENT",
                                    "1 - GT renewal / restatement (no corporate action)" ),
    VERBAL_CHANGE( "2", "VERBAL_CHANGE",
                           "2 - Verbal change" ),
    REPRICING_OF_ORDER( "3", "REPRICING_OF_ORDER",
                                "3 - Repricing of order" ),
    BROKER_OPTION( "4", "BROKER_OPTION",
                           "4 - Broker option" ),
    PARTIAL_DECLINE_OF_ORDER_QTY( "5", "PARTIAL_DECLINE_OF_ORDER_QTY",
                                          "5 - Partial decline of Order Qty (e.g. exchange initiated partial cancel)" ),
    CANCEL_ON_TRADING_HALT( "6", "CANCEL_ON_TRADING_HALT",
                                    "6 - Cancel on Trading Halt" ),
    CANCEL_ON_SYSTEM_FAILURE( "7", "CANCEL_ON_SYSTEM_FAILURE",
                                      "7 - Cancel on System Failure" ),
    MARKET_EXCHANGE_OPTION( "8", "MARKET_EXCHANGE_OPTION",
                                    "8 - Market (Exchange) option" ),
    CANCELED_NOT_BEST( "9", "CANCELED_NOT_BEST",
                               "9 - Canceled, not best" ),
    WAREHOUSE_RECAP( "10", "WAREHOUSE_RECAP",
                             "10 - Warehouse Recap" ),
    PEG_REFRESH( "11", "PEG_REFRESH",
                         "11 - Peg Refresh" ),
    OTHER( "99", "OTHER",
                   "99 - Other" ),
    @Test
    void Tag0378Test() {
        Tag378EnuExecRestatementReason tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}