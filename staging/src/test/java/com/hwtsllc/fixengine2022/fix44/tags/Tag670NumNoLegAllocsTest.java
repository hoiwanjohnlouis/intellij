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
 *  670
 *  NoLegAllocs
 *  NumInGroup
 *  <p></p>
 *  Number of Allocations for the leg
 */
class Tag670NumNoLegAllocsTest {
    @Test
    void FIX0670Test() {
        FIX44 fixData = FIX44.FIX670_NUM_NO_LEG_ALLOCS;
        assertEquals( "670", fixData.toFIXIDString());
        assertEquals( "NO_LEG_ALLOCS", fixData.toFIXNameString());
        assertEquals( "NoLegAllocs", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0670Test() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTA_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag670NumNoLegAllocs.TESTB_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTA_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag670NumNoLegAllocs.TESTB_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTB_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTB_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTB_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag670NumNoLegAllocs tagData;
        int oneElement;

        oneElement = Tag670NumNoLegAllocs.TESTA_NUM_NO_LEG_ALLOCS;
        tagData = new Tag670NumNoLegAllocs( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag670NumNoLegAllocs\n" +
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