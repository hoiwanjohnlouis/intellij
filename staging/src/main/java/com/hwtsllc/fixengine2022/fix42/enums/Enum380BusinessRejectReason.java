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
 *  380
 *  BusinessRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a Business Message Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Other
 *  <p>     1 - Unknown ID
 *  <p>     2 - Unknown Security
 *  <p>     3 - Unknown Message Type
 *  <p>     4 - Application not available
 *  <p></p>
 *  <p>     5 - Conditionally required field missing
 *  <p>     6 - Not Authorized
 *  <p>     7 - DeliverTo firm not available at this time
 *  <p>     18 - Invalid price increment
 */
public enum Enum380BusinessRejectReason implements LogFIXString, LogVerboseString {
    /*
     * 0-7, 18 msg types
     */
    OTHER( "0", "OTHER",
            "0 - Other" ),
    UNKNOWN_ID( "1", "UNKNOWN_ID",
            "1 - Unknown ID" ),
    UNKNOWN_SECURITY( "2", "UNKNOWN_SECURITY",
            "2 - Unknown Security" ),
    UNKNOWN_MESSAGE_TYPE( "3", "UNKNOWN_MESSAGE_TYPE",
            "3 - Unknown Message Type" ),
    APPLICATION_NOT_AVAILABLE( "4", "APPLICATION_NOT_AVAILABLE",
            "4 - Application not available" ),
    REQUIRED_FIELD_MISSING( "5", "REQUIRED_FIELD_MISSING",
            "5 - Conditionally required field missing" ),
    NOT_AUTHORIZED( "6", "NOT_AUTHORIZED",
            "6 - Not Authorized" ),
    DELIVERTO_FIRM_NOT_AVAILABLE( "7", "DELIVERTO_FIRM_NOT_AVAILABLE",
            "7 - DeliverTo firm not available at this time" ),
    INVALID_PRICE_INCREMENT( "18", "INVALID_PRICE_INCREMENT",
            "18 - Invalid price increment" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum380BusinessRejectReason(final String id, final String name, final String description) {
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
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
