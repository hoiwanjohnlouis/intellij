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
 *  550
 *  CrossPrioritization
 *  int
 *  <p></p>
 *  Indicates if one side or the other of a cross order should be prioritized.
 *  <p></p>
 *  The definition of prioritization is left to the market.
 *  <p></p>
 *  In some markets, - prioritization means which side of the cross order is applied to the market first.
 *  <p></p>
 *  In other markets, - prioritization may mean that the prioritized side is fully executed
 *  (sometimes referred to as the side being protected).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None
 *  <p>    1 - Buy side is prioritized
 *  <p>    2 - Sell side is prioritized
 */
public enum Enum550CrossPrioritization implements LogFIXString, LogVerboseString {
    /*
     *  0-2 types
     */
    NONE( "0", "NONE", "0 - None" ),
    BUY_PRIORITY( "1", "BUY_PRIORITY", "1 - Buy side is prioritized" ),
    SELL_PRIORITY( "2", "SELL_PRIORITY", "2 - Sell side is prioritized" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum550CrossPrioritization(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
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
         * dump all the enum values
         */
        for (Enum550CrossPrioritization oneEnum : Enum550CrossPrioritization.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}