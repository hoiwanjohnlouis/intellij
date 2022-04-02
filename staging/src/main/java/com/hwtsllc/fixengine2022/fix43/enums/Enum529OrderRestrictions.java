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

public enum Enum529OrderRestrictions implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 529
     */

    /*
     *  1-9, types
     */
    PROGRAM_TRADE( "1", "PROGRAM_TRADE",
            "1 - Program Trade" ),
    INDEX_ARBITRAGE( "2", "INDEX_ARBITRAGE",
            "2 - Index Arbitrage" ),
    NON_INDEX_ARBITRAGE( "3", "NON_INDEX_ARBITRAGE",
            "3 - Non-Index Arbitrage" ),
    COMPETING_MARKET_MAKER( "4", "COMPETING_MARKET_MAKER",
            "4 - Competing Market Maker" ),
    SPECIALIST_IN_SECURITY( "5", "SPECIALIST_IN_SECURITY",
            "5 - Acting as Market Maker or Specialist in the security" ),
    SPECIALIST_IN_UNDERLYING_SECURITY( "6", "SPECIALIST_IN_UNDERLYING_SECURITY",
            "6 - Acting as Market Maker of Specialist in the underlying security of a derivative security" ),
    FOREIGN_ENTITY( "7", "FOREIGN_ENTITY",
            "7 - Foreign Entity (of foreign government or regulatory jurisdiction)" ),
    EXTERNAL_MARKET_PARTICIPANT( "8", "EXTERNAL_MARKET_PARTICIPANT",
            "8 - External Market Participant" ),
    EXTERNAL_INTER_CONNECTED( "9", "EXTERNAL_INTER_CONNECTED",
            "9 - External Inter-connected Market Linkage" ),


    /*
     *  A type
     */
    RISKLESS_ARBITRAGE( "A", "RISKLESS_ARBITRAGE",
            "A - Riskless Arbitrage" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum529OrderRestrictions(final String id, final String name, final String description) {
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
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            System.out.println(oneEnum);
        }
    }
}
