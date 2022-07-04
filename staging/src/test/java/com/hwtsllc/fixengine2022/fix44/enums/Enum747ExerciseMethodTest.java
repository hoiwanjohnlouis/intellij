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

package com.hwtsllc.fixengine2022.fix44.enums;

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
class Enum747ExerciseMethodTest {
    @Test
    void EnumTest() {
        Enum747ExerciseMethod enumType;

        enumType = Enum747ExerciseMethod.AUTOMATIC;
        assertEquals( "A", enumType.toEnumIDString());
        assertEquals( "AUTOMATIC", enumType.toEnumNameString());
        assertEquals( "A - Automatic", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum747ExerciseMethod.MANUAL;
        assertEquals( "M", enumType.toEnumIDString());
        assertEquals( "MANUAL", enumType.toEnumNameString());
        assertEquals( "M - Manual", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}