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
 *  <p>    "FUT - Future (Deprecated)"
 *  <p>    "OPT - Option (Deprecated)"
 *  <p>    "UST - US Treasury Note (Deprecated Value Use TNOTE)"
 *  <p>    "USTB - US Treasury Bill (Deprecated Value Use TBILL)"
 *  <p></p>
 *      Agency, 5
 *  <p>    "EUSUPRA - Euro Supranational Coupon (Agency)"
 *  <p>    "FAC - Federal Agency Coupon"
 *  <p>    "FADN - Federal Agency Discount Note"
 *  <p>    "PEF - Private Export Funding (Agency)"
 *  <p>    "SUPRA - USD Supranational Coupons (Agency)"
 *  <p></p>
 *      Corporate, 8
 *  <p>    "CORP - Corporate Bond"
 *  <p>    "CPP - Corporate Private Placement"
 *  <p>    "CB - Convertible Bond (Corporate)"
 *  <p>    "DUAL - Dual Currency (Corporate)"
 *  <p>    "EUCORP - Euro Corporate Bond"
 *  <p></p>
 *  <p>    "XLINKD - Indexed Linked (Corporate)"
 *  <p>    "STRUCT - Structured Note (Corporate)"
 *  <p>    "YANK - Yankee Corporate Bond"
 *  <p></p>
 *      Currency, 1
 *  <p>    "FOR - Foreign Exchange Contract (Currency)"
 *  <p></p>
 *      Equity, 2
 *  <p>    "CS - Common Stock (Equity)"
 *  <p>    "PS - Preferred Stock (Equity)"
 *  <p></p>
 *      Finance, 5
 *  <p>    "REPO - Repurchase (Financing)"
 *  <p>    "FORWARD - Forward (Financing)"
 *  <p>    "BUYSELL - Buy Sellback (Financing)"
 *  <p>    "SECLOAN - Securities Loan (Financing)"
 *  <p>    "SECPLEDGE - Securities Pledge (Financing)"
 *  <p></p>
 *      Government, 9
 *  <p>    "BRADY - Brady Bond (Government)"
 *  <p>    "EUSOV - Euro Sovereigns (Government)"
 *  <p>    "TBOND - US Treasury Bond (Government)"
 *  <p>    "TINT - Interest Strip From Any Bond Or Note (Government)"
 *  <p>    "TIPS - Treasury Inflation Protected Securities (Government)"
 *  <p></p>
 *  <p>    "TCAL - Principal Strip Of A Callable Bond Or Note (Government)"
 *  <p>    "TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)"
 *  <p>    "TNOTE - US Treasury Note (Government)"
 *  <p>    "TBILL - US Treasury Bill (Government)"
 *  <p></p>
 *      Loan, 13
 *  <p>    "TERM - Term Loan"
 *  <p>    "RVLV - Revolver Loan"
 *  <p>    "RVLVTRM - Revolver/Term Loan"
 *  <p>    "BRIDGE - Bridge Loan"
 *  <p>    "LOFC - Letter Of Credit"
 *  <p></p>
 *  <p>    "SWING - Swing Line Facility"
 *  <p>    "DINP - Debtor In Possession"
 *  <p>    "DEFLTED - Defaulted"
 *  <p>    "WITHDRN - Withdrawn"
 *  <p>    "REPLACD - Replaced"
 *  <p></p>
 *  <p>    "MATURED - Matured"
 *  <p>    "AMENDED - Amended & Restated"
 *  <p>    "RETIRED - Retired"
 *  <p></p>
 *      Money Market, 18
 *  <p>    "BA - Bankers Acceptance"
 *  <p>    "BN - Bank Notes"
 *  <p>    "BOX - Bill Of Exchanges"
 *  <p>    "CD - Certificate Of Deposit"
 *  <p>    "CL - Call Loans"
 *  <p></p>
 *  <p>    "CP - Commercial Paper"
 *  <p>    "DN - Deposit Notes"
 *  <p>    "EUCD - Euro Certificate Of Deposit"
 *  <p>    "EUCP - Euro Commercial Paper"
 *  <p>    "LQN - Liquidity Note"
 *  <p></p>
 *  <p>    "MTN - Medium Term Notes"
 *  <p>    "ONITE - Overnight"
 *  <p>    "PN - Promissory Note"
 *  <p>    "PZFJ - Plazos Fijos"
 *  <p>    "STN - Short Term Loan Note"
 *  <p></p>
 *  <p>    "TD - Time Deposit"
 *  <p>    "XCN - Extended Comm Note"
 *  <p>    "YCD - Yankee Certificate Of Deposit"
 *  <p></p>
 *      Mortgage, 11
 *  <p>    "ABS - Asset-backed Securities"
 *  <p>    "CMBS - Corp. Mortgage-backed Securities"
 *  <p>    "CMO - Collateralized Mortgage Obligation"
 *  <p>    "IET - IOETTE Mortgage"
 *  <p>    "MBS - Mortgage-backed Securities"
 *  <p></p>
 *  <p>    "MIO - Mortgage Interest Only"
 *  <p>    "MPO - Mortgage Principal Only"
 *  <p>    "MPP - Mortgage Private Placement"
 *  <p>    "MPT - Miscellaneous Pass-through"
 *  <p>    "PFAND - Pfandbriefe"
 *  <p></p>
 *  <p>    "TBA - To Be Announced"
 *  <p></p>
 *      Municipal, 16
 *  <p>    "AN - Other Anticipation Notes (BAN, GAN, etc.)",
 *  <p>    "COFO - Certificate Of Obligation"
 *  <p>    "COFP - Certificate Of Participation"
 *  <p>    "GO - General Obligation Bonds"
 *  <p>    "MT - Mandatory Tender"
 *  <p></p>
 *  <p>    "RAN - Revenue Anticipation Note"
 *  <p>    "REV - Revenue Bonds"
 *  <p>    "SPCLA - Special Assessment"
 *  <p>    "SPCLO - Special Obligation"
 *  <p>    "SPCLT - Special Tax"
 *  <p></p>
 *  <p>    "TAN - Tax Anticipation Note"
 *  <p>    "TAXA - Tax Allocation"
 *  <p>    "TECP - Tax Exempt Commercial Paper"
 *  <p>    "TRAN - Tax Revenue Anticipation Note"
 *  <p>    "VRDN - Variable Rate Demand Note"
 *  <p></p>
 *  <p>    "WAR - Warrant"
 *  <p></p>
 *      Other, 7
 *  <p>    "MF - Mutual Fund"
 *  <p>    "MLEG - Multileg Instrument"
 *  <p>    "NONE - No Security Type"
 *  <p>    "OOF - Options on Futures"
 *  <p>    "OOP - Options on Physical"
 *  <p></p>
 *  <p>    "WLD - Wildcard Entry (used on Security Definition Request message)"
 *  <p>    "CASH - Cash"
 */
