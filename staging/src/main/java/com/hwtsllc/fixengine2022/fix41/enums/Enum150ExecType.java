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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum150ExecType implements EnumAccessors, LogStringVerbose {
    NEW( "0", "NEW",
            "0 - New" ),
    DONE_FOR_DAY( "3", "DONE_FOR_DAY",
            "3 - Done for day" ),
    CANCELED( "4", "CANCELED",
            "4 - Canceled" ),
    REPLACED( "5", "REPLACED",
            "5 - Replaced" ),
    PENDING_CANCEL( "6", "PENDING_CANCEL",
            "6 - Pending Cancel (e.g. result of Order Cancel Request)" ),
    STOPPED( "7", "STOPPED",
            "7 - Stopped" ),
    REJECTED( "8", "REJECTED",
            "8 - Rejected" ),
    SUSPENDED( "9", "SUSPENDED",
            "9 - Suspended" ),
    PENDING_NEW( "A", "PENDING_NEW",
            "A - Pending New" ),
    CALCULATED( "B", "CALCULATED",
            "B - Calculated" ),
    EXPIRED( "C", "EXPIRED",
            "C - Expired" ),
    RESTATED( "D", "RESTATED",
            "D - Restated (Execution Report sent unsolicited by sell side, " +
            "with ExecRestatementReason (378) set)" ),
    PENDING_REPLACE( "E", "PENDING_REPLACE",
            "E - Pending Replace (e.g. result of Order Cancel/Replace Request)" ),
    TRADE_PARTIAL_OR_FILLED( "F", "TRADE_PARTIAL_OR_FILLED",
            "F - Trade (partial fill or fill)" ),
    TRADE_CORRECT( "G", "TRADE_CORRECT",
            "G - Trade Correct" ),
    TRADE_CANCEL( "H", "TRADE_CANCEL",
            "H - Trade Cancel" ),
    ORDER_STATUS( "I", "ORDER_STATUS",
            "I - Order Status" ),
    TRADE_IN_CLEARING_HOLD( "J", "TRADE_IN_CLEARING_HOLD",
            "J - Trade in a Clearing Hold" ),
    TRADE_RELEASE_TO_CLEARING( "K", "TRADE_RELEASE_TO_CLEARING",
            "K - Trade has been released to Clearing" ),
    TRIGGERED_OR_ACTIVATED( "L", "TRIGGERED_OR_ACTIVATED",
            "L - Triggered or Activated by System" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum150ExecType(final String id, final String name, final String description) {
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
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            System.out.println(oneEnum);
        }
    }
}
