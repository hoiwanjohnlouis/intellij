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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum525NestedPartyIDSourceTest {
    /**
     *  Information is the same for TAGS 447, 525
     */
    @Test
    void Enum0525Test() {
        Enum525NestedPartyIDSource enumType;

        /*
         *  All PartyRoles
         *  B-H, types
         */
        enumType = Enum525NestedPartyIDSource.BANK_IDENTIFICATION_CODE;
        assertEquals("B", enumType.getID());
        assertEquals("BANK_IDENTIFICATION_CODE", enumType.getName());
        assertEquals("B - BIC (Bank Identification Code - SWIFT managed) code (ISO9362 - See Appendix 6-B)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.GENERAL_IDENTIFIER;
        assertEquals("C", enumType.getID());
        assertEquals("GENERAL_IDENTIFIER", enumType.getName());
        assertEquals("C - Generally accepted market participant identifier (e.g. NASD mnemonic)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.PROPRIETARY;
        assertEquals("D", enumType.getID());
        assertEquals("PROPRIETARY", enumType.getName());
        assertEquals("D - Proprietary / Custom code", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.ISO_COUNTRY_CODE;
        assertEquals("E", enumType.getID());
        assertEquals("ISO_COUNTRY_CODE", enumType.getName());
        assertEquals("E - ISO Country Code", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.SETTLEMENT_ENTITY_LOCATION;
        assertEquals("F", enumType.getID());
        assertEquals("SETTLEMENT_ENTITY_LOCATION", enumType.getName());
        assertEquals("F - Settlement Entity Location " +
                        "(note if Local Market Settlement, use E=ISO Country Code) " +
                        "(see Appendix 6-G for valid values)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.MARKET_IDENTIFIER_CODE;
        assertEquals("G", enumType.getID());
        assertEquals("MARKET_IDENTIFIER_CODE", enumType.getName());
        assertEquals("G - MIC (ISO 10383 - Market Identifier Code) (See Appendix 6-C)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.CSD_MEMBER_CODE;
        assertEquals("H", enumType.getID());
        assertEquals("CSD_MEMBER_CODE", enumType.getName());
        assertEquals("H - CSD participant/member code (e.g.. Euroclear, DTC, CREST or Kassenverein number)",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  6-9, types
         */
        enumType = Enum525NestedPartyIDSource.UK_NATIONAL_NUMBER;
        assertEquals("6", enumType.getID());
        assertEquals("UK_NATIONAL_NUMBER", enumType.getName());
        assertEquals("6 - UK National Insurance or Pension Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.US_SOCIAL_SECURITY_NUMBER;
        assertEquals("7", enumType.getID());
        assertEquals("US_SSN", enumType.getName());
        assertEquals("7 - US Social Security Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.US_TAX_ID_NUMBER;
        assertEquals("8", enumType.getID());
        assertEquals("US_TAX_ID_NUMBER", enumType.getName());
        assertEquals("8 - US Employer or Tax ID Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER;
        assertEquals("9", enumType.getID());
        assertEquals("AUSTRALIAN_BUSINESS_NUMBER", enumType.getName());
        assertEquals("9 - Australian Business Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  A, type
         */
        enumType = Enum525NestedPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER;
        assertEquals("A", enumType.getID());
        assertEquals("AUSTRALIAN_TAX_FILE_NUMBER", enumType.getName());
        assertEquals("A - Australian Tax File Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for Equities
         *  1-5, types
         */
        enumType = Enum525NestedPartyIDSource.KOREAN_INVESTOR_ID;
        assertEquals("1", enumType.getID());
        assertEquals("KOREAN_INVESTOR_ID", enumType.getName());
        assertEquals("1 - Korean Investor ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID;
        assertEquals("2", enumType.getID());
        assertEquals("TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID", enumType.getName());
        assertEquals("2 - Taiwanese Qualified Foreign Investor ID QFII/FID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.TAIWANESE_TRADING_ACCT;
        assertEquals("3", enumType.getID());
        assertEquals("TAIWANESE_TRADING_ACCT", enumType.getName());
        assertEquals("3 - Taiwanese Trading Acct", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER;
        assertEquals("4", enumType.getID());
        assertEquals("MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER", enumType.getName());
        assertEquals("4 - Malaysian Central Depository (MCD) number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum525NestedPartyIDSource.CHINESE_INVESTOR_ID;
        assertEquals("5", enumType.getID());
        assertEquals("CHINESE_INVESTOR_ID", enumType.getName());
        assertEquals("5 - Chinese Investor ID", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole="Broker of Credit"
         *  I, type
         */
        enumType = Enum525NestedPartyIDSource.DIRECTED_BROKER_ACRONYM;
        assertEquals("I", enumType.getID());
        assertEquals("DIRECTED_BROKER_ACRONYM", enumType.getName());
        assertEquals("I - Directed broker three character acronym as defined in " +
                        "ISITC *ETC Best Practice* guidelines document",
                enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}