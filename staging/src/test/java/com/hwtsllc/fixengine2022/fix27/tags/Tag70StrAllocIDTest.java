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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  70
 *  AllocID
 *  String
 *  <p></p>
 *  Unique identifier for allocation message.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag70StrAllocIDTest {
    @Test
    void FIX0070Test() {
        FIX27 fixData = FIX27.FIX70_STR_ALLOC_ID;
        assertEquals( "ALLOC_ID", fixData.toEnumNameString());
        assertEquals( "70", fixData.toEnumIDString());
        assertEquals( "AllocID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0070Test() {
        Tag70StrAllocID tagData;
        String oneElement;

        oneElement = Tag70StrAllocID.TESTA_STR_ALLOC_ID;
        tagData = new Tag70StrAllocID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag70StrAllocID.TESTB_STR_ALLOC_ID;
        tagData = new Tag70StrAllocID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag70StrAllocID tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX70_STR_ALLOC_ID", tagData.toEnumLabelString());
        assertEquals( "ALLOC_ID", tagData.toEnumNameString());
        assertEquals( "70", tagData.toEnumIDString());
        assertEquals( "AllocID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTB_STR_ALLOC_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTB_STR_ALLOC_ID));
        assertEquals( Tag70StrAllocID.TESTB_STR_ALLOC_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTB_STR_ALLOC_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag70StrAllocID.TESTB_STR_ALLOC_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTB_STR_ALLOC_ID));
        assertEquals( Tag70StrAllocID.TESTB_STR_ALLOC_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag70StrAllocID tagData;

        tagData = new Tag70StrAllocID(new MyStringType(Tag70StrAllocID.TESTA_STR_ALLOC_ID));
        assertEquals( "Tag70StrAllocID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag70StrAllocID.TESTA_STR_ALLOC_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag70StrAllocID.TESTA_STR_ALLOC_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}