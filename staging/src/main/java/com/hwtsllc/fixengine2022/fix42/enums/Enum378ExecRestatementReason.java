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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum378ExecRestatementReason implements EnumAccessors, LogStringVerbose {
    /*
     * 0-11, 99 msg types
     */
    GT_CORPORATE_ACTION( "0", "GT_CORPORATE_ACTION",
            "0 - GT corporate action" ),
    GT_RENEWAL_RESTATEMENT( "1", "GT_RENEWAL_RESTATEMENT",
            "1 - GT renewal / restatement (no corporate action)" ),
    VERBAL_CHANGE( "2", "VERBAL_CHANGE",
            "2 - Verbal change" ),
    REPRICING_OF_ORDER( "3", "REPRICING_OF_ORDER",
            "3 - Repricing of order" ),
    BROKER_OPTION( "4", "BROKER_OPTION",
            "4 - Broker option" ),
    PARTIAL_DECLINE_OF_ORDER_QTY( "5", "PARTIAL_DECLINE_OF_ORDER_QTY",
            "5 - Partial decline of Order Qty (e.g. exchange initiated partial cancel)" ),
    CANCEL_ON_TRADING_HALT( "6", "CANCEL_ON_TRADING_HALT",
            "6 - Cancel on Trading Halt" ),
    CANCEL_ON_SYSTEM_FAILURE( "7", "CANCEL_ON_SYSTEM_FAILURE",
            "7 - Cancel on System Failure" ),
    MARKET_EXCHANGE_OPTION( "8", "MARKET_EXCHANGE_OPTION",
            "8 - Market (Exchange) option" ),
    CANCELED_NOT_BEST( "9", "CANCELED_NOT_BEST",
            "9 - Canceled, not best" ),
    WAREHOUSE_RECAP( "10", "WAREHOUSE_RECAP",
            "10 - Warehouse Recap" ),
    PEG_REFRESH( "11", "PEG_REFRESH",
            "11 - Peg Refresh" ),
    OTHER( "99", "OTHER",
            "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum378ExecRestatementReason(final String id, final String name, final String description) {
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
        for (Enum378ExecRestatementReason oneEnum : Enum378ExecRestatementReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
