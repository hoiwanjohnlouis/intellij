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
 *  72
 *  RefAllocID
 *  String
 *  <p></p>
 *  Reference identifier to be used with AllocTransType (71) = Replace or Cancel.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag72StrRefAllocIDTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX72_STR_REF_ALLOC_ID;
        assertEquals( "REF_ALLOC_ID", fixData.toEnumNameString());
        assertEquals( "72", fixData.toEnumIDString());
        assertEquals( "RefAllocID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0072Test() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTA_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag72StrRefAllocID.TESTB_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag72StrRefAllocID tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX72_STR_REF_ALLOC_ID", tagData.toEnumLabelString());
        assertEquals( "REF_ALLOC_ID", tagData.toEnumNameString());
        assertEquals( "72", tagData.toEnumIDString());
        assertEquals( "RefAllocID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTA_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag72StrRefAllocID.TESTB_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTB_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTB_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTB_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag72StrRefAllocID tagData;
        String oneElement;

        oneElement = Tag72StrRefAllocID.TESTA_STR_REF_ALLOC_ID;
        tagData = new Tag72StrRefAllocID(new MyStringType( oneElement ) );
        assertEquals( "Tag72StrRefAllocID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}