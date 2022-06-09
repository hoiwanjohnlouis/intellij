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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  895
 *  CollAsgnReason
 *  int
 *  <p></p>
 *  Reason for Collateral Assignment
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Initial
 *  <p>    1 - Scheduled
 *  <p>    2 - Time Warning
 *  <p>    3 - Margin Deficiency
 *  <p>    4 - Margin Excess
 *  <p></p>
 *  <p>    5 - Forward Collateral Demand
 *  <p>    6 - Event of default
 *  <p>    7 - Adverse tax event
 */
public enum Enum895CollAsgnReason implements LogFIXString, LogVerboseString {
    INITIAL( "0", "INITIAL", "0 - Initial" ),
    SCHEDULED( "1", "SCHEDULED", "1 - Scheduled" ),
    TIME_WARNING( "2", "TIME_WARNING", "2 - Time Warning" ),
    MARGIN_DEFICIENCY( "3", "MARGIN_DEFICIENCY", "3 - Margin Deficiency" ),
    MARGIN_EXCESS( "4", "MARGIN_EXCESS", "4 - Margin Excess" ),

    FORWARD_COLLATERAL_DEMAND( "5", "FORWARD_COLLATERAL_DEMAND", "5 - Forward Collateral Demand" ),
    EVENT_OF_DEFAULT( "6", "EVENT_OF_DEFAULT", "6 - Event of default" ),
    ADVERSE_TAX_EVENT( "7", "ADVERSE_TAX_EVENT", "7 - Adverse tax event" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum895CollAsgnReason(final String id, final String name, final String description) {
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
        for (Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
