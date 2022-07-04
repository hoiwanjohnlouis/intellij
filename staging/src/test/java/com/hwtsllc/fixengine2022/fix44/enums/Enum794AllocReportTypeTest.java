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

/**
 *  794
 *  AllocReportType
 *  int
 *  <p></p>
 *  Describes the specific type or purpose of an Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Preliminary Request to Intermediary
 *  <p>    3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)
 *  <p>    4 - Sellside Calculated Without Preliminary
 *          (sent unsolicited by sellside, includes MiscFees and NetMoney)
 *  <p>    5 - Warehouse Recap
 *  <p>    8 - Request to Intermediary
 *  <p></p>
 *  <p>    9 - Accept
 *  <p>    10 - Reject
 *  <p>    11 - Accept Pending
 *  <p>    12 - Complete
 *  <p>    14 - Reverse Pending
 */
class Enum794AllocReportTypeTest {
    @Test
    void EnumTest() {
        Enum794AllocReportType enumType;

        enumType = Enum794AllocReportType.PRELIMINARY_REQUEST;
        assertEquals( "2", enumType.toEnumIDString());
        assertEquals( "PRELIMINARY_REQUEST", enumType.toEnumNameString());
        assertEquals( "2 - Preliminary Request to Intermediary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.SELLSIDE_USING_PRELIMINARY;
        assertEquals( "3", enumType.toEnumIDString());
        assertEquals( "SELLSIDE_USING_PRELIMINARY", enumType.toEnumNameString());
        assertEquals( "3 - Sellside Calculated Using Preliminary (includes MiscFees and NetMoney)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.SELLSIDE_WITHOUT_PRELIMINARY;
        assertEquals( "4", enumType.toEnumIDString());
        assertEquals( "SELLSIDE_WITHOUT_PRELIMINARY", enumType.toEnumNameString());
        assertEquals( "4 - Sellside Calculated Without Preliminary " +
                        "(sent unsolicited by sellside, includes MiscFees and NetMoney)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.WAREHOUSE_RECAP;
        assertEquals( "5", enumType.toEnumIDString());
        assertEquals( "WAREHOUSE_RECAP", enumType.toEnumNameString());
        assertEquals( "5 - Warehouse Recap", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.REQUEST_TO_INTERMEDIARY;
        assertEquals( "8", enumType.toEnumIDString());
        assertEquals( "REQUEST_TO_INTERMEDIARY", enumType.toEnumNameString());
        assertEquals( "8 - Request to Intermediary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.ACCEPT;
        assertEquals( "9", enumType.toEnumIDString());
        assertEquals( "ACCEPT", enumType.toEnumNameString());
        assertEquals( "9 - Accept", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.REJECT;
        assertEquals( "10", enumType.toEnumIDString());
        assertEquals( "REJECT", enumType.toEnumNameString());
        assertEquals( "10 - Reject", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.ACCEPT_PENDING;
        assertEquals( "11", enumType.toEnumIDString());
        assertEquals( "ACCEPT_PENDING", enumType.toEnumNameString());
        assertEquals( "11 - Accept Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.COMPLETE;
        assertEquals( "12", enumType.toEnumIDString());
        assertEquals( "COMPLETE", enumType.toEnumNameString());
        assertEquals( "12 - Complete", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum794AllocReportType.REVERSE_PENDING;
        assertEquals( "14", enumType.toEnumIDString());
        assertEquals( "REVERSE_PENDING", enumType.toEnumNameString());
        assertEquals( "14 - Reverse Pending", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}