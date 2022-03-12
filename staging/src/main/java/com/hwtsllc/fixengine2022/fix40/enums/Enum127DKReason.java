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

package com.hwtsllc.fixengine2022.fix40.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum127DKReason {
    UNKNOWN_SYMBOL("A", "UNKNOWN_SYMBOL", "A - Unknown Symbol"),
    WRONG_SIDE("B", "WRONG_SIDE", "B - Wrong Side"),
    QUANTITY_EXCEEDS_ORDER("C", "QUANTITY_EXCEEDS_ORDER", "C - Quantity Exceeds Order"),
    NO_MATCHING_ORDER("D", "NO_MATCHING_ORDER", "D - No Matching Order"),
    PRICE_EXCEEDS_LIMIT("E", "PRICE_EXCEEDS_LIMIT", "E - Price Exceeds Limit"),
    CALCULATION_DIFFERENCE("F", "CALCULATION_DIFFERENCE", "F - Calculation Difference"),
    OTHER("Z", "OTHER", "Z - Other"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum127DKReason(final String action, final String name, final String description) {
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
        System.out.println(Enum127DKReason.UNKNOWN_SYMBOL);
        System.out.println(Enum127DKReason.WRONG_SIDE);
        System.out.println(Enum127DKReason.QUANTITY_EXCEEDS_ORDER);
        System.out.println(Enum127DKReason.NO_MATCHING_ORDER);
        System.out.println(Enum127DKReason.PRICE_EXCEEDS_LIMIT);

        System.out.println(Enum127DKReason.CALCULATION_DIFFERENCE);
        System.out.println(Enum127DKReason.OTHER);
    }
}
