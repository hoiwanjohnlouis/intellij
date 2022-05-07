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
 *  896
 *  CollInquiryQualifier
 *  int
 *  Collateral inquiry qualifiers:
 *  Valid values:
 *      0 - Trade Date
 *      1 - GC Instrument
 *      2 - Collateral Instrument
 *      3 - Substitution Eligible
 *      4 - Not Assigned
 *      5 - Partially Assigned
 *      6 - Fully Assigned
 *      7 - Outstanding Trades (Today < end date)
 */
public enum Enum896CollInquiryQualifier implements EnumAccessors, LogStringVerbose {
    TRADE_DATE( "0", "TRADE_DATE", "0 - Trade Date" ),
    GC_INSTRUMENT( "1", "GC_INSTRUMENT", "1 - GC Instrument" ),
    COLLATERAL_INSTRUMENT( "2", "COLLATERAL_INSTRUMENT", "2 - Collateral Instrument" ),
    SUBSTITUTION_ELIGIBLE( "3", "SUBSTITUTION_ELIGIBLE", "3 - Substitution Eligible" ),
    NOT_ASSIGNED( "4", "NOT_ASSIGNED", "4 - Not Assigned" ),

    PARTIALLY_ASSIGNED( "5", "PARTIALLY_ASSIGNED", "5 - Partially Assigned" ),
    FULLY_ASSIGNED( "6", "FULLY_ASSIGNED", "6 - Fully Assigned" ),
    OUTSTANDING_TRADES( "7", "OUTSTANDING_TRADES", "7 - Outstanding Trades (Today < end date)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum896CollInquiryQualifier(final String id, final String name, final String description) {
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
        for (Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            System.out.println(oneEnum);
        }
    }
}
