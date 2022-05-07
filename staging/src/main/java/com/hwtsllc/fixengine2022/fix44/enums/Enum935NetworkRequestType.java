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
 *  935
 *  NetworkRequestType
 *  int
 *  Indicates the type and level of details required for a Network Status Request Message Boolean logic applies
 *  e.g. If you want to subscribe for changes to certain id’s then UserRequestType = 0 (8+2), Snapshot for certain ID’s = 9 (8+1)
 *  Valid values:
 *      1 - Snapshot
 *      2 - Subscribe
 *      4 - Stop Subscribing
 *      8 - Level of Detail, then NoCompID's becomes required
 */
public enum Enum935NetworkRequestType implements EnumAccessors, LogStringVerbose {
    SNAPSHOT( "1", "SNAPSHOT", "1 - Snapshot" ),
    SUBSCRIBE( "2", "SUBSCRIBE", "2 - Subscribe" ),
    STOP_SUBSCRIBING( "4", "STOP_SUBSCRIBING", "4 - Stop Subscribing" ),
    LEVEL_OF_DETAIL( "8", "LEVEL_OF_DETAIL", "8 - Level of Detail, then NoCompID's becomes required" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum935NetworkRequestType(final String id, final String name, final String description) {
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
        for (Enum935NetworkRequestType oneEnum : Enum935NetworkRequestType.values()) {
            System.out.println(oneEnum);
        }
    }
}
