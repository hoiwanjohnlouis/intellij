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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum433ListExecInstType implements EnumAccessors, LogStringVerbose {
    /*
     * 1-5 msg types
     */
    IMMEDIATE( "1", "IMMEDIATE",
            "1 - Immediate" ),
    WAIT_FOR_EXECUTION_INSTRUCTION( "2", "WAIT_FOR_EXECUTION_INSTRUCTION",
            "2 - Wait for Execution Instruction (i.e. a List Execution message or " +
                    "phone call before proceeding with execution of the list)" ),
    SELL_DRIVEN( "3", "SELL_DRIVEN",
            "3 - Exchange/switch CIV order - Sell driven" ),
    BUY_DRIVEN_CASH_TOP_UP( "4", "BUY_DRIVEN_CASH_TOP_UP",
            "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
                    "(i.e. additional cash will be provided to fulfill the order)" ),
    BUY_DRIVEN_CASH_WITHDRAW( "5", "BUY_DRIVEN_CASH_WITHDRAW",
            "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
                    "(i.e. additional cash will not be provided to fulfill the order)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum433ListExecInstType(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            System.out.println(oneEnum);
        }
    }
}