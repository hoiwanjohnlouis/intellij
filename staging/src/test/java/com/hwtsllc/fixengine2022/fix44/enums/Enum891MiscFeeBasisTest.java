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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  891
 *  MiscFeeBasis
 *  int
 *  Defines the unit for a miscellaneous fee.
 *  Valid values:
 *      0 - Absolute
 *      1 - Per Unit
 *      2 - Percentage
 */
class Enum891MiscFeeBasisTest {
    @Test
    void EnumTest() {
        Enum891MiscFeeBasis enumType;

        enumType = Enum891MiscFeeBasis.ABSOLUTE;
        assertEquals( "0", enumType.getID() );
        assertEquals( "ABSOLUTE", enumType.getName() );
        assertEquals( "0 - Absolute", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum891MiscFeeBasis.PER_UNIT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "PER_UNIT", enumType.getName() );
        assertEquals( "1 - Per Unit", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum891MiscFeeBasis.PERCENTAGE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "PERCENTAGE", enumType.getName() );
        assertEquals( "2 - Percentage", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}