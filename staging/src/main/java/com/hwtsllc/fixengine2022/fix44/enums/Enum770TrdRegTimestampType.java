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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  770
 *  TrdRegTimestampType
 *  Traded / Regulatory timestamp type.
 *  Note of Applicability:
 *      values are required in US futures markets by the CFTC to
 *      support computerized trade reconstruction.
 *      (see Volume : "Glossary" for value definitions)
 *  Valid values:
 *      1 - Execution Time
 *      2 - Time In
 *      3 - Time Out
 *      4 - Broker Receipt
 *      5 - Broker Execution
 *      6 - Desk Receipt
 */
public enum Enum770TrdRegTimestampType implements EnumAccessors, LogStringVerbose {
    EXECUTION_TIME( "1", "EXECUTION_TIME", "1 - Execution Time" ),
    TIME_IN( "2", "TIME_IN", "2 - Time In" ),
    TIME_OUT( "3", "TIME_OUT", "3 - Time Out" ),
    BROKER_RECEIPT( "4", "BROKER_RECEIPT", "4 - Broker Receipt" ),
    BROKER_EXECUTION( "5", "BROKER_EXECUTION", "5 - Broker Execution" ),
    DESK_RECEIPT( "6", "DESK_RECEIPT", "6 - Desk Receipt" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum770TrdRegTimestampType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            System.out.println(oneEnum);
        }
    }
}
