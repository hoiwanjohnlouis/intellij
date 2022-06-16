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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyIDSource;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
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
class Tag950EnuNested3PartyIDSourceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX950_ENU_NESTED_3_PARTY_ID_SOURCE;
        assertEquals( "950", fixData.toFIXIDString());
        assertEquals( "NESTED_3_PARTY_ID_SOURCE", fixData.toFIXNameString());
        assertEquals( "Nested3PartyIDSource", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0950Test() {
        Tag950EnuNested3PartyIDSource tagData;
        Enum665ConfirmStatus oneElement;

        /*
         * All PartyRoles
         *  B-H types
         */
        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE);
        assertEquals( MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "950", fixData.toFIXIDString());
        assertEquals( "NESTED_3_PARTY_ID_SOURCE", fixData.toFIXNameString());
        assertEquals( "Nested3PartyIDSource", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.GENERAL_IDENTIFIER);
        assertEquals( MyEnumPartyIDSource.GENERAL_IDENTIFIER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.PROPRIETARY);
        assertEquals( MyEnumPartyIDSource.PROPRIETARY.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.ISO_COUNTRY_CODE);
        assertEquals( MyEnumPartyIDSource.ISO_COUNTRY_CODE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION);
        assertEquals( MyEnumPartyIDSource.SETTLEMENT_ENTITY_LOCATION.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE);
        assertEquals( MyEnumPartyIDSource.MARKET_IDENTIFIER_CODE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.CSD_MEMBER_CODE);
        assertEquals( MyEnumPartyIDSource.CSD_MEMBER_CODE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /*
         * For PartyRole = "InvestorID" and for CIV
         * 6-9, A types
         */
        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.UK_NATIONAL_NUMBER);
        assertEquals( MyEnumPartyIDSource.UK_NATIONAL_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER);
        assertEquals( MyEnumPartyIDSource.US_SOCIAL_SECURITY_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.US_TAX_ID_NUMBER);
        assertEquals( MyEnumPartyIDSource.US_TAX_ID_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER);
        assertEquals( MyEnumPartyIDSource.AUSTRALIAN_BUSINESS_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER);
        assertEquals( MyEnumPartyIDSource.AUSTRALIAN_TAX_FILE_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /*
         * For PartyRole = "InvestorID" and for Equities
         * 1-5 types
         */
        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.KOREAN_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.KOREAN_INVESTOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT);
        assertEquals( MyEnumPartyIDSource.TAIWANESE_TRADING_ACCT.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER);
        assertEquals( MyEnumPartyIDSource.MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.CHINESE_INVESTOR_ID);
        assertEquals( MyEnumPartyIDSource.CHINESE_INVESTOR_ID.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );


        /*
         * For PartyRole="Broker of Credit"
         * I type
         */
        tagData = new Tag950EnuNested3PartyIDSource(MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM);
        assertEquals( MyEnumPartyIDSource.DIRECTED_BROKER_ACRONYM.toFIXIDString(),  tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag950EnuNested3PartyIDSource tagData;

        // loop around the ENUM and process
        for ( MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag950EnuNested3PartyIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag950EnuNested3PartyIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag950EnuNested3PartyIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag950EnuNested3PartyIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag950EnuNested3PartyIDSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag950EnuNested3PartyIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag950EnuNested3PartyIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag950EnuNested3PartyIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumPartyIDSource oneEnum : MyEnumPartyIDSource.values()) {
            tagData = new Tag950EnuNested3PartyIDSource(oneEnum);
            assertEquals( "Tag950EnuNested3PartyIDSource\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}