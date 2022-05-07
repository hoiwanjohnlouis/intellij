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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  221 (same as 221, 677)
 *  BenchmarkCurveName
 *  Name of the Benchmark Curve.
 *  677 (same as 221, 677)
 *  LegBenchmarkCurveName
 *  Name of the Leg Benchmark Curve.
 *          See BenchmarkCurveName (221) for description and valid values.
 *  Valid values:
 *      EONIA - EONIA
 *      EUREPO - EUREPO
 *      Euribor - Euribor
 *      FutureSWAP - FutureSWAP
 *      LIBID - LIBID
 *      LIBOR - LIBOR (London Inter-Bank Offer)
 *      MuniAAA - MuniAAA
 *      OTHER - OTHER
 *      Pfandbriefe - Pfandbriefe
 *      SONIA - SONIA
 *      SWAP - SWAP
 *      Treasury - Treasury
 */
public enum MyEnumBenchmarkCurveName implements EnumAccessors, LogStringVerbose {
    /**
     * various msg types
     */
    EONIA( "EONIA", "EONIA", "EONIA - EONIA" ),
    EUREPO( "EUREPO", "EUREPO", "EUREPO - EUREPO" ),
    EURIBOR( "Euribor", "EURIBOR", "Euribor - Euribor" ),
    FUTURESWAP( "FutureSWAP", "FUTURESWAP", "FutureSWAP - FutureSWAP" ),
    LIBID( "LIBID", "LIBID", "LIBID - LIBID" ),
    LIBOR( "LIBOR", "LIBOR", "LIBOR - LIBOR (London Inter-Bank Offer)" ),
    MUNIAAA( "MuniAAA", "MUNIAAA", "MuniAAA - MuniAAA" ),
    OTHER( "OTHER", "OTHER", "OTHER - OTHER" ),
    PFANDBRIEFE( "Pfandbriefe", "PFANDBRIEFE", "Pfandbriefe - Pfandbriefe" ),
    SONIA( "SONIA", "SONIA", "SONIA - SONIA" ),
    SWAP( "SWAP", "SWAP", "SWAP - SWAP" ),
    TREASURY( "Treasury", "TREASURY", "Treasury - Treasury" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumBenchmarkCurveName(final String id, final String name, final String description) {
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
        for (MyEnumBenchmarkCurveName oneEnum : MyEnumBenchmarkCurveName.values()) {
            System.out.println(oneEnum);
        }
    }
}
