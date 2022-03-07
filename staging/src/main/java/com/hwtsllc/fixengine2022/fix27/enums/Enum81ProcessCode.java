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

public enum Enum81ProcessCode {
    REGULAR("0", "REGULAR", "Regular" ),
    SOFT_DOLLAR("1", "SOFT_DOLLAR", "Soft Dollar" ),
    STEP_IN("2", "STEP_IN", "Step In" ),
    STEP_OUT("3", "STEP_OUT", "Step Out" ),
    SOFT_DOLLAR_STEP_IN("4", "SOFT_DOLLAR_STEP_IN", "Soft Dollar, Step In" ),
    SOFT_DOLLAR_STEP_OUT("5", "SOFT_DOLLAR_STEP_OUT", "Soft Dollar, Step Out" ),
    PLAN_SPONSOR("6", "PLAN_SPONSOR", "Plan Sponsor" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum81ProcessCode(final String action, final String name, final String description) {
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
        System.out.println(Enum81ProcessCode.REGULAR);
        System.out.println(Enum81ProcessCode.SOFT_DOLLAR);
        System.out.println(Enum81ProcessCode.STEP_IN);
        System.out.println(Enum81ProcessCode.STEP_OUT);
        System.out.println(Enum81ProcessCode.SOFT_DOLLAR_STEP_IN);
        System.out.println(Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT);
        System.out.println(Enum81ProcessCode.PLAN_SPONSOR);
    }
}
