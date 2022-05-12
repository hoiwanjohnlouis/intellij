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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  665
 *  Identifies the status of the Confirmation.
 *  ConfirmStatus
 *  Valid values:
 *      1 - Received
 *      2 - Mismatched Account
 *      3 - Missing Settlement Instructions
 *      4 - Confirmed
 *      5 - Request Rejected
 */
class Tag665EnuConfirmStatusTest {
    @Test
    void FIX0665Test() {
        FIX44 fixData = FIX44.FIX665_ENU_CONFIRM_STATUS;
        assertEquals( "665", fixData.getID());
        assertEquals( "CONFIRM_STATUS", fixData.getName());
        assertEquals( "ConfirmStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0665Test() {
        Log665EnuConfirmStatus tagData;

        tagData = new Log665EnuConfirmStatus(Enum665ConfirmStatus.RECEIVED);
        assertEquals( Enum665ConfirmStatus.RECEIVED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log665EnuConfirmStatus(Enum665ConfirmStatus.MISMATCHED_ACCOUNT);
        assertEquals( Enum665ConfirmStatus.MISMATCHED_ACCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log665EnuConfirmStatus(Enum665ConfirmStatus.MISSING_INSTRUCTIONS);
        assertEquals( Enum665ConfirmStatus.MISSING_INSTRUCTIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log665EnuConfirmStatus(Enum665ConfirmStatus.CONFIRMED);
        assertEquals( Enum665ConfirmStatus.CONFIRMED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log665EnuConfirmStatus(Enum665ConfirmStatus.REJECTED);
        assertEquals( Enum665ConfirmStatus.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}