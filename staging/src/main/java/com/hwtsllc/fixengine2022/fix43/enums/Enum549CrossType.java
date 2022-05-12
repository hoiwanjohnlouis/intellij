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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Information is the same for TAGS 549
 */
public enum Enum549CrossType implements EnumAccessors, LogVerboseString {
    /*
     *  1-4 types
     */
    CROSS_AON( "1", "CROSS_AON",
            "1 - Cross AON - cross tade which is executed complete or not. This is equivalent to an All_Or_None" ),
    CROSS_IOC( "2", "CROSS_IOC",
            "2 - Cross IOC - cross trade which is executed partially and the rest is cancelled. " +
                    "Note: CrossPrioritization (550) field may be used to indicate " +
                    "which side should fully execute in this scenario" ),
    CROSS_ONE_SIDE( "3", "CROSS_ONE_SIDE",
            "3 - Cross One Side - cross trade which is partially executed with the " +
                    "unfilled portions remaining active. One side of the cross is fully executed " +
                    "(as denoted by the CrossPrioritization (550) field)" ),
    CROSS_SAME_PRICE( "4", "CROSS_SAME_PRICE",
            "4 - Cross Same Price - cross trade is executed with existing orders with the same price. " +
                    "The two sides potentially have different quantities" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum549CrossType(final String id, final String name, final String description) {
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
    public String toVerboseString() {
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
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            System.out.println(oneEnum);
        }
    }
}