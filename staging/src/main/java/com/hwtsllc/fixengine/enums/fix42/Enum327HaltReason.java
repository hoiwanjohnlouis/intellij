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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  327
 *  Enu
 *  HaltReason
 *  char
 *  <p>
 *  Denotes the reason for the Opening Delay or Trading Halt.
 *  <p></p>
 *  Valid values:
 *  <p>    D, E, I, M, P, and X msg types
 *  <p>    "D - News Dissemination"
 *  <p>    "E - Order Influx"
 *  <p>    "I - Order Imbalance"
 *  <p>    "M - Additional Information"
 *  <p>    "P - New Pending"
 *  <p></p>
 *  <p>    "X - Equipment Changeover"
 */
public enum Enum327HaltReason implements LogFIXString, LogVerboseString {
    /*
     * D, E, I, M, P, and X msg types
     */
    NEWS_DISSEMINATION( "D", "NEWS_DISSEMINATION", "D - News Dissemination" ),
    ORDER_INFLUX( "E", "ORDER_INFLUX", "E - Order Influx" ),
    ORDER_IMBALANCE( "I", "ORDER_IMBALANCE", "I - Order Imbalance" ),
    ADDITIONAL_INFORMATION( "M", "ADDITIONAL_INFORMATION", "M - Additional Information" ),
    NEW_PENDING( "P", "NEW_PENDING", "P - New Pending" ),

    EQUIPMENT_CHANGE_OVER( "X", "EQUIPMENT_CHANGE_OVER", "X - Equipment Changeover" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum327HaltReason(final String id, final String name, final String description) {
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
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum327HaltReason oneEnum : Enum327HaltReason.values()) {
            System.out.println(oneEnum);
        }
    }
}
