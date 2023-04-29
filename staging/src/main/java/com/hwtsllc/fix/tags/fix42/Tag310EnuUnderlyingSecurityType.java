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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyEnumSecurityType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

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
public class Tag310EnuUnderlyingSecurityType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumSecurityType dataValue;

    public final static MyEnumSecurityType TESTA_ENU_UNDERLYING_SECURITY_TYPE
            = MyEnumSecurityType.ASSET_BACKED_SECURITIES;
    public final static MyEnumSecurityType TESTB_ENU_UNDERLYING_SECURITY_TYPE
            = MyEnumSecurityType.COLLATERALIZED_MORTGAGE_OBLIGATION;

    public Tag310EnuUnderlyingSecurityType(MyEnumSecurityType dataValue) {
        setFixType(FIX42.FIX310_ENU_UNDERLYING_SECURITY_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag310EnuUnderlyingSecurityType tagData;

        tagData = new Tag310EnuUnderlyingSecurityType(TESTA_ENU_UNDERLYING_SECURITY_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag310EnuUnderlyingSecurityType(TESTB_ENU_UNDERLYING_SECURITY_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (MyEnumSecurityType oneEnum : MyEnumSecurityType.values()) {
            System.out.println( new Tag310EnuUnderlyingSecurityType(oneEnum).toVerboseString() );
        }
    }
}
