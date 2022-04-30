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
 *  661 (same as 660, 601)
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account that the Respondent may not have setup yet in their system.
 *  AcctIDSource
 *  Valid values:
 *      1 - BIC
 *     	2 - SID Code
 *      3 - TFM (GSPTA)
 *     	4 - OMGEO (Alert ID)
 *     	5 - DTCC Code
 *     	99 - Other (custom or proprietary)
 */
public enum Enum661AllocAcctIDSource implements EnumAccessors, LogStringVerbose {
    BIC( "1", "BIC", "1 - BIC" ),
    SID( "2", "SID", "2 - SID Code" ),
    TFM( "3", "TFM", "3 - TFM (GSPTA)" ),
    OMGEO( "4", "OMGEO", "4 - OMGEO (Alert ID)" ),
    DTCC( "5", "DTCC", "5 - DTCC Code" ),
    OTHER( "99", "OTHER", "99 - Other (custom or proprietary)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum661AllocAcctIDSource(final String id, final String name, final String description) {
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
        for (Enum661AllocAcctIDSource oneEnum : Enum661AllocAcctIDSource.values()) {
            System.out.println(oneEnum);
        }
    }
}
