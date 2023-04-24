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

package com.hwtsllc.fixengine.enums.fix43;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  635
 *  ClearingFeeIndicator
 *  String
 *  <p></p>
 *  Indicates type of fee being assessed of the customer
 *  for trade executions at an exchange.
 *  <p></p>
 *  Applicable for futures markets only at this time.
 *  <p></p>
 *  (Values source CBOT, CME, NYBOT, and NYMEX):
 *  Valid values:
 *  <p>    1 - 1st year delegate trading for own account
 *  <p>    2 - 2nd year delegate trading for own account
 *  <p>    3 - 3rd year delegate trading for own account
 *  <p>    4 - 4th year delegate trading for own account
 *  <p>    5 - 5th year delegate trading for own account
 *  <p></p>
 *  <p>    9 - 6th year delegate trading for own account
 *  <p>    B - CBOE Member
 *  <p>    C - Non-member and Customer
 *  <p>    E - Equity Member and Clearing Member
 *  <p>    F - Full and Associate Member trading for own account and as floor brokers
 *  <p></p>
 *  <p>    H - 106.H and 106.J firms
 *  <p>    I - GIM, IDEM and COM Membership Interest Holders
 *  <p>    L - Lessee 106.F Employees
 *  <p>    M - All other ownership types
 */
public enum Enum635ClearingFeeIndicator implements LogFIXString, LogVerboseString {
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
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}