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
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum462UnderlyingProduct implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 460, 462
     */

    /*
     * 0-13 msg types
     */
    AGENCY("1", "AGENCY", "1 - AGENCY" ),
    COMMODITY("2", "COMMODITY", "2 - COMMODITY" ),
    CORPORATE("3", "CORPORATE", "3 - CORPORATE" ),
    CURRENCY("4", "CURRENCY", "4 - CURRENCY" ),
    EQUITY("5", "EQUITY", "5 - EQUITY" ),
    GOVERNMENT("6", "GOVERNMENT", "6 - GOVERNMENT" ),
    INDEX("7", "INDEX", "7 - INDEX" ),
    LOAN("8", "LOAN", "8 - LOAN" ),
    MONEY_MARKET("9", "MONEYMARKET", "9 - MONEYMARKET" ),
    MORTGAGE("10", "MORTGAGE", "10 - MORTGAGE" ),
    MUNICIPAL("11", "MUNICIPAL", "11 - MUNICIPAL" ),
    OTHER("12", "OTHER", "12 - OTHER" ),
    FINANCING("13", "FINANCING", "13 - FINANCING" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum462UnderlyingProduct(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum462UnderlyingProduct oneEnum : Enum462UnderlyingProduct.values()) {
            System.out.println(oneEnum);
        }
    }
}
