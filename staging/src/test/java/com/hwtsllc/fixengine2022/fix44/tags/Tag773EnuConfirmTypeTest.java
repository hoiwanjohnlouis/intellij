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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  773
 *  ConfirmType
 *  Identifies the type of Confirmation message being sent.
 *  Valid values:
 *      1 - Status
 *      2 - Confirmation
 *      3 - Confirmation Request Rejected (reason can be stated in Text (58) field)
 */
class Tag773EnuConfirmTypeTest {
    @Test
    void FIX0773Test() {
        FIX44 fixData = FIX44.FIX773_ENU_CONFIRM_TYPE;
        assertEquals( "773", fixData.getID());
        assertEquals( "CONFIRM_TYPE", fixData.getName());
        assertEquals( "ConfirmType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0773Test() {
        Log773EnuConfirmType tagData;

        tagData = new Log773EnuConfirmType(Enum773ConfirmType.STATUS);
        assertEquals( Enum773ConfirmType.STATUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log773EnuConfirmType(Enum773ConfirmType.CONFIRMATION);
        assertEquals( Enum773ConfirmType.CONFIRMATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log773EnuConfirmType(Enum773ConfirmType.CONFIRMATION_REJECTED);
        assertEquals( Enum773ConfirmType.CONFIRMATION_REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}