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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum525NestedPartyIDSource implements EnumAccessors, LogStringVerbose {
    /**
     *  Information is the same for TAGS 447, 525
     */

    /*
     * All PartyRoles
     *  B-H types
     */
    BANK_IDENTIFICATION_CODE("B", "BIC",
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
    MARKET_IDENTIFIER_CODE("G", "MIC",
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
    TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID("2", "QFII/FID",
            "2 - Taiwanese Qualified Foreign Investor ID QFII/FID" ),
    TAIWANESE_TRADING_ACCT("3", "TAIWANESE_TRADING_ACCT",
            "3 - Taiwanese Trading Acct" ),
    MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER("4", "MCD",
            "4 - Malaysian Central Depository (MCD) number" ),
    CHINESE_INVESTOR_ID("5", "CHINESE_INVESTOR_ID",
            "5 - Chinese Investor ID" ),


    /*
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

    Enum525NestedPartyIDSource(final String id, final String name, final String description) {
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
    public String toLogStringVerbose() {
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
        for (Enum525NestedPartyIDSource oneEnum : Enum525NestedPartyIDSource.values()) {
            System.out.println(oneEnum);
        }
    }
}
