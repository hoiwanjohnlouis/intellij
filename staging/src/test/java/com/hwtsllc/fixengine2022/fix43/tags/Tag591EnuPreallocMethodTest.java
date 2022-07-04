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
import com.hwtsllc.fixengine2022.fix43.enums.Enum591PreallocMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  591
 *  PreallocMethod
 *  char
 *  <p></p>
 *  Indicates the method of preallocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pro-rata
 *  <p>    1 - Do not pro-rata - discuss first
 */
class Tag591EnuPreallocMethodTest {
    @Test
    void FIX0591Test() {
        FIX43 fixData = FIX43.FIX591_ENU_PREALLOC_METHOD;
        assertEquals( "591", fixData.toEnumIDString());
        assertEquals( "PREALLOC_METHOD", fixData.toEnumNameString());
        assertEquals( "PreallocMethod", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0591Test() {
        Tag591EnuPreallocMethod tagData;

        /*
         *  0-1 types
         */
        tagData = new Tag591EnuPreallocMethod( Enum591PreallocMethod.PRO_RATA );
        assertEquals( Enum591PreallocMethod.PRO_RATA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag591EnuPreallocMethod( Enum591PreallocMethod.DO_NOT_PRO_RATA );
        assertEquals( Enum591PreallocMethod.DO_NOT_PRO_RATA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag591EnuPreallocMethod tagData;

        // loop around the ENUM and process
        for ( Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            tagData = new Tag591EnuPreallocMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag591EnuPreallocMethod tagData;

        // loop around the ENUM and process
        for (Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            tagData = new Tag591EnuPreallocMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag591EnuPreallocMethod tagData;

        // loop around the ENUM and process
        for (Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            tagData = new Tag591EnuPreallocMethod(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag591EnuPreallocMethod tagData;

        // loop around the ENUM and process
        for (Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            tagData = new Tag591EnuPreallocMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag591EnuPreallocMethod tagData;

        // loop around the ENUM and process
        for (Enum591PreallocMethod oneEnum : Enum591PreallocMethod.values()) {
            tagData = new Tag591EnuPreallocMethod(oneEnum);
            assertEquals( "Tag591EnuPreallocMethod\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}