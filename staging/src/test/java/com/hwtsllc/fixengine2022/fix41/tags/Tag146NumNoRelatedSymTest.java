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
 *  146
 *  NoRelatedSym
 *  NumInGroup
 *  <p>
 *  Specifies the number of repeating symbols specified.
 */
class Tag146NumNoRelatedSymTest {
    @Test
    void FIX0146Test() {
        FIX41 fixData = FIX41.FIX146_NUM_NO_RELATED_SYM;
        assertEquals( "146", fixData.toFIXIDString());
        assertEquals( "NO_RELATED_SYM", fixData.toFIXNameString());
        assertEquals( "NoRelatedSym", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0146Test() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM));
        assertEquals( Tag146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        assertEquals( Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        assertEquals( Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        assertEquals( tagData.toFIXIDString() + "=" + Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM));
        assertEquals( String.valueOf(Tag146NumNoRelatedSym.TESTB_NUM_NO_RELATED_SYM),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag146NumNoRelatedSym tagData;

        tagData = new Tag146NumNoRelatedSym(new MyNumInGroupType(Tag146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM));
        assertEquals( "Tag146NumNoRelatedSym\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag146NumNoRelatedSym.TESTA_NUM_NO_RELATED_SYM + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}