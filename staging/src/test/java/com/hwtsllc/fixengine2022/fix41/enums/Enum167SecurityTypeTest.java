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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum167SecurityTypeTest {
    /**
     *  167 (same as TAGS 167, 310, 609)
     *  UnderlyingSecurityType
     *
     *      Deprecated, 4
     *      DEPRECATED_FUTURE( "FUT", "DEPRECATED_FUTURE", "FUT - Future (Deprecated)" ),
     *      DEPRECATED_OPTION( "OPT", "DEPRECATED_OPTION", "OPT - Option (Deprecated)" ),
     *      DEPRECATED_US_TREASURY_NOTE( "UST", "DEPRECATED_US_TREASURY_NOTE",
     *                          "UST - US Treasury Note (Deprecated Value Use TNOTE)" ),
     *      DEPRECATED_US_TREASURY_BILL( "USTB", "DEPRECATED_US_TREASURY_BILL",
     *                          "USTB - US Treasury Bill (Deprecated Value Use TBILL)" ),
     *
     *      Agency, 5
     *      EURO_SUPRANATIONAL_COUPON( "EUSUPRA", "EURO_SUPRANATIONAL_COUPON",
     *                          "EUSUPRA - Euro Supranational Coupon (Agency)" ),
     *      FEDERAL_AGENCY_COUPON( "FAC", "FEDERAL_AGENCY_COUPON", "FAC - Federal Agency Coupon" ),
     *      FEDERAL_AGENCY_DISCOUNT_NOTE( "FADN", "FEDERAL_AGENCY_DISCOUNT_NOTE",
     *                          "FADN - Federal Agency Discount Note" ),
     *      PRIVATE_EXPORT_FUNDING( "PEF", "PRIVATE_EXPORT_FUNDING", "PEF - Private Export Funding (Agency)" ),
     *      USD_SUPRANATIONAL_COUPON( "SUPRA", "USD_SUPRANATIONAL_COUPON",
     *                          "SUPRA - USD Supranational Coupons (Agency)" ),
     *
     *      Corporate, 8
     *      CORPORATE_BOND( "CORP", "CORPORATE_BOND", "CORP - Corporate Bond" ),
     *      CORPORATE_PRIVATE_PLACEMENT( "CPP", "CORPORATE_PRIVATE_PLACEMENT", "CPP - Corporate Private Placement" ),
     *      CONVERTIBLE_BOND( "CB", "CONVERTIBLE_BOND", "CB - Convertible Bond (Corporate)" ),
     *      DUAL_CURRENCY( "DUAL", "DUAL_CURRENCY", "DUAL - Dual Currency (Corporate)" ),
     *      EURO_CORPORATE_BOND( "EUCORP", "EURO_CORPORATE_BOND", "EUCORP - Euro Corporate Bond" ),
     *      INDEXED_LINKED( "XLINKD", "INDEXED_LINKED", "XLINKD - Indexed Linked (Corporate)" ),
     *      STRUCTURED_NOTE( "STRUCT", "STRUCTURED_NOTE", "STRUCT - Structured Note (Corporate)" ),
     *      YANKEE_CORPORATE_BOND( "YANK", "YANKEE_CORPORATE_BOND", "YANK - Yankee Corporate Bond" ),
     *
     *      Currency, 1
     *      FOREIGN_EXCHANGE_CONTRACT( "FOR", "FOREIGN_EXCHANGE_CONTRACT",
     *                          "FOR - Foreign Exchange Contract (Currency)" ),
     *
     *      Equity, 2
     *      COMMON_STOCK( "CS", "COMMON_STOCK", "CS - Common Stock (Equity)" ),
     *      PREFERRED_STOCK( "PS", "PREFERRED_STOCK", "PS - Preferred Stock (Equity)" ),
     *
     *      Finance, 5
     *      REPURCHASE( "REPO", "REPURCHASE", "REPO - Repurchase (Financing)" ),
     *      FORWARD( "FORWARD", "FORWARD", "FORWARD - Forward (Financing)" ),
     *      BUY_SELLBACK( "BUYSELL", "BUY_SELLBACK", "BUYSELL - Buy Sellback (Financing)" ),
     *      SECURITIES_LOAN( "SECLOAN", "SECURITIES_LOAN", "SECLOAN - Securities Loan (Financing)" ),
     *      SECURITIES_PLEDGE( "SECPLEDGE", "SECURITIES_PLEDGE", "SECPLEDGE - Securities Pledge (Financing)" ),
     *
     *      Government, 9
     *      BRADY_BOND( "BRADY", "BRADY_BOND", "BRADY - Brady Bond (Government)" ),
     *      EURO_SOVEREIGNS( "EUSOV", "EURO_SOVEREIGNS", "EUSOV - Euro Sovereigns (Government)" ),
     *      US_TREASURY_BOND( "TBOND", "US_TREASURY_BOND", "TBOND - US Treasury Bond (Government)" ),
     *      INTEREST_STRIP_ANY_BOND( "TINT", "INTEREST_STRIP_ANY_BOND",
     *                          "TINT - Interest Strip From Any Bond Or Note (Government)" ),
     *      TREASURY_INFLATION_PROTECTED_SECURITIES( "TIPS", "TREASURY_INFLATION_PROTECTED_SECURITIES",
     *                          "TIPS - Treasury Inflation Protected Securities (Government)" ),
     *      PRINCIPAL_STRIP_CALLABLE_BOND( "TCAL", "PRINCIPAL_STRIP_CALLABLE_BOND",
     *                          "TCAL - Principal Strip Of A Callable Bond Or Note (Government)" ),
     *      PRINCIPAL_STRIP_NON_CALLABLE_BOND( "TPRN", "PRINCIPAL_STRIP_NON_CALLABLE_BOND",
     *                          "TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)" ),
     *      US_TREASURY_NOTE( "TNOTE", "US_TREASURY_NOTE", "TNOTE - US Treasury Note (Government)" ),
     *      US_TREASURY_BILL( "TBILL", "US_TREASURY_BILL", "TBILL - US Treasury Bill (Government)" ),
     *
     *      Loan, 13
     *      TERM_LOAN( "TERM", "TERM_LOAN", "TERM - Term Loan" ),
     *      REVOLVER_LOAN( "RVLV", "REVOLVER_LOAN", "RVLV - Revolver Loan" ),
     *      REVOLVER_TERM_LOAN( "RVLVTRM", "REVOLVER_TERM_LOAN", "RVLVTRM - Revolver/Term Loan" ),
     *      BRIDGE_LOAN( "BRIDGE", "BRIDGE_LOAN", "BRIDGE - Bridge Loan" ),
     *      LETTER_OF_CREDIT( "LOFC", "LETTER_OF_CREDIT", "LOFC - Letter Of Credit" ),
     *      SWING_LINE_FACILITY( "SWING", "SWING_LINE_FACILITY", "SWING - Swing Line Facility" ),
     *      DEBTOR_IN_POSSESSION( "DINP", "DEBTOR_IN_POSSESSION", "DINP - Debtor In Possession" ),
     *      DEFAULTED_LOAN( "DEFLTED", "DEFAULTED_LOAN", "DEFLTED - Defaulted" ),
     *      WITHDRAWN_LOAN( "WITHDRN", "WITHDRAWN_LOAN", "WITHDRN - Withdrawn" ),
     *      REPLACED_LOAN( "REPLACD", "REPLACED_LOAN", "REPLACD - Replaced" ),
     *      MATURED_LOAN( "MATURED", "MATURED_LOAN", "MATURED - Matured" ),
     *      AMENDED_AND_RESTATED( "AMENDED", "AMENDED_AND_RESTATED", "AMENDED - Amended & Restated" ),
     *      RETIRED_LOAN( "RETIRED", "RETIRED_LOAN", "RETIRED - Retired" ),
     *
     *      Money Market, 18
     *      BANKERS_ACCEPTANCE( "BA", "BANKERS_ACCEPTANCE", "BA - Bankers Acceptance" ),
     *      BANK_NOTES( "BN", "BANK_NOTES", "BN - Bank Notes" ),
     *      BILL_OF_EXCHANGES( "BOX", "BILL_OF_EXCHANGES", "BOX - Bill Of Exchanges" ),
     *      CERTIFICATE_OF_DEPOSIT( "CD", "CERTIFICATE_OF_DEPOSIT", "CD - Certificate Of Deposit" ),
     *      CALL_LOANS( "CL", "CALL_LOANS", "CL - Call Loans" ),
     *      COMMERCIAL_PAPER( "CP", "COMMERCIAL_PAPER", "CP - Commercial Paper" ),
     *      DEPOSIT_NOTES( "DN", "DEPOSIT_NOTES", "DN - Deposit Notes" ),
     *      EURO_CERTIFICATE_OF_DEPOSIT( "EUCD", "EURO_CERTIFICATE_OF_DEPOSIT", "EUCD - Euro Certificate Of Deposit" ),
     *      EURO_COMMERCIAL_PAPER( "EUCP", "EURO_COMMERCIAL_PAPER", "EUCP - Euro Commercial Paper" ),
     *      LIQUIDITY_NOTE( "LQN", "LIQUIDITY_NOTE", "LQN - Liquidity Note" ),
     *      MEDIUM_TERM_NOTES( "MTN", "MEDIUM_TERM_NOTES", "MTN - Medium Term Notes" ),
     *      OVERNIGHT( "ONITE", "OVERNIGHT", "ONITE - Overnight" ),
     *      PROMISSORY_NOTE( "PN", "PROMISSORY_NOTE", "PN - Promissory Note" ),
     *      PLAZOS_FIJOS( "PZFJ", "PLAZOS_FIJOS", "PZFJ - Plazos Fijos" ),
     *      SHORT_TERM_LOAN_NOTE( "STN", "SHORT_TERM_LOAN_NOTE", "STN - Short Term Loan Note" ),
     *      TIME_DEPOSIT( "TD", "TIME_DEPOSIT", "TD - Time Deposit" ),
     *      EXTENDED_COMM_NOTE( "XCN", "EXTENDED_COMM_NOTE", "XCN - Extended Comm Note" ),
     *      YANKEE_CERTIFICATE_OF_DEPOSIT( "YCD", "YANKEE_CERTIFICATE_OF_DEPOSIT",
     *                          "YCD - Yankee Certificate Of Deposit" ),
     *
     *      Mortgage, 11
     *      ASSET_BACKED_SECURITIES( "ABS", "ASSET_BACKED_SECURITIES", "ABS - Asset-backed Securities" ),
     *      CORP_MORTGAGE_BACKED_SECURITIES( "CMBS", "CORP_MORTGAGE_BACKED_SECURITIES",
     *                          "CMBS - Corp. Mortgage-backed Securities" ),
     *      COLLATERALIZED_MORTGAGE_OBLIGATION( "CMO", "COLLATERALIZED_MORTGAGE_OBLIGATION",
     *                          "CMO - Collateralized Mortgage Obligation" ),
     *      IOETTE_MORTGAGE( "IET", "IOETTE_MORTGAGE", "IET - IOETTE Mortgage" ),
     *      MORTGAGE_BACKED_SECURITIES( "MBS", "MORTGAGE_BACKED_SECURITIES", "MBS - Mortgage-backed Securities" ),
     *      MORTGAGE_INTEREST_ONLY( "MIO", "MORTGAGE_INTEREST_ONLY", "MIO - Mortgage Interest Only" ),
     *      MORTGAGE_PRINCIPAL_ONLY( "MPO", "MORTGAGE_PRINCIPAL_ONLY", "MPO - Mortgage Principal Only" ),
     *      MORTGAGE_PRIVATE_PLACEMENT( "MPP", "MORTGAGE_PRIVATE_PLACEMENT", "MPP - Mortgage Private Placement" ),
     *      MISCELLANEOUS_PASS_THROUGH( "MPT", "MISCELLANEOUS_PASS_THROUGH", "MPT - Miscellaneous Pass-through" ),
     *      PFANDBRIEFE( "PFAND", "PFANDBRIEFE", "PFAND - Pfandbriefe" ),
     *      TO_BE_ANNOUNCED( "TBA", "TO_BE_ANNOUNCED", "TBA - To Be Announced" ),
     *
     *      Municipal, 16
     *      OTHER_ANTICIPATION_NOTES( "AN", "OTHER_ANTICIPATION_NOTES",
     *                          "AN - Other Anticipation Notes (BAN, GAN, etc.)" ),
     *      CERTIFICATE_OF_OBLIGATION( "COFO", "CERTIFICATE_OF_OBLIGATION",
     *                          "COFO - Certificate Of Obligation" ),
     *      CERTIFICATE_OF_PARTICIPATION( "COFP", "CERTIFICATE_OF_PARTICIPATION",
     *                          "COFP - Certificate Of Participation" ),
     *      GENERAL_OBLIGATION_BONDS( "GO", "GENERAL_OBLIGATION_BONDS", "GO - General Obligation Bonds" ),
     *      MANDATORY_TENDER( "MT", "MANDATORY_TENDER", "MT - Mandatory Tender" ),
     *      REVENUE_ANTICIPATION_NOTE( "RAN", "REVENUE_ANTICIPATION_NOTE", "RAN - Revenue Anticipation Note" ),
     *      REVENUE_BONDS( "REV", "REVENUE_BONDS", "REV - Revenue Bonds" ),
     *      SPECIAL_ASSESSMENT( "SPCLA", "SPECIAL_ASSESSMENT", "SPCLA - Special Assessment" ),
     *      SPECIAL_OBLIGATION( "SPCLO", "SPECIAL_OBLIGATION", "SPCLO - Special Obligation" ),
     *      SPECIAL_TAX( "SPCLT", "SPECIAL_TAX", "SPCLT - Special Tax" ),
     *      TAX_ANTICIPATION_NOTE( "TAN", "TAX_ANTICIPATION_NOTE", "TAN - Tax Anticipation Note" ),
     *      TAX_ALLOCATION( "TAXA", "TAX_ALLOCATION", "TAXA - Tax Allocation" ),
     *      TAX_EXEMPT_COMMERCIAL_PAPER( "TECP", "TAX_EXEMPT_COMMERCIAL_PAPER",
     *                          "TECP - Tax Exempt Commercial Paper" ),
     *      TAX_REVENUE_ANTICIPATION_NOTE( "TRAN", "TAX_REVENUE_ANTICIPATION_NOTE",
     *                          "TRAN - Tax Revenue Anticipation Note" ),
     *      VARIABLE_RATE_DEMAND_NOTE( "VRDN", "VARIABLE_RATE_DEMAND_NOTE", "VRDN - Variable Rate Demand Note" ),
     *      WARRANT( "WAR", "WARRANT", "WAR - Warrant" ),
     *
     *      Other, 7
     *      MUTUAL_FUND( "MF", "MUTUAL_FUND", "MF - Mutual Fund" ),
     *      MULTILEG_INSTRUMENT( "MLEG", "MULTILEG_INSTRUMENT", "MLEG - Multileg Instrument" ),
     *      NO_SECURITY_TYPE( "NONE", "NO_SECURITY_TYPE", "NONE - No Security Type" ),
     *      OPTIONS_ON_FUTURES( "OOF", "OPTIONS_ON_FUTURES", "OOF - Options on Futures" ),
     *      OPTIONS_ON_PHYSICAL( "OOP", "OPTIONS_ON_PHYSICAL", "OOP - Options on Physical" ),
     *      WILDCARD_ENTRY( "WLD", "WILDCARD_ENTRY",
     *                          "WLD - Wildcard Entry (used on Security Definition Request message)" ),
     *      CASH( "CASH", "CASH", "CASH - Cash" ),
     */
    @Test
    void Enum0167Test() {
        Enum167SecurityType enumType;

        /*
         * Deprecated msg types
         */
        enumType = Enum167SecurityType.DEPRECATED_FUTURE;
        assertEquals("FUT", enumType.getID());
        assertEquals("DEPRECATED_FUTURE", enumType.getName());
        assertEquals("FUT - Future (Deprecated)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.getID());
        assertEquals("DEPRECATED_OPTION", enumType.getName());
        assertEquals("OPT - Option (Deprecated)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.getName());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.getName());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Agency msg types
         */
        enumType = Enum167SecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.getID());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.getID());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.getName());
        assertEquals("FAC - Federal Agency Coupon", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.getID());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.getName());
        assertEquals("FADN - Federal Agency Discount Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.getID());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.getName());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.getID());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Corporate msg types
         */
        enumType = Enum167SecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.getID());
        assertEquals("CORPORATE_BOND", enumType.getName());
        assertEquals("CORP - Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.getID());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("CPP - Corporate Private Placement", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.getID());
        assertEquals("CONVERTIBLE_BOND", enumType.getName());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.getID());
        assertEquals("DUAL_CURRENCY", enumType.getName());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.getID());
        assertEquals("EURO_CORPORATE_BOND", enumType.getName());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.getID());
        assertEquals("INDEXED_LINKED", enumType.getName());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.getID());
        assertEquals("STRUCTURED_NOTE", enumType.getName());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.getID());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.getName());
        assertEquals("YANK - Yankee Corporate Bond", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Currency msg types
         */
        enumType = Enum167SecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.getID());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.getName());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Equity msg types
         */
        enumType = Enum167SecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.getID());
        assertEquals("COMMON_STOCK", enumType.getName());
        assertEquals("CS - Common Stock (Equity)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.getID());
        assertEquals("PREFERRED_STOCK", enumType.getName());
        assertEquals("PS - Preferred Stock (Equity)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Finance msg types
         */
        enumType = Enum167SecurityType.REPURCHASE;
        assertEquals("REPO", enumType.getID());
        assertEquals("REPURCHASE", enumType.getName());
        assertEquals("REPO - Repurchase (Financing)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.FORWARD;
        assertEquals("FORWARD", enumType.getID());
        assertEquals("FORWARD", enumType.getName());
        assertEquals("FORWARD - Forward (Financing)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.getID());
        assertEquals("BUY_SELLBACK", enumType.getName());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.getID());
        assertEquals("SECURITIES_LOAN", enumType.getName());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.getID());
        assertEquals("SECURITIES_PLEDGE", enumType.getName());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Government msg types
         */
        enumType = Enum167SecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.getID());
        assertEquals("BRADY_BOND", enumType.getName());
        assertEquals("BRADY - Brady Bond (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.getID());
        assertEquals("EURO_SOVEREIGNS", enumType.getName());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.getID());
        assertEquals("US_TREASURY_BOND", enumType.getName());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.getID());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.getName());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.getID());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.getName());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.getName());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.getName());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.getID());
        assertEquals("US_TREASURY_NOTE", enumType.getName());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.getID());
        assertEquals("US_TREASURY_BILL", enumType.getName());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Loan msg types
         */
        enumType = Enum167SecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.getID());
        assertEquals("TERM_LOAN", enumType.getName());
        assertEquals("TERM - Term Loan", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.getID());
        assertEquals("REVOLVER_LOAN", enumType.getName());
        assertEquals("RVLV - Revolver Loan", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.getID());
        assertEquals("REVOLVER_TERM_LOAN", enumType.getName());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.getID());
        assertEquals("BRIDGE_LOAN", enumType.getName());
        assertEquals("BRIDGE - Bridge Loan", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.getID());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("LOFC - Letter Of Credit", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.getID());
        assertEquals("SWING_LINE_FACILITY", enumType.getName());
        assertEquals("SWING - Swing Line Facility", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.getID());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.getName());
        assertEquals("DINP - Debtor In Possession", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.getID());
        assertEquals("DEFAULTED_LOAN", enumType.getName());
        assertEquals("DEFLTED - Defaulted", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.getID());
        assertEquals("WITHDRAWN_LOAN", enumType.getName());
        assertEquals("WITHDRN - Withdrawn", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.getID());
        assertEquals("REPLACED_LOAN", enumType.getName());
        assertEquals("REPLACD - Replaced", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.getID());
        assertEquals("MATURED_LOAN", enumType.getName());
        assertEquals("MATURED - Matured", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.getID());
        assertEquals("AMENDED_AND_RESTATED", enumType.getName());
        assertEquals("AMENDED - Amended & Restated", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.getID());
        assertEquals("RETIRED_LOAN", enumType.getName());
        assertEquals("RETIRED - Retired", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Money Market msg types
         */
        enumType = Enum167SecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.getID());
        assertEquals("BANKERS_ACCEPTANCE", enumType.getName());
        assertEquals("BA - Bankers Acceptance", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.BANK_NOTES;
        assertEquals("BN", enumType.getID());
        assertEquals("BANK_NOTES", enumType.getName());
        assertEquals("BN - Bank Notes", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.getID());
        assertEquals("BILL_OF_EXCHANGES", enumType.getName());
        assertEquals("BOX - Bill Of Exchanges", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.getID());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("CD - Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CALL_LOANS;
        assertEquals("CL", enumType.getID());
        assertEquals("CALL_LOANS", enumType.getName());
        assertEquals("CL - Call Loans", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.getID());
        assertEquals("COMMERCIAL_PAPER", enumType.getName());
        assertEquals("CP - Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.getID());
        assertEquals("DEPOSIT_NOTES", enumType.getName());
        assertEquals("DN - Deposit Notes", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.getID());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.getID());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("EUCP - Euro Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.getID());
        assertEquals("LIQUIDITY_NOTE", enumType.getName());
        assertEquals("LQN - Liquidity Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.getID());
        assertEquals("MEDIUM_TERM_NOTES", enumType.getName());
        assertEquals("MTN - Medium Term Notes", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.getID());
        assertEquals("OVERNIGHT", enumType.getName());
        assertEquals("ONITE - Overnight", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.getID());
        assertEquals("PROMISSORY_NOTE", enumType.getName());
        assertEquals("PN - Promissory Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.getID());
        assertEquals("PLAZOS_FIJOS", enumType.getName());
        assertEquals("PZFJ - Plazos Fijos", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.getID());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.getName());
        assertEquals("STN - Short Term Loan Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.getID());
        assertEquals("TIME_DEPOSIT", enumType.getName());
        assertEquals("TD - Time Deposit", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.getID());
        assertEquals("EXTENDED_COMM_NOTE", enumType.getName());
        assertEquals("XCN - Extended Comm Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.getID());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Mortgage msg types
         */
        enumType = Enum167SecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.getID());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.getName());
        assertEquals("ABS - Asset-backed Securities", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.getID());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.getID());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.getName());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.getID());
        assertEquals("IOETTE_MORTGAGE", enumType.getName());
        assertEquals("IET - IOETTE Mortgage", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.getID());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("MBS - Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.getID());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.getName());
        assertEquals("MIO - Mortgage Interest Only", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.getID());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.getName());
        assertEquals("MPO - Mortgage Principal Only", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.getID());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("MPP - Mortgage Private Placement", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.getID());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.getName());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.getID());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("PFAND - Pfandbriefe", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.getID());
        assertEquals("TO_BE_ANNOUNCED", enumType.getName());
        assertEquals("TBA - To Be Announced", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Municipal msg types
         */
        enumType = Enum167SecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.getID());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.getName());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.getID());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.getName());
        assertEquals("COFO - Certificate Of Obligation", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.getID());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.getName());
        assertEquals("COFP - Certificate Of Participation", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.getID());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.getName());
        assertEquals("GO - General Obligation Bonds", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.getID());
        assertEquals("MANDATORY_TENDER", enumType.getName());
        assertEquals("MT - Mandatory Tender", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.getID());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("RAN - Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.getID());
        assertEquals("REVENUE_BONDS", enumType.getName());
        assertEquals("REV - Revenue Bonds", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.getID());
        assertEquals("SPECIAL_ASSESSMENT", enumType.getName());
        assertEquals("SPCLA - Special Assessment", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.getID());
        assertEquals("SPECIAL_OBLIGATION", enumType.getName());
        assertEquals("SPCLO - Special Obligation", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.getID());
        assertEquals("SPECIAL_TAX", enumType.getName());
        assertEquals("SPCLT - Special Tax", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.getID());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TAN - Tax Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.getID());
        assertEquals("TAX_ALLOCATION", enumType.getName());
        assertEquals("TAXA - Tax Allocation", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.getID());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.getID());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.getID());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.getName());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.WARRANT;
        assertEquals("WAR", enumType.getID());
        assertEquals("WARRANT", enumType.getName());
        assertEquals("WAR - Warrant", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Other msg types
         */
        enumType = Enum167SecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.getID());
        assertEquals("MUTUAL_FUND", enumType.getName());
        assertEquals("MF - Mutual Fund", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.getID());
        assertEquals("MULTILEG_INSTRUMENT", enumType.getName());
        assertEquals("MLEG - Multileg Instrument", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.getID());
        assertEquals("NO_SECURITY_TYPE", enumType.getName());
        assertEquals("NONE - No Security Type", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.getID());
        assertEquals("OPTIONS_ON_FUTURES", enumType.getName());
        assertEquals("OOF - Options on Futures", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.getID());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.getName());
        assertEquals("OOP - Options on Physical", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.getID());
        assertEquals("WILDCARD_ENTRY", enumType.getName());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum167SecurityType.CASH;
        assertEquals("CASH", enumType.getID());
        assertEquals("CASH", enumType.getName());
        assertEquals("CASH - Cash", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());
    }
}