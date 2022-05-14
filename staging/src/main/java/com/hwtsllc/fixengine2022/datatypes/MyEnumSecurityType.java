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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public enum MyEnumSecurityType implements EnumAccessors, LogVerboseString {
    /*
     * Deprecated, 4
     */
    DEPRECATED_FUTURE( "FUT", "DEPRECATED_FUTURE",
            "FUT - Future (Deprecated)" ),
    DEPRECATED_OPTION( "OPT", "DEPRECATED_OPTION",
            "OPT - Option (Deprecated)" ),
    DEPRECATED_US_TREASURY_NOTE( "UST", "DEPRECATED_US_TREASURY_NOTE",
            "UST - US Treasury Note (Deprecated Value Use TNOTE)" ),
    DEPRECATED_US_TREASURY_BILL( "USTB", "DEPRECATED_US_TREASURY_BILL",
            "USTB - US Treasury Bill (Deprecated Value Use TBILL)" ),

    /*
     * Agency, 5
     */
    EURO_SUPRANATIONAL_COUPON( "EUSUPRA", "EURO_SUPRANATIONAL_COUPON",
            "EUSUPRA - Euro Supranational Coupon (Agency)" ),
    FEDERAL_AGENCY_COUPON( "FAC", "FEDERAL_AGENCY_COUPON",
            "FAC - Federal Agency Coupon" ),
    FEDERAL_AGENCY_DISCOUNT_NOTE( "FADN", "FEDERAL_AGENCY_DISCOUNT_NOTE",
            "FADN - Federal Agency Discount Note" ),
    PRIVATE_EXPORT_FUNDING( "PEF", "PRIVATE_EXPORT_FUNDING",
            "PEF - Private Export Funding (Agency)" ),
    USD_SUPRANATIONAL_COUPON( "SUPRA", "USD_SUPRANATIONAL_COUPON",
            "SUPRA - USD Supranational Coupons (Agency)" ),

    /*
     * Corporate, 8
     */
    CORPORATE_BOND( "CORP", "CORPORATE_BOND",
            "CORP - Corporate Bond" ),
    CORPORATE_PRIVATE_PLACEMENT( "CPP", "CORPORATE_PRIVATE_PLACEMENT",
            "CPP - Corporate Private Placement" ),
    CONVERTIBLE_BOND( "CB", "CONVERTIBLE_BOND",
            "CB - Convertible Bond (Corporate)" ),
    DUAL_CURRENCY( "DUAL", "DUAL_CURRENCY",
            "DUAL - Dual Currency (Corporate)" ),
    EURO_CORPORATE_BOND( "EUCORP", "EURO_CORPORATE_BOND",
            "EUCORP - Euro Corporate Bond" ),

    INDEXED_LINKED( "XLINKD", "INDEXED_LINKED",
            "XLINKD - Indexed Linked (Corporate)" ),
    STRUCTURED_NOTE( "STRUCT", "STRUCTURED_NOTE",
            "STRUCT - Structured Note (Corporate)" ),
    YANKEE_CORPORATE_BOND( "YANK", "YANKEE_CORPORATE_BOND",
            "YANK - Yankee Corporate Bond" ),

    /*
     * Currency, 1
     */
    FOREIGN_EXCHANGE_CONTRACT( "FOR", "FOREIGN_EXCHANGE_CONTRACT",
            "FOR - Foreign Exchange Contract (Currency)" ),

    /*
     * Equity, 2
     */
    COMMON_STOCK( "CS", "COMMON_STOCK",
            "CS - Common Stock (Equity)" ),
    PREFERRED_STOCK( "PS", "PREFERRED_STOCK",
            "PS - Preferred Stock (Equity)" ),

    /*
     * Finance, 5
     */
    REPURCHASE( "REPO", "REPURCHASE",
            "REPO - Repurchase (Financing)" ),
    FORWARD( "FORWARD", "FORWARD",
            "FORWARD - Forward (Financing)" ),
    BUY_SELLBACK( "BUYSELL", "BUY_SELLBACK",
            "BUYSELL - Buy Sellback (Financing)" ),
    SECURITIES_LOAN( "SECLOAN", "SECURITIES_LOAN",
            "SECLOAN - Securities Loan (Financing)" ),
    SECURITIES_PLEDGE( "SECPLEDGE", "SECURITIES_PLEDGE",
            "SECPLEDGE - Securities Pledge (Financing)" ),

    /*
     * Government, 9
     */
    BRADY_BOND( "BRADY", "BRADY_BOND",
            "BRADY - Brady Bond (Government)" ),
    EURO_SOVEREIGNS( "EUSOV", "EURO_SOVEREIGNS",
            "EUSOV - Euro Sovereigns (Government)" ),
    US_TREASURY_BOND( "TBOND", "US_TREASURY_BOND",
            "TBOND - US Treasury Bond (Government)" ),
    INTEREST_STRIP_ANY_BOND( "TINT", "INTEREST_STRIP_ANY_BOND",
            "TINT - Interest Strip From Any Bond Or Note (Government)" ),
    TREASURY_INFLATION_PROTECTED_SECURITIES( "TIPS", "TREASURY_INFLATION_PROTECTED_SECURITIES",
            "TIPS - Treasury Inflation Protected Securities (Government)" ),

    PRINCIPAL_STRIP_CALLABLE_BOND( "TCAL", "PRINCIPAL_STRIP_CALLABLE_BOND",
            "TCAL - Principal Strip Of A Callable Bond Or Note (Government)" ),
    PRINCIPAL_STRIP_NON_CALLABLE_BOND( "TPRN", "PRINCIPAL_STRIP_NON_CALLABLE_BOND",
            "TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)" ),
    US_TREASURY_NOTE( "TNOTE", "US_TREASURY_NOTE",
            "TNOTE - US Treasury Note (Government)" ),
    US_TREASURY_BILL( "TBILL", "US_TREASURY_BILL",
            "TBILL - US Treasury Bill (Government)" ),

    /*
     * Loan, 13
     */
    TERM_LOAN( "TERM", "TERM_LOAN",
            "TERM - Term Loan" ),
    REVOLVER_LOAN( "RVLV", "REVOLVER_LOAN",
            "RVLV - Revolver Loan" ),
    REVOLVER_TERM_LOAN( "RVLVTRM", "REVOLVER_TERM_LOAN",
            "RVLVTRM - Revolver/Term Loan" ),
    BRIDGE_LOAN( "BRIDGE", "BRIDGE_LOAN",
            "BRIDGE - Bridge Loan" ),
    LETTER_OF_CREDIT( "LOFC", "LETTER_OF_CREDIT",
            "LOFC - Letter Of Credit" ),

    SWING_LINE_FACILITY( "SWING", "SWING_LINE_FACILITY",
            "SWING - Swing Line Facility" ),
    DEBTOR_IN_POSSESSION( "DINP", "DEBTOR_IN_POSSESSION",
            "DINP - Debtor In Possession" ),
    DEFAULTED_LOAN( "DEFLTED", "DEFAULTED_LOAN",
            "DEFLTED - Defaulted" ),
    WITHDRAWN_LOAN( "WITHDRN", "WITHDRAWN_LOAN",
            "WITHDRN - Withdrawn" ),
    REPLACED_LOAN( "REPLACD", "REPLACED_LOAN",
            "REPLACD - Replaced" ),

    MATURED_LOAN( "MATURED", "MATURED_LOAN",
            "MATURED - Matured" ),
    AMENDED_AND_RESTATED( "AMENDED", "AMENDED_AND_RESTATED",
            "AMENDED - Amended & Restated" ),
    RETIRED_LOAN( "RETIRED", "RETIRED_LOAN",
            "RETIRED - Retired" ),

    /*
     * Money Market, 18
     */
    BANKERS_ACCEPTANCE( "BA", "BANKERS_ACCEPTANCE",
            "BA - Bankers Acceptance" ),
    BANK_NOTES( "BN", "BANK_NOTES",
            "BN - Bank Notes" ),
    BILL_OF_EXCHANGES( "BOX", "BILL_OF_EXCHANGES"
            , "BOX - Bill Of Exchanges" ),
    CERTIFICATE_OF_DEPOSIT( "CD", "CERTIFICATE_OF_DEPOSIT",
            "CD - Certificate Of Deposit" ),
    CALL_LOANS( "CL", "CALL_LOANS",
            "CL - Call Loans" ),

    COMMERCIAL_PAPER( "CP", "COMMERCIAL_PAPER",
            "CP - Commercial Paper" ),
    DEPOSIT_NOTES( "DN", "DEPOSIT_NOTES",
            "DN - Deposit Notes" ),
    EURO_CERTIFICATE_OF_DEPOSIT( "EUCD", "EURO_CERTIFICATE_OF_DEPOSIT",
            "EUCD - Euro Certificate Of Deposit" ),
    EURO_COMMERCIAL_PAPER( "EUCP", "EURO_COMMERCIAL_PAPER",
            "EUCP - Euro Commercial Paper" ),
    LIQUIDITY_NOTE( "LQN", "LIQUIDITY_NOTE",
            "LQN - Liquidity Note" ),

    MEDIUM_TERM_NOTES( "MTN", "MEDIUM_TERM_NOTES",
            "MTN - Medium Term Notes" ),
    OVERNIGHT( "ONITE", "OVERNIGHT",
            "ONITE - Overnight" ),
    PROMISSORY_NOTE( "PN", "PROMISSORY_NOTE",
            "PN - Promissory Note" ),
    PLAZOS_FIJOS( "PZFJ", "PLAZOS_FIJOS",
            "PZFJ - Plazos Fijos" ),
    SHORT_TERM_LOAN_NOTE( "STN", "SHORT_TERM_LOAN_NOTE",
            "STN - Short Term Loan Note" ),

    TIME_DEPOSIT( "TD", "TIME_DEPOSIT",
            "TD - Time Deposit" ),
    EXTENDED_COMM_NOTE( "XCN", "EXTENDED_COMM_NOTE",
            "XCN - Extended Comm Note" ),
    YANKEE_CERTIFICATE_OF_DEPOSIT( "YCD", "YANKEE_CERTIFICATE_OF_DEPOSIT",
            "YCD - Yankee Certificate Of Deposit" ),

    /*
     * Mortgage, 11
     */
    ASSET_BACKED_SECURITIES( "ABS", "ASSET_BACKED_SECURITIES",
            "ABS - Asset-backed Securities" ),
    CORP_MORTGAGE_BACKED_SECURITIES( "CMBS", "CORP_MORTGAGE_BACKED_SECURITIES",
            "CMBS - Corp. Mortgage-backed Securities" ),
    COLLATERALIZED_MORTGAGE_OBLIGATION( "CMO", "COLLATERALIZED_MORTGAGE_OBLIGATION",
            "CMO - Collateralized Mortgage Obligation" ),
    IOETTE_MORTGAGE( "IET", "IOETTE_MORTGAGE",
            "IET - IOETTE Mortgage" ),
    MORTGAGE_BACKED_SECURITIES( "MBS", "MORTGAGE_BACKED_SECURITIES",
            "MBS - Mortgage-backed Securities" ),

    MORTGAGE_INTEREST_ONLY( "MIO", "MORTGAGE_INTEREST_ONLY",
            "MIO - Mortgage Interest Only" ),
    MORTGAGE_PRINCIPAL_ONLY( "MPO", "MORTGAGE_PRINCIPAL_ONLY",
            "MPO - Mortgage Principal Only" ),
    MORTGAGE_PRIVATE_PLACEMENT( "MPP", "MORTGAGE_PRIVATE_PLACEMENT",
            "MPP - Mortgage Private Placement" ),
    MISCELLANEOUS_PASS_THROUGH( "MPT", "MISCELLANEOUS_PASS_THROUGH",
            "MPT - Miscellaneous Pass-through" ),
    PFANDBRIEFE( "PFAND", "PFANDBRIEFE",
            "PFAND - Pfandbriefe" ),

    TO_BE_ANNOUNCED( "TBA", "TO_BE_ANNOUNCED",
            "TBA - To Be Announced" ),

    /*
     * Municipal, 16
     */
    OTHER_ANTICIPATION_NOTES( "AN", "OTHER_ANTICIPATION_NOTES",
            "AN - Other Anticipation Notes (BAN, GAN, etc.)" ),
    CERTIFICATE_OF_OBLIGATION( "COFO", "CERTIFICATE_OF_OBLIGATION",
            "COFO - Certificate Of Obligation" ),
    CERTIFICATE_OF_PARTICIPATION( "COFP", "CERTIFICATE_OF_PARTICIPATION",
            "COFP - Certificate Of Participation" ),
    GENERAL_OBLIGATION_BONDS( "GO", "GENERAL_OBLIGATION_BONDS",
            "GO - General Obligation Bonds" ),
    MANDATORY_TENDER( "MT", "MANDATORY_TENDER",
            "MT - Mandatory Tender" ),

    REVENUE_ANTICIPATION_NOTE( "RAN", "REVENUE_ANTICIPATION_NOTE",
            "RAN - Revenue Anticipation Note" ),
    REVENUE_BONDS( "REV", "REVENUE_BONDS",
            "REV - Revenue Bonds" ),
    SPECIAL_ASSESSMENT( "SPCLA", "SPECIAL_ASSESSMENT",
            "SPCLA - Special Assessment" ),
    SPECIAL_OBLIGATION( "SPCLO", "SPECIAL_OBLIGATION",
            "SPCLO - Special Obligation" ),
    SPECIAL_TAX( "SPCLT", "SPECIAL_TAX",
            "SPCLT - Special Tax" ),

    TAX_ANTICIPATION_NOTE( "TAN", "TAX_ANTICIPATION_NOTE",
            "TAN - Tax Anticipation Note" ),
    TAX_ALLOCATION( "TAXA", "TAX_ALLOCATION",
            "TAXA - Tax Allocation" ),
    TAX_EXEMPT_COMMERCIAL_PAPER( "TECP", "TAX_EXEMPT_COMMERCIAL_PAPER",
            "TECP - Tax Exempt Commercial Paper" ),
    TAX_REVENUE_ANTICIPATION_NOTE( "TRAN", "TAX_REVENUE_ANTICIPATION_NOTE",
            "TRAN - Tax Revenue Anticipation Note" ),
    VARIABLE_RATE_DEMAND_NOTE( "VRDN", "VARIABLE_RATE_DEMAND_NOTE",
            "VRDN - Variable Rate Demand Note" ),

    WARRANT( "WAR", "WARRANT",
            "WAR - Warrant" ),

    /*
     * Other, 7
     */
    MUTUAL_FUND( "MF", "MUTUAL_FUND",
            "MF - Mutual Fund" ),
    MULTILEG_INSTRUMENT( "MLEG", "MULTILEG_INSTRUMENT",
            "MLEG - Multileg Instrument" ),
    NO_SECURITY_TYPE( "NONE", "NO_SECURITY_TYPE",
            "NONE - No Security Type" ),
    OPTIONS_ON_FUTURES( "OOF", "OPTIONS_ON_FUTURES",
            "OOF - Options on Futures" ),
    OPTIONS_ON_PHYSICAL( "OOP", "OPTIONS_ON_PHYSICAL",
            "OOP - Options on Physical" ),

    WILDCARD_ENTRY( "WLD", "WILDCARD_ENTRY",
            "WLD - Wildcard Entry (used on Security Definition Request message)" ),
    CASH( "CASH", "CASH",
            "CASH - Cash" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumSecurityType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            System.out.println(oneEnum);
        }
    }
}