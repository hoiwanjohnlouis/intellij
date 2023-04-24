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

package com.hwtsllc.fixengine.enums.fix43;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  577
 *  ClearingInstruction
 *  int
 *  <p></p>
 *  Eligibility of this trade for clearing and central counterparty processing
 *  values above 4000 are reserved for agreement between parties
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Process normally
 *  <p>    1 - Exclude from all netting
 *  <p>    2 - Bilateral netting only
 *  <p>    3 - Ex clearing
 *  <p>    4 - Special trade
 *  <p></p>
 *  <p>    5 - Multilateral netting
 *  <p>    6 - Clear against central counterparty
 *  <p>    7 - Exclude from central counterparty
 *  <p>    8 - Manual mode (pre-posting and/or pre-giveup)
 *  <p>    9 - Automatic posting mode (trade posting to the position account number specified)
 *  <p></p>
 *  <p>    10 - Automatic give-up mode (trade give-up to the give-up destination number specified)
 *  <p>    11 - Qualified Service Representative QSR
 *  <p>    12 - Customer trade
 *  <p>    13 - Self clearing
 */
public enum Enum577ClearingInstruction implements LogFIXString, LogVerboseString {
    /*
     *  0-13 types
     */
    PROCESS_NORMALLY( "0", "PROCESS_NORMALLY", "0 - Process normally" ),
    EXCLUDE_ALL_NETTING( "1", "EXCLUDE_ALL_NETTING", "1 - Exclude from all netting" ),
    BILATERAL_NETTING_ONLY( "2", "BILATERAL_NETTING_ONLY", "2 - Bilateral netting only" ),
    EX_CLEARING( "3", "EX_CLEARING", "3 - Ex clearing" ),
    SPECIAL_TRADE( "4", "SPECIAL_TRADE", "4 - Special trade" ),

    MULTILATERAL_NETTING( "5", "MULTILATERAL_NETTING", "5 - Multilateral netting" ),
    CLEAR_AGAINST_CENTRAL_COUNTERPARTY( "6", "CLEAR_AGAINST_CENTRAL_COUNTERPARTY",
            "6 - Clear against central counterparty" ),
    EXCLUDE_FROM_CENTRAL_COUNTERPARTY( "7", "EXCLUDE_FROM_CENTRAL_COUNTERPARTY",
            "7 - Exclude from central counterparty" ),
    MANUAL( "8", "MANUAL", "8 - Manual mode (pre-posting and/or pre-giveup)" ),
    AUTOMATIC_POSTING( "9", "AUTOMATIC_POSTING",
            "9 - Automatic posting mode (trade posting to the position account number specified)" ),

    AUTOMATIC_GIVE_UP( "10", "AUTOMATIC_GIVE_UP",
            "10 - Automatic give-up mode (trade give-up to the give-up destination number specified)" ),
    QUALIFIED_SERVICE_REPRESENTATIVE( "11", "QUALIFIED_SERVICE_REPRESENTATIVE",
            "11 - Qualified Service Representative QSR" ),
    CUSTOMER_TRADE( "12", "CUSTOMER_TRADE", "12 - Customer trade" ),
    SELF_CLEARING( "13", "SELF_CLEARING", "13 - Self clearing" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum577ClearingInstruction(final String id, final String name, final String description) {
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
        for (Enum577ClearingInstruction oneEnum : Enum577ClearingInstruction.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}