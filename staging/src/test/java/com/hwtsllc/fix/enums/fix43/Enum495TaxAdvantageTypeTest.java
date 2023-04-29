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

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum495TaxAdvantageTypeTest {
    /*
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
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NONE", enumType.toFIXNameString());
        assertEquals("0 - None/Not Applicable (default)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.MAXI_ISA;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("MAXI_ISA", enumType.toFIXNameString());
        assertEquals("1 - Maxi ISA (UK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.TESSA;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("TESSA", enumType.toFIXNameString());
        assertEquals("2 - TESSA (UK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.MINI_CASH_ISA;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("MINI_CASH_ISA", enumType.toFIXNameString());
        assertEquals("3 - Mini Cash ISA (UK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.MINI_STOCKS_AND_SHARES_ISA;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("MINI_STOCKS_AND_SHARES_ISA", enumType.toFIXNameString());
        assertEquals("4 - Mini Stocks And Shares ISA (UK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.MINI_INSURANCE_ISA;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("MINI_INSURANCE_ISA", enumType.toFIXNameString());
        assertEquals("5 - Mini Insurance ISA (UK)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.CURRENT_YEAR_PAYMENT;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("CURRENT_YEAR_PAYMENT", enumType.toFIXNameString());
        assertEquals("6 - Current Year Payment (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.PRIOR_YEAR_PAYMENT;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("PRIOR_YEAR_PAYMENT", enumType.toFIXNameString());
        assertEquals("7 - Prior Year Payment (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.ASSET_TRANSFER;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("ASSET_TRANSFER", enumType.toFIXNameString());
        assertEquals("8 - Asset Transfer (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_PRIOR_YEAR;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("EMPLOYEE_PRIOR_YEAR", enumType.toFIXNameString());
        assertEquals("9 - Employee - prior year (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.EMPLOYEE_CURRENT_YEAR;
        assertEquals("10", enumType.toFIXIDString());
        assertEquals("EMPLOYEE_CURRENT_YEAR", enumType.toFIXNameString());
        assertEquals("10 - Employee - current year (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum495TaxAdvantageType.EMPLOYER_PRIOR_YEAR;
        assertEquals("11", enumType.toFIXIDString());
        assertEquals("EMPLOYER_PRIOR_YEAR", enumType.toFIXNameString());
        assertEquals("11 - Employer - prior year (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.EMPLOYER_CURRENT_YEAR;
        assertEquals("12", enumType.toFIXIDString());
        assertEquals("EMPLOYER_CURRENT_YEAR", enumType.toFIXNameString());
        assertEquals("12 - Employer - current year (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.NON_FUND_PROTOTYPE_IRA;
        assertEquals("13", enumType.toFIXIDString());
        assertEquals("NON_FUND_PROTOTYPE_IRA", enumType.toFIXNameString());
        assertEquals("13 - Non-fund prototype IRA (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.NON_FUND_QUALIFIED_PLAN;
        assertEquals("14", enumType.toFIXIDString());
        assertEquals("NON_FUND_QUALIFIED_PLAN", enumType.toFIXNameString());
        assertEquals("14 - Non-fund qualified plan (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.DEFINED_CONTRIBUTION_PLAN;
        assertEquals("15", enumType.toFIXIDString());
        assertEquals("DEFINED_CONTRIBUTION_PLAN", enumType.toFIXNameString());
        assertEquals("15 - Defined contribution plan (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR;
        assertEquals("16", enumType.toFIXIDString());
        assertEquals("INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR", enumType.toFIXNameString());
        assertEquals("16 - Individual Retirement Account (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER;
        assertEquals("17", enumType.toFIXIDString());
        assertEquals("INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER", enumType.toFIXNameString());
        assertEquals("17 - Individual Retirement Account - Rollover (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.KEOGH;
        assertEquals("18", enumType.toFIXIDString());
        assertEquals("KEOGH", enumType.toFIXNameString());
        assertEquals("18 - KEOGH (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.PROFIT_SHARING_PLAN;
        assertEquals("19", enumType.toFIXIDString());
        assertEquals("PROFIT_SHARING_PLAN", enumType.toFIXNameString());
        assertEquals("19 - Profit Sharing Plan (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.RETIREMENT_401K;
        assertEquals("20", enumType.toFIXIDString());
        assertEquals("401K", enumType.toFIXNameString());
        assertEquals("20 - 401(k) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum495TaxAdvantageType.SELF_DIRECTED_IRA;
        assertEquals("21", enumType.toFIXIDString());
        assertEquals("SELF_DIRECTED_IRA", enumType.toFIXNameString());
        assertEquals("21 - Self-directed IRA (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.RETIREMENT_403_B;
        assertEquals("22", enumType.toFIXIDString());
        assertEquals("403_B", enumType.toFIXNameString());
        assertEquals("22 - 403(b) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.RETIREMENT_457;
        assertEquals("23", enumType.toFIXIDString());
        assertEquals("457", enumType.toFIXNameString());
        assertEquals("23 - 457 (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_FUND_PROTOTYPE;
        assertEquals("24", enumType.toFIXIDString());
        assertEquals("ROTH_IRA_FUND_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("24 - Roth IRA (Fund Prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.ROTH_IRA_NON_PROTOTYPE;
        assertEquals("25", enumType.toFIXIDString());
        assertEquals("ROTH_IRA_NON_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("25 - Roth IRA (Non-prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_FUND_PROTOTYPE;
        assertEquals("26", enumType.toFIXIDString());
        assertEquals("ROTH_CONVERSION_IRA_FUND_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("26 - Roth Conversion IRA (Fund Prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_NON_PROTOTYPE;
        assertEquals("27", enumType.toFIXIDString());
        assertEquals("ROTH_CONVERSION_IRA_NON_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("27 - Roth Conversion IRA (Non-prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE;
        assertEquals("28", enumType.toFIXIDString());
        assertEquals("EDUCATION_IRA_FUND_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("28 - Education IRA (Fund Prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum495TaxAdvantageType.EDUCATION_IRA_NON_PROTOTYPE;
        assertEquals("29", enumType.toFIXIDString());
        assertEquals("EDUCATION_IRA_NON_PROTOTYPE", enumType.toFIXNameString());
        assertEquals("29 - Education IRA (Non-prototype) (US)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         * 999 type
         */
        enumType = Enum495TaxAdvantageType.OTHER;
        assertEquals("999", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("999 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}