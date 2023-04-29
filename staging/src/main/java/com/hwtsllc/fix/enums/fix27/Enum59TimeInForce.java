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
 *  59
 *  TimeInForce
 *  char
 *  <p></p>
 *  Specifies how long the order remains in effect.
 *  <p></p>
 *  Absence of this field is interpreted as DAY.
 *  <p></p>
 *  NOTE not applicable to CIV Orders.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Day (or session)
 *  <p>    1 - Good Till Cancel (GTC)
 *  <p>    2 - At the Opening (OPG)
 *  <p>    3 - Immediate Or Cancel (IOC)
 *  <p>    4 - Fill Or Kill (FOK)
 *  <p></p>
 *  <p>    5 - Good Till Crossing (GTX)
 *  <p>    6 - Good Till Date (GTD)
 *  <p>    7 - At the Close
 */
public enum Enum59TimeInForce implements LogFIXString, LogVerboseString {
    DAY("0", "DAY", "0 - Day (or session)" ),
    GOOD_TILL_CANCEL("1", "GOOD_TILL_CANCEL", "1 - Good Till Cancel (GTC)" ),
    AT_THE_OPENING("2", "AT_THE_OPENING", "2 - At the Opening (OPG)" ),
    IMMEDIATE_OR_CANCEL("3", "IMMEDIATE_OR_CANCEL", "3 - Immediate Or Cancel (IOC)" ),
    FILL_OR_KILL("4", "FILL_OR_KILL", "4 - Fill Or Kill (FOK)" ),

    GOOD_TILL_CROSSING("5", "GOOD_TILL_CROSSING", "5 - Good Till Crossing (GTX)" ),
    GOOD_TILL_DATE("6", "GOOD_TILL_DATE", "6 - Good Till Date (GTD)" ),
    AT_THE_CLOSE("7", "AT_THE_CLOSE", "7 - At the Close" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum59TimeInForce(final String id, final String name, final String description) {
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
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            System.out.println(oneEnum);
        }
    }
}
