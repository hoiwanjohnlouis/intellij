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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  447 (same as 447, 525, 758, 783, 950, 1050, 1060, 1118)
 *  PartyIDSource
 *  char
 *  <p>
 *  Identifies class or source of the PartyID (448) value.
 *  <p>
 *  Required if PartyID is specified.
 *  <p>
 *  Note: applicable values depend upon PartyRole (452) specified.
 *  <p>
 *  See "Appendix 6-G – Use of <Parties> Component Block"
 *  <p></p>
 *  525
 *  NestedPartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within a nested repeating group.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  758
 *  Nested2PartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within a "second instance" Nested repeating group.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  783
 *  SettlPartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within a settlement parties component.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  950
 *  Nested3PartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within a "third instance" Nested repeating group.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  1050
 *  InstrumentPartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within an instrument party-repeating group.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  1060
 *  UndlyInstrumentPartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within an underlying instrument party-repeating group.
 *  <p>
 *  Same values as  PartyIDSource (447)
 *  <p></p>
 *  1118
 *  RootPartyIDSource
 *  char
 *  <p>
 *  PartyIDSource value within a root parties component.
 *  <p>
 *  Same values as PartyIDSource (447)
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  For all PartyRoles
 *  <p>    B - BIC (Bank Identification Code - SWIFT managed) code
 *              (ISO9362 - See "Appendix 6-B")
 *  <p>    C - Generally accepted market participant identifier
 *              (e.g. NASD mnemonic)
 *  <p>    D - Proprietary / Custom code
 *  <p>    E - ISO Country Code
 *  <p>    F - Settlement Entity Location
 *              (note if Local Market Settlement use "E=ISO Country Code")
 *              (see "Appendix 6-G" for valid values)
 *  <p></p>
 *  <p>    G - MIC (ISO 10383 - Market Identifier Code) (See "Appendix 6-C")
 *  <p>    H - CSD participant/member code
 *              (e.g.. Euroclear, DTC, CREST or Kassenverein number)
 *  <p></p>
 *  For PartyRole = "InvestorID" and for CIV
 *  <p>    6 - UK National Insurance or Pension Number
 *  <p>    7 - US Social Security Number
 *  <p>    8 - US Employer or Tax ID Number
 *  <p>    9 - Australian Business Number
 *  <p>    A - Australian Tax File Number
 *  <p></p>
 *  For PartyRole = "InvestorID" and for Equities
 *  <p>    1 - Korean Investor ID
 *  <p>    2 - Taiwanese Qualified Foreign Investor ID QFII/FID
 *  <p>    3 - Taiwanese Trading Acct
 *  <p>    4 - Malaysian Central Depository (MCD) number
 *  <p>    5 - Chinese Investor ID
 *  <p></p>
 *  For PartyRole="Broker of Credit"
 *  <p>    I - Directed broker three character acronym as defined in
 *              ISITC "ETC Best Practice" guidelines document
 */
public enum MyEnumPartyIDSource implements LogFIXString, LogVerboseString {
    /*
     * All PartyRoles
     *  B-H types
     */
    BANK_IDENTIFICATION_CODE("B", "BANK_IDENTIFICATION_CODE",
            "B - BIC (Bank Identification Code - SWIFT managed) code " +
                    "(ISO9362 - See Appendix 6-B)" ),
    GENERAL_IDENTIFIER("C", "GENERAL_IDENTIFIER",
            "C - Generally accepted market participant identifier (e.g. NASD mnemonic)" ),
    PROPRIETARY("D", "PROPRIETARY",
            "D - Proprietary / Custom code" ),
    ISO_COUNTRY_CODE("E", "ISO_COUNTRY_CODE",
            "E - ISO Country Code" ),
    SETTLEMENT_ENTITY_LOCATION("F", "SETTLEMENT_ENTITY_LOCATION",
            "F - Settlement Entity Location " +
                    "(note if Local Market Settlement, use E=ISO Country Code) " +
                    "(see Appendix 6-G for valid values)" ),

    MARKET_IDENTIFIER_CODE("G", "MARKET_IDENTIFIER_CODE",
            "G - MIC (ISO 10383 - Market Identifier Code) (See Appendix 6-C)" ),
    CSD_MEMBER_CODE("H", "CSD_MEMBER_CODE",
            "H - CSD participant/member code " +
                    "(e.g.. Euroclear, DTC, CREST or Kassenverein number)" ),


    /*
     * For PartyRole = "InvestorID" and for CIV
     * 6-9, A types
     */
    UK_NATIONAL_NUMBER("6", "UK_NATIONAL_NUMBER", "6 - UK National Insurance or Pension Number" ),
    US_SOCIAL_SECURITY_NUMBER("7", "US_SSN", "7 - US Social Security Number" ),
    US_TAX_ID_NUMBER("8", "US_TAX_ID_NUMBER", "8 - US Employer or Tax ID Number" ),
    AUSTRALIAN_BUSINESS_NUMBER("9", "AUSTRALIAN_BUSINESS_NUMBER", "9 - Australian Business Number" ),
    AUSTRALIAN_TAX_FILE_NUMBER("A", "AUSTRALIAN_TAX_FILE_NUMBER", "A - Australian Tax File Number" ),


    /*
     * For PartyRole = "InvestorID" and for Equities
     * 1-5 types
     */
    KOREAN_INVESTOR_ID("1", "KOREAN_INVESTOR_ID",
            "1 - Korean Investor ID" ),
    TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID("2", "TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID",
            "2 - Taiwanese Qualified Foreign Investor ID QFII/FID" ),
    TAIWANESE_TRADING_ACCT("3", "TAIWANESE_TRADING_ACCT",
            "3 - Taiwanese Trading Acct" ),
    MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER("4", "MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER",
            "4 - Malaysian Central Depository (MCD) number" ),
    CHINESE_INVESTOR_ID("5", "CHINESE_INVESTOR_ID",
            "5 - Chinese Investor ID" ),


    /**
     * For PartyRole="Broker of Credit"
     * I type
     */
    DIRECTED_BROKER_ACRONYM("I", "DIRECTED_BROKER_ACRONYM",
            "I - Directed broker three character acronym as defined in " +
                    "ISITC *ETC Best Practice* guidelines document" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumPartyIDSource(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values for review
         */
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            System.out.println(oneEnum);
        }
    }
}