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

package com.hwtsllc.fix.datatypes;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  838 (same as 838, 844,)
 *  PegRoundDirection
 *  int
 *  <p>
 *  If the calculated peg price is not a valid tick price, specifies
 *  whether to round the price to be more or less aggressive
 *  <p></p>
 *  844
 *  DiscretionRoundDirection
 *  int
 *  <p>
 *  If the calculated discretionary price is not a valid tick price,
 *  specifies whether to round the price to be more or less aggressive
 *  <p></p>
 *  Valid values:
 *  <p>    1 - More aggressive - on a buy order round the price up to the nearest tick;
 *                  on a sell order round down to the nearest tick
 *  <p>    2 - More passive - on a buy order round down to the nearest tick;
 *                  on a sell order round up to the nearest tick
 */
public enum MyEnumRoundDirection implements LogFIXString, LogVerboseString {
    AGGRESSIVE( "1", "AGGRESSIVE", "1 - More aggressive - on a buy order round the price up to the nearest tick; on a sell order round down to the nearest tick" ),
    PASSIVE( "2", "PASSIVE", "2 - More passive - on a buy order round down to the nearest tick; on a sell order round up to the nearest tick" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumRoundDirection(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
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
        for (MyEnumRoundDirection oneEnum : MyEnumRoundDirection.values()) {
            System.out.println(oneEnum);
        }
    }
}
