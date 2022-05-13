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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix41.enums.Enum150ExecType;
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
class Tag150EnuExecTypeTest {
    @Test
    void FIX0150Test() {
        FIX41 fixData = FIX41.FIX150_ENU_EXEC_TYPE;
        assertEquals( "150", fixData.getID());
        assertEquals( "EXEC_TYPE", fixData.getName());
        assertEquals( "ExecType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0150Test() {
        Tag150EnuExecType tagData;

        tagData = new Tag150EnuExecType(Enum150ExecType.NEW);
        assertEquals( Enum150ExecType.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.DONE_FOR_DAY);
        assertEquals( Enum150ExecType.DONE_FOR_DAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.CANCELED);
        assertEquals( Enum150ExecType.CANCELED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REPLACED);
        assertEquals( Enum150ExecType.REPLACED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_CANCEL);
        assertEquals( Enum150ExecType.PENDING_CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.STOPPED);
        assertEquals( Enum150ExecType.STOPPED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REJECTED);
        assertEquals( Enum150ExecType.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REJECTED);
        assertEquals( Enum150ExecType.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_NEW);
        assertEquals( Enum150ExecType.PENDING_NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.CALCULATED);
        assertEquals( Enum150ExecType.CALCULATED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.EXPIRED);
        assertEquals( Enum150ExecType.EXPIRED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.RESTATED);
        assertEquals( Enum150ExecType.RESTATED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_REPLACE);
        assertEquals( Enum150ExecType.PENDING_REPLACE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_PARTIAL_OR_FILLED);
        assertEquals( Enum150ExecType.TRADE_PARTIAL_OR_FILLED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CORRECT);
        assertEquals( Enum150ExecType.TRADE_CORRECT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CANCEL);
        assertEquals( Enum150ExecType.TRADE_CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.ORDER_STATUS);
        assertEquals( Enum150ExecType.ORDER_STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_IN_CLEARING_HOLD);
        assertEquals( Enum150ExecType.TRADE_IN_CLEARING_HOLD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_RELEASE_TO_CLEARING);
        assertEquals( Enum150ExecType.TRADE_RELEASE_TO_CLEARING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRIGGERED_OR_ACTIVATED);
        assertEquals( Enum150ExecType.TRIGGERED_OR_ACTIVATED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}