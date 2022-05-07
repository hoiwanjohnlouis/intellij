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

class Enum706PosQtyStatusTest {
    /**
     *  706
     *  PosQtyStatus
     *  Status of this position.
     *  Valid values:
     *  0 - Submitted
     *  1 - Accepted
     *  2 - Rejected
     */
    @Test
    void EnumTest() {
        Enum706PosQtyStatus enumType;

        enumType = Enum706PosQtyStatus.SUBMITTED;
        assertEquals( "0", enumType.getID());
        assertEquals( "SUBMITTED", enumType.getName());
        assertEquals( "0 - Submitted", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum706PosQtyStatus.ACCEPTED;
        assertEquals( "1", enumType.getID());
        assertEquals( "ACCEPTED", enumType.getName());
        assertEquals( "1 - Accepted", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum706PosQtyStatus.REJECTED;
        assertEquals( "2", enumType.getID());
        assertEquals( "REJECTED", enumType.getName());
        assertEquals( "2 - Rejected", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}