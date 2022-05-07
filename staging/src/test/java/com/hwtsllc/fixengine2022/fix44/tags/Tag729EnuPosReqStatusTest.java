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
import com.hwtsllc.fixengine2022.fix44.enums.Enum729PosReqStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  729
 *  PosReqStatus
 *  Status of Request for Positions
 *  Valid values:
 *      0 - Completed
 *      1 - Completed With Warnings
 *      2 - Rejected
 */
class Tag729EnuPosReqStatusTest {
    @Test
    void FIX0729Test() {
        FIX44 fixData = FIX44.FIX729_ENU_POS_REQ_STATUS;
        assertEquals( "729", fixData.getID());
        assertEquals( "POS_REQ_STATUS", fixData.getName());
        assertEquals( "PosReqStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0729Test() {
        Tag729EnuPosReqStatus tagData;

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.COMPLETED);
        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.COMPLETED_WITH_WARNINGS);
        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.REJECTED);

        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}