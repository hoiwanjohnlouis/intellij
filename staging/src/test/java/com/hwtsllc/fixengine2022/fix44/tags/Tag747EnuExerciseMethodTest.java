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
import com.hwtsllc.fixengine2022.fix44.enums.Enum747ExerciseMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  747
 *  ExerciseMethod
 *  int
 *  <p></p>
 *  Exercise Method used to in performing assignment.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Automatic
 *  <p>    M - Manual
 */
class Tag747EnuExerciseMethodTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX747_ENU_EXERCISE_METHOD;
        assertEquals( "747", fixData.toEnumIDString());
        assertEquals( "EXERCISE_METHOD", fixData.toEnumNameString());
        assertEquals( "ExerciseMethod", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0747Test() {
        Tag747EnuExerciseMethod tagData;
        Enum747ExerciseMethod oneElement;

        oneElement = Enum747ExerciseMethod.AUTOMATIC;
        tagData = new Tag747EnuExerciseMethod( oneElement );
        assertEquals( Enum747ExerciseMethod.AUTOMATIC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "747", tagData.toEnumIDString());
        assertEquals( "EXERCISE_METHOD", tagData.toEnumNameString());
        assertEquals( "ExerciseMethod", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag747EnuExerciseMethod(Enum747ExerciseMethod.MANUAL);
        assertEquals( Enum747ExerciseMethod.MANUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag747EnuExerciseMethod tagData;

        // loop around the ENUM and process
        for ( Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            tagData = new Tag747EnuExerciseMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag747EnuExerciseMethod tagData;

        // loop around the ENUM and process
        for (Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            tagData = new Tag747EnuExerciseMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag747EnuExerciseMethod tagData;

        // loop around the ENUM and process
        for (Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            tagData = new Tag747EnuExerciseMethod(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag747EnuExerciseMethod tagData;

        // loop around the ENUM and process
        for (Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            tagData = new Tag747EnuExerciseMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag747EnuExerciseMethod tagData;

        // loop around the ENUM and process
        for (Enum747ExerciseMethod oneEnum : Enum747ExerciseMethod.values()) {
            tagData = new Tag747EnuExerciseMethod(oneEnum);
            assertEquals( "Tag747EnuExerciseMethod\n" +
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