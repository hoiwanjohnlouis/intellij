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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  167 (same as TAGS 167, 310, 609)
 *  SecurityType
 *  String
 *  <p>
 *  Indicates type of security.
 *  <p>
 *  See also the Product (460) and CFICode (461) fields.
 *  <p>
 *  It is recommended that CFICode be used instead of SecurityType for non-Fixed Income instruments.
 *  <p>
 *  Example values (grouped by Product field value)
 *  <p>
 *  (Note: additional values may be used by mutual agreement of the counterparties):
 *  Identify the Issuer in the "Issuer" field(106)
 *  <p>
 *  *** REPLACED values - See "Replaced Features and Supported Approach" ***
 *  <p>
 *  NOTE: Additional values may be used by mutual agreement of the counterparties
 *  <p></p>
 *  310
 *  UnderlyingSecurityType
 *  String
 *  <p>
 *  Underlying security’s SecurityType.
 *  <p>
 *  See SecurityType (167) field
 *  (see below for details concerning this fields use in conjunction with SecurityType=REPO)
 *  <p>
 *  The following applies when used in conjunction with SecurityType=REPO.
 *  Represents the general or specific type of security that underlies a financing agreement.
 *  <p>
 *  Valid values for SecurityType=REPO:
 *  <p>
 *  If bonds of a particular issuer or country are wanted in an Order or are in the basket of
 *  an Execution and the SecurityType is not granular enough, include the UnderlyingIssuer (306),
 *  UnderlyingCountryOfIssue (592), UnderlyingProgram, UnderlyingRegType and/or < UnderlyingStipulations > block
 *  <p></p>
 *  609
 *  LegSecurityType
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityType.
 *  <p>
 *  See SecurityType (167) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    Deprecated, 4
 *  <p>    DEPRECATED_FUTURE( "FUT", "DEPRECATED_FUTURE", "FUT - Future (Deprecated)" ),
 *  <p>    DEPRECATED_OPTION( "OPT", "DEPRECATED_OPTION", "OPT - Option (Deprecated)" ),
 *  <p>    DEPRECATED_US_TREASURY_NOTE( "UST", "DEPRECATED_US_TREASURY_NOTE",
 *                          "UST - US Treasury Note (Deprecated Value Use TNOTE)" ),
 *  <p>    DEPRECATED_US_TREASURY_BILL( "USTB", "DEPRECATED_US_TREASURY_BILL",
 *                          "USTB - US Treasury Bill (Deprecated Value Use TBILL)" ),
 *  <p></p>
 *      Agency, 5
 *  <p>    EURO_SUPRANATIONAL_COUPON( "EUSUPRA", "EURO_SUPRANATIONAL_COUPON",
 *                          "EUSUPRA - Euro Supranational Coupon (Agency)" ),
 *  <p>    FEDERAL_AGENCY_COUPON( "FAC", "FEDERAL_AGENCY_COUPON", "FAC - Federal Agency Coupon" ),
 *  <p>    FEDERAL_AGENCY_DISCOUNT_NOTE( "FADN", "FEDERAL_AGENCY_DISCOUNT_NOTE",
 *                          "FADN - Federal Agency Discount Note" ),
 *  <p>    PRIVATE_EXPORT_FUNDING( "PEF", "PRIVATE_EXPORT_FUNDING", "PEF - Private Export Funding (Agency)" ),
 *  <p>    USD_SUPRANATIONAL_COUPON( "SUPRA", "USD_SUPRANATIONAL_COUPON",
 *                          "SUPRA - USD Supranational Coupons (Agency)" ),
 *  <p></p>
 *      Corporate, 8
 *  <p>    CORPORATE_BOND( "CORP", "CORPORATE_BOND", "CORP - Corporate Bond" ),
 *  <p>    CORPORATE_PRIVATE_PLACEMENT( "CPP", "CORPORATE_PRIVATE_PLACEMENT", "CPP - Corporate Private Placement" ),
 *  <p>    CONVERTIBLE_BOND( "CB", "CONVERTIBLE_BOND", "CB - Convertible Bond (Corporate)" ),
 *  <p>    DUAL_CURRENCY( "DUAL", "DUAL_CURRENCY", "DUAL - Dual Currency (Corporate)" ),
 *  <p>    EURO_CORPORATE_BOND( "EUCORP", "EURO_CORPORATE_BOND", "EUCORP - Euro Corporate Bond" ),
 *  <p></p>
 *  <p>    INDEXED_LINKED( "XLINKD", "INDEXED_LINKED", "XLINKD - Indexed Linked (Corporate)" ),
 *  <p>    STRUCTURED_NOTE( "STRUCT", "STRUCTURED_NOTE", "STRUCT - Structured Note (Corporate)" ),
 *  <p>    YANKEE_CORPORATE_BOND( "YANK", "YANKEE_CORPORATE_BOND", "YANK - Yankee Corporate Bond" ),
 *  <p></p>
 *      Currency, 1
 *  <p>    FOREIGN_EXCHANGE_CONTRACT( "FOR", "FOREIGN_EXCHANGE_CONTRACT",
 *                          "FOR - Foreign Exchange Contract (Currency)" ),
 *  <p></p>
 *      Equity, 2
 *  <p>    COMMON_STOCK( "CS", "COMMON_STOCK", "CS - Common Stock (Equity)" ),
 *  <p>    PREFERRED_STOCK( "PS", "PREFERRED_STOCK", "PS - Preferred Stock (Equity)" ),
 *  <p></p>
 *      Finance, 5
 *  <p>    REPURCHASE( "REPO", "REPURCHASE", "REPO - Repurchase (Financing)" ),
 *  <p>    FORWARD( "FORWARD", "FORWARD", "FORWARD - Forward (Financing)" ),
 *  <p>    BUY_SELLBACK( "BUYSELL", "BUY_SELLBACK", "BUYSELL - Buy Sellback (Financing)" ),
 *  <p>    SECURITIES_LOAN( "SECLOAN", "SECURITIES_LOAN", "SECLOAN - Securities Loan (Financing)" ),
 *  <p>    SECURITIES_PLEDGE( "SECPLEDGE", "SECURITIES_PLEDGE", "SECPLEDGE - Securities Pledge (Financing)" ),
 *  <p></p>
 *      Government, 9
 *  <p>    BRADY_BOND( "BRADY", "BRADY_BOND", "BRADY - Brady Bond (Government)" ),
 *  <p>    EURO_SOVEREIGNS( "EUSOV", "EURO_SOVEREIGNS", "EUSOV - Euro Sovereigns (Government)" ),
 *  <p>    US_TREASURY_BOND( "TBOND", "US_TREASURY_BOND", "TBOND - US Treasury Bond (Government)" ),
 *  <p>    INTEREST_STRIP_ANY_BOND( "TINT", "INTEREST_STRIP_ANY_BOND",
 *                          "TINT - Interest Strip From Any Bond Or Note (Government)" ),
 *  <p>    TREASURY_INFLATION_PROTECTED_SECURITIES( "TIPS", "TREASURY_INFLATION_PROTECTED_SECURITIES",
 *                          "TIPS - Treasury Inflation Protected Securities (Government)" ),
 *  <p></p>
 *  <p>    PRINCIPAL_STRIP_CALLABLE_BOND( "TCAL", "PRINCIPAL_STRIP_CALLABLE_BOND",
 *                          "TCAL - Principal Strip Of A Callable Bond Or Note (Government)" ),
 *  <p>    PRINCIPAL_STRIP_NON_CALLABLE_BOND( "TPRN", "PRINCIPAL_STRIP_NON_CALLABLE_BOND",
 *                          "TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)" ),
 *  <p>    US_TREASURY_NOTE( "TNOTE", "US_TREASURY_NOTE", "TNOTE - US Treasury Note (Government)" ),
 *  <p>    US_TREASURY_BILL( "TBILL", "US_TREASURY_BILL", "TBILL - US Treasury Bill (Government)" ),
 *  <p></p>
 *      Loan, 13
 *  <p>    TERM_LOAN( "TERM", "TERM_LOAN", "TERM - Term Loan" ),
 *  <p>    REVOLVER_LOAN( "RVLV", "REVOLVER_LOAN", "RVLV - Revolver Loan" ),
 *  <p>    REVOLVER_TERM_LOAN( "RVLVTRM", "REVOLVER_TERM_LOAN", "RVLVTRM - Revolver/Term Loan" ),
 *  <p>    BRIDGE_LOAN( "BRIDGE", "BRIDGE_LOAN", "BRIDGE - Bridge Loan" ),
 *  <p>    LETTER_OF_CREDIT( "LOFC", "LETTER_OF_CREDIT", "LOFC - Letter Of Credit" ),
 *  <p></p>
 *  <p>    SWING_LINE_FACILITY( "SWING", "SWING_LINE_FACILITY", "SWING - Swing Line Facility" ),
 *  <p>    DEBTOR_IN_POSSESSION( "DINP", "DEBTOR_IN_POSSESSION", "DINP - Debtor In Possession" ),
 *  <p>    DEFAULTED_LOAN( "DEFLTED", "DEFAULTED_LOAN", "DEFLTED - Defaulted" ),
 *  <p>    WITHDRAWN_LOAN( "WITHDRN", "WITHDRAWN_LOAN", "WITHDRN - Withdrawn" ),
 *  <p>    REPLACED_LOAN( "REPLACD", "REPLACED_LOAN", "REPLACD - Replaced" ),
 *  <p></p>
 *  <p>    MATURED_LOAN( "MATURED", "MATURED_LOAN", "MATURED - Matured" ),
 *  <p>    AMENDED_AND_RESTATED( "AMENDED", "AMENDED_AND_RESTATED", "AMENDED - Amended & Restated" ),
 *  <p>    RETIRED_LOAN( "RETIRED", "RETIRED_LOAN", "RETIRED - Retired" ),
 *  <p></p>
 *      Money Market, 18
 *  <p>    BANKERS_ACCEPTANCE( "BA", "BANKERS_ACCEPTANCE", "BA - Bankers Acceptance" ),
 *  <p>    BANK_NOTES( "BN", "BANK_NOTES", "BN - Bank Notes" ),
 *  <p>    BILL_OF_EXCHANGES( "BOX", "BILL_OF_EXCHANGES", "BOX - Bill Of Exchanges" ),
 *  <p>    CERTIFICATE_OF_DEPOSIT( "CD", "CERTIFICATE_OF_DEPOSIT", "CD - Certificate Of Deposit" ),
 *  <p>    CALL_LOANS( "CL", "CALL_LOANS", "CL - Call Loans" ),
 *  <p></p>
 *  <p>    COMMERCIAL_PAPER( "CP", "COMMERCIAL_PAPER", "CP - Commercial Paper" ),
 *  <p>    DEPOSIT_NOTES( "DN", "DEPOSIT_NOTES", "DN - Deposit Notes" ),
 *  <p>    EURO_CERTIFICATE_OF_DEPOSIT( "EUCD", "EURO_CERTIFICATE_OF_DEPOSIT", "EUCD - Euro Certificate Of Deposit" ),
 *  <p>    EURO_COMMERCIAL_PAPER( "EUCP", "EURO_COMMERCIAL_PAPER", "EUCP - Euro Commercial Paper" ),
 *  <p>    LIQUIDITY_NOTE( "LQN", "LIQUIDITY_NOTE", "LQN - Liquidity Note" ),
 *  <p></p>
 *  <p>    MEDIUM_TERM_NOTES( "MTN", "MEDIUM_TERM_NOTES", "MTN - Medium Term Notes" ),
 *  <p>    OVERNIGHT( "ONITE", "OVERNIGHT", "ONITE - Overnight" ),
 *  <p>    PROMISSORY_NOTE( "PN", "PROMISSORY_NOTE", "PN - Promissory Note" ),
 *  <p>    PLAZOS_FIJOS( "PZFJ", "PLAZOS_FIJOS", "PZFJ - Plazos Fijos" ),
 *  <p>    SHORT_TERM_LOAN_NOTE( "STN", "SHORT_TERM_LOAN_NOTE", "STN - Short Term Loan Note" ),
 *  <p></p>
 *  <p>    TIME_DEPOSIT( "TD", "TIME_DEPOSIT", "TD - Time Deposit" ),
 *  <p>    EXTENDED_COMM_NOTE( "XCN", "EXTENDED_COMM_NOTE", "XCN - Extended Comm Note" ),
 *  <p>    YANKEE_CERTIFICATE_OF_DEPOSIT( "YCD", "YANKEE_CERTIFICATE_OF_DEPOSIT",
 *                          "YCD - Yankee Certificate Of Deposit" ),
 *  <p></p>
 *      Mortgage, 11
 *  <p>    ASSET_BACKED_SECURITIES( "ABS", "ASSET_BACKED_SECURITIES", "ABS - Asset-backed Securities" ),
 *  <p>    CORP_MORTGAGE_BACKED_SECURITIES( "CMBS", "CORP_MORTGAGE_BACKED_SECURITIES",
 *                          "CMBS - Corp. Mortgage-backed Securities" ),
 *  <p>    COLLATERALIZED_MORTGAGE_OBLIGATION( "CMO", "COLLATERALIZED_MORTGAGE_OBLIGATION",
 *                          "CMO - Collateralized Mortgage Obligation" ),
 *  <p>    IOETTE_MORTGAGE( "IET", "IOETTE_MORTGAGE", "IET - IOETTE Mortgage" ),
 *  <p>    MORTGAGE_BACKED_SECURITIES( "MBS", "MORTGAGE_BACKED_SECURITIES", "MBS - Mortgage-backed Securities" ),
 *  <p></p>
 *  <p>    MORTGAGE_INTEREST_ONLY( "MIO", "MORTGAGE_INTEREST_ONLY", "MIO - Mortgage Interest Only" ),
 *  <p>    MORTGAGE_PRINCIPAL_ONLY( "MPO", "MORTGAGE_PRINCIPAL_ONLY", "MPO - Mortgage Principal Only" ),
 *  <p>    MORTGAGE_PRIVATE_PLACEMENT( "MPP", "MORTGAGE_PRIVATE_PLACEMENT", "MPP - Mortgage Private Placement" ),
 *  <p>    MISCELLANEOUS_PASS_THROUGH( "MPT", "MISCELLANEOUS_PASS_THROUGH", "MPT - Miscellaneous Pass-through" ),
 *  <p>    PFANDBRIEFE( "PFAND", "PFANDBRIEFE", "PFAND - Pfandbriefe" ),
 *  <p></p>
 *  <p>    TO_BE_ANNOUNCED( "TBA", "TO_BE_ANNOUNCED", "TBA - To Be Announced" ),
 *  <p></p>
 *      Municipal, 16
 *  <p>    OTHER_ANTICIPATION_NOTES( "AN", "OTHER_ANTICIPATION_NOTES",
 *                          "AN - Other Anticipation Notes (BAN, GAN, etc.)" ),
 *  <p>    CERTIFICATE_OF_OBLIGATION( "COFO", "CERTIFICATE_OF_OBLIGATION",
 *                          "COFO - Certificate Of Obligation" ),
 *  <p>    CERTIFICATE_OF_PARTICIPATION( "COFP", "CERTIFICATE_OF_PARTICIPATION",
 *                          "COFP - Certificate Of Participation" ),
 *  <p>    GENERAL_OBLIGATION_BONDS( "GO", "GENERAL_OBLIGATION_BONDS", "GO - General Obligation Bonds" ),
 *  <p>    MANDATORY_TENDER( "MT", "MANDATORY_TENDER", "MT - Mandatory Tender" ),
 *  <p></p>
 *  <p>    REVENUE_ANTICIPATION_NOTE( "RAN", "REVENUE_ANTICIPATION_NOTE", "RAN - Revenue Anticipation Note" ),
 *  <p>    REVENUE_BONDS( "REV", "REVENUE_BONDS", "REV - Revenue Bonds" ),
 *  <p>    SPECIAL_ASSESSMENT( "SPCLA", "SPECIAL_ASSESSMENT", "SPCLA - Special Assessment" ),
 *  <p>    SPECIAL_OBLIGATION( "SPCLO", "SPECIAL_OBLIGATION", "SPCLO - Special Obligation" ),
 *  <p>    SPECIAL_TAX( "SPCLT", "SPECIAL_TAX", "SPCLT - Special Tax" ),
 *  <p></p>
 *  <p>    TAX_ANTICIPATION_NOTE( "TAN", "TAX_ANTICIPATION_NOTE", "TAN - Tax Anticipation Note" ),
 *  <p>    TAX_ALLOCATION( "TAXA", "TAX_ALLOCATION", "TAXA - Tax Allocation" ),
 *  <p>    TAX_EXEMPT_COMMERCIAL_PAPER( "TECP", "TAX_EXEMPT_COMMERCIAL_PAPER",
 *                          "TECP - Tax Exempt Commercial Paper" ),
 *  <p>    TAX_REVENUE_ANTICIPATION_NOTE( "TRAN", "TAX_REVENUE_ANTICIPATION_NOTE",
 *                          "TRAN - Tax Revenue Anticipation Note" ),
 *  <p>    VARIABLE_RATE_DEMAND_NOTE( "VRDN", "VARIABLE_RATE_DEMAND_NOTE", "VRDN - Variable Rate Demand Note" ),
 *  <p></p>
 *  <p>    WARRANT( "WAR", "WARRANT", "WAR - Warrant" ),
 *  <p></p>
 *      Other, 7
 *  <p>    MUTUAL_FUND( "MF", "MUTUAL_FUND", "MF - Mutual Fund" ),
 *  <p>    MULTILEG_INSTRUMENT( "MLEG", "MULTILEG_INSTRUMENT", "MLEG - Multileg Instrument" ),
 *  <p>    NO_SECURITY_TYPE( "NONE", "NO_SECURITY_TYPE", "NONE - No Security Type" ),
 *  <p>    OPTIONS_ON_FUTURES( "OOF", "OPTIONS_ON_FUTURES", "OOF - Options on Futures" ),
 *  <p>    OPTIONS_ON_PHYSICAL( "OOP", "OPTIONS_ON_PHYSICAL", "OOP - Options on Physical" ),
 *  <p></p>
 *  <p>    WILDCARD_ENTRY( "WLD", "WILDCARD_ENTRY",
 *                          "WLD - Wildcard Entry (used on Security Definition Request message)" ),
 *      CASH( "CASH", "CASH", "CASH - Cash" ),
 */
