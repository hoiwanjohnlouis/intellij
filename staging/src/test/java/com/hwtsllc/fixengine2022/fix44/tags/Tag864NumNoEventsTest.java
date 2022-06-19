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
 *  864
 *  NoEvents
 *  NumInGroup
 *  <p></p>
 *  Number of  repeating EventType entries.
 */
class Tag864NumNoEventsTest {
    @Test
    void FIX0864Test() {
        FIX44 fixData = FIX44.FIX864_NUM_NO_EVENTS;
        assertEquals( "864", fixData.toFIXIDString());
        assertEquals( "NO_EVENTS", fixData.toFIXNameString());
        assertEquals( "NoEvents", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0864Test() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTA_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "864", tagData.toFIXIDString());
        assertEquals( "NO_EVENTS", tagData.toFIXNameString());
        assertEquals( "NoEvents", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag864NumNoEvents.TESTB_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTA_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag864NumNoEvents.TESTB_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTB_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTB_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTB_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag864NumNoEvents tagData;
        int oneElement;

        oneElement = Tag864NumNoEvents.TESTA_NUM_NO_EVENTS;
        tagData = new Tag864NumNoEvents( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag864NumNoEvents\n" +
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