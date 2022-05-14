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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum794AllocReportType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  794
 *  AllocReportType
 *  Describes the specific type or purpose of an Allocation Report message
 *  Valid values:
 *      2 - Preliminary Request to Intermediary
 *      3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
 *      4 - Sellside Calculated Without Preliminary (sent unsolicited by sellside, includes MiscFees and NetMoney)
 *      5 - Warehouse Recap
 *      8 - Request to Intermediary
 *      9 - Accept
 *      10 - Reject
 *      11 - Accept Pending
 *      12 - Complete
 *      14 - Reverse Pending
 */
class Tag794EnuAllocReportTypeTest {
    @Test
    void FIX0794Test() {
        FIX44 fixData = FIX44.FIX794_ENU_ALLOC_REPORT_TYPE;
        assertEquals( "794", fixData.getID());
        assertEquals( "ALLOC_REPORT_TYPE", fixData.getName());
        assertEquals( "AllocReportType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0794Test() {
        Tag794EnuAllocReportType tagData;

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.PRELIMINARY_REQUEST);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_USING_PRELIMINARY);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.SELLSIDE_WITHOUT_PRELIMINARY);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.WAREHOUSE_RECAP);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REQUEST_TO_INTERMEDIARY);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REJECT);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.ACCEPT_PENDING);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.COMPLETE);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag794EnuAllocReportType(Enum794AllocReportType.REVERSE_PENDING);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}