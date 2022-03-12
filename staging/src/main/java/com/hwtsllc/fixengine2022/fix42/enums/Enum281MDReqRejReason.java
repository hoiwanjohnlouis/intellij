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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum281MDReqRejReason {
    UNKNOWN_SYMBOL( "0", "UNKNOWN_SYMBOL",
            "0 - Unknown symbol" ),
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
    UNSUPPORTED_SCOPE( "A", "UNSUPPORTED_SCOPE",
            "A - Unsupported Scope" ),
    UNSUPPORTED_OPENCLOSESETTLEFLAG( "B", "UNSUPPORTED_OPENCLOSESETTLEFLAG",
            "B - Unsupported OpenCloseSettleFlag" ),
    UNSUPPORTED_MDIMPLICITDELETE( "C", "UNSUPPORTED_MDIMPLICITDELETE",
            "C - Unsupported MDImplicitDelete" ),
    INSUFFICIENT_CREDIT( "D", "INSUFFICIENT_CREDIT",
            "D - Insufficient credit" ),

    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum281MDReqRejReason(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum281MDReqRejReason.UNKNOWN_SYMBOL);
        System.out.println(Enum281MDReqRejReason.DUPLICATE_MDREQID);
        System.out.println(Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH);
        System.out.println(Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE);

        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID);

        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_SCOPE);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG);
        System.out.println(Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE);
        System.out.println(Enum281MDReqRejReason.UNKNOWN_SYMBOL);
    }
}
