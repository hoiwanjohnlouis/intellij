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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  150
 *  ExecType
 *  char
 *  <p>
 *  Describes the specific ExecutionRpt
 *  <p>
 *  (i.e. Pending Cancel) while OrdStatus (39) will always identify the current order status (i.e. Partially Filled)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p>    5 - Replaced
 *  <p>    6 - Pending Cancel (e.g. result of Order Cancel Request)
 *  <p></p>
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Restated (Execution Report sent unsolicited by sellside, with ExecRestatementReason (378) set)
 *  <p>    E - Pending Replace (e.g. result of Order Cancel/Replace Request)
 *  <p></p>
 *  <p>    F - Trade (partial fill or fill)
 *  <p>    G - Trade Correct
 *  <p>    H - Trade Cancel
 *  <p>    I - Order Status
 *  <p>    J - Trade in a Clearing Hold
 *  <p></p>
 *  <p>    K - Trade has been released to Clearing
 *  <p>    L - Triggered or Activated by System
 */
public enum Enum150ExecType implements LogFIXString, LogVerboseString {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
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
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            System.out.println(oneEnum);
        }
    }
}
