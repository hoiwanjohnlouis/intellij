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
class Tag167EnuSecurityTypeTest {
    @Test
    void FIX0167Test() {
        FIX41 fixData = FIX41.FIX167_ENU_SECURITY_TYPE;
        assertEquals( "167", fixData.toFIXIDString());
        assertEquals( "SECURITY_TYPE", fixData.toFIXNameString());
        assertEquals( "SecurityType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0167Test() {
        Tag167EnuSecurityType tagData;


        /*
         * Deprecated, 4
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_FUTURE);
        assertEquals( MyEnumSecurityType.DEPRECATED_FUTURE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_OPTION);
        assertEquals( MyEnumSecurityType.DEPRECATED_OPTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Agency, 5
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( MyEnumSecurityType.FEDERAL_AGENCY_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( MyEnumSecurityType.PRIVATE_EXPORT_FUNDING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.USD_SUPRANATIONAL_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Corporate, 8
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.CORPORATE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CONVERTIBLE_BOND);
        assertEquals( MyEnumSecurityType.CONVERTIBLE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DUAL_CURRENCY);
        assertEquals( MyEnumSecurityType.DUAL_CURRENCY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.EURO_CORPORATE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INDEXED_LINKED);
        assertEquals( MyEnumSecurityType.INDEXED_LINKED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.STRUCTURED_NOTE);
        assertEquals( MyEnumSecurityType.STRUCTURED_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.YANKEE_CORPORATE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Currency, 1
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Equity, 2
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMON_STOCK);
        assertEquals( MyEnumSecurityType.COMMON_STOCK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PREFERRED_STOCK);
        assertEquals( MyEnumSecurityType.PREFERRED_STOCK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Finance, 5
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPURCHASE);
        assertEquals( MyEnumSecurityType.REPURCHASE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FORWARD);
        assertEquals( MyEnumSecurityType.FORWARD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BUY_SELLBACK);
        assertEquals( MyEnumSecurityType.BUY_SELLBACK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_LOAN);
        assertEquals( MyEnumSecurityType.SECURITIES_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_PLEDGE);
        assertEquals( MyEnumSecurityType.SECURITIES_PLEDGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Government, 9
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRADY_BOND);
        assertEquals( MyEnumSecurityType.BRADY_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SOVEREIGNS);
        assertEquals( MyEnumSecurityType.EURO_SOVEREIGNS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BOND);
        assertEquals( MyEnumSecurityType.US_TREASURY_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( MyEnumSecurityType.INTEREST_STRIP_ANY_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.US_TREASURY_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.US_TREASURY_BILL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Loan, 13
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TERM_LOAN);
        assertEquals( MyEnumSecurityType.TERM_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_LOAN);
        assertEquals( MyEnumSecurityType.REVOLVER_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( MyEnumSecurityType.REVOLVER_TERM_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRIDGE_LOAN);
        assertEquals( MyEnumSecurityType.BRIDGE_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LETTER_OF_CREDIT);
        assertEquals( MyEnumSecurityType.LETTER_OF_CREDIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SWING_LINE_FACILITY);
        assertEquals( MyEnumSecurityType.SWING_LINE_FACILITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( MyEnumSecurityType.DEBTOR_IN_POSSESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEFAULTED_LOAN);
        assertEquals( MyEnumSecurityType.DEFAULTED_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WITHDRAWN_LOAN);
        assertEquals( MyEnumSecurityType.WITHDRAWN_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPLACED_LOAN);
        assertEquals( MyEnumSecurityType.REPLACED_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MATURED_LOAN);
        assertEquals( MyEnumSecurityType.MATURED_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.AMENDED_AND_RESTATED);
        assertEquals( MyEnumSecurityType.AMENDED_AND_RESTATED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.RETIRED_LOAN);
        assertEquals( MyEnumSecurityType.RETIRED_LOAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Money Market, 18
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( MyEnumSecurityType.BANKERS_ACCEPTANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANK_NOTES);
        assertEquals( MyEnumSecurityType.BANK_NOTES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BILL_OF_EXCHANGES);
        assertEquals( MyEnumSecurityType.BILL_OF_EXCHANGES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CALL_LOANS);
        assertEquals( MyEnumSecurityType.CALL_LOANS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.COMMERCIAL_PAPER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPOSIT_NOTES);
        assertEquals( MyEnumSecurityType.DEPOSIT_NOTES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.EURO_COMMERCIAL_PAPER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LIQUIDITY_NOTE);
        assertEquals( MyEnumSecurityType.LIQUIDITY_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( MyEnumSecurityType.MEDIUM_TERM_NOTES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OVERNIGHT);
        assertEquals( MyEnumSecurityType.OVERNIGHT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PROMISSORY_NOTE);
        assertEquals( MyEnumSecurityType.PROMISSORY_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PLAZOS_FIJOS);
        assertEquals( MyEnumSecurityType.PLAZOS_FIJOS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( MyEnumSecurityType.SHORT_TERM_LOAN_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TIME_DEPOSIT);
        assertEquals( MyEnumSecurityType.TIME_DEPOSIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( MyEnumSecurityType.EXTENDED_COMM_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Mortgage, 11
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.ASSET_BACKED_SECURITIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.IOETTE_MORTGAGE);
        assertEquals( MyEnumSecurityType.IOETTE_MORTGAGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( MyEnumSecurityType.MORTGAGE_INTEREST_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PFANDBRIEFE);
        assertEquals( MyEnumSecurityType.PFANDBRIEFE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TO_BE_ANNOUNCED);
        assertEquals( MyEnumSecurityType.TO_BE_ANNOUNCED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Municipal, 16
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( MyEnumSecurityType.OTHER_ANTICIPATION_NOTES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( MyEnumSecurityType.GENERAL_OBLIGATION_BONDS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MANDATORY_TENDER);
        assertEquals( MyEnumSecurityType.MANDATORY_TENDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_BONDS);
        assertEquals( MyEnumSecurityType.REVENUE_BONDS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( MyEnumSecurityType.SPECIAL_ASSESSMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_OBLIGATION);
        assertEquals( MyEnumSecurityType.SPECIAL_OBLIGATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_TAX);
        assertEquals( MyEnumSecurityType.SPECIAL_TAX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.TAX_ANTICIPATION_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ALLOCATION);
        assertEquals( MyEnumSecurityType.TAX_ALLOCATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WARRANT);
        assertEquals( MyEnumSecurityType.WARRANT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * Other, 7
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MUTUAL_FUND);
        assertEquals( MyEnumSecurityType.MUTUAL_FUND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( MyEnumSecurityType.MULTILEG_INSTRUMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.NO_SECURITY_TYPE);
        assertEquals( MyEnumSecurityType.NO_SECURITY_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( MyEnumSecurityType.OPTIONS_ON_FUTURES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( MyEnumSecurityType.OPTIONS_ON_PHYSICAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WILDCARD_ENTRY);
        assertEquals( MyEnumSecurityType.WILDCARD_ENTRY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CASH);
        assertEquals( MyEnumSecurityType.CASH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag167EnuSecurityType tagData;

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag167EnuSecurityType tagData;

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag167EnuSecurityType tagData;

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag167EnuSecurityType tagData;

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag167EnuSecurityType tagData;

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( "Tag167EnuSecurityType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}