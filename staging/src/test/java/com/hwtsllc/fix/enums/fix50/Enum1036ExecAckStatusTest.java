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
 *  1036
 *  ExecAckStatus
 *  char
 *  <p>
 *  The status of this execution acknowledgement message.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received, not yet processed
 *  <p>    1 - Accepted
 *  <p>    2 - Don't know / Rejected
 */
class Enum1036ExecAckStatusTest {
    @Test
    void EnumTest() {
        Enum1036ExecAckStatus enumType;

        enumType = Enum1036ExecAckStatus.RECEIVED;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "RECEIVED", enumType.toFIXNameString() );
        assertEquals( "0 - Received, not yet processed", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1036ExecAckStatus.ACCEPTED;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "ACCEPTED", enumType.toFIXNameString() );
        assertEquals( "1 - Accepted", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum1036ExecAckStatus.DONT_KNOW_REJECTED;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "DONT_KNOW_REJECTED", enumType.toFIXNameString() );
        assertEquals( "2 - Don't know / Rejected", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}