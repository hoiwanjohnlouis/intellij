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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum495TaxAdvantageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag495EnuTaxAdvantageTypeTest {
    Tag495EnuTaxAdvantageType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            assertEquals( "FIX495_ENU_TAX_ADVANTAGE_TYPE", tagData.toEnumLabelString());
            assertEquals( "495", tagData.toEnumIDString());
            assertEquals( "TAX_ADVANTAGE_TYPE", tagData.toEnumNameString());
            assertEquals( "TaxAdvantageType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0-29, 999 types
         */

        /*
         *  0-29, types
         */
        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.NONE );
        assertEquals( Enum495TaxAdvantageType.NONE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.MAXI_ISA );
        assertEquals( Enum495TaxAdvantageType.MAXI_ISA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.TESSA );
        assertEquals( Enum495TaxAdvantageType.TESSA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.MINI_CASH_ISA );
        assertEquals( Enum495TaxAdvantageType.MINI_CASH_ISA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.MINI_STOCKS_AND_SHARES_ISA );
        assertEquals( Enum495TaxAdvantageType.MINI_STOCKS_AND_SHARES_ISA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.MINI_INSURANCE_ISA );
        assertEquals( Enum495TaxAdvantageType.MINI_INSURANCE_ISA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.CURRENT_YEAR_PAYMENT );
        assertEquals( Enum495TaxAdvantageType.CURRENT_YEAR_PAYMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.PRIOR_YEAR_PAYMENT );
        assertEquals( Enum495TaxAdvantageType.PRIOR_YEAR_PAYMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.ASSET_TRANSFER );
        assertEquals( Enum495TaxAdvantageType.ASSET_TRANSFER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EMPLOYEE_PRIOR_YEAR );
        assertEquals( Enum495TaxAdvantageType.EMPLOYEE_PRIOR_YEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EMPLOYEE_CURRENT_YEAR );
        assertEquals( Enum495TaxAdvantageType.EMPLOYEE_CURRENT_YEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EMPLOYER_PRIOR_YEAR );
        assertEquals( Enum495TaxAdvantageType.EMPLOYER_PRIOR_YEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EMPLOYER_CURRENT_YEAR );
        assertEquals( Enum495TaxAdvantageType.EMPLOYER_CURRENT_YEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.NON_FUND_PROTOTYPE_IRA );
        assertEquals( Enum495TaxAdvantageType.NON_FUND_PROTOTYPE_IRA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.NON_FUND_QUALIFIED_PLAN );
        assertEquals( Enum495TaxAdvantageType.NON_FUND_QUALIFIED_PLAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.DEFINED_CONTRIBUTION_PLAN );
        assertEquals( Enum495TaxAdvantageType.DEFINED_CONTRIBUTION_PLAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR );
        assertEquals( Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_REGULAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER );
        assertEquals( Enum495TaxAdvantageType.INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.KEOGH );
        assertEquals( Enum495TaxAdvantageType.KEOGH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.PROFIT_SHARING_PLAN );
        assertEquals( Enum495TaxAdvantageType.PROFIT_SHARING_PLAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.RETIREMENT_401K );
        assertEquals( Enum495TaxAdvantageType.RETIREMENT_401K.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.SELF_DIRECTED_IRA );
        assertEquals( Enum495TaxAdvantageType.SELF_DIRECTED_IRA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.RETIREMENT_403_B );
        assertEquals( Enum495TaxAdvantageType.RETIREMENT_403_B.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.RETIREMENT_457 );
        assertEquals( Enum495TaxAdvantageType.RETIREMENT_457.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.ROTH_IRA_FUND_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.ROTH_IRA_FUND_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.ROTH_IRA_NON_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.ROTH_IRA_NON_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_FUND_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_FUND_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_NON_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.ROTH_CONVERSION_IRA_NON_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.EDUCATION_IRA_FUND_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.EDUCATION_IRA_NON_PROTOTYPE );
        assertEquals( Enum495TaxAdvantageType.EDUCATION_IRA_NON_PROTOTYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * 999 type
         */
        tagData = new Tag495EnuTaxAdvantageType( Enum495TaxAdvantageType.OTHER );
        assertEquals( Enum495TaxAdvantageType.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum495TaxAdvantageType oneEnum : Enum495TaxAdvantageType.values()) {
            tagData = new Tag495EnuTaxAdvantageType(oneEnum);
            assertEquals( "Tag495EnuTaxAdvantageType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}