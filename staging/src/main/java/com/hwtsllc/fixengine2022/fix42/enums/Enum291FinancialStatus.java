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
 *  291
 *  FinancialStatus
 *  MultipleCharValue
 *  <p>
 *  Identifies a firm's or a security's financial status
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
 *  <p>    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
 *  <p>    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
 */
public enum Enum291FinancialStatus implements LogFIXString, LogVerboseString {
    /*
     * 1-3 msg types
     */
    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum291FinancialStatus(final String id, final String name, final String description) {
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
        return toEnumLabelString()
                .concat("=[")
                .concat( toEnumIDString())
                .concat(",")
                .concat( toEnumNameString())
                .concat(",")
                .concat( toEnumDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
