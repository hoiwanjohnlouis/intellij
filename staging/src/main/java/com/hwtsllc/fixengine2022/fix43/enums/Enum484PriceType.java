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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  484
 *  ExecPriceType
 *  char
 *  <p></p>
 *  For CIV - Identifies how the execution price LastPx (31)
 *  was calculated from the fund unit/share price(s) calculated
 *  at the fund valuation point.
 *  <p></p>
 *  Valid values:
 *  <p>    B - Bid price
 *  <p>    C - Creation price
 *  <p>    D - Creation price plus adjustment percent
 *  <p>    E - Creation price plus adjustment amount
 *  <p>    O - Offer price
 *  <p></p>
 *  <p>    P - Offer price minus adjustment percent
 *  <p>    Q - Offer price minus adjustment amount
 *  <p>    S - Single price
 */
public enum Enum484PriceType implements LogFIXString, LogVerboseString {
    /*
     * B, C, D, E, O, P, Q, and S types
     */
    BID_PRICE("B", "BID_PRICE", "B - Bid price" ),
    CREATION_PRICE("C", "CREATION_PRICE", "C - Creation price" ),
    CREATION_PRICE_PLUS_PERCENT("D", "CREATION_PRICE_PLUS_PERCENT", "D - Creation price plus adjustment percent" ),
    CREATION_PRICE_PLUS_AMOUNT("E", "CREATION_PRICE_PLUS_AMOUNT", "E - Creation price plus adjustment amount" ),
    OFFER_PRICE("O", "OFFER_PRICE", "O - Offer price" ),

    OFFER_PRICE_MINUS_PERCENT("P", "OFFER_PRICE_MINUS_PERCENT", "P - Offer price minus adjustment percent" ),
    OFFER_PRICE_MINUS_AMOUNT("Q", "OFFER_PRICE_MINUS_AMOUNT", "Q - Offer price minus adjustment amount" ),
    SINGLE_PRICE("S", "SINGLE_PRICE", "S - Single price" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum484PriceType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
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
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
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
         * dump all the enum values for review
         */
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}