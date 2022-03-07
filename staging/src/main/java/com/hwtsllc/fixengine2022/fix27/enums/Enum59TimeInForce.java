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

public enum Enum59TimeInForce {
    DAY("0", "DAY", "Day (or session)" ),
    GOOD_TILL_CANCEL("1", "GOOD_TILL_CANCEL", "Good Till Cancel (GTC)" ),
    AT_THE_OPENING("2", "AT_THE_OPENING", "At the Opening (OPG)" ),
    IMMEDIATE_OR_CANCEL("3", "IMMEDIATE_OR_CANCEL", "Immediate Or Cancel (IOC)" ),
    FILL_OR_KILL("4", "FILL_OR_KILL", "Fill Or Kill (FOK)" ),
    GOOD_TILL_CROSSING("5", "GOOD_TILL_CROSSING", "Good Till Crossing (GTX)" ),
    GOOD_TILL_DATE("6", "GOOD_TILL_DATE", "Good Till Date (GTD)" ),
    AT_THE_CLOSE("7", "AT_THE_CLOSE", "At the Close" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum59TimeInForce(final String action, final String name, final String description) {
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
        System.out.println(Enum59TimeInForce.DAY);
        System.out.println(Enum59TimeInForce.GOOD_TILL_CANCEL);
        System.out.println(Enum59TimeInForce.AT_THE_OPENING);
        System.out.println(Enum59TimeInForce.IMMEDIATE_OR_CANCEL);
        System.out.println(Enum59TimeInForce.FILL_OR_KILL);
        System.out.println(Enum59TimeInForce.GOOD_TILL_CROSSING);
        System.out.println(Enum59TimeInForce.GOOD_TILL_DATE);
        System.out.println(Enum59TimeInForce.AT_THE_CLOSE);
    }
}
