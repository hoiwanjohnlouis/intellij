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
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum103OrdRejReason implements EnumAccessors, LogStringVerbose {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum103OrdRejReason(final String action, final String name, final String description) {
        this.action = action;
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
        return action;
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getID())
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
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getID())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
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
