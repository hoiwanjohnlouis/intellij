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

package com.hwtsllc.fixengine.tags.fix42.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  429
 *  ListStatusType
 *  int
 *  <p>
 *  Code to represent the status type.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    1 - Ack
 *  <p>    2 - Response
 *  <p>    3 - Timed
 *  <p>    4 - Exec Started
 *  <p>    5 - All Done
 *  <p></p>
 *  <p>    6 - Alert
 */
public enum Enum429ListStatusType implements LogFIXString, LogVerboseString {
    /*
     * 1-6 msg types
     */
    ACK( "1", "ACK", "1 - Ack" ),
    RESPONSE( "2", "RESPONSE", "2 - Response" ),
    TIMED( "3", "TIMED", "3 - Timed" ),
    EXEC_STARTED( "4", "EXEC_STARTED", "4 - Exec Started" ),
    ALL_DONE( "5", "ALL_DONE", "5 - All Done" ),

    ALERT( "6", "ALERT", "6 - Alert" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum429ListStatusType(final String id, final String name, final String description) {
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
        for (Enum429ListStatusType oneEnum : Enum429ListStatusType.values()) {
            System.out.println(oneEnum);
        }
    }
}
