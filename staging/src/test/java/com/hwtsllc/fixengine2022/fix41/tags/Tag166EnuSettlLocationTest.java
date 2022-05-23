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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum166SettlLocation;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  166
 *  SettlLocation
 *  String
 *  <p>
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
    void FIX0166Test() {
        FIX41 fixData = FIX41.FIX166_ENU_SETTL_LOCATION;
        assertEquals( "166", fixData.toFIXIDString());
        assertEquals( "SETTL_LOCATION", fixData.toFIXNameString());
        assertEquals( "SettlLocation (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0166Test() {
        Tag166EnuSettlLocation tagData;

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.CEDEL);
        assertEquals( Enum166SettlLocation.CEDEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY);
        assertEquals( Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.EURO_CLEAR);
        assertEquals( Enum166SettlLocation.EURO_CLEAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.FEDERAL_BOOK_ENTRY);
        assertEquals( Enum166SettlLocation.FEDERAL_BOOK_ENTRY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.LOCAL_MARKET_SETTLE_LOCATION);
        assertEquals( Enum166SettlLocation.LOCAL_MARKET_SETTLE_LOCATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PHYSICAL);
        assertEquals( Enum166SettlLocation.PHYSICAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY);
        assertEquals( Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
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
    void TagGetDataValueTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag166EnuSettlLocation tagData;

        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
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