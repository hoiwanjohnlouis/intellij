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

package com.hwtsllc.fixengine2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum39OrdStatus {
    NEW("0", "NEW", "New" ),
    PARTIALLY_FILLED("1", "PARTIALLY_FILLED", "Partially filled" ),
    FILLED("2", "FILLED", "Filled" ),
    DONE_FOR_DAY("3", "DONE_FOR_DAY", "Done for day" ),
    CANCELED("4", "CANCELED", "Canceled" ),
    REPLACED("5", "REPLACED", "Replaced (No longer used)" ),
    PENDING_CANCEL("6", "PENDING_CANCEL", "Pending Cancel (i.e. result of Order Cancel Request)" ),
    STOPPED("7", "STOPPED", "Stopped" ),
    REJECTED("8", "REJECTED", "Rejected" ),
    SUSPENDED("9", "SUSPENDED", "Suspended" ),
    PENDING_NEW("A", "PENDING_NEW", "Pending New" ),
    CALCULATED("B", "CALCULATED", "Calculated" ),
    EXPIRED("C", "EXPIRED", "Expired" ),
    ACCEPTED_FOR_BIDDING("D", "ACCEPTED_FOR_BIDDING", "Accepted for Bidding" ),
    PENDING_REPLACE("E", "PENDING_REPLACE", "Pending Replace (i.e. result of Order Cancel/Replace Request)" ),
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
        System.out.println(Enum39OrdStatus.NEW);
        System.out.println(Enum39OrdStatus.PARTIALLY_FILLED);
        System.out.println(Enum39OrdStatus.FILLED);
        System.out.println(Enum39OrdStatus.DONE_FOR_DAY);
        System.out.println(Enum39OrdStatus.CANCELED);
        System.out.println(Enum39OrdStatus.REPLACED);
        System.out.println(Enum39OrdStatus.PENDING_CANCEL);
        System.out.println(Enum39OrdStatus.STOPPED);
        System.out.println(Enum39OrdStatus.REJECTED);
        System.out.println(Enum39OrdStatus.SUSPENDED);
        System.out.println(Enum39OrdStatus.PENDING_NEW);
        System.out.println(Enum39OrdStatus.CALCULATED);
        System.out.println(Enum39OrdStatus.EXPIRED);
        System.out.println(Enum39OrdStatus.ACCEPTED_FOR_BIDDING);
        System.out.println(Enum39OrdStatus.PENDING_REPLACE);
    }
}
