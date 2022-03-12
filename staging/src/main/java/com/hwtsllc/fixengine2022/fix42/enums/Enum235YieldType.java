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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum235YieldType {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum235YieldType(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum235YieldType.AFTERTAX);
        System.out.println(Enum235YieldType.ANNUAL);
        System.out.println(Enum235YieldType.ATISSUE);
        System.out.println(Enum235YieldType.AVGMATURITY);
        System.out.println(Enum235YieldType.BOOK);

        System.out.println(Enum235YieldType.CALL);
        System.out.println(Enum235YieldType.CHANGE);
        System.out.println(Enum235YieldType.CLOSE);
        System.out.println(Enum235YieldType.COMPOUND);
        System.out.println(Enum235YieldType.CURRENT);

        System.out.println(Enum235YieldType.GOVTEQUIV);
        System.out.println(Enum235YieldType.GROSS);
        System.out.println(Enum235YieldType.INFLATION);
        System.out.println(Enum235YieldType.INVERSEFLOATER);
        System.out.println(Enum235YieldType.LASTCLOSE);

        System.out.println(Enum235YieldType.LASTMONTH);
        System.out.println(Enum235YieldType.LASTQUARTER);
        System.out.println(Enum235YieldType.LASTYEAR);
        System.out.println(Enum235YieldType.LONGAVGLIFE);
        System.out.println(Enum235YieldType.MARK);

        System.out.println(Enum235YieldType.MATURITY);
        System.out.println(Enum235YieldType.NEXTREFUND);
        System.out.println(Enum235YieldType.OPENAVG);
        System.out.println(Enum235YieldType.PREVCLOSE);
        System.out.println(Enum235YieldType.PROCEEDS);

        System.out.println(Enum235YieldType.PUT);
        System.out.println(Enum235YieldType.SEMIANNUAL);
        System.out.println(Enum235YieldType.SHORTAVGLIFE);
        System.out.println(Enum235YieldType.SIMPLE);
        System.out.println(Enum235YieldType.TAXEQUIV);

        System.out.println(Enum235YieldType.TENDER);
        System.out.println(Enum235YieldType.TRUE);
        System.out.println(Enum235YieldType.VALUE1_32);
        System.out.println(Enum235YieldType.WORST);
    }
}
