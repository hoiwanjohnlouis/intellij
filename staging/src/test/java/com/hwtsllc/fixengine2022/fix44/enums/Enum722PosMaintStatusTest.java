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

class Enum722PosMaintStatusTest {
    /**
     *  722
     *  PosMaintStatus
     *  Status of Position Maintenance Request
     *  Valid values:
     *      0 - Accepted
     *      1 - Accepted With Warnings
     *      2 - Rejected
     *      3 - Completed
     *      4 - Completed With Warnings
     */
    @Test
    void EnumTest() {
        Enum722PosMaintStatus enumType;

        enumType = Enum722PosMaintStatus.ACCEPTED;
        assertEquals( "0", enumType.getID());
        assertEquals( "ACCEPTED", enumType.getName());
        assertEquals( "0 - Accepted", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum722PosMaintStatus.ACCEPTED_WITH_WARNINGS;
        assertEquals( "1", enumType.getID());
        assertEquals( "ACCEPTED_WITH_WARNINGS", enumType.getName());
        assertEquals( "1 - Accepted With Warnings", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum722PosMaintStatus.REJECTED;
        assertEquals( "2", enumType.getID());
        assertEquals( "REJECTED", enumType.getName());
        assertEquals( "2 - Rejected", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum722PosMaintStatus.COMPLETED;
        assertEquals( "3", enumType.getID());
        assertEquals( "COMPLETED", enumType.getName());
        assertEquals( "3 - Completed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum722PosMaintStatus.COMPLETED_WITH_WARNINGS;
        assertEquals( "4", enumType.getID());
        assertEquals( "COMPLETED_WITH_WARNINGS", enumType.getName());
        assertEquals( "4 - Completed With Warnings", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}