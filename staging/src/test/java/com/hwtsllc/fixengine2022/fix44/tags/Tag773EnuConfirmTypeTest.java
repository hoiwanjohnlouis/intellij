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
import com.hwtsllc.fixengine2022.fix44.enums.Enum773ConfirmType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag773EnuConfirmTypeTest {
    @Test
    void FIX0773Test() {
        FIX44 fixData = FIX44.FIX773_ENU_CONFIRM_TYPE;
        assertEquals( "773", fixData.getID());
        assertEquals( "CONFIRM_TYPE", fixData.getName());
        assertEquals( "ConfirmType", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  773
     *  ConfirmType
     *  Identifies the type of Confirmation message being sent.
     *  Valid values:
     *      1 - Status
     *      2 - Confirmation
     *      3 - Confirmation Request Rejected (reason can be stated in Text (58) field)
     */
    @Test
    void Tag0773Test() {
        Tag773EnuConfirmType tagData;

        tagData = new Tag773EnuConfirmType(Enum773ConfirmType.STATUS);
        tagData = new Tag773EnuConfirmType(Enum773ConfirmType.CONFIRMATION);
        tagData = new Tag773EnuConfirmType(Enum773ConfirmType.CONFIRMATION_REJECTED);
    }
}