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
 *  826
 *  TradeAllocIndicator
 *  int
 *  <p></p>
 *  Identifies how the trade is to be allocated
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Allocation not required
 *  <p>    1 - Allocation required (give-up trade) allocation information not
 *          provided (incomplete)
 *  <p>    2 - Use allocation provided with the trade
 *  <p>    3 - Allocation give-up executor
 *  <p>    4 - Allocation from executor
 *  <p></p>
 *  <p>    5 - Allocation to claim account
 */
public enum Enum826TradeAllocIndicator implements LogFIXString, LogVerboseString {
    NOT_REQUIRED( "0", "NOT_REQUIRED", "0 - Allocation not required" ),
    REQUIRED( "1", "REQUIRED", "1 - Allocation required (give-up trade) allocation information not provided (incomplete)" ),
    USE_PROVIDED_INFO( "2", "USE_PROVIDED_INFO", "2 - Use allocation provided with the trade" ),
    GIVE_UP_EXECUTOR( "3", "GIVE_UP_EXECUTOR", "3 - Allocation give-up executor" ),
    FROM_EXECUTOR( "4", "FROM_EXECUTOR", "4 - Allocation from executor" ),

    CLAIM_ACCOUNT( "5", "CLAIM_ACCOUNT", "5 - Allocation to claim account" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum826TradeAllocIndicator(final String id, final String name, final String description) {
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
    public String toFIXNameString() {
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
                .concat( toFIXNameString())
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
        for (Enum826TradeAllocIndicator oneEnum : Enum826TradeAllocIndicator.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
