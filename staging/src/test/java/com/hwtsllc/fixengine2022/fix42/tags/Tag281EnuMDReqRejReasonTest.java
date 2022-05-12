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
import com.hwtsllc.fixengine2022.fix42.enums.Enum281MDReqRejReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag281EnuMDReqRejReasonTest {
    @Test
    void FIX0281Test() {
        FIX42 fixData = FIX42.FIX281_ENU_MD_REQ_REJ_REASON;
        assertEquals( "281", fixData.getID());
        assertEquals( "MD_REQ_REJ_REASON", fixData.getName());
        assertEquals( "MDReqRejReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  281
     *  MDReqRejReason
     *
     *      0-9 msg types
     *      "0 - Unknown Symbol"
     *      "1 - Duplicate MDReqID"
     *      "2 - Insufficient Bandwidth"
     *      "3 - Insufficient Permissions"
     *      "4 - Unsupported SubscriptionRequestType"
     *      "5 - Unsupported MarketDepth"
     *      "6 - Unsupported MDUpdateType"
     *      "7 - Unsupported AggregatedBook"
     *      "8 - Unsupported MDEntryType";
     *      "9 - Unsupported TradingSessionID";
     *
     *      A-D msg types
     *      "A - Unsupported Scope";
     *      "B - Unsupported OpenCloseSettleFlag";
     *      "C - Unsupported MDImplicitDelete"
     *      "D - Insufficient credit";
     */
    @Test
    void Tag0281Test() {
        Log281EnuMDReqRejReason tagData;

        /**
         * 0-9 msg types
         */
        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNKNOWN_SYMBOL);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.DUPLICATE_MDREQID);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-D msg types
         */
        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_SCOPE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log281EnuMDReqRejReason(Enum281MDReqRejReason.INSUFFICIENT_CREDIT);
        assertEquals( Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}