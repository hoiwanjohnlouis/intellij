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
 *  781
 *  NoSettlPartyIDs
 *  NumInGroup
 *  <p></p>
 *  Number of SettlPartyID (782), SettlPartyIDSource (783),
 *  and SettlPartyRole (784) entries
 */
class Tag781NumNoSettlPartyIDsTest {
    @Test
    void FIX0781Test() {
        FIX44 fixData = FIX44.FIX781_NUM_NO_SETTL_PARTY_IDS;
        assertEquals( "781", fixData.toEnumIDString());
        assertEquals( "NO_SETTL_PARTY_IDS", fixData.toEnumNameString());
        assertEquals( "NoSettlPartyIDs", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0781Test() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTA_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "781", tagData.toEnumIDString());
        assertEquals( "NO_SETTL_PARTY_IDS", tagData.toEnumNameString());
        assertEquals( "NoSettlPartyIDs", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag781NumNoSettlPartyIDs.TESTB_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTA_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag781NumNoSettlPartyIDs.TESTB_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTB_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTB_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTB_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag781NumNoSettlPartyIDs tagData;
        int oneElement;

        oneElement = Tag781NumNoSettlPartyIDs.TESTA_NUM_NO_SETTL_PARTY_IDS;
        tagData = new Tag781NumNoSettlPartyIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag781NumNoSettlPartyIDs\n" +
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