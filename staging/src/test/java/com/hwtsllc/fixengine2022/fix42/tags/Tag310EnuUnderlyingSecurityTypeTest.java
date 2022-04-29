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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum310UnderlyingSecurityType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag310EnuUnderlyingSecurityTypeTest {
    @Test
    void FIX0310Test() {
        FIX42 fixData = FIX42.FIX310_ENU_UNDERLYING_SECURITY_TYPE;
        assertEquals( "310", fixData.getID());
        assertEquals( "UNDERLYING_SECURITY_TYPE", fixData.getName());
        assertEquals( "UnderlyingSecurityType", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  310 (same as TAGS 167, 310, 609)
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
    void Tag0310Test() {
        Tag310EnuUnderlyingSecurityType tagData;

        /**
         * Deprecated, 4
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEPRECATED_FUTURE);
        assertEquals( Enum310UnderlyingSecurityType.DEPRECATED_FUTURE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEPRECATED_OPTION);
        assertEquals( Enum310UnderlyingSecurityType.DEPRECATED_OPTION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( Enum310UnderlyingSecurityType.DEPRECATED_US_TREASURY_BILL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Agency, 5
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( Enum310UnderlyingSecurityType.EURO_SUPRANATIONAL_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( Enum310UnderlyingSecurityType.FEDERAL_AGENCY_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( Enum310UnderlyingSecurityType.PRIVATE_EXPORT_FUNDING.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( Enum310UnderlyingSecurityType.USD_SUPRANATIONAL_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Corporate, 8
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CORPORATE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.CORPORATE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( Enum310UnderlyingSecurityType.CORPORATE_PRIVATE_PLACEMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CONVERTIBLE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.CONVERTIBLE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DUAL_CURRENCY);
        assertEquals( Enum310UnderlyingSecurityType.DUAL_CURRENCY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EURO_CORPORATE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.EURO_CORPORATE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.INDEXED_LINKED);
        assertEquals( Enum310UnderlyingSecurityType.INDEXED_LINKED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.STRUCTURED_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.STRUCTURED_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.YANKEE_CORPORATE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Currency, 1
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( Enum310UnderlyingSecurityType.FOREIGN_EXCHANGE_CONTRACT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Equity, 2
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.COMMON_STOCK);
        assertEquals( Enum310UnderlyingSecurityType.COMMON_STOCK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PREFERRED_STOCK);
        assertEquals( Enum310UnderlyingSecurityType.PREFERRED_STOCK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Finance, 5
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REPURCHASE);
        assertEquals( Enum310UnderlyingSecurityType.REPURCHASE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.FORWARD);
        assertEquals( Enum310UnderlyingSecurityType.FORWARD.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BUY_SELLBACK);
        assertEquals( Enum310UnderlyingSecurityType.BUY_SELLBACK.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SECURITIES_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.SECURITIES_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SECURITIES_PLEDGE);
        assertEquals( Enum310UnderlyingSecurityType.SECURITIES_PLEDGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Government, 9
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BRADY_BOND);
        assertEquals( Enum310UnderlyingSecurityType.BRADY_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EURO_SOVEREIGNS);
        assertEquals( Enum310UnderlyingSecurityType.EURO_SOVEREIGNS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.US_TREASURY_BOND);
        assertEquals( Enum310UnderlyingSecurityType.US_TREASURY_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( Enum310UnderlyingSecurityType.INTEREST_STRIP_ANY_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( Enum310UnderlyingSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( Enum310UnderlyingSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.US_TREASURY_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.US_TREASURY_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.US_TREASURY_BILL);
        assertEquals( Enum310UnderlyingSecurityType.US_TREASURY_BILL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Loan, 13
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TERM_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.TERM_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REVOLVER_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.REVOLVER_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.REVOLVER_TERM_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BRIDGE_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.BRIDGE_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.LETTER_OF_CREDIT);
        assertEquals( Enum310UnderlyingSecurityType.LETTER_OF_CREDIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SWING_LINE_FACILITY);
        assertEquals( Enum310UnderlyingSecurityType.SWING_LINE_FACILITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( Enum310UnderlyingSecurityType.DEBTOR_IN_POSSESSION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEFAULTED_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.DEFAULTED_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.WITHDRAWN_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.WITHDRAWN_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REPLACED_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.REPLACED_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MATURED_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.MATURED_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.AMENDED_AND_RESTATED);
        assertEquals( Enum310UnderlyingSecurityType.AMENDED_AND_RESTATED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.RETIRED_LOAN);
        assertEquals( Enum310UnderlyingSecurityType.RETIRED_LOAN.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Money Market, 18
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( Enum310UnderlyingSecurityType.BANKERS_ACCEPTANCE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BANK_NOTES);
        assertEquals( Enum310UnderlyingSecurityType.BANK_NOTES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.BILL_OF_EXCHANGES);
        assertEquals( Enum310UnderlyingSecurityType.BILL_OF_EXCHANGES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum310UnderlyingSecurityType.CERTIFICATE_OF_DEPOSIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CALL_LOANS);
        assertEquals( Enum310UnderlyingSecurityType.CALL_LOANS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.COMMERCIAL_PAPER);
        assertEquals( Enum310UnderlyingSecurityType.COMMERCIAL_PAPER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.DEPOSIT_NOTES);
        assertEquals( Enum310UnderlyingSecurityType.DEPOSIT_NOTES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum310UnderlyingSecurityType.EURO_CERTIFICATE_OF_DEPOSIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( Enum310UnderlyingSecurityType.EURO_COMMERCIAL_PAPER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.LIQUIDITY_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.LIQUIDITY_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( Enum310UnderlyingSecurityType.MEDIUM_TERM_NOTES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.OVERNIGHT);
        assertEquals( Enum310UnderlyingSecurityType.OVERNIGHT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PROMISSORY_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.PROMISSORY_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PLAZOS_FIJOS);
        assertEquals( Enum310UnderlyingSecurityType.PLAZOS_FIJOS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.SHORT_TERM_LOAN_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TIME_DEPOSIT);
        assertEquals( Enum310UnderlyingSecurityType.TIME_DEPOSIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.EXTENDED_COMM_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( Enum310UnderlyingSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Mortgage, 11
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( Enum310UnderlyingSecurityType.ASSET_BACKED_SECURITIES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( Enum310UnderlyingSecurityType.CORP_MORTGAGE_BACKED_SECURITIES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( Enum310UnderlyingSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.IOETTE_MORTGAGE);
        assertEquals( Enum310UnderlyingSecurityType.IOETTE_MORTGAGE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( Enum310UnderlyingSecurityType.MORTGAGE_BACKED_SECURITIES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( Enum310UnderlyingSecurityType.MORTGAGE_INTEREST_ONLY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( Enum310UnderlyingSecurityType.MORTGAGE_PRINCIPAL_ONLY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( Enum310UnderlyingSecurityType.MORTGAGE_PRIVATE_PLACEMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( Enum310UnderlyingSecurityType.MISCELLANEOUS_PASS_THROUGH.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.PFANDBRIEFE);
        assertEquals( Enum310UnderlyingSecurityType.PFANDBRIEFE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TO_BE_ANNOUNCED);
        assertEquals( Enum310UnderlyingSecurityType.TO_BE_ANNOUNCED.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Municipal, 16
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( Enum310UnderlyingSecurityType.OTHER_ANTICIPATION_NOTES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( Enum310UnderlyingSecurityType.CERTIFICATE_OF_OBLIGATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( Enum310UnderlyingSecurityType.CERTIFICATE_OF_PARTICIPATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( Enum310UnderlyingSecurityType.GENERAL_OBLIGATION_BONDS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MANDATORY_TENDER);
        assertEquals( Enum310UnderlyingSecurityType.MANDATORY_TENDER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.REVENUE_ANTICIPATION_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.REVENUE_BONDS);
        assertEquals( Enum310UnderlyingSecurityType.REVENUE_BONDS.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( Enum310UnderlyingSecurityType.SPECIAL_ASSESSMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SPECIAL_OBLIGATION);
        assertEquals( Enum310UnderlyingSecurityType.SPECIAL_OBLIGATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.SPECIAL_TAX);
        assertEquals( Enum310UnderlyingSecurityType.SPECIAL_TAX.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.TAX_ANTICIPATION_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TAX_ALLOCATION);
        assertEquals( Enum310UnderlyingSecurityType.TAX_ALLOCATION.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( Enum310UnderlyingSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.TAX_REVENUE_ANTICIPATION_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( Enum310UnderlyingSecurityType.VARIABLE_RATE_DEMAND_NOTE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.WARRANT);
        assertEquals( Enum310UnderlyingSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Other, 7
         */
        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MUTUAL_FUND);
        assertEquals( Enum310UnderlyingSecurityType.MUTUAL_FUND.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( Enum310UnderlyingSecurityType.MULTILEG_INSTRUMENT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.NO_SECURITY_TYPE);
        assertEquals( Enum310UnderlyingSecurityType.NO_SECURITY_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( Enum310UnderlyingSecurityType.OPTIONS_ON_FUTURES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( Enum310UnderlyingSecurityType.OPTIONS_ON_PHYSICAL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.WILDCARD_ENTRY);
        assertEquals( Enum310UnderlyingSecurityType.WILDCARD_ENTRY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag310EnuUnderlyingSecurityType(Enum310UnderlyingSecurityType.CASH);
        assertEquals( Enum310UnderlyingSecurityType.CASH.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}