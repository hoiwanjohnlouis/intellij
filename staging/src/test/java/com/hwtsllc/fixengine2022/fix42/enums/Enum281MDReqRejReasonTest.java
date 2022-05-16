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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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

        /*
         *  0-9, A-D msg types
         */


        /*
         *  0-9 msg types
         */
        enumType = Enum281MDReqRejReason.UNKNOWN_SYMBOL;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "UNKNOWN_SYMBOL", enumType.toFIXNameString());
        assertEquals( "0 - Unknown Symbol", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.DUPLICATE_MDREQID;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "DUPLICATE_MDREQID", enumType.toFIXNameString());
        assertEquals( "1 - Duplicate MDReqID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "INSUFFICIENT_BANDWIDTH", enumType.toFIXNameString());
        assertEquals( "2 - Insufficient Bandwidth", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "INSUFFICIENT_PERMISSIONS", enumType.toFIXNameString());
        assertEquals( "3 - Insufficient Permissions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE", enumType.toFIXNameString());
        assertEquals( "4 - Unsupported SubscriptionRequestType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_MARKETDEPTH", enumType.toFIXNameString());
        assertEquals( "5 - Unsupported MarketDepth", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_MDUPDATETYPE", enumType.toFIXNameString());
        assertEquals( "6 - Unsupported MDUpdateType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_AGGREGATEDBOOK", enumType.toFIXNameString());
        assertEquals( "7 - Unsupported AggregatedBook", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_MDENTRYTYPE", enumType.toFIXNameString());
        assertEquals( "8 - Unsupported MDEntryType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_TRADINGSESSIONID", enumType.toFIXNameString());
        assertEquals( "9 - Unsupported TradingSessionID", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         *  A-D, msg types
         */
        enumType = Enum281MDReqRejReason.UNSUPPORTED_SCOPE;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_SCOPE", enumType.toFIXNameString());
        assertEquals( "A - Unsupported Scope", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_OPENCLOSESETTLEFLAG", enumType.toFIXNameString());
        assertEquals( "B - Unsupported OpenCloseSettleFlag", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "UNSUPPORTED_MDIMPLICITDELETE", enumType.toFIXNameString());
        assertEquals( "C - Unsupported MDImplicitDelete", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "INSUFFICIENT_CREDIT", enumType.toFIXNameString());
        assertEquals( "D - Insufficient credit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}