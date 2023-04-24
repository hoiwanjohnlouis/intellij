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

package com.hwtsllc.fixengine.enums.fix50;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1002
 *  AllocMethod
 *  int
 *  <p>
 *  Specifies the method under which a trade quantity was allocated.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automatic
 *  <p>    2 - Guarantor
 *  <p>    3 - Manual
 */
class Enum1002AllocMethodTest {
    @Test
    void EnumTest() {
        Enum1002AllocMethod enumType;

        enumType = Enum1002AllocMethod.AUTOMATIC;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "AUTOMATIC", enumType.toFIXNameString() );
        assertEquals( "1 - Automatic", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1002AllocMethod.GUARANTOR;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "GUARANTOR", enumType.toFIXNameString() );
        assertEquals( "2 - Guarantor", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1002AllocMethod.MANUAL;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "MANUAL", enumType.toFIXNameString() );
        assertEquals( "3 - Manual", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}