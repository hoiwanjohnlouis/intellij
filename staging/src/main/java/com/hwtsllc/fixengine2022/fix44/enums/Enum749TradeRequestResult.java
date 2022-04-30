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
 *  749
 *  TradeRequestResult
 *  Result of Trade Request
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid or unknown instrument
 *      2 - Invalid type of trade requested
 *      3 - Invalid parties
 *      4 - Invalid transport type requested
 *      5 - Invalid destination requested
 *      8 - TradeRequestType not supported
 *      9 - Unauthorized for Trade Capture Report Request
 *      99 - Other
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public enum Enum749TradeRequestResult implements EnumAccessors, LogStringVerbose {
    SUCCESSFUL( "0", "SUCCESSFUL", "0 - Successful (default)" ),
    UNKNOWN_INSTRUMENT( "1", "UNKNOWN_INSTRUMENT", "1 - Invalid or unknown instrument" ),
    INVALID_TRADE_TYPE( "2", "INVALID_TRADE_TYPE", "2 - Invalid type of trade requested" ),
    INVALID_PARTIES( "3", "INVALID_PARTIES", "3 - Invalid parties" ),
    INVALID_TRANSPORT_TYPE( "4", "INVALID_TRANSPORT_TYPE", "4 - Invalid transport type requested" ),
    INVALID_DESTINATION_REQUESTED( "5", "INVALID_DESTINATION_REQUESTED", "5 - Invalid destination requested" ),
    TRADE_REQUEST_TYPE_NOT_SUPPORTED( "6", "TRADE_REQUEST_TYPE_NOT_SUPPORTED", "8 - TradeRequestType not supported" ),
    UNAUTHORIZED_REPORT_REQUEST( "7", "UNAUTHORIZED_REPORT_REQUEST", "9 - Unauthorized For Trade Capture Report Request" ),
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum749TradeRequestResult(final String id, final String name, final String description) {
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
        for (Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            System.out.println(oneEnum);
        }
    }
}
