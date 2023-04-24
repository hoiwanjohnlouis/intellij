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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  847
 *  TargetStrategy
 *  int
 *  <p></p>
 *  The target strategy of the order
 *  <p></p>
 *  1000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  <p></p>
 *  Valid values:
 *  <p>    1 - VWAP
 *  <p>    2 - Participate (i.e. aim to be x percent of the market volume)
 *  <p>    3 - Minimize market impact
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public enum Enum847TargetStrategy implements LogFIXString, LogVerboseString {
    VWAP( "1", "VWAP", "1 - VWAP" ),
    PARTICIPATE( "2", "PARTICIPATE", "2 - Participate (i.e. aim to be x percent of the market volume)" ),
    MINIMIZE_MARKET_IMPACT( "3", "MINIMIZE_MARKET_IMPACT", "3 - Minimize market impact" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum847TargetStrategy(final String id, final String name, final String description) {
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
        for (Enum847TargetStrategy oneEnum : Enum847TargetStrategy.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
