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

public enum Enum219Benchmark {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum219Benchmark(final String action, final String name, final String description) {
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
        System.out.println(Enum219Benchmark.CURVE);
        System.out.println(Enum219Benchmark.FIVE_YEAR);
        System.out.println(Enum219Benchmark.OLD_FIVE_YEAR);
        System.out.println(Enum219Benchmark.TEN_YEAR);
        System.out.println(Enum219Benchmark.OLD_TEN_YEAR);

        System.out.println(Enum219Benchmark.THIRTY_YEAR);
        System.out.println(Enum219Benchmark.OLD_THIRTY_YEAR);
        System.out.println(Enum219Benchmark.THREE_MONTH);
        System.out.println(Enum219Benchmark.SIX_MONTH);
    }
}
