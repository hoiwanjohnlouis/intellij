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

package com.hwtsllc.fix.enums.fix42;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  340
 *  Enu
 *  TradSesStatus
 *  int
 *  <p>
 *  State of the trading session.
 *  <p></p>
 *  Valid values:
 *  <p>    0-6 msg types
 *  <p>    "0 - Unknown"
 *  <p>    "1 - Halted"
 *  <p>    "2 - Open"
 *  <p>    "3 - Closed"
 *  <p>    "4 - Pre-Open"
 *  <p></p>
 *  <p>    "5 - Pre-Close"
 *  <p>    "6 - Request Rejected"
 */
public enum Enum340TradSesStatus implements LogFIXString, LogVerboseString {
    /*
     * 0-6 msg types
     */
    UNKNOWN( "0", "UNKNOWN", "0 - Unknown" ),
    HALTED( "1", "HALTED", "1 - Halted" ),
    OPEN( "2", "OPEN", "2 - Open" ),
    CLOSED( "3", "CLOSED", "3 - Closed" ),
    PRE_OPEN( "4", "PRE_OPEN", "4 - Pre-Open" ),

    PRE_CLOSE( "5", "PRE_CLOSE", "5 - Pre-Close" ),
    REQUEST_REJECTED( "6", "REQUEST_REJECTED", "6 - Request Rejected" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum340TradSesStatus(final String id, final String name, final String description) {
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
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
