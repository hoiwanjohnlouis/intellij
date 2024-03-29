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

package com.hwtsllc.fix.enums.fix50;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  965
 *  SecurityStatus
 *  String
 *  <p>
 *  Used for derivatives.
 *  <p>
 *  Denotes the current state of the Instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Active
 *  <p>    2 - Inactive
 */
class Enum965SecurityStatusTest {
    @Test
    void EnumTest() {
        Enum965SecurityStatus enumType;

        enumType = Enum965SecurityStatus.ACTIVE;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ACTIVE", enumType.toFIXNameString() );
        assertEquals( "1 - Active", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum965SecurityStatus.INACTIVE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "INACTIVE", enumType.toFIXNameString() );
        assertEquals( "2 - Inactive", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}