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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSecurityType;
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
class Tag310EnuUnderlyingSecurityTypeTest {
    @Test
    void FIX0310Test() {
        FIX42 fixData = FIX42.FIX310_ENU_UNDERLYING_SECURITY_TYPE;
        assertEquals( "310", fixData.getID());
        assertEquals( "UNDERLYING_SECURITY_TYPE", fixData.getName());
        assertEquals( "UnderlyingSecurityType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0310Test() {
        Log310EnuUnderlyingSecurityType tagData;


        /*
         * Deprecated, 4
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEPRECATED_FUTURE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEPRECATED_OPTION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Agency, 5
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Corporate, 8
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CONVERTIBLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DUAL_CURRENCY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EURO_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.INDEXED_LINKED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.STRUCTURED_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Currency, 1
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Equity, 2
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.COMMON_STOCK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PREFERRED_STOCK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Finance, 5
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REPURCHASE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.FORWARD);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BUY_SELLBACK);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SECURITIES_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SECURITIES_PLEDGE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Government, 9
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BRADY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EURO_SOVEREIGNS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.US_TREASURY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Loan, 13
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TERM_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REVOLVER_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BRIDGE_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.LETTER_OF_CREDIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SWING_LINE_FACILITY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEFAULTED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.WITHDRAWN_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REPLACED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MATURED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.AMENDED_AND_RESTATED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.RETIRED_LOAN);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Money Market, 18
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BANK_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.BILL_OF_EXCHANGES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CALL_LOANS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.DEPOSIT_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.LIQUIDITY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.OVERNIGHT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PROMISSORY_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PLAZOS_FIJOS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TIME_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Mortgage, 11
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.IOETTE_MORTGAGE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.PFANDBRIEFE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TO_BE_ANNOUNCED);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Municipal, 16
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MANDATORY_TENDER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.REVENUE_BONDS);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SPECIAL_OBLIGATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.SPECIAL_TAX);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TAX_ALLOCATION);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.WARRANT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Other, 7
         */
        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MUTUAL_FUND);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.NO_SECURITY_TYPE);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.WILDCARD_ENTRY);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log310EnuUnderlyingSecurityType(MyEnumSecurityType.CASH);
        assertEquals( MyEnumSecurityType.WARRANT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}