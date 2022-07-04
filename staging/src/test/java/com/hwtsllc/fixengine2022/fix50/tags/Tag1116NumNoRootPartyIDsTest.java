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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1116
 *  NoRootPartyIDs
 *  NumInGroup
 *  <p>
 *  Number of RootPartyID (1117), RootPartyIDSource (1118), and RootPartyRole (1119) entries
 */
class Tag1116NumNoRootPartyIDsTest {
    @Test
    void FIX1116Test() {
        FIX50 fixData = FIX50.FIX1116_NUM_NO_ROOT_PARTY_IDS;
        assertEquals( "1116", fixData.toEnumIDString());
        assertEquals( "NO_ROOT_PARTY_IDS", fixData.toEnumNameString());
        assertEquals( "NoRootPartyIDs", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1116Test() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTA_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1116NumNoRootPartyIDs.TESTB_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTA_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1116NumNoRootPartyIDs.TESTB_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTB_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTB_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTB_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1116NumNoRootPartyIDs tagData;
        int oneElement;

        oneElement = Tag1116NumNoRootPartyIDs.TESTA_NUM_NO_ROOT_PARTY_IDS;
        tagData = new Tag1116NumNoRootPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag1116NumNoRootPartyIDs\n" +
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