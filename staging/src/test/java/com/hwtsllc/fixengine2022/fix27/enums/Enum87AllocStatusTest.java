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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum87AllocStatusTest {
    @Test
    void Enum0087Test() {
        Enum87AllocStatus enumType;

        /*
         * 0-7 msg types
         */
        enumType = Enum87AllocStatus.ACCEPTED;
        assertEquals("0", enumType.getID());
        assertEquals("ACCEPTED", enumType.getName());
        assertEquals("0 -accepted (successfully processed)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.BLOCK_LEVEL_REJECT;
        assertEquals("1", enumType.getID());
        assertEquals("BLOCK_LEVEL_REJECT", enumType.getName());
        assertEquals("1 - block level reject", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.ACCOUNT_LEVEL_REJECT;
        assertEquals("2", enumType.getID());
        assertEquals("ACCOUNT_LEVEL_REJECT", enumType.getName());
        assertEquals("2 - account level reject", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.RECEIVED_NOT_PROCESSED;
        assertEquals("3", enumType.getID());
        assertEquals("RECEIVED_NOT_PROCESSED", enumType.getName());
        assertEquals("3 - received (received, not yet processed)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.INCOMPLETE;
        assertEquals("4", enumType.getID());
        assertEquals("INCOMPLETE", enumType.getName());
        assertEquals("4 - incomplete", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.REJECTED_BY_INTERMEDIARY;
        assertEquals("5", enumType.getID());
        assertEquals("REJECTED_BY_INTERMEDIARY", enumType.getName());
        assertEquals("5 - rejected by intermediary", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.ALLOCATION_PENDING;
        assertEquals("6", enumType.getID());
        assertEquals("ALLOCATION_PENDING", enumType.getName());
        assertEquals("6 - allocation pending", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum87AllocStatus.REVERSED;
        assertEquals("7", enumType.getID());
        assertEquals("REVERSED", enumType.getName());
        assertEquals("7 - reversed", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}