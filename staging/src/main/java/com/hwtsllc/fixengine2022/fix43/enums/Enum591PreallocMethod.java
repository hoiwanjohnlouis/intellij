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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  591
 *  PreallocMethod
 *  char
 *  <p></p>
 *  Indicates the method of preallocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pro-rata
 *  <p>    1 - Do not pro-rata - discuss first
 */
public enum Enum591PreallocMethod implements LogFIXString, LogVerboseString {
    /*
     *  0-1 types
     */
    PRO_RATA( "0", "PRO_RATA", "0 - Pro-rata" ),
    DO_NOT_PRO_RATA( "1", "DO_NOT_PRO_RATA", "1 - Do not pro-rata - discuss first" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum591PreallocMethod(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
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
                .concat( toFIXLabelString())
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
        for (Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}