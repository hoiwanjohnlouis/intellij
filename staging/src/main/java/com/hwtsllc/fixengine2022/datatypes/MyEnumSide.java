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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  <p>
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  624 (same as 54, 624,)
 *  LegSide
 *  char
 *  <p>
 *  The side of this individual leg (multileg security).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Buy
 *  <p>    2 - Sell
 *  <p>    3 - Buy minus
 *  <p>    4 - Sell plus
 *  <p>    5 - Sell short
 *  <p></p>
 *  <p>    6 - Sell short exempt
 *  <p>    7 - Undisclosed (valid for IOI and List Order messages only)
 *  <p>    8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *  <p>    9 - Cross short
 *  <p></p>
 *  <p>    A - Cross short exxmpt
 *  <p>    B - "As Defined" (for use with multileg instruments)
 *  <p>    C - "Opposite" (for use with multileg instruments)
 *  <p>    D - Subscribe (e.g. CIV)
 *  <p>    E - Redeem (e.g. CIV)
 *  <p></p>
 *  <p>    F - Lend (FINANCING - identifies direction of collateral)
 *  <p>    G - Borrow (FINANCING - identifies direction of collateral)
 */
public enum MyEnumSide implements LogFIXString, LogVerboseString {
    /*
     *  MyEnumSide enum defines all the possible values for Side (FIX) fields.
     *  It consists of 3 fields.
     *
     *  String sideAction           type of transaction for field as defined by the FIX protocol document, no duplicates
     *  String sideName             short name of transaction for as defined by the FIX protocol document, no duplicates
     *  String sideDescription      describes what the action entails
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

    MyEnumSide(final String id, final String name, final String description) {
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
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            System.out.println(oneEnum);
        }
    }
}
