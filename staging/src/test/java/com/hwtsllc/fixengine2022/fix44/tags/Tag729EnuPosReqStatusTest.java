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
import com.hwtsllc.fixengine2022.fix44.enums.Enum729PosReqStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  729
 *  PosReqStatus
 *  int
 *  <p></p>
 *  Status of Request for Positions
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Completed
 *  <p>    1 - Completed With Warnings
 *  <p>    2 - Rejected
 */
class Tag729EnuPosReqStatusTest {
    @Test
    void FIX0729Test() {
        FIX44 fixData = FIX44.FIX729_ENU_POS_REQ_STATUS;
        assertEquals( "729", fixData.toFIXIDString());
        assertEquals( "POS_REQ_STATUS", fixData.toFIXNameString());
        assertEquals( "PosReqStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0729Test() {
        Tag729EnuPosReqStatus tagData;

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.COMPLETED);
        assertEquals( Enum729PosReqStatus.COMPLETED.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.COMPLETED_WITH_WARNINGS);
        assertEquals( Enum729PosReqStatus.COMPLETED_WITH_WARNINGS.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.REJECTED);
        assertEquals( Enum729PosReqStatus.REJECTED.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}