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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  549
 *  CrossType
 *  int
 *  <p></p>
 *  Type of cross being submitted to a market
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cross AON - cross tade which is executed complete or not.
 *  <p>         Both sides are treated in the same manner. This is equivalent to an "All or None".
 *  <p></p>
 *  <p>    2 - Cross IOC - cross trade which is executed partially and the rest is cancelled.
 *  <p>         One side is fully executed, the other side is partially executed with the remainder being cancelled.
 *  <p>         This is equivalent to an IOC on the other side.
 *  <p>         Note: CrossPrioritization (550) field may be used to
 *                    indicate which side should fully execute in this scenario.
 *  <p></p>
 *  <p>    3 - Cross One Side - cross trade which is partially executed with the unfilled portions remaining active.
 *  <p>         One side of the corss is fully executed (as denoted by the CrossPrioritization (550) field),
 *              but the unfilled portion remains active.
 *  <p></p>
 *  <p>    4 - Cross Same Price - cross trade is executed with existing orders with the same price.
 *  <p>         In this case other orders exist with the same price, the quantity of the Cross is
 *              executed against the existing orders and quotes, the remainder of the cross
 *              is executed against the other side of the cross.
 *  <p>         The two sides potentially have different quantities.
 */
public enum Enum549CrossType implements LogFIXString, LogVerboseString {
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
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
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
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
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
        for (Enum549CrossType oneEnum : Enum549CrossType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}