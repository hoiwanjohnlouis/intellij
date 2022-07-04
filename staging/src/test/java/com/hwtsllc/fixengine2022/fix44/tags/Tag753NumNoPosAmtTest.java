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
 *  753
 *  NoPosAmt
 *  NumInGroup
 *  <p></p>
 *  Number of position amount entries.
 */
class Tag753NumNoPosAmtTest {
    @Test
    void FIX0753Test() {
        FIX44 fixData = FIX44.FIX753_NUM_NO_POS_AMT;
        assertEquals( "753", fixData.toEnumIDString());
        assertEquals( "NO_POS_AMT", fixData.toEnumNameString());
        assertEquals( "NoPosAmt", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0753Test() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTA_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "753", tagData.toEnumIDString());
        assertEquals( "NO_POS_AMT", tagData.toEnumNameString());
        assertEquals( "NoPosAmt", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag753NumNoPosAmt.TESTB_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTA_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag753NumNoPosAmt.TESTB_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTB_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTB_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTB_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag753NumNoPosAmt tagData;
        int oneElement;

        oneElement = Tag753NumNoPosAmt.TESTA_NUM_NO_POS_AMT;
        tagData = new Tag753NumNoPosAmt( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag753NumNoPosAmt\n" +
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