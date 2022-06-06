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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  467
 *  IndividualAllocID
 *  String
 *  <p>
 *  Unique identifier for a specific NoAllocs (78) repeating group instance
 *  <p>
 *  (e.g. for an AllocAccount).
 */
class Tag467StrIndividualAllocIDTest {
    @Test
    void FIX0467Test() {
        FIX43 fixData = FIX43.FIX467_STR_INDIVIDUAL_ALLOC_ID;
        assertEquals( "467", fixData.toFIXIDString());
        assertEquals( "INDIVIDUAL_ALLOC_ID", fixData.toFIXNameString());
        assertEquals( "IndividualAllocID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0467Test() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTA_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag467StrIndividualAllocID.TESTB_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTA_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag467StrIndividualAllocID.TESTB_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTB_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTB_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTB_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag467StrIndividualAllocID tagData;
        String oneElement;

        oneElement = Tag467StrIndividualAllocID.TESTA_STR_INDIVIDUAL_ALLOC_ID;
        tagData = new Tag467StrIndividualAllocID( new MyStringType( oneElement ) );
        assertEquals( "Tag467StrIndividualAllocID\n" +
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