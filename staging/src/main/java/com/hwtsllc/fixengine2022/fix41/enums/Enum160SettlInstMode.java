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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  160
 *  SettlInstMode
 *  char
 *  <p>
 *  Indicates mode used for Settlement Instructions message.
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Default (Replaced)
 *  <p>    1 - Standing Instructions Provided
 *  <p>    2 - Specific Allocation Account Overriding (Replaced)
 *  <p>    3 - Specific Allocation Account Standing (Replaced)
 *  <p>    4 - Specific Order for a single account (for CIV)
 *  <p></p>
 *  <p>    5 - Request reject
 */
public enum Enum160SettlInstMode implements LogFIXString, LogVerboseString {
    DEFAULT( "0", "DEFAULT",
            "0 - Default (Replaced)" ),
    STANDING_INSTRUCTIONS_PROVIDED( "1", "STANDING_INSTRUCTIONS_PROVIDED",
            "1 - Standing Instructions Provided" ),
    SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING( "2", "SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING",
            "2 - Specific Allocation Account Overriding (Replaced)" ),
    SPECIFIC_ALLOCATION_ACCOUNT_STANDING( "3", "SPECIFIC_ALLOCATION_ACCOUNT_STANDING",
            "3 - Specific Allocation Account Standing (Replaced)" ),
    SPECIFIC_ORDER_SINGLE_ACCOUNT( "4", "SPECIFIC_ORDER_SINGLE_ACCOUNT",
            "4 - Specific Order for a single account (for CIV)" ),

    REQUEST_REJECT( "5", "REQUEST_REJECT",
            "5 - Request reject" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum160SettlInstMode(final String id, final String name, final String description) {
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
        for (Enum160SettlInstMode oneEnum : Enum160SettlInstMode.values()) {
            System.out.println(oneEnum);
        }
    }
}
