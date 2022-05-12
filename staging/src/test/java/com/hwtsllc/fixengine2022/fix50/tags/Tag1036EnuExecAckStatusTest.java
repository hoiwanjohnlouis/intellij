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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1036ExecAckStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1036
 *  ExecAckStatus
 *  char
 *  <p>
 *  The status of this execution acknowledgement message.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received, not yet processed
 *  <p>    1 - Accepted
 *  <p>    2 - Don't know / Rejected
 */
class Tag1036EnuExecAckStatusTest {
    @Test
    void FIX1036Test() {
        FIX50 fixData = FIX50.FIX1036_ENU_EXEC_ACK_STATUS;
        assertEquals( "1036", fixData.getID());
        assertEquals( "EXEC_ACK_STATUS", fixData.getName());
        assertEquals( "ExecAckStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1036Test() {
        Tag1036EnuExecAckStatus tagData;

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.RECEIVED );
        assertEquals( Enum1036ExecAckStatus.RECEIVED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.ACCEPTED );
        assertEquals( Enum1036ExecAckStatus.ACCEPTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.DONT_KNOW_REJECTED );
        assertEquals( Enum1036ExecAckStatus.DONT_KNOW_REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}