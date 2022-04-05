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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,NONE,0 - None/Not Applicable (default)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MAXI_ISA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,MAXI_ISA,1 - Maxi ISA (UK)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.TESSA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,TESSA,2 - TESSA (UK)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_CASH_ISA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,MINI_CASH_ISA,3 - Mini Cash ISA (UK)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_STOCKS_AND_SHARES_ISA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,MINI_STOCKS_AND_SHARES_ISA,4 - Mini Stocks And Shares ISA (UK)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.MINI_INSURANCE_ISA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,MINI_INSURANCE_ISA,5 - Mini Insurance ISA (UK)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.CURRENT_YEAR_PAYMENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,CURRENT_YEAR_PAYMENT,6 - Current Year Payment (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.PRIOR_YEAR_PAYMENT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,PRIOR_YEAR_PAYMENT,7 - Prior Year Payment (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ASSET_TRANSFER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,ASSET_TRANSFER,8 - Asset Transfer (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_PRIOR_YEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,EMPLOYEE_PRIOR_YEAR,9 - Employee - prior year (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_CURRENT_YEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("10,EMPLOYEE_CURRENT_YEAR,10 - Employee - current year (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYER_PRIOR_YEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("11,EMPLOYER_PRIOR_YEAR,11 - Employer - prior year (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EMPLOYER_CURRENT_YEAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("12,EMPLOYER_CURRENT_YEAR,12 - Employer - current year (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.NON_FUND_PROTOTYPE_IRA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("13,NON_FUND_PROTOTYPE_IRA,13 - Non-fund prototype IRA (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.NON_FUND_QUALIFIED_PLAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("14,NON_FUND_QUALIFIED_PLAN,14 - Non-fund qualified plan (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.DEFINED_CONTRIBUTION_PLAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("15,DEFINED_CONTRIBUTION_PLAN,15 - Defined contribution plan (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("16,INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR,16 - Individual Retirement Account (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("17,INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER,17 - Individual Retirement Account - Rollover (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.KEOGH;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("18,KEOGH,18 - KEOGH (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.PROFIT_SHARING_PLAN;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("19,PROFIT_SHARING_PLAN,19 - Profit Sharing Plan (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_401K;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("20,401K,20 - 401(k) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.SELF_DIRECTED_IRA;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("21,SELF_DIRECTED_IRA,21 - Self-directed IRA (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_403_B;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("22,403_B,22 - 403(b) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.RETIREMENT_457;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("23,457,23 - 457 (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_FUND_PROTOTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("24,ROTH_IRA_FUND_PROTOTYPE,24 - Roth IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_NON_PROTOTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("25,ROTH_IRA_NON_PROTOTYPE,25 - Roth IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_FUND_PROTOTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("26,ROTH_CONVERSION_IRA_FUND_PROTOTYPE,26 - Roth Conversion IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_NON_PROTOTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("27,ROTH_CONVERSION_IRA_NON_PROTOTYPE,27 - Roth Conversion IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("28,EDUCATION_IRA_FUND_PROTOTYPE,28 - Education IRA (Fund Prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_NON_PROTOTYPE;
        assertEquals("29", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("29,EDUCATION_IRA_NON_PROTOTYPE,29 - Education IRA (Non-prototype) (US)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * 999 type
         */
        enumType = Enum495TaxAdvantageType.OTHER;
        assertEquals("999", enumType.getID());
        assertEquals("OTHER", enumType.getName());
        assertEquals("999 - Other", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}