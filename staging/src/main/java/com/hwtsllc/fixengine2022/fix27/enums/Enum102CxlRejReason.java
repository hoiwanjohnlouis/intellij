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

public enum Enum102CxlRejReason implements EnumAccessors, LogStringVerbose {
    TOO_LATE_TO_CANCEL("0", "TOO_LATE_TO_CANCEL",
            "0 - Too late to cancel"),
    UNKNOWN_ORDER("1", "UNKNOWN_ORDER",
            "1 - Unknown order"),
    BROKER_OR_EXCHANGE_OPTION("2", "BROKER_OR_EXCHANGE_OPTION",
            "2 - Broker or Exchange Option"),
    PENDING_STATUS("3", "PENDING_STATUS",
            "3 - Pending status"),
    UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST("4", "UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST",
            "4 - Unable to process Order Mass Cancel Request"),
    UNMATCHED_ORIG_ORD_MOD_TIME("5", "UNMATCHED_ORIG_ORD_MOD_TIME",
            "5 - OrigOrdModTime (586) did not match last TransactTime (60) of order"),
    DUPLICATE_CLORDID("6", "DUPLICATE_CLORDID",
            "6 - Duplicate ClOrdID (11) received"),
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

    Enum102CxlRejReason(final String action, final String name, final String description) {
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
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum102CxlRejReason oneEnum : Enum102CxlRejReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
