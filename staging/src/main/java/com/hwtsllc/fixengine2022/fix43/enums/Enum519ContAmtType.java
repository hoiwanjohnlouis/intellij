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
 *  Information is the same for TAGS 519
 */
public enum Enum519ContAmtType implements EnumAccessors, LogVerboseString {
    /*
     * 1-15 types
     */
    COMMISSION_AMOUNT_ACTUAL("1", "COMMISSION_AMOUNT_ACTUAL", "1 - Commission amount (actual)" ),
    COMMISSION_PERCENT_ACTUAL("2", "COMMISSION_PERCENT_ACTUAL", "2 - Commission percent (actual)" ),
    INITIAL_CHARGE_AMOUNT("3", "INITIAL_CHARGE_AMOUNT", "3 - Initial Charge Amount" ),
    INITIAL_CHARGE_PERCENT("4", "INITIAL_CHARGE_PERCENT", "4 - Initial Charge Percent" ),
    DISCOUNT_AMOUNT("5", "DISCOUNT_AMOUNT", "5 - Discount Amount" ),

    DISCOUNT_PERCENT("6", "DISCOUNT_PERCENT", "6 - Discount Percent" ),
    DILUTION_LEVY_AMOUNT("7", "DILUTION_LEVY_AMOUNT", "7 - Dilution Levy Amount" ),
    DILUTION_LEVY_PERCENT("8", "DILUTION_LEVY_PERCENT", "8 - Dilution Levy Percent" ),
    EXIT_CHARGE_AMOUNT("9", "EXIT_CHARGE_AMOUNT", "9 - Exit Charge Amount" ),
    EXIT_CHARGE_PERCENT("10", "EXIT_CHARGE_PERCENT", "10 - Exit Charge Percent" ),

    RENEWAL_COMMISSION_PERCENT("11", "RENEWAL_COMMISSION_PERCENT", "11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)" ),
    PROJECTED_FUND_VALUE("12", "PROJECTED_FUND_VALUE", "12 - Projected Fund Value (i.e. for investments intended to realise or exceed a specific future value)" ),
    RENEWAL_COMMISSION_ORDER_VALUE("13", "RENEWAL_COMMISSION_ORDER_VALUE", "13 - Fund-Based Renewal Commission Amount (based on Order value)" ),
    RENEWAL_COMMISSION_FUND_VALUE("14", "RENEWAL_COMMISSION_FUND_VALUE", "14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)" ),
    NET_SETTLEMENT_AMOUNT("15", "NET_SETTLEMENT_AMOUNT", "15 - Net Settlement Amount" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum519ContAmtType(final String id, final String name, final String description) {
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
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            System.out.println(oneEnum);
        }
    }
}