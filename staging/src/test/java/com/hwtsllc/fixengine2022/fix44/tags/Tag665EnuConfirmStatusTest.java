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
 *  ConfirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Mismatched Account
 *  <p>    3 - Missing Settlement Instructions
 *  <p>    4 - Confirmed
 *  <p>    5 - Request Rejected
 */
class Tag665EnuConfirmStatusTest {
    @Test
    void FIX0665Test() {
        FIX44 fixData = FIX44.FIX665_ENU_CONFIRM_STATUS;
        assertEquals( "665", fixData.toFIXIDString());
        assertEquals( "CONFIRM_STATUS", fixData.toFIXNameString());
        assertEquals( "ConfirmStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0665Test() {
        Tag665EnuConfirmStatus tagData;

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.RECEIVED);
        assertEquals( Enum665ConfirmStatus.RECEIVED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISMATCHED_ACCOUNT);
        assertEquals( Enum665ConfirmStatus.MISMATCHED_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISSING_INSTRUCTIONS);
        assertEquals( Enum665ConfirmStatus.MISSING_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.CONFIRMED);
        assertEquals( Enum665ConfirmStatus.CONFIRMED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.REJECTED);
        assertEquals( Enum665ConfirmStatus.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}