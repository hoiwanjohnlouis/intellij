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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  528
 *  OrderCapacity
 *  char
 *  <p></p>
 *  Designates the capacity of the firm placing the order.
 *  <p>
 *  (as of FIX 4.3, this field replaced Rule80A (tag 47)
 *  <p>
 *  used in conjunction with OrderRestrictions (529) field)
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - Proprietary
 *  <p>    I - Individual
 *  <p>    P - Principal
 *              (Note for CMS purposes, "Principal" includes "Proprietary")
 *  <p>    R - Riskless Principal
 *  <p></p>
 *  <p>    W - Agent for Other Member
 */
public enum Enum528OrderCapacity implements LogFIXString, LogVerboseString {
    /*
     *  A, G, I, P, R, and W types
     */
    AGENCY( "A", "AGENCY", "A - Agency" ),
    PROPRIETARY( "G", "PROPRIETARY", "G - Proprietary" ),
    INDIVIDUAL( "I", "INDIVIDUAL", "I - Individual" ),
    PRINCIPAL( "P", "PRINCIPAL", "P - Principal (Note for CMS purposes, Principal includes Proprietary)" ),
    RISKLESS_PRINCIPAL( "R", "RISKLESS_PRINCIPAL", "R - Riskless Principal" ),

    AGENT_FOR_OTHER_MEMBER( "W", "AGENT_FOR_OTHER_MEMBER", "W - Agent for Other Member" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum528OrderCapacity(final String id, final String name, final String description) {
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
        for (Enum528OrderCapacity oneEnum : Enum528OrderCapacity.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}