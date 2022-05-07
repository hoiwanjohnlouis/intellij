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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSecurityType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  609 (same as TAGS 167, 310, 609)
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
class Tag609EnuLegSecurityTypeTest {
    @Test
    void FIX0609Test() {
        FIX43 fixData = FIX43.FIX609_ENU_LEG_SECURITY_TYPE;
        assertEquals( "609", fixData.getID());
        assertEquals( "LEG_SECURITY_TYPE", fixData.getName());
        assertEquals( "LegSecurityType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0609Test() {
        Tag609EnuLegSecurityType tagData;


        /**
         * Deprecated, 4
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEPRECATED_FUTURE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEPRECATED_OPTION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Agency, 5
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Corporate, 8
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CONVERTIBLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DUAL_CURRENCY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EURO_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.INDEXED_LINKED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.STRUCTURED_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Currency, 1
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Equity, 2
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.COMMON_STOCK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PREFERRED_STOCK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Finance, 5
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REPURCHASE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.FORWARD);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BUY_SELLBACK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SECURITIES_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SECURITIES_PLEDGE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Government, 9
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BRADY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EURO_SOVEREIGNS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.US_TREASURY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Loan, 13
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TERM_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REVOLVER_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BRIDGE_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.LETTER_OF_CREDIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SWING_LINE_FACILITY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEFAULTED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.WITHDRAWN_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REPLACED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MATURED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.AMENDED_AND_RESTATED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.RETIRED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Money Market, 18
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BANK_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.BILL_OF_EXCHANGES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CALL_LOANS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.DEPOSIT_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.LIQUIDITY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.OVERNIGHT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PROMISSORY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PLAZOS_FIJOS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TIME_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Mortgage, 11
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.IOETTE_MORTGAGE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.PFANDBRIEFE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TO_BE_ANNOUNCED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Municipal, 16
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MANDATORY_TENDER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.REVENUE_BONDS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SPECIAL_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.SPECIAL_TAX);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TAX_ALLOCATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.WARRANT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * Other, 7
         */
        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MUTUAL_FUND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.NO_SECURITY_TYPE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.WILDCARD_ENTRY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag609EnuLegSecurityType(MyEnumSecurityType.CASH);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}