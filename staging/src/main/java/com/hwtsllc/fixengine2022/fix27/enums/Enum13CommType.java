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

package com.hwtsllc.fixengine2022.fix27.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum13CommType {
    PER_UNIT ("1", "PER_UNIT", "Per Unit (implying shares, par, currency, etc.)"),
    PERCENT ("2", "PERCENT", "Percent"),
    ABSOLUTE ("3", "ABSOLUTE", "Absolute (total monetary amount)"),
    PERCENTAGE_WAIVED_CASH_DISCOUNT ("4", "PERCENTAGE_WAIVED_CASH_DISCOUNT", "Percent waived cash discount (for CIV buy orders)"),
    PERCENTAGE_WAIVED_ENHANCED_UNITS ("5", "PERCENTAGE_WAIVED_ENHANCED_UNITS", "Percent waived enhanced units (for CIV buy orders)"),
    POINTS_PER_BOND ("6", "POINTS_PER_BOND", "Points per bond or contract"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum13CommType(final String action, final String name, final String description) {
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
        System.out.println(Enum13CommType.PER_UNIT);
        System.out.println(Enum13CommType.PERCENT);
        System.out.println(Enum13CommType.ABSOLUTE);
        System.out.println(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        System.out.println(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        System.out.println(Enum13CommType.POINTS_PER_BOND);
    }
}
