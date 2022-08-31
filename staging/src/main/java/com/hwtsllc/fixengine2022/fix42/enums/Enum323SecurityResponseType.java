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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  323
 *  SecurityResponseType
 *  int
 *  <p>
 *  Type of Security Definition message response.
 *  <p></p>
 *  Valid values:
 *  <p>    1-6 msg types
 *  <p>    "1 - Accept security proposal as-is"
 *  <p>    "2 - Accept security proposal with revisions as indicated in the message"
 *  <p>    "3 - List of security types returned per request"
 *  <p>    "4 - List of securities returned per request"
 *  <p>    "5 - Reject security proposal"
 *  <p></p>
 *  <p>    "6 - Cannot match selection criteria"
 */
public enum Enum323SecurityResponseType implements LogFIXString, LogVerboseString {
    /*
     * 1-6 msg types
     */
    ACCEPT_SECURITY_AS_IS( "1", "ACCEPT_SECURITY_AS_IS",
            "1 - Accept security proposal as-is" ),
    ACCEPT_SECURITY_REVISIONS( "2", "ACCEPT_SECURITY_REVISIONS",
            "2 - Accept security proposal with revisions as indicated in the message" ),
    LIST_OF_SECURITY_TYPES_RETURNED( "3", "LIST_OF_SECURITY_TYPES_RETURNED",
            "3 - List of security types returned per request" ),
    LIST_OF_SECURITIES_RETURNED_PER_REQUEST( "4", "LIST_OF_SECURITIES_RETURNED_PER_REQUEST",
            "4 - List of securities returned per request" ),
    REJECT_SECURITY_PROPOSAL( "5", "REJECT_SECURITY_PROPOSAL",
            "5 - Reject security proposal" ),

    CANNOT_MATCH_SELECTION( "6", "CANNOT_MATCH_SELECTION",
            "6 - Cannot match selection criteria" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum323SecurityResponseType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
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
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
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
        for (Enum323SecurityResponseType oneEnum : Enum323SecurityResponseType.values()) {
            System.out.println(oneEnum);
        }
    }
}
