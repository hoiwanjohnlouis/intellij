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
 *  529
 *  OrderRestrictions
 *  MultipleCharValue
 *  <p></p>
 *  Restrictions associated with an order.
 *  <p>
 *  If more than one restriction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Program Trade
 *  <p>    2 - Index Arbitrage
 *  <p>    3 - Non-Index Arbitrage
 *  <p>    4 - Competing Market Maker
 *  <p>    5 - Acting as Market Maker or Specialist in the security
 *  <p></p>
 *  <p>    6 - Acting as Market Maker of Specialist in the
 *              underlying security of a derivative security
 *  <p>    7 - Foreign Entity (of foreign government or regulatory jurisdiction)
 *  <p>    8 - External Market Participant
 *  <p>    9 - External Inter-connected Market Linkage
 *  <p>    A - Riskless Arbitrage
 */
public enum Enum529OrderRestrictions implements LogFIXString, LogVerboseString {
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
    public String toFIXLabelString() {
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
                .concat( toFIXLabelString())
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
         * dump all the enum values
         */
        for (Enum529OrderRestrictions oneEnum : Enum529OrderRestrictions.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}