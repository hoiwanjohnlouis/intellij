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
 *  102
 *  CxlRejReason
 *  int
 *  <p></p>
 *  Code to identify reason for cancel rejection.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Too late to cancel
 *  <p>    1 - Unknown order
 *  <p>    2 - Broker - Exchange Option
 *  <p>    3 - Order already in Pending Cancel or Pending Replace status
 *  <p>    4 - Unable to process Order Mass Cancel Request
 *  <p></p>
 *  <p>    5 - OrigOrdModTime (586) did not match last TransactTime (60) of order
 *  <p>    6 - Duplicate ClOrdID (11) received
 *  <p>    18 - Invalid price increment
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    Or any value conforming to the data type Reserved100Plus
 */
public enum Enum102CxlRejReason implements LogFIXString, LogVerboseString {
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

    private final String id;
    private final String name;
    private final String description;

    Enum102CxlRejReason(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
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
