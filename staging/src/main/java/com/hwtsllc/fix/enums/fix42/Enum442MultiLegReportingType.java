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
 *  442
 *  MultiLegReportingType
 *  char
 *  <p>
 *  Used to indicate what an Execution Report represents
 *  <p>
 *  (e.g. used with multi-leg securities, such as option strategies, spreads, etc.).
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    1 - Single security (default if not specified)
 *  <p>    2 - Individual leg of a multi=leg security
 *  <p>    3 - Multi-leg security
 */
public enum Enum442MultiLegReportingType implements LogFIXString, LogVerboseString {
    /*
     * 1-3 msg types
     */
    SINGLE_SECURITY( "1", "SINGLE_SECURITY",
            "1 - Single security (default if not specified)" ),
    INDIVIDUAL_LEG_SECURITY( "2", "INDIVIDUAL_LEG_SECURITY",
            "2 - Individual leg of a multi=leg security" ),
    MULTI_LEG_SECURITY( "3", "MULTI_LEG_SECURITY",
            "3 - Multi-leg security" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum442MultiLegReportingType(final String id, final String name, final String description) {
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
        for (Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            System.out.println(oneEnum);
        }
    }
}
