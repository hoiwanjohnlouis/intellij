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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  709
 *  PosTransType
 *  Identifies the type of position transaction
 *  Valid values:
 *      1 - Exercise
 *      2 - Do Not Exercise
 *      3 - Position Adjustment
 *      4 - Position Change Submission or Margin Disposition
 *      5 - Pledge
 *      6 - Large Trader Submission
 */
public enum Enum709PosTransType implements EnumAccessors, LogStringVerbose {
    EXERCISE( "1", "EXERCISE", "1 - Exercise" ),
    DO_NOT_EXERCISE( "2", "DO_NOT_EXERCISE", "2 - Do Not Exercise" ),
    POSITION_ADJUSTMENT( "3", "POSITION_ADJUSTMENT", "3 - Position Adjustment" ),
    MARGIN_DISPOSITION( "4", "MARGIN_DISPOSITION", "4 - Position Change Submission or Margin Disposition" ),
    PLEDGE( "5", "PLEDGE", "5 - Pledge" ),
    LARGE_TRADER_SUBMISSION( "6", "LARGE_TRADER_SUBMISSION", "6 - Large Trader Submission" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum709PosTransType(final String id, final String name, final String description) {
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
        for (Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            System.out.println(oneEnum);
        }
    }
}
