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
 *  298
 *  QuoteCancelType
 *  int
 *  <p>
 *  Identifies the type of  quote cancel.
 *  <p></p>
 *  Valid values:
 *  <p>    1-5 msg types
 *  <p>    "1 - Cancel for Symbol(s)"
 *  <p>    "2 - Cancel for Security Type(s)"
 *  <p>    "3 - Cancel for Underlying Symbol"
 *  <p>    "4 - Cancel All Quotes"
 *  <p>    "5 - Cancel quote specified in QuoteID"
 */
public enum Enum298QuoteCancelType implements LogFIXString, LogVerboseString {
    /*
     * 1-5 msg types
     */
    CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL",
            "1 - Cancel for Symbol(s)" ),
    CANCEL_FOR_SECURITY_TYPE( "2", "CANCEL_FOR_SECURITY_TYPE",
            "2 - Cancel for Security Type(s)" ),
    CANCEL_FOR_UNDERLYING_SYMBOL( "3", "CANCEL_FOR_UNDERLYING_SYMBOL",
            "3 - Cancel for Underlying Symbol" ),
    CANCEL_ALL_QUOTES( "4", "CANCEL_ALL_QUOTES",
            "4 - Cancel All Quotes" ),
    CANCEL_QUOTEID_QUOTE("5", "CANCEL_QUOTEID_QUOTE",
            "5 - Cancel quote specified in QuoteID" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum298QuoteCancelType(final String id, final String name, final String description) {
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
        for (Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            System.out.println(oneEnum);
        }
    }
}
