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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1133DestinationSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1133
 *  ExDestinationIDSource
 *  char
 *  <p>
 *  The ID source of ExDestination
 *  <p></p>
 *  Valid values:
 *  <p>    B - BIC (Bank Identification Code) (ISO 9362)
 *  <p>    C - Generally accepted market participant identifier (e.g. NASD mnemonic)
 *  <p>    D - Proprietary / Custom code
 *  <p>    E - ISO Country Code
 *  <p>    G - MIC (ISO 10383 - Market Identifier Code)
 */
class Tag1133EnuExDestinationIDSourceTest {
    @Test
    void FIX1133Test() {
        FIX50 fixData = FIX50.FIX1133_ENU_EX_DESTINATION_ID_SOURCE;
        assertEquals( "1133", fixData.toEnumIDString());
        assertEquals( "EX_DESTINATION_ID_SOURCE", fixData.toEnumNameString());
        assertEquals( "ExDestinationIDSource", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1133Test() {
        Tag1133EnuExDestinationIDSource tagData;

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.BIC );
        assertEquals( Enum1133DestinationSource.BIC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.MARKET_PARTICIPANT_IDENTIFIER );
        assertEquals( Enum1133DestinationSource.MARKET_PARTICIPANT_IDENTIFIER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.PROPRIETARY );
        assertEquals( Enum1133DestinationSource.PROPRIETARY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.ISO_COUNTRY_CODE );
        assertEquals( Enum1133DestinationSource.ISO_COUNTRY_CODE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.MIC );
        assertEquals( Enum1133DestinationSource.MIC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1133EnuExDestinationIDSource tagData;

        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1133EnuExDestinationIDSource tagData;

        // loop around the ENUM and process
        for (Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1133EnuExDestinationIDSource tagData;

        // loop around the ENUM and process
        for (Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1133EnuExDestinationIDSource tagData;

        // loop around the ENUM and process
        for (Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1133EnuExDestinationIDSource tagData;

        // loop around the ENUM and process
        for (Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( "Tag1133EnuExDestinationIDSource\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}