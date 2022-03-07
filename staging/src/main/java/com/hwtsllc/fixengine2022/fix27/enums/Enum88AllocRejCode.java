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

public enum Enum88AllocRejCode {
    UNKNOWN_ACCOUNT("0", "UNKNOWN_ACCOUNT", "0 - Unknown account(s)" ),
    INCORRECT_QUANTITY("1", "UNKNOWN_ACCOUNT", "1 - Incorrect quantity" ),
    INCORRECT_AVERAGE_PRICE("2", "UNKNOWN_ACCOUNT", "2 - Incorrect average price" ),
    UNKNOWN_EXECUTING_BROKER_MNEMONIC("3", "UNKNOWN_ACCOUNT", "3 - Unknown executing broker mnemonic" ),
    COMMISSION_DIFFERENCE("4", "UNKNOWN_ACCOUNT", "4 - Commission difference" ),
    UNKNOWN_ORDERID("5", "UNKNOWN_ACCOUNT", "5 - Unknown OrderID (37)" ),
    UNKNOWN_LISTID("6", "UNKNOWN_ACCOUNT", "6 - Unknown ListID (66)" ),
    OTHER("7", "UNKNOWN_ACCOUNT", "7 - Other (further in Text (58))" ),
    INCORRECT_ALLOCATED_QUANTITY("8", "UNKNOWN_ACCOUNT", "8 - Incorrect allocated quantity" ),
    CALCULATION_DIFFERENCE("9", "UNKNOWN_ACCOUNT", "9 - Calculation difference" ),
    UNKNOWN_OR_STALE_EXECID("10", "UNKNOWN_ACCOUNT", "10 - Unknown or stale ExecID" ),
    MISMATCHED_DATA("11", "UNKNOWN_ACCOUNT", "11 - Mismatched data" ),
    UNKNOWN_CLORDID("12", "UNKNOWN_ACCOUNT", "12 - Unknown ClOrdID" ),
    WAREHOUSE_REQUEST_REJECTED("13", "UNKNOWN_ACCOUNT", "13 - Warehouse request rejected" ),
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
        System.out.println(Enum88AllocRejCode.UNKNOWN_ACCOUNT);
        System.out.println(Enum88AllocRejCode.INCORRECT_QUANTITY);
        System.out.println(Enum88AllocRejCode.INCORRECT_AVERAGE_PRICE);
        System.out.println(Enum88AllocRejCode.UNKNOWN_EXECUTING_BROKER_MNEMONIC);
        System.out.println(Enum88AllocRejCode.COMMISSION_DIFFERENCE);
        System.out.println(Enum88AllocRejCode.UNKNOWN_ORDERID);
        System.out.println(Enum88AllocRejCode.UNKNOWN_LISTID);
        System.out.println(Enum88AllocRejCode.OTHER);
        System.out.println(Enum88AllocRejCode.INCORRECT_ALLOCATED_QUANTITY);
        System.out.println(Enum88AllocRejCode.CALCULATION_DIFFERENCE);
        System.out.println(Enum88AllocRejCode.UNKNOWN_OR_STALE_EXECID);
        System.out.println(Enum88AllocRejCode.MISMATCHED_DATA);
        System.out.println(Enum88AllocRejCode.UNKNOWN_CLORDID);
        System.out.println(Enum88AllocRejCode.WAREHOUSE_REQUEST_REJECTED);
    }
}
