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
 *  576
 *  NoClearingInstructions
 *  NumInGroup
 *  <p>
 *  Number of clearing instructions
 */
class Tag576NumNoClearingInstructionsTest {
    @Test
    void FIX0576Test() {
        FIX43 fixData = FIX43.FIX576_NUM_NO_CLEARING_INSTRUCTIONS;
        assertEquals( "576", fixData.toEnumIDString());
        assertEquals( "NO_CLEARING_INSTRUCTIONS", fixData.toEnumNameString());
        assertEquals( "NoClearingInstructions", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0576Test() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTA_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag576NumNoClearingInstructions.TESTB_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTA_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag576NumNoClearingInstructions.TESTB_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTB_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTB_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTB_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag576NumNoClearingInstructions tagData;
        int oneElement;

        oneElement = Tag576NumNoClearingInstructions.TESTA_NUM_NO_CLEARING_INSTRUCTIONS;
        tagData = new Tag576NumNoClearingInstructions( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag576NumNoClearingInstructions\n" +
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