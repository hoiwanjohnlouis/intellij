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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  573
 *  MatchStatus
 *  char
 *  <p></p>
 *  The status of this trade with respect to matching or comparison.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Compared, matched or affirmed
 *  <p>    1 - Uncompared, unmatched, or unaffired
 *  <p>    2 - Advisory or alert
 */
public enum Enum573MatchStatus implements LogFIXString, LogVerboseString {
    /*
     *  0-2 types
     */
    COMPARED_MATCHED_AFFIRMED( "0", "COMPARED_MATCHED_AFFIRMED",
            "0 - Compared, matched, or affirmed" ),
    UNCOMPARED_UNMATCHED_UNAFFIRMED( "1", "UNCOMPARED_UNMATCHED_UNAFFIRMED",
            "1 - Uncompared, unmatched, or unaffirmed" ),
    ADVISORY( "2", "ADVISORY",
            "2 - Advisory or alert" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum573MatchStatus(final String id, final String name, final String description) {
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
        for (Enum573MatchStatus oneEnum : Enum573MatchStatus.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}