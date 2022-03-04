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

public enum BooleanEnum {
    NO ("N", "NO", "No"),
    YES ("Y", "YES", "Yes"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String booleanAction;
    private final String booleanName;
    private final String booleanDescription;

    BooleanEnum(final String booleanAction, final String booleanName, final String booleanDescription) {
        this.booleanAction = booleanAction;
        this.booleanName = booleanName;
        this.booleanDescription = booleanDescription;
    }

    public String getBooleanTypeEnumName() {
        return this.name();
    }
    public String getBooleanAction() {
        return booleanAction;
    }
    public String getBooleanName() {
        return booleanName;
    }
    public String getBooleanDescription() {
        return booleanDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBooleanTypeEnumName())
                .append("=[")
                .append(getBooleanAction())
                .append(",")
                .append(getBooleanName())
                .append(",")
                .append(getBooleanDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        System.out.println(BooleanEnum.NO);
        System.out.println(BooleanEnum.YES);
    }
}
