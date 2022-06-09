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
 *  724
 *  PosReqType
 *  int
 *  <p></p>
 *  Used to specify the type of position request being made.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Positions
 *  <p>    1 - Trades
 *  <p>    2 - Exercises
 *  <p>    3 - Assignments
 *  <p>    4 - Settlement Activity
 *  <p></p>
 *  <p>    5 - Backout Message
 */
public enum Enum724PosReqType implements LogFIXString, LogVerboseString {
    POSITIONS( "0", "POSITIONS", "0 - Positions" ),
    TRADES( "1", "TRADES", "1 - Trades" ),
    EXERCISES( "2", "EXERCISES", "2 - Exercises" ),
    ASSIGNMENTS( "3", "ASSIGNMENTS", "3 - Assignments" ),
    SETTLEMENT_ACTIVITY( "4", "SETTLEMENT_ACTIVITY", "4 - Settlement Activity" ),

    BACKOUT_MESSAGE( "5", "BACKOUT_MESSAGE", "5 - Backout Message" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum724PosReqType(final String id, final String name, final String description) {
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
        for (Enum724PosReqType oneEnum : Enum724PosReqType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
