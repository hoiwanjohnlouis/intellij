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
 *  808
 *  AllocIntermedReqType
 *  int
 *  <p></p>
 *  Response to allocation to be communicated to a counterparty through an intermediary,
 *  i.e. clearing house.
 *  <p></p>
 *  Used in conjunction with AllocType = Request to Intermediary
 *  and AllocReportType = Request to Intermediary
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Pending Accept
 *  <p>    2 - Pending Release
 *  <p>    3 - Pending Reversal
 *  <p>    4 - Accept
 *  <p>    5 - Block Level Reject
 *  <p></p>
 *  <p>    6 - Account Level Reject
 */
public enum Enum808AllocIntermedReqType implements LogFIXString, LogVerboseString {
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
        for (Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
