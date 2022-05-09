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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  150
 *  ExecType
 *  char
 *  <p>
 *  Describes the specific ExecutionRpt
 *  <p>
 *  (i.e. Pending Cancel) while OrdStatus (39) will always identify the current order status (i.e. Partially Filled)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p>    5 - Replaced
 *  <p>    6 - Pending Cancel (e.g. result of Order Cancel Request)
 *  <p></p>
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Restated (Execution Report sent unsolicited by sellside, with ExecRestatementReason (378) set)
 *  <p>    E - Pending Replace (e.g. result of Order Cancel/Replace Request)
 *  <p></p>
 *  <p>    F - Trade (partial fill or fill)
 *  <p>    G - Trade Correct
 *  <p>    H - Trade Cancel
 *  <p>    I - Order Status
 *  <p>    J - Trade in a Clearing Hold
 *  <p></p>
 *  <p>    K - Trade has been released to Clearing
 *  <p>    L - Triggered or Activated by System
 */
class Enum150ExecTypeTest {
    @Test
    void Enum0150Test() {
        Enum150ExecType enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum150ExecType.NEW;
        assertEquals("0", enumType.getID());
        assertEquals("NEW", enumType.getName());
        assertEquals("0 - New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.DONE_FOR_DAY;
        assertEquals("3", enumType.getID());
        assertEquals("DONE_FOR_DAY", enumType.getName());
        assertEquals("3 - Done for day", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.CANCELED;
        assertEquals("4", enumType.getID());
        assertEquals("CANCELED", enumType.getName());
        assertEquals("4 - Canceled", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.REPLACED;
        assertEquals("5", enumType.getID());
        assertEquals("REPLACED", enumType.getName());
        assertEquals("5 - Replaced", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.PENDING_CANCEL;
        assertEquals("6", enumType.getID());
        assertEquals("PENDING_CANCEL", enumType.getName());
        assertEquals("6 - Pending Cancel (e.g. result of Order Cancel Request)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum150ExecType.STOPPED;
        assertEquals("7", enumType.getID());
        assertEquals("STOPPED", enumType.getName());
        assertEquals("7 - Stopped", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.REJECTED;
        assertEquals("8", enumType.getID());
        assertEquals("REJECTED", enumType.getName());
        assertEquals("8 - Rejected", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.SUSPENDED;
        assertEquals("9", enumType.getID());
        assertEquals("SUSPENDED", enumType.getName());
        assertEquals("9 - Suspended", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * A-L msg types
         */
        enumType = Enum150ExecType.PENDING_NEW;
        assertEquals("A", enumType.getID());
        assertEquals("PENDING_NEW", enumType.getName());
        assertEquals("A - Pending New", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.CALCULATED;
        assertEquals("B", enumType.getID());
        assertEquals("CALCULATED", enumType.getName());
        assertEquals("B - Calculated", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.EXPIRED;
        assertEquals("C", enumType.getID());
        assertEquals("EXPIRED", enumType.getName());
        assertEquals("C - Expired", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.RESTATED;
        assertEquals("D", enumType.getID());
        assertEquals("RESTATED", enumType.getName());
        assertEquals("D - Restated (Execution Report sent unsolicited by sell side, " +
                "with ExecRestatementReason (378) set)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.PENDING_REPLACE;
        assertEquals("E", enumType.getID());
        assertEquals("PENDING_REPLACE", enumType.getName());
        assertEquals("E - Pending Replace (e.g. result of Order Cancel/Replace Request)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum150ExecType.TRADE_PARTIAL_OR_FILLED;
        assertEquals("F", enumType.getID());
        assertEquals("TRADE_PARTIAL_OR_FILLED", enumType.getName());
        assertEquals("F - Trade (partial fill or fill)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.TRADE_CORRECT;
        assertEquals("G", enumType.getID());
        assertEquals("TRADE_CORRECT", enumType.getName());
        assertEquals("G - Trade Correct", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.TRADE_CANCEL;
        assertEquals("H", enumType.getID());
        assertEquals("TRADE_CANCEL", enumType.getName());
        assertEquals("H - Trade Cancel", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.ORDER_STATUS;
        assertEquals("I", enumType.getID());
        assertEquals("ORDER_STATUS", enumType.getName());
        assertEquals("I - Order Status", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.TRADE_IN_CLEARING_HOLD;
        assertEquals("J", enumType.getID());
        assertEquals("TRADE_IN_CLEARING_HOLD", enumType.getName());
        assertEquals("J - Trade in a Clearing Hold", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum150ExecType.TRADE_RELEASE_TO_CLEARING;
        assertEquals("K", enumType.getID());
        assertEquals("TRADE_RELEASE_TO_CLEARING", enumType.getName());
        assertEquals("K - Trade has been released to Clearing", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum150ExecType.TRIGGERED_OR_ACTIVATED;
        assertEquals("L", enumType.getID());
        assertEquals("TRIGGERED_OR_ACTIVATED", enumType.getName());
        assertEquals("L - Triggered or Activated by System", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}