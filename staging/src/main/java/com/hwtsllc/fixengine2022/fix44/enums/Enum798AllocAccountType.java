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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum798AllocAccountType implements EnumAccessors, LogStringVerbose {
    /**
     *  798 (same as 581, 798)
     *  AllocAccountType
     *  Type of account associated with a confirmation or other trade-level message
     *  Valid values:
     *      1 - Account is carried on customer side of books
     *      2 - Account is carried on non-customer side of books
     *      3 - House trader
     *      4 - Floor trader
     *      6 - Account is carried on non-customer side of books and is cross margined
     *      7 - Account is house trader and is cross margined
     *      8 - Joint back office account (JBO)
     */


    /*
     *  1-4, types
     */
    CUSTOMER_BOOK( "1", "CUSTOMER_BOOK", "1 - Account is carried on customer side of the books" ),
    NON_CUSTOMER_BOOK( "2", "NON_CUSTOMER_BOOK", "2 - Account is carried on non-customer side of books" ),
    HOUSE_TRADER( "3", "HOUSE_TRADER", "3 - House Trader" ),
    FLOOR_TRADER( "4", "FLOOR_TRADER", "4 - Floor Trader" ),


    /*
     *  6-8 types
     */
    NON_CUSTOMER_CROSSED_MARGIN_BOOK( "6", "NON_CUSTOMER_CROSSED_MARGIN_BOOK",
            "6 - Account is carried on non-customer side of books and is cross margined" ),
    HOUSE_TRADER_CROSSED_MARGIN_BOOK( "7", "HOUSE_TRADER_CROSSED_MARGIN_BOOK",
            "7 - Account is house trader and is cross margined" ),
    JOINT_BACK_OFFICE( "8", "JOINT_BACK_OFFICE", "8 - Joint back office account (JBO)" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum798AllocAccountType(final String id, final String name, final String description) {
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
         * dump all the enum values
         */
        for (Enum798AllocAccountType oneEnum : Enum798AllocAccountType.values()) {
            System.out.println(oneEnum);
        }
    }
}
