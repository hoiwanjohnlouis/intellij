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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  268
 *  NoMDEntries
 *  NumInGroup
 *  <p>
 *  Number of entries in Market Data message.
 */
class Tag268NumNoMDEntriesTest {
    @Test
    void FIX0268Test() {
        FIX42 fixData = FIX42.FIX268_NUM_NO_MD_ENTRIES;
        assertEquals( "268", fixData.toEnumIDString());
        assertEquals( "NO_MD_ENTRIES", fixData.toEnumNameString());
        assertEquals( "NoMDEntries", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0268Test() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTA_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries(new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries(new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTA_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTB_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag268NumNoMDEntries tagData;
        int oneElement;

        oneElement = Tag268NumNoMDEntries.TESTA_NUM_NO_MD_ENTRIES;
        tagData = new Tag268NumNoMDEntries( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag268NumNoMDEntries\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}