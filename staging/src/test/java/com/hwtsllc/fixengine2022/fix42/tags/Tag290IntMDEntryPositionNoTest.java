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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  290
 *  MDEntryPositionNo
 *  int
 *  <p>
 *  Display position of a bid or offer, numbered from most competitive to least competitive,
 *  per market side, beginning with.
 */
class Tag290IntMDEntryPositionNoTest {
    @Test
    void FIX0290Test() {
        FIX42 fixData = FIX42.FIX290_INT_MD_ENTRY_POSITION_NO;
        assertEquals( "290", fixData.toEnumIDString());
        assertEquals( "MD_ENTRY_POSITION_NO", fixData.toEnumNameString());
        assertEquals( "MDEntryPositionNo", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0290Test() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTA_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag290IntMDEntryPositionNo.TESTB_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTA_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag290IntMDEntryPositionNo.TESTB_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTB_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTB_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTB_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag290IntMDEntryPositionNo tagData;
        int oneElement;

        oneElement = Tag290IntMDEntryPositionNo.TESTA_INT_MD_ENTRY_POSITION_NO;
        tagData = new Tag290IntMDEntryPositionNo( new MyIntType( oneElement ) );
        assertEquals( "Tag290IntMDEntryPositionNo\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}