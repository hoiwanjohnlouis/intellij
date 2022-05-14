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
import com.hwtsllc.fixengine2022.fix44.enums.Enum706PosQtyStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  706
 *  PosQtyStatus
 *  Status of this position.
 *  Valid values:
 *  0 - Submitted
 *  1 - Accepted
 *  2 - Rejected
 */
class Tag706EnuPosQtyStatusTest {
    @Test
    void FIX0706Test() {
        FIX44 fixData = FIX44.FIX706_ENU_POS_QTY_STATUS;
        assertEquals( "706", fixData.getID());
        assertEquals( "POS_QTY_STATUS", fixData.getName());
        assertEquals( "PosQtyStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0706Test() {
        Tag706EnuPosQtyStatus tagData;

        tagData = new Tag706EnuPosQtyStatus(Enum706PosQtyStatus.SUBMITTED);
        assertEquals( Enum706PosQtyStatus.SUBMITTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag706EnuPosQtyStatus(Enum706PosQtyStatus.ACCEPTED);
        assertEquals( Enum706PosQtyStatus.ACCEPTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag706EnuPosQtyStatus(Enum706PosQtyStatus.REJECTED);
        assertEquals( Enum706PosQtyStatus.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}