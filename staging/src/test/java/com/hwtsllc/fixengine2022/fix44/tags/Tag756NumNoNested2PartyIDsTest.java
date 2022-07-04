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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  756
 *  NoNested2PartyIDs
 *  NumInGroup
 *  <p></p>
 *  Number of Nested2PartyID (757), Nested2PartyIDSource (758),
 *  and Nested2PartyRole (759) entries
 */
class Tag756NumNoNested2PartyIDsTest {
    @Test
    void FIX0756Test() {
        FIX44 fixData = FIX44.FIX756_NUM_NO_NESTED_2_PARTY_IDS;
        assertEquals( "756", fixData.toEnumIDString());
        assertEquals( "NO_NESTED_2_PARTY_IDS", fixData.toEnumNameString());
        assertEquals( "NoNested2PartyIDs", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0756Test() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTA_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "756", tagData.toEnumIDString());
        assertEquals( "NO_NESTED_2_PARTY_IDS", tagData.toEnumNameString());
        assertEquals( "NoNested2PartyIDs", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag756NumNoNested2PartyIDs.TESTB_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTA_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag756NumNoNested2PartyIDs.TESTB_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTB_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTB_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTB_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag756NumNoNested2PartyIDs tagData;
        int oneElement;

        oneElement = Tag756NumNoNested2PartyIDs.TESTA_NUM_NO_NESTED_2_PARTY_IDS;
        tagData = new Tag756NumNoNested2PartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag756NumNoNested2PartyIDs\n" +
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