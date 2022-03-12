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

public enum Enum297QuoteStatus {
    ACCEPTED( "0", "ACCEPTED",
            "0 - Accepted" ),
    CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL",
            "1 - Cancel for Symbol(s)" ),
    CANCELED_FOR_SECURITY_TYPE( "2", "CANCELED_FOR_SECURITY_TYPE",
            "2 - Canceled for Security Type(s)" ),
    CANCELED_FOR_UNDERLYING( "3", "CANCELED_FOR_UNDERLYING"
            , "3 - Canceled for Underlying" ),
    CANCELED_ALL( "4", "CANCELED_ALL",
            "4 - Canceled All" ),
    REJECTED( "5", "REJECTED",
            "5 - Rejected" ),
    REMOVED_FROM_MARKET( "6", "REMOVED_FROM_MARKET",
            "6 - Removed from Market" ),
    EXPIRED( "7", "EXPIRED",
            "7 - Expired" ),
    QUERY( "8", "QUERY",
            "8 - Query" ),
    QUOTE_NOT_FOUND( "9", "QUOTE_NOT_FOUND",
            "9 - Quote Not Found" ),
    PENDING( "10", "PENDING",
            "10 - Pending" ),
    PASS( "11", "PASS",
            "11 - Pass" ),
    LOCKED_MARKET_WARNING( "12", "LOCKED_MARKET_WARNING",
            "12 - Locked Market Warning" ),
    CROSS_MARKET_WARNING( "13", "CROSS_MARKET_WARNING",
            "13 - Cross Market Warning" ),
    CANCELED_DUE_TO_LOCK_MARKET( "14", "CANCELED_DUE_TO_LOCK_MARKET",
            "14 - Canceled Due To Lock Market" ),
    CANCELED_DUE_TO_CROSS_MARKET( "15", "CANCELED_DUE_TO_CROSS_MARKET",
            "15 - Canceled Due To Cross Market" ),

    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum297QuoteStatus(final String action, final String name, final String description) {
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
        System.out.println(Enum297QuoteStatus.ACCEPTED);
        System.out.println(Enum297QuoteStatus.CANCEL_FOR_SYMBOL);
        System.out.println(Enum297QuoteStatus.CANCELED_FOR_SECURITY_TYPE);
        System.out.println(Enum297QuoteStatus.CANCELED_FOR_UNDERLYING);
        System.out.println(Enum297QuoteStatus.CANCELED_ALL);

        System.out.println(Enum297QuoteStatus.REJECTED);
        System.out.println(Enum297QuoteStatus.REMOVED_FROM_MARKET);
        System.out.println(Enum297QuoteStatus.EXPIRED);
        System.out.println(Enum297QuoteStatus.QUERY);
        System.out.println(Enum297QuoteStatus.QUOTE_NOT_FOUND);

        System.out.println(Enum297QuoteStatus.PENDING);
        System.out.println(Enum297QuoteStatus.PASS);
        System.out.println(Enum297QuoteStatus.LOCKED_MARKET_WARNING);
        System.out.println(Enum297QuoteStatus.CROSS_MARKET_WARNING);
        System.out.println(Enum297QuoteStatus.CANCELED_DUE_TO_LOCK_MARKET);

        System.out.println(Enum297QuoteStatus.CANCELED_DUE_TO_CROSS_MARKET);
    }
}
