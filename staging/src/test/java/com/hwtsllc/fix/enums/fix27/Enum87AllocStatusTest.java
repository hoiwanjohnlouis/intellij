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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  87
 *  AllocStatus
 *  int
 *  <p></p>
 *  Identifies status of allocation.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - accepted (successfully processed)
 *  <p>    1 - block level reject
 *  <p>    2 - account level reject
 *  <p>    3 - received (received, not yet processed)
 *  <p>    4 - incomplete
 *  <p></p>
 *  <p>    5 - rejected by intermediary
 *  <p>    6 - allocation pending
 *  <p>    7 - reversed
 */
class Enum87AllocStatusTest {
    @Test
    void Enum0087Test() {
        Enum87AllocStatus enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum87AllocStatus.ACCEPTED;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("ACCEPTED", enumType.toFIXNameString());
        assertEquals("0 -accepted (successfully processed)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.BLOCK_LEVEL_REJECT;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("BLOCK_LEVEL_REJECT", enumType.toFIXNameString());
        assertEquals("1 - block level reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.ACCOUNT_LEVEL_REJECT;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("ACCOUNT_LEVEL_REJECT", enumType.toFIXNameString());
        assertEquals("2 - account level reject", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.RECEIVED_NOT_PROCESSED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("RECEIVED_NOT_PROCESSED", enumType.toFIXNameString());
        assertEquals("3 - received (received, not yet processed)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.INCOMPLETE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("INCOMPLETE", enumType.toFIXNameString());
        assertEquals("4 - incomplete", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum87AllocStatus.REJECTED_BY_INTERMEDIARY;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("REJECTED_BY_INTERMEDIARY", enumType.toFIXNameString());
        assertEquals("5 - rejected by intermediary", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.ALLOCATION_PENDING;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("ALLOCATION_PENDING", enumType.toFIXNameString());
        assertEquals("6 - allocation pending", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum87AllocStatus.REVERSED;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("REVERSED", enumType.toFIXNameString());
        assertEquals("7 - reversed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}