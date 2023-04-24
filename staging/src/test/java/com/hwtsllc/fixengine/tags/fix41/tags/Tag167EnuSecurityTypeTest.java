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

package com.hwtsllc.fixengine.tags.fix41.tags;

import com.hwtsllc.fixengine.datatypes.MyEnumSecurityType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX167_ENU_SECURITY_TYPE", tagData.toFIXLabelString());
            assertEquals( "167", tagData.toFIXIDString());
            assertEquals( "SECURITY_TYPE", tagData.toFIXNameString());
            assertEquals( "SecurityType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            tagData = new Tag167EnuSecurityType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  167 (same as TAGS 167, 310, 609)
         *  SecurityType
         *  String
         *  <p>    Deprecated, 4
         *  <p>    "FUT - Future (Deprecated)"
         *  <p>    "OPT - Option (Deprecated)"
         *  <p>    "UST - US Treasury Note (Deprecated Value Use TNOTE)"
         *  <p>    "USTB - US Treasury Bill (Deprecated Value Use TBILL)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_FUTURE);
        assertEquals( "FUT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_OPTION);
        assertEquals( "OPT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_NOTE);
        assertEquals( "UST", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPRECATED_US_TREASURY_BILL);
        assertEquals( "USTB", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Agency, 5
         *  <p>    "EUSUPRA - Euro Supranational Coupon (Agency)"
         *  <p>    "FAC - Federal Agency Coupon"
         *  <p>    "FADN - Federal Agency Discount Note"
         *  <p>    "PEF - Private Export Funding (Agency)"
         *  <p>    "SUPRA - USD Supranational Coupons (Agency)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SUPRANATIONAL_COUPON);
        assertEquals( "EUSUPRA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_COUPON);
        assertEquals( "FAC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FEDERAL_AGENCY_DISCOUNT_NOTE);
        assertEquals( "FADN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRIVATE_EXPORT_FUNDING);
        assertEquals( "PEF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.USD_SUPRANATIONAL_COUPON);
        assertEquals( "SUPRA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Corporate, 8
         *  <p>    "CORP - Corporate Bond"
         *  <p>    "CPP - Corporate Private Placement"
         *  <p>    "CB - Convertible Bond (Corporate)"
         *  <p>    "DUAL - Dual Currency (Corporate)"
         *  <p>    "EUCORP - Euro Corporate Bond"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_BOND);
        assertEquals( "CORP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORPORATE_PRIVATE_PLACEMENT);
        assertEquals( "CPP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CONVERTIBLE_BOND);
        assertEquals( "CB", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DUAL_CURRENCY);
        assertEquals( "DUAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CORPORATE_BOND);
        assertEquals( "EUCORP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "XLINKD - Indexed Linked (Corporate)"
         *  <p>    "STRUCT - Structured Note (Corporate)"
         *  <p>    "YANK - Yankee Corporate Bond"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INDEXED_LINKED);
        assertEquals( "XLINKD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.STRUCTURED_NOTE);
        assertEquals( "STRUCT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CORPORATE_BOND);
        assertEquals( "YANK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Currency, 1
         *  <p>    "FOR - Foreign Exchange Contract (Currency)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FOREIGN_EXCHANGE_CONTRACT);
        assertEquals( "FOR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Equity, 2
         *  <p>    "CS - Common Stock (Equity)"
         *  <p>    "PS - Preferred Stock (Equity)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMON_STOCK);
        assertEquals( "CS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PREFERRED_STOCK);
        assertEquals( "PS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Finance, 5
         *  <p>    "REPO - Repurchase (Financing)"
         *  <p>    "FORWARD - Forward (Financing)"
         *  <p>    "BUYSELL - Buy Sellback (Financing)"
         *  <p>    "SECLOAN - Securities Loan (Financing)"
         *  <p>    "SECPLEDGE - Securities Pledge (Financing)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPURCHASE);
        assertEquals( "REPO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.FORWARD);
        assertEquals( "FORWARD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BUY_SELLBACK);
        assertEquals( "BUYSELL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_LOAN);
        assertEquals( "SECLOAN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SECURITIES_PLEDGE);
        assertEquals( "SECPLEDGE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Government, 9
         *  <p>    "BRADY - Brady Bond (Government)"
         *  <p>    "EUSOV - Euro Sovereigns (Government)"
         *  <p>    "TBOND - US Treasury Bond (Government)"
         *  <p>    "TINT - Interest Strip From Any Bond Or Note (Government)"
         *  <p>    "TIPS - Treasury Inflation Protected Securities (Government)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRADY_BOND);
        assertEquals( "BRADY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_SOVEREIGNS);
        assertEquals( "EUSOV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BOND);
        assertEquals( "TBOND", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.INTEREST_STRIP_ANY_BOND);
        assertEquals( "TINT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TREASURY_INFLATION_PROTECTED_SECURITIES);
        assertEquals( "TIPS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "TCAL - Principal Strip Of A Callable Bond Or Note (Government)"
         *  <p>    "TPRN - Principal Strip From A Non-Callable Bond Or Note (Government)"
         *  <p>    "TNOTE - US Treasury Note (Government)"
         *  <p>    "TBILL - US Treasury Bill (Government)"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_CALLABLE_BOND);
        assertEquals( "TCAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PRINCIPAL_STRIP_NON_CALLABLE_BOND);
        assertEquals( "TPRN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_NOTE);
        assertEquals( "TNOTE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.US_TREASURY_BILL);
        assertEquals( "TBILL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Loan, 13
         *  <p>    "TERM - Term Loan"
         *  <p>    "RVLV - Revolver Loan"
         *  <p>    "RVLVTRM - Revolver/Term Loan"
         *  <p>    "BRIDGE - Bridge Loan"
         *  <p>    "LOFC - Letter Of Credit"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TERM_LOAN);
        assertEquals( "TERM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_LOAN);
        assertEquals( "RVLV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVOLVER_TERM_LOAN);
        assertEquals( "RVLVTRM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BRIDGE_LOAN);
        assertEquals( "BRIDGE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LETTER_OF_CREDIT);
        assertEquals( "LOFC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "SWING - Swing Line Facility"
         *  <p>    "DINP - Debtor In Possession"
         *  <p>    "DEFLTED - Defaulted"
         *  <p>    "WITHDRN - Withdrawn"
         *  <p>    "REPLACD - Replaced"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SWING_LINE_FACILITY);
        assertEquals( "SWING", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEBTOR_IN_POSSESSION);
        assertEquals( "DINP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEFAULTED_LOAN);
        assertEquals( "DEFLTED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WITHDRAWN_LOAN);
        assertEquals( "WITHDRN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REPLACED_LOAN);
        assertEquals( "REPLACD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "MATURED - Matured"
         *  <p>    "AMENDED - Amended & Restated"
         *  <p>    "RETIRED - Retired"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MATURED_LOAN);
        assertEquals( "MATURED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.AMENDED_AND_RESTATED);
        assertEquals( "AMENDED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.RETIRED_LOAN);
        assertEquals( "RETIRED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Money Market, 18
         *  <p>    "BA - Bankers Acceptance"
         *  <p>    "BN - Bank Notes"
         *  <p>    "BOX - Bill Of Exchanges"
         *  <p>    "CD - Certificate Of Deposit"
         *  <p>    "CL - Call Loans"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANKERS_ACCEPTANCE);
        assertEquals( "BA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BANK_NOTES);
        assertEquals( "BN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.BILL_OF_EXCHANGES);
        assertEquals( "BOX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_DEPOSIT);
        assertEquals( "CD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CALL_LOANS);
        assertEquals( "CL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "CP - Commercial Paper"
         *  <p>    "DN - Deposit Notes"
         *  <p>    "EUCD - Euro Certificate Of Deposit"
         *  <p>    "EUCP - Euro Commercial Paper"
         *  <p>    "LQN - Liquidity Note"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COMMERCIAL_PAPER);
        assertEquals( "CP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.DEPOSIT_NOTES);
        assertEquals( "DN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_CERTIFICATE_OF_DEPOSIT);
        assertEquals( "EUCD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EURO_COMMERCIAL_PAPER);
        assertEquals( "EUCP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.LIQUIDITY_NOTE);
        assertEquals( "LQN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "MTN - Medium Term Notes"
         *  <p>    "ONITE - Overnight"
         *  <p>    "PN - Promissory Note"
         *  <p>    "PZFJ - Plazos Fijos"
         *  <p>    "STN - Short Term Loan Note"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MEDIUM_TERM_NOTES);
        assertEquals( "MTN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OVERNIGHT);
        assertEquals( "ONITE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PROMISSORY_NOTE);
        assertEquals( "PN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PLAZOS_FIJOS);
        assertEquals( "PZFJ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SHORT_TERM_LOAN_NOTE);
        assertEquals( "STN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "TD - Time Deposit"
         *  <p>    "XCN - Extended Comm Note"
         *  <p>    "YCD - Yankee Certificate Of Deposit"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TIME_DEPOSIT);
        assertEquals( "TD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.EXTENDED_COMM_NOTE);
        assertEquals( "XCN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.YANKEE_CERTIFICATE_OF_DEPOSIT);
        assertEquals( "YCD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Mortgage, 11
         *  <p>    "ABS - Asset-backed Securities"
         *  <p>    "CMBS - Corp. Mortgage-backed Securities"
         *  <p>    "CMO - Collateralized Mortgage Obligation"
         *  <p>    "IET - IOETTE Mortgage"
         *  <p>    "MBS - Mortgage-backed Securities"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.ASSET_BACKED_SECURITIES);
        assertEquals( "ABS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CORP_MORTGAGE_BACKED_SECURITIES);
        assertEquals( "CMBS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION);
        assertEquals( "CMO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.IOETTE_MORTGAGE);
        assertEquals( "IET", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_BACKED_SECURITIES);
        assertEquals( "MBS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "MIO - Mortgage Interest Only"
         *  <p>    "MPO - Mortgage Principal Only"
         *  <p>    "MPP - Mortgage Private Placement"
         *  <p>    "MPT - Miscellaneous Pass-through"
         *  <p>    "PFAND - Pfandbriefe"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_INTEREST_ONLY);
        assertEquals( "MIO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRINCIPAL_ONLY);
        assertEquals( "MPO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MORTGAGE_PRIVATE_PLACEMENT);
        assertEquals( "MPP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MISCELLANEOUS_PASS_THROUGH);
        assertEquals( "MPT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.PFANDBRIEFE);
        assertEquals( "PFAND", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "TBA - To Be Announced"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TO_BE_ANNOUNCED);
        assertEquals( "TBA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Municipal, 16
         *  <p>    "AN - Other Anticipation Notes (BAN, GAN, etc.)",
         *  <p>    "COFO - Certificate Of Obligation"
         *  <p>    "COFP - Certificate Of Participation"
         *  <p>    "GO - General Obligation Bonds"
         *  <p>    "MT - Mandatory Tender"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OTHER_ANTICIPATION_NOTES);
        assertEquals( "AN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_OBLIGATION);
        assertEquals( "COFO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CERTIFICATE_OF_PARTICIPATION);
        assertEquals( "COFP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.GENERAL_OBLIGATION_BONDS);
        assertEquals( "GO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MANDATORY_TENDER);
        assertEquals( "MT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "RAN - Revenue Anticipation Note"
         *  <p>    "REV - Revenue Bonds"
         *  <p>    "SPCLA - Special Assessment"
         *  <p>    "SPCLO - Special Obligation"
         *  <p>    "SPCLT - Special Tax"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_ANTICIPATION_NOTE);
        assertEquals( "RAN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.REVENUE_BONDS);
        assertEquals( "REV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_ASSESSMENT);
        assertEquals( "SPCLA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_OBLIGATION);
        assertEquals( "SPCLO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.SPECIAL_TAX);
        assertEquals( "SPCLT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "TAN - Tax Anticipation Note"
         *  <p>    "TAXA - Tax Allocation"
         *  <p>    "TECP - Tax Exempt Commercial Paper"
         *  <p>    "TRAN - Tax Revenue Anticipation Note"
         *  <p>    "VRDN - Variable Rate Demand Note"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ANTICIPATION_NOTE);
        assertEquals( "TAN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_ALLOCATION);
        assertEquals( "TAXA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_EXEMPT_COMMERCIAL_PAPER);
        assertEquals( "TECP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.TAX_REVENUE_ANTICIPATION_NOTE);
        assertEquals( "TRAN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.VARIABLE_RATE_DEMAND_NOTE);
        assertEquals( "VRDN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "WAR - Warrant"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WARRANT);
        assertEquals( "WAR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Other, 7
         *  <p>    "MF - Mutual Fund"
         *  <p>    "MLEG - Multileg Instrument"
         *  <p>    "NONE - No Security Type"
         *  <p>    "OOF - Options on Futures"
         *  <p>    "OOP - Options on Physical"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MUTUAL_FUND);
        assertEquals( "MF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.MULTILEG_INSTRUMENT);
        assertEquals( "MLEG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.NO_SECURITY_TYPE);
        assertEquals( "NONE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_FUTURES);
        assertEquals( "OOF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.OPTIONS_ON_PHYSICAL);
        assertEquals( "OOP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "WLD - Wildcard Entry (used on Security Definition Request message)"
         *  <p>    "CASH - Cash"
         */
        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.WILDCARD_ENTRY);
        assertEquals( "WLD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag167EnuSecurityType(MyEnumSecurityType.CASH);
        assertEquals( "CASH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}