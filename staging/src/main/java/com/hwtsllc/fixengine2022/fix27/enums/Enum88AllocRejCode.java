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

public enum Enum88AllocRejCode implements EnumAccessors, LogStringVerbose {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum88AllocRejCode(final String action, final String name, final String description) {
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
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum88AllocRejCode oneEnum : Enum88AllocRejCode.values()) {
            System.out.println(oneEnum);
        }
    }
}
