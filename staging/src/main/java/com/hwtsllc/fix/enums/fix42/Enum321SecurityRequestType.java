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
 *  321
 *  SecurityRequestType
 *  int
 *  <p>
 *  Type of Security Definition Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-3 msg types
 *  <p>    "0 - Request Security identity and specifications"
 *  <p>    "1 - Request Security identity for the specifications provided
 *          (name of the security is not supplied)"
 *  <p>    "2 - Request List Security Types" ),
 *  <p>    "3 - Request List Securities (can be qualified with Symbol, SecurityType,
 *          TradingSessionID, SecurityExchange.
 *          If provided, then only list Securities for the specific type.)"
 */
public enum Enum321SecurityRequestType implements LogFIXString, LogVerboseString {
    /*
     * 0-3 msg types
     */
    REQUEST_SECURITY_IDENTITY( "0", "REQUEST_SECURITY_IDENTITY",
            "0 - Request Security identity and specifications" ),
    REQUEST_SPECIFIED_SECURITY( "1", "REQUEST_SPECIFIED_SECURITY",
            "1 - Request Security identity for the specifications provided " +
                    "(name of the security is not supplied)" ),
    REQUEST_LIST_SECURITY_TYPES( "2", "REQUEST_LIST_SECURITY_TYPES",
            "2 - Request List Security Types" ),
    REQUEST_LIST_SECURITIES( "3", "REQUEST_LIST_SECURITIES",
            "3 - Request List Securities (can be qualified with Symbol, SecurityType, TradingSessionID, " +
                    "SecurityExchange. If provided, then only list Securities for the specific type.)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum321SecurityRequestType(final String id, final String name, final String description) {
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
        for (Enum321SecurityRequestType oneEnum : Enum321SecurityRequestType.values()) {
            System.out.println(oneEnum);
        }
    }
}
