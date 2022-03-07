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

public enum Enum102CxlRejReason {
    TOO_LATE_TO_CANCEL("0", "TOO_LATE_TO_CANCEL", "Too late to cancel"),
    UNKNOWN_ORDER("1", "UNKNOWN_ORDER", "Unknown order"),
    BROKER_OPTION("2", "BROKER_OPTION", "Broker Option"),
    PENDING_STATUS("3", "PENDING_STATUS", "Pending status"),
    UNABLE_TO_PROCESS("4", "PENDING_STATUS", "Unable to process Order Mass Cancel Request"),
    UNMATCHED_ORIG_ORD_MOD_TIME("5", "UNMATCHED_ORIG_ORD_MOD_TIME", "OrigOrdModTime (586) did not match last " +
            "TransactTime (60) of order"),
    DUPLICATE_CLORDID("6", "DUPLICATE_CLORDID", "Duplicate ClOrdID (11) received"),
    INVALID_PRICE_INCREMENT("18", "INVALID_PRICE_INCREMENT", "Invalid price increment"),
    OTHER("99", "OTHER", "Other"),
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

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        System.out.println(Enum102CxlRejReason.TOO_LATE_TO_CANCEL);
        System.out.println(Enum102CxlRejReason.UNKNOWN_ORDER);
        System.out.println(Enum102CxlRejReason.BROKER_OPTION);
        System.out.println(Enum102CxlRejReason.PENDING_STATUS);
    }

}
