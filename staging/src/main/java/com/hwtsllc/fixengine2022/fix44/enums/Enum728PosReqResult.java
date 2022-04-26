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

public enum Enum728PosReqResult implements EnumAccessors, LogStringVerbose {
    /**
     *  728
     *  PosReqResult
     *  Result of Request for Position
     *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
     *  Valid values:
     *      0 - Valid request
     *      1 - Invalid or unsupported request
     *      2 - No positions found that match criteria
     *      3 - Not authorized to request positions
     *      4 - Request for position not supported
     *      99 - Other (use Text (58) in conjunction with this code for an explanation)
     *
     *      or any value conforming to the data type Reserved100Plus
     */
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
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            System.out.println(oneEnum);
        }
    }
}
