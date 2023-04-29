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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  431
 *  ListOrderStatus
 *  int
 *  <p>
 *  Code to represent the status of a list order.
 *  <p></p>
 *  Valid values:
 *  <p>    1-7 msg types
 *  <p>    1 - In bidding process
 *  <p>    2 - Received for execution
 *  <p>    3 - Executing
 *  <p>    4 - Cancelling
 *  <p>    5 - Alert
 *  <p></p>
 *  <p>    6 - All Done
 *  <p>    7 - Reject
 */
public enum Enum431ListOrderStatus implements LogFIXString, LogVerboseString {
    /*
     * 1-7 msg types
     */
    IN_BIDDING_PROCESS( "1", "IN_BIDDING_PROCESS", "1 - In Bidding Process" ),
    RECEIVED_FOR_EXECUTION( "2", "RECEIVED_FOR_EXECUTION", "2 - Received For Execution" ),
    EXECUTING( "3", "EXECUTING", "3 - Executing" ),
    CANCELLING( "4", "CANCELLING", "4 - Cancelling" ),
    ALERT( "5", "ALERT", "5 - Alert" ),
    ALL_DONE( "6", "ALL_DONE", "6 - All Done" ),
    REJECT( "7", "REJECT", "7 - Reject" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum431ListOrderStatus(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum431ListOrderStatus oneEnum : Enum431ListOrderStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
