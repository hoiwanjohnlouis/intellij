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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  286
 *  OpenCloseSettleFlag
 *  MultipleCharValue
 *  <p>
 *  Flag that identifies a market data entry. (Prior to FIX 4.3 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0-5 msg types
 *  <p>    "0 - Daily Open / Close / Settlement entry"
 *  <p>    "1 - Session Open / Close / Settlement entry"
 *  <p>    "2 - Delivery Settlement entry"
 *  <p>    "3 - Expected entry"
 *  <p>    "4 - Entry from previous business day"
 *  <p>    "5 - Theoretical Price value"
 */
public enum Enum286OpenCLoseSettlFlag implements LogFIXString, LogVerboseString {
    /*
     * 0-5 msg types
     */
    DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT( "0", "DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT",
            "0 - Daily Open / Close / Settlement entry" ),
    SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT( "1", "SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT",
            "1 - Session Open / Close / Settlement entry" ),
    DELIVERY_SETTLEMENT( "2", "DELIVERY_SETTLEMENT",
            "2 - Delivery Settlement entry" ),
    EXPECTED( "3", "EXPECTED",
            "3 - Expected entry" ),
    PREVIOUS_BUSINESS_DAY( "4", "PREVIOUS_BUSINESS_DAY",
            "4 - Entry from previous business day" ),
    THEORETICAL_PRICE_VALUE( "5", "THEORETICAL_PRICE_VALUE",
            "5 - Theoretical Price value" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum286OpenCLoseSettlFlag(final String id, final String name, final String description) {
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
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            System.out.println(oneEnum);
        }
    }
}
