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

package com.hwtsllc.fixengine.tags.fix50;

import com.hwtsllc.fixengine.datatypes.MyEnumPositionEffect;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1047EnuAllocPositionEffectTest {
    Tag1047EnuAllocPositionEffect tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumPositionEffect oneEnum : MyEnumPositionEffect.values()) {
            tagData = new Tag1047EnuAllocPositionEffect(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumPositionEffect oneEnum : MyEnumPositionEffect.values()) {
            tagData = new Tag1047EnuAllocPositionEffect(oneEnum);
            assertEquals( "FIX1047_ENU_ALLOC_POSITION_EFFECT", tagData.toFIXLabelString());
            assertEquals( "1047", tagData.toFIXIDString());
            assertEquals( "ALLOC_POSITION_EFFECT", tagData.toFIXNameString());
            assertEquals( "AllocPositionEffect", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPositionEffect oneEnum : MyEnumPositionEffect.values()) {
            tagData = new Tag1047EnuAllocPositionEffect(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  77 (Same for TAGS 77, 564, 1047, )
         *  <p>    C - Close
         *  <p>    F - FIFO
         *  <p>    O - Open
         *  <p>    R - Rolled
         */
        tagData = new Tag1047EnuAllocPositionEffect(MyEnumPositionEffect.OPEN);
        assertEquals( "O", tagData.toString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1047EnuAllocPositionEffect(MyEnumPositionEffect.FIFO);
        assertEquals( "F", tagData.toString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1047EnuAllocPositionEffect(MyEnumPositionEffect.CLOSE);
        assertEquals( "C", tagData.toString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1047EnuAllocPositionEffect(MyEnumPositionEffect.ROLLED);
        assertEquals( "R", tagData.toString());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumPositionEffect oneEnum : MyEnumPositionEffect.values()) {
            tagData = new Tag1047EnuAllocPositionEffect(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumPositionEffect oneEnum : MyEnumPositionEffect.values()) {
            tagData = new Tag1047EnuAllocPositionEffect(oneEnum);
            assertEquals( "Tag1047EnuAllocPositionEffect\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}