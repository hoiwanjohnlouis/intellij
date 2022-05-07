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
 *  906
 *  CollAsgnRejectReason
 *  int
 *  Collateral Assignment Reject Reason
 *  Valid values:
 *      0 - Unknown deal (order or trade)
 *      1 - Unknown or invalid instrument
 *      2 - Unauthorized transaction
 *      3 - Insufficient collateral
 *      4 - Invalid type of collateral
 *      5 - Excessive substitution
 *      99 - Other
 *
 *  or any value conforming to the data type Reserved100Plus
 */
public enum Enum906CollAsgnRejectReason implements EnumAccessors, LogStringVerbose {
    UNKNOWN_DEAL( "0", "UNKNOWN_DEAL", "0 - Unknown deal (order or trade)" ),
    INVALID_INSTRUMENT( "1", "INVALID_INSTRUMENT", "1 - Unknown or invalid instrument" ),
    UNAUTHORIZED_TRANSACTION( "2", "UNAUTHORIZED_TRANSACTION", "2 - Unauthorized transaction" ),
    INSUFFICIENT_COLLATERAL( "3", "INSUFFICIENT_COLLATERAL", "3 - Insufficient collateral" ),
    INVALID_COLLATERAL( "4", "INVALID_COLLATERAL", "4 - Invalid type of collateral" ),

    EXCESSIVE_SUBSTITUTION( "5", "EXCESSIVE_SUBSTITUTION", "5 - Excessive substitution" ),
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum906CollAsgnRejectReason(final String id, final String name, final String description) {
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
        for (Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
