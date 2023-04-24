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
 *  519
 *  ContAmtType
 *  int
 *  <p></p>
 *  Type of ContAmtValue (520).
 *  <p>
 *  NOTE That Commission Amount / % in Contract Amounts is the commission actually charged,
 *  rather than the commission instructions given in Fields 2/3.
 *  <p></p>
 *  For UK valid values include:
 *  <p>
 *  Valid values:
 *  <p>    1 - Commission amount (actual)
 *  <p>    2 - Commission percent (actual)
 *  <p>    3 - Initial Charge Amount
 *  <p>    4 - Initial Charge Percent
 *  <p>    5 - Discount Amount
 *  <p></p>
 *  <p>    6 - Discount Percent
 *  <p>    7 - Dilution Levy Amount
 *  <p>    8 - Dilution Levy Percent
 *  <p>    9 - Exit Charge Amount
 *  <p>    10 - Exit Charge Percent
 *  <p></p>
 *  <p>    11 - Fund-Based Renewal Commission Percent (a.k.a. Trail commission)
 *  <p>    12 - Projected Fund Value
 *          (i.e. for investments intended to realise or exceed a specific future value)
 *  <p>    13 - Fund-Based Renewal Commission Amount (based on Order value)
 *  <p>    14 - Fund-Based Renewal Commission Amount (based on Projected Fund value)
 *  <p>    15 - Net Settlement Amount
 */
public enum Enum519ContAmtType implements LogFIXString, LogVerboseString {
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
        for (Enum519ContAmtType oneEnum : Enum519ContAmtType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}