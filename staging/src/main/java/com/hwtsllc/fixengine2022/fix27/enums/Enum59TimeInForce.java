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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum59TimeInForce implements EnumAccessors, LogStringVerbose {
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
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            System.out.println(oneEnum);
        }
    }
}