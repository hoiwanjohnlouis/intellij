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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1008
 *  SideTrdSubTyp
 *  int
 *  <p>
 *  Used on a multi-sided trade to specify the type of trade for a given side
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal Transfer
 *  <p>    2 - External Transfer
 *  <p>    3 - Reject for Submitting Trade
 *  <p>    4 - Advisory for Contra Side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential Spread
 *  <p>    8 - Implied Spread leg executed against an outright
 *  <p>    9 - Transaction from Exercise
 *  <p></p>
 *  <p>    10 - Transaction from Assignment
 */
public enum Enum1008SideTrdSubTyp implements LogFIXString, LogVerboseString {
    CMTA( "0", "CMTA", "0 - CMTA" ),
    INTERNAL_TRANSFER( "1", "INTERNAL_TRANSFER", "1 - Internal Transfer" ),
    EXTERNAL_TRANSFER( "2", "EXTERNAL_TRANSFER", "2 - External Transfer" ),
    REJECT_SUBMISSION( "3", "REJECT_SUBMISSION", "3 - Reject for Submitting Trade" ),
    ADVISORY_FOR_CONTRA( "4", "ADVISORY_FOR_CONTRA", "4 - Advisory for Contra Side" ),

    OFFSET_DUE_TO_ALLOCATION( "5", "OFFSET_DUE_TO_ALLOCATION", "5 - Offset due to an allocation" ),
    ONSET_DUE_TO_ALLOCATION( "6", "ONSET_DUE_TO_ALLOCATION", "6 - Onset due to an allocation" ),
    DIFFERENTIAL_SPREAD( "7", "DIFFERENTIAL_SPREAD", "7 - Differential Spread" ),
    IMPLIED_SPREAD_LEG( "8", "IMPLIED_SPREAD_LEG", "8 - Implied Spread leg executed against an outright" ),
    TRANSACTION_FROM_EXERCISE( "9", "TRANSACTION_FROM_EXERCISE", "9 - Transaction from Exercise" ),

    TRANSACTION_FROM_ASSIGNMENT( "10", "TRANSACTION_FROM_ASSIGNMENT", "10 - Transaction from Assignment" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum1008SideTrdSubTyp(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
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
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            System.out.println(oneEnum);
        }
    }
}
