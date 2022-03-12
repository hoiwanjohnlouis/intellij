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

public enum Enum39OrdStatus {
    NEW("0", "NEW", "0 - New" ),
    PARTIALLY_FILLED("1", "PARTIALLY_FILLED", "1 - Partially filled" ),
    FILLED("2", "FILLED", "2 - Filled" ),
    DONE_FOR_DAY("3", "DONE_FOR_DAY", "3 - Done for day" ),
    CANCELED("4", "CANCELED", "4 - Canceled" ),
    REPLACED("5", "REPLACED", "5 - Replaced (No longer used)" ),
    PENDING_CANCEL("6", "PENDING_CANCEL",
            "6 - Pending Cancel (i.e. result of Order Cancel Request)" ),
    STOPPED("7", "STOPPED", "7 - Stopped" ),
    REJECTED("8", "REJECTED", "8 - Rejected" ),
    SUSPENDED("9", "SUSPENDED", "9 - Suspended" ),
    PENDING_NEW("A", "PENDING_NEW", "A - Pending New" ),
    CALCULATED("B", "CALCULATED", "B - Calculated" ),
    EXPIRED("C", "EXPIRED", "C - Expired" ),
    ACCEPTED_FOR_BIDDING("D", "ACCEPTED_FOR_BIDDING", "D - Accepted for Bidding" ),
    PENDING_REPLACE("E", "PENDING_REPLACE",
            "E - Pending Replace (i.e. result of Order Cancel/Replace Request)" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum39OrdStatus(final String action, final String name, final String description) {
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
        /*
         * dump all the enum values
         */
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
