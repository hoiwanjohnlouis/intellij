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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 * Enum4AdvSide enum defines all the possible values for AdvSide (FIX) fields.
 * It consists of 3 fields.
 *
 * String sideAction           type of transaction for field as defined by the FIX protocol document, no duplicates
 * String sideName             short name of transaction for as defined by the FIX protocol document, no duplicates
 * String sideDescription      describes what the action entails
 */
public enum Enum54Side implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 54, 624
     */

    /*
     * 1-9 type
     */
    BUY ("1", "BUY", "1 - Buy"),
    SELL ("2", "SELL", "2 - Sell"),
    BUY_MINUS ("3", "BUY_MINUS", "3 - Buy minus"),
    SELL_PLUS ("4", "SELL_PLUS", "4 - Sell plus"),
    SELL_SHORT ("5", "SELL_SHORT", "5 - Sell short"),
    SELL_SHORT_EXEMPT ("6", "SELL_SHORT_EXEMPT", "6 - Sell short exempt"),
    UNDISCLOSED ("7", "UNDISCLOSED",
            "7 - Undisclosed (valid for IOI and List Order messages only)"),
    CROSS ("8", "CROSS",
            "8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)"),
    CROSS_SHORT ("9", "CROSS_SHORT", "9 - Cross short"),

    /*
     * A-G type
     */
    CROSS_SHORT_EXEMPT ("A", "CROSS_SHORT_EXEMPT", "A - Cross short exempt"),
    AS_DEFINED ("B", "AS_DEFINED", "B - As Defined (for use with multileg instruments)"),
    OPPOSITE ("C", "OPPOSITE", "C - Opposite (for use with multileg instruments)"),
    SUBSCRIBE ("D", "SUBSCRIBE", "D - Subscribe (e.g. CIV)"),
    REDEEM ("E", "REDEEM", "E - Redeem (e.g. CIV)"),
    LEND_FINANCING ("F", "LEND_FINANCING",
            "F - Lend (FINANCING - identifies direction of collateral)"),
    BORROW_FINANCING ("G", "BORROW_FINANCING",
            "G - Borrow (FINANCING - identifies direction of collateral)"),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum54Side(final String id, final String name, final String description) {
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
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum54Side oneEnum : Enum54Side.values()) {
            System.out.println(oneEnum);
        }
    }
}
