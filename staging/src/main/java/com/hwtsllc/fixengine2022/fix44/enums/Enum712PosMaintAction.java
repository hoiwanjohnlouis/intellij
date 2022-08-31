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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  712
 *  PosMaintAction
 *  int
 *  <p></p>
 *  Maintenance Action to be performed.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - New - used to increment the overall transaction quantity
 *  <p>    2 - Replace - used to override the overall transaction quantity
 *                      or specifically add messages based on the reference ID
 *  <p>    3 - Cancel - used to remove the overall transaction or specific
 *                      add messages based on reference ID
 *  <p>    4 - Reverse - used to completely back-out the transaction
 *                      such that the transaction never existed
 */
public enum Enum712PosMaintAction implements LogFIXString, LogVerboseString {
    NEW( "1", "NEW",
            "1 - New - used to increment the overall transaction quantity" ),
    REPLACE( "2", "REPLACE",
            "2 - Replace - used to override the overall transaction quantity " +
                    "or specifically add messages based on the reference ID" ),
    CANCEL( "3", "CANCEL",
            "3 - Cancel - used to remove the overall transaction " +
                    "or specific add messages based on reference ID" ),
    REVERSE( "4", "REVERSE",
            "4 - Reverse - used to completely back-out the transaction " +
                    "such that the transaction never existed" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum712PosMaintAction(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum712PosMaintAction oneEnum : Enum712PosMaintAction.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
