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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("ACCEPTED", enumType.toEnumNameString());
        assertEquals("0 -accepted (successfully processed)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.BLOCK_LEVEL_REJECT;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("BLOCK_LEVEL_REJECT", enumType.toEnumNameString());
        assertEquals("1 - block level reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.ACCOUNT_LEVEL_REJECT;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("ACCOUNT_LEVEL_REJECT", enumType.toEnumNameString());
        assertEquals("2 - account level reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.RECEIVED_NOT_PROCESSED;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("RECEIVED_NOT_PROCESSED", enumType.toEnumNameString());
        assertEquals("3 - received (received, not yet processed)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.INCOMPLETE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("INCOMPLETE", enumType.toEnumNameString());
        assertEquals("4 - incomplete", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum87AllocStatus.REJECTED_BY_INTERMEDIARY;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("REJECTED_BY_INTERMEDIARY", enumType.toEnumNameString());
        assertEquals("5 - rejected by intermediary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.ALLOCATION_PENDING;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("ALLOCATION_PENDING", enumType.toEnumNameString());
        assertEquals("6 - allocation pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum87AllocStatus.REVERSED;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("REVERSED", enumType.toEnumNameString());
        assertEquals("7 - reversed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}