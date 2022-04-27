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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix41.enums.Enum167SecurityType;
import com.hwtsllc.fixengine2022.fix41.tags.Tag167EnuSecurityType;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag310EnuUnderlyingSecurityTypeTest {
    @Test
    void FIX0310Test() {
        FIX42 fixData = FIX42.FIX310_ENU_UNDERLYING_SECURITY_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Information is the same as TAGS 167, 310, 609
     */
    @Test
    void Tag0310Test() {
        Tag310EnuUnderlyingSecurityType tagData;

        /*
         * Deprecated, 4
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEPRECATED_FUTURE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEPRECATED_OPTION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Agency, 5
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Corporate, 8
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CORPORATE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CONVERTIBLE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DUAL_CURRENCY);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EURO_CORPORATE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.INDEXED_LINKED);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.STRUCTURED_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Currency, 1
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Equity, 2
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.COMMON_STOCK);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PREFERRED_STOCK);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Finance, 5
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REPURCHASE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.FORWARD);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BUY_SELLBACK);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SECURITIES_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SECURITIES_PLEDGE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Government, 9
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BRADY_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EURO_SOVEREIGNS);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.US_TREASURY_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.US_TREASURY_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.US_TREASURY_BILL);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Loan, 13
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TERM_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REVOLVER_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REVOLVER_TERM_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BRIDGE_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.LETTER_OF_CREDIT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SWING_LINE_FACILITY);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEFAULTED_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.WITHDRAWN_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REPLACED_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MATURED_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.AMENDED_AND_RESTATED);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.RETIRED_LOAN);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Money Market, 18
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BANKERS_ACCEPTANCE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BANK_NOTES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.BILL_OF_EXCHANGES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CALL_LOANS);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.COMMERCIAL_PAPER);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.DEPOSIT_NOTES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.LIQUIDITY_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MEDIUM_TERM_NOTES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.OVERNIGHT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PROMISSORY_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PLAZOS_FIJOS);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TIME_DEPOSIT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.EXTENDED_COMM_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Mortgage, 11
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.IOETTE_MORTGAGE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.PFANDBRIEFE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TO_BE_ANNOUNCED);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Municipal, 16
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MANDATORY_TENDER);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.REVENUE_BONDS);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SPECIAL_ASSESSMENT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SPECIAL_OBLIGATION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.SPECIAL_TAX);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TAX_ALLOCATION);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.WARRANT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Other, 7
         */
        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MUTUAL_FUND);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.MULTILEG_INSTRUMENT);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.NO_SECURITY_TYPE);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.OPTIONS_ON_FUTURES);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.WILDCARD_ENTRY);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(Enum167SecurityType.CASH);
        assertEquals( Enum167SecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());


                tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}