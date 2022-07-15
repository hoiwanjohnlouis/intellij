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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  196
 *  AllocLinkID
 *  String
 *  <p></p>
 *  Can be used to link two different Allocation messages
 *  (each with unique AllocID (70)) together, i.e. for F/X "Netting" or "Swaps".
 *  <p></p>
 *  Should be unique.
 */
class Tag196StrAllocLinkIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag196StrAllocLinkID tagData ) {
        assertEquals( "FIX196_STR_ALLOC_LINK_ID", tagData.toEnumLabelString());
        assertEquals( "196", tagData.toEnumIDString());
        assertEquals( "ALLOC_LINK_ID", tagData.toEnumNameString());
        assertEquals( "AllocLinkID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag196StrAllocLinkID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag196StrAllocLinkID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag196StrAllocLinkID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag196StrAllocLinkID tagData;
        String oneElement;

        oneElement = Tag196StrAllocLinkID.TESTA_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag196StrAllocLinkID.TESTB_STR_ALLOC_LINK_ID;
        tagData = new Tag196StrAllocLinkID(new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag196StrAllocLinkID tagData ) {
        assertEquals( "Tag196StrAllocLinkID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}