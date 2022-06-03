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
 *  468
 *  RoundingDirection
 *  char
 *  <p></p>
 *  Specifies which direction to round
 *  <p>
 *  For CIV – indicates whether or not the quantity of shares/units
 *  is to be rounded and in which direction where CashOrdQty (152)
 *  <p>
 *  or (for CIV only) OrderPercent (516) are specified on an order.
 *  <p></p>
 *  The default is for rounding to be at the discretion of
 *  the executing broker or fund manager.
 *  <p>
 *  <p>e.g. for an order specifying CashOrdQty or OrderPercent
 *  <p>if the calculated number of shares/units was 325.76 and RoundingModulus (469) was
 *  <p>0 - "round down" would give 320 units,
 *  <p>1 - "round up" would give 330 units and "round to nearest" would give 320 units.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Round to nearest
 *  <p>    1 - Round down
 *  <p>    2 - Round up
 */
public enum Enum468RoundingDirection implements LogFIXString, LogVerboseString {
    /*
     * 0-2 types
     */
    ROUND_TO_NEAREST("0", "ROUND_TO_NEAREST", "0 - Round to nearest" ),
    ROUND_DOWN("1", "ROUND_DOWN", "1 - Round down" ),
    ROUND_UP("2", "ROUND_UP", "2 - Round up" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum468RoundingDirection(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
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
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (Enum468RoundingDirection oneEnum : Enum468RoundingDirection.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}