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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  281
 *  MDReqRejReason
 *  char
 *  <p>
 *  Reason for the rejection of a Market Data request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-9 msg types
 *  <p>    "0 - Unknown Symbol"
 *  <p>    "1 - Duplicate MDReqID"
 *  <p>    "2 - Insufficient Bandwidth"
 *  <p>    "3 - Insufficient Permissions"
 *  <p>    "4 - Unsupported SubscriptionRequestType"
 *  <p></p>
 *  <p>    "5 - Unsupported MarketDepth"
 *  <p>    "6 - Unsupported MDUpdateType"
 *  <p>    "7 - Unsupported AggregatedBook"
 *  <p>    "8 - Unsupported MDEntryType";
 *  <p>    "9 - Unsupported TradingSessionID";
 *  <p></p>
 *  <p>    A-D msg types
 *  <p>    "A - Unsupported Scope";
 *  <p>    "B - Unsupported OpenCloseSettleFlag";
 *  <p>    "C - Unsupported MDImplicitDelete"
 *  <p>    "D - Insufficient credit";
 */
public enum Enum281MDReqRejReason implements LogFIXString, LogVerboseString {
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
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum281MDReqRejReason(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumLabelString()
                .concat("=[")
                .concat( toEnumIDString())
                .concat(",")
                .concat( toEnumNameString())
                .concat(",")
                .concat( toEnumDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum281MDReqRejReason oneEnum : Enum281MDReqRejReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
