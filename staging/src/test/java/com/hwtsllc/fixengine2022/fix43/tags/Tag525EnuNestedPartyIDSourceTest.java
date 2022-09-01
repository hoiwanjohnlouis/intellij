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

import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag525EnuNestedPartyIDSourceTest {
    Tag525EnuNestedPartyIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag525EnuNestedPartyIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag525EnuNestedPartyIDSource(oneEnum);
            assertEquals( "FIX525_ENU_NESTED_PARTY_ID_SOURCE", tagData.toFIXLabelString());
            assertEquals( "525", tagData.toEnumIDString());
            assertEquals( "NESTED_PARTY_ID_SOURCE", tagData.toEnumNameString());
            assertEquals( "NestedPartyIDSource", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag525EnuNestedPartyIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  525 (same as 447, 525, 758, 783, 950, 1050, 1060, 1118)
         *  NestedPartyIDSource
         *  char
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
         */
        tagData = new Tag525EnuNestedPartyIDSource( MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE );
        assertEquals( "B", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.GENERAL_IDENTIFIER);
        assertEquals( "C", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.PROPRIETARY);
        assertEquals( "D", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.ISO_COUNTRY_CODE);
        assertEquals( "E", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION);
        assertEquals( "F", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  For all PartyRoles
         *  <p>    G - MIC (ISO 10383 - Market Identifier Code) (See "Appendix 6-C")
         *  <p>    H - CSD participant/member code
         *              (e.g.. Euroclear, DTC, CREST or Kassenverein number)
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE);
        assertEquals( "G", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.CSD_MEMBER_CODE);
        assertEquals( "H", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  <p>    6 - UK National Insurance or Pension Number
         *  <p>    7 - US Social Security Number
         *  <p>    8 - US Employer or Tax ID Number
         *  <p>    9 - Australian Business Number
         *  <p>    A - Australian Tax File Number
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.UK_NATIONAL_NUMBER);
        assertEquals( "6", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER);
        assertEquals( "7", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.US_TAX_ID_NUMBER);
        assertEquals( "8", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER);
        assertEquals( "9", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER);
        assertEquals( "A", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  For PartyRole = "InvestorID" and for Equities
         *  <p>    1 - Korean Investor ID
         *  <p>    2 - Taiwanese Qualified Foreign Investor ID QFII/FID
         *  <p>    3 - Taiwanese Trading Acct
         *  <p>    4 - Malaysian Central Depository (MCD) number
         *  <p>    5 - Chinese Investor ID
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.KOREAN_INVESTOR_ID);
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.CHINESE_INVESTOR_ID);
        assertEquals( "5", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  For PartyRole="Broker of Credit"
         *  <p>    I - Directed broker three character acronym as defined in
         *              ISITC "ETC Best Practice" guidelines document
         */
        tagData = new Tag525EnuNestedPartyIDSource(MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM);
        assertEquals( "I", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag525EnuNestedPartyIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag525EnuNestedPartyIDSource(oneEnum);
            assertEquals( "Tag525EnuNestedPartyIDSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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