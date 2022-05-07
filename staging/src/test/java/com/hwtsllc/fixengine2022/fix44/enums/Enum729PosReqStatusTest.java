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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum729PosReqStatusTest {
    /**
     *  729
     *  PosReqStatus
     *  Status of Request for Positions
     *  Valid values:
     *      0 - Completed
     *      1 - Completed With Warnings
     *      2 - Rejected
     */
    @Test
    void EnumTest() {
        Enum729PosReqStatus enumType;

        enumType = Enum729PosReqStatus.COMPLETED;
        assertEquals( "0", enumType.getID());
        assertEquals( "COMPLETED", enumType.getName());
        assertEquals( "0 - Completed", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum729PosReqStatus.COMPLETED_WITH_WARNINGS;
        assertEquals( "1", enumType.getID());
        assertEquals( "COMPLETED_WITH_WARNINGS", enumType.getName());
        assertEquals( "1 - Completed With Warnings", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum729PosReqStatus.REJECTED;
        assertEquals( "2", enumType.getID());
        assertEquals( "REJECTED", enumType.getName());
        assertEquals( "2 - Rejected", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}