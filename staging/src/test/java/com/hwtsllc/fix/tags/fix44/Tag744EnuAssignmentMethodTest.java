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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.MyEnumAssignmentMethod;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag744EnuAssignmentMethodTest {
    Tag744EnuAssignmentMethod tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( "FIX744_ENU_ASSIGNMENT_METHOD", tagData.toFIXLabelString());
            assertEquals( "744", tagData.toFIXIDString());
            assertEquals( "ASSIGNMENT_METHOD", tagData.toFIXNameString());
            assertEquals( "AssignmentMethod", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  744 (same as 744, 1049,)
         *  AssignmentMethod
         *  char
         *  <p>    P - Pro-rata
         *  <p>    R - Random
         */
        tagData = new Tag744EnuAssignmentMethod( MyEnumAssignmentMethod.PRO_RATA );
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag744EnuAssignmentMethod( MyEnumAssignmentMethod.RANDOM );
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( "Tag744EnuAssignmentMethod\n" +
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