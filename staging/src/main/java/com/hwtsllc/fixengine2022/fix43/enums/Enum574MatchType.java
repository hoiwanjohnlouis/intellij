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

public enum Enum574MatchType implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 574
     */

    /*
     *  General Purpose
     *  60-65 types
     */
    GP_ONE_PARTY_REPORT( "60", "GP_ONE_PARTY_REPORT", "60 - One-Party Privately Negotiated Trade Report" ),
    GP_TWO_PARTY_REPORT( "61", "GP_TWO_PARTY_REPORT", "61 - Two-Party Privately Negotiated Trade Report" ),
    GP_AUTO_MATCH( "62", "GP_AUTO_MATCH", "62 - Continuous Auto-match" ),
    GP_CROSS_AUCTION( "63", "GP_CROSS_AUCTION", "63 - Cross Auction" ),
    GP_COUNTER_ORDER_SELECTION( "64", "GP_COUNTER_ORDER_SELECTION", "64 - Counter-Order Selection" ),
    GP_CALL_AUCTION( "65", "GP_CALL_AUCTION", "65 - Call Auction" ),


    /*
     *  NASDAQ
     *  M3-M6
     */
    M3( "M3", "M3", "M3 - ACT Accepted Trade" ),
    M4( "M4", "M4", "M4 - ACT Default Trade" ),
    M5( "M5", "M5", "M5 - ACT Default After M2" ),
    M6( "M6", "M6", "M6 - ACT M6 Match" ),


    /*
     *  NYSE and AMEX
     *  A1-A5, AQ, S1-S5 types
     */
    A1( "A1", "A1",
            "A1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator, plus four badges and execution time (within two-minute window)" ),
    A2( "A2", "A2",
            "A2 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator, plus four badges" ),
    A3( "A3", "A3",
            "A3 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator, plus two badges and execution time (within two-minute window)" ),
    A4( "A4", "A4",
            "A4 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator, plus two badges" ),
    A5( "A5", "A5",
            "A5 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator, plus execution time (within two-minute window)" ),

    AQ( "AQ", "AQ",
            "AQ - Compared records resulting from stamped advisories or specialist accepts/pair-offs" ),

    S1( "S1", "S1", "S1 - Summarized match using A1 exact match criteria except quantity is summarized" ),
    S2( "S2", "S2", "S2 - Summarized match using A2 exact match criteria except quantity is summarized" ),
    S3( "S3", "S3", "S3 - Summarized match using A3 exact match criteria except quantity is summarized" ),
    S4( "S4", "S4", "S4 - Summarized match using A4 exact match criteria except quantity is summarized" ),
    S5( "S5", "S5", "S5 - Summarized match using A5 exact match criteria except quantity is summarized" ),


    /*
     *  NYSE, AMEX, and NASDAQ
     *  M1-M2, MT types
     */
    M1( "M1", "M1",
            "M1 - Exact match on Trade Date, Stock Symbol, Quantity, Price, Trade Type, " +
                    "and Special Trade Indicator minus badges And times: ACT M1 match" ),
    M2( "M2", "M2",
            "M2 - Summarized match minus badges and times: ACT M2 Match" ),
    MT( "MT", "MT",
            "MT - OCS Locked In: Non-ACT" ),


    /*
     *  OMX Order Routing
     *  1-7 types
     */
    OMX_ONE_PARTY_REPORT( "1", "OMX_ONE_PARTY_REPORT",
            "1 - One-Party Trade Report (privately negotiated trade)" ),
    OMX_TWO_PARTY_REPORT( "2", "OMX_TWO_PARTY_REPORT",
            "2 - Two-Party Trade Report (privately negotiated trade)" ),
    OMX_CONFIRMED_REPORT( "3", "OMX_CONFIRMED_REPORT",
            "3 - Confirmed Trade Report (reporting from recognized markets)" ),
    OMX_AUTO_MATCH( "4", "OMX_AUTO_MATCH",
            "4 - Auto-match" ),
    OMX_CROSS_AUCTION( "5", "OMX_CROSS_AUCTION",
            "5 - Cross Auction" ),
    OMX_COUNTER_ORDER_SELECTION( "6", "OMX_COUNTER_ORDER_SELECTION",
            "6 - Counter-Order Selection" ),
    OMX_CALL_AUCTION( "7", "OMX_CALL_AUCTION",
            "7 - Call Auction" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum574MatchType(final String id, final String name, final String description) {
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
        for (Enum574MatchType oneEnum : Enum574MatchType.values()) {
            System.out.println(oneEnum);
        }
    }
}