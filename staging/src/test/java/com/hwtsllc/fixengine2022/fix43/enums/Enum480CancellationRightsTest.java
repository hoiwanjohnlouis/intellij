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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  480
 *  CancellationRights
 *  char
 *  <p></p>
 *  For CIV – A one character code identifying whether Cancellation rights/Cooling off period applies.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Yes
 *  <p>    N - No - Execution Only
 *  <p>    M - No - Waiver agreement
 *  <p>    O - No - Institutional
 */
class Enum480CancellationRightsTest {
    /*
     *  Information is the same for TAGS 480
     */
    @Test
    void Enum0480Test() {
        Enum480CancellationRights enumType;

        /*
         * Y, N, M, and O types
         */
        enumType = Enum480CancellationRights.YES;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("YES", enumType.toEnumNameString());
        assertEquals("Y - Yes", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum480CancellationRights.EXECUTION_ONLY;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("EXECUTION_ONLY", enumType.toEnumNameString());
        assertEquals("N - No - Execution Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum480CancellationRights.WAIVER_AGREEMENT;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("WAIVER_AGREEMENT", enumType.toEnumNameString());
        assertEquals("M - No - Waiver agreement", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum480CancellationRights.INSTITUTIONAL;
        assertEquals("O", enumType.toFIXIDString());
        assertEquals("INSTITUTIONAL", enumType.toEnumNameString());
        assertEquals("O - No - Institutional", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}