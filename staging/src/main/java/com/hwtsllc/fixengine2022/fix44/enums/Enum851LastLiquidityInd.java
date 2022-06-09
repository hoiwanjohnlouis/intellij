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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  <p></p>
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  <p></p>
 *  Applicable only for OrdStatus of Partial or Filled.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Added Liquidity
 *  <p>    2 - Removed Liquidity
 *  <p>    3 - Liquidity Routed Out
 */
public enum Enum851LastLiquidityInd implements LogFIXString, LogVerboseString {
    ADDED( "1", "ADDED", "1 - Added Liquidity" ),
    REMOVED( "2", "REMOVED", "2 - Removed Liquidity" ),
    ROUTED_OUT( "3", "ROUTED_OUT", "3 - Liquidity Routed Out" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum851LastLiquidityInd(final String id, final String name, final String description) {
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
         * dump all the enum values
         */
        for (Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
