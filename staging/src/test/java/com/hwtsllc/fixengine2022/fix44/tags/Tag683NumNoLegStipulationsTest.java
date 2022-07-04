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
 *  683
 *  NoLegStipulations
 *  NumInGroup
 *  <p></p>
 *  Number of leg stipulation entries
 */
class Tag683NumNoLegStipulationsTest {
    @Test
    void FIX0683Test() {
        FIX44 fixData = FIX44.FIX683_NUM_NO_LEG_STIPULATIONS;
        assertEquals( "683", fixData.toEnumIDString());
        assertEquals( "NO_LEG_STIPULATIONS", fixData.toEnumNameString());
        assertEquals( "NoLegStipulations", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0683Test() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTA_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "683", tagData.toEnumIDString());
        assertEquals( "NO_LEG_STIPULATIONS", tagData.toEnumNameString());
        assertEquals( "NoLegStipulations", tagData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag683NumNoLegStipulations.TESTB_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTA_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag683NumNoLegStipulations.TESTB_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTB_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTB_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTB_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag683NumNoLegStipulations tagData;
        int oneElement;

        oneElement = Tag683NumNoLegStipulations.TESTA_NUM_NO_LEG_STIPULATIONS;
        tagData = new Tag683NumNoLegStipulations( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag683NumNoLegStipulations\n" +
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