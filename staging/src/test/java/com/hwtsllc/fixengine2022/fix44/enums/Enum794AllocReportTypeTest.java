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

class Enum794AllocReportTypeTest {
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
    @Test
    void EnumTest() {
        Enum794AllocReportType enumType;

        enumType = Enum794AllocReportType.PRELIMINARY_REQUEST;
        assertEquals( "2", enumType.getID());
        assertEquals( "PRELIMINARY_REQUEST", enumType.getName());
        assertEquals( "2 - Preliminary Request to Intermediary", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.SELLSIDE_USING_PRELIMINARY;
        assertEquals( "3", enumType.getID());
        assertEquals( "SELLSIDE_USING_PRELIMINARY", enumType.getName());
        assertEquals( "3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)",
                enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.SELLSIDE_WITHOUT_PRELIMINARY;
        assertEquals( "4", enumType.getID());
        assertEquals( "SELLSIDE_WITHOUT_PRELIMINARY", enumType.getName());
        assertEquals( "4 - Sellside Calculated Without Preliminary " +
                        "(sent unsolicited by sellside, includes MiscFees and NetMoney)",
                enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.WAREHOUSE_RECAP;
        assertEquals( "5", enumType.getID());
        assertEquals( "WAREHOUSE_RECAP", enumType.getName());
        assertEquals( "5 - Warehouse Recap", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.REQUEST_TO_INTERMEDIARY;
        assertEquals( "8", enumType.getID());
        assertEquals( "REQUEST_TO_INTERMEDIARY", enumType.getName());
        assertEquals( "8 - Request to Intermediary", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.ACCEPT;
        assertEquals( "9", enumType.getID());
        assertEquals( "ACCEPT", enumType.getName());
        assertEquals( "9 - Accept", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.REJECT;
        assertEquals( "10", enumType.getID());
        assertEquals( "REJECT", enumType.getName());
        assertEquals( "10 - Reject", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.ACCEPT_PENDING;
        assertEquals( "11", enumType.getID());
        assertEquals( "ACCEPT_PENDING", enumType.getName());
        assertEquals( "11 - Accept Pending", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.COMPLETE;
        assertEquals( "12", enumType.getID());
        assertEquals( "COMPLETE", enumType.getName());
        assertEquals( "12 - Complete", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum794AllocReportType.REVERSE_PENDING;
        assertEquals( "14", enumType.getID());
        assertEquals( "REVERSE_PENDING", enumType.getName());
        assertEquals( "14 - Reverse Pending", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}