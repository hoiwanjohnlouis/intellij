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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyIDSource;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  525 (same as 447, 525, 758, 783, 950, 1050, 1060, 1118)
 *  NestedPartyIDSource
 *  PartyIDSource value within a nested repeating group.
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
class Tag525EnuNestedPartyIDSourceTest {
    @Test
    void FIX0525Test() {
        FIX43 fixData = FIX43.FIX525_ENU_NESTED_PARTY_ID_SOURCE;
        assertEquals( "525", fixData.getID());
        assertEquals( "NESTED_PARTY_ID_SOURCE", fixData.getName());
        assertEquals( "NestedPartyIdSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0525Test() {
        Tag525EnuNestedPartyIDSource tagData;


        /**
         * All PartyRoles
         *  B-H types
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE);
        assertEquals( MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.GENERAL_IDENTIFIER);
        assertEquals( MyEnumPartyIDSource.GENERAL_IDENTIFIER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.PROPRIETARY);
        assertEquals( MyEnumPartyIDSource.PROPRIETARY.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.ISO_COUNTRY_CODE);
        assertEquals( MyEnumPartyIDSource.ISO_COUNTRY_CODE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION);
        assertEquals( MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE);
        assertEquals( MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.CSD_MEMBER_CODE);
        assertEquals( MyEnumPartyIDSource.CSD_MEMBER_CODE.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /**
         * For PartyRole = "InvestorID" and for CIV
         * 6-9, A types
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.UK_NATIONAL_NUMBER);
        assertEquals( MyEnumPartyIDSource.UK_NATIONAL_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER);
        assertEquals( MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.US_TAX_ID_NUMBER);
        assertEquals( MyEnumPartyIDSource.US_TAX_ID_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER);
        assertEquals( MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER);
        assertEquals( MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /**
         * For PartyRole = "InvestorID" and for Equities
         * 1-5 types
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.KOREAN_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.KOREAN_INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT);
        assertEquals( MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER);
        assertEquals( MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.CHINESE_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.CHINESE_INVESTOR_ID.getID(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /**
         * For PartyRole="Broker of Credit"
         * I type
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM);
        assertEquals( MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM.getID(),  tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}