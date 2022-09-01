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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1081RefOrderIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1081EnuRefOrderIDSourceTest {
    Tag1081EnuRefOrderIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( "FIX1081_ENU_REF_ORDER_ID_SOURCE", tagData.toFIXLabelString());
            assertEquals( "1081", tagData.toFIXIDString());
            assertEquals( "REF_ORDER_ID_SOURCE", tagData.toEnumNameString());
            assertEquals( "RefOrderIDSource", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1081
         *  RefOrderIDSource
         *  char
         *  <p>    0 - SecondaryOrdeID (198)
         *  <p>    1 - OrdeID (37)
         *  <p>    2 - MEntryID (278)
         *  <p>    3 - QuotEntryID (299)
         */
        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.SECONDARY_ORDE_ID );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.ORDE_ID );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.M_ENTRY_ID );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1081EnuRefOrderIDSource( Enum1081RefOrderIDSource.QUOT_ENTRY_ID );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1081RefOrderIDSource oneEnum : Enum1081RefOrderIDSource.values()) {
            tagData = new Tag1081EnuRefOrderIDSource(oneEnum);
            assertEquals( "Tag1081EnuRefOrderIDSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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