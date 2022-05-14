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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum87AllocStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  87
 *  AllocStatus
 *  int
 *  Identifies status of allocation.
 *  Valid values:
 *      0 - accepted (successfully processed)
 *      1 - block level reject
 *      2 - account level reject
 *      3 - received (received, not yet processed)
 *      4 - incomplete
 *      5 - rejected by intermediary
 *      6 - allocation pending
 *      7 - reversed
 */
class Tag87EnuAllocStatusTest {
    @Test
    void FIX0087Test() {
        FIX27 fixData = FIX27.FIX87_ENU_ALLOC_STATUS;
        assertEquals( "ALLOC_STATUS", fixData.getName());
        assertEquals( "87", fixData.getID());
        assertEquals( "AllocStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0087Test() {
        Tag87EnuAllocStatus tagData;

        /*
         * 0-7 AllocStatus types
         */
        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ACCEPTED);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.BLOCK_LEVEL_REJECT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ACCOUNT_LEVEL_REJECT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.RECEIVED_NOT_PROCESSED);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.INCOMPLETE);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.REJECTED_BY_INTERMEDIARY);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.ALLOCATION_PENDING);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag87EnuAllocStatus(Enum87AllocStatus.REVERSED);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}