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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum103OrdRejReason {
    BROKER_OR_EXCHANGE("0", "", "Broker or Exchange option"),
    UNKNOWN_SYMBOL("1", "UNKNOWN_SYMBOL", "Unknown symbol"),
    EXCHANGE_CLOSED("2","EXCHANGE_CLOSED","Exchange closed"),
    ORDER_EXCEEDS_LIMIT("3", "ORDER_EXCEEDS_LIMIT", "Order exceeds limit"),
    TOO_LATE_TO_ENTER("4", "TOO_LATE_TO_ENTER", "Too late to enter"),
    UNKNOWN_ORDER("5", "UNKNOWN_ORDER", "Unknown order"),
    DUPLICATE_ORDER("6", "DUPLICATE_ORDER", "Duplicate Order (e.g. dupe ClOrdID)"),
    DUPLICATE_VERBAL_ORDER("7", "DUPLICATE_VERBAL_ORDER", "Duplicate of a verbally communicated order"),
    STALE_ORDER("8", "STALE_ORDER","Stale order"),
    TRADE_ALONG_REQUIRED("9", "TRADE_ALONG_REQUIRED", "Trade along required"),
    INVALID_INVESTOR_ID("10", "INVALID_INVESTOR_ID", "Invalid Investor ID"),
    UNSUPPORTED_ORDER_CHARACTERISTIC("11", "UNSUPPORTED_ORDER_CHARACTERISTIC", "Unsupported order characteristic"),
    SURVEILLANCE_OPTION("12", "SURVEILLANCE_OPTION", "Surveillance Option"),
    INCORRECT_QUANTITY("13", "INCORRECT_QUANTITY", "Incorrect quantity"),
    INCORRECT_ALLOCATED_QUANTITY("14", "INCORRECT_ALLOCATED_QUANTITY", "Incorrect allocated quantity"),
    UNKNOWN_ACCOUNT("15", "UNKNOWN_ACCOUNT", "Unknown account"),
    INVALID_PRICE_INCREMENT("18", "INVALID_PRICE_INCREMENT", "Invalid price increment"),
    OTHER("99", "OTHER", "Other"),
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
        System.out.println();
    }
}
