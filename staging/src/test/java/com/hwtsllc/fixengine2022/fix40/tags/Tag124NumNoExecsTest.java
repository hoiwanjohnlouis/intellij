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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  124
 *  NoExecs
 *  NumInGroup
 *  <p></p>
 *  No of execution repeating group entries to follow.
 */
class Tag124NumNoExecsTest {
    @Test
    void PrintFIXTagTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag124NumNoExecs tagData ) {
        assertEquals( "FIX124_NUM_NO_EXECS", tagData.toEnumLabelString());
        assertEquals( "NO_EXECS", tagData.toEnumNameString());
        assertEquals( "124", tagData.toEnumIDString());
        assertEquals( "NoExecs", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag124NumNoExecs tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag124NumNoExecs tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag124NumNoExecs tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag124NumNoExecs tagData;
        int oneElement;

        oneElement = Tag124NumNoExecs.TESTA_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag124NumNoExecs.TESTB_NUM_NO_EXECS;
        tagData = new Tag124NumNoExecs(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag124NumNoExecs tagData ) {
        assertEquals( "Tag124NumNoExecs\n" +
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