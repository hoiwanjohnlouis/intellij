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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  928
 *  StatusValue
 *  int
 *  <p></p>
 *  Indicates the status of a network connection
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Connected
 *  <p>    2 - Not Connected - down, expected up
 *  <p>    3 - Not Connected - down, expected down
 *  <p>    4 - In Process
 */
public enum Enum928StatusValue implements LogFIXString, LogVerboseString {
    CONNECTED( "1", "CONNECTED", "1 - Connected" ),
    DOWN_EXPECTED_UP( "2", "DOWN_EXPECTED_UP", "2 - Not Connected - down expected up" ),
    DOWN_EXPECTED_DOWN( "3", "DOWN_EXPECTED_DOWN", "3 - Not Connected - down expected down" ),
    IN_PROCESS( "4", "IN_PROCESS", "4 - In Process" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum928StatusValue(final String id, final String name, final String description) {
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
        for (Enum928StatusValue oneEnum : Enum928StatusValue.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
