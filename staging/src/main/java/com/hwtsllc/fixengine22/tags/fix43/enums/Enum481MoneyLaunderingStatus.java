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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  481
 *  MoneyLaunderingStatus
 *  char
 *  <p></p>
 *  A one character code identifying Money laundering status.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Passed
 *  <p>    N - Not Checked
 *  <p>    1 - Exempt - Below the Limit
 *  <p>    2 - Exempt - Client Money Type exemption
 *  <p>    3 - Exempt - Authorised Credit or financial institution
 */
public enum Enum481MoneyLaunderingStatus implements LogFIXString, LogVerboseString {
    /*
     * Y, N, 1, 2, and 3 types
     */
    PASSED("Y", "PASSED", "Y - Passed" ),
    NOT_CHECKED("N", "NOT_CHECKED", "N - Not Checked" ),
    EXEMPT_BELOW_LIMIT("1", "EXEMPT_BELOW_LIMIT", "1 - Exempt - Below the Limit" ),
    EXEMPT_CLIENT_MONEY("2", "EXEMPT_CLIENT_MONEY", "2 - Exempt - Client Money Type exemption" ),
    EXEMPT_AUTHORISED("3", "EXEMPT_AUTHORISED", "3 - Exempt - Authorised Credit or financial institution" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum481MoneyLaunderingStatus(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}