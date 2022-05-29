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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1002AllocMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1002
 *  AllocMethod
 *  int
 *  <p>
 *  Specifies the method under which a trade quantity was allocated.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automatic
 *  <p>    2 - Guarantor
 *  <p>    3 - Manual
 */
class Tag1002EnuAllocMethodTest {
    @Test
    void FIX1002Test() {
        FIX50 fixData = FIX50.FIX1002_ENU_ALLOC_METHOD;
        assertEquals( "1002", fixData.toFIXIDString());
        assertEquals( "ALLOC_METHOD", fixData.toFIXNameString());
        assertEquals( "AllocMethod", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1002Test() {
        Tag1002EnuAllocMethod tagData;

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.AUTOMATIC );
        assertEquals( Enum1002AllocMethod.AUTOMATIC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.GUARANTOR );
        assertEquals( Enum1002AllocMethod.GUARANTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.MANUAL );
        assertEquals( Enum1002AllocMethod.MANUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1002EnuAllocMethod tagData;

        // loop around the ENUM and process
        for ( Enum1002AllocMethod oneEnum : Enum1002AllocMethod.values()) {
            tagData = new Tag1002EnuAllocMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1002EnuAllocMethod tagData;

        // loop around the ENUM and process
        for (Enum1002AllocMethod oneEnum : Enum1002AllocMethod.values()) {
            tagData = new Tag1002EnuAllocMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1002EnuAllocMethod tagData;

        // loop around the ENUM and process
        for (Enum1002AllocMethod oneEnum : Enum1002AllocMethod.values()) {
            tagData = new Tag1002EnuAllocMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1002EnuAllocMethod tagData;

        // loop around the ENUM and process
        for (Enum1002AllocMethod oneEnum : Enum1002AllocMethod.values()) {
            tagData = new Tag1002EnuAllocMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1002EnuAllocMethod tagData;

        // loop around the ENUM and process
        for (Enum1002AllocMethod oneEnum : Enum1002AllocMethod.values()) {
            tagData = new Tag1002EnuAllocMethod(oneEnum);
            assertEquals( "Tag1002EnuAllocMethod\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}