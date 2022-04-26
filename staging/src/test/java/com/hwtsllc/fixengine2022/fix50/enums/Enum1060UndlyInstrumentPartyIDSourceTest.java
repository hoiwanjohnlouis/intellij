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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum1060UndlyInstrumentPartyIDSourceTest {
    /**
     *  1060 (same as 447, 525, 758, 783, 950, 1050, 1060, 1118)
     *  UndlyInstrumentPartyIDSource
     *  PartyIDSource value within an underlying instrument partyrepeating group.
     *              Same values as  PartyIDSource (447)
     *  Valid values:
     *  For all PartyRoles
     *      B - BIC (Bank Identification Code - SWIFT managed) code
     *              (ISO9362 - See "Appendix 6-B")
     *      C - Generally accepted market participant identifier
     *              (e.g. NASD mnemonic)
     *      D - Proprietary / Custom code
     *      E - ISO Country Code
     *      F - Settlement Entity Location
     *              (note if Local Market Settlement use "E=ISO Country Code")
     *              (see "Appendix 6-G" for valid values)
     *      G - MIC (ISO 10383 - Market Identificer Code) (See "Appendix 6-C")
     *      H - CSD participant/member code
     *              (e.g.. Euroclear, DTC, CREST or Kassenverein number)
     *
     *  For PartyRole = "InvestorID" and for CIV
     *      6 - UK National Insurance or Pension Number
     *      7 - US Social Security Number
     *      8 - US Employer or Tax ID Number
     *      9 - Australian Business Number
     *      A - Australian Tax File Number
     *
     *  For PartyRole = "InvestorID" and for Equities
     *      1 - Korean Investor ID
     *      2 - Taiwanese Qualified Foreign Investor ID QFII/FID
     *      3 - Taiwanese Trading Acct
     *      4 - Malaysian Central Depository (MCD) number
     *      5 - Chinese Investor ID
     *
     *  For PartyRole="Broker of Credit"
     *      I - Directed broker three character acronym as defined in
     *              ISITC "ETC Best Practice" guidelines document
     */
    @Test
    void EnumTest() {
        Enum1060UndlyInstrumentPartyIDSource enumType;

        /*
         *  All PartyRoles
         *  B-H, types
         */
        enumType = Enum1060UndlyInstrumentPartyIDSource.BANK_IDENTIFICATION_CODE;
        assertEquals("B", enumType.getID());
        assertEquals("BANK_IDENTIFICATION_CODE", enumType.getName());
        assertEquals("B - BIC (Bank Identification Code - SWIFT managed) code (ISO9362 - See Appendix 6-B)",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.GENERAL_IDENTIFIER;
        assertEquals("C", enumType.getID());
        assertEquals("GENERAL_IDENTIFIER", enumType.getName());
        assertEquals("C - Generally accepted market participant identifier (e.g. NASD mnemonic)",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.PROPRIETARY;
        assertEquals("D", enumType.getID());
        assertEquals("PROPRIETARY", enumType.getName());
        assertEquals("D - Proprietary / Custom code", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.ISO_COUNTRY_CODE;
        assertEquals("E", enumType.getID());
        assertEquals("ISO_COUNTRY_CODE", enumType.getName());
        assertEquals("E - ISO Country Code", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.SETTLEMENT_ENTITY_LOCATION;
        assertEquals("F", enumType.getID());
        assertEquals("SETTLEMENT_ENTITY_LOCATION", enumType.getName());
        assertEquals("F - Settlement Entity Location " +
                        "(note if Local Market Settlement, use E=ISO Country Code) " +
                        "(see Appendix 6-G for valid values)",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.MARKET_IDENTIFIER_CODE;
        assertEquals("G", enumType.getID());
        assertEquals("MARKET_IDENTIFIER_CODE", enumType.getName());
        assertEquals("G - MIC (ISO 10383 - Market Identifier Code) (See Appendix 6-C)",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.CSD_MEMBER_CODE;
        assertEquals("H", enumType.getID());
        assertEquals("CSD_MEMBER_CODE", enumType.getName());
        assertEquals("H - CSD participant/member code (e.g.. Euroclear, DTC, CREST or Kassenverein number)",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  6-9, types
         */
        enumType = Enum1060UndlyInstrumentPartyIDSource.UK_NATIONAL_NUMBER;
        assertEquals("6", enumType.getID());
        assertEquals("UK_NATIONAL_NUMBER", enumType.getName());
        assertEquals("6 - UK National Insurance or Pension Number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.US_SOCIAL_SECURITY_NUMBER;
        assertEquals("7", enumType.getID());
        assertEquals("US_SSN", enumType.getName());
        assertEquals("7 - US Social Security Number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.US_TAX_ID_NUMBER;
        assertEquals("8", enumType.getID());
        assertEquals("US_TAX_ID_NUMBER", enumType.getName());
        assertEquals("8 - US Employer or Tax ID Number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER;
        assertEquals("9", enumType.getID());
        assertEquals("AUSTRALIAN_BUSINESS_NUMBER", enumType.getName());
        assertEquals("9 - Australian Business Number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  A, type
         */
        enumType = Enum1060UndlyInstrumentPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER;
        assertEquals("A", enumType.getID());
        assertEquals("AUSTRALIAN_TAX_FILE_NUMBER", enumType.getName());
        assertEquals("A - Australian Tax File Number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole = "InvestorID" and for Equities
         *  1-5, types
         */
        enumType = Enum1060UndlyInstrumentPartyIDSource.KOREAN_INVESTOR_ID;
        assertEquals("1", enumType.getID());
        assertEquals("KOREAN_INVESTOR_ID", enumType.getName());
        assertEquals("1 - Korean Investor ID", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID;
        assertEquals("2", enumType.getID());
        assertEquals("TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID", enumType.getName());
        assertEquals("2 - Taiwanese Qualified Foreign Investor ID QFII/FID", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.TAIWANESE_TRADING_ACCT;
        assertEquals("3", enumType.getID());
        assertEquals("TAIWANESE_TRADING_ACCT", enumType.getName());
        assertEquals("3 - Taiwanese Trading Acct", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER;
        assertEquals("4", enumType.getID());
        assertEquals("MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER", enumType.getName());
        assertEquals("4 - Malaysian Central Depository (MCD) number", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum1060UndlyInstrumentPartyIDSource.CHINESE_INVESTOR_ID;
        assertEquals("5", enumType.getID());
        assertEquals("CHINESE_INVESTOR_ID", enumType.getName());
        assertEquals("5 - Chinese Investor ID", enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  For PartyRole="Broker of Credit"
         *  I, type
         */
        enumType = Enum1060UndlyInstrumentPartyIDSource.DIRECTED_BROKER_ACRONYM;
        assertEquals("I", enumType.getID());
        assertEquals("DIRECTED_BROKER_ACRONYM", enumType.getName());
        assertEquals("I - Directed broker three character acronym as defined in " +
                        "ISITC *ETC Best Practice* guidelines document",
                enumType.getDescription());
        assertNotEquals( FIX50.JUNK_ID, enumType.getID());
        assertNotEquals( FIX50.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX50.JUNK_DESCRIPTION, enumType.getDescription());
    }
}