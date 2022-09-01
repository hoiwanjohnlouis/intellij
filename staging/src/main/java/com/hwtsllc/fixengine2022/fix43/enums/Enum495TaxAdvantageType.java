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
 *  495
 *  TaxAdvantageType
 *  int
 *  <p></p>
 *  For CIV - a code identifying the type of tax exempt account
 *  in which purchased shares/units are to be held.
 *  <p></p>
 *  30 – 998 are reserved for future use by recognized taxation authorities
 *  <p>
 *  999=Other
 *  <p></p>
 *  values above 1000 are available for use by private agreement among counterparties
 *  Valid values:
 *  <p>    0 - None/Not Applicable (default)
 *  <p>    1 - Maxi ISA (UK)
 *  <p>    2 - TESSA (UK)
 *  <p>    3 - Mini Cash ISA (UK)
 *  <p>    4 - Mini Stocks And Shares ISA (UK)
 *  <p></p>
 *  <p>    5 - Mini Insurance ISA (UK)
 *  <p>    6 - Current Year Payment (US)
 *  <p>    7 - Prior Year Payment (US)
 *  <p>    8 - Asset Transfer (US)
 *  <p>    9 - Employee - prior year (US)
 *  <p></p>
 *  <p>    10 - Employee - current year (US)
 *  <p>    11 - Employer - prior year (US)
 *  <p>    12 - Employer - current year (US)
 *  <p>    13 - Non-fund prototype IRA (US)
 *  <p>    14 - Non-fund qualified plan (US)
 *  <p></p>
 *  <p>    15 - Defined contribution plan (US)
 *  <p>    16 - Individual Retirement Account (US)
 *  <p>    17 - Individual Retirement Account - Rollover (US)
 *  <p>    18 - KEOGH (US)
 *  <p>    19 - Profit Sharing Plan (US)
 *  <p></p>
 *  <p>    20 - 401(k) (US)
 *  <p>    21 - Self-directed IRA (US)
 *  <p>    22 - 403(b) (US)
 *  <p>    23 - 457 (US)
 *  <p>    24 - Roth IRA (Fund Prototype) (US)
 *  <p></p>
 *  <p>    25 - Roth IRA (Non-prototype) (US)
 *  <p>    26 - Roth Conversion IRA (Fund Prototype) (US)
 *  <p>    27 - Roth Conversion IRA (Non-prototype) (US)
 *  <p>    28 - Education IRA (Fund Prototype) (US)
 *  <p>    29 - Education IRA (Non-prototype) (US)
 *  <p></p>
 *  <p>    999 - Other
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public enum Enum495TaxAdvantageType implements LogFIXString, LogVerboseString {
    /*
     * 0-29, 999 types
     */

    /*
     * 0-29, types
     */
    NONE("0", "NONE", "0 - None/Not Applicable (default)" ),
    MAXI_ISA("1", "MAXI_ISA", "1 - Maxi ISA (UK)" ),
    TESSA("2", "TESSA", "2 - TESSA (UK)" ),
    MINI_CASH_ISA("3", "MINI_CASH_ISA", "3 - Mini Cash ISA (UK)" ),
    MINI_STOCKS_AND_SHARES_ISA("4", "MINI_STOCKS_AND_SHARES_ISA", "4 - Mini Stocks And Shares ISA (UK)" ),

    MINI_INSURANCE_ISA("5", "MINI_INSURANCE_ISA", "5 - Mini Insurance ISA (UK)" ),
    CURRENT_YEAR_PAYMENT("6", "CURRENT_YEAR_PAYMENT", "6 - Current Year Payment (US)" ),
    PRIOR_YEAR_PAYMENT("7", "PRIOR_YEAR_PAYMENT", "7 - Prior Year Payment (US)" ),
    ASSET_TRANSFER("8", "ASSET_TRANSFER", "8 - Asset Transfer (US)" ),
    EMPLOYEE_PRIOR_YEAR("9", "EMPLOYEE_PRIOR_YEAR", "9 - Employee - prior year (US)" ),

    EMPLOYEE_CURRENT_YEAR("10", "EMPLOYEE_CURRENT_YEAR", "10 - Employee - current year (US)" ),
    EMPLOYER_PRIOR_YEAR("11", "EMPLOYER_PRIOR_YEAR", "11 - Employer - prior year (US)" ),
    EMPLOYER_CURRENT_YEAR("12", "EMPLOYER_CURRENT_YEAR", "12 - Employer - current year (US)" ),
    NON_FUND_PROTOTYPE_IRA("13", "NON_FUND_PROTOTYPE_IRA", "13 - Non-fund prototype IRA (US)" ),
    NON_FUND_QUALIFIED_PLAN("14", "NON_FUND_QUALIFIED_PLAN", "14 - Non-fund qualified plan (US)" ),

    DEFINED_CONTRIBUTION_PLAN("15", "DEFINED_CONTRIBUTION_PLAN", "15 - Defined contribution plan (US)" ),
    INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR("16", "INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR", "16 - Individual Retirement Account (US)" ),
    INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER("17", "INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER", "17 - Individual Retirement Account - Rollover (US)" ),
    KEOGH("18", "KEOGH", "18 - KEOGH (US)" ),
    PROFIT_SHARING_PLAN("19", "PROFIT_SHARING_PLAN", "19 - Profit Sharing Plan (US)" ),

	RETIREMENT_401K("20", "401K", "20 - 401(k) (US)" ),
    SELF_DIRECTED_IRA("21", "SELF_DIRECTED_IRA", "21 - Self-directed IRA (US)" ),
    RETIREMENT_403_B("22", "403_B", "22 - 403(b) (US)" ),
    RETIREMENT_457("23", "457", "23 - 457 (US)" ),
    ROTH_IRA_FUND_PROTOTYPE("24", "ROTH_IRA_FUND_PROTOTYPE", "24 - Roth IRA (Fund Prototype) (US)" ),

    ROTH_IRA_NON_PROTOTYPE("25", "ROTH_IRA_NON_PROTOTYPE", "25 - Roth IRA (Non-prototype) (US)" ),
    ROTH_CONVERSION_IRA_FUND_PROTOTYPE("26", "ROTH_CONVERSION_IRA_FUND_PROTOTYPE", "26 - Roth Conversion IRA (Fund Prototype) (US)" ),
    ROTH_CONVERSION_IRA_NON_PROTOTYPE("27", "ROTH_CONVERSION_IRA_NON_PROTOTYPE", "27 - Roth Conversion IRA (Non-prototype) (US)" ),
    EDUCATION_IRA_FUND_PROTOTYPE("28", "EDUCATION_IRA_FUND_PROTOTYPE", "28 - Education IRA (Fund Prototype) (US)" ),
    EDUCATION_IRA_NON_PROTOTYPE("29", "EDUCATION_IRA_NON_PROTOTYPE", "29 - Education IRA (Non-prototype) (US)" ),


    /*
     * 999, types
     */
    OTHER("999", "OTHER", "999 - Other" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum495TaxAdvantageType(final String id, final String name, final String description) {
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
                .concat( toFIXLabelString())
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
         * dump all the enum values for review
         */
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}