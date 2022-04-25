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

public enum Enum794AllocReportType implements EnumAccessors, LogStringVerbose {
    /**
     *  794
     *  AllocReportType
     *  Describes the specific type or purpose of an Allocation Report message
     *  Valid values:
     *      2 - Preliminary Request to Intermediary
     *      3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
     *      4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney)
     *      5 - Warehouse Recap
     *      8 - Request to Intermediary
     *      9 - Accept
     *      10 - Reject
     *      11 - Accept Pending
     *      12 - Complete
     *      14 - Reverse Pending
     */
    PRELIMINARY_REQUEST( "2", "PRELIMINARY_REQUEST", "2 - Preliminary Request to Intermediary" ),
    SELLSIDE_USING_PRELIMINARY( "3", "SELLSIDE_USING_PRELIMINARY", "3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)" ),
    SELLSIDE_WITHOUT_PRELIMINARY( "4", "SELLSIDE_WITHOUT_PRELIMINARY", "4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney)" ),
    WAREHOUSE_RECAP( "5", "WAREHOUSE_RECAP", "5 - Warehouse Recap" ),
    REQUEST_TO_INTERMEDIARY( "8", "REQUEST_TO_INTERMEDIARY", "8 - Request to Intermediary" ),
    ACCEPT( "9", "ACCEPT", "9 - Accept" ),
    REJECT( "10", "REJECT", "10 - Reject" ),
    ACCEPT_PENDING( "11", "ACCEPT_PENDING", "11 - Accept Pending" ),
    COMPLETE( "12", "COMPLETE", "12 - Complete" ),
    REVERSE_PENDING( "14", "REVERSE_PENDING", "14 - Reverse Pending" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum794AllocReportType(final String id, final String name, final String description) {
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
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            System.out.println(oneEnum);
        }
    }
}
