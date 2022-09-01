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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  81
 *  ProcessCode
 *  char
 *  <p></p>
 *  Processing code for sub-account.
 *  <p></p>
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  <p></p>
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular
 *  <p>    1 - Soft Dollar
 *  <p>    2 - Step-In
 *  <p>    3 - Step-Out
 *  <p>    4 - Soft-dollar Step-In
 *  <p></p>
 *  <p>    5 - Soft-dollar Step-Out
 *  <p>    6 - Plan Sponsor
 */
public enum Enum81ProcessCode implements LogFIXString, LogVerboseString {
    REGULAR("0", "REGULAR", "0 - Regular" ),
    SOFT_DOLLAR("1", "SOFT_DOLLAR", "1 - Soft Dollar" ),
    STEP_IN("2", "STEP_IN", "2 - Step In" ),
    STEP_OUT("3", "STEP_OUT", "3 - Step Out" ),
    SOFT_DOLLAR_STEP_IN("4", "SOFT_DOLLAR_STEP_IN", "4 - Soft Dollar, Step In" ),

    SOFT_DOLLAR_STEP_OUT("5", "SOFT_DOLLAR_STEP_OUT", "5 - Soft Dollar, Step Out" ),
    PLAN_SPONSOR("6", "PLAN_SPONSOR", "6 - Plan Sponsor" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum81ProcessCode(final String id, final String name, final String description) {
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
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            System.out.println(oneEnum);
        }
    }
}
