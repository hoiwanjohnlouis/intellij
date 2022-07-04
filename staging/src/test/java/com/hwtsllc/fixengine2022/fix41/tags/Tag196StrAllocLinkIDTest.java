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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  196
 *  AllocLinkID
 *  String
 *  <p>
 *  Can be used to link two different Allocation messages
 *  (each with unique AllocID (70)) together, i.e. for F/X "Netting" or "Swaps".
 *  Should be unique.
 */
class Tag196StrAllocLinkIDTest {
    @Test
    void FIX0196Test() {
        FIX41 fixData = FIX41.FIX196_STR_ALLOC_LINK_ID;
        assertEquals( "196", fixData.toEnumIDString());
        assertEquals( "ALLOC_LINK_ID", fixData.toEnumNameString());
        assertEquals( "AllocLinkID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0196Test() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID));
        assertEquals( Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID));
        assertEquals( Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID));
        assertEquals( Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID));
        assertEquals( Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag196StrAllocLinkID tagData;

        tagData = new Tag196StrAllocLinkID(new MyStringType(Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID));
        assertEquals( "Tag196StrAllocLinkID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}