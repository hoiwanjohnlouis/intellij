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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum658QuoteRequestRejectReason implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 658
     */

    /*
     *  1-11, 99 types
     */
    UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL", "1 - Unknown Symbol (Security)" ),
    EXCHANGE_CLOSED( "2", "EXCHANGE_CLOSED", "2 - Exchange (Security) Closed" ),
    QUOTE_EXCEEDS_LIMIT( "3", "QUOTE_EXCEEDS_LIMIT", "3 - Quote Request Exceeds Limit" ),
    TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER", "4 - Too Late to enter" ),
    INVALID_PRICE( "5", "INVALID_PRICE", "5 - Invalid Price" ),
    NOT_AUTHORIZED( "6", "NOT_AUTHORIZED", "6 - Not Authorized To Request Quote" ),
    NO_MATCH_FOR_INQUIRY( "7", "NO_MATCH_FOR_INQUIRY", "7 - No Match For Inquiry" ),
    NO_MARKET_FOR_INSTRUMENT( "8", "NO_MARKET_FOR_INSTRUMENT", "8 - No Market For Instrument" ),
    NO_INVENTORY( "9", "NO_INVENTORY", "9 - No Inventory" ),
    PASS( "10", "PASS", "10 - Pass" ),
    INSUFFICIENT_CREDIT( "11", "INSUFFICIENT_CREDIT", "11 - Insufficient credit" ),

    OTHER( "99", "OTHER", "99 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum658QuoteRequestRejectReason(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum658QuoteRequestRejectReason oneEnum : Enum658QuoteRequestRejectReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
