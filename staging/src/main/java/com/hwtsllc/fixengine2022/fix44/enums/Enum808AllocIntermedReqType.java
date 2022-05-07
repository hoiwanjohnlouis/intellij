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
 *  808
 *  AllocIntermedReqType
 *  int
 *  Response to allocation to be communicated to a counterparty through an intermediary,
 *  i.e. clearing house.
 *  Used in conjunction with AllocType = Request to Intermediary
 *  and AllocReportType = Request to Intermediary
 *  Valid values:
 *      1 - Pending Accept
 *      2 - Pending Release
 *      3 - Pending Reversal
 *      4 - Accept
 *      5 - Block Level Reject
 *      6 - Account Level Reject
 */
public enum Enum808AllocIntermedReqType implements EnumAccessors, LogStringVerbose {
    PENDING_ACCEPT( "1", "PENDING_ACCEPT", "1 - Pending Accept" ),
    PENDING_RELEASE( "2", "PENDING_RELEASE", "2 - Pending Release" ),
    PENDING_REVERSAL( "3", "PENDING_REVERSAL", "3 - Pending Reversal" ),
    ACCEPT( "4", "ACCEPT", "4 - Accept" ),
    BLOCK_LEVEL_REJECT( "5", "BLOCK_LEVEL_REJECT", "5 - Block Level Reject" ),

    ACCOUNT_LEVEL_REJECT( "6", "ACCOUNT_LEVEL_REJECT", "6 - Account Level Reject" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum808AllocIntermedReqType(final String id, final String name, final String description) {
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
        for (Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            System.out.println(oneEnum);
        }
    }
}
