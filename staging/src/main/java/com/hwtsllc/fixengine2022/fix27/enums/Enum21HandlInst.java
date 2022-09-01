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
 *  21
 *  HandlInst
 *  char
 *  <p></p>
 *  Instructions for order handling on Broker trading floor
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automated execution order, private, no Broker intervention
 *  <p>    2 - Automated execution order, public, Broker intervention OK
 *  <p>    3 - Manual order, best execution
 */
public enum Enum21HandlInst implements LogFIXString, LogVerboseString {
    AUTOMATIC_EXECUTION_NO_BROKER("1", "AUTOMATIC_EXECUTION_NO_BROKER",
            "1 - Automated execution order, private, no Broker intervention" ),
    AUTOMATIC_EXECUTION_BROKER_OKAY("2", "AUTOMATIC_EXECUTION_BROKER_OKAY",
            "2 - Automated execution order, public, Broker intervention OK" ),
    MANUAL_ORDER_BEST_EXECUTION("3", "MANUAL_ORDER_BEST_EXECUTION",
            "3 - Manual order, best execution" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum21HandlInst(final String id, final String name, final String description) {
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
                .concat( toFIXNameString())
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
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            System.out.println(oneEnum);
        }
    }
}
