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

/**
 *  39
 *  OrdStatus
 *  char
 *  Identifies current status of order.
 *
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *      (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - New
 *      1 - Partially filled
 *      2 - Filled
 *      3 - Done for day
 *      4 - Canceled
 *
 *      5 - Replaced (No longer used)
 *      6 - Pending Cancel (i.e. result of Order Cancel Request)
 *      7 - Stopped
 *      8 - Rejected
 *      9 - Suspended
 *
 *      A - Pending New
 *      B - Calculated
 *      C - Expired
 *      D - Accepted for Bidding
 *      E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
public enum Enum39OrdStatus implements EnumAccessors, LogStringVerbose {
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

    private final String id;
    private final String name;
    private final String description;

    Enum39OrdStatus(final String id, final String name, final String description) {
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
        for (Enum39OrdStatus oneEnum : Enum39OrdStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
