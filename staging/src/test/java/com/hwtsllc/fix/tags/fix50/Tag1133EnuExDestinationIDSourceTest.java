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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.enums.fix50.Enum1133DestinationSource;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1133EnuExDestinationIDSourceTest {
    Tag1133EnuExDestinationIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( "FIX1133_ENU_EX_DESTINATION_ID_SOURCE", tagData.toFIXLabelString());
            assertEquals( "1133", tagData.toFIXIDString());
            assertEquals( "EX_DESTINATION_ID_SOURCE", tagData.toFIXNameString());
            assertEquals( "ExDestinationIDSource", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1133
         *  ExDestinationIDSource
         *  char
         *  <p>    B - BIC (Bank Identification Code) (ISO 9362)
         *  <p>    C - Generally accepted market participant identifier (e.g. NASD mnemonic)
         *  <p>    D - Proprietary / Custom code
         *  <p>    E - ISO Country Code
         *  <p>    G - MIC (ISO 10383 - Market Identifier Code)
         */
        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.BIC );
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.MARKET_PARTICIPANT_IDENTIFIER );
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.PROPRIETARY );
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.ISO_COUNTRY_CODE );
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1133EnuExDestinationIDSource( Enum1133DestinationSource.MIC );
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1133DestinationSource oneEnum : Enum1133DestinationSource.values()) {
            tagData = new Tag1133EnuExDestinationIDSource(oneEnum);
            assertEquals( "Tag1133EnuExDestinationIDSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
        }
    }
}