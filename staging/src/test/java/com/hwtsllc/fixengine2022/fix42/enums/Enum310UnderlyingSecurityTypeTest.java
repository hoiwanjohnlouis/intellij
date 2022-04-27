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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum310UnderlyingSecurityTypeTest {
    /**
     *  Information is the same as TAGS 167, 310, 609
     */
    @Test
    void Enum0310Test() {
        Enum310UnderlyingSecurityType enumType;

        /**
         * Deprecated msg types
         */
        enumType = Enum310UnderlyingSecurityType.DEPRECATED_FUTURE;
        assertEquals("FUT", enumType.getID());
        assertEquals("DEPRECATED_FUTURE", enumType.getName());
        assertEquals("FUT - Future (Deprecated)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.getID());
        assertEquals("DEPRECATED_OPTION", enumType.getName());
        assertEquals("OPT - Option (Deprecated)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.getName());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.getName());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Agency msg types
         */
        enumType = Enum310UnderlyingSecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.getID());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.getID());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.getName());
        assertEquals("FAC - Federal Agency Coupon", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.getID());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.getName());
        assertEquals("FADN - Federal Agency Discount Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.getID());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.getName());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.getID());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Corporate msg types
         */
        enumType = Enum310UnderlyingSecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.getID());
        assertEquals("CORPORATE_BOND", enumType.getName());
        assertEquals("CORP - Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.getID());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("CPP - Corporate Private Placement", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.getID());
        assertEquals("CONVERTIBLE_BOND", enumType.getName());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.getID());
        assertEquals("DUAL_CURRENCY", enumType.getName());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.getID());
        assertEquals("EURO_CORPORATE_BOND", enumType.getName());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.getID());
        assertEquals("INDEXED_LINKED", enumType.getName());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.getID());
        assertEquals("STRUCTURED_NOTE", enumType.getName());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.getID());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.getName());
        assertEquals("YANK - Yankee Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Currency msg types
         */
        enumType = Enum310UnderlyingSecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.getID());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.getName());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Equity msg types
         */
        enumType = Enum310UnderlyingSecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.getID());
        assertEquals("COMMON_STOCK", enumType.getName());
        assertEquals("CS - Common Stock (Equity)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.getID());
        assertEquals("PREFERRED_STOCK", enumType.getName());
        assertEquals("PS - Preferred Stock (Equity)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Finance msg types
         */
        enumType = Enum310UnderlyingSecurityType.REPURCHASE;
        assertEquals("REPO", enumType.getID());
        assertEquals("REPURCHASE", enumType.getName());
        assertEquals("REPO - Repurchase (Financing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.FORWARD;
        assertEquals("FORWARD", enumType.getID());
        assertEquals("FORWARD", enumType.getName());
        assertEquals("FORWARD - Forward (Financing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.getID());
        assertEquals("BUY_SELLBACK", enumType.getName());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.getID());
        assertEquals("SECURITIES_LOAN", enumType.getName());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.getID());
        assertEquals("SECURITIES_PLEDGE", enumType.getName());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Government msg types
         */
        enumType = Enum310UnderlyingSecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.getID());
        assertEquals("BRADY_BOND", enumType.getName());
        assertEquals("BRADY - Brady Bond (Government)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.getID());
        assertEquals("EURO_SOVEREIGNS", enumType.getName());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.getID());
        assertEquals("US_TREASURY_BOND", enumType.getName());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.getID());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.getName());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.getID());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.getName());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.getName());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.getName());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.getID());
        assertEquals("US_TREASURY_NOTE", enumType.getName());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.getID());
        assertEquals("US_TREASURY_BILL", enumType.getName());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Loan msg types
         */
        enumType = Enum310UnderlyingSecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.getID());
        assertEquals("TERM_LOAN", enumType.getName());
        assertEquals("TERM - Term Loan", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.getID());
        assertEquals("REVOLVER_LOAN", enumType.getName());
        assertEquals("RVLV - Revolver Loan", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.getID());
        assertEquals("REVOLVER_TERM_LOAN", enumType.getName());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.getID());
        assertEquals("BRIDGE_LOAN", enumType.getName());
        assertEquals("BRIDGE - Bridge Loan", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.getID());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("LOFC - Letter Of Credit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.getID());
        assertEquals("SWING_LINE_FACILITY", enumType.getName());
        assertEquals("SWING - Swing Line Facility", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.getID());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.getName());
        assertEquals("DINP - Debtor In Possession", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.getID());
        assertEquals("DEFAULTED_LOAN", enumType.getName());
        assertEquals("DEFLTED - Defaulted", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.getID());
        assertEquals("WITHDRAWN_LOAN", enumType.getName());
        assertEquals("WITHDRN - Withdrawn", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.getID());
        assertEquals("REPLACED_LOAN", enumType.getName());
        assertEquals("REPLACD - Replaced", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.getID());
        assertEquals("MATURED_LOAN", enumType.getName());
        assertEquals("MATURED - Matured", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.getID());
        assertEquals("AMENDED_AND_RESTATED", enumType.getName());
        assertEquals("AMENDED - Amended & Restated", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.getID());
        assertEquals("RETIRED_LOAN", enumType.getName());
        assertEquals("RETIRED - Retired", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Money Market msg types
         */
        enumType = Enum310UnderlyingSecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.getID());
        assertEquals("BANKERS_ACCEPTANCE", enumType.getName());
        assertEquals("BA - Bankers Acceptance", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.BANK_NOTES;
        assertEquals("BN", enumType.getID());
        assertEquals("BANK_NOTES", enumType.getName());
        assertEquals("BN - Bank Notes", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.getID());
        assertEquals("BILL_OF_EXCHANGES", enumType.getName());
        assertEquals("BOX - Bill Of Exchanges", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.getID());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("CD - Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CALL_LOANS;
        assertEquals("CL", enumType.getID());
        assertEquals("CALL_LOANS", enumType.getName());
        assertEquals("CL - Call Loans", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.getID());
        assertEquals("COMMERCIAL_PAPER", enumType.getName());
        assertEquals("CP - Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.getID());
        assertEquals("DEPOSIT_NOTES", enumType.getName());
        assertEquals("DN - Deposit Notes", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.getID());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.getID());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("EUCP - Euro Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.getID());
        assertEquals("LIQUIDITY_NOTE", enumType.getName());
        assertEquals("LQN - Liquidity Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.getID());
        assertEquals("MEDIUM_TERM_NOTES", enumType.getName());
        assertEquals("MTN - Medium Term Notes", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.getID());
        assertEquals("OVERNIGHT", enumType.getName());
        assertEquals("ONITE - Overnight", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.getID());
        assertEquals("PROMISSORY_NOTE", enumType.getName());
        assertEquals("PN - Promissory Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.getID());
        assertEquals("PLAZOS_FIJOS", enumType.getName());
        assertEquals("PZFJ - Plazos Fijos", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.getID());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.getName());
        assertEquals("STN - Short Term Loan Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.getID());
        assertEquals("TIME_DEPOSIT", enumType.getName());
        assertEquals("TD - Time Deposit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.getID());
        assertEquals("EXTENDED_COMM_NOTE", enumType.getName());
        assertEquals("XCN - Extended Comm Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.getID());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Mortgage msg types
         */
        enumType = Enum310UnderlyingSecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.getID());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.getName());
        assertEquals("ABS - Asset-backed Securities", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.getID());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.getID());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.getName());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.getID());
        assertEquals("IOETTE_MORTGAGE", enumType.getName());
        assertEquals("IET - IOETTE Mortgage", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.getID());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("MBS - Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.getID());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.getName());
        assertEquals("MIO - Mortgage Interest Only", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.getID());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.getName());
        assertEquals("MPO - Mortgage Principal Only", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.getID());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("MPP - Mortgage Private Placement", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.getID());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.getName());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.getID());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("PFAND - Pfandbriefe", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.getID());
        assertEquals("TO_BE_ANNOUNCED", enumType.getName());
        assertEquals("TBA - To Be Announced", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Municipal msg types
         */
        enumType = Enum310UnderlyingSecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.getID());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.getName());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.getID());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.getName());
        assertEquals("COFO - Certificate Of Obligation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.getID());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.getName());
        assertEquals("COFP - Certificate Of Participation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.getID());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.getName());
        assertEquals("GO - General Obligation Bonds", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.getID());
        assertEquals("MANDATORY_TENDER", enumType.getName());
        assertEquals("MT - Mandatory Tender", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.getID());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("RAN - Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.getID());
        assertEquals("REVENUE_BONDS", enumType.getName());
        assertEquals("REV - Revenue Bonds", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.getID());
        assertEquals("SPECIAL_ASSESSMENT", enumType.getName());
        assertEquals("SPCLA - Special Assessment", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.getID());
        assertEquals("SPECIAL_OBLIGATION", enumType.getName());
        assertEquals("SPCLO - Special Obligation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.getID());
        assertEquals("SPECIAL_TAX", enumType.getName());
        assertEquals("SPCLT - Special Tax", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.getID());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TAN - Tax Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.getID());
        assertEquals("TAX_ALLOCATION", enumType.getName());
        assertEquals("TAXA - Tax Allocation", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.getID());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.getID());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.getID());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.getName());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.WARRANT;
        assertEquals("WAR", enumType.getID());
        assertEquals("WARRANT", enumType.getName());
        assertEquals("WAR - Warrant", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());



        /**
         * Other msg types
         */
        enumType = Enum310UnderlyingSecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.getID());
        assertEquals("MUTUAL_FUND", enumType.getName());
        assertEquals("MF - Mutual Fund", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.getID());
        assertEquals("MULTILEG_INSTRUMENT", enumType.getName());
        assertEquals("MLEG - Multileg Instrument", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.getID());
        assertEquals("NO_SECURITY_TYPE", enumType.getName());
        assertEquals("NONE - No Security Type", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.getID());
        assertEquals("OPTIONS_ON_FUTURES", enumType.getName());
        assertEquals("OOF - Options on Futures", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.getID());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.getName());
        assertEquals("OOP - Options on Physical", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.getID());
        assertEquals("WILDCARD_ENTRY", enumType.getName());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)",
                enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum310UnderlyingSecurityType.CASH;
        assertEquals("CASH", enumType.getID());
        assertEquals("CASH", enumType.getName());
        assertEquals("CASH - Cash", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
}