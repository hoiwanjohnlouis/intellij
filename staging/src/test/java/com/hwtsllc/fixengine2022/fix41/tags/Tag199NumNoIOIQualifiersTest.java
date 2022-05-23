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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  199
 *  NoIOIQualifiers
 *  NumInGroup
 *  <p>
 *  Number of repeating groups of IOIQualifiers (04).
 */
class Tag199NumNoIOIQualifiersTest {
    @Test
    void FIX0199Test() {
        FIX41 fixData = FIX41.FIX199_NUM_NO_IOI_QUALIFIERS;
        assertEquals( "199", fixData.toFIXIDString());
        assertEquals( "NO_IOI_QUALIFIERS", fixData.toFIXNameString());
        assertEquals( "NoIOIQualifiers", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0199Test() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(
                new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS));
        assertEquals( Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag199NumNoIOIQualifiers(
                new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS));
        assertEquals( Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS));
        assertEquals( Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS));
        assertEquals( tagData.toFIXIDString() + "=" + Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS));
        assertEquals( String.valueOf(Tag199NumNoIOIQualifiers.TESTB_NUM_NO_IOI_QUALIFIERS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS));
        assertEquals( "Tag199NumNoIOIQualifiers\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag199NumNoIOIQualifiers.TESTA_NUM_NO_IOI_QUALIFIERS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}