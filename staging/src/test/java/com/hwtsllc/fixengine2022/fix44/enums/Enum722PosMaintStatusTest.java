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
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "ACCEPTED", enumType.toFIXNameString());
        assertEquals( "0 - Accepted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum722PosMaintStatus.ACCEPTED_WITH_WARNINGS;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "ACCEPTED_WITH_WARNINGS", enumType.toFIXNameString());
        assertEquals( "1 - Accepted With Warnings", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum722PosMaintStatus.REJECTED;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "REJECTED", enumType.toFIXNameString());
        assertEquals( "2 - Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum722PosMaintStatus.COMPLETED;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "COMPLETED", enumType.toFIXNameString());
        assertEquals( "3 - Completed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum722PosMaintStatus.COMPLETED_WITH_WARNINGS;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "COMPLETED_WITH_WARNINGS", enumType.toFIXNameString());
        assertEquals( "4 - Completed With Warnings", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}