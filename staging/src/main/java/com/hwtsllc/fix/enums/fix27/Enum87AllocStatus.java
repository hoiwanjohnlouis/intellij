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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  87
 *  AllocStatus
 *  int
 *  <p></p>
 *  Identifies status of allocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - accepted (successfully processed)
 *  <p>    1 - block level reject
 *  <p>    2 - account level reject
 *  <p>    3 - received (received, not yet processed)
 *  <p>    4 - incomplete
 *  <p></p>
 *  <p>    5 - rejected by intermediary
 *  <p>    6 - allocation pending
 *  <p>    7 - reversed
 */
public enum Enum87AllocStatus implements LogFIXString, LogVerboseString {
    ACCEPTED("0", "ACCEPTED", "0 -accepted (successfully processed)" ),
    BLOCK_LEVEL_REJECT("1", "BLOCK_LEVEL_REJECT", "1 - block level reject" ),
    ACCOUNT_LEVEL_REJECT("2", "ACCOUNT_LEVEL_REJECT", "2 - account level reject" ),
    RECEIVED_NOT_PROCESSED("3", "RECEIVED_NOT_PROCESSED", "3 - received (received, not yet processed)" ),
    INCOMPLETE("4", "INCOMPLETE", "4 - incomplete" ),

    REJECTED_BY_INTERMEDIARY("5", "REJECTED_BY_INTERMEDIARY", "5 - rejected by intermediary" ),
    ALLOCATION_PENDING("6", "ALLOCATION_PENDING", "6 - allocation pending" ),
    REVERSED("7", "REVERSED", "7 - reversed" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum87AllocStatus(final String id, final String name, final String description) {
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
        for (Enum87AllocStatus oneEnum : Enum87AllocStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
