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
import com.hwtsllc.fixengine2022.datatypes.MyEnumAssignmentMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  744 (same as 744, 1049,)
 *  AssignmentMethod
 *  char
 *  <p>
 *  Method by which short positions are assigned
 *  to an exercise notice during exercise and assignment
 *  <p></p>
 *  1049
 *  InstrmtAssignmentMethod
 *  char
 *  <p>
 *  Method under which assignment was conducted
 *  <p></p>
 *  Valid values:
 *  <p>    P - Pro-rata
 *  <p>    R - Random
 */
class Tag744EnuAssignmentMethodTest {
    @Test
    void FIX0744Test() {
        FIX44 fixData = FIX44.FIX744_ENU_ASSIGNMENT_METHOD;
        assertEquals( "744", fixData.toFIXIDString());
        assertEquals( "ASSIGNMENT_METHOD", fixData.toFIXNameString());
        assertEquals( "AssignmentMethod", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0744Test() {
        Tag744EnuAssignmentMethod tagData;

        tagData = new Tag744EnuAssignmentMethod( MyEnumAssignmentMethod.PRO_RATA );
        assertEquals( MyEnumAssignmentMethod.PRO_RATA.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag744EnuAssignmentMethod( MyEnumAssignmentMethod.RANDOM );
        assertEquals( MyEnumAssignmentMethod.RANDOM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag744EnuAssignmentMethod tagData;

        // loop around the ENUM and process
        for ( MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag744EnuAssignmentMethod tagData;

        // loop around the ENUM and process
        for (MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag744EnuAssignmentMethod tagData;

        // loop around the ENUM and process
        for (MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag744EnuAssignmentMethod tagData;

        // loop around the ENUM and process
        for (MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag744EnuAssignmentMethod tagData;

        // loop around the ENUM and process
        for (MyEnumAssignmentMethod oneEnum : MyEnumAssignmentMethod.values()) {
            tagData = new Tag744EnuAssignmentMethod(oneEnum);
            assertEquals( "Tag744EnuAssignmentMethod\n" +
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