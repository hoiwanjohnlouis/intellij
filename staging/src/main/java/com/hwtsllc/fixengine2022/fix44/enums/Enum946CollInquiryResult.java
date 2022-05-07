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
 *  946
 *  CollInquiryResult
 *  int
 *  Result returned in response to Collateral Inquiry
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid or unknown instrument
 *      2 - Invalid or unknown collateral type
 *      3 - Invalid Parties
 *      4 - Invalid Transport Type requested
 *      5 - Invalid Destination requested
 *      6 - No collateral found for the trade specified
 *      7 - No collateral found for the order specified
 *      8 - Collateral inquiry type not supported
 *      9 - Unauthorized for collateral inquiry
 *      99 - Other (further information in Text (58) field)
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public enum Enum946CollInquiryResult implements EnumAccessors, LogStringVerbose {
    SUCCESSFUL( "0", "SUCCESSFUL", "0 - Successful (default)" ),
    INVALID_INSTRUMENT( "1", "INVALID_INSTRUMENT", "1 - Invalid or unknown instrument" ),
    UNKNOWN_COLLATERAL_TYPE( "2", "UNKNOWN_COLLATERAL_TYPE", "2 - Invalid or unknown collateral type" ),
    INVALID_PARTIES( "3", "INVALID_PARTIES", "3 - Invalid Parties" ),
    INVALID_TRANSPORT_TYPE( "4", "INVALID_TRANSPORT_TYPE", "4 - Invalid Transport Type requested" ),

    INVALID_DESTINATION( "5", "INVALID_DESTINATION", "5 - Invalid Destination requested" ),
    NO_COLLATERAL_FOUND_FOR_TRADE( "6", "NO_COLLATERAL_FOUND_FOR_TRADE", "6 - No collateral found for the trade specified" ),
    NO_COLLATERAL_FOUND_FOR_ORDER( "7", "NO_COLLATERAL_FOUND_FOR_ORDER", "7 - No collateral found for the order specified" ),
    COLLATERAL_INQUIRY_NOT_SUPPORTED( "8", "COLLATERAL_INQUIRY_NOT_SUPPORTED", "8 - Collateral inquiry type not supported" ),
    UNAUTHORIZED_COLLATERAL_INQUIRY( "9", "UNAUTHORIZED_COLLATERAL_INQUIRY", "9 - Unauthorized for collateral inquiry" ),

    OTHER( "99", "OTHER", "99 - Other (further information in Text (58) field)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum946CollInquiryResult(final String id, final String name, final String description) {
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
        for (Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            System.out.println(oneEnum);
        }
    }
}
