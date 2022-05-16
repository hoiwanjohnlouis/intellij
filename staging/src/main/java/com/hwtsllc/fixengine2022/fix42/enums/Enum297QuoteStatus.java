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
 *  297
 *  QuoteAckStatus
 *
 *      0-15 msg types
 *      ACCEPTED( "0", "ACCEPTED", "0 - Accepted" ),
 *      CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL", "1 - Cancel for Symbol(s)" ),
 *      CANCELED_FOR_SECURITY_TYPE( "2", "CANCELED_FOR_SECURITY_TYPE", "2 - Canceled for Security Type(s)" ),
 *      CANCELED_FOR_UNDERLYING( "3", "CANCELED_FOR_UNDERLYING", "3 - Canceled for Underlying" ),
 *      CANCELED_ALL( "4", "CANCELED_ALL", "4 - Canceled All" ),
 *      REJECTED( "5", "REJECTED", "5 - Rejected" ),
 *      REMOVED_FROM_MARKET( "6", "REMOVED_FROM_MARKET", "6 - Removed from Market" ),
 *      EXPIRED( "7", "EXPIRED", "7 - Expired" ),
 *      QUERY( "8", "QUERY", "8 - Query" ),
 *      QUOTE_NOT_FOUND( "9", "QUOTE_NOT_FOUND", "9 - Quote Not Found" ),
 *      PENDING( "10", "PENDING", "10 - Pending" ),
 *      PASS( "11", "PASS", "11 - Pass" ),
 *      LOCKED_MARKET_WARNING( "12", "LOCKED_MARKET_WARNING", "12 - Locked Market Warning" ),
 *      CROSS_MARKET_WARNING( "13", "CROSS_MARKET_WARNING", "13 - Cross Market Warning" ),
 *      CANCELED_DUE_TO_LOCK_MARKET( "14", "CANCELED_DUE_TO_LOCK_MARKET", "14 - Canceled Due To Lock Market" ),
 *      CANCELED_DUE_TO_CROSS_MARKET( "15", "CANCELED_DUE_TO_CROSS_MARKET", "15 - Canceled Due To Cross Market" ),
 */
public enum Enum297QuoteStatus implements LogFIXString, LogVerboseString {
    /**
     * 0-15 msg types
     */
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

    private final String id;
    private final String name;
    private final String description;

    Enum297QuoteStatus(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum297QuoteStatus oneEnum : Enum297QuoteStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
