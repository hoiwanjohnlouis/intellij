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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  560
 *  SecurityRequestResult
 *  int
 *  <p></p>
 *  The results returned to a Security Request message
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No instruments found that match selection criteria
 *  <p>    3 - Not authorized to retrieve instrument data
 *  <p>    4 - Instrument data temporarily unavailable
 *  <p>    5 - Request for instrument data not supported
 */
public enum Enum560SecurityRequestResult implements LogFIXString, LogVerboseString {
    /*
     *  0-5 types
     */
    VALID_REQUEST( "0", "VALID_REQUEST",
            "0 - Valid request" ),
    UNSUPPORTED_REQUEST( "1", "UNSUPPORTED_REQUEST",
            "1 - Invalid or unsupported request" ),
    NO_INSTRUMENTS_FOUND( "2", "NO_INSTRUMENTS_FOUND",
            "2 - No instruments found that match selection criteria" ),
    NOT_AUTHORIZED( "3", "NOT_AUTHORIZED",
            "3 - Not authorized to retrieve instrument data" ),
    INSTRUMENT_DATA_UNAVAILABLE( "4", "INSTRUMENT_DATA_UNAVAILABLE",
            "4 - Instrument data temporarily unavailable" ),

    REQUEST_NOT_SUPPORTED( "5", "REQUEST_NOT_SUPPORTED",
            "5 - Request for instrument data not supported" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum560SecurityRequestResult(final String id, final String name, final String description) {
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
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}