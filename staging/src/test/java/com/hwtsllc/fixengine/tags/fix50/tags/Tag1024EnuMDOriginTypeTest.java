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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.tags.fix50.enums.Enum1024MDOriginType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1024EnuMDOriginTypeTest {
    Tag1024EnuMDOriginType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( "FIX1024_ENU_MD_ORIGIN_TYPE", tagData.toFIXLabelString());
            assertEquals( "1024", tagData.toFIXIDString());
            assertEquals( "MD_ORIGIN_TYPE", tagData.toFIXNameString());
            assertEquals( "MDOriginType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1024
         *  MDOriginType
         *  int
         *  <p>    0 - Book
         *  <p>    1 - Off-Book
         *  <p>    2 - Cross
         */
        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.BOOK );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.OFF_BOOK );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.CROSS );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( "Tag1024EnuMDOriginType\n" +
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
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}