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
 *  887
 *  NoUnderlyingStips
 *  NumInGroup
 *  <p></p>
 *  Number of underlying stipulation entries
 */
class Tag887NumNoUnderlyingStipsTest {
    @Test
    void FIX0887Test() {
        FIX44 fixData = FIX44.FIX887_NUM_NO_UNDERLYING_STIPS;
        assertEquals( "887", fixData.toEnumIDString());
        assertEquals( "NO_UNDERLYING_STIPS", fixData.toEnumNameString());
        assertEquals( "NoUnderlyingStips", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0887Test() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTA_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag887NumNoUnderlyingStips.TESTB_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTA_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag887NumNoUnderlyingStips.TESTB_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTB_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTB_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTB_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag887NumNoUnderlyingStips tagData;
        int oneElement;

        oneElement = Tag887NumNoUnderlyingStips.TESTA_NUM_NO_UNDERLYING_STIPS;
        tagData = new Tag887NumNoUnderlyingStips( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag887NumNoUnderlyingStips\n" +
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