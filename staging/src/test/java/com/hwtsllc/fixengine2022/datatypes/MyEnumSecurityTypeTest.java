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
        assertEquals("FUT", enumType.toFIXIDString());
        assertEquals("DEPRECATED_FUTURE", enumType.toFIXNameString());
        assertEquals("FUT - Future (Deprecated)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_OPTION;
        assertEquals("OPT", enumType.toFIXIDString());
        assertEquals("DEPRECATED_OPTION", enumType.toFIXNameString());
        assertEquals("OPT - Option (Deprecated)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE;
        assertEquals("UST", enumType.toFIXIDString());
        assertEquals("DEPRECATED_US_TREASURY_NOTE", enumType.toFIXNameString());
        assertEquals("UST - US Treasury Note (Deprecated Value Use TNOTE)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL;
        assertEquals("USTB", enumType.toFIXIDString());
        assertEquals("DEPRECATED_US_TREASURY_BILL", enumType.toFIXNameString());
        assertEquals("USTB - US Treasury Bill (Deprecated Value Use TBILL)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Agency msg types
         */
        enumType = MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON;
        assertEquals("EUSUPRA", enumType.toFIXIDString());
        assertEquals("EURO_SUPRANATIONAL_COUPON", enumType.toFIXNameString());
        assertEquals("EUSUPRA - Euro Supranational Coupon (Agency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_COUPON;
        assertEquals("FAC", enumType.toFIXIDString());
        assertEquals("FEDERAL_AGENCY_COUPON", enumType.toFIXNameString());
        assertEquals("FAC - Federal Agency Coupon", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE;
        assertEquals("FADN", enumType.toFIXIDString());
        assertEquals("FEDERAL_AGENCY_DISCOUNT_NOTE", enumType.toFIXNameString());
        assertEquals("FADN - Federal Agency Discount Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PRIVATE_EXPORT_FUNDING;
        assertEquals("PEF", enumType.toFIXIDString());
        assertEquals("PRIVATE_EXPORT_FUNDING", enumType.toFIXNameString());
        assertEquals("PEF - Private Export Funding (Agency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.USD_SUPRANATIONAL_COUPON;
        assertEquals("SUPRA", enumType.toFIXIDString());
        assertEquals("USD_SUPRANATIONAL_COUPON", enumType.toFIXNameString());
        assertEquals("SUPRA - USD Supranational Coupons (Agency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Corporate msg types
         */
        enumType = MyEnumSecurityType.CORPORATE_BOND;
        assertEquals("CORP", enumType.toFIXIDString());
        assertEquals("CORPORATE_BOND", enumType.toFIXNameString());
        assertEquals("CORP - Corporate Bond", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT;
        assertEquals("CPP", enumType.toFIXIDString());
        assertEquals("CORPORATE_PRIVATE_PLACEMENT", enumType.toFIXNameString());
        assertEquals("CPP - Corporate Private Placement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CONVERTIBLE_BOND;
        assertEquals("CB", enumType.toFIXIDString());
        assertEquals("CONVERTIBLE_BOND", enumType.toFIXNameString());
        assertEquals("CB - Convertible Bond (Corporate)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DUAL_CURRENCY;
        assertEquals("DUAL", enumType.toFIXIDString());
        assertEquals("DUAL_CURRENCY", enumType.toFIXNameString());
        assertEquals("DUAL - Dual Currency (Corporate)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.EURO_CORPORATE_BOND;
        assertEquals("EUCORP", enumType.toFIXIDString());
        assertEquals("EURO_CORPORATE_BOND", enumType.toFIXNameString());
        assertEquals("EUCORP - Euro Corporate Bond", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.INDEXED_LINKED;
        assertEquals("XLINKD", enumType.toFIXIDString());
        assertEquals("INDEXED_LINKED", enumType.toFIXNameString());
        assertEquals("XLINKD - Indexed Linked (Corporate)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.STRUCTURED_NOTE;
        assertEquals("STRUCT", enumType.toFIXIDString());
        assertEquals("STRUCTURED_NOTE", enumType.toFIXNameString());
        assertEquals("STRUCT - Structured Note (Corporate)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.YANKEE_CORPORATE_BOND;
        assertEquals("YANK", enumType.toFIXIDString());
        assertEquals("YANKEE_CORPORATE_BOND", enumType.toFIXNameString());
        assertEquals("YANK - Yankee Corporate Bond", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Currency msg types
         */
        enumType = MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT;
        assertEquals("FOR", enumType.toFIXIDString());
        assertEquals("FOREIGN_EXCHANGE_CONTRACT", enumType.toFIXNameString());
        assertEquals("FOR - Foreign Exchange Contract (Currency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Equity msg types
         */
        enumType = MyEnumSecurityType.COMMON_STOCK;
        assertEquals("CS", enumType.toFIXIDString());
        assertEquals("COMMON_STOCK", enumType.toFIXNameString());
        assertEquals("CS - Common Stock (Equity)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PREFERRED_STOCK;
        assertEquals("PS", enumType.toFIXIDString());
        assertEquals("PREFERRED_STOCK", enumType.toFIXNameString());
        assertEquals("PS - Preferred Stock (Equity)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Finance msg types
         */
        enumType = MyEnumSecurityType.REPURCHASE;
        assertEquals("REPO", enumType.toFIXIDString());
        assertEquals("REPURCHASE", enumType.toFIXNameString());
        assertEquals("REPO - Repurchase (Financing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.FORWARD;
        assertEquals("FORWARD", enumType.toFIXIDString());
        assertEquals("FORWARD", enumType.toFIXNameString());
        assertEquals("FORWARD - Forward (Financing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.BUY_SELLBACK;
        assertEquals("BUYSELL", enumType.toFIXIDString());
        assertEquals("BUY_SELLBACK", enumType.toFIXNameString());
        assertEquals("BUYSELL - Buy Sellback (Financing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SECURITIES_LOAN;
        assertEquals("SECLOAN", enumType.toFIXIDString());
        assertEquals("SECURITIES_LOAN", enumType.toFIXNameString());
        assertEquals("SECLOAN - Securities Loan (Financing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SECURITIES_PLEDGE;
        assertEquals("SECPLEDGE", enumType.toFIXIDString());
        assertEquals("SECURITIES_PLEDGE", enumType.toFIXNameString());
        assertEquals("SECPLEDGE - Securities Pledge (Financing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Government msg types
         */
        enumType = MyEnumSecurityType.BRADY_BOND;
        assertEquals("BRADY", enumType.toFIXIDString());
        assertEquals("BRADY_BOND", enumType.toFIXNameString());
        assertEquals("BRADY - Brady Bond (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.EURO_SOVEREIGNS;
        assertEquals("EUSOV", enumType.toFIXIDString());
        assertEquals("EURO_SOVEREIGNS", enumType.toFIXNameString());
        assertEquals("EUSOV - Euro Sovereigns (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_BOND;
        assertEquals("TBOND", enumType.toFIXIDString());
        assertEquals("US_TREASURY_BOND", enumType.toFIXNameString());
        assertEquals("TBOND - US Treasury Bond (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.INTEREST_STRIP_ANY_BOND;
        assertEquals("TINT", enumType.toFIXIDString());
        assertEquals("INTEREST_STRIP_ANY_BOND", enumType.toFIXNameString());
        assertEquals("TINT - Interest Strip From Any Bond Or Note (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES;
        assertEquals("TIPS", enumType.toFIXIDString());
        assertEquals("TREASURY_INFLATION_PROTECTED_SECURITIES", enumType.toFIXNameString());
        assertEquals("TIPS - Treasury Inflation Protected Securities (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND;
        assertEquals("TCAL", enumType.toFIXIDString());
        assertEquals("PRINCIPAL_STRIP_CALLABLE_BOND", enumType.toFIXNameString());
        assertEquals("TCAL - Principal Strip Of A Callable Bond Or Note (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND;
        assertEquals("TPRN", enumType.toFIXIDString());
        assertEquals("PRINCIPAL_STRIP_NON_CALLABLE_BOND", enumType.toFIXNameString());
        assertEquals("TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_NOTE;
        assertEquals("TNOTE", enumType.toFIXIDString());
        assertEquals("US_TREASURY_NOTE", enumType.toFIXNameString());
        assertEquals("TNOTE - US Treasury Note (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.US_TREASURY_BILL;
        assertEquals("TBILL", enumType.toFIXIDString());
        assertEquals("US_TREASURY_BILL", enumType.toFIXNameString());
        assertEquals("TBILL - US Treasury Bill (Government)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Loan msg types
         */
        enumType = MyEnumSecurityType.TERM_LOAN;
        assertEquals("TERM", enumType.toFIXIDString());
        assertEquals("TERM_LOAN", enumType.toFIXNameString());
        assertEquals("TERM - Term Loan", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.REVOLVER_LOAN;
        assertEquals("RVLV", enumType.toFIXIDString());
        assertEquals("REVOLVER_LOAN", enumType.toFIXNameString());
        assertEquals("RVLV - Revolver Loan", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.REVOLVER_TERM_LOAN;
        assertEquals("RVLVTRM", enumType.toFIXIDString());
        assertEquals("REVOLVER_TERM_LOAN", enumType.toFIXNameString());
        assertEquals("RVLVTRM - Revolver/Term Loan", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.BRIDGE_LOAN;
        assertEquals("BRIDGE", enumType.toFIXIDString());
        assertEquals("BRIDGE_LOAN", enumType.toFIXNameString());
        assertEquals("BRIDGE - Bridge Loan", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.LETTER_OF_CREDIT;
        assertEquals("LOFC", enumType.toFIXIDString());
        assertEquals("LETTER_OF_CREDIT", enumType.toFIXNameString());
        assertEquals("LOFC - Letter Of Credit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.SWING_LINE_FACILITY;
        assertEquals("SWING", enumType.toFIXIDString());
        assertEquals("SWING_LINE_FACILITY", enumType.toFIXNameString());
        assertEquals("SWING - Swing Line Facility", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEBTOR_IN_POSSESSION;
        assertEquals("DINP", enumType.toFIXIDString());
        assertEquals("DEBTOR_IN_POSSESSION", enumType.toFIXNameString());
        assertEquals("DINP - Debtor In Possession", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEFAULTED_LOAN;
        assertEquals("DEFLTED", enumType.toFIXIDString());
        assertEquals("DEFAULTED_LOAN", enumType.toFIXNameString());
        assertEquals("DEFLTED - Defaulted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.WITHDRAWN_LOAN;
        assertEquals("WITHDRN", enumType.toFIXIDString());
        assertEquals("WITHDRAWN_LOAN", enumType.toFIXNameString());
        assertEquals("WITHDRN - Withdrawn", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.REPLACED_LOAN;
        assertEquals("REPLACD", enumType.toFIXIDString());
        assertEquals("REPLACED_LOAN", enumType.toFIXNameString());
        assertEquals("REPLACD - Replaced", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.MATURED_LOAN;
        assertEquals("MATURED", enumType.toFIXIDString());
        assertEquals("MATURED_LOAN", enumType.toFIXNameString());
        assertEquals("MATURED - Matured", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.AMENDED_AND_RESTATED;
        assertEquals("AMENDED", enumType.toFIXIDString());
        assertEquals("AMENDED_AND_RESTATED", enumType.toFIXNameString());
        assertEquals("AMENDED - Amended & Restated", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.RETIRED_LOAN;
        assertEquals("RETIRED", enumType.toFIXIDString());
        assertEquals("RETIRED_LOAN", enumType.toFIXNameString());
        assertEquals("RETIRED - Retired", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Money Market msg types
         */
        enumType = MyEnumSecurityType.BANKERS_ACCEPTANCE;
        assertEquals("BA", enumType.toFIXIDString());
        assertEquals("BANKERS_ACCEPTANCE", enumType.toFIXNameString());
        assertEquals("BA - Bankers Acceptance", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.BANK_NOTES;
        assertEquals("BN", enumType.toFIXIDString());
        assertEquals("BANK_NOTES", enumType.toFIXNameString());
        assertEquals("BN - Bank Notes", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.BILL_OF_EXCHANGES;
        assertEquals("BOX", enumType.toFIXIDString());
        assertEquals("BILL_OF_EXCHANGES", enumType.toFIXNameString());
        assertEquals("BOX - Bill Of Exchanges", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT;
        assertEquals("CD", enumType.toFIXIDString());
        assertEquals("CERTIFICATE_OF_DEPOSIT", enumType.toFIXNameString());
        assertEquals("CD - Certificate Of Deposit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CALL_LOANS;
        assertEquals("CL", enumType.toFIXIDString());
        assertEquals("CALL_LOANS", enumType.toFIXNameString());
        assertEquals("CL - Call Loans", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.COMMERCIAL_PAPER;
        assertEquals("CP", enumType.toFIXIDString());
        assertEquals("COMMERCIAL_PAPER", enumType.toFIXNameString());
        assertEquals("CP - Commercial Paper", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.DEPOSIT_NOTES;
        assertEquals("DN", enumType.toFIXIDString());
        assertEquals("DEPOSIT_NOTES", enumType.toFIXNameString());
        assertEquals("DN - Deposit Notes", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT;
        assertEquals("EUCD", enumType.toFIXIDString());
        assertEquals("EURO_CERTIFICATE_OF_DEPOSIT", enumType.toFIXNameString());
        assertEquals("EUCD - Euro Certificate Of Deposit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.EURO_COMMERCIAL_PAPER;
        assertEquals("EUCP", enumType.toFIXIDString());
        assertEquals("EURO_COMMERCIAL_PAPER", enumType.toFIXNameString());
        assertEquals("EUCP - Euro Commercial Paper", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.LIQUIDITY_NOTE;
        assertEquals("LQN", enumType.toFIXIDString());
        assertEquals("LIQUIDITY_NOTE", enumType.toFIXNameString());
        assertEquals("LQN - Liquidity Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.MEDIUM_TERM_NOTES;
        assertEquals("MTN", enumType.toFIXIDString());
        assertEquals("MEDIUM_TERM_NOTES", enumType.toFIXNameString());
        assertEquals("MTN - Medium Term Notes", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.OVERNIGHT;
        assertEquals("ONITE", enumType.toFIXIDString());
        assertEquals("OVERNIGHT", enumType.toFIXNameString());
        assertEquals("ONITE - Overnight", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PROMISSORY_NOTE;
        assertEquals("PN", enumType.toFIXIDString());
        assertEquals("PROMISSORY_NOTE", enumType.toFIXNameString());
        assertEquals("PN - Promissory Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PLAZOS_FIJOS;
        assertEquals("PZFJ", enumType.toFIXIDString());
        assertEquals("PLAZOS_FIJOS", enumType.toFIXNameString());
        assertEquals("PZFJ - Plazos Fijos", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SHORT_TERM_LOAN_NOTE;
        assertEquals("STN", enumType.toFIXIDString());
        assertEquals("SHORT_TERM_LOAN_NOTE", enumType.toFIXNameString());
        assertEquals("STN - Short Term Loan Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.TIME_DEPOSIT;
        assertEquals("TD", enumType.toFIXIDString());
        assertEquals("TIME_DEPOSIT", enumType.toFIXNameString());
        assertEquals("TD - Time Deposit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.EXTENDED_COMM_NOTE;
        assertEquals("XCN", enumType.toFIXIDString());
        assertEquals("EXTENDED_COMM_NOTE", enumType.toFIXNameString());
        assertEquals("XCN - Extended Comm Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT;
        assertEquals("YCD", enumType.toFIXIDString());
        assertEquals("YANKEE_CERTIFICATE_OF_DEPOSIT", enumType.toFIXNameString());
        assertEquals("YCD - Yankee Certificate Of Deposit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Mortgage msg types
         */
        enumType = MyEnumSecurityType.ASSET_BACKED_SECURITIES;
        assertEquals("ABS", enumType.toFIXIDString());
        assertEquals("ASSET_BACKED_SECURITIES", enumType.toFIXNameString());
        assertEquals("ABS - Asset-backed Securities", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES;
        assertEquals("CMBS", enumType.toFIXIDString());
        assertEquals("CORP_MORTGAGE_BACKED_SECURITIES", enumType.toFIXNameString());
        assertEquals("CMBS - Corp. Mortgage-backed Securities", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;
        assertEquals("CMO", enumType.toFIXIDString());
        assertEquals("COLLATERALIZED_MORTGAGE_OBLIGATION", enumType.toFIXNameString());
        assertEquals("CMO - Collateralized Mortgage Obligation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.IOETTE_MORTGAGE;
        assertEquals("IET", enumType.toFIXIDString());
        assertEquals("IOETTE_MORTGAGE", enumType.toFIXNameString());
        assertEquals("IET - IOETTE Mortgage", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES;
        assertEquals("MBS", enumType.toFIXIDString());
        assertEquals("MORTGAGE_BACKED_SECURITIES", enumType.toFIXNameString());
        assertEquals("MBS - Mortgage-backed Securities", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.MORTGAGE_INTEREST_ONLY;
        assertEquals("MIO", enumType.toFIXIDString());
        assertEquals("MORTGAGE_INTEREST_ONLY", enumType.toFIXNameString());
        assertEquals("MIO - Mortgage Interest Only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY;
        assertEquals("MPO", enumType.toFIXIDString());
        assertEquals("MORTGAGE_PRINCIPAL_ONLY", enumType.toFIXNameString());
        assertEquals("MPO - Mortgage Principal Only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT;
        assertEquals("MPP", enumType.toFIXIDString());
        assertEquals("MORTGAGE_PRIVATE_PLACEMENT", enumType.toFIXNameString());
        assertEquals("MPP - Mortgage Private Placement", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH;
        assertEquals("MPT", enumType.toFIXIDString());
        assertEquals("MISCELLANEOUS_PASS_THROUGH", enumType.toFIXNameString());
        assertEquals("MPT - Miscellaneous Pass-through", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.PFANDBRIEFE;
        assertEquals("PFAND", enumType.toFIXIDString());
        assertEquals("PFANDBRIEFE", enumType.toFIXNameString());
        assertEquals("PFAND - Pfandbriefe", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.TO_BE_ANNOUNCED;
        assertEquals("TBA", enumType.toFIXIDString());
        assertEquals("TO_BE_ANNOUNCED", enumType.toFIXNameString());
        assertEquals("TBA - To Be Announced", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Municipal msg types
         */
        enumType = MyEnumSecurityType.OTHER_ANTICIPATION_NOTES;
        assertEquals("AN", enumType.toFIXIDString());
        assertEquals("OTHER_ANTICIPATION_NOTES", enumType.toFIXNameString());
        assertEquals("AN - Other Anticipation Notes (BAN, GAN, etc.)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION;
        assertEquals("COFO", enumType.toFIXIDString());
        assertEquals("CERTIFICATE_OF_OBLIGATION", enumType.toFIXNameString());
        assertEquals("COFO - Certificate Of Obligation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION;
        assertEquals("COFP", enumType.toFIXIDString());
        assertEquals("CERTIFICATE_OF_PARTICIPATION", enumType.toFIXNameString());
        assertEquals("COFP - Certificate Of Participation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.GENERAL_OBLIGATION_BONDS;
        assertEquals("GO", enumType.toFIXIDString());
        assertEquals("GENERAL_OBLIGATION_BONDS", enumType.toFIXNameString());
        assertEquals("GO - General Obligation Bonds", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MANDATORY_TENDER;
        assertEquals("MT", enumType.toFIXIDString());
        assertEquals("MANDATORY_TENDER", enumType.toFIXNameString());
        assertEquals("MT - Mandatory Tender", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE;
        assertEquals("RAN", enumType.toFIXIDString());
        assertEquals("REVENUE_ANTICIPATION_NOTE", enumType.toFIXNameString());
        assertEquals("RAN - Revenue Anticipation Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.REVENUE_BONDS;
        assertEquals("REV", enumType.toFIXIDString());
        assertEquals("REVENUE_BONDS", enumType.toFIXNameString());
        assertEquals("REV - Revenue Bonds", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_ASSESSMENT;
        assertEquals("SPCLA", enumType.toFIXIDString());
        assertEquals("SPECIAL_ASSESSMENT", enumType.toFIXNameString());
        assertEquals("SPCLA - Special Assessment", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_OBLIGATION;
        assertEquals("SPCLO", enumType.toFIXIDString());
        assertEquals("SPECIAL_OBLIGATION", enumType.toFIXNameString());
        assertEquals("SPCLO - Special Obligation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.SPECIAL_TAX;
        assertEquals("SPCLT", enumType.toFIXIDString());
        assertEquals("SPECIAL_TAX", enumType.toFIXNameString());
        assertEquals("SPCLT - Special Tax", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.TAX_ANTICIPATION_NOTE;
        assertEquals("TAN", enumType.toFIXIDString());
        assertEquals("TAX_ANTICIPATION_NOTE", enumType.toFIXNameString());
        assertEquals("TAN - Tax Anticipation Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.TAX_ALLOCATION;
        assertEquals("TAXA", enumType.toFIXIDString());
        assertEquals("TAX_ALLOCATION", enumType.toFIXNameString());
        assertEquals("TAXA - Tax Allocation", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER;
        assertEquals("TECP", enumType.toFIXIDString());
        assertEquals("TAX_EXEMPT_COMMERCIAL_PAPER", enumType.toFIXNameString());
        assertEquals("TECP - Tax Exempt Commercial Paper", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE;
        assertEquals("TRAN", enumType.toFIXIDString());
        assertEquals("TAX_REVENUE_ANTICIPATION_NOTE", enumType.toFIXNameString());
        assertEquals("TRAN - Tax Revenue Anticipation Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE;
        assertEquals("VRDN", enumType.toFIXIDString());
        assertEquals("VARIABLE_RATE_DEMAND_NOTE", enumType.toFIXNameString());
        assertEquals("VRDN - Variable Rate Demand Note", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.WARRANT;
        assertEquals("WAR", enumType.toFIXIDString());
        assertEquals("WARRANT", enumType.toFIXNameString());
        assertEquals("WAR - Warrant", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * Other msg types
         */
        enumType = MyEnumSecurityType.MUTUAL_FUND;
        assertEquals("MF", enumType.toFIXIDString());
        assertEquals("MUTUAL_FUND", enumType.toFIXNameString());
        assertEquals("MF - Mutual Fund", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.MULTILEG_INSTRUMENT;
        assertEquals("MLEG", enumType.toFIXIDString());
        assertEquals("MULTILEG_INSTRUMENT", enumType.toFIXNameString());
        assertEquals("MLEG - Multileg Instrument", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.NO_SECURITY_TYPE;
        assertEquals("NONE", enumType.toFIXIDString());
        assertEquals("NO_SECURITY_TYPE", enumType.toFIXNameString());
        assertEquals("NONE - No Security Type", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.OPTIONS_ON_FUTURES;
        assertEquals("OOF", enumType.toFIXIDString());
        assertEquals("OPTIONS_ON_FUTURES", enumType.toFIXNameString());
        assertEquals("OOF - Options on Futures", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.OPTIONS_ON_PHYSICAL;
        assertEquals("OOP", enumType.toFIXIDString());
        assertEquals("OPTIONS_ON_PHYSICAL", enumType.toFIXNameString());
        assertEquals("OOP - Options on Physical", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = MyEnumSecurityType.WILDCARD_ENTRY;
        assertEquals("WLD", enumType.toFIXIDString());
        assertEquals("WILDCARD_ENTRY", enumType.toFIXNameString());
        assertEquals("WLD - Wildcard Entry (used on Security Definition Request message)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = MyEnumSecurityType.CASH;
        assertEquals("CASH", enumType.toFIXIDString());
        assertEquals("CASH", enumType.toFIXNameString());
        assertEquals("CASH - Cash", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}