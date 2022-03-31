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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum532MassCancelRejectReason implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 532
     */

    /*
     *  0-6, 99 types
     */
    MASS_CANCEL_NOT_SUPPORTED( "0", "MASS_CANCEL_NOT_SUPPORTED", "0 - Mass Cancel Not Supported" ),
    UNKNOWN_SECURITY( "1", "UNKNOWN_SECURITY", "1 - Invalid or Unknown Security" ),
    UNKNOWN_UNDERLYING( "2", "UNKNOWN_UNDERLYING", "2 - Invalid or Unknown Underlying security" ),
    UNKNOWN_PRODUCT( "3", "UNKNOWN_PRODUCT", "3 - Invalid or Unknown Product" ),
    UNKNOWN_CFICODE( "4", "UNKNOWN_CFICODE", "4 - Invalid or Unknown CFICode" ),
    UNKNOWN_SECURITYTYPE( "5", "UNKNOWN_SECURITYTYPE", "5 - Invalid or Unknown SecurityType" ),
    UNKNOWN_SESSION( "6", "UNKNOWN_SESSION", "6 - Invalid or Unknown Trading Session" ),
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum532MassCancelRejectReason(final String id, final String name, final String description) {
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
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
