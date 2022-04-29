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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum281MDReqRejReasonTest {
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
    void Enum0281Test() {
        Enum281MDReqRejReason enumType;

        /**
         *  0-9, A-D msg types
         */


        /**
         *  0-9 msg types
         */
        enumType = Enum281MDReqRejReason.UNKNOWN_SYMBOL;
        assertEquals( "0", enumType.getID());
        assertEquals( "UNKNOWN_SYMBOL", enumType.getName());
        assertEquals( "0 - Unknown Symbol", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.DUPLICATE_MDREQID;
        assertEquals( "1", enumType.getID());
        assertEquals( "DUPLICATE_MDREQID", enumType.getName());
        assertEquals( "1 - Duplicate MDReqID", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH;
        assertEquals( "2", enumType.getID());
        assertEquals( "INSUFFICIENT_BANDWIDTH", enumType.getName());
        assertEquals( "2 - Insufficient Bandwidth", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS;
        assertEquals( "3", enumType.getID());
        assertEquals( "INSUFFICIENT_PERMISSIONS", enumType.getName());
        assertEquals( "3 - Insufficient Permissions", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
        assertEquals( "4", enumType.getID());
        assertEquals( "UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE", enumType.getName());
        assertEquals( "4 - Unsupported SubscriptionRequestType", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH;
        assertEquals( "5", enumType.getID());
        assertEquals( "UNSUPPORTED_MARKETDEPTH", enumType.getName());
        assertEquals( "5 - Unsupported MarketDepth", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE;
        assertEquals( "6", enumType.getID());
        assertEquals( "UNSUPPORTED_MDUPDATETYPE", enumType.getName());
        assertEquals( "6 - Unsupported MDUpdateType", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK;
        assertEquals( "7", enumType.getID());
        assertEquals( "UNSUPPORTED_AGGREGATEDBOOK", enumType.getName());
        assertEquals( "7 - Unsupported AggregatedBook", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE;
        assertEquals( "8", enumType.getID());
        assertEquals( "UNSUPPORTED_MDENTRYTYPE", enumType.getName());
        assertEquals( "8 - Unsupported MDEntryType", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID;
        assertEquals( "9", enumType.getID());
        assertEquals( "UNSUPPORTED_TRADINGSESSIONID", enumType.getName());
        assertEquals( "9 - Unsupported TradingSessionID", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         *  A-D, msg types
         */
        enumType = Enum281MDReqRejReason.UNSUPPORTED_SCOPE;
        assertEquals( "A", enumType.getID());
        assertEquals( "UNSUPPORTED_SCOPE", enumType.getName());
        assertEquals( "A - Unsupported Scope", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG;
        assertEquals( "B", enumType.getID());
        assertEquals( "UNSUPPORTED_OPENCLOSESETTLEFLAG", enumType.getName());
        assertEquals( "B - Unsupported OpenCloseSettleFlag", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE;
        assertEquals( "C", enumType.getID());
        assertEquals( "UNSUPPORTED_MDIMPLICITDELETE", enumType.getName());
        assertEquals( "C - Unsupported MDImplicitDelete", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
        assertEquals( "D", enumType.getID());
        assertEquals( "INSUFFICIENT_CREDIT", enumType.getName());
        assertEquals( "D - Insufficient credit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}