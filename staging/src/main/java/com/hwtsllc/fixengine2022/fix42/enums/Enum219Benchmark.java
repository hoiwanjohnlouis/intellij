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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  219
 *  EnuBenchmarkTest
 *  char
 *  <p>
 *  Deprecated in FIX.4.2 For Fixed Income.
 *  <p>
 *  Identifies the benchmark (e.g. used in conjunction with the Spread field).
 *  <p></p>
 *  Valid values:
 *  <p>    "1 - CURVE"
 *  <p>    "2 - 5YR"
 *  <p>    "3 - OLD5"
 *  <p>    "4 - 10YR"
 *  <p>    "5 - OLD10"
 *  <p></p>
 *  <p>    "6 - 30YR"
 *  <p>    "7 - OLD30"
 *  <p>    "8 - 3MOLIBOR"
 *  <p>    "9 - 6MOLIBOR"
 */
public enum Enum219Benchmark implements LogFIXString, LogVerboseString {
    /**
     * 1-9 msg types
     */
    CURVE( "1", "CURVE", "1 - CURVE" ),
    FIVE_YEAR( "2", "5YR", "2 - 5YR" ),
    OLD_FIVE_YEAR( "3", "OLD5", "3 - OLD5" ),
    TEN_YEAR( "4", "10YR", "4 - 10YR" ),
    OLD_TEN_YEAR( "5", "OLD10", "5 - OLD10" ),
    THIRTY_YEAR( "6", "30YR", "6 - 30YR" ),
    OLD_THIRTY_YEAR( "7", "OLD30", "7 - OLD30" ),
    THREE_MONTH( "8", "3MOLIBOR", "8 - 3MOLIBOR" ),
    SIX_MONTH( "9", "6MOLIBOR", "9 - 6MOLIBOR" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum219Benchmark(final String id, final String name, final String description) {
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
        for (Enum219Benchmark oneEnum : Enum219Benchmark.values()) {
            System.out.println(oneEnum);
        }
    }
}
