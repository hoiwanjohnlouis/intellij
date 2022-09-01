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
 *  728
 *  PosReqResult
 *  int
 *  <p></p>
 *  Result of Request for Position
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No positions found that match criteria
 *  <p>    3 - Not authorized to request positions
 *  <p>    4 - Request for position not supported
 *  <p></p>
 *  <p>    99 - Other (use Text (58) in conjunction with this code for an explanation)
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum728PosReqResult implements LogFIXString, LogVerboseString {
    VALID_REQUEST( "0", "VALID_REQUEST", "0 - Valid request" ),
    UNSUPPORTED_REQUEST( "1", "UNSUPPORTED_REQUEST", "1 - Invalid or unsupported request" ),
    NO_POSITIONS_FOUND( "2", "NO_POSITIONS_FOUND", "2 - No positions found that match criteria" ),
    NOT_AUTHORIZED( "3", "NOT_AUTHORIZED", "3 - Not authorized to request positions" ),
    REQUEST_NOT_SUPPORTED( "4", "REQUEST_NOT_SUPPORTED", "4 - Request for position not supported" ),

    OTHER( "99", "OTHER", "99 - Other (use Text (58) in conjunction with this code for an explanation)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum728PosReqResult(final String id, final String name, final String description) {
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
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
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
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
