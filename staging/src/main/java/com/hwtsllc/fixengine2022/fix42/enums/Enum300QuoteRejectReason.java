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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  300
 *  QuoteRejectReason
 *
 *      1-9, 99 msg types
 *      UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL", "1 - Unknown Symbol (security)" ),
 *      EXCHANGE_SECURITY_CLOSED( "2", "EXCHANGE_SECURITY_CLOSED", "2 - Exchange (Security) closed" ),
 *      QUOTE_REQUEST_EXCEEDS_LIMIT( "3", "QUOTE_REQUEST_EXCEEDS_LIMIT", "3 - Quote Request exceeds limit" ),
 *      TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER", "4 - Too late to enter" ),
 *      UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE", "5 - Unknown Quote" ),
 *      DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE", "6 - Duplicate Quote" ),
 *      INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD", "7 - Invalid bid/ask spread" ),
 *      INVALID_PRICE( "8", "INVALID_PRICE", "8 - Invalid price" ),
 *      NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
 *                      "9 - Not authorized to quote security" ),
 *      OTHER( "99", "OTHER", "99 - Other" ),
 */
public enum Enum300QuoteRejectReason implements EnumAccessors, LogStringVerbose {
    /**
     * 1-9, 99 msg types
     */
    UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL",
            "1 - Unknown Symbol (security)" ),
    EXCHANGE_SECURITY_CLOSED( "2", "EXCHANGE_SECURITY_CLOSED",
            "2 - Exchange (Security) closed" ),
    QUOTE_REQUEST_EXCEEDS_LIMIT( "3", "QUOTE_REQUEST_EXCEEDS_LIMIT",
            "3 - Quote Request exceeds limit" ),
    TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER",
            "4 - Too late to enter" ),
    UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE",
            "5 - Unknown Quote" ),
    DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE",
            "6 - Duplicate Quote" ),
    INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD",
            "7 - Invalid bid/ask spread" ),
    INVALID_PRICE( "8", "INVALID_PRICE",
            "8 - Invalid price" ),
    NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
            "9 - Not authorized to quote security" ),
    OTHER( "99", "OTHER",
            "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum300QuoteRejectReason(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum300QuoteRejectReason oneEnum : Enum300QuoteRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
