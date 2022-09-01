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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  88 (same as 88, 776)
 *  AllocRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection.
 *  <p></p>
 *  776 (same as 88, 776)
 *  IndividualAllocRejCode
 *  int
 *  <p></p>
 *  Identified reason for rejecting an individual AllocAccount (79) detail.
 *  <p></p>
 *      Same values as  AllocRejCode (88)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown account(s)
 *  <p>    1 - Incorrect quantity
 *  <p>    2 - Incorrect average price
 *  <p>    3 - Unknown executing broker mnemonic
 *  <p>    4 - Commission difference
 *  <p></p>
 *  <p>    5 - Unknown OrderID (37)
 *  <p>    6 - Unknown ListID (66)
 *  <p>    7 - Other (further in Text (58))
 *  <p>    8 - Incorrect allocated quantity
 *  <p>    9 - Calculation difference
 *  <p></p>
 *  <p>    10 - Unknown or stale ExecID
 *  <p>    11 - Mismatched data
 *  <p>    12 - Unknown ClOrdID
 *  <p>    13 - Warehouse request rejected
 */
public enum MyEnumAllocRejCode implements LogFIXString, LogVerboseString {
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

    MyEnumAllocRejCode(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
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
        for (MyEnumAllocRejCode oneEnum : MyEnumAllocRejCode.values()) {
            System.out.println(oneEnum);
        }
    }
}
