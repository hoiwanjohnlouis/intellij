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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Replace;

public enum Enum150ExecType {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum150ExecType(final String action, final String name, final String description) {
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
        System.out.println(Enum150ExecType.NEW);
        System.out.println(Enum150ExecType.DONE_FOR_DAY);
        System.out.println(Enum150ExecType.CANCELED);
        System.out.println(Enum150ExecType.REPLACED);
        System.out.println(Enum150ExecType.PENDING_CANCEL);

        System.out.println(Enum150ExecType.STOPPED);
        System.out.println(Enum150ExecType.REJECTED);
        System.out.println(Enum150ExecType.SUSPENDED);
        System.out.println(Enum150ExecType.PENDING_NEW);
        System.out.println(Enum150ExecType.CALCULATED);

        System.out.println(Enum150ExecType.EXPIRED);
        System.out.println(Enum150ExecType.RESTATED);
        System.out.println(Enum150ExecType.PENDING_REPLACE);
        System.out.println(Enum150ExecType.TRADE_PARTIAL_OR_FILLED);
        System.out.println(Enum150ExecType.TRADE_CORRECT);

        System.out.println(Enum150ExecType.TRADE_CANCEL);
        System.out.println(Enum150ExecType.ORDER_STATUS);
        System.out.println(Enum150ExecType.TRADE_IN_CLEARING_HOLD);
        System.out.println(Enum150ExecType.TRADE_RELEASE_TO_CLEARING);
        System.out.println(Enum150ExecType.TRIGGERED_OR_ACTIVATED);
    }
}
