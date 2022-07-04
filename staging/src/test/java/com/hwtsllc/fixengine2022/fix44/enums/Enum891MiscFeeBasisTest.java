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
 *  891
 *  MiscFeeBasis
 *  int
 *  <p></p>
 *  Defines the unit for a miscellaneous fee.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Absolute
 *  <p>    1 - Per Unit
 *  <p>    2 - Percentage
 */
class Enum891MiscFeeBasisTest {
    @Test
    void EnumTest() {
        Enum891MiscFeeBasis enumType;

        enumType = Enum891MiscFeeBasis.ABSOLUTE;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "ABSOLUTE", enumType.toEnumNameString() );
        assertEquals( "0 - Absolute", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum891MiscFeeBasis.PER_UNIT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "PER_UNIT", enumType.toEnumNameString() );
        assertEquals( "1 - Per Unit", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum891MiscFeeBasis.PERCENTAGE;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "PERCENTAGE", enumType.toEnumNameString() );
        assertEquals( "2 - Percentage", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}