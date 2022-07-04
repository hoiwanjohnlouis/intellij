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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  124
 *  NoExecs
 *  NumInGroup
 *  No of execution repeating group entries to follow.
 */
class Tag124NumNoExecsTest {
    @Test
    void FIX0124Test() {
        FIX40 fixData = FIX40.FIX124_NUM_NO_EXECS;
        assertEquals( "NO_EXECS", fixData.toEnumNameString());
        assertEquals( "124", fixData.toEnumIDString());
        assertEquals( "NoExecs", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0124Test() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(100) );
        assertEquals( 100, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(Tag124NumNoExecs.TESTB_NUM_NO_EXECS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(Tag124NumNoExecs.TESTB_NUM_NO_EXECS));
        assertEquals( Tag124NumNoExecs.TESTB_NUM_NO_EXECS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(Tag124NumNoExecs.TESTB_NUM_NO_EXECS));
        assertEquals( tagData.toEnumIDString() + "=" + Tag124NumNoExecs.TESTB_NUM_NO_EXECS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(Tag124NumNoExecs.TESTB_NUM_NO_EXECS));
        assertEquals( String.valueOf(Tag124NumNoExecs.TESTB_NUM_NO_EXECS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag124NumNoExecs tagData;

        tagData = new Tag124NumNoExecs(new MyNumInGroupType(Tag124NumNoExecs.TESTA_NUM_NO_EXECS));
        assertEquals( "Tag124NumNoExecs\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag124NumNoExecs.TESTA_NUM_NO_EXECS + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag124NumNoExecs.TESTA_NUM_NO_EXECS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}