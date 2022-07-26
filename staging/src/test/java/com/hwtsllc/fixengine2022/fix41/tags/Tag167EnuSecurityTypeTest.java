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
class Tag167EnuSecurityTypeTest {
    Tag167EnuSecurityType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( "FIX167_ENU_SECURITY_TYPE", tagData.toEnumLabelString());
            assertEquals( "167", tagData.toEnumIDString());
            assertEquals( "SECURITY_TYPE", tagData.toEnumNameString());
            assertEquals( "SecurityType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * Deprecated, 4
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_FUTURE);
        assertEquals( MyEnumSecurityType.DEPRECATED_FUTURE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_OPTION);
        assertEquals( MyEnumSecurityType.DEPRECATED_OPTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Agency, 5
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( MyEnumSecurityType.FEDERAL_AGENCY_COUPON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( MyEnumSecurityType.PRIVATE_EXPORT_FUNDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( MyEnumSecurityType.USD_SUPRANATIONAL_COUPON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Corporate, 8
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.CORPORATE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CONVERTIBLE_BOND);
        assertEquals( MyEnumSecurityType.CONVERTIBLE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DUAL_CURRENCY);
        assertEquals( MyEnumSecurityType.DUAL_CURRENCY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.EURO_CORPORATE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INDEXED_LINKED);
        assertEquals( MyEnumSecurityType.INDEXED_LINKED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.STRUCTURED_NOTE);
        assertEquals( MyEnumSecurityType.STRUCTURED_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( MyEnumSecurityType.YANKEE_CORPORATE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Currency, 1
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Equity, 2
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMON_STOCK);
        assertEquals( MyEnumSecurityType.COMMON_STOCK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PREFERRED_STOCK);
        assertEquals( MyEnumSecurityType.PREFERRED_STOCK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Finance, 5
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPURCHASE);
        assertEquals( MyEnumSecurityType.REPURCHASE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FORWARD);
        assertEquals( MyEnumSecurityType.FORWARD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BUY_SELLBACK);
        assertEquals( MyEnumSecurityType.BUY_SELLBACK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_LOAN);
        assertEquals( MyEnumSecurityType.SECURITIES_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_PLEDGE);
        assertEquals( MyEnumSecurityType.SECURITIES_PLEDGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Government, 9
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRADY_BOND);
        assertEquals( MyEnumSecurityType.BRADY_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SOVEREIGNS);
        assertEquals( MyEnumSecurityType.EURO_SOVEREIGNS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BOND);
        assertEquals( MyEnumSecurityType.US_TREASURY_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( MyEnumSecurityType.INTEREST_STRIP_ANY_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_NOTE);
        assertEquals( MyEnumSecurityType.US_TREASURY_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BILL);
        assertEquals( MyEnumSecurityType.US_TREASURY_BILL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Loan, 13
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TERM_LOAN);
        assertEquals( MyEnumSecurityType.TERM_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_LOAN);
        assertEquals( MyEnumSecurityType.REVOLVER_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( MyEnumSecurityType.REVOLVER_TERM_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRIDGE_LOAN);
        assertEquals( MyEnumSecurityType.BRIDGE_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LETTER_OF_CREDIT);
        assertEquals( MyEnumSecurityType.LETTER_OF_CREDIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SWING_LINE_FACILITY);
        assertEquals( MyEnumSecurityType.SWING_LINE_FACILITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( MyEnumSecurityType.DEBTOR_IN_POSSESSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEFAULTED_LOAN);
        assertEquals( MyEnumSecurityType.DEFAULTED_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WITHDRAWN_LOAN);
        assertEquals( MyEnumSecurityType.WITHDRAWN_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPLACED_LOAN);
        assertEquals( MyEnumSecurityType.REPLACED_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MATURED_LOAN);
        assertEquals( MyEnumSecurityType.MATURED_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.AMENDED_AND_RESTATED);
        assertEquals( MyEnumSecurityType.AMENDED_AND_RESTATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.RETIRED_LOAN);
        assertEquals( MyEnumSecurityType.RETIRED_LOAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Money Market, 18
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( MyEnumSecurityType.BANKERS_ACCEPTANCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANK_NOTES);
        assertEquals( MyEnumSecurityType.BANK_NOTES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BILL_OF_EXCHANGES);
        assertEquals( MyEnumSecurityType.BILL_OF_EXCHANGES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CALL_LOANS);
        assertEquals( MyEnumSecurityType.CALL_LOANS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.COMMERCIAL_PAPER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPOSIT_NOTES);
        assertEquals( MyEnumSecurityType.DEPOSIT_NOTES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.EURO_COMMERCIAL_PAPER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LIQUIDITY_NOTE);
        assertEquals( MyEnumSecurityType.LIQUIDITY_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( MyEnumSecurityType.MEDIUM_TERM_NOTES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OVERNIGHT);
        assertEquals( MyEnumSecurityType.OVERNIGHT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PROMISSORY_NOTE);
        assertEquals( MyEnumSecurityType.PROMISSORY_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PLAZOS_FIJOS);
        assertEquals( MyEnumSecurityType.PLAZOS_FIJOS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( MyEnumSecurityType.SHORT_TERM_LOAN_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TIME_DEPOSIT);
        assertEquals( MyEnumSecurityType.TIME_DEPOSIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( MyEnumSecurityType.EXTENDED_COMM_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Mortgage, 11
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.ASSET_BACKED_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.IOETTE_MORTGAGE);
        assertEquals( MyEnumSecurityType.IOETTE_MORTGAGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( MyEnumSecurityType.MORTGAGE_INTEREST_ONLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PFANDBRIEFE);
        assertEquals( MyEnumSecurityType.PFANDBRIEFE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TO_BE_ANNOUNCED);
        assertEquals( MyEnumSecurityType.TO_BE_ANNOUNCED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Municipal, 16
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( MyEnumSecurityType.OTHER_ANTICIPATION_NOTES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( MyEnumSecurityType.GENERAL_OBLIGATION_BONDS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MANDATORY_TENDER);
        assertEquals( MyEnumSecurityType.MANDATORY_TENDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_BONDS);
        assertEquals( MyEnumSecurityType.REVENUE_BONDS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( MyEnumSecurityType.SPECIAL_ASSESSMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_OBLIGATION);
        assertEquals( MyEnumSecurityType.SPECIAL_OBLIGATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_TAX);
        assertEquals( MyEnumSecurityType.SPECIAL_TAX.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.TAX_ANTICIPATION_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ALLOCATION);
        assertEquals( MyEnumSecurityType.TAX_ALLOCATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WARRANT);
        assertEquals( MyEnumSecurityType.WARRANT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * Other, 7
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MUTUAL_FUND);
        assertEquals( MyEnumSecurityType.MUTUAL_FUND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( MyEnumSecurityType.MULTILEG_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.NO_SECURITY_TYPE);
        assertEquals( MyEnumSecurityType.NO_SECURITY_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( MyEnumSecurityType.OPTIONS_ON_FUTURES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( MyEnumSecurityType.OPTIONS_ON_PHYSICAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WILDCARD_ENTRY);
        assertEquals( MyEnumSecurityType.WILDCARD_ENTRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CASH);
        assertEquals( MyEnumSecurityType.CASH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( "Tag167EnuSecurityType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}