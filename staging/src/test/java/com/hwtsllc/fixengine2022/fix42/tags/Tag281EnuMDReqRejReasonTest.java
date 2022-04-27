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

class Tag281EnuMDReqRejReasonTest {
    @Test
    void FIX0281Test() {
        FIX42 fixData = FIX42.FIX281_ENU_MD_REQ_REJ_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-9 msg types
     */
    UNKNOWN_SYMBOL( "0", "UNKNOWN_SYMBOL",
                            "0 - Unknown Symbol" ),
    DUPLICATE_MDREQID( "1", "DUPLICATE_MDREQID",
                               "1 - Duplicate MDReqID" ),
    INSUFFICIENT_BANDWIDTH( "2", "INSUFFICIENT_BANDWIDTH",
                                    "2 - Insufficient Bandwidth" ),
    INSUFFICIENT_PERMISSIONS( "3", "INSUFFICIENT_PERMISSIONS",
                                      "3 - Insufficient Permissions" ),
    UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE( "4", "UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE",
                                                 "4 - Unsupported SubscriptionRequestType" ),
    UNSUPPORTED_MARKETDEPTH( "5", "UNSUPPORTED_MARKETDEPTH",
                                     "5 - Unsupported MarketDepth" ),
    UNSUPPORTED_MDUPDATETYPE( "6", "UNSUPPORTED_MDUPDATETYPE",
                                      "6 - Unsupported MDUpdateType" ),
    UNSUPPORTED_AGGREGATEDBOOK( "7", "UNSUPPORTED_AGGREGATEDBOOK",
                                        "7 - Unsupported AggregatedBook" ),
    UNSUPPORTED_MDENTRYTYPE( "8", "UNSUPPORTED_MDENTRYTYPE",
                                     "8 - Unsupported MDEntryType" ),
    UNSUPPORTED_TRADINGSESSIONID( "9", "UNSUPPORTED_TRADINGSESSIONID",
                                          "9 - Unsupported TradingSessionID" ),

    /**
     * A-D msg types
     */
    UNSUPPORTED_SCOPE( "A", "UNSUPPORTED_SCOPE",
                               "A - Unsupported Scope" ),
    UNSUPPORTED_OPENCLOSESETTLEFLAG( "B", "UNSUPPORTED_OPENCLOSESETTLEFLAG",
                                             "B - Unsupported OpenCloseSettleFlag" ),
    UNSUPPORTED_MDIMPLICITDELETE( "C", "UNSUPPORTED_MDIMPLICITDELETE",
                                          "C - Unsupported MDImplicitDelete" ),
    INSUFFICIENT_CREDIT( "D", "INSUFFICIENT_CREDIT",
                                 "D - Insufficient credit" ),
    @Test
    void Tag0281Test() {
        Tag281EnuMDReqRejReason tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}