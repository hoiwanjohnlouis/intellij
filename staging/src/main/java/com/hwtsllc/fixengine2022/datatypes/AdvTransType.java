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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * AdvTransType enum defines all the possible values for AdvSide (FIX) fields.
 * It consists of 3 fields.
 *
 * String advTransTypeAction       type of transaction for field as defined by the FIX document, no duplicates
 * String advTransTypeName         short name of transaction for as defined by the FIX document, no duplicates
 * String advTransTypeDescription  describes what the action entails
 */
public enum AdvTransType {

    NEW ("N", "NEW", "New"),
    CANCEL ("C", "CANCEL", "Cancel"),
    REPLACE ("R", "REPLACE", "Replace"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String advTransTypeAction;
    private final String advTransTypeName;
    private final String advTransTypeDescription;

    AdvTransType(final String advTransTypeAction, final String advTransTypeName, final String advTransTypeDescription) {
        this.advTransTypeAction = advTransTypeAction;
        this.advTransTypeName = advTransTypeName;
        this.advTransTypeDescription = advTransTypeDescription;
    }

    public String getAdvTransTypeEnumName() {
        return this.name();
    }
    public String getAdvTransTypeAction() {
        return advTransTypeAction;
    }
    public String getAdvTransTypeName() {
        return advTransTypeName;
    }
    public String getAdvTransTypeDescription() {
        return advTransTypeDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAdvTransTypeEnumName())
                .append("=[")
                .append(getAdvTransTypeAction())
                .append(",")
                .append(getAdvTransTypeName())
                .append(",")
                .append(getAdvTransTypeDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(AdvTransType.NEW);
        System.out.println(AdvTransType.CANCEL);
        System.out.println(AdvTransType.REPLACE);
    }
}
