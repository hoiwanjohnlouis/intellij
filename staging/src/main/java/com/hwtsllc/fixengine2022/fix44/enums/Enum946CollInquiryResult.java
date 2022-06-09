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
 *  946
 *  CollInquiryResult
 *  int
 *  <p></p>
 *  Result returned in response to Collateral Inquiry
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid or unknown instrument
 *  <p>    2 - Invalid or unknown collateral type
 *  <p>    3 - Invalid Parties
 *  <p>    4 - Invalid Transport Type requested
 *  <p></p>
 *  <p>    5 - Invalid Destination requested
 *  <p>    6 - No collateral found for the trade specified
 *  <p>    7 - No collateral found for the order specified
 *  <p>    8 - Collateral inquiry type not supported
 *  <p>    9 - Unauthorized for collateral inquiry
 *  <p></p>
 *  <p>    99 - Other (further information in Text (58) field)
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public enum Enum946CollInquiryResult implements LogFIXString, LogVerboseString {
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
    public String toEnumNameString() {
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
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
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
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