class MyEnumSecurityTypeTest {
    @Test
    void Enum0167Test() {
        MyEnumSecurityType enumType;

        /*
         * Deprecated msg types
         */
        enumType = MyEnumSecurityType.DEPRECATED_FUTURE;
        assertEquals("FUT", enumType.getID());
        assertEquals("DEPRECATED_FUTURE", enumType.getName());
        assertEquals("FUT - Future (Deprecated)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.getID());
        assertEquals("DEPRECATED_OPTION", enumType.getName());
        assertEquals("OPT - Option (Deprecated)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.getName());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.getID());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.getName());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * Agency msg types
         */
        enumType = MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.getID());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.getID());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.getName());
        assertEquals("FAC - Federal Agency Coupon", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.getID());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.getName());
        assertEquals("FADN - Federal Agency Discount Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.getID());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.getName());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.getID());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.getName());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * Corporate msg types
         */
        enumType = MyEnumSecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.getID());
        assertEquals("CORPORATE_BOND", enumType.getName());
        assertEquals("CORP - Corporate Bond", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.getID());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("CPP - Corporate Private Placement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.getID());
        assertEquals("CONVERTIBLE_BOND", enumType.getName());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.getID());
        assertEquals("DUAL_CURRENCY", enumType.getName());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.getID());
        assertEquals("EURO_CORPORATE_BOND", enumType.getName());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.getID());
        assertEquals("INDEXED_LINKED", enumType.getName());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.getID());
        assertEquals("STRUCTURED_NOTE", enumType.getName());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.getID());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.getName());
        assertEquals("YANK - Yankee Corporate Bond", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Currency msg types
         */
        enumType = MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.getID());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.getName());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Equity msg types
         */
        enumType = MyEnumSecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.getID());
        assertEquals("COMMON_STOCK", enumType.getName());
        assertEquals("CS - Common Stock (Equity)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.getID());
        assertEquals("PREFERRED_STOCK", enumType.getName());
        assertEquals("PS - Preferred Stock (Equity)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Finance msg types
         */
        enumType = MyEnumSecurityType.REPURCHASE;
        assertEquals("REPO", enumType.getID());
        assertEquals("REPURCHASE", enumType.getName());
        assertEquals("REPO - Repurchase (Financing)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.FORWARD;
        assertEquals("FORWARD", enumType.getID());
        assertEquals("FORWARD", enumType.getName());
        assertEquals("FORWARD - Forward (Financing)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.getID());
        assertEquals("BUY_SELLBACK", enumType.getName());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.getID());
        assertEquals("SECURITIES_LOAN", enumType.getName());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.getID());
        assertEquals("SECURITIES_PLEDGE", enumType.getName());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Government msg types
         */
        enumType = MyEnumSecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.getID());
        assertEquals("BRADY_BOND", enumType.getName());
        assertEquals("BRADY - Brady Bond (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.getID());
        assertEquals("EURO_SOVEREIGNS", enumType.getName());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.getID());
        assertEquals("US_TREASURY_BOND", enumType.getName());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.getID());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.getName());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.getID());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.getName());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.getName());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.getID());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.getName());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.getID());
        assertEquals("US_TREASURY_NOTE", enumType.getName());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.getID());
        assertEquals("US_TREASURY_BILL", enumType.getName());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Loan msg types
         */
        enumType = MyEnumSecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.getID());
        assertEquals("TERM_LOAN", enumType.getName());
        assertEquals("TERM - Term Loan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.getID());
        assertEquals("REVOLVER_LOAN", enumType.getName());
        assertEquals("RVLV - Revolver Loan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.getID());
        assertEquals("REVOLVER_TERM_LOAN", enumType.getName());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.getID());
        assertEquals("BRIDGE_LOAN", enumType.getName());
        assertEquals("BRIDGE - Bridge Loan", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.getID());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("LOFC - Letter Of Credit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.getID());
        assertEquals("SWING_LINE_FACILITY", enumType.getName());
        assertEquals("SWING - Swing Line Facility", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.getID());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.getName());
        assertEquals("DINP - Debtor In Possession", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.getID());
        assertEquals("DEFAULTED_LOAN", enumType.getName());
        assertEquals("DEFLTED - Defaulted", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.getID());
        assertEquals("WITHDRAWN_LOAN", enumType.getName());
        assertEquals("WITHDRN - Withdrawn", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.getID());
        assertEquals("REPLACED_LOAN", enumType.getName());
        assertEquals("REPLACD - Replaced", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.getID());
        assertEquals("MATURED_LOAN", enumType.getName());
        assertEquals("MATURED - Matured", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.getID());
        assertEquals("AMENDED_AND_RESTATED", enumType.getName());
        assertEquals("AMENDED - Amended & Restated", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.getID());
        assertEquals("RETIRED_LOAN", enumType.getName());
        assertEquals("RETIRED - Retired", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Money Market msg types
         */
        enumType = MyEnumSecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.getID());
        assertEquals("BANKERS_ACCEPTANCE", enumType.getName());
        assertEquals("BA - Bankers Acceptance", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.BANK_NOTES;
        assertEquals("BN", enumType.getID());
        assertEquals("BANK_NOTES", enumType.getName());
        assertEquals("BN - Bank Notes", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.getID());
        assertEquals("BILL_OF_EXCHANGES", enumType.getName());
        assertEquals("BOX - Bill Of Exchanges", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.getID());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("CD - Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CALL_LOANS;
        assertEquals("CL", enumType.getID());
        assertEquals("CALL_LOANS", enumType.getName());
        assertEquals("CL - Call Loans", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.getID());
        assertEquals("COMMERCIAL_PAPER", enumType.getName());
        assertEquals("CP - Commercial Paper", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.getID());
        assertEquals("DEPOSIT_NOTES", enumType.getName());
        assertEquals("DN - Deposit Notes", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.getID());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.getID());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("EUCP - Euro Commercial Paper", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.getID());
        assertEquals("LIQUIDITY_NOTE", enumType.getName());
        assertEquals("LQN - Liquidity Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.getID());
        assertEquals("MEDIUM_TERM_NOTES", enumType.getName());
        assertEquals("MTN - Medium Term Notes", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.getID());
        assertEquals("OVERNIGHT", enumType.getName());
        assertEquals("ONITE - Overnight", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.getID());
        assertEquals("PROMISSORY_NOTE", enumType.getName());
        assertEquals("PN - Promissory Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.getID());
        assertEquals("PLAZOS_FIJOS", enumType.getName());
        assertEquals("PZFJ - Plazos Fijos", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.getID());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.getName());
        assertEquals("STN - Short Term Loan Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.getID());
        assertEquals("TIME_DEPOSIT", enumType.getName());
        assertEquals("TD - Time Deposit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.getID());
        assertEquals("EXTENDED_COMM_NOTE", enumType.getName());
        assertEquals("XCN - Extended Comm Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.getID());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.getName());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Mortgage msg types
         */
        enumType = MyEnumSecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.getID());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.getName());
        assertEquals("ABS - Asset-backed Securities", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.getID());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.getID());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.getName());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.getID());
        assertEquals("IOETTE_MORTGAGE", enumType.getName());
        assertEquals("IET - IOETTE Mortgage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.getID());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.getName());
        assertEquals("MBS - Mortgage-backed Securities", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.getID());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.getName());
        assertEquals("MIO - Mortgage Interest Only", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.getID());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.getName());
        assertEquals("MPO - Mortgage Principal Only", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.getID());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.getName());
        assertEquals("MPP - Mortgage Private Placement", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.getID());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.getName());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.getID());
        assertEquals("PFANDBRIEFE", enumType.getName());
        assertEquals("PFAND - Pfandbriefe", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.getID());
        assertEquals("TO_BE_ANNOUNCED", enumType.getName());
        assertEquals("TBA - To Be Announced", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Municipal msg types
         */
        enumType = MyEnumSecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.getID());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.getName());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.getID());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.getName());
        assertEquals("COFO - Certificate Of Obligation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.getID());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.getName());
        assertEquals("COFP - Certificate Of Participation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.getID());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.getName());
        assertEquals("GO - General Obligation Bonds", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.getID());
        assertEquals("MANDATORY_TENDER", enumType.getName());
        assertEquals("MT - Mandatory Tender", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.getID());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("RAN - Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.getID());
        assertEquals("REVENUE_BONDS", enumType.getName());
        assertEquals("REV - Revenue Bonds", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.getID());
        assertEquals("SPECIAL_ASSESSMENT", enumType.getName());
        assertEquals("SPCLA - Special Assessment", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.getID());
        assertEquals("SPECIAL_OBLIGATION", enumType.getName());
        assertEquals("SPCLO - Special Obligation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.getID());
        assertEquals("SPECIAL_TAX", enumType.getName());
        assertEquals("SPCLT - Special Tax", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.getID());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TAN - Tax Anticipation Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.getID());
        assertEquals("TAX_ALLOCATION", enumType.getName());
        assertEquals("TAXA - Tax Allocation", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.getID());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.getName());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.getID());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.getName());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.getID());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.getName());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.WARRANT;
        assertEquals("WAR", enumType.getID());
        assertEquals("WARRANT", enumType.getName());
        assertEquals("WAR - Warrant", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * Other msg types
         */
        enumType = MyEnumSecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.getID());
        assertEquals("MUTUAL_FUND", enumType.getName());
        assertEquals("MF - Mutual Fund", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.getID());
        assertEquals("MULTILEG_INSTRUMENT", enumType.getName());
        assertEquals("MLEG - Multileg Instrument", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.getID());
        assertEquals("NO_SECURITY_TYPE", enumType.getName());
        assertEquals("NONE - No Security Type", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.getID());
        assertEquals("OPTIONS_ON_FUTURES", enumType.getName());
        assertEquals("OOF - Options on Futures", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.getID());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.getName());
        assertEquals("OOP - Options on Physical", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = MyEnumSecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.getID());
        assertEquals("WILDCARD_ENTRY", enumType.getName());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = MyEnumSecurityType.CASH;
        assertEquals("CASH", enumType.getID());
        assertEquals("CASH", enumType.getName());
        assertEquals("CASH - Cash", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}