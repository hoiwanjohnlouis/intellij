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
 *  792
 *  SettlInstReqRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unable to process request
 *  <p>    1 - Unknown account
 *  <p>    2 - No matching settlement instructions found
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum792SettlInstReqRejCode implements LogFIXString, LogVerboseString {
    UNABLE_TO_PROCESS_REQUEST( "0", "UNABLE_TO_PROCESS_REQUEST", "0 - Unable to process request" ),
    UNKNOWN_ACCOUNT( "1", "UNKNOWN_ACCOUNT", "1 - Unknown account" ),
    NO_MATCHING_INSTRUCTIONS( "2", "NO_MATCHING_INSTRUCTIONS", "2 - No matching settlement instructions found" ),
    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum792SettlInstReqRejCode(final String id, final String name, final String description) {
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
        for (Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
