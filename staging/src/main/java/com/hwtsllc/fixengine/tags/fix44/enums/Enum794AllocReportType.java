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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  794
 *  AllocReportType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Preliminary Request to Intermediary
 *  <p>    3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *          (sent unsolicited by sellside, includes MiscFees and NetMoney)
 *  <p>    5 - Warehouse Recap
 *  <p>    8 - Request to Intermediary
 *  <p></p>
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p>    11 - Accept Pending
 *  <p>    12 - Complete
 *  <p>    14 - Reverse Pending
 */
public enum Enum794AllocReportType implements LogFIXString, LogVerboseString {
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
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum794AllocReportType oneEnum : Enum794AllocReportType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
