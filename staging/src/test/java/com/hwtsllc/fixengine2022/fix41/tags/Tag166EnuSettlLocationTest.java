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

// @Deprecated
class Tag166EnuSettlLocationTest {
    Tag166EnuSettlLocation tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( "FIX166_ENU_SETTL_LOCATION", tagData.toFIXLabelString());
            assertEquals( "166", tagData.toEnumIDString());
            assertEquals( "SETTL_LOCATION", tagData.toEnumNameString());
            assertEquals( "SettlLocation (replaced)", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  166
         *  SettlLocation
         *  String
         *  <p>    CED - CEDEL
         *  <p>    DTC - Depository Trust Company
         *  <p>    EUR - Euro clear
         *  <p>    FED - Federal Book Entry
         *  <p>    ISO_Country_Code - Local Market Settle Location
         */
        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.CEDEL);
        assertEquals( "CED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY);
        assertEquals( "DTC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.EURO_CLEAR);
        assertEquals( "EUR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.FEDERAL_BOOK_ENTRY);
        assertEquals( "FED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.LOCAL_MARKET_SETTLE_LOCATION);
        assertEquals( "ISO_Country_Code", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    PNY - Physical
         *  <p>    PTC - Participant Trust Company
         */
        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PHYSICAL);
        assertEquals( "PNY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag166EnuSettlLocation(Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY);
        assertEquals( "PTC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum166SettlLocation oneEnum : Enum166SettlLocation.values()) {
            tagData = new Tag166EnuSettlLocation(oneEnum);
            assertEquals( "Tag166EnuSettlLocation\n" +
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