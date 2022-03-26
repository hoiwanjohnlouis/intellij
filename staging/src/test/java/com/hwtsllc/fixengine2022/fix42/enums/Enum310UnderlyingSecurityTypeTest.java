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

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

class Enum310UnderlyingSecurityTypeTest {
    @Test
    void Enum0310Test() {
        Enum310UnderlyingSecurityType enumType;

        /*
         * Deprecated, 4
         */
        enumType = Enum310UnderlyingSecurityType.DEPRECATED_FUTURE;
        enumType = Enum310UnderlyingSecurityType.DEPRECATED_OPTION;
        enumType = Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_NOTE;
        enumType = Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_BILL;

        /*
         * Agency, 5
         */
        enumType = Enum310UnderlyingSecurityType.EURO_SUPRANATIONAL_COUPON;
        enumType = Enum310UnderlyingSecurityType.FEDERAL_AGENCY_COUPON;
        enumType = Enum310UnderlyingSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        enumType = Enum310UnderlyingSecurityType.PRIVATE_EXPORT_FUNDING;
        enumType = Enum310UnderlyingSecurityType.USD_SUPRANATIONAL_COUPON;

        /*
         * Corporate, 8
         */
        enumType = Enum310UnderlyingSecurityType.CORPORATE_BOND;
        enumType = Enum310UnderlyingSecurityType.CORPORATE_PRIVATE_PLACEMENT;
        enumType = Enum310UnderlyingSecurityType.CONVERTIBLE_BOND;
        enumType = Enum310UnderlyingSecurityType.DUAL_CURRENCY;
        enumType = Enum310UnderlyingSecurityType.EURO_CORPORATE_BOND;
        enumType = Enum310UnderlyingSecurityType.INDEXED_LINKED;
        enumType = Enum310UnderlyingSecurityType.STRUCTURED_NOTE;
        enumType = Enum310UnderlyingSecurityType.YANKEE_CORPORATE_BOND;

        /*
         * Currency, 1
         */
        enumType = Enum310UnderlyingSecurityType.FOREIGN_EXCHANGE_CONTRACT;

        /*
         * Equity, 2
         */
        enumType = Enum310UnderlyingSecurityType.COMMON_STOCK;
        enumType = Enum310UnderlyingSecurityType.PREFERRED_STOCK;

        /*
         * Finance, 5
         */
        enumType = Enum310UnderlyingSecurityType.REPURCHASE;
        enumType = Enum310UnderlyingSecurityType.FORWARD;
        enumType = Enum310UnderlyingSecurityType.BUY_SELLBACK;
        enumType = Enum310UnderlyingSecurityType.SECURITIES_LOAN;
        enumType = Enum310UnderlyingSecurityType.SECURITIES_PLEDGE;

        /*
         * Government, 9
         */
        enumType = Enum310UnderlyingSecurityType.BRADY_BOND;
        enumType = Enum310UnderlyingSecurityType.EURO_SOVEREIGNS;
        enumType = Enum310UnderlyingSecurityType.US_TREASURY_BOND;
        enumType = Enum310UnderlyingSecurityType.INTEREST_STRIP_ANY_BOND;
        enumType = Enum310UnderlyingSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        enumType = Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        enumType = Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        enumType = Enum310UnderlyingSecurityType.US_TREASURY_NOTE;
        enumType = Enum310UnderlyingSecurityType.US_TREASURY_BILL;

        /*
         * Loan, 13
         */
        enumType = Enum310UnderlyingSecurityType.TERM_LOAN;
        enumType = Enum310UnderlyingSecurityType.REVOLVER_LOAN;
        enumType = Enum310UnderlyingSecurityType.REVOLVER_TERM_LOAN;
        enumType = Enum310UnderlyingSecurityType.BRIDGE_LOAN;
        enumType = Enum310UnderlyingSecurityType.LETTER_OF_CREDIT;
        enumType = Enum310UnderlyingSecurityType.SWING_LINE_FACILITY;
        enumType = Enum310UnderlyingSecurityType.DEBTOR_IN_POSSESSION;
        enumType = Enum310UnderlyingSecurityType.DEFAULTED_LOAN;
        enumType = Enum310UnderlyingSecurityType.WITHDRAWN_LOAN;
        enumType = Enum310UnderlyingSecurityType.REPLACED_LOAN;
        enumType = Enum310UnderlyingSecurityType.MATURED_LOAN;
        enumType = Enum310UnderlyingSecurityType.AMENDED_AND_RESTATED;
        enumType = Enum310UnderlyingSecurityType.RETIRED_LOAN;

        /*
         * Money Market, 18
         */
        enumType = Enum310UnderlyingSecurityType.BANKERS_ACCEPTANCE;
        enumType = Enum310UnderlyingSecurityType.BANK_NOTES;
        enumType = Enum310UnderlyingSecurityType.BILL_OF_EXCHANGES;
        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_DEPOSIT;
        enumType = Enum310UnderlyingSecurityType.CALL_LOANS;
        enumType = Enum310UnderlyingSecurityType.COMMERCIAL_PAPER;
        enumType = Enum310UnderlyingSecurityType.DEPOSIT_NOTES;
        enumType = Enum310UnderlyingSecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        enumType = Enum310UnderlyingSecurityType.EURO_COMMERCIAL_PAPER;
        enumType = Enum310UnderlyingSecurityType.LIQUIDITY_NOTE;
        enumType = Enum310UnderlyingSecurityType.MEDIUM_TERM_NOTES;
        enumType = Enum310UnderlyingSecurityType.OVERNIGHT;
        enumType = Enum310UnderlyingSecurityType.PROMISSORY_NOTE;
        enumType = Enum310UnderlyingSecurityType.PLAZOS_FIJOS;
        enumType = Enum310UnderlyingSecurityType.SHORT_TERM_LOAN_NOTE;
        enumType = Enum310UnderlyingSecurityType.TIME_DEPOSIT;
        enumType = Enum310UnderlyingSecurityType.EXTENDED_COMM_NOTE;
        enumType = Enum310UnderlyingSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;

        /*
         * Mortgage, 11
         */
        enumType = Enum310UnderlyingSecurityType.ASSET_BACKED_SECURITIES;
        enumType = Enum310UnderlyingSecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        enumType = Enum310UnderlyingSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        enumType = Enum310UnderlyingSecurityType.IOETTE_MORTGAGE;
        enumType = Enum310UnderlyingSecurityType.MORTGAGE_BACKED_SECURITIES;
        enumType = Enum310UnderlyingSecurityType.MORTGAGE_INTEREST_ONLY;
        enumType = Enum310UnderlyingSecurityType.MORTGAGE_PRINCIPAL_ONLY;
        enumType = Enum310UnderlyingSecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        enumType = Enum310UnderlyingSecurityType.MISCELLANEOUS_PASS_THROUGH;
        enumType = Enum310UnderlyingSecurityType.PFANDBRIEFE;
        enumType = Enum310UnderlyingSecurityType.TO_BE_ANNOUNCED;

        /*
         * Municipal, 16
         */
        enumType = Enum310UnderlyingSecurityType.OTHER_ANTICIPATION_NOTES;
        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_OBLIGATION;
        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_PARTICIPATION;
        enumType = Enum310UnderlyingSecurityType.GENERAL_OBLIGATION_BONDS;
        enumType = Enum310UnderlyingSecurityType.MANDATORY_TENDER;
        enumType = Enum310UnderlyingSecurityType.REVENUE_ANTICIPATION_NOTE;
        enumType = Enum310UnderlyingSecurityType.REVENUE_BONDS;
        enumType = Enum310UnderlyingSecurityType.SPECIAL_ASSESSMENT;
        enumType = Enum310UnderlyingSecurityType.SPECIAL_OBLIGATION;
        enumType = Enum310UnderlyingSecurityType.SPECIAL_TAX;
        enumType = Enum310UnderlyingSecurityType.TAX_ANTICIPATION_NOTE;
        enumType = Enum310UnderlyingSecurityType.TAX_ALLOCATION;
        enumType = Enum310UnderlyingSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        enumType = Enum310UnderlyingSecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        enumType = Enum310UnderlyingSecurityType.VARIABLE_RATE_DEMAND_NOTE;
        enumType = Enum310UnderlyingSecurityType.WARRANT;

        /*
         * Other, 7
         */
        enumType = Enum310UnderlyingSecurityType.MUTUAL_FUND;
        enumType = Enum310UnderlyingSecurityType.MULTILEG_INSTRUMENT;
        enumType = Enum310UnderlyingSecurityType.NO_SECURITY_TYPE;
        enumType = Enum310UnderlyingSecurityType.OPTIONS_ON_FUTURES;
        enumType = Enum310UnderlyingSecurityType.OPTIONS_ON_PHYSICAL;
        enumType = Enum310UnderlyingSecurityType.WILDCARD_ENTRY;
        enumType = Enum310UnderlyingSecurityType.CASH;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}