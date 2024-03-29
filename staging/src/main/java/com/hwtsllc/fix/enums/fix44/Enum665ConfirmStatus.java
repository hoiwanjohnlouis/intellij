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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  665
 *  ConfirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Mismatched Account
 *  <p>    3 - Missing Settlement Instructions
 *  <p>    4 - Confirmed
 *  <p>    5 - Request Rejected
 */
public enum Enum665ConfirmStatus implements LogFIXString, LogVerboseString {
    RECEIVED( "1", "RECEIVED", "1 - Received" ),
    MISMATCHED_ACCOUNT( "2", "MISMATCHED_ACCOUNT", "2 - Mismatched Account" ),
    MISSING_INSTRUCTIONS( "3", "MISSING_INSTRUCTIONS", "3 - Missing Settlement Instructions" ),
    CONFIRMED( "4", "CONFIRMED", "4 - Confirmed" ),
    REJECTED( "5", "REJECTED", "5 - Request Rejected" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum665ConfirmStatus(final String id, final String name, final String description) {
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
        for (Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
