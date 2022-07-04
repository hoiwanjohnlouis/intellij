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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1081RefOrderIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1081
 *  RefOrderIDSource
 *  char
 *  <p>
 *  Used to specify what identifier, provided in order depth market data, to use when hitting (taking) a specific order.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - SecondaryOrdeID (198)
 *  <p>    1 - OrdeID (37)
 *  <p>    2 - MEntryID (278)
 *  <p>    3 - QuotEntryID (299)
 */
class Tag1081EnuRefOrderIDSourceTest {
    @Test
    void FIX1081Test() {
        FIX50 fixData = FIX50.FIX1081_ENU_REF_ORDER_ID_SOURCE;
        assertEquals( "1081", fixData.toEnumIDString());
        assertEquals( "REF_ORDER_ID_SOURCE", fixData.toEnumNameString());
        assertEquals( "RefOrderIDSource", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1081Test() {
        Tag1081EnuRefOrderIDSource tagData;

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.SECONDARY_ORDE_ID );
        assertEquals( Enum1081RefOrderIDSource.SECONDARY_ORDE_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.ORDE_ID );
        assertEquals( Enum1081RefOrderIDSource.ORDE_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.M_ENTRY_ID );
        assertEquals( Enum1081RefOrderIDSource.M_ENTRY_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.QUOT_ENTRY_ID );
        assertEquals( Enum1081RefOrderIDSource.QUOT_ENTRY_ID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1081EnuRefOrderIDSource tagData;

        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1081EnuRefOrderIDSource tagData;

        // loop around the ENUM and process
        for (Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1081EnuRefOrderIDSource tagData;

        // loop around the ENUM and process
        for (Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1081EnuRefOrderIDSource tagData;

        // loop around the ENUM and process
        for (Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1081EnuRefOrderIDSource tagData;

        // loop around the ENUM and process
        for (Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( "Tag1081EnuRefOrderIDSource\n" +
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