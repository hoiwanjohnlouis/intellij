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
 *  Exercise Method used to in performing assignment.
 *  Valid values:
 *      A - Automatic
 *      M - Manual
 */
class Tag747EnuExerciseMethodTest {
    @Test
    void FIX0747Test() {
        FIX44 fixData = FIX44.FIX747_ENU_EXERCISE_METHOD;
        assertEquals( "747", fixData.getID());
        assertEquals( "EXERCISE_METHOD", fixData.getName());
        assertEquals( "ExerciseMethod", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0747Test() {
        Log747EnuExerciseMethod tagData;

        tagData = new Log747EnuExerciseMethod(Enum747ExerciseMethod.AUTOMATIC);
        assertEquals( Enum747ExerciseMethod.AUTOMATIC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log747EnuExerciseMethod(Enum747ExerciseMethod.MANUAL);
        assertEquals( Enum747ExerciseMethod.MANUAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}