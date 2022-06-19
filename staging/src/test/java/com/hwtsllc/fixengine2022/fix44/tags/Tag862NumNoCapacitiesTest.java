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
 *  862
 *  NoCapacities
 *  NumInGroup
 *  <p></p>
 *  Number of  repeating OrderCapacity entries.
 */
class Tag862NumNoCapacitiesTest {
    @Test
    void FIX0862Test() {
        FIX44 fixData = FIX44.FIX862_NUM_NO_CAPACITIES;
        assertEquals( "862", fixData.toFIXIDString());
        assertEquals( "NO_CAPACITIES", fixData.toFIXNameString());
        assertEquals( "NoCapacities", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0862Test() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTA_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "862", tagData.toFIXIDString());
        assertEquals( "NO_CAPACITIES", tagData.toFIXNameString());
        assertEquals( "NoCapacities", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag862NumNoCapacities.TESTB_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTA_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag862NumNoCapacities.TESTB_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTB_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTB_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTB_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag862NumNoCapacities tagData;
        int oneElement;

        oneElement = Tag862NumNoCapacities.TESTA_NUM_NO_CAPACITIES;
        tagData = new Tag862NumNoCapacities( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag862NumNoCapacities\n" +
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