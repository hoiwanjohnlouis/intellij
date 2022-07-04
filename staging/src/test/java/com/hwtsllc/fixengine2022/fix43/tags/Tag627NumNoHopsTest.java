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
 *  627
 *  NoHops
 *  NumInGroup
 *  <p>
 *  Number of HopCompID entries in repeating group.
 */
class Tag627NumNoHopsTest {
    @Test
    void FIX0627Test() {
        FIX43 fixData = FIX43.FIX627_NUM_NO_HOPS;
        assertEquals( "627", fixData.toEnumIDString());
        assertEquals( "NO_HOPS", fixData.toEnumNameString());
        assertEquals( "NoHops", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0627Test() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTA_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag627NumNoHops.TESTB_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTA_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag627NumNoHops.TESTB_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTB_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTB_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTB_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag627NumNoHops tagData;
        int oneElement;

        oneElement = Tag627NumNoHops.TESTA_NUM_NO_HOPS;
        tagData = new Tag627NumNoHops( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag627NumNoHops\n" +
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