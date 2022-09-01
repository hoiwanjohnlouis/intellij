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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toEnumNameString());
        assertEquals("0 - New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.DONE_FOR_DAY;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("DONE_FOR_DAY", enumType.toEnumNameString());
        assertEquals("3 - Done for day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.CANCELED;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CANCELED", enumType.toEnumNameString());
        assertEquals("4 - Canceled", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.REPLACED;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("REPLACED", enumType.toEnumNameString());
        assertEquals("5 - Replaced", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.PENDING_CANCEL;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("PENDING_CANCEL", enumType.toEnumNameString());
        assertEquals("6 - Pending Cancel (e.g. result of Order Cancel Request)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum150ExecType.STOPPED;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("STOPPED", enumType.toEnumNameString());
        assertEquals("7 - Stopped", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.REJECTED;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("REJECTED", enumType.toEnumNameString());
        assertEquals("8 - Rejected", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.SUSPENDED;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("SUSPENDED", enumType.toEnumNameString());
        assertEquals("9 - Suspended", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * A-L msg types
         */
        enumType = Enum150ExecType.PENDING_NEW;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("PENDING_NEW", enumType.toEnumNameString());
        assertEquals("A - Pending New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.CALCULATED;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("CALCULATED", enumType.toEnumNameString());
        assertEquals("B - Calculated", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.EXPIRED;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("EXPIRED", enumType.toEnumNameString());
        assertEquals("C - Expired", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.RESTATED;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("RESTATED", enumType.toEnumNameString());
        assertEquals("D - Restated (Execution Report sent unsolicited by sell side, " +
                "with ExecRestatementReason (378) set)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.PENDING_REPLACE;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("PENDING_REPLACE", enumType.toEnumNameString());
        assertEquals("E - Pending Replace (e.g. result of Order Cancel/Replace Request)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum150ExecType.TRADE_PARTIAL_OR_FILLED;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("TRADE_PARTIAL_OR_FILLED", enumType.toEnumNameString());
        assertEquals("F - Trade (partial fill or fill)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.TRADE_CORRECT;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("TRADE_CORRECT", enumType.toEnumNameString());
        assertEquals("G - Trade Correct", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.TRADE_CANCEL;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("TRADE_CANCEL", enumType.toEnumNameString());
        assertEquals("H - Trade Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.ORDER_STATUS;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("ORDER_STATUS", enumType.toEnumNameString());
        assertEquals("I - Order Status", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.TRADE_IN_CLEARING_HOLD;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("TRADE_IN_CLEARING_HOLD", enumType.toEnumNameString());
        assertEquals("J - Trade in a Clearing Hold", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum150ExecType.TRADE_RELEASE_TO_CLEARING;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("TRADE_RELEASE_TO_CLEARING", enumType.toEnumNameString());
        assertEquals("K - Trade has been released to Clearing", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum150ExecType.TRIGGERED_OR_ACTIVATED;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("TRIGGERED_OR_ACTIVATED", enumType.toEnumNameString());
        assertEquals("L - Triggered or Activated by System", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}