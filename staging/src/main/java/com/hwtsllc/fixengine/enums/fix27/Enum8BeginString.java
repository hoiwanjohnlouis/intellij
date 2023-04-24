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

package com.hwtsllc.fixengine.enums.fix27;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  8
 *  BeginString
 *  String
 *  <p></p>
 *  Identifies beginning of new message and protocol version.
 *  <p></p>
 *  <p> ALWAYS FIRST FIELD IN MESSAGE.
 *  <p> ALWAYS UNENCRYPTED.
 *  <p> Valid values:
 *  <p></p>
 *  <p>    FIX.2.7
 *  <p>    FIX.3.0
 *  <p>    FIX.4.0
 *  <p>    FIX.4.1
 *  <p>    FIX.4.2
 *  <p></p>
 *  <p>    FIX.4.3
 *  <p>    FIX.4.4
 *  <p>    FIXT.1.1
 */
public enum Enum8BeginString implements LogFIXString, LogVerboseString {
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
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
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
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
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
