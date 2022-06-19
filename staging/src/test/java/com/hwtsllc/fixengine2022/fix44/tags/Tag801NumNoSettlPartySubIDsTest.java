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
 *  801
 *  NoSettlPartySubIDs
 *  NumInGroup
 *  <p></p>
 *  Number of SettlPartySubID (785) and SettlPartySubIDType (786) entries
 */
class Tag801NumNoSettlPartySubIDsTest {
    @Test
    void FIX0801Test() {
        FIX44 fixData = FIX44.FIX801_NUM_NO_SETTL_PARTY_SUB_IDS;
        assertEquals( "801", fixData.toFIXIDString());
        assertEquals( "NO_SETTL_PARTY_SUB_IDS", fixData.toFIXNameString());
        assertEquals( "NoSettlPartySubIDs", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0801Test() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTA_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "801", tagData.toFIXIDString());
        assertEquals( "NO_SETTL_PARTY_SUB_IDS", tagData.toFIXNameString());
        assertEquals( "NoSettlPartySubIDs", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag801NumNoSettlPartySubIDs.TESTB_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTA_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag801NumNoSettlPartySubIDs.TESTB_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTB_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTB_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTB_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag801NumNoSettlPartySubIDs tagData;
        int oneElement;

        oneElement = Tag801NumNoSettlPartySubIDs.TESTA_NUM_NO_SETTL_PARTY_SUB_IDS;
        tagData = new Tag801NumNoSettlPartySubIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag801NumNoSettlPartySubIDs\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}