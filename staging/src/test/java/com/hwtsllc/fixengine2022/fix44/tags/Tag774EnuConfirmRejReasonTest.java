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
import com.hwtsllc.fixengine2022.fix44.enums.Enum774ConfirmRejReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag774EnuConfirmRejReasonTest {
    @Test
    void FIX0774Test() {
        FIX44 fixData = FIX44.FIX774_ENU_CONFIRM_REJ_REASON;
        assertEquals( "774", fixData.getID());
        assertEquals( "CONFIRM_REJ_REASON", fixData.getName());
        assertEquals( "ConfirmRejReason", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  774
     *  ConfirmRejReason
     *  Identifies the reason for rejecting a Confirmation.
     *  Valid values:
     *      1 - Mismatched account
     *      2 - Missing settlement instructions
     *      99 - Other
     *
     *      or any value conforming to the data type Reserved100Plus
     */
    @Test
    void Tag0774Test() {
        Tag774EnuConfirmRejReason tagData;

        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.MISMATCHED_ACCOUNT);
        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.MISSING_INSTRUCTIONS);
        tagData = new Tag774EnuConfirmRejReason(Enum774ConfirmRejReason.OTHER);
    }
}