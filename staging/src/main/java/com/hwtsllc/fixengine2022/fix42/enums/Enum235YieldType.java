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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum235YieldType implements EnumAccessors, LogStringVerbose {
    /*
     * various msg types
     */
    AFTERTAX( "AFTERTAX", "AFTERTAX", "AFTERTAX - After Tax Yield (Municipals)" ),
    ANNUAL( "ANNUAL", "ANNUAL", "ANNUAL - Annual Yield" ),
    ATISSUE( "ATISSUE", "ATISSUE", "ATISSUE - Yield At Issue (Municipals)" ),
    AVGMATURITY( "AVGMATURITY", "AVGMATURITY", "AVGMATURITY - Yield To Avg Maturity" ),
    BOOK( "BOOK", "BOOK", "BOOK - Book Yield" ),
    CALL( "CALL", "CALL", "CALL - Yield to Next Call" ),
    CHANGE( "CHANGE", "CHANGE", "CHANGE - Yield Change Since Close" ),
    CLOSE( "CLOSE", "CLOSE", "CLOSE - Closing Yield" ),
    COMPOUND( "COMPOUND", "COMPOUND", "COMPOUND - Compound Yield" ),
    CURRENT( "CURRENT", "CURRENT", "CURRENT - Current Yield" ),
    GOVTEQUIV( "GOVTEQUIV", "GOVTEQUIV", "GOVTEQUIV - Gvnt Equivalent Yield" ),
    GROSS( "GROSS", "GROSS", "GROSS - True Gross Yield" ),
    INFLATION( "INFLATION", "INFLATION", "INFLATION - Yield with Inflation Assumption" ),
    INVERSEFLOATER( "INVERSEFLOATER", "INVERSEFLOATER", "INVERSEFLOATER - Inverse Floater Bond Yield" ),
    LASTCLOSE( "LASTCLOSE", "LASTCLOSE", "LASTCLOSE - Most Recent Closing Yield" ),
    LASTMONTH( "LASTMONTH", "LASTMONTH", "LASTMONTH - Closing Yield Most Recent Month" ),
    LASTQUARTER( "LASTQUARTER", "LASTQUARTER", "LASTQUARTER - Closing Yield Most Recent Quarter" ),
    LASTYEAR( "LASTYEAR", "LASTYEAR", "LASTYEAR - Closing Yield Most Recent Year" ),
    LONGAVGLIFE( "LONGAVGLIFE", "LONGAVGLIFE", "LONGAVGLIFE - Yield to Longest Average Life" ),
    MARK( "MARK", "MARK", "MARK - Mark to Market Yield" ),
    MATURITY( "MATURITY", "MATURITY", "MATURITY - Yield to Maturity" ),
    NEXTREFUND( "NEXTREFUND", "NEXTREFUND", "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)" ),
    OPENAVG( "OPENAVG", "OPENAVG", "OPENAVG - Open Average Yield" ),
    PREVCLOSE( "PREVCLOSE", "PREVCLOSE", "PREVCLOSE - Previous Close Yield" ),
    PROCEEDS( "PROCEEDS", "PROCEEDS", "PROCEEDS - Proceeds Yield" ),
    PUT( "PUT", "PUT", "PUT - Yield to Next Put" ),
    SEMIANNUAL( "SEMIANNUAL", "SEMIANNUAL", "SEMIANNUAL - Semi-annual Yield" ),
    SHORTAVGLIFE( "SHORTAVGLIFE", "SHORTAVGLIFE", "SHORTAVGLIFE - Yield to Shortest Average Life" ),
    SIMPLE( "SIMPLE", "SIMPLE", "SIMPLE - Simple Yield" ),
    TAXEQUIV( "TAXEQUIV", "TAXEQUIV", "TAXEQUIV - Tax Equivalent Yield" ),
    TENDER( "TENDER", "TENDER", "TENDER - Yield to Tender Date" ),
    TRUE( "TRUE", "TRUE", "TRUE - True Yield" ),
    VALUE1_32( "VALUE1_32", "VALUE1_32", "VALUE1_32 - Yield Value Of 1/32" ),
    WORST( "WORST", "WORST", "WORST - Yield To Worst" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum235YieldType(final String id, final String name, final String description) {
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
        for (Enum235YieldType oneEnum : Enum235YieldType.values()) {
            System.out.println(oneEnum);
        }
    }
}