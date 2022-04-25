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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum776IndividualAllocRejCode implements EnumAccessors, LogStringVerbose {
    /**
     *  776 (same as 88, 776)
     *  IndividualAllocRejCode
     *  Identified reason for rejecting an individual AllocAccount (79) detail.
     *        Same values as  AllocRejCode (88)
     *  Valid values:
     *      0 - Unknown account(s)
     *      1 - Incorrect quantity
     *      2 - Incorrect averageg price
     *      3 - Unknown executing broker mnemonic
     *      4 - Commission difference
     *      5 - Unknown OrderID (37)
     *      6 - Unknown ListID (66)
     *      7 - Other (further in Text (58))
     *      8 - Incorrect allocated quantity
     *      9 - Calculation difference
     *      10 - Unknown or stale ExecID
     *      11 - Mismatched data
     *      12 - Unknown ClOrdID
     *      13 - Warehouse request rejected
     */
    UNKNOWN_ACCOUNT("0", "UNKNOWN_ACCOUNT",
            "0 - Unknown account(s)" ),
    INCORRECT_QUANTITY("1", "INCORRECT_QUANTITY",
            "1 - Incorrect quantity" ),
    INCORRECT_AVERAGE_PRICE("2", "INCORRECT_AVERAGE_PRICE",
            "2 - Incorrect average price" ),
    UNKNOWN_EXECUTING_BROKER_MNEMONIC("3", "UNKNOWN_EXECUTING_BROKER_MNEMONIC",
            "3 - Unknown executing broker mnemonic" ),
    COMMISSION_DIFFERENCE("4", "COMMISSION_DIFFERENCE",
            "4 - Commission difference" ),
    UNKNOWN_ORDERID("5", "UNKNOWN_ORDERID",
            "5 - Unknown OrderID (37)" ),
    UNKNOWN_LISTID("6", "UNKNOWN_LISTID",
            "6 - Unknown ListID (66)" ),
    OTHER("7", "OTHER",
            "7 - Other (further in Text (58))" ),
    INCORRECT_ALLOCATED_QUANTITY("8", "INCORRECT_ALLOCATED_QUANTITY",
            "8 - Incorrect allocated quantity" ),
    CALCULATION_DIFFERENCE("9", "CALCULATION_DIFFERENCE",
            "9 - Calculation difference" ),
    UNKNOWN_OR_STALE_EXECID("10", "UNKNOWN_OR_STALE_EXECID",
            "10 - Unknown or stale ExecID" ),
    MISMATCHED_DATA("11", "MISMATCHED_DATA",
            "11 - Mismatched data" ),
    UNKNOWN_CLORDID("12", "UNKNOWN_CLORDID",
            "12 - Unknown ClOrdID" ),
    WAREHOUSE_REQUEST_REJECTED("13", "WAREHOUSE_REQUEST_REJECTED",
            "13 - Warehouse request rejected" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum776IndividualAllocRejCode(final String id, final String name, final String description) {
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
        for (Enum776IndividualAllocRejCode oneEnum : Enum776IndividualAllocRejCode.values()) {
            System.out.println(oneEnum);
        }
    }
}
