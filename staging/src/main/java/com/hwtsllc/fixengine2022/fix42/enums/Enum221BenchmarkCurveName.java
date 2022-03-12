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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum221BenchmarkCurveName {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum221BenchmarkCurveName(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum221BenchmarkCurveName.EONIA);
        System.out.println(Enum221BenchmarkCurveName.EUREPO);
        System.out.println(Enum221BenchmarkCurveName.EURIBOR);
        System.out.println(Enum221BenchmarkCurveName.FUTURESWAP);
        System.out.println(Enum221BenchmarkCurveName.LIBID);

        System.out.println(Enum221BenchmarkCurveName.LIBOR);
        System.out.println(Enum221BenchmarkCurveName.MUNIAAA);
        System.out.println(Enum221BenchmarkCurveName.OTHER);
        System.out.println(Enum221BenchmarkCurveName.PFANDBRIEFE);
        System.out.println(Enum221BenchmarkCurveName.SONIA);

        System.out.println(Enum221BenchmarkCurveName.SWAP);
        System.out.println(Enum221BenchmarkCurveName.TREASURY);
    }
}
