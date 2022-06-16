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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  793
 *  SecondaryAllocID
 *  String
 *  <p></p>
 *  Secondary allocation identifier.
 *  <p></p>
 *  Unlike the AllocID (70),
 *  this can be shared across a number of allocation instruction
 *  or allocation report messages, thereby making it possible to
 *  pass an identifier for an original allocation message on multiple messages
 *  <p></p>
 *  (e.g. from one party to a second to a third, across cancel and replace messages etc.).
 */
class Tag793StrSecondaryAllocIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX793_STR_SECONDARY_ALLOC_ID;
        assertEquals( "793", fixData.toFIXIDString());
        assertEquals( "SECONDARY_ALLOC_ID", fixData.toFIXNameString());
        assertEquals( "SecondaryAllocID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0793Test() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTA_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "793", fixData.toFIXIDString());
        assertEquals( "SECONDARY_ALLOC_ID", fixData.toFIXNameString());
        assertEquals( "SecondaryAllocID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        oneElement = Tag793StrSecondaryAllocID.TESTB_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTA_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag793StrSecondaryAllocID.TESTB_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTB_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTB_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTB_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag793StrSecondaryAllocID tagData;
        String oneElement;

        oneElement = Tag793StrSecondaryAllocID.TESTA_STR_SECONDARY_ALLOC_ID;
        tagData = new Tag793StrSecondaryAllocID( new MyStringType( oneElement ) );
        assertEquals( "Tag793StrSecondaryAllocID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}