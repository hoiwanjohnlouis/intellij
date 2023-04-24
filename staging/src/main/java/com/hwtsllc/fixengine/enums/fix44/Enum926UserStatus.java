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

package com.hwtsllc.fixengine.enums.fix44;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  926
 *  UserStatus
 *  int
 *  <p></p>
 *  Indicates the status of a user
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Logged In
 *  <p>    2 - Not Logged In
 *  <p>    3 - User Not Recognised
 *  <p>    4 - Password Incorrect
 *  <p>    5 - Password Changed
 *  <p></p>
 *  <p>    6 - Other
 */
public enum Enum926UserStatus implements LogFIXString, LogVerboseString {
    LOGGED_IN( "1", "LOGGED_IN", "1 - Logged In" ),
    NOT_LOGGED_IN( "2", "NOT_LOGGED_IN", "2 - Not Logged In" ),
    USER_NOT_RECOGNISED( "3", "USER_NOT_RECOGNISED", "3 - User Not Recognised" ),
    PASSWORD_INCORRECT( "4", "PASSWORD_INCORRECT", "4 - Password Incorrect" ),
    PASSWORD_CHANGED( "5", "PASSWORD_CHANGED", "5 - Password Changed" ),

    OTHER( "6", "OTHER", "6 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum926UserStatus(final String id, final String name, final String description) {
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
        for (Enum926UserStatus oneEnum : Enum926UserStatus.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
