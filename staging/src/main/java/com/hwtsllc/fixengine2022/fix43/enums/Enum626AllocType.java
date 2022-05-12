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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Information is the same for TAGS 626
 */
public enum Enum626AllocType implements EnumAccessors, LogVerboseString {
    /*
     *  1-14 types
     */
    CALCULATED_INCLUDES_MISCFEES_NETMONEY( "1", "CALCULATED_INCLUDES_MISCFEES_NETMONEY",
            "1 - Calculated (includes MiscFees and NetMoney)" ),
    PRELIMINARY_WITHOUT_MISCFEES_NETMONEY( "2", "PRELIMINARY_WITHOUT_MISCFEES_NETMONEY",
            "2 - Preliminary (without MiscFees and NetMoney)" ),
    SELLSIDE_USING_PRELIMINARY( "3", "SELLSIDE_USING_PRELIMINARY",
            "3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney) (Replaced)" ),
    SELLSIDE_WITHOUT_PRELIMINARY( "4", "SELLSIDE_WITHOUT_PRELIMINARY",
            "4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, " +
                    "includes MiscFees and NetMoney) (Replaced)" ),
    READY_TO_BOOK_SINGLE_ORDER( "5", "READY_TO_BOOK_SINGLE_ORDER",
            "5 - Ready-To-Book - Single Order" ),

    BUYSIDE_READY_TO_BOOK( "6", "BUYSIDE_READY_TO_BOOK",
            "6 - Buyside Ready-To-Book - Combined Set of Orders (Replaced)" ),
    WAREHOUSE_INSTRUCTION( "7", "WAREHOUSE_INSTRUCTION",
            "7 - Warehouse Instruction" ),
    REQUEST_INTERMEDIARY( "8", "REQUEST_INTERMEDIARY",
            "8 - Request to Intermediary" ),
    ACCEPT( "9", "ACCEPT", "9 - Accept" ),
    REJECT( "10", "REJECT", "10 - Reject" ),

    ACCEPT_PENDING( "11", "ACCEPT_PENDING", "11 - Accept Pending" ),
    INCOMPLETE_GROUP( "12", "INCOMPLETE_GROUP", "12 - Incomplete Group" ),
    COMPLETE_GROUP( "13", "COMPLETE_GROUP", "13 - Complete Group" ),
    REVERSAL_PENDING( "14", "REVERSAL_PENDING", "14 - Reversal Pending" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum626AllocType(final String id, final String name, final String description) {
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
    public String toVerboseString() {
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
        for (Enum626AllocType oneEnum : Enum626AllocType.values()) {
            System.out.println(oneEnum);
        }
    }
}