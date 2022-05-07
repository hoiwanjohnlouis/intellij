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

/**
 *  910
 *  CollStatus
 *  int
 *  Collateral Status
 *  Valid values:
 *      0 - Unassigned
 *      1 - Partially Assigned
 *      2 - Assignment Proposed
 *      3 - Assigned (Accepted)
 *      4 - Challenged
 */
class Enum910CollStatusTest {
    @Test
    void EnumTest() {
        Enum910CollStatus enumType;

        enumType = Enum910CollStatus.UNASSIGNED;
        assertEquals( "0", enumType.getID() );
        assertEquals( "UNASSIGNED", enumType.getName() );
        assertEquals( "0 - Unassigned", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum910CollStatus.PARTIALLY_ASSIGNED;
        assertEquals( "1", enumType.getID() );
        assertEquals( "PARTIALLY_ASSIGNED", enumType.getName() );
        assertEquals( "1 - Partially Assigned", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum910CollStatus.ASSIGNMENT_PROPOSED;
        assertEquals( "2", enumType.getID() );
        assertEquals( "ASSIGNMENT_PROPOSED", enumType.getName() );
        assertEquals( "2 - Assignment Proposed", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum910CollStatus.ASSIGNED;
        assertEquals( "3", enumType.getID() );
        assertEquals( "ASSIGNED", enumType.getName() );
        assertEquals( "3 - Assigned (Accepted)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum910CollStatus.CHALLENGED;
        assertEquals( "4", enumType.getID() );
        assertEquals( "CHALLENGED", enumType.getName() );
        assertEquals( "4 - Challenged", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}