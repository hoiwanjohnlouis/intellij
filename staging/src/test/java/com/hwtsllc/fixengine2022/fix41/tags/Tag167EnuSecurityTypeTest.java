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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum167SecurityType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag167EnuSecurityTypeTest {
    @Test
    void FIX0167Test() {
        FIX41 fixData = FIX41.FIX167_ENU_SECURITY_TYPE;
        assertEquals( "167", fixData.getID());
        assertEquals( "SECURITY_TYPE", fixData.getName());
        assertEquals( "SecurityType", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0167Test() {
        Tag167EnuSecurityType tagData;

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
    }
}