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
 *  936
 *  NoCompIDs
 *  NumInGroup
 *  <p></p>
 *  Number of CompID entries in a repeating group.
 */
class Tag936NumNoCompIDsTest {
    @Test
    void FIX0936Test() {
        FIX44 fixData = FIX44.FIX936_NUM_NO_COMP_IDS;
        assertEquals( "936", fixData.toFIXIDString());
        assertEquals( "NO_COMP_IDS", fixData.toFIXNameString());
        assertEquals( "NoCompIDs", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0936Test() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTA_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "936", tagData.toFIXIDString());
        assertEquals( "NO_COMP_IDS", tagData.toFIXNameString());
        assertEquals( "NoCompIDs", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag936NumNoCompIDs.TESTB_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTA_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag936NumNoCompIDs.TESTB_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTB_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTB_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTB_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag936NumNoCompIDs tagData;
        int oneElement;

        oneElement = Tag936NumNoCompIDs.TESTA_NUM_NO_COMP_IDS;
        tagData = new Tag936NumNoCompIDs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag936NumNoCompIDs\n" +
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