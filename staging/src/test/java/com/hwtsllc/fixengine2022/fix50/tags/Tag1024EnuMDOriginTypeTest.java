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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1024MDOriginType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1024
 *  MDOriginType
 *  int
 *  <p>
 *  Used to describe the origin of an entry in the book
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Book
 *  <p>    1 - Off-Book
 *  <p>    2 - Cross
 */
class Tag1024EnuMDOriginTypeTest {
    @Test
    void FIX1024Test() {
        FIX50 fixData = FIX50.FIX1024_ENU_MD_ORIGIN_TYPE;
        assertEquals( "1024", fixData.toEnumIDString());
        assertEquals( "MD_ORIGIN_TYPE", fixData.toEnumNameString());
        assertEquals( "MDOriginType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1024Test() {
        Tag1024EnuMDOriginType tagData;

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.BOOK );
        assertEquals( Enum1024MDOriginType.BOOK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.OFF_BOOK );
        assertEquals( Enum1024MDOriginType.OFF_BOOK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1024EnuMDOriginType( Enum1024MDOriginType.CROSS );
        assertEquals( Enum1024MDOriginType.CROSS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1024EnuMDOriginType tagData;

        // loop around the ENUM and process
        for ( Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1024EnuMDOriginType tagData;

        // loop around the ENUM and process
        for (Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1024EnuMDOriginType tagData;

        // loop around the ENUM and process
        for (Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1024EnuMDOriginType tagData;

        // loop around the ENUM and process
        for (Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1024EnuMDOriginType tagData;

        // loop around the ENUM and process
        for (Enum1024MDOriginType oneEnum : Enum1024MDOriginType.values()) {
            tagData = new Tag1024EnuMDOriginType(oneEnum);
            assertEquals( "Tag1024EnuMDOriginType\n" +
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