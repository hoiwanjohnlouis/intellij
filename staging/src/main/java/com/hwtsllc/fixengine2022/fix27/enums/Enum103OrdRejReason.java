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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  103
 *  OrdRejReason
 *  int
 *  Code to identify reason for order rejection.
 *  Note: Values 3, 4, and 5 will be used when rejecting an
 *        order due to pre-allocation information errors.
 *  Valid values:
 *      0 - Broker - Exchange option
 *      1 - Unknown symbol
 *      2 - Exchange closed
 *      3 - Order exceeds limit
 *      4 - Too late to enter
 *      5 - Unknown order
 *      6 - Duplicate Order (e.g. dupe ClOrdID)
 *      7 - Duplicate of a verbally communicated order
 *      8 - Stale order
 *      9 - Trade along required
 *      10 - Invalid Investor ID
 *      11 - Unsupported order characteristic
 *      12 - Surveillence Option
 *      13 - Incorrect quantity
 *      14 - Incorrect allocated quantity
 *      15 - Unknown account(s)
 *      18 - Invalid price increment
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public enum Enum103OrdRejReason implements EnumAccessors, LogVerboseString {
    BROKER_OR_EXCHANGE("0", "BROKER_OR_EXCHANGE",
            "0 - Broker or Exchange option"),
    UNKNOWN_SYMBOL("1", "UNKNOWN_SYMBOL",
            "1 - Unknown symbol"),
    EXCHANGE_CLOSED("2","EXCHANGE_CLOSED",
            "2 - Exchange closed"),
    ORDER_EXCEEDS_LIMIT("3", "ORDER_EXCEEDS_LIMIT",
            "3 - Order exceeds limit"),
    TOO_LATE_TO_ENTER("4", "TOO_LATE_TO_ENTER",
            "4 - Too late to enter"),

    UNKNOWN_ORDER("5", "UNKNOWN_ORDER",
            "5 - Unknown order"),
    DUPLICATE_ORDER("6", "DUPLICATE_ORDER",
            "6 - Duplicate Order (e.g. dupe ClOrdID)"),
    DUPLICATE_VERBAL_ORDER("7", "DUPLICATE_VERBAL_ORDER",
            "7 - Duplicate of a verbally communicated order"),
    STALE_ORDER("8", "STALE_ORDER",
            "8 - Stale order"),
    TRADE_ALONG_REQUIRED("9", "TRADE_ALONG_REQUIRED",
            "9 - Trade along required"),

    INVALID_INVESTOR_ID("10", "INVALID_INVESTOR_ID",
            "10 - Invalid Investor ID"),
    UNSUPPORTED_ORDER_CHARACTERISTIC("11", "UNSUPPORTED_ORDER_CHARACTERISTIC",
            "11 - Unsupported order characteristic"),
    SURVEILLANCE_OPTION("12", "SURVEILLANCE_OPTION",
            "12 - Surveillance Option"),
    INCORRECT_QUANTITY("13", "INCORRECT_QUANTITY",
            "13 - Incorrect quantity"),
    INCORRECT_ALLOCATED_QUANTITY("14", "INCORRECT_ALLOCATED_QUANTITY",
            "14 - Incorrect allocated quantity"),

    UNKNOWN_ACCOUNT("15", "UNKNOWN_ACCOUNT",
            "15 - Unknown account"),
    INVALID_PRICE_INCREMENT("18", "INVALID_PRICE_INCREMENT",
            "18 - Invalid price increment"),
    OTHER("99", "OTHER",
            "99 - Other"),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum103OrdRejReason(final String id, final String name, final String description) {
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
    public String toVerboseString() {
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
        for (Enum103OrdRejReason oneEnum : Enum103OrdRejReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
