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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  39
 *  OrdStatus
 *  char
 *  <p></p>
 *  Identifies current status of order.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  <p>
 *  *** See Replaced Features and Supported Approach ***
 *  <p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Partially filled
 *  <p>    2 - Filled
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p></p>
 *  <p>    5 - Replaced (No longer used)
 *  <p>    6 - Pending Cancel (i.e. result of Order Cancel Request)
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Accepted for Bidding
 *  <p>    E - Pending Replace (i.e. result of Order Cancel/Replace Request)
 */
public enum Enum39OrdStatus implements LogFIXString, LogVerboseString {
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
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
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