class MyEnumSecurityTypeTest {
    @Test
    void Enum0167Test() {
        MyEnumSecurityType enumType;

        /*
         * Deprecated msg types
         */
        enumType = MyEnumSecurityType.DEPRECATED_FUTURE;
        assertEquals("FUT", enumType.toEnumIDString());
        assertEquals("DEPRECATED_FUTURE", enumType.toEnumNameString());
        assertEquals("FUT - Future (Deprecated)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.toEnumIDString());
        assertEquals("DEPRECATED_OPTION", enumType.toEnumNameString());
        assertEquals("OPT - Option (Deprecated)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.toEnumIDString());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.toEnumNameString());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.toEnumIDString());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.toEnumNameString());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Agency msg types
         */
        enumType = MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.toEnumIDString());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.toEnumNameString());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.toEnumIDString());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.toEnumNameString());
        assertEquals("FAC - Federal Agency Coupon", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.toEnumIDString());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.toEnumNameString());
        assertEquals("FADN - Federal Agency Discount Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.toEnumIDString());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.toEnumNameString());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.toEnumIDString());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.toEnumNameString());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Corporate msg types
         */
        enumType = MyEnumSecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.toEnumIDString());
        assertEquals("CORPORATE_BOND", enumType.toEnumNameString());
        assertEquals("CORP - Corporate Bond", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.toEnumIDString());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.toEnumNameString());
        assertEquals("CPP - Corporate Private Placement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.toEnumIDString());
        assertEquals("CONVERTIBLE_BOND", enumType.toEnumNameString());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.toEnumIDString());
        assertEquals("DUAL_CURRENCY", enumType.toEnumNameString());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.toEnumIDString());
        assertEquals("EURO_CORPORATE_BOND", enumType.toEnumNameString());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.toEnumIDString());
        assertEquals("INDEXED_LINKED", enumType.toEnumNameString());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.toEnumIDString());
        assertEquals("STRUCTURED_NOTE", enumType.toEnumNameString());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.toEnumIDString());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.toEnumNameString());
        assertEquals("YANK - Yankee Corporate Bond", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Currency msg types
         */
        enumType = MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.toEnumIDString());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.toEnumNameString());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Equity msg types
         */
        enumType = MyEnumSecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.toEnumIDString());
        assertEquals("COMMON_STOCK", enumType.toEnumNameString());
        assertEquals("CS - Common Stock (Equity)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.toEnumIDString());
        assertEquals("PREFERRED_STOCK", enumType.toEnumNameString());
        assertEquals("PS - Preferred Stock (Equity)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Finance msg types
         */
        enumType = MyEnumSecurityType.REPURCHASE;
        assertEquals("REPO", enumType.toEnumIDString());
        assertEquals("REPURCHASE", enumType.toEnumNameString());
        assertEquals("REPO - Repurchase (Financing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.FORWARD;
        assertEquals("FORWARD", enumType.toEnumIDString());
        assertEquals("FORWARD", enumType.toEnumNameString());
        assertEquals("FORWARD - Forward (Financing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.toEnumIDString());
        assertEquals("BUY_SELLBACK", enumType.toEnumNameString());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.toEnumIDString());
        assertEquals("SECURITIES_LOAN", enumType.toEnumNameString());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.toEnumIDString());
        assertEquals("SECURITIES_PLEDGE", enumType.toEnumNameString());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Government msg types
         */
        enumType = MyEnumSecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.toEnumIDString());
        assertEquals("BRADY_BOND", enumType.toEnumNameString());
        assertEquals("BRADY - Brady Bond (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.toEnumIDString());
        assertEquals("EURO_SOVEREIGNS", enumType.toEnumNameString());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.toEnumIDString());
        assertEquals("US_TREASURY_BOND", enumType.toEnumNameString());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.toEnumIDString());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.toEnumNameString());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.toEnumIDString());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.toEnumNameString());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.toEnumIDString());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.toEnumNameString());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.toEnumIDString());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.toEnumNameString());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.toEnumIDString());
        assertEquals("US_TREASURY_NOTE", enumType.toEnumNameString());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.toEnumIDString());
        assertEquals("US_TREASURY_BILL", enumType.toEnumNameString());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Loan msg types
         */
        enumType = MyEnumSecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.toEnumIDString());
        assertEquals("TERM_LOAN", enumType.toEnumNameString());
        assertEquals("TERM - Term Loan", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.toEnumIDString());
        assertEquals("REVOLVER_LOAN", enumType.toEnumNameString());
        assertEquals("RVLV - Revolver Loan", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.toEnumIDString());
        assertEquals("REVOLVER_TERM_LOAN", enumType.toEnumNameString());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.toEnumIDString());
        assertEquals("BRIDGE_LOAN", enumType.toEnumNameString());
        assertEquals("BRIDGE - Bridge Loan", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.toEnumIDString());
        assertEquals("LETTER_OF_CREDIT", enumType.toEnumNameString());
        assertEquals("LOFC - Letter Of Credit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.toEnumIDString());
        assertEquals("SWING_LINE_FACILITY", enumType.toEnumNameString());
        assertEquals("SWING - Swing Line Facility", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.toEnumIDString());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.toEnumNameString());
        assertEquals("DINP - Debtor In Possession", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.toEnumIDString());
        assertEquals("DEFAULTED_LOAN", enumType.toEnumNameString());
        assertEquals("DEFLTED - Defaulted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.toEnumIDString());
        assertEquals("WITHDRAWN_LOAN", enumType.toEnumNameString());
        assertEquals("WITHDRN - Withdrawn", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.toEnumIDString());
        assertEquals("REPLACED_LOAN", enumType.toEnumNameString());
        assertEquals("REPLACD - Replaced", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.toEnumIDString());
        assertEquals("MATURED_LOAN", enumType.toEnumNameString());
        assertEquals("MATURED - Matured", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.toEnumIDString());
        assertEquals("AMENDED_AND_RESTATED", enumType.toEnumNameString());
        assertEquals("AMENDED - Amended & Restated", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.toEnumIDString());
        assertEquals("RETIRED_LOAN", enumType.toEnumNameString());
        assertEquals("RETIRED - Retired", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Money Market msg types
         */
        enumType = MyEnumSecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.toEnumIDString());
        assertEquals("BANKERS_ACCEPTANCE", enumType.toEnumNameString());
        assertEquals("BA - Bankers Acceptance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.BANK_NOTES;
        assertEquals("BN", enumType.toEnumIDString());
        assertEquals("BANK_NOTES", enumType.toEnumNameString());
        assertEquals("BN - Bank Notes", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.toEnumIDString());
        assertEquals("BILL_OF_EXCHANGES", enumType.toEnumNameString());
        assertEquals("BOX - Bill Of Exchanges", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.toEnumIDString());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.toEnumNameString());
        assertEquals("CD - Certificate Of Deposit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CALL_LOANS;
        assertEquals("CL", enumType.toEnumIDString());
        assertEquals("CALL_LOANS", enumType.toEnumNameString());
        assertEquals("CL - Call Loans", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.toEnumIDString());
        assertEquals("COMMERCIAL_PAPER", enumType.toEnumNameString());
        assertEquals("CP - Commercial Paper", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.toEnumIDString());
        assertEquals("DEPOSIT_NOTES", enumType.toEnumNameString());
        assertEquals("DN - Deposit Notes", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.toEnumIDString());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.toEnumNameString());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.toEnumIDString());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.toEnumNameString());
        assertEquals("EUCP - Euro Commercial Paper", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.toEnumIDString());
        assertEquals("LIQUIDITY_NOTE", enumType.toEnumNameString());
        assertEquals("LQN - Liquidity Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.toEnumIDString());
        assertEquals("MEDIUM_TERM_NOTES", enumType.toEnumNameString());
        assertEquals("MTN - Medium Term Notes", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.toEnumIDString());
        assertEquals("OVERNIGHT", enumType.toEnumNameString());
        assertEquals("ONITE - Overnight", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.toEnumIDString());
        assertEquals("PROMISSORY_NOTE", enumType.toEnumNameString());
        assertEquals("PN - Promissory Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.toEnumIDString());
        assertEquals("PLAZOS_FIJOS", enumType.toEnumNameString());
        assertEquals("PZFJ - Plazos Fijos", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.toEnumIDString());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.toEnumNameString());
        assertEquals("STN - Short Term Loan Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.toEnumIDString());
        assertEquals("TIME_DEPOSIT", enumType.toEnumNameString());
        assertEquals("TD - Time Deposit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.toEnumIDString());
        assertEquals("EXTENDED_COMM_NOTE", enumType.toEnumNameString());
        assertEquals("XCN - Extended Comm Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.toEnumIDString());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.toEnumNameString());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Mortgage msg types
         */
        enumType = MyEnumSecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.toEnumIDString());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.toEnumNameString());
        assertEquals("ABS - Asset-backed Securities", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.toEnumIDString());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.toEnumNameString());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.toEnumIDString());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.toEnumNameString());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.toEnumIDString());
        assertEquals("IOETTE_MORTGAGE", enumType.toEnumNameString());
        assertEquals("IET - IOETTE Mortgage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.toEnumIDString());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.toEnumNameString());
        assertEquals("MBS - Mortgage-backed Securities", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.toEnumIDString());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.toEnumNameString());
        assertEquals("MIO - Mortgage Interest Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.toEnumIDString());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.toEnumNameString());
        assertEquals("MPO - Mortgage Principal Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.toEnumIDString());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.toEnumNameString());
        assertEquals("MPP - Mortgage Private Placement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.toEnumIDString());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.toEnumNameString());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.toEnumIDString());
        assertEquals("PFANDBRIEFE", enumType.toEnumNameString());
        assertEquals("PFAND - Pfandbriefe", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.toEnumIDString());
        assertEquals("TO_BE_ANNOUNCED", enumType.toEnumNameString());
        assertEquals("TBA - To Be Announced", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Municipal msg types
         */
        enumType = MyEnumSecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.toEnumIDString());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.toEnumNameString());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.toEnumIDString());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.toEnumNameString());
        assertEquals("COFO - Certificate Of Obligation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.toEnumIDString());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.toEnumNameString());
        assertEquals("COFP - Certificate Of Participation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.toEnumIDString());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.toEnumNameString());
        assertEquals("GO - General Obligation Bonds", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.toEnumIDString());
        assertEquals("MANDATORY_TENDER", enumType.toEnumNameString());
        assertEquals("MT - Mandatory Tender", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.toEnumIDString());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.toEnumNameString());
        assertEquals("RAN - Revenue Anticipation Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.toEnumIDString());
        assertEquals("REVENUE_BONDS", enumType.toEnumNameString());
        assertEquals("REV - Revenue Bonds", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.toEnumIDString());
        assertEquals("SPECIAL_ASSESSMENT", enumType.toEnumNameString());
        assertEquals("SPCLA - Special Assessment", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.toEnumIDString());
        assertEquals("SPECIAL_OBLIGATION", enumType.toEnumNameString());
        assertEquals("SPCLO - Special Obligation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.toEnumIDString());
        assertEquals("SPECIAL_TAX", enumType.toEnumNameString());
        assertEquals("SPCLT - Special Tax", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.toEnumIDString());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.toEnumNameString());
        assertEquals("TAN - Tax Anticipation Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.toEnumIDString());
        assertEquals("TAX_ALLOCATION", enumType.toEnumNameString());
        assertEquals("TAXA - Tax Allocation", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.toEnumIDString());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.toEnumNameString());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.toEnumIDString());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.toEnumNameString());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.toEnumIDString());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.toEnumNameString());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.WARRANT;
        assertEquals("WAR", enumType.toEnumIDString());
        assertEquals("WARRANT", enumType.toEnumNameString());
        assertEquals("WAR - Warrant", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * Other msg types
         */
        enumType = MyEnumSecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.toEnumIDString());
        assertEquals("MUTUAL_FUND", enumType.toEnumNameString());
        assertEquals("MF - Mutual Fund", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.toEnumIDString());
        assertEquals("MULTILEG_INSTRUMENT", enumType.toEnumNameString());
        assertEquals("MLEG - Multileg Instrument", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.toEnumIDString());
        assertEquals("NO_SECURITY_TYPE", enumType.toEnumNameString());
        assertEquals("NONE - No Security Type", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.toEnumIDString());
        assertEquals("OPTIONS_ON_FUTURES", enumType.toEnumNameString());
        assertEquals("OOF - Options on Futures", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.toEnumIDString());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.toEnumNameString());
        assertEquals("OOP - Options on Physical", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.toEnumIDString());
        assertEquals("WILDCARD_ENTRY", enumType.toEnumNameString());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityType.CASH;
        assertEquals("CASH", enumType.toEnumIDString());
        assertEquals("CASH", enumType.toEnumNameString());
        assertEquals("CASH - Cash", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}