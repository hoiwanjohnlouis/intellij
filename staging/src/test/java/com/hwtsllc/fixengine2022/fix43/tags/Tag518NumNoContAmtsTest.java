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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  518
 *  NoContAmts
 *  NumInGroup
 *  <p>
 *  The number of Contract Amount details on an Execution Report message
 */
class Tag518NumNoContAmtsTest {
    @Test
    void FIX0518Test() {
        FIX43 fixData = FIX43.FIX518_NUM_NO_CONT_AMTS;
        assertEquals( "518", fixData.toEnumIDString());
        assertEquals( "NO_CONT_AMTS", fixData.toEnumNameString());
        assertEquals( "NoContAmts", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0518Test() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTA_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag518NumNoContAmts.TESTB_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTA_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag518NumNoContAmts.TESTB_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTB_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTB_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTB_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag518NumNoContAmts tagData;
        int oneElement;

        oneElement = Tag518NumNoContAmts.TESTA_NUM_NO_CONT_AMTS;
        tagData = new Tag518NumNoContAmts( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag518NumNoContAmts\n" +
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