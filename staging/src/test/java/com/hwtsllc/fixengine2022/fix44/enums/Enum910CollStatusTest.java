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
 *  910
 *  CollStatus
 *  int
 *  <p></p>
 *  Collateral Status
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unassigned
 *  <p>    1 - Partially Assigned
 *  <p>    2 - Assignment Proposed
 *  <p>    3 - Assigned (Accepted)
 *  <p>    4 - Challenged
 */
class Enum910CollStatusTest {
    @Test
    void EnumTest() {
        Enum910CollStatus enumType;

        enumType = Enum910CollStatus.UNASSIGNED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "UNASSIGNED", enumType.toFIXNameString() );
        assertEquals( "0 - Unassigned", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum910CollStatus.PARTIALLY_ASSIGNED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "PARTIALLY_ASSIGNED", enumType.toFIXNameString() );
        assertEquals( "1 - Partially Assigned", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum910CollStatus.ASSIGNMENT_PROPOSED;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "ASSIGNMENT_PROPOSED", enumType.toFIXNameString() );
        assertEquals( "2 - Assignment Proposed", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum910CollStatus.ASSIGNED;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "ASSIGNED", enumType.toFIXNameString() );
        assertEquals( "3 - Assigned (Accepted)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum910CollStatus.CHALLENGED;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "CHALLENGED", enumType.toFIXNameString() );
        assertEquals( "4 - Challenged", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}