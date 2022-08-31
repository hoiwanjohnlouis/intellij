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
 *  563
 *  MultiLegRptTypeReq
 *  int
 *  <p></p>
 *  Indicates the method of execution reporting requested by issuer of the order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Report by mulitleg security only (do not report legs)
 *  <p>    1 - Report by multileg security and by instrument legs belonging to the multileg security
 *  <p>    2 - Report by instrument legs belonging to the multileg security only
 *              (do not report status of multileg security)
 */
public enum Enum563MultiLegRptTypeReq implements LogFIXString, LogVerboseString {
    /*
     *  0-2 types
     */
    MULITLEG_SECURITY_ONLY( "0", "MULITLEG_SECURITY_ONLY",
            "0 - Report by mulitleg security only (do not report legs)" ),
    MULTILEG_SECURITY_LEGS( "1", "MULTILEG_SECURITY_LEGS",
            "1 - Report by multileg security and by instrument legs belonging to the multileg security" ),
    INSTRUMENT_LEGS( "2", "INSTRUMENT_LEGS",
            "2 - Report by instrument legs belonging to the multileg security only " +
                    "(do not report status of multileg security)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum563MultiLegRptTypeReq(final String id, final String name, final String description) {
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
        for (Enum563MultiLegRptTypeReq oneEnum : Enum563MultiLegRptTypeReq.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}