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
 *  465
 *  QuantityType
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.4
 *  <p></p>
 *  Designates the type of quantities (e.g. OrderQty) specified.
 *  <p>
 *  Used for MBS and TIPS Fixed Income security types.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - SHARES
 *  <p>    2 - BONDS
 *  <p>    3 - CURRENTFACE
 *  <p>    4 - ORIGINALFACE
 *  <p>    5 - CURRENCY
 *  <p></p>
 *  <p>    6 - CONTRACTS
 *  <p>    7 - OTHER
 *  <p>    8 - PAR
 */
public enum Enum465QuantityType implements LogFIXString, LogVerboseString {
    /*
     * 1-8 types
     */
    SHARES("1", "SHARES", "1 - SHARES" ),
    BONDS("2", "BONDS", "2 - BONDS" ),
    CURRENT_FACE("3", "CURRENTFACE", "3 - CURRENTFACE" ),
    ORIGINAL_FACE("4", "ORIGINALFACE", "4 - ORIGINALFACE" ),
    CURRENCY("5", "CURRENCY", "5 - CURRENCY" ),

    CONTRACTS("6", "CONTRACTS", "6 - CONTRACTS" ),
    OTHER("7", "OTHER", "7 - OTHER" ),
    PAR("8", "PAR", "8 - PAR" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum465QuantityType(final String id, final String name, final String description) {
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
        return toEnumLabelString()
                .concat("=[")
                .concat( toEnumIDString())
                .concat(",")
                .concat( toEnumNameString())
                .concat(",")
                .concat( toEnumDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (Enum465QuantityType oneEnum : Enum465QuantityType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}