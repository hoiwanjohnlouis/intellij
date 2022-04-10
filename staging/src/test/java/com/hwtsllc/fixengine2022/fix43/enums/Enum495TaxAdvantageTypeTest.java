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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum495TaxAdvantageTypeTest {
    /**
     *  Information is the same for TAGS 495
     */
    @Test
    void Enum0495Test() {
        Enum495TaxAdvantageType enumType;

        /*
         *  0-29, 999 types
         */

        /*
         *  0-29, types
         */
        enumType = Enum495TaxAdvantageType.NONE;
        assertEquals("0", enumType.getID());
        assertEquals("NONE", enumType.getName());
        assertEquals("0 - None/Not Applicable (default)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MAXI_ISA;
        assertEquals("1", enumType.getID());
        assertEquals("MAXI_ISA", enumType.getName());
        assertEquals("1 - Maxi ISA (UK)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.TESSA;
        assertEquals("2", enumType.getID());
        assertEquals("TESSA", enumType.getName());
        assertEquals("2 - TESSA (UK)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_CASH_ISA;
        assertEquals("3", enumType.getID());
        assertEquals("MINI_CASH_ISA", enumType.getName());
        assertEquals("3 - Mini Cash ISA (UK)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_STOCKS_AND_SHARES_ISA;
        assertEquals("4", enumType.getID());
        assertEquals("MINI_STOCKS_AND_SHARES_ISA", enumType.getName());
        assertEquals("4 - Mini Stocks And Shares ISA (UK)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_INSURANCE_ISA;
        assertEquals("5", enumType.getID());
        assertEquals("MINI_INSURANCE_ISA", enumType.getName());
        assertEquals("5 - Mini Insurance ISA (UK)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.CURRENT_YEAR_PAYMENT;
        assertEquals("6", enumType.getID());
        assertEquals("CURRENT_YEAR_PAYMENT", enumType.getName());
        assertEquals("6 - Current Year Payment (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.PRIOR_YEAR_PAYMENT;
        assertEquals("7", enumType.getID());
        assertEquals("PRIOR_YEAR_PAYMENT", enumType.getName());
        assertEquals("7 - Prior Year Payment (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ASSET_TRANSFER;
        assertEquals("8", enumType.getID());
        assertEquals("ASSET_TRANSFER", enumType.getName());
        assertEquals("8 - Asset Transfer (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_PRIOR_YEAR;
        assertEquals("9", enumType.getID());
        assertEquals("EMPLOYEE_PRIOR_YEAR", enumType.getName());
        assertEquals("9 - Employee - prior year (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_CURRENT_YEAR;
        assertEquals("10", enumType.getID());
        assertEquals("EMPLOYEE_CURRENT_YEAR", enumType.getName());
        assertEquals("10 - Employee - current year (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum495TaxAdvantageType.EMPLOYER_PRIOR_YEAR;
        assertEquals("11", enumType.getID());
        assertEquals("EMPLOYER_PRIOR_YEAR", enumType.getName());
        assertEquals("11 - Employer - prior year (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYER_CURRENT_YEAR;
        assertEquals("12", enumType.getID());
        assertEquals("EMPLOYER_CURRENT_YEAR", enumType.getName());
        assertEquals("12 - Employer - current year (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.NON_FUND_PROTOTYPE_IRA;
        assertEquals("13", enumType.getID());
        assertEquals("NON_FUND_PROTOTYPE_IRA", enumType.getName());
        assertEquals("13 - Non-fund prototype IRA (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.NON_FUND_QUALIFIED_PLAN;
        assertEquals("14", enumType.getID());
        assertEquals("NON_FUND_QUALIFIED_PLAN", enumType.getName());
        assertEquals("14 - Non-fund qualified plan (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.DEFINED_CONTRIBUTION_PLAN;
        assertEquals("15", enumType.getID());
        assertEquals("DEFINED_CONTRIBUTION_PLAN", enumType.getName());
        assertEquals("15 - Defined contribution plan (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR;
        assertEquals("16", enumType.getID());
        assertEquals("INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR", enumType.getName());
        assertEquals("16 - Individual Retirement Account (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER;
        assertEquals("17", enumType.getID());
        assertEquals("INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER", enumType.getName());
        assertEquals("17 - Individual Retirement Account - Rollover (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.KEOGH;
        assertEquals("18", enumType.getID());
        assertEquals("KEOGH", enumType.getName());
        assertEquals("18 - KEOGH (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.PROFIT_SHARING_PLAN;
        assertEquals("19", enumType.getID());
        assertEquals("PROFIT_SHARING_PLAN", enumType.getName());
        assertEquals("19 - Profit Sharing Plan (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_401K;
        assertEquals("20", enumType.getID());
        assertEquals("401K", enumType.getName());
        assertEquals("20 - 401(k) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum495TaxAdvantageType.SELF_DIRECTED_IRA;
        assertEquals("21", enumType.getID());
        assertEquals("SELF_DIRECTED_IRA", enumType.getName());
        assertEquals("21 - Self-directed IRA (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_403_B;
        assertEquals("22", enumType.getID());
        assertEquals("403_B", enumType.getName());
        assertEquals("22 - 403(b) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_457;
        assertEquals("23", enumType.getID());
        assertEquals("457", enumType.getName());
        assertEquals("23 - 457 (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_FUND_PROTOTYPE;
        assertEquals("24", enumType.getID());
        assertEquals("ROTH_IRA_FUND_PROTOTYPE", enumType.getName());
        assertEquals("24 - Roth IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_NON_PROTOTYPE;
        assertEquals("25", enumType.getID());
        assertEquals("ROTH_IRA_NON_PROTOTYPE", enumType.getName());
        assertEquals("25 - Roth IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_FUND_PROTOTYPE;
        assertEquals("26", enumType.getID());
        assertEquals("ROTH_CONVERSION_IRA_FUND_PROTOTYPE", enumType.getName());
        assertEquals("26 - Roth Conversion IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_NON_PROTOTYPE;
        assertEquals("27", enumType.getID());
        assertEquals("ROTH_CONVERSION_IRA_NON_PROTOTYPE", enumType.getName());
        assertEquals("27 - Roth Conversion IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE;
        assertEquals("28", enumType.getID());
        assertEquals("EDUCATION_IRA_FUND_PROTOTYPE", enumType.getName());
        assertEquals("28 - Education IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_NON_PROTOTYPE;
        assertEquals("29", enumType.getID());
        assertEquals("EDUCATION_IRA_NON_PROTOTYPE", enumType.getName());
        assertEquals("29 - Education IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         * 999 type
         */
        enumType = Enum495TaxAdvantageType.OTHER;
        assertEquals("999", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("999 - Other", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}