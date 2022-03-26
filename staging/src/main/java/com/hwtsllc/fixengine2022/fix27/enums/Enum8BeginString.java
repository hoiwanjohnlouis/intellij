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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum8BeginString implements EnumAccessors, LogStringVerbose {
    BEGIN_STRING_2_7( "FIX.2.7","BEGIN_STRING_2_7","Begin String 2.7"),
    BEGIN_STRING_3_0( "FIX.3.0","BEGIN_STRING_3_0","Begin String 3.0"),
    BEGIN_STRING_4_0( "FIX.4.0","BEGIN_STRING_4_0","Begin String 4.0"),
    BEGIN_STRING_4_1( "FIX.4.1","BEGIN_STRING_4_1","Begin String 4.1"),
    BEGIN_STRING_4_2( "FIX.4.2","BEGIN_STRING_4_2","Begin String 4.2"),
    BEGIN_STRING_4_3( "FIX.4.3","BEGIN_STRING_4_3","Begin String 4.3"),
    BEGIN_STRING_4_4( "FIX.4.4","BEGIN_STRING_4_4","Begin String 4.4"),
    BEGIN_STRING_5_0( "FIXT.1.1","BEGIN_STRING_5_0","Begin String 5.0"),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum8BeginString(final String id, final String name, final String description) {
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
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            System.out.println(oneEnum);
        }
    }
}
