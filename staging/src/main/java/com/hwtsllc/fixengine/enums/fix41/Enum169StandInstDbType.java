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

package com.hwtsllc.fixengine.enums.fix41;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  169
 *  StandInstDbType
 *  int
 *  <p>
 *  Identifies the Standing Instruction database used
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Other
 *  <p>    1 - DTC SID
 *  <p>    2 - Thomson ALERT
 *  <p>    3 - A Global Custodian (StandInstDBName (70) must be provided)
 *  <p>    4 - AccountNet
 */
public enum Enum169StandInstDbType implements LogFIXString, LogVerboseString {
    OTHER( "0",
            "OTHER",
            "0 - Other" ),
    DTC_SID( "1",
            "DTC_SID",
            "1 - DTC SID" ),
    THOMPSON_ALERT( "2",
            "THOMPSON_ALERT",
            "2 - Thomson ALERT" ),
    GLOBAL_CUSTODIAN( "3",
            "GLOBAL_CUSTODIAN",
            "3 - A Global Custodian (StandInstDBName (70) must be provided)" ),
    ACCOUNT_NET( "4",
            "ACCOUNT_NET",
            "4 - AccountNet" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum169StandInstDbType(final String id, final String name, final String description) {
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
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            System.out.println(oneEnum);
        }
    }
}
