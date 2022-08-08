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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag758EnuNested2PartyIDSourceTest {
    Tag758EnuNested2PartyIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            assertEquals( "FIX758_ENU_NESTED_2_PARTY_ID_SOURCE", tagData.toEnumLabelString());
            assertEquals( "758", tagData.toEnumIDString());
            assertEquals( "NESTED_2_PARTY_ID_SOURCE", tagData.toEnumNameString());
            assertEquals( "Nested2PartyIDSource", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
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
        tagData = new Tag758EnuNested2PartyIDSource( MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE );
        assertEquals( "B", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.GENERAL_IDENTIFIER);
        assertEquals( "C", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.PROPRIETARY);
        assertEquals( "D", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.ISO_COUNTRY_CODE);
        assertEquals( "E", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION);
        assertEquals( "F", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  For all PartyRoles
         *  <p>    G - MIC (ISO 10383 - Market Identifier Code) (See "Appendix 6-C")
         *  <p>    H - CSD participant/member code
         *              (e.g.. Euroclear, DTC, CREST or Kassenverein number)
         */
        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE);
        assertEquals( "G", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.CSD_MEMBER_CODE);
        assertEquals( "H", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  For PartyRole = "InvestorID" and for CIV
         *  <p>    6 - UK National Insurance or Pension Number
         *  <p>    7 - US Social Security Number
         *  <p>    8 - US Employer or Tax ID Number
         *  <p>    9 - Australian Business Number
         *  <p>    A - Australian Tax File Number
         */
        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.UK_NATIONAL_NUMBER);
        assertEquals( "6", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER);
        assertEquals( "7", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.US_TAX_ID_NUMBER);
        assertEquals( "8", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER);
        assertEquals( "9", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER);
        assertEquals( "A", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  For PartyRole = "InvestorID" and for Equities
         *  <p>    1 - Korean Investor ID
         *  <p>    2 - Taiwanese Qualified Foreign Investor ID QFII/FID
         *  <p>    3 - Taiwanese Trading Acct
         *  <p>    4 - Malaysian Central Depository (MCD) number
         *  <p>    5 - Chinese Investor ID
         */
        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.KOREAN_INVESTOR_ID);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.CHINESE_INVESTOR_ID);
        assertEquals( "5", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  For PartyRole="Broker of Credit"
         *  <p>    I - Directed broker three character acronym as defined in
         *              ISITC "ETC Best Practice" guidelines document
         */
        tagData = new Tag758EnuNested2PartyIDSource(MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM);
        assertEquals( "I", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag758EnuNested2PartyIDSource(oneEnum);
            assertEquals( "Tag758EnuNested2PartyIDSource\n" +
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