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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum747ExerciseMethod;
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
    void FIX0747Test() {
        FIX44 fixData = FIX44.FIX747_ENU_EXERCISE_METHOD;
        assertEquals( "747", fixData.toFIXIDString());
        assertEquals( "EXERCISE_METHOD", fixData.toFIXNameString());
        assertEquals( "ExerciseMethod", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0747Test() {
        Tag747EnuExerciseMethod tagData;

        tagData = new Tag747EnuExerciseMethod(Enum747ExerciseMethod.AUTOMATIC);
        assertEquals( Enum747ExerciseMethod.AUTOMATIC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag747EnuExerciseMethod(Enum747ExerciseMethod.MANUAL);
        assertEquals( Enum747ExerciseMethod.MANUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}