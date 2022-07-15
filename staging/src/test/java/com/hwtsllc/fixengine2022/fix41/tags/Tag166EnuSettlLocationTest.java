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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum166SettlLocation;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  166
 *  SettlLocation
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.2 Identifies Settlement Depository or Country Code, ISITC spec
 *  <p></p>
 *  Valid values:
 *  <p>    CED - CEDEL
 *  <p>    DTC - Depository Trust Company
 *  <p>    EUR - Euro clear
 *  <p>    FED - Federal Book Entry
 *  <p>    ISO_Country_Code - Local Market Settle Location
 *  <p></p>
 *  <p>    PNY - Physical
 *  <p>    PTC - Participant Trust Company
 */
// @Deprecated
class Tag166EnuSettlLocationTest {
    @Test
    void PrintFIXTagTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIX0166Test() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( "FIX166_ENU_SETTL_LOCATION", tagData.toEnumLabelString());
            assertEquals( "166", tagData.toEnumIDString());
            assertEquals( "SETTL_LOCATION", tagData.toEnumNameString());
            assertEquals( "SettlLocation (replaced)", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag166EnuSettlLocation tagData;

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.CEDEL);
        assertEquals( Enum166SettlLocation.CEDEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY);
        assertEquals( Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.EURO_CLEAR);
        assertEquals( Enum166SettlLocation.EURO_CLEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.FEDERAL_BOOK_ENTRY);
        assertEquals( Enum166SettlLocation.FEDERAL_BOOK_ENTRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.LOCAL_MARKET_SETTLE_LOCATION);
        assertEquals( Enum166SettlLocation.LOCAL_MARKET_SETTLE_LOCATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PHYSICAL);
        assertEquals( Enum166SettlLocation.PHYSICAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY);
        assertEquals( Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( "Tag166EnuSettlLocation\n" +
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