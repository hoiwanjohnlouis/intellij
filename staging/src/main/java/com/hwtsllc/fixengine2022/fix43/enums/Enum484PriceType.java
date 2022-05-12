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
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Information is the same for TAGS 484
 */
public enum Enum484PriceType implements EnumAccessors, LogVerboseString {
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
    public String toVerboseString() {
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
        for (Enum484PriceType oneEnum : Enum484PriceType.values()) {
            System.out.println(oneEnum);
        }
    }
}