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

public enum Enum635ClearingFeeIndicator implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 635
     */

    /*
     *  1-5, types
     */
    FIRST_YEAR_DELEGATE( "1", "FIRST_YEAR_DELEGATE", "1 - 1st year delegate trading for own account" ),
    SECOND_YEAR_DELEGATE( "2", "SECOND_YEAR_DELEGATE", "2 - 2nd year delegate trading for own account" ),
    THIRD_YEAR_DELEGATE( "3", "THIRD_YEAR_DELEGATE", "3 - 3rd year delegate trading for own account" ),
    FOURTH_YEAR_DELEGATE( "4", "FOURTH_YEAR_DELEGATE", "4 - 4th year delegate trading for own account" ),
    FIFTH_YEAR_DELEGATE( "5", "FIFTH_YEAR_DELEGATE", "5 - 5th year delegate trading for own account" ),


    /*
     *  9, types
     */
    SIXTH_YEAR_DELEGATE( "9", "SIXTH_YEAR_DELEGATE", "9 - 6th year delegate trading for own account" ),


    /*
     *  B-C, types
     */
    CBOE_MEMBER( "B", "CBOE_MEMBER", "B - CBOE Member" ),
    NON_MEMBER_AND_CUSTOMER( "C", "NON_MEMBER_AND_CUSTOMER", "C - Non-member and Customer" ),


    /*
     *  E-F, types
     */
    EQUITY_AND_CLEARING_MEMBER( "E", "EQUITY_AND_CLEARING_MEMBER", "E - Equity Member and Clearing Member" ),
    FULL_AND_ASSOCIATE_AS_FLOOR( "F", "FULL_AND_ASSOCIATE_AS_FLOOR",
            "F - Full and Associate Member trading for own account and as floor brokers" ),


    /*
     *  H-I, types
     */
    H_AND_J_FIRMS( "H", "H_AND_J_FIRMS", "H - 106.H and 106.J firms" ),
    GIM_IDEM_AND_COM( "I", "GIM_IDEM_AND_COM", "I - GIM, IDEM and COM Membership Interest Holders" ),


    /*
     *  L-M, types
     */
    F_EMPLOYEES( "L", "F_EMPLOYEES", "L - Lessee 106.F Employees" ),
    ALL_OTHER( "M", "ALL_OTHER", "M - All other ownership types" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum635ClearingFeeIndicator(final String id, final String name, final String description) {
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
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            System.out.println(oneEnum);
        }
    }
}
