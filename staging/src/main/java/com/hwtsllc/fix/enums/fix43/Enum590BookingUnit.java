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
 *  590
 *  BookingUnit
 *  char
 *  <p></p>
 *  Indicates what constitutes a bookable unit.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Each partial execution is a bookable unit
 *  <p>    1 - Aggregate partial executions on this order, and book one trade per order
 *  <p>    2 - Aggregate executions for this symbol, side, and settlement date
 */
public enum Enum590BookingUnit implements LogFIXString, LogVerboseString {
    /*
     *  0-2 types
     */
    PARTIAL_EXECUTION_BOOKABLE( "0", "PARTIAL_EXECUTION_BOOKABLE",
            "0 - Each partial execution is a bookable unit" ),
    AGGREGATE_PARTIAL_EXECUTION( "1", "AGGREGATE_PARTIAL_EXECUTION",
            "1 - Aggregate partial executions on this order, and book one trade per order" ),
    AGGREGATE_EXECUTIONS( "2", "AGGREGATE_EXECUTIONS",
            "2 - Aggregate executions for this symbol, side, and settlement date" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum590BookingUnit(final String id, final String name, final String description) {
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
        for (Enum590BookingUnit oneEnum : Enum590BookingUnit.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}